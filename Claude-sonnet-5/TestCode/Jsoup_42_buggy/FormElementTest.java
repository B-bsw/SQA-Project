package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    // ---------- elements() ----------

    @Test
    public void testElementsEmptyWhenNoControls() {
        Document doc = Jsoup.parse("<form></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testElementsOneControl() {
        Document doc = Jsoup.parse("<form><input name='x' value='v'></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertEquals(1, form.elements().size());
    }

    @Test
    public void testElementsMultipleControls() {
        Document doc = Jsoup.parse("<form><input name='a'><input name='b'><input name='c'></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertEquals(3, form.elements().size());
    }

    // ---------- addElement() ----------

    @Test
    public void testAddElementReturnsThisAndIncreasesSize() {
        Document doc = Jsoup.parse("<form></form>");
        FormElement form = (FormElement) doc.select("form").first();
        Element input = new Element(Tag.valueOf("input"), doc.baseUri());
        input.attr("name", "newField");
        input.attr("value", "newVal");

        FormElement returned = form.addElement(input);
        assertSame(form, returned);
        assertEquals(1, form.elements().size());
        assertEquals(input, form.elements().get(0));
    }

    @Test
    public void testAddMultipleElements() {
        Document doc = Jsoup.parse("<form></form>");
        FormElement form = (FormElement) doc.select("form").first();
        Element e1 = new Element(Tag.valueOf("input"), doc.baseUri());
        e1.attr("name", "one");
        Element e2 = new Element(Tag.valueOf("input"), doc.baseUri());
        e2.attr("name", "two");

        form.addElement(e1).addElement(e2);
        assertEquals(2, form.elements().size());
    }

    // ---------- submit() ----------

    @Test
    public void testSubmitGetMethodDefault() {
        Document doc = Jsoup.parse("<form action='http://example.com/action'><input name='x' value='v'></form>",
                "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();
        Connection con = form.submit();
        assertEquals(Connection.Method.GET, con.request().method());
        assertEquals("http://example.com/action", con.request().url().toString());
    }

    @Test
    public void testSubmitPostMethod() {
        Document doc = Jsoup.parse(
                "<form action='http://example.com/action' method='post'><input name='x' value='v'></form>",
                "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();
        Connection con = form.submit();
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testSubmitUsesBaseUriWhenNoAction() {
        Document doc = Jsoup.parse("<form><input name='x' value='v'></form>", "http://example.com/base/");
        FormElement form = (FormElement) doc.select("form").first();
        Connection con = form.submit();
        assertEquals("http://example.com/base/", con.request().url().toString());
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitThrowsWhenNoActionAndNoBaseUri() {
        Document doc = Jsoup.parse("<form><input name='x