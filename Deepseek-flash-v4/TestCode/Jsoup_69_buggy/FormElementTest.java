package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {
    private FormElement form;
    private Element input1;
    private Element input2;
    private Element select1;
    private Element checkbox;

    @Before
    public void setUp() {
        form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        input1 = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input1.attr("name", "username");
        input1.val("john");
        input2 = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input2.attr("name", "password");
        input2.val("secret");
        select1 = new Element(Tag.valueOf("select"), "http://example.com", new Attributes());
        select1.attr("name", "gender");
        Element option1 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option1.val("male");
        option1.attr("selected", "selected");
        select1.appendChild(option1);
        Element option2 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option2.val("female");
        select1.appendChild(option2);
        checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        checkbox.attr("name", "subscribe");
        checkbox.attr("type", "checkbox");
        checkbox.val("yes");
        checkbox.attr("checked", "checked");
    }

    @Test
    public void testAddElementReturnsThis() {
        assertSame(form, form.addElement(input1));
    }

    @Test
    public void testAddElementAddsToElements() {
        form.addElement(input1);
        form.addElement(input2);
        assertEquals(2, form.elements().size());
        assertTrue(form.elements().contains(input1));
        assertTrue(form.elements().contains(input2));
    }

    @Test
    public void testElementsReturnsEmptyListOnNewForm() {
        assertNotNull(form.elements());
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testFormDataWithMultipleInputs() {
        form.addElement(input1);
        form.addElement(input2);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("john", data.get(0).value());
        assertEquals("password", data.get(1).key());
        assertEquals("secret", data.get(1).value());
    }

    @Test
    public void testFormDataEmptyWhenNoElements() {
        List<Connection.KeyVal> data = form.formData();
        assertNotNull(data);
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormDataSkipsDisabledInput() {
        input1.attr("disabled", "disabled");
        form.addElement(input1);
        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormDataSkipsInputWithoutName() {
        input1.attr("name", "");
        form.addElement(input1);
        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormDataSelectWithSelectedOption() {
        form.addElement(select1);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("gender", data.get(0).key());
        assertEquals("male", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithoutSelectedOptions() {
        Element option = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option.val("female");
        select1.remove();
        Element select2 = new Element(Tag.valueOf("select"), "http://example.com", new Attributes());
        select2.attr("name", "gender2");
        Element option3 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option3.val("female");
        select2.appendChild(option3);
        form.addElement(select2);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("gender2", data.get(0).key());
        assertEquals("female", data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxWithChecked() {
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("subscribe", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxWithoutChecked() {
        checkbox.removeAttr("checked");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormDataCheckboxDefaultOnWhenNoValue() {
        Element cb = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        cb.attr("name", "terms");
        cb.attr("type", "checkbox");
        cb.attr("checked", "checked");
        form.addElement(cb);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("terms", data.get(0).key());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testFormDataIgnoresNonFormElements() {
        Element br = new Element(Tag.valueOf("br"), "http://example.com", new Attributes());
        form.addElement(br);
        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testSubmitWithPostMethod() {
        form.attr("method", "POST");
        form.attr("action", "/submit");
        form.addElement(input1);
        Connection connection = form.submit();
        assertNotNull(connection);
        assertEquals(Connection.Method.POST, connection.request().method());
        assertEquals("http://example.com/submit", connection.request().url().toString());
    }

    @Test
    public void testSubmitWithGetMethodDefault() {
        form.attr("method", "GET");
        form.addElement(input1);
        Connection connection = form.submit();
        assertNotNull(connection);
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitWithoutActionAndNoBaseUri() {
        FormElement form2 = new FormElement(Tag.valueOf("form"), "   ", new Attributes());
        form2.submit();
    }

    @Test
    public void testSubmitWithBaseUriAction() {
        form.addElement(input1);
        Connection connection = form.submit();
        assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void testFormDataWithMixedTypes() {
        form.addElement(input1);
        form.addElement(select1);
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
    }

    @Test
    public void testFormDataWithCheckboxNoValueUsesOn() {
        Element cb = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        cb.attr("name", "opt");
        cb.attr("type", "checkbox");
        cb.attr("checked", "checked");
        form.addElement(cb);
        List<Connection.KeyVal> data = form.formData();
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testFormDataTextInput() {
        form.addElement(input1);
        List<Connection.KeyVal> data = form.formData();
        assertEquals("john", data.get(0).value());
    }
}