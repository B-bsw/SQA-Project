package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FormElementTest {

    @Test
    public void elements_givenNewFormElement_shouldReturnEmptyElements() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Elements formChildren = form.elements();

        Assert.assertNotNull(formChildren);
        Assert.assertEquals(0, formChildren.size());
    }

    @Test
    public void addElement_givenElement_shouldBePresentInElementsListAndChain() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element input = new Element(Tag.valueOf("input"), "http://example.com");

        FormElement returnedForm = form.addElement(input);

        Assert.assertSame(form, returnedForm);
        Assert.assertEquals(1, form.elements().size());
        Assert.assertSame(input, form.elements().get(0));
    }

    @Test
    public void removeChild_givenContainedElement_shouldRemoveFromElementsList() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        form.appendChild(input);
        form.addElement(input);

        Assert.assertEquals(1, form.elements().size());

        form.removeChild(input);

        Assert.assertEquals(0, form.elements().size());
        Assert.assertEquals(0, form.children().size());
    }

    @Test
    public void submit_givenNoActionAttributeAndEmptyBaseUri_shouldThrowIllegalArgumentException() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "", attrs);

        try {
            form.submit();
            Assert.fail("Expected IllegalArgumentException when action URL cannot be determined");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.", e.getMessage());
        }
    }

    @Test
    public void submit_givenBaseUriWithoutAction_shouldUseBaseUriAndDefaultToGet() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/test", attrs);

        Connection conn = form.submit();

        Assert.assertNotNull(conn);
        Assert.assertEquals(Connection.Method.GET, conn.request().method());
        Assert.assertEquals("http://example.com/test", conn.request().url().toExternalForm());
    }

    @Test
    public void submit_givenActionAttribute_shouldResolveActionUrl() {
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/submit");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Connection conn = form.submit();

        Assert.assertEquals("http://example.com/submit", conn.request().url().toExternalForm());
        Assert.assertEquals(Connection.Method.GET, conn.request().method());
    }

    @Test
    public void submit_givenPostMethodInLowercase_shouldSetMethodToPost() {
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/login");
        attrs.put("method", "post");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Connection conn = form.submit();

        Assert.assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void submit_givenGetMethodExplicitly_shouldSetMethodToGet() {
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/search");
        attrs.put("method", "GET");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Connection conn = form.submit();

        Assert.assertEquals(Connection.Method.GET, conn.request().method());
    }

    @Test
    public void formData_givenNonSubmittableTag_shouldSkipElement() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.attr("name", "ignored");
        div.attr("value", "sample");
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenDisabledInput_shouldSkipElement() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.attr("name", "username");
        input.attr("value", "john");
        input.attr("disabled", "");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenInputWithEmptyName_shouldSkipElement() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.attr("name", "");
        input.attr("value", "john");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenStandardTextInput_shouldAddKeyVal() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.attr("name", "username");
        input.attr("value", "john_doe");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(1, data.size());
        Assert.assertEquals("username", data.get(0).key());
        Assert.assertEquals("john_doe", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithoutOptions_shouldNotAddKeyVal() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "emptySelect");
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenSelectWithoutSelectedOptions_shouldDefaultToFirstOption() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "country");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com");
        opt1.attr("value", "th");
        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com");
        opt2.attr("value", "us");

        select.appendChild(opt1);
        select.appendChild(opt2);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(1, data.size());
        Assert.assertEquals("country", data.get(0).key());
        Assert.assertEquals("th", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithSelectedOptions_shouldAddAllSelectedOptions() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "colors");
        select.attr("multiple", "multiple");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com");
        opt1.attr("value", "red");
        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com");
        opt2.attr("value", "green");
        opt2.attr("selected", "selected");
        Element opt3 = new Element(Tag.valueOf("option"), "http://example.com");
        opt3.attr("value", "blue");
        opt3.attr("selected", "");

        select.appendChild(opt1);
        select.appendChild(opt2);
        select.appendChild(opt3);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(2, data.size());
        Assert.assertEquals("colors", data.get(0).key());
        Assert.assertEquals("green", data.get(0).value());
        Assert.assertEquals("colors", data.get(1).key());
        Assert.assertEquals("blue", data.get(1).value());
    }

    @Test
    public void formData_givenUncheckedCheckboxAndRadio_shouldNotIncludeInData() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com");
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "newsletter");
        checkbox.attr("value", "yes");

        Element radio = new Element(Tag.valueOf("input"), "http://example.com");
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.attr("value", "female");

        form.addElement(checkbox);
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenCheckedCheckboxWithEmptyVal_shouldDefaultValueToOn() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com");
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "agree");
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(1, data.size());
        Assert.assertEquals("agree", data.get(0).key());
        Assert.assertEquals("on", data.get(0).value());
    }

    @Test
    public void formData_givenCheckedRadioWithExplicitValue_shouldUseRadioValue() {
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", attrs);

        Element radio = new Element(Tag.valueOf("input"), "http://example.com");
        radio.attr("type", "radio");
        radio.attr("name", "payment");
        radio.attr("value", "credit");
        radio.attr("checked", "checked");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();

        Assert.assertEquals(1, data.size());
        Assert.assertEquals("payment", data.get(0).key());
        Assert.assertEquals("credit", data.get(0).value());
    }
}