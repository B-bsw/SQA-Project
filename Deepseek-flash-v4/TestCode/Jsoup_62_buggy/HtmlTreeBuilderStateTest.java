package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.TokeniserState;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private HtmlTreeBuilderState state;
    private Token.TokenType type;
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Comment comment;
    private Token.Character character;
    private Token.Doctype doctype;
    private Token.EOF eof;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        state = HtmlTreeBuilderState.InBody;
        type = Token.TokenType.Character;
        startTag = new Token.StartTag();
        endTag = new Token.EndTag();
        comment = new Token.Comment();
        character = new Token.Character();
        doctype = new Token.Doctype();
        eof = new Token.EOF();
    }

    @After
    public void tearDown() {
        tb = null;
        state = null;
        type = null;
        startTag = null;
        endTag = null;
        comment = null;
        character = null;
        doctype = null;
        eof = null;
    }

    @Test
    public void testProcessNormalCase() {
        Assert.assertTrue(state.process(tb, character));
    }

    @Test
    public void testProcessComment() {
        type = Token.TokenType.Comment;
        Assert.assertFalse(state.process(tb, comment));
    }

    @Test
    public void testProcessDoctypeForceQuirks() {
        doctype.setForceQuirks(true);
        type = Token.TokenType.Doctype;
        Assert.assertFalse(state.process(tb, doctype));
    }

    @Test
    public void testProcessStartTagHtml() {
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagHead() {
        type = Token.TokenType.EndTag;
        endTag.name("head");
        Assert.assertFalse(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagHead() {
        type = Token.TokenType.StartTag;
        startTag.name("head");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagBody() {
        type = Token.TokenType.EndTag;
        endTag.name("body");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagBase() {
        type = Token.TokenType.StartTag;
        startTag.name("base");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagMeta() {
        type = Token.TokenType.StartTag;
        startTag.name("meta");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTitle() {
        type = Token.TokenType.StartTag;
        startTag.name("title");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagNoFrames() {
        type = Token.TokenType.StartTag;
        startTag.name("noframes");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagNoScript() {
        type = Token.TokenType.StartTag;
        startTag.name("noscript");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagScript() {
        type = Token.TokenType.StartTag;
        startTag.name("script");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagHeadInHead() {
        type = Token.TokenType.StartTag;
        startTag.name("head");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagBodyInHead() {
        type = Token.TokenType.EndTag;
        endTag.name("body");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagHtmlInHead() {
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagBrInHead() {
        type = Token.TokenType.EndTag;
        endTag.name("br");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagOtherInHead() {
        type = Token.TokenType.EndTag;
        endTag.name("div");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagUnknown() {
        type = Token.TokenType.StartTag;
        startTag.name("unknown");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessCharacterWhitespace() {
        character.data(" ");
        Assert.assertTrue(state.process(tb, character));
    }

    @Test
    public void testProcessCharacterNullString() {
        character.data(null);
        Assert.assertTrue(state.process(tb, character));
    }

    @Test
    public void testProcessCharacterNormal() {
        character.data("a");
        Assert.assertTrue(state.process(tb, character));
    }

    @Test
    public void testProcessEndTagHeadInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("head");
        Assert.assertFalse(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagSelectInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.StartTag;
        startTag.name("select");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagSelectInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.EndTag;
        endTag.name("select");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagOptionInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.EndTag;
        endTag.name("option");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagOptionInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.StartTag;
        startTag.name("option");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagOptgroupInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.StartTag;
        startTag.name("optgroup");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagOptgroupInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.EndTag;
        endTag.name("optgroup");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagHtmlInSelect() {
        state = HtmlTreeBuilderState.InSelect;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagTableInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("table");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTdInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("td");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagThInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("th");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagCaptionInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("caption");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagColgroupInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("colgroup");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagColInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("col");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTbodyInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("tbody");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTfootInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("tfoot");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTheadInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("thead");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTrInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.StartTag;
        startTag.name("tr");
        Assert.assertFalse(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagTableInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("table");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagBodyInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("body");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagCaptionInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("caption");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagColgroupInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("colgroup");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagColInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("col");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTbodyInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("tbody");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTfootInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("tfoot");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTheadInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("thead");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTrInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("tr");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTdInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("td");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagThInTable() {
        state = HtmlTreeBuilderState.InTable;
        type = Token.TokenType.EndTag;
        endTag.name("th");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagTrInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("tr");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTdInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("td");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagThInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("th");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagCaptionInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("caption");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagColInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("col");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagColgroupInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("colgroup");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTbodyInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("tbody");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTfootInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("tfoot");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagTheadInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.StartTag;
        startTag.name("thead");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagTdInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("td");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagThInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("th");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTrInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("tr");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagCaptionInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("caption");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagColInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("col");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagColgroupInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("colgroup");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTbodyInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("tbody");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTfootInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("tfoot");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTheadInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("thead");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagHtmlInTableBody() {
        state = HtmlTreeBuilderState.InTableBody;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagCaptionInCaption() {
        state = HtmlTreeBuilderState.InCaption;
        type = Token.TokenType.StartTag;
        startTag.name("caption");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagCaptionInCaption() {
        state = HtmlTreeBuilderState.InCaption;
        type = Token.TokenType.EndTag;
        endTag.name("caption");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagTableInCaption() {
        state = HtmlTreeBuilderState.InCaption;
        type = Token.TokenType.EndTag;
        endTag.name("table");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagBodyInColumnGroup() {
        state = HtmlTreeBuilderState.InColumnGroup;
        type = Token.TokenType.StartTag;
        startTag.name("body");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagHtmlInColumnGroup() {
        state = HtmlTreeBuilderState.InColumnGroup;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagColgroupInColumnGroup() {
        state = HtmlTreeBuilderState.InColumnGroup;
        type = Token.TokenType.EndTag;
        endTag.name("colgroup");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagColInColumnGroup() {
        state = HtmlTreeBuilderState.InColumnGroup;
        type = Token.TokenType.StartTag;
        startTag.name("col");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagHtmlInColumnGroup() {
        state = HtmlTreeBuilderState.InColumnGroup;
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagFrameInFrameset() {
        state = HtmlTreeBuilderState.InFrameset;
        type = Token.TokenType.StartTag;
        startTag.name("frame");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagNoFramesInFrameset() {
        state = HtmlTreeBuilderState.InFrameset;
        type = Token.TokenType.StartTag;
        startTag.name("noframes");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagFramesetInFrameset() {
        state = HtmlTreeBuilderState.InFrameset;
        type = Token.TokenType.EndTag;
        endTag.name("frameset");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagHtmlInFrameset() {
        state = HtmlTreeBuilderState.InFrameset;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagHeadInAfterHead() {
        state = HtmlTreeBuilderState.AfterHead;
        type = Token.TokenType.StartTag;
        startTag.name("head");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagBodyInAfterHead() {
        state = HtmlTreeBuilderState.AfterHead;
        type = Token.TokenType.StartTag;
        startTag.name("body");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagHtmlInAfterHead() {
        state = HtmlTreeBuilderState.AfterHead;
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagFramesetInAfterHead() {
        state = HtmlTreeBuilderState.AfterHead;
        type = Token.TokenType.StartTag;
        startTag.name("frameset");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagBodyInAfterBody() {
        state = HtmlTreeBuilderState.AfterBody;
        type = Token.TokenType.EndTag;
        endTag.name("body");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessEndTagHtmlInAfterBody() {
        state = HtmlTreeBuilderState.AfterBody;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagHtmlInAfterBody() {
        state = HtmlTreeBuilderState.AfterBody;
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagHtmlInAfterFrameset() {
        state = HtmlTreeBuilderState.AfterFrameset;
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagHtmlInAfterFrameset() {
        state = HtmlTreeBuilderState.AfterFrameset;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagNoframesInAfterFrameset() {
        state = HtmlTreeBuilderState.AfterFrameset;
        type = Token.TokenType.StartTag;
        startTag.name("noframes");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessStartTagHtmlInAfterAfterBody() {
        state = HtmlTreeBuilderState.AfterAfterBody;
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagHtmlInAfterAfterBody() {
        state = HtmlTreeBuilderState.AfterAfterBody;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagHtmlInAfterAfterFrameset() {
        state = HtmlTreeBuilderState.AfterAfterFrameset;
        type = Token.TokenType.StartTag;
        startTag.name("html");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testProcessEndTagHtmlInAfterAfterFrameset() {
        state = HtmlTreeBuilderState.AfterAfterFrameset;
        type = Token.TokenType.EndTag;
        endTag.name("html");
        Assert.assertTrue(state.process(tb, endTag));
    }

    @Test
    public void testProcessStartTagNoframesInAfterAfterFrameset() {
        state = HtmlTreeBuilderState.AfterAfterFrameset;
        type = Token.TokenType.StartTag;
        startTag.name("noframes");
        Assert.assertTrue(state.process(tb, startTag));
    }

    @Test
    public void testIsWhitespace() {
        Assert.assertTrue(HtmlTreeBuilderState.isWhitespace(" "));
        Assert.assertFalse(HtmlTreeBuilderState.isWhitespace("a"));
    }
}