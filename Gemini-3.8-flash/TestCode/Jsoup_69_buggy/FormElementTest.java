package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FormElementTest {

    @Test
    public void elements_givenNewFormElement_shouldReturnEmptyElements() {
        // Arrange
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", attrs);

        // Act
        int size = form.elements().size();

        // Assert
        Assert.assertEquals(0, size);
    }

    @Test
    public void addElement_givenFormElement_shouldAddElementAndReturnSelf() {
        // Arrange
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", attrs);
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");

        // Act
        FormElement returnedForm = form.addElement(input);

        // Assert
        Assert.assertSame(form, returnedForm);
        Assert.assertEquals(1, form.elements().size());
        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void formData_givenNonSubmittableElement_shouldBeIgnored() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        div.attr("name", "divName");
        div.attr("value", "divVal");
        form.addElement(div);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenDisabledInput_shouldBeIgnored() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "testName");
        input.attr("value", "testVal");
        input.attr("disabled", "disabled");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenInputWithoutName_shouldBeIgnored() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("value", "noNameVal");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenStandardTextInput_shouldAccumulateValue() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "username");
        input.attr("value", "john_doe");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("username", data.get(0).key());
        Assert.assertEquals("john_doe", data.get(0).value());
    }

    @Test
    public void formData_givenTextarea_shouldAccumulateValue() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com/");
        textarea.attr("name", "comment");
        textarea.text("Hello World");
        form.addElement(textarea);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("comment", data.get(0).key());
        Assert.assertEquals("Hello World", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithSelectedOption_shouldAccumulateSelectedOption() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "city");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "BKK");
        opt1.text("Bangkok");

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "CNX");
        opt2.attr("selected", "selected");
        opt2.text("Chiang Mai");

        select.appendChild(opt1);
        select.appendChild(opt2);
        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("city", data.get(0).key());
        Assert.assertEquals("CNX", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithMultipleSelectedOptions_shouldAccumulateAllSelectedOptions() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "colors");
        select.attr("multiple", "multiple");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "red");
        opt1.attr("selected", "selected");

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "blue");
        opt2.attr("selected", "selected");

        select.appendChild(opt1);
        select.appendChild(opt2);
        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(2, data.size());
        Assert.assertEquals("colors", data.get(0).key());
        Assert.assertEquals("red", data.get(0).value());
        Assert.assertEquals("colors", data.get(1).key());
        Assert.assertEquals("blue", data.get(1).value());
    }

    @Test
    public void formData_givenSelectWithoutExplicitSelectedOption_shouldFallbackToFirstOption() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "country");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "TH");

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "JP");

        select.appendChild(opt1);
        select.appendChild(opt2);
        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("country", data.get(0).key());
        Assert.assertEquals("TH", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithNoOptions_shouldNotAccumulateData() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "emptySelect");
        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenUncheckedCheckbox_shouldNotAccumulateData() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com/");
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "subscribe");
        checkbox.attr("value", "yes");
        form.addElement(checkbox);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenCheckedCheckboxWithValue_shouldAccumulateValue() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com/");
        checkbox.attr("type", "CHECKBOX");
        checkbox.attr("name", "newsletter");
        checkbox.attr("value", "weekly");
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("newsletter", data.get(0).key());
        Assert.assertEquals("weekly", data.get(0).value());
    }

    @Test
    public void formData_givenCheckedCheckboxWithoutValue_shouldDefaultToOn() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com/");
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "terms");
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("terms", data.get(0).key());
        Assert.assertEquals("on", data.get(0).value());
    }

    @Test
    public void formData_givenUncheckedRadio_shouldNotAccumulateData() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "http://example.com/");
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.attr("value", "female");
        form.addElement(radio);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(0, data.size());
    }

    @Test
    public void formData_givenCheckedRadioWithValue_shouldAccumulateValue() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "http://example.com/");
        radio.attr("type", "RADIO");
        radio.attr("name", "gender");
        radio.attr("value", "male");
        radio.attr("checked", "checked");
        form.addElement(radio);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("gender", data.get(0).key());
        Assert.assertEquals("male", data.get(0).value());
    }

    @Test
    public void formData_givenCheckedRadioWithoutValue_shouldDefaultToOn() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "http://example.com/");
        radio.attr("type", "radio");
        radio.attr("name", "agree");
        radio.attr("checked", "checked");
        form.addElement(radio);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("agree", data.get(0).key());
        Assert.assertEquals("on", data.get(0).value());
    }

    @Test
    public void formData_givenReturnedListModified_shouldNotAffectOriginalFormElement() {
        // Arrange
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "original");
        input.attr("value", "data");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> data = form.formData();
        data.clear();

        // Assert
        Assert.assertEquals(1, form.formData().size());
    }

    @Test
    public void submit_givenExplicitActionAndPostMethod_shouldConfigureConnectionCorrectly() {
        // Arrange
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/api/submit");
        attrs.put("method", "post");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", attrs);

        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "token");
        input.attr("value", "secret");
        form.addElement(input);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.POST, connection.request().method());
        Assert.assertEquals("http://example.com/api/submit", connection.request().url().toExternalForm());
        Assert.assertEquals(1, connection.request().data().size());
        Assert.assertEquals("token", connection.request().data().iterator().next().key());
        Assert.assertEquals("secret", connection.request().data().iterator().next().value());
    }

    @Test
    public void submit_givenNoActionAttribute_shouldFallbackToBaseUri() {
        // Arrange
        Attributes attrs = new Attributes();
        attrs.put("method", "GET");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/search", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.GET, connection.request().method());
        Assert.assertEquals("http://example.com/search", connection.request().url().toExternalForm());
    }

    @Test
    public void submit_givenRelativeActionWithBaseUri_shouldResolveAbsoluteAction() {
        // Arrange
        Attributes attrs = new Attributes();
        attrs.put("action", "process.php");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/sub/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals("http://example.com/sub/process.php", connection.request().url().toExternalForm());
    }

    @Test
    public void submit_givenMissingMethodAttribute_shouldDefaultToGetMethod() {
        // Arrange
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/action");
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void submit_givenEmptyActionAndEmptyBaseUri_shouldThrowIllegalArgumentException() {
        // Arrange
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(Tag.valueOf("form"), "", attrs);

        // Act & Assert
        form.submit();
    }
}