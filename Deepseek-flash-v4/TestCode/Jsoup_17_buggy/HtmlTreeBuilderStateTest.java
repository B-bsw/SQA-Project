package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder tb;
    private HtmlTreeBuilderState.Constants constants;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        tb.setState(HtmlTreeBuilderState.InBody);
        constants = new HtmlTreeBuilderState.Constants();
    }

    @After
    public void tearDown() {
        tb = null;
        constants = null;
    }

    @Test
    public void testInitialStateProcessComment() {
        Token.Comment comment = new Token.Comment("test");
        boolean result = HtmlTreeBuilderState.Initial.process(comment, tb);
        assertFalse(result);
        assertEquals(1, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInitialStateProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype("html");
        boolean result = HtmlTreeBuilderState.Initial.process(doctype, tb);
        assertTrue(result);
        assertNull(tb.currentElement());
    }

    @Test(expected = TokeniserState.UnknownTag.class)
    public void testInitialStateProcessStartTag() {
        Token.StartTag startTag = new Token.StartTag("div");
        HtmlTreeBuilderState.Initial.process(startTag, tb);
    }

    @Test
    public void testInitialStateProcessWhitespace() {
        Token.Character character = new Token.Character(" ");
        boolean result = HtmlTreeBuilderState.Initial.process(character, tb);
        assertFalse(result);
    }

    @Test
    public void testInitialStateProcessEndTag() {
        Token.EndTag endTag = new Token.EndTag("html");
        boolean result = HtmlTreeBuilderState.Initial.process(endTag, tb);
        assertTrue(result);
    }

    @Test
    public void testInBodyProcessDoctype() {
        Token.Doctype doctype = new Token.Doctype("div");
        HtmlTreeBuilderState.InBody.process(doctype, tb);
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagDiv() {
        Token.StartTag startTag = new Token.StartTag("div");
        HtmlTreeBuilderState.InBody.process(startTag, tb);
        assertEquals("div", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagInvalid() {
        Token.StartTag startTag = new Token.StartTag("invalid");
        assertFalse(HtmlTreeBuilderState.InBody.process(startTag, tb));
    }

    @Test
    public void testInBodyProcessEndTagInvalid() {
        Token.EndTag endTag = new Token.EndTag("invalid");
        assertFalse(HtmlTreeBuilderState.InBody.process(endTag, tb));
    }

    @Test
    public void testInBodyProcessCharacter() {
        Token.Character character = new Token.Character("x");
        HtmlTreeBuilderState.InBody.process(character, tb);
        assertEquals("x", tb.currentElement().childNode(0).toString());
    }

    @Test
    public void testInBodyProcessCharacterWhitespace() {
        Token.Character character = new Token.Character(" ");
        HtmlTreeBuilderState.InBody.process(character, tb);
        assertEquals(0, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInBodyProcessComment() {
        Token.Comment comment = new Token.Comment("test");
        HtmlTreeBuilderState.InBody.process(comment, tb);
        assertEquals(1, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInBodyProcessStartTagTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        Token.StartTag startTag = new Token.StartTag("table");
        HtmlTreeBuilderState.InTable.process(startTag, tb);
        assertEquals("table", tb.currentElement().nodeName());
    }

    @Test
    public void testInTableProcessEndTagTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.EndTag endTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(endTag, tb));
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testInTableProcessStartTagTd() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag startTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InTable.process(startTag, tb));
        assertEquals("td", tb.currentElement().nodeName());
    }

    @Test
    public void testInTableProcessEndTagInvalid() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.EndTag endTag = new Token.EndTag("div");
        assertFalse(HtmlTreeBuilderState.InTable.process(endTag, tb));
    }

    @Test
    public void testInSelectProcessStartTagOption() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("option");
        Token.StartTag startTag = new Token.StartTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(startTag, tb));
        assertEquals("option", tb.currentElement().nodeName());
    }

    @Test
    public void testInSelectProcessEndTagSelect() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.EndTag endTag = new Token.EndTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(endTag, tb));
    }

    @Test
    public void testInSelectProcessCharacter() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.Character character = new Token.Character("x");
        HtmlTreeBuilderState.InSelect.process(character, tb);
        assertEquals("x", tb.currentElement().childNode(0).toString());
    }

    @Test
    public void testInSelectProcessNullCharacter() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.Character character = new Token.Character('\u0000');
        HtmlTreeBuilderState.InSelect.process(character, tb);
        assertEquals(0, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInSelectProcessStartTagInvalid() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.StartTag startTag = new Token.StartTag("div");
        assertFalse(HtmlTreeBuilderState.InSelect.process(startTag, tb));
    }

    @Test
    public void testInSelectProcessEndTagInvalid() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.EndTag endTag = new Token.EndTag("div");
        assertFalse(HtmlTreeBuilderState.InSelect.process(endTag, tb));
    }

    @Test
    public void testInSelectProcessComment() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.Comment comment = new Token.Comment("test");
        HtmlTreeBuilderState.InSelect.process(comment, tb);
        assertEquals(1, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInSelectProcessDoctype() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.Doctype doctype = new Token.Doctype("test");
        assertTrue(HtmlTreeBuilderState.InSelect.process(doctype, tb));
    }

    @Test
    public void testInSelectProcessEOF() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.push("select");
        Token.EOF eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.InSelect.process(eof, tb));
    }

    @Test
    public void testInBodyProcessStartTagForm() {
        tb.setState(HtmlTreeBuilderState.InBody);
        Token.StartTag form = new Token.StartTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(form, tb));
        assertNotNull(tb.getFormElement());
    }

    @Test
    public void testInBodyProcessStartTagFormWithExistingForm() {
        tb.setState(HtmlTreeBuilderState.InBody);
        Token.StartTag form1 = new Token.StartTag("form");
        HtmlTreeBuilderState.InBody.process(form1, tb);
        Token.StartTag form2 = new Token.StartTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(form2, tb));
    }

    @Test
    public void testInBodyProcessStartTagLi() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag li = new Token.StartTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(li, tb));
        assertEquals("li", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagDdDt() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag dd = new Token.StartTag("dd");
        assertTrue(HtmlTreeBuilderState.InBody.process(dd, tb));
        assertEquals("dd", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagPlaintext() {
        tb.setState(HtmlTreeBuilderState.InBody);
        Token.StartTag plaintext = new Token.StartTag("plaintext");
        assertTrue(HtmlTreeBuilderState.InBody.process(plaintext, tb));
    }

    @Test
    public void testInBodyProcessStartTagButton() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag button = new Token.StartTag("button");
        assertTrue(HtmlTreeBuilderState.InBody.process(button, tb));
    }

    @Test
    public void testInBodyProcessStartTagAnchor() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag a = new Token.StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(a, tb));
        assertEquals("a", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagAnchorExisting() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("a");
        Token.StartTag a = new Token.StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(a, tb));
    }

    @Test
    public void testInBodyProcessStartTagNobr() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag nobr = new Token.StartTag("nobr");
        assertTrue(HtmlTreeBuilderState.InBody.process(nobr, tb));
    }

    @Test
    public void testInBodyProcessStartTagNobrExisting() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("nobr");
        Token.StartTag nobr = new Token.StartTag("nobr");
        assertTrue(HtmlTreeBuilderState.InBody.process(nobr, tb));
    }

    @Test
    public void testInBodyProcessStartTagApplet() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag applet = new Token.StartTag("applet");
        assertTrue(HtmlTreeBuilderState.InBody.process(applet, tb));
    }

    @Test
    public void testInBodyProcessStartTagTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag table = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InBody.process(table, tb));
        assertEquals("table", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagImage() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag image = new Token.StartTag("image");
        assertTrue(HtmlTreeBuilderState.InBody.process(image, tb));
        assertEquals("img", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagIsindex() {
        tb.setState(HtmlTreeBuilderState.InBody);
        Token.StartTag isindex = new Token.StartTag("isindex");
        assertTrue(HtmlTreeBuilderState.InBody.process(isindex, tb));
    }

    @Test
    public void testInBodyProcessStartTagTextarea() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag textarea = new Token.StartTag("textarea");
        assertTrue(HtmlTreeBuilderState.InBody.process(textarea, tb));
    }

    @Test
    public void testInBodyProcessStartTagXmp() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag xmp = new Token.StartTag("xmp");
        assertTrue(HtmlTreeBuilderState.InBody.process(xmp, tb));
    }

    @Test
    public void testInBodyProcessStartTagIframe() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag iframe = new Token.StartTag("iframe");
        assertTrue(HtmlTreeBuilderState.InBody.process(iframe, tb));
    }

    @Test
    public void testInBodyProcessStartTagNoembed() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag noembed = new Token.StartTag("noembed");
        assertTrue(HtmlTreeBuilderState.InBody.process(noembed, tb));
    }

    @Test
    public void testInBodyProcessStartTagSelect() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag select = new Token.StartTag("select");
        assertTrue(HtmlTreeBuilderState.InBody.process(select, tb));
    }

    @Test
    public void testInBodyProcessStartTagMath() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag math = new Token.StartTag("math");
        assertTrue(HtmlTreeBuilderState.InBody.process(math, tb));
    }

    @Test
    public void testInBodyProcessStartTagSvg() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag svg = new Token.StartTag("svg");
        assertTrue(HtmlTreeBuilderState.InBody.process(svg, tb));
    }

    @Test
    public void testInBodyProcessEndTagBody() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag body = new Token.EndTag("body");
        assertTrue(HtmlTreeBuilderState.InBody.process(body, tb));
    }

    @Test
    public void testInBodyProcessEndTagHtml() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag html = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.InBody.process(html, tb));
    }

    @Test
    public void testInBodyProcessEndTagP() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag p = new Token.EndTag("p");
        assertTrue(HtmlTreeBuilderState.InBody.process(p, tb));
    }

    @Test
    public void testInBodyProcessEndTagSarcasm() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag sarcasm = new Token.EndTag("sarcasm");
        assertTrue(HtmlTreeBuilderState.InBody.process(sarcasm, tb));
    }

    @Test
    public void testInBodyProcessFormattingEndTag() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag b = new Token.EndTag("b");
        assertTrue(HtmlTreeBuilderState.InBody.process(b, tb));
    }

    @Test
    public void testInBodyProcessEndTagBr() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag br = new Token.EndTag("br");
        assertTrue(HtmlTreeBuilderState.InBody.process(br, tb));
    }

    @Test
    public void testInBodyProcessEOF() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EOF eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.InBody.process(eof, tb));
    }

    @Test
    public void testInBodyProcessStartTagInvalidTag() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag startTag = new Token.StartTag("invalid");
        assertTrue(HtmlTreeBuilderState.InBody.process(startTag, tb));
    }

    @Test
    public void testInBodyProcessEndTagInvalidTag() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag endTag = new Token.EndTag("invalid");
        assertFalse(HtmlTreeBuilderState.InBody.process(endTag, tb));
    }

    @Test
    public void testInBodyProcessCharacterNul() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.Character character = new Token.Character('\u0000');
        HtmlTreeBuilderState.InBody.process(character, tb);
        assertEquals(1, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInBodyProcessCharacterWhitespace() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.Character character = new Token.Character(' ');
        HtmlTreeBuilderState.InBody.process(character, tb);
        assertEquals(0, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInBodyProcessStartTagH1() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("p");
        Token.StartTag h1 = new Token.StartTag("h1");
        assertTrue(HtmlTreeBuilderState.InBody.process(h1, tb));
    }

    @Test
    public void testInBodyProcessStartTagPre() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag pre = new Token.StartTag("pre");
        assertTrue(HtmlTreeBuilderState.InBody.process(pre, tb));
    }

    @Test
    public void testInBodyProcessStartTagFormWhenFormExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.setFormElement(new FormElement("form"));
        Token.StartTag form = new Token.StartTag("form");
        HtmlTreeBuilderState.InBody.process(form, tb);
        assertEquals("div", tb.currentElement().nodeName());
    }

    @Test
    public void testInBodyProcessStartTagLiWhenLiExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("li");
        tb.push("div");
        Token.StartTag li = new Token.StartTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(li, tb));
    }

    @Test
    public void testInBodyProcessStartTagDdWhenDdExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("dd");
        tb.push("div");
        Token.StartTag dd = new Token.StartTag("dd");
        assertTrue(HtmlTreeBuilderState.InBody.process(dd, tb));
    }

    @Test
    public void testInBodyProcessStartTagDl() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag dl = new Token.StartTag("dl");
        assertTrue(HtmlTreeBuilderState.InBody.process(dl, tb));
    }

    @Test
    public void testInBodyProcessStartTagDdNoP() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag dd = new Token.StartTag("dd");
        assertTrue(HtmlTreeBuilderState.InBody.process(dd, tb));
    }

    @Test
    public void testInBodyProcessStartTagLiNoP() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag li = new Token.StartTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(li, tb));
    }

    @Test
    public void testInBodyProcessStartTagTableWithTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("div");
        Token.StartTag table = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InBody.process(table, tb));
    }

    @Test
    public void testInBodyProcessStartTagTableWithTableInTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("tr");
        tb.push("table");
        tb.pop();
        tb.pop();
        tb.push("div");
        Token.StartTag table = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InBody.process(table, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaption() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionWithTableInTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("tr");
        tb.push("table");
        tb.pop();
        tb.pop();
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionWithBody() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("body");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionWithHtml() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("html");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionWithBogus() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("bogus");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagCaption() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("caption");
        tb.push("div");
        Token.EndTag caption = new Token.EndTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagCaptionNoCaption() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag caption = new Token.EndTag("caption");
        assertFalse(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagHeader() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("h1");
        tb.push("div");
        Token.EndTag header = new Token.EndTag("h1");
        assertTrue(HtmlTreeBuilderState.InBody.process(header, tb));
    }

    @Test
    public void testInBodyProcessEndTagHeaderNoHeader() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag header = new Token.EndTag("h1");
        assertFalse(HtmlTreeBuilderState.InBody.process(header, tb));
    }

    @Test
    public void testInBodyProcessStartTagFormWithFormExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.setFormElement(new FormElement("form"));
        Token.StartTag form = new Token.StartTag("form");
        assertTrue(HtmlTreeBuilderState.InBody.process(form, tb));
    }

    @Test
    public void testInBodyProcessStartTagLiWithLiExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("li");
        tb.push("div");
        Token.StartTag li = new Token.StartTag("li");
        assertTrue(HtmlTreeBuilderState.InBody.process(li, tb));
    }

    @Test
    public void testInBodyProcessStartTagDdWithDdExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("dd");
        tb.push("div");
        Token.StartTag dd = new Token.StartTag("dd");
        assertTrue(HtmlTreeBuilderState.InBody.process(dd, tb));
    }

    @Test
    public void testInBodyProcessStartTagDlWithDlExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("dl");
        tb.push("div");
        Token.StartTag dl = new Token.StartTag("dl");
        assertTrue(HtmlTreeBuilderState.InBody.process(dl, tb));
    }

    @Test
    public void testInBodyProcessStartTagNobrWithNobrExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("nobr");
        tb.push("div");
        Token.StartTag nobr = new Token.StartTag("nobr");
        assertTrue(HtmlTreeBuilderState.InBody.process(nobr, tb));
    }

    @Test
    public void testInBodyProcessStartTagAWithAExists() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("a");
        tb.push("div");
        Token.StartTag a = new Token.StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(a, tb));
    }

    @Test
    public void testInBodyProcessStartTagAWithAExistsAndFormatting() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("a");
        tb.push("b");
        tb.push("div");
        Token.StartTag a = new Token.StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(a, tb));
    }

    @Test
    public void testInBodyProcessStartTagAWithAExistsAndFormatting2() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("a");
        tb.push("b");
        tb.push("div");
        tb.push("i");
        Token.StartTag a = new Token.StartTag("a");
        assertTrue(HtmlTreeBuilderState.InBody.process(a, tb));
    }

    @Test
    public void testInBodyProcessStartTagNobrWithNobrExistsAndFormatting() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("nobr");
        tb.push("b");
        tb.push("div");
        Token.StartTag nobr = new Token.StartTag("nobr");
        assertTrue(HtmlTreeBuilderState.InBody.process(nobr, tb));
    }

    @Test
    public void testInBodyProcessStartTagDivWithForm() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.setFormElement(new FormElement("form"));
        tb.push("div");
        Token.StartTag div = new Token.StartTag("div");
        assertTrue(HtmlTreeBuilderState.InBody.process(div, tb));
    }

    @Test
    public void testInBodyProcessStartTagDivWithNoForm() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag div = new Token.StartTag("div");
        assertTrue(HtmlTreeBuilderState.InBody.process(div, tb));
    }

    @Test
    public void testInBodyProcessEOFWithForm() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.setFormElement(new FormElement("form"));
        tb.push("div");
        Token.EOF eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.InBody.process(eof, tb));
    }

    @Test
    public void testInBodyProcessCharacterInScope() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("a");
        Token.Character character = new Token.Character("x");
        HtmlTreeBuilderState.InBody.process(character, tb);
        assertEquals("x", tb.currentElement().childNode(0).toString());
    }

    @Test
    public void testInBodyProcessCharacterNotInScope() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("table");
        tb.push("a");
        Token.Character character = new Token.Character("x");
        HtmlTreeBuilderState.InBody.process(character, tb);
        assertEquals("x", tb.currentElement().childNode(0).toString());
    }

    @Test
    public void testInBodyProcessEndTagForFormatting() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("a");
        tb.push("b");
        tb.push("i");
        Token.EndTag b = new Token.EndTag("b");
        assertTrue(HtmlTreeBuilderState.InBody.process(b, tb));
    }

    @Test
    public void testInBodyProcessEndTagForFormattingWithNoFormatting() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag b = new Token.EndTag("b");
        assertFalse(HtmlTreeBuilderState.InBody.process(b, tb));
    }

    @Test
    public void testInBodyProcessEndTagForFormattingWithNoFormattingInScope() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("table");
        tb.push("b");
        Token.EndTag b = new Token.EndTag("b");
        assertFalse(HtmlTreeBuilderState.InBody.process(b, tb));
    }

    @Test
    public void testInBodyProcessEndTagForFormattingWithFormattingInScope() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("b");
        tb.push("a");
        Token.EndTag b = new Token.EndTag("b");
        assertTrue(HtmlTreeBuilderState.InBody.process(b, tb));
    }

    @Test
    public void testInBodyProcessEndTagForFormattingWithFormattingNotInScope() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("table");
        tb.push("b");
        tb.push("a");
        Token.EndTag b = new Token.EndTag("b");
        assertFalse(HtmlTreeBuilderState.InBody.process(b, tb));
    }

    @Test
    public void testInBodyProcessStartTagCol() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        Token.StartTag col = new Token.StartTag("col");
        assertFalse(HtmlTreeBuilderState.InBody.process(col, tb));
    }

    @Test
    public void testInBodyProcessStartTagColgroup() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        Token.StartTag colgroup = new Token.StartTag("colgroup");
        assertFalse(HtmlTreeBuilderState.InBody.process(colgroup, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionNoTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertFalse(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionNoTableInBody() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        tb.push("table");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionNoTableInTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionInTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionInTableWithTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        tb.push("table");
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionInTableWithTableInTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessStartTagCaptionInTableWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertFalse(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagCaptionInTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("caption");
        tb.push("div");
        Token.EndTag caption = new Token.EndTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagCaptionInTableWithTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("caption");
        tb.push("table");
        tb.push("div");
        Token.EndTag caption = new Token.EndTag("caption");
        assertTrue(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagCaptionInTableWithNoCaption() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("table");
        tb.push("div");
        Token.EndTag caption = new Token.EndTag("caption");
        assertFalse(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInBodyProcessEndTagCaptionInTableWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.push("div");
        Token.EndTag caption = new Token.EndTag("caption");
        assertFalse(HtmlTreeBuilderState.InBody.process(caption, tb));
    }

    @Test
    public void testInTableProcessStartTagTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("div");
        Token.StartTag table = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(table, tb));
    }

    @Test
    public void testInTableProcessStartTagTableWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("div");
        Token.StartTag table = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(table, tb));
    }

    @Test
    public void testInTableProcessStartTagTd() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag td = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InTable.process(td, tb));
    }

    @Test
    public void testInTableProcessStartTagCaption() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag caption = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InTable.process(caption, tb));
    }

    @Test
    public void testInTableProcessStartTagCaptionWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("div");
        Token.StartTag caption = new Token.StartTag("caption");
        assertFalse(HtmlTreeBuilderState.InTable.process(caption, tb));
    }

    @Test
    public void testInTableProcessStartTagColgroup() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag colgroup = new Token.StartTag("colgroup");
        assertTrue(HtmlTreeBuilderState.InTable.process(colgroup, tb));
    }

    @Test
    public void testInTableProcessStartTagCol() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag col = new Token.StartTag("col");
        assertTrue(HtmlTreeBuilderState.InTable.process(col, tb));
    }

    @Test
    public void testInTableProcessStartTagColgroupWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("div");
        Token.StartTag colgroup = new Token.StartTag("colgroup");
        assertFalse(HtmlTreeBuilderState.InTable.process(colgroup, tb));
    }

    @Test
    public void testInTableProcessCharacter() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.Character character = new Token.Character("x");
        assertFalse(HtmlTreeBuilderState.InTable.process(character, tb));
        assertEquals("x", tb.currentElement().childNode(0).toString());
    }

    @Test
    public void testInTableProcessCharacterWhitespace() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.Character character = new Token.Character(' ');
        assertFalse(HtmlTreeBuilderState.InTable.process(character, tb));
        assertEquals(0, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInTableProcessComment() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.Comment comment = new Token.Comment("test");
        assertTrue(HtmlTreeBuilderState.InTable.process(comment, tb));
        assertEquals(1, tb.currentElement().childNodeSize());
    }

    @Test
    public void testInTableProcessDoctype() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.Doctype doctype = new Token.Doctype("test");
        assertTrue(HtmlTreeBuilderState.InTable.process(doctype, tb));
    }

    @Test
    public void testInTableProcessEOF() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.EOF eof = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.InTable.process(eof, tb));
    }

    @Test
    public void testInTableProcessEndTagForm() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("form");
        Token.EndTag form = new Token.EndTag("form");
        assertTrue(HtmlTreeBuilderState.InTable.process(form, tb));
    }

    @Test
    public void testInTableProcessEndTagFormNoForm() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.EndTag form = new Token.EndTag("form");
        assertFalse(HtmlTreeBuilderState.InTable.process(form, tb));
    }

    @Test
    public void testInTableProcessEndTagSelect() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("select");
        Token.EndTag select = new Token.EndTag("select");
        assertTrue(HtmlTreeBuilderState.InTable.process(select, tb));
    }

    @Test
    public void testInTableProcessEndTagSelectNoSelect() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.EndTag select = new Token.EndTag("select");
        assertFalse(HtmlTreeBuilderState.InTable.process(select, tb));
    }

    @Test
    public void testInTableProcessStartTagTr() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag tr = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("div");
        Token.StartTag tr = new Token.StartTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagImplyTbody() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        tb.pop();
        tb.push("html");
        Token.StartTag tr = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagImplyTbodyWithNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("html");
        Token.StartTag tr = new Token.StartTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithTbody() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tbody");
        Token.StartTag tr = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithTbodyNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("tbody");
        Token.StartTag tr = new Token.StartTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithTfoot() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tfoot");
        Token.StartTag tr = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithThead() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("thead");
        Token.StartTag tr = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithTfootNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("tfoot");
        Token.StartTag tr = new Token.StartTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagTrWithTheadNoTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("thead");
        Token.StartTag tr = new Token.StartTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessEndTagTr() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tbody");
        tb.push("tr");
        Token.EndTag tr = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessEndTagTrNoTr() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tbody");
        Token.EndTag tr = new Token.EndTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessEndTagTrNoTbody() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.EndTag tr = new Token.EndTag("tr");
        assertFalse(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessStartTagStyle() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag style = new Token.StartTag("style");
        assertTrue(HtmlTreeBuilderState.InTable.process(style, tb));
    }

    @Test
    public void testInTableProcessStartTagScript() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag script = new Token.StartTag("script");
        assertTrue(HtmlTreeBuilderState.InTable.process(script, tb));
    }

    @Test
    public void testInTableProcessStartTagInput() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag input = new Token.StartTag("input");
        assertTrue(HtmlTreeBuilderState.InTable.process(input, tb));
    }

    @Test
    public void testInTableProcessStartTagInputHidden() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag input = new Token.StartTag("input");
        input.attributes.put("type", "hidden");
        assertTrue(HtmlTreeBuilderState.InTable.process(input, tb));
    }

    @Test
    public void testInTableProcessStartTagForm() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag form = new Token.StartTag("form");
        assertTrue(HtmlTreeBuilderState.InTable.process(form, tb));
    }

    @Test
    public void testInTableProcessStartTagFormWithForm() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.setFormElement(new FormElement("form"));
        Token.StartTag form = new Token.StartTag("form");
        assertFalse(HtmlTreeBuilderState.InTable.process(form, tb));
    }

    @Test
    public void testInTableProcessStartTagTableTr() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        Token.StartTag table = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(table, tb));
    }

    @Test
    public void testInTableProcessEndTagTableTr() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        Token.EndTag table = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTable.process(table, tb));
    }

    @Test
    public void testInTableProcessStartTagTd() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        Token.StartTag td = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InTable.process(td, tb));
    }

    @Test
    public void testInTableProcessStartTagTdNoTr() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        Token.StartTag td = new Token.StartTag("td");
        assertFalse(HtmlTreeBuilderState.InTable.process(td, tb));
    }

    @Test
    public void testInTableProcessEndTagTd() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        Token.EndTag td = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InTable.process(td, tb));
    }

    @Test
    public void testInTableProcessEndTagTdNoTd() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        Token.EndTag td = new Token.EndTag("td");
        assertFalse(HtmlTreeBuilderState.InTable.process(td, tb));
    }

    @Test
    public void testInTableProcessEndTagTrWithTd() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        Token.EndTag tr = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }

    @Test
    public void testInTableProcessEndTagTrWithTdAndSpan() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.push("table");
        tb.push("tr");
        tb.push("td");
        tb.push("span");
        Token.EndTag tr = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InTable.process(tr, tb));
    }
}