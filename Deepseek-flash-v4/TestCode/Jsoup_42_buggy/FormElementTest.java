package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {
    private FormElement form;
    private static final String BASE_URI = "http://example.com/";

    @Before
    public void setUp() {
        form = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
    }

    @After
    public void tearDown() {
        form = null;
    }

    @Test
    public void testElementsInitiallyEmpty() {
        Elements result = form.elements();
        assertNotNull("Elements list should not be null", result);
        assertEquals("Initial elements list should be empty", 0, result.size());
    }

    @Test
    public void testAddElementReturnsThis() {
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        FormElement returned = form.addElement(input);
        assertSame("addElement should return the form itself", form, returned);
        assertEquals("Form should contain exactly one element", 1, form.elements().size());
        assertEquals("Form should contain the added element", input, form.elements().get(0));
    }

    @Test
    public void testAddMultipleElements() {
        form.addElement(new Element(Tag.valueOf("input"), BASE_URI));
        form.addElement(new Element(Tag.valueOf("select"), BASE_URI));
        form.addElement(new Element(Tag.valueOf("textarea"), BASE_URI));
        assertEquals("Form should contain three elements", 3, form.elements().size());
    }

    @Test
    public void testSubmitWithNoActionUsesBaseUri() {
        form.attr("method", "get");
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "q");
        input.val("test");
        form.addElement(input);

        Connection con = form.submit();
        assertNotNull("Connection should not be null", con);
        assertEquals("Should use base URI as action", BASE_URI, con.request().url().toString());
        assertEquals("Default method should be GET", Connection.Method.GET, con.request().method());
    }

    @Test
    public void testSubmitWithPostAction() {
        form.attr("action", "submit");
        form.attr("method", "POST");
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "data");
        input.val("value");
        form.addElement(input);

        Connection con = form.submit();
        assertEquals("Action should be resolved to absolute URL", BASE_URI + "submit", con.request().url().toExternalForm());
        assertEquals("Method should be POST", Connection.Method.POST, con.request().method());
        // Note: formData is verified separately
    }

    @Test
    public void testSubmitWithGetMethod() {
        form.attr("action", "search");
        form.attr("method", "get");
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "q");
        input.val("query");
        form.addElement(input);

        Connection con = form.submit();
        assertEquals("Method should be GET", Connection.Method.GET, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitThrowsOnNoActionAndNoBaseUri() {
        FormElement formWithoutBase = new FormElement(Tag.valueOf("form"), "", new Attributes());
        formWithoutBase.submit();
    }

    @Test
    public void testFormDataWithSingleTextInput() {
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "username");
        input.val("johndoe");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should have one data item", 1, data.size());
        assertEquals("Username key should match", "username", data.get(0).key());
        assertEquals("Username value should match", "johndoe", data.get(0).value());
    }

    @Test
    public void testFormDataWithMultipleInputs() {
        Element input1 = new Element(Tag.valueOf("input"), BASE_URI);
        input1.attr("name", "first");
        input1.val("value1");
        form.addElement(input1);

        Element input2 = new Element(Tag.valueOf("input"), BASE_URI);
        input2.attr("name", "second");
        input2.val("value2");
        form.addElement(input2);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should have two data items", 2, data.size());
        assertEquals("First key", "first", data.get(0).key());
        assertEquals("Second key", "second", data.get(1).key());
    }

    @Test
    public void testFormDataSkipsEmptyName() {
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "");
        input.val("should not appear");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should skip elements with empty name", 0, data.size());
    }

    @Test
    public void testFormDataSkipsNonSubmittableElements() {
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        div.attr("name", "notsubmitted");
        div.val("value");
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should skip non-submittable elements", 0, data.size());
    }

    @Test
    public void testFormDataWithSingleSelect() {
        Element select = new Element(Tag.valueOf("select"), BASE_URI);
        select.attr("name", "menu");
        Element option1 = new Element(Tag.valueOf("option"), BASE_URI);
        option1.val("opt1");
        option1.attr("selected", "");
        Element option2 = new Element(Tag.valueOf("option"), BASE_URI);
        option2.val("opt2");
        select.appendChild(option1);
        select.appendChild(option2);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should have one data item for selected option", 1, data.size());
        assertEquals("Should pick first selected option value", "opt1", data.get(0).value());
    }

    @Test
    public void testFormDataWithSelectNoSelection() {
        Element select = new Element(Tag.valueOf("select"), BASE_URI);
        select.attr("name", "menu");
        Element option1 = new Element(Tag.valueOf("option"), BASE_URI);
        option1.val("opt1");
        Element option2 = new Element(Tag.valueOf("option"), BASE_URI);
        option2.val("opt2");
        select.appendChild(option1);
        select.appendChild(option2);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should have one data item", 1, data.size());
        assertEquals("Should default to first option", "opt1", data.get(0).value());
    }

    @Test
    public void testFormDataWithCheckboxChecked() {
        Element cb = new Element(Tag.valueOf("input"), BASE_URI);
        cb.attr("type", "checkbox");
        cb.attr("name", "subscribe");
        cb.attr("checked", "");
        cb.val("yes");
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should include checked checkbox", 1, data.size());
        assertEquals("Should include checkbox value", "yes", data.get(0).value());
    }

    @Test
    public void testFormDataWithCheckboxUnchecked() {
        Element cb = new Element(Tag.valueOf("input"), BASE_URI);
        cb.attr("type", "checkbox");
        cb.attr("name", "subscribe");
        cb.val("yes");
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should not include unchecked checkbox", 0, data.size());
    }

    @Test
    public void testFormDataWithRadioChecked() {
        Element radio = new Element(Tag.valueOf("input"), BASE_URI);
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.attr("checked", "");
        radio.val("male");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should include checked radio", 1, data.size());
        assertEquals("Should include radio value", "male", data.get(0).value());
    }

    @Test
    public void testFormDataWithRadioUnchecked() {
        Element radio = new Element(Tag.valueOf("input"), BASE_URI);
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.val("female");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should not include unchecked radio", 0, data.size());
    }

    @Test
    public void testFormDataWithTextArea() {
        Element textarea = new Element(Tag.valueOf("textarea"), BASE_URI);
        textarea.attr("name", "message");
        textarea.val("hello world");
        form.addElement(textarea);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should include textarea", 1, data.size());
        assertEquals("Should include textarea value", "hello world", data.get(0).value());
    }

    @Test
    public void testFormDataWithTypeCaseInsensitiveCheckbox() {
        Element cb = new Element(Tag.valueOf("input"), BASE_URI);
        cb.attr("type", "CheckBox");
        cb.attr("name", "caseCheck");
        cb.attr("checked", "");
        cb.val("true");
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should handle case-insensitive type", 1, data.size());
    }

    @Test
    public void testFormDataReturnsCopy() {
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "key");
        input.val("value");
        form.addElement(input);

        List<Connection.KeyVal> data1 = form.formData();
        data1.clear();
        List<Connection.KeyVal> data2 = form.formData();
        assertEquals("Form data should be a copy", 1, data2.size());
    }

    @Test
    public void testSubmitDataIncluded() {
        form.attr("action", "submit");
        form.attr("method", "post");
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "param");
        input.val("value");
        form.addElement(input);

        Connection con = form.submit();
        assertEquals("Form data should be included in connection", 1, con.request().data().size());
        assertEquals("Form data key", "param", con.request().data().get(0).key());
        assertEquals("Form data value", "value", con.request().data().get(0).value());
    }

    @Test
    public void testEquals() {
        FormElement other = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        other.attr("id", "test");
        form.attr("id", "test");
        assertTrue("Same content should be equal", form.equals(other));
        assertTrue("Should be equal to itself", form.equals(form));
    }

    @Test
    public void testNotEqualsDifferentContent() {
        FormElement other = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        other.attr("id", "test1");
        form.attr("id", "test2");
        assertFalse("Different content should not be equal", form.equals(other));
        assertFalse("Should not equal null", form.equals(null));
        assertFalse("Should not equal different type", form.equals(new Object()));
    }

    @Test
    public void testFormDataWithSelectMultipleSelectedOptions() {
        Element select = new Element(Tag.valueOf("select"), BASE_URI);
        select.attr("name", "multi");
        Element option1 = new Element(Tag.valueOf("option"), BASE_URI);
        option1.val("a");
        option1.attr("selected", "");
        Element option2 = new Element(Tag.valueOf("option"), BASE_URI);
        option2.val("b");
        option2.attr("selected", "");
        select.appendChild(option1);
        select.appendChild(option2);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals("Should include both selected options", 2, data.size());
        assertEquals("First selected", "a", data.get(0).value());
        assertEquals("Second selected", "b", data.get(1).value());
    }

    @Test
    public void testSubmitWithUpperPost() {
        form.attr("action", "submit");
        form.attr("method", "POST");
        Element input = new Element(Tag.valueOf("input"), BASE_URI);
        input.attr("name", "x");
        input.val("y");
        form.addElement(input);

        Connection con = form.submit();
        assertEquals("POST should be recognized case-sensitively", Connection.Method.POST, con.request().method());
    }
}