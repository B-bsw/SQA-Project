package org.jsoup.parser;

import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.util.LinkedList;

public class HtmlTreeBuilderStateTest {
    private HtmlTreeBuilder tb;
    private Token.TokenType tokenType;
    private Token currentToken;
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Comment comment;
    private Token.Doctype doctype;
    private Token.Character character;
    private Token.EOF eof;

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        tokenType = Token.TokenType.StartTag;
        startTag = new Token.StartTag("html");
        endTag = new Token.EndTag("html");
        comment = new Token.Comment("test");
        doctype = new Token.Doctype("html", "public", "system");
        character = new Token.Character("a");
        eof = new Token.EOF();
        currentToken = startTag;
    }

    @After
    public void tearDown() {
        tb = null;
        tokenType = null;
        startTag = null;
        endTag = null;
        comment = null;
        doctype = null;
        character = null;
        eof = null;
        currentToken = null;
    }

    @Test
    public void testProcessWhitespaceInBody() {
        startTag.name("body");
        tokenType = Token.TokenType.Character;
        currentToken = new Token.Character(" ");
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessCommentInBody() {
        tokenType = Token.TokenType.Comment;
        currentToken = comment;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessDoctypeInBody() {
        tokenType = Token.TokenType.Doctype;
        currentToken = doctype;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartHtmlInBody() {
        startTag.name("html");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartHeadInBody() {
        startTag.name("head");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessEndHeadInBody() {
        endTag.name("head");
        currentToken = endTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessEndBrInBody() {
        endTag.name("br");
        currentToken = endTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagBaseInHead() {
        startTag.name("base");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InHead);
        boolean result = HtmlTreeBuilderState.InHead.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartTagMetaInHead() {
        startTag.name("meta");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InHead);
        boolean result = HtmlTreeBuilderState.InHead.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartTagTitleInHead() {
        startTag.name("title");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InHead);
        boolean result = HtmlTreeBuilderState.InHead.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartTagStyleInHead() {
        startTag.name("style");
        currentToken = startTag;
        tb.setState(HqlTreeBuilderState.InHead);
        boolean result = HtmlTreeBuilderState.InHead.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessEndTagHeadInHead() {
        endTag.name("head");
        currentToken = endTag;
        tb.setState(HtmlTreeBuilderState.InHead);
        boolean result = HtmlTreeBuilderState.InHead.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessEndTagBodyInAfterHead() {
        tb.setState(HtmlTreeBuilderState.InBody);
        tb.insert(new Token.StartTag("body"));
        endTag.name("body");
        currentToken = endTag;
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartTagCaptionInTable() {
        startTag.name("caption");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InTable);
        boolean result = HtmlTreeBuilderState.InTable.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessEndTagTableInTable() {
        tb.setState(HtmlTreeBuilderState.InTable);
        tb.insert(new Token.StartTag("table"));
        endTag.name("table");
        currentToken = endTag;
        boolean result = HtmlTreeBuilderState.InTable.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagTdInTable() {
        startTag.name("td");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InTable);
        boolean result = HtmlTreeBuilderState.InTable.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessStartTagTrInSelect() {
        startTag.name("tr");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InSelect);
        boolean result = HtmlTreeBuilderState.InSelect.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessEndTagOptionInSelect() {
        tb.setState(HtmlTreeBuilderState.InSelect);
        tb.insert(new Token.StartTag("option"));
        endTag.name("option");
        currentToken = endTag;
        boolean result = HtmlTreeBuilderState.InSelect.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessEOFInBody() {
        currentToken = eof;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessNullCharacterInBody() {
        character.data(nullString);
        currentToken = character;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessEmptyPendingTableCharactersInText() {
        tb.setState(HtmlTreeBuilderState.InTableText);
        currentToken = character;
        boolean result = HtmlTreeBuilderState.InTableText.process(currentToken, tb);
        Assert.assertFalse(result);
    }

    @Test
    public void testProcessNonWhitespaceInTableText() {
        character.data("a");
        currentToken = character;
        tb.setState(HtmlTreeBuilderState.InTableText);
        tb.getPendingTableCharacters().clear();
        tb.getPendingTableCharacters().add("a");
        boolean result = HtmlTreeBuilderState.InTableText.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagInputInInBody() {
        startTag.name("input");
        startTag.attributes.put("type", "text");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagIsindexInBody() {
        startTag.name("isindex");
        startTag.attributes.put("action", "test");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagSelectInBody() {
        startTag.name("select");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InBody);
        boolean result = HtmlTreeBuilderState.InBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagTdInTableBody() {
        startTag.name("td");
        currentToken = startTag;
        tb.setState(HtmlTreeBuilderState.InTableBody);
        boolean result = HtmlTreeBuilderState.InTableBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessEndTagTableInTableBody() {
        tb.setState(HtmlTreeBuilderState.InTableBody);
        tb.insert(new Token.StartTag("table"));
        endTag.name("table");
        currentToken = endTag;
        boolean result = HtmlTreeBuilderState.InTableBody.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    @Test
    public void testProcessStartTagCaptionInTableNoTableScope() {
        tb.setState(HtmlTreeBuilderState.InTable);
        startTag.name("caption");
        currentToken = startTag;
        boolean result = HtmlTreeBuilderState.InTable.process(currentToken, tb);
        Assert.assertTrue(result);
    }

    private String nullString = null;
}