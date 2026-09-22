package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.parser.Token;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.nodes.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import java.util.LinkedList;

public class TreeBuilderStateTest {
    private TreeBuilder tb;
    private TreeBuilderState state;

    @Before
    public void setUp() {
        tb = new TreeBuilder() {
            @Override
            protected boolean process(Token token) {
                return false;
            }
            @Override
            protected boolean process(Token token, TreeBuilderState state) {
                return false;
            }
        };
    }

    @After
    public void tearDown() {
        tb = null;
    }

    @Test
    public void testInitialWhitespace() {
        state = TreeBuilderState.Initial;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInitialComment() {
        state = TreeBuilderState.Initial;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInitialDoctype() {
        state = TreeBuilderState.Initial;
        Token t = new Token.Doctype("html", "public", "system");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInitialOther() {
        state = TreeBuilderState.Initial;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlDoctype() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlComment() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlWhitespace() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlStartHtml() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlEndValid() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.EndTag("head");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlEndInvalid() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.EndTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testBeforeHtmlOther() {
        state = TreeBuilderState.BeforeHtml;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadWhitespace() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadComment() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadDoctype() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadStartHtml() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadStartHead() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.StartTag("head");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadEndValid() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.EndTag("head");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadEndInvalid() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.EndTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testBeforeHeadOther() {
        state = TreeBuilderState.BeforeHead;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadWhitespace() {
        state = TreeBuilderState.InHead;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadComment() {
        state = TreeBuilderState.InHead;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadDoctype() {
        state = TreeBuilderState.InHead;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInHeadStartHtml() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartBase() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("base");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartMeta() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("meta");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartTitle() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("title");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartNoframes() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("noframes");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartNoscript() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("noscript");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartScript() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("script");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadStartHead() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("head");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInHeadEndHead() {
        state = TreeBuilderState.InHead;
        Token t = new Token.EndTag("head");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadEndValid() {
        state = TreeBuilderState.InHead;
        Token t = new Token.EndTag("body");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadEndInvalid() {
        state = TreeBuilderState.InHead;
        Token t = new Token.EndTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInHeadDefault() {
        state = TreeBuilderState.InHead;
        Token t = new Token.StartTag("custom");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptDoctype() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptStartHtml() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptEndNoscript() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.EndTag("noscript");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptWhitespace() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptComment() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptValidStart() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.StartTag("link");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptEndBr() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.EndTag("br");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptInvalidEnd() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.EndTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInHeadNoscriptOther() {
        state = TreeBuilderState.InHeadNoscript;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadWhitespace() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadComment() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadDoctype() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterHeadStartHtml() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadStartBody() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.StartTag("body");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadStartFrameset() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.StartTag("frameset");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadStartValid() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.StartTag("base");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadStartHead() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.StartTag("head");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterHeadEndValid() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.EndTag("body");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterHeadEndInvalid() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.EndTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterHeadOther() {
        state = TreeBuilderState.AfterHead;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testTextCharacter() {
        state = TreeBuilderState.Text;
        Token t = new Token.Character("text");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testTextEOF() {
        state = TreeBuilderState.Text;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testTextEndTag() {
        state = TreeBuilderState.Text;
        Token t = new Token.EndTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableWhitespace() {
        state = TreeBuilderState.InTable;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableNonWhitespace() {
        state = TreeBuilderState.InTable;
        Token t = new Token.Character("a");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableComment() {
        state = TreeBuilderState.InTable;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableDoctype() {
        state = TreeBuilderState.InTable;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInTableStartCaption() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableStartColgroup() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("colgroup");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableStartTbody() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("tbody");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableStartTd() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("td");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableStartTable() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("table");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableStartStyle() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("style");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableEndTable() {
        state = TreeBuilderState.InTable;
        Token t = new Token.EndTag("table");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableEndInvalid() {
        state = TreeBuilderState.InTable;
        Token t = new Token.EndTag("body");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInTableEOF() {
        state = TreeBuilderState.InTable;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableAnythingElse() {
        state = TreeBuilderState.InTable;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableTextCharacter() {
        state = TreeBuilderState.InTableText;
        Token t = new Token.Character("a");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableTextWhitespace() {
        state = TreeBuilderState.InTableText;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableTextNull() {
        state = TreeBuilderState.InTableText;
        Token t = new Token.Character("\u0000");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInTableTextToInBody() {
        state = TreeBuilderState.InTableText;
        Token charT = new Token.Character("a");
        state.process(charT, tb);
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCaptionEndCaption() {
        state = TreeBuilderState.InCaption;
        Token t = new Token.EndTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCaptionInvalidStart() {
        state = TreeBuilderState.InCaption;
        Token t = new Token.StartTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCaptionInvalidEnd() {
        state = TreeBuilderState.InCaption;
        Token t = new Token.EndTag("body");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInCaptionOther() {
        state = TreeBuilderState.InCaption;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupWhitespace() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupComment() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupDoctype() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupStartHtml() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupStartCol() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.StartTag("col");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupEndColgroup() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.EndTag("colgroup");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupEOF() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInColumnGroupOther() {
        state = TreeBuilderState.InColumnGroup;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableBodyStartTr() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.StartTag("tr");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableBodyStartTh() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.StartTag("th");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableBodyInvalidStart() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.StartTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableBodyEndTbody() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.EndTag("tbody");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableBodyEndTable() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.EndTag("table");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInTableBodyEndInvalid() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.EndTag("body");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInTableBodyOther() {
        state = TreeBuilderState.InTableBody;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInRowStartTh() {
        state = TreeBuilderState.InRow;
        Token t = new Token.StartTag("th");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInRowInvalidStart() {
        state = TreeBuilderState.InRow;
        Token t = new Token.StartTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInRowEndTr() {
        state = TreeBuilderState.InRow;
        Token t = new Token.EndTag("tr");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInRowEndTable() {
        state = TreeBuilderState.InRow;
        Token t = new Token.EndTag("table");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInRowEndInvalid() {
        state = TreeBuilderState.InRow;
        Token t = new Token.EndTag("body");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInRowOther() {
        state = TreeBuilderState.InRow;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCellEndTd() {
        state = TreeBuilderState.InCell;
        Token t = new Token.EndTag("td");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCellEndTh() {
        state = TreeBuilderState.InCell;
        Token t = new Token.EndTag("th");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCellEndInvalid() {
        state = TreeBuilderState.InCell;
        Token t = new Token.EndTag("body");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInCellStartTable() {
        state = TreeBuilderState.InCell;
        Token t = new Token.StartTag("table");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInCellOther() {
        state = TreeBuilderState.InCell;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectCharacter() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.Character("a");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectNull() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.Character("\u0000");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInSelectComment() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectDoctype() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInSelectStartOption() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.StartTag("option");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectStartOptgroup() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.StartTag("optgroup");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectStartSelect() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.StartTag("select");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectEndOptgroup() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.EndTag("optgroup");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectEndOption() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.EndTag("option");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectEndSelect() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.EndTag("select");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectEOF() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectOther() {
        state = TreeBuilderState.InSelect;
        Token t = new Token.StartTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInSelectInTableStart() {
        state = TreeBuilderState.InSelectInTable;
        Token t = new Token.StartTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectInTableEnd() {
        state = TreeBuilderState.InSelectInTable;
        Token t = new Token.EndTag("caption");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInSelectInTableOther() {
        state = TreeBuilderState.InSelectInTable;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterBodyWhitespace() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterBodyComment() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterBodyDoctype() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterBodyStartHtml() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterBodyEndHtml() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.EndTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterBodyEOF() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterBodyOther() {
        state = TreeBuilderState.AfterBody;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetWhitespace() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetComment() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetDoctype() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testInFramesetStartHtml() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetStartFrameset() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.StartTag("frameset");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetStartFrame() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.StartTag("frame");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetStartNoframes() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.StartTag("noframes");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetEndFrameset() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.EndTag("frameset");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetEOF() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testInFramesetOther() {
        state = TreeBuilderState.InFrameset;
        Token t = new Token.StartTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetWhitespace() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetComment() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetDoctype() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.Doctype("html", null, null);
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetStartHtml() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetEndHtml() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.EndTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetStartNoframes() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.StartTag("noframes");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetEOF() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterFramesetOther() {
        state = TreeBuilderState.AfterFrameset;
        Token t = new Token.StartTag("div");
        assertFalse(state.process(t, tb));
    }

    @Test
    public void testAfterAfterBodyComment() {
        state = TreeBuilderState.AfterAfterBody;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterBodyDoctype() {
        state = TreeBuilderState.AfterAfterBody;
        Token t = new Token.Doctype("html", null, null);
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterBodyWhitespace() {
        state = TreeBuilderState.AfterAfterBody;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterBodyStartHtml() {
        state = TreeBuilderState.AfterAfterBody;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterBodyEOF() {
        state = TreeBuilderState.AfterAfterBody;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterBodyOther() {
        state = TreeBuilderState.AfterAfterBody;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterFramesetComment() {
        state = TreeBuilderState.AfterAfterFrameset;
        Token t = new Token.Comment("test");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterFramesetDoctype() {
        state = TreeBuilderState.AfterAfterFrameset;
        Token t = new Token.Doctype("html", null, null);
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterFramesetWhitespace() {
        state = TreeBuilderState.AfterAfterFrameset;
        Token t = new Token.Character(" ");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterFramesetStartHtml() {
        state = TreeBuilderState.AfterAfterFrameset;
        Token t = new Token.StartTag("html");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterFramesetEOF() {
        state = TreeBuilderState.AfterAfterFrameset;
        Token t = new Token.EOF();
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testAfterAfterFramesetOther() {
        state = TreeBuilderState.AfterAfterFrameset;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }

    @Test
    public void testForeignContent() {
        state = TreeBuilderState.ForeignContent;
        Token t = new Token.StartTag("div");
        assertTrue(state.process(t, tb));
    }
}