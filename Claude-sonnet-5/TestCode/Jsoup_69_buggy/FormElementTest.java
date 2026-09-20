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
    public void testElementsInitiallyEmpty() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Elements els = form.elements();
        assertNotNull(els);
        assertEquals(0, els.size());
    }

    @Test
    public void testElementsAfterAddSingle() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "foo");
        form.addElement(input);
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testElementsAfterAddMultiple() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input1 = new Element(Tag.valueOf("input"), "http://example.com/");
        input1.attr("name", "a");
        Element input2 = new Element(Tag.valueOf("input"), "http://example.com/");
        input2.attr("name", "b");
        form.addElement(input1);
        form.addElement(input2);
        assertEquals(2, form.elements().size());
    }

    // ---------- addElement() ----------

    @Test
    public void testAddElementReturnsSameInstanceForChaining() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        FormElement returned = form.addElement(input);
        assertSame(form, returned);
    }

    @Test
    public void testAddElementChainingMultipleAdds() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input1 = new Element(Tag.valueOf("input"), "http://example.com/");
        Element input2 = new Element(Tag.valueOf("input"), "http://example.com/");
        form.addElement(input1).addElement(input2);
        assertEquals(2, form.elements().size());
    }

    // ---------- submit() ----------

    @Test
    public void testSubmitWithActionAttribute() {
        String html = "<form action='/action.cgi' method='post'><input type='text' name='name' value='John'></form>";