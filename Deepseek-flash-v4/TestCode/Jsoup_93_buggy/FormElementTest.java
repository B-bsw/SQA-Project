package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class FormElementTest {

    private FormElement form(String baseUri) {
        return new FormElement(Tag.valueOf("form"), baseUri, new Attributes());
    }

    private Element input(String name, String type, String value) {
        Element el = new Element(Tag.valueOf("input"), "", new Attributes());
        el.attr("name", name);
        if (type != null) {
            el.attr("type", type);
        }
        if (value != null) {
            el.attr("value", value);
        }
        return el;
    }

    @Test
    public void elementsStartsEmptyAndAddElementReturnsThis() {
        FormElement form = form("http://example.com/");
        assertNotNull(form.elements());
        assertEquals(0, form.elements().size());

        Element el = input("q", "text", "jsoup");
        assertSame(form, form.addElement(el));
        assertEquals(1, form.elements().size());
        assertSame(el, form.elements().get(0));
    }

    @Test
    public void formDataSkipsNonSubmitDisabledAndUnnamedControls() {
        FormElement form = form("http://example.com/");

        Element div = new Element(Tag.valueOf("div"), "", new Attributes());
        div.attr("name", "x");
        form.addElement(div);

        Element disabled = input("disabled", null, "value");
        disabled.attr("disabled", "");
        form.addElement(disabled);

        Element unnamed = input("", "text", "value");
        form.addElement(unnamed);

        Element normal = input("q", "text", "jsoup");
        form.addElement(normal);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("q", data.get(0).key());
        assertEquals("jsoup", data.get(0).value());
    }

    @Test
    public void formDataSelectUsesSelectedOption() {
        FormElement form = form("http://example.com/");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes());
        select.attr("name", "s");
        select.appendElement("option").attr("value", "first");
        select.appendElement("option").attr("selected", "").attr("value", "second");
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("second", data.get(0).value());
    }

    @Test
    public void formDataSelectFallsBackToFirstOption() {
        FormElement form = form("http://example.com/");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes());
        select.attr("name", "s");
        select.appendElement("option").attr("value", "first");
        select.appendElement("option").attr("value", "second");
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("first", data.get(0).value());
    }

    @Test
    public void formDataSelectWithNoOptionAddsNothing() {
        FormElement form = form("http://example.com/");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes());
        select.attr("name", "s");
        form.addElement(select);

        assertEquals(0, form.formData().size());
    }

    @Test
    public void formDataCheckboxAndRadioUseCheckedAndValue() {
        FormElement form = form("http://example.com/");
        Element checkbox = input("c", "checkbox", null);
        checkbox.attr("checked", "");
        form.addElement(checkbox);

        Element radio = input("r", "radio", "yes");
        radio.attr("checked", "");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("c", data.get(0).key());
        assertEquals("on", data.get(0).value());
        assertEquals("r", data.get(1).key());
        assertEquals("yes", data.get(1).value());
    }

    @Test
    public void formDataIgnoresUncheckedCheckbox() {
        FormElement form = form("http://example.com/");
        form.addElement(input("c", "checkbox", "value"));

        assertEquals(0, form.formData().size());
    }

    @Test
    public void submitPreparesPostConnectionWithFormData() {
        FormElement form = form("http://example.com/base/");
        form.attr("action", "submit");
        form.attr("method", "POST");
        form.addElement(input("q", "text", "jsoup"));

        Connection connection = form.submit();
        assertNotNull(connection);
        assertEquals("http://example.com/base/submit", connection.request().url().toExternalForm());
        assertEquals(Connection.Method.POST, connection.request().method());
        assertEquals(1, connection.request().data().size());
        assertEquals("jsoup", connection.request().data().get(0).value());
    }

    @Test
    public void submitDefaultsToGetAndBaseUriWhenNoAction() {
        FormElement form = form("http://example.com/");
        form.attr("method", "get");

        Connection connection = form.submit();
        assertEquals("http://example.com/", connection.request().url().toExternalForm());
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void submitThrowsWhenActionCannotBeDetermined() {
        form("").submit();
    }

    @Test
    public void removeChildRemovesAssociatedControlFromElements() {
        FormElement form = form("http://example.com/");
        Element input = input("q", "text", "jsoup");
        form.appendChild(input);
        form.addElement(input);

        assertEquals(1, form.elements().size());
        input.remove();

        assertEquals(0, form.elements().size());
    }
}