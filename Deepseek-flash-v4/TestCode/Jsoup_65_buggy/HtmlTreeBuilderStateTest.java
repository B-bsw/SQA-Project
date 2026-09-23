package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder tb;
    private HtmlTreeBuilderState.Constants constants;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        constants = new HtmlTreeBuilderState.Constants();
    }

    @After
    public void tearDown() {
        tb = null;
        constants = null;
    }

    @Test
    public void testConstantsValues() {
        assertNotNull(constants);
        assertArrayEquals(new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"}, constants.Formatters);
        assertArrayEquals(new String[]{"param", "source", "track"}, constants.InBodyStartMedia);
        assertArrayEquals(new String[]{"name", "action", "prompt"}, constants.InBodyStartInputAttribs);
        assertArrayEquals(new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"}, constants.InBodyEndAdoptionFormatters);
    }

    @Test
    public void testInBodyProcessWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" ");
        boolean result = HtmlTreeBuilderState.InBody.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        boolean result = HtmlTreeBuilderState.InBody.process(comment, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        boolean result = HtmlTreeBuilderState.InBody.process(doctype, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagHtml() {
        Token.StartTag startTag = new Token.StartTag("html");
        startTag.attributes.put("lang", "en");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagBase() {
        Token.StartTag startTag = new Token.StartTag("base");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagMeta() {
        Token.StartTag startTag = new Token.StartTag("meta");
        startTag.attributes.put("charset", "utf-8");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagTitle() {
        Token.StartTag startTag = new Token.StartTag("title");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagNoFrames() {
        Token.StartTag startTag = new Token.StartTag("noframes");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagScript() {
        Token.StartTag startTag = new Token.StartTag("script");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessEndTagHead() {
        Token.EndTag endTag = new Token.EndTag("head");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInBodyProcessEndTagBody() {
        Token.EndTag endTag = new Token.EndTag("body");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInBodyProcessEndTagHtml() {
        Token.EndTag endTag = new Token.EndTag("html");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInBodyProcessEndTagBr() {
        Token.EndTag endTag = new Token.EndTag("br");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessEndTagUnknown() {
        Token.EndTag endTag = new Token.EndTag("div");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessCharacterNull() {
        Token.Character token = new Token.Character();
        token.data("\u0000");
        boolean result = HtmlTreeBuilderState.InBody.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessCharacterWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" \t\n");
        boolean result = HtmlTreeBuilderState.InBody.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagA() {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.attributes.put("href", "http://example.com");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagSpan() {
        Token.StartTag startTag = new Token.StartTag("span");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagLi() {
        Token.StartTag startTag = new Token.StartTag("li");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagForm() {
        Token.StartTag startTag = new Token.StartTag("form");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagButton() {
        Token.StartTag startTag = new Token.StartTag("button");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagNobr() {
        Token.StartTag startTag = new Token.StartTag("nobr");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagTable() {
        Token.StartTag startTag = new Token.StartTag("table");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagInput() {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "hidden");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagInputNotHidden() {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "text");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagImage() {
        Token.StartTag startTag = new Token.StartTag("image");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagIsIndex() {
        Token.StartTag startTag = new Token.StartTag("isindex");
        startTag.attributes.put("action", "/search");
        startTag.attributes.put("prompt", "Search");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagTextarea() {
        Token.StartTag startTag = new Token.StartTag("textarea");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagSelect() {
        Token.StartTag startTag = new Token.StartTag("select");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagOption() {
        Token.StartTag startTag = new Token.StartTag("option");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagOptgroup() {
        Token.StartTag startTag = new Token.StartTag("optgroup");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagRuby() {
        Token.StartTag startTag = new Token.StartTag("ruby");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagMath() {
        Token.StartTag startTag = new Token.StartTag("math");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagSvg() {
        Token.StartTag startTag = new Token.StartTag("svg");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagUnknown() {
        Token.StartTag startTag = new Token.StartTag("custom");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" ");
        boolean result = HtmlTreeBuilderState.InTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        boolean result = HtmlTreeBuilderState.InTable.process(comment, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        boolean result = HtmlTreeBuilderState.InTable.process(doctype, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTable() {
        Token.StartTag startTag = new Token.StartTag("table");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagTable() {
        Token.EndTag endTag = new Token.EndTag("table");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagBody() {
        Token.EndTag endTag = new Token.EndTag("body");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagHtml() {
        Token.EndTag endTag = new Token.EndTag("html");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagCaption() {
        Token.EndTag endTag = new Token.EndTag("caption");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagColgroup() {
        Token.EndTag endTag = new Token.EndTag("colgroup");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagCol() {
        Token.EndTag endTag = new Token.EndTag("col");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagTbody() {
        Token.EndTag endTag = new Token.EndTag("tbody");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagTfoot() {
        Token.EndTag endTag = new Token.EndTag("tfoot");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagThead() {
        Token.EndTag endTag = new Token.EndTag("thead");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagTd() {
        Token.EndTag endTag = new Token.EndTag("td");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagTh() {
        Token.EndTag endTag = new Token.EndTag("th");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagTr() {
        Token.EndTag endTag = new Token.EndTag("tr");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagStyle() {
        Token.StartTag startTag = new Token.StartTag("style");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagScript() {
        Token.StartTag startTag = new Token.StartTag("script");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagInput() {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "hidden");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagForm() {
        Token.StartTag startTag = new Token.StartTag("form");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTr() {
        Token.StartTag startTag = new Token.StartTag("tr");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTd() {
        Token.StartTag startTag = new Token.StartTag("td");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTh() {
        Token.StartTag startTag = new Token.StartTag("th");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagCaption() {
        Token.StartTag startTag = new Token.StartTag("caption");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagColgroup() {
        Token.StartTag startTag = new Token.StartTag("colgroup");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagCol() {
        Token.StartTag startTag = new Token.StartTag("col");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTbody() {
        Token.StartTag startTag = new Token.StartTag("tbody");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTfoot() {
        Token.StartTag startTag = new Token.StartTag("tfoot");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagThead() {
        Token.StartTag startTag = new Token.StartTag("thead");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagHtml() {
        Token.StartTag startTag = new Token.StartTag("html");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagBody() {
        Token.StartTag startTag = new Token.StartTag("body");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessCharacterNull() {
        Token.Character token = new Token.Character();
        token.data("\u0000");
        boolean result = HtmlTreeBuilderState.InTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessCharacterWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" \t\n");
        boolean result = HtmlTreeBuilderState.InTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessCharacterNonWhitespace() {
        Token.Character token = new Token.Character();
        token.data("abc");
        boolean result = HtmlTreeBuilderState.InTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEOF() {
        Token.EOF eof = new Token.EOF();
        boolean result = HtmlTreeBuilderState.InTable.process(eof, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableTextProcessWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" ");
        boolean result = HtmlTreeBuilderState.InTableText.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableTextProcessNonWhitespace() {
        Token.Character token = new Token.Character();
        token.data("abc");
        boolean result = HtmlTreeBuilderState.InTableText.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" ");
        boolean result = HtmlTreeBuilderState.InSelect.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        boolean result = HtmlTreeBuilderState.InSelect.process(comment, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        boolean result = HtmlTreeBuilderState.InSelect.process(doctype, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagHtml() {
        Token.StartTag startTag = new Token.StartTag("html");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagOption() {
        Token.StartTag startTag = new Token.StartTag("option");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagOptgroup() {
        Token.StartTag startTag = new Token.StartTag("optgroup");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagSelect() {
        Token.StartTag startTag = new Token.StartTag("select");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagOptgroup() {
        Token.EndTag endTag = new Token.EndTag("optgroup");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagSelect() {
        Token.EndTag endTag = new Token.EndTag("select");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagOption() {
        Token.EndTag endTag = new Token.EndTag("option");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagDiv() {
        Token.EndTag endTag = new Token.EndTag("div");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTable() {
        Token.EndTag endTag = new Token.EndTag("table");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagCaption() {
        Token.EndTag endTag = new Token.EndTag("caption");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTbody() {
        Token.EndTag endTag = new Token.EndTag("tbody");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTfoot() {
        Token.EndTag endTag = new Token.EndTag("tfoot");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagThead() {
        Token.EndTag endTag = new Token.EndTag("thead");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTr() {
        Token.EndTag endTag = new Token.EndTag("tr");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTd() {
        Token.EndTag endTag = new Token.EndTag("td");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTh() {
        Token.EndTag endTag = new Token.EndTag("th");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagInput() {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "hidden");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagKeygen() {
        Token.StartTag startTag = new Token.StartTag("keygen");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessStartTagTextarea() {
        Token.StartTag startTag = new Token.StartTag("textarea");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessCharacterNull() {
        Token.Character token = new Token.Character();
        token.data("\u0000");
        boolean result = HtmlTreeBuilderState.InSelect.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessCharacterWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" \t\n");
        boolean result = HtmlTreeBuilderState.InSelect.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessCharacterNonWhitespace() {
        Token.Character token = new Token.Character();
        token.data("abc");
        boolean result = HtmlTreeBuilderState.InSelect.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEOF() {
        Token.EOF eof = new Token.EOF();
        boolean result = HtmlTreeBuilderState.InSelect.process(eof, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" ");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessComment() {
        Token.Comment comment = new Token.Comment();
        comment.data("test");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(comment, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(doctype, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagHtml() {
        Token.StartTag startTag = new Token.StartTag("html");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagCaption() {
        Token.StartTag startTag = new Token.StartTag("caption");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTable() {
        Token.StartTag startTag = new Token.StartTag("table");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTbody() {
        Token.StartTag startTag = new Token.StartTag("tbody");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTfoot() {
        Token.StartTag startTag = new Token.StartTag("tfoot");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagThead() {
        Token.StartTag startTag = new Token.StartTag("thead");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTr() {
        Token.StartTag startTag = new Token.StartTag("tr");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTd() {
        Token.StartTag startTag = new Token.StartTag("td");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTh() {
        Token.StartTag startTag = new Token.StartTag("th");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagCaption() {
        Token.EndTag endTag = new Token.EndTag("caption");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTable() {
        Token.EndTag endTag = new Token.EndTag("table");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTbody() {
        Token.EndTag endTag = new Token.EndTag("tbody");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTfoot() {
        Token.EndTag endTag = new Token.EndTag("tfoot");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagThead() {
        Token.EndTag endTag = new Token.EndTag("thead");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTr() {
        Token.EndTag endTag = new Token.EndTag("tr");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTd() {
        Token.EndTag endTag = new Token.EndTag("td");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTh() {
        Token.EndTag endTag = new Token.EndTag("th");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagHtml() {
        Token.EndTag endTag = new Token.EndTag("html");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagBody() {
        Token.EndTag endTag = new Token.EndTag("body");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagInput() {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "hidden");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagKeygen() {
        Token.StartTag startTag = new Token.StartTag("keygen");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTextarea() {
        Token.StartTag startTag = new Token.StartTag("textarea");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagOption() {
        Token.StartTag startTag = new Token.StartTag("option");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagOptgroup() {
        Token.StartTag startTag = new Token.StartTag("optgroup");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagSelect() {
        Token.StartTag startTag = new Token.StartTag("select");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagOptgroup() {
        Token.EndTag endTag = new Token.EndTag("optgroup");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagSelect() {
        Token.EndTag endTag = new Token.EndTag("select");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagOption() {
        Token.EndTag endTag = new Token.EndTag("option");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagDiv() {
        Token.EndTag endTag = new Token.EndTag("div");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessCharacterNull() {
        Token.Character token = new Token.Character();
        token.data("\u0000");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessCharacterWhitespace() {
        Token.Character token = new Token.Character();
        token.data(" \t\n");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessCharacterNonWhitespace() {
        Token.Character token = new Token.Character();
        token.data("abc");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEOF() {
        Token.EOF eof = new Token.EOF();
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(eof, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyEndTagDiv() {
        Token.EndTag endTag = new Token.EndTag("div");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyEndTagP() {
        Token.EndTag endTag = new Token.EndTag("p");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyEndTagSarcasm() {
        Token.EndTag endTag = new Token.EndTag("sarcasm");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyEndTagCustom() {
        Token.EndTag endTag = new Token.EndTag("custom");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessEndTagFormatEl() {
        tb.push(new Element(Tag.valueOf("b"), ""));
        Token.EndTag endTag = new Token.EndTag("b");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessEndTagFormatElNotInScope() {
        tb.push(new Element(Tag.valueOf("div"), ""));
        Token.EndTag endTag = new Token.EndTag("b");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagFormatElReconstruction() {
        tb.push(new Element(Tag.valueOf("div"), ""));
        Token.StartTag startTag = new Token.StartTag("b");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagPreListing() {
        Token.StartTag startTag = new Token.StartTag("pre");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagListing() {
        Token.StartTag startTag = new Token.StartTag("listing");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagPlaintext() {
        Token.StartTag startTag = new Token.StartTag("plaintext");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagHr() {
        Token.StartTag startTag = new Token.StartTag("hr");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagXmp() {
        Token.StartTag startTag = new Token.StartTag("xmp");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagIframe() {
        Token.StartTag startTag = new Token.StartTag("iframe");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagNoEmbed() {
        Token.StartTag startTag = new Token.StartTag("noembed");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagFrameset() {
        Token.StartTag startTag = new Token.StartTag("frameset");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagNoScript() {
        Token.StartTag startTag = new Token.StartTag("noscript");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagHead() {
        Token.StartTag startTag = new Token.StartTag("head");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessEndTagNoscript() {
        Token.EndTag endTag = new Token.EndTag("noscript");
        boolean result = HtmlTreeBuilderState.InBody.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagTableInTable() {
        tb.setFragmentParsing(true);
        Token.StartTag startTag = new Token.StartTag("table");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagCol() {
        tb.setFragmentParsing(false);
        Token.StartTag startTag = new Token.StartTag("col");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagColWithFrameSetOk() {
        tb.setFragmentParsing(false);
        tb.setFramesetOk(false);
        Token.StartTag startTag = new Token.StartTag("col");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagColgroup() {
        tb.setFragmentParsing(false);
        Token.EndTag endTag = new Token.EndTag("colgroup");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInTableProcessEndTagTableWithStack() {
        tb.push(new Element(Tag.valueOf("table"), ""));
        Token.EndTag endTag = new Token.EndTag("table");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessCharacterPendingTableCharacters() {
        tb.setPendingTableCharacters(new ArrayList<>());
        Token.Character token = new Token.Character();
        token.data("abc");
        boolean result = HtmlTreeBuilderState.InTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessCharacterPendingTableCharactersWhitespace() {
        tb.setPendingTableCharacters(new ArrayList<>());
        Token.Character token = new Token.Character();
        token.data(" \t\n");
        boolean result = HtmlTreeBuilderState.InTable.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagStyleWithPendingChars() {
        tb.setPendingTableCharacters(new ArrayList<>());
        Token.StartTag startTag = new Token.StartTag("style");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagStyleWithPendingChars() {
        tb.setPendingTableCharacters(new ArrayList<>());
        Token.EndTag endTag = new Token.EndTag("style");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagScriptWithPendingChars() {
        tb.setPendingTableCharacters(new ArrayList<>());
        Token.EndTag endTag = new Token.EndTag("script");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagFormWithFormElement() {
        tb.setFormElement(new Element(Tag.valueOf("form"), ""));
        Token.StartTag startTag = new Token.StartTag("form");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessEndTagFormWithFormElement() {
        tb.setFormElement(new Element(Tag.valueOf("form"), ""));
        Token.EndTag endTag = new Token.EndTag("form");
        boolean result = HtmlTreeBuilderState.InTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagInputNotHidden() {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "text");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagInputHiddenNoTableScope() {
        tb.setFragmentParsing(false);
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "hidden");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInTableProcessStartTagInputHiddenTableScope() {
        tb.setFragmentParsing(false);
        tb.push(new Element(Tag.valueOf("table"), ""));
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.attributes.put("type", "hidden");
        boolean result = HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInBodyProcessStartTagSelectInTable() {
        tb.setFragmentParsing(false);
        tb.push(new Element(Tag.valueOf("table"), ""));
        Token.StartTag startTag = new Token.StartTag("select");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessStartTagSelectInTableScope() {
        tb.setFragmentParsing(false);
        tb.push(new Element(Tag.valueOf("table"), ""));
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("select");
        boolean result = HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectProcessEndTagTable() {
        tb.setFragmentParsing(false);
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.EndTag endTag = new Token.EndTag("table");
        boolean result = HtmlTreeBuilderState.InSelect.process(endTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInSelectProcessStartTagSelect() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("select");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertFalse(result);
    }

    @Test
    public void testInSelectProcessStartTagOptionWithOptgroup() {
        tb.push(new Element(Tag.valueOf("optgroup"), ""));
        Token.StartTag startTag = new Token.StartTag("option");
        boolean result = HtmlTreeBuilderState.InSelect.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTable() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("table"), ""));
        Token.EndTag endTag = new Token.EndTag("table");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTr() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("tr"), ""));
        Token.EndTag endTag = new Token.EndTag("tr");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTd() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("td"), ""));
        Token.EndTag endTag = new Token.EndTag("td");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTh() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("th"), ""));
        Token.EndTag endTag = new Token.EndTag("th");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTbody() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("tbody"), ""));
        Token.EndTag endTag = new Token.EndTag("tbody");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagTfoot() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("tfoot"), ""));
        Token.EndTag endTag = new Token.EndTag("tfoot");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagThead() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("thead"), ""));
        Token.EndTag endTag = new Token.EndTag("thead");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessEndTagCaption() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        tb.push(new Element(Tag.valueOf("caption"), ""));
        Token.EndTag endTag = new Token.EndTag("caption");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagCaption() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("caption");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTable() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("table");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTbody() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("tbody");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTfoot() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("tfoot");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagThead() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("thead");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTr() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("tr");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTd() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("td");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInSelectInTableProcessStartTagTh() {
        tb.push(new Element(Tag.valueOf("select"), ""));
        Token.StartTag startTag = new Token.StartTag("th");
        boolean result = HtmlTreeBuilderState.InSelectInTable.process(startTag, tb);
        assertTrue(result);
    }

    @Test
    public void testProcessUnknownToken() {
        Token token = new Token() {
            @Override
            public TokenType type() {
                return TokenType.Unknown;
            }
        };
        boolean result = HtmlTreeBuilderState.InBody.process(token, tb);
        assertTrue(result);
    }

    @Test
    public void testIsWhitespace() {
        assertTrue(HtmlTreeBuilderState.isWhitespace(" \t\n"));
        assertFalse(HtmlTreeBuilderState.isWhitespace("abc"));
        assertTrue(HtmlTreeBuilderState.isWhitespace(' '));
        assertFalse(HtmlTreeBuilderState.isWhitespace('a'));
        assertNull(null);
    }
}