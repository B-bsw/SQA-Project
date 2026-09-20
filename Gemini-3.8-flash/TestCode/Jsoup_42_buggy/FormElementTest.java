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
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com/", attrs);

        // Act
        int size = form.elements().size();

        // Assert
        Assert.assertEquals(0, size);
    }

    @Test
    public void addElement_givenFormElement_shouldAddElementAndReturnSelf() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());
        Element child = new Element(Tag.valueOf("input"), "http://example.com/");

        // Act
        FormElement returnedForm = form.addElement(child);

        // Assert
        Assert.assertSame(form, returnedForm);
        Assert.assertEquals(1, form.elements().size());
        Assert.assertSame(child, form.elements().get(0));
    }

    @Test
    public void submit_givenExplicitAbsoluteActionAndPostMethod_shouldCreatePostConnection() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/api/save");
        attrs.put("method", "POST");
        FormElement form = new FormElement(formTag, "http://example.com/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.POST, connection.request().method());
        Assert.assertEquals("http://example.com/api/save", connection.request().url().toExternalForm());
    }

    @Test
    public void submit_givenLowercasePostMethod_shouldCreatePostConnection() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/submit");
        attrs.put("method", "post");
        FormElement form = new FormElement(formTag, "http://example.com/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test
    public void submit_givenGetMethod_shouldCreateGetConnection() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/search");
        attrs.put("method", "GET");
        FormElement form = new FormElement(formTag, "http://example.com/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void submit_givenNoMethodAttribute_shouldDefaultToGetMethod() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/search");
        FormElement form = new FormElement(formTag, "http://example.com/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void submit_givenNoActionAttribute_shouldFallbackToBaseUri() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        String baseUri = "http://example.com/form-home";
        FormElement form = new FormElement(formTag, baseUri, attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals("http://example.com/form-home", connection.request().url().toExternalForm());
    }

    @Test
    public void submit_givenRelativeAction_shouldResolveAgainstBaseUri() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("action", "process");
        FormElement form = new FormElement(formTag, "http://example.com/sub/", attrs);

        // Act
        Connection connection = form.submit();

        // Assert
        Assert.assertNotNull(connection);
        Assert.assertEquals("http://example.com/sub/process", connection.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void submit_givenNoActionAndEmptyBaseUri_shouldThrowIllegalArgumentException() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(formTag, "", attrs);

        // Act
        form.submit();
    }

    @Test
    public void formData_givenNonSubmittableElement_shouldBeIgnored() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        div.attr("name", "ignoredName");
        div.attr("value", "ignoredVal");
        form.addElement(div);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void formData_givenEmptyNameAttribute_shouldBeIgnored() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "");
        input.attr("value", "someVal");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void formData_givenStandardTextInput_shouldAccumulateValue() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "username");
        input.attr("type", "text");
        input.attr("value", "john_doe");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Connection.KeyVal pair = data.get(0);
        Assert.assertEquals("username", pair.key());
        Assert.assertEquals("john_doe", pair.value());
    }

    @Test
    public void formData_givenTextareaElement_shouldAccumulateValue() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com/");
        textarea.attr("name", "comments");
        textarea.text("Sample comment text");
        form.addElement(textarea);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Connection.KeyVal pair = data.get(0);
        Assert.assertEquals("comments", pair.key());
        Assert.assertEquals("Sample comment text", pair.value());
    }

    @Test
    public void formData_givenSelectWithoutOptions_shouldNotAddValue() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "emptySelect");
        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void formData_givenSelectWithNoSelectedOption_shouldDefaultToFirstOption() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "country");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "US");
        opt1.text("United States");
        select.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "CA");
        opt2.text("Canada");
        select.appendChild(opt2);

        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("country", data.get(0).key());
        Assert.assertEquals("US", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithExplicitlySelectedOption_shouldReturnSelectedOption() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "country");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "US");
        select.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "CA");
        opt2.attr("selected", "selected");
        select.appendChild(opt2);

        form.addElement(select);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("country", data.get(0).key());
        Assert.assertEquals("CA", data.get(0).value());
    }

    @Test
    public void formData_givenSelectWithMultipleSelectedOptions_shouldReturnAllSelected() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element select = new Element(Tag.valueOf("select"), "http://example.com/");
        select.attr("name", "colors");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "red");
        opt1.attr("selected", "");
        select.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "green");
        select.appendChild(opt2);

        Element opt3 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt3.attr("value", "blue");
        opt3.attr("selected", "");
        select.appendChild(opt3);

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
    public void formData_givenCheckboxWhenChecked_shouldIncludeValue() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com/");
        checkbox.attr("name", "subscribe");
        checkbox.attr("type", "checkbox");
        checkbox.attr("value", "yes");
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("subscribe", data.get(0).key());
        Assert.assertEquals("yes", data.get(0).value());
    }

    @Test
    public void formData_givenCheckboxWhenUnchecked_shouldBeExcluded() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com/");
        checkbox.attr("name", "subscribe");
        checkbox.attr("type", "checkbox");
        checkbox.attr("value", "yes");
        form.addElement(checkbox);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void formData_givenRadioWhenChecked_shouldIncludeValue() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element radio = new Element(Tag.valueOf("input"), "http://example.com/");
        radio.attr("name", "gender");
        radio.attr("type", "radio");
        radio.attr("value", "female");
        radio.attr("checked", "");
        form.addElement(radio);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("gender", data.get(0).key());
        Assert.assertEquals("female", data.get(0).value());
    }

    @Test
    public void formData_givenRadioWhenUnchecked_shouldBeExcluded() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element radio = new Element(Tag.valueOf("input"), "http://example.com/");
        radio.attr("name", "gender");
        radio.attr("type", "radio");
        radio.attr("value", "female");
        form.addElement(radio);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertTrue(data.isEmpty());
    }

    @Test
    public void formData_givenMixedCaseTypeAttributes_shouldHandleCorrectly() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element cb = new Element(Tag.valueOf("input"), "http://example.com/");
        cb.attr("name", "c1");
        cb.attr("type", "CHECKBOX");
        cb.attr("checked", "checked");
        cb.attr("value", "on");

        Element rd = new Element(Tag.valueOf("input"), "http://example.com/");
        rd.attr("name", "r1");
        rd.attr("type", "Radio");
        rd.attr("value", "opt");

        form.addElement(cb);
        form.addElement(rd);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("c1", data.get(0).key());
        Assert.assertEquals("on", data.get(0).value());
    }

    @Test
    public void formData_givenMultipleDifferentElements_shouldPreserveOrder() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "user");
        input.attr("value", "alice");

        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com/");
        checkbox.attr("name", "agree");
        checkbox.attr("type", "checkbox");
        checkbox.attr("checked", "checked");
        checkbox.attr("value", "true");

        form.addElement(input);
        form.addElement(checkbox);

        // Act
        List<Connection.KeyVal> data = form.formData();

        // Assert
        Assert.assertEquals(2, data.size());
        Assert.assertEquals("user", data.get(0).key());
        Assert.assertEquals("alice", data.get(0).value());
        Assert.assertEquals("agree", data.get(1).key());
        Assert.assertEquals("true", data.get(1).value());
    }

    @Test
    public void formData_modifyingReturnedList_shouldNotAffectInternalState() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "q");
        input.attr("value", "jsoup");
        form.addElement(input);

        // Act
        List<Connection.KeyVal> dataCopy = form.formData();
        dataCopy.clear();

        // Assert
        List<Connection.KeyVal> freshData = form.formData();
        Assert.assertEquals(1, freshData.size());
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        // Act & Assert
        Assert.assertTrue(form.equals(form));
    }

    @Test
    public void equals_givenNullOrDifferentType_shouldReturnFalse() {
        // Arrange
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com/", new Attributes());

        // Act & Assert
        Assert.assertFalse(form.equals(null));
        Assert.assertFalse(form.equals("not_a_form"));
    }
}