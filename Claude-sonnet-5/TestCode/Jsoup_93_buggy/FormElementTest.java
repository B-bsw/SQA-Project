package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    @Test
    public void testElementsInitiallyEmpty() {
        Document doc = Jsoup.parse("<form></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertNotNull(form);
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testAddElementAndChaining() {
        Document doc = Jsoup.parse("<form></form>");
        FormElement form = (FormElement) doc.select("form").first();

        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("name", "test1");

        FormElement returned = form.addElement(input);
        assertSame(form, returned);
        assertEquals(1, form.elements().size());
        assertEquals(input, form.elements().get(0));

        Element input2 = new Element(Tag.valueOf("input"), "");
        input2.attr("name", "test2");
        form.addElement(input2);
        assertEquals(2, form.elements().size());
    }

    @Test
    public void testRemoveChildRemovesFromElements() {
        Document doc = Jsoup.parse("<form><input name='q'></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertNotNull(form);

        Element input = doc.select("input").first();
        assertNotNull(input);

        assertEquals(1, form.elements().size());

        input.remove();

        assertEquals(0, form.elements().size());
    }

    @Test
    public void testSubmitThrowsWhenNoActionAndNoBaseUri() {
        Document doc = Jsoup.parse("<form><input name='q'></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertNotNull(form);

        try {
            form.submit();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {