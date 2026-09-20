package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

public class JsonWriteContextTest {

    @Test
    public void createRootContext_givenDeprecatedNoArg_shouldInitializeCorrectly() {
        // Arrange & Act
        JsonWriteContext root = JsonWriteContext.createRootContext();

        // Assert
        Assert.assertNotNull(root);
        Assert.assertTrue(root.inRoot());
        Assert.assertFalse(root.inArray());
        Assert.assertFalse(root.inObject());
        Assert.assertNull(root.getParent());
        Assert.assertNull(root.getDupDetector());
        Assert.assertNull(root.getCurrentName());
        Assert.assertNull(root.getCurrentValue());
        Assert.assertEquals(-1, root.getEntryCount());
    }

    @Test
    public void createRootContext_givenDupDetector_shouldRetainDupDetector() {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);

        // Act
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        // Assert
        Assert.assertNotNull(root);
        Assert.assertSame(dd, root.getDupDetector());
        Assert.assertTrue(root.inRoot());
        Assert.assertNull(root.getParent());
    }

    @Test
    public void withDupDetector_givenNewDetector_shouldUpdateAndReturnSelf() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);

        // Act
        JsonWriteContext result = root.withDupDetector(dd);

        // Assert
        Assert.assertSame(root, result);
        Assert.assertSame(dd, root.getDupDetector());
    }

    @Test
    public void currentValues_givenValueObject_shouldGetAndSetCorrectly() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        Object testObj = new Object();

        // Act
        root.setCurrentValue(testObj);

        // Assert
        Assert.assertSame(testObj, root.getCurrentValue());
    }

    @Test
    public void currentValues_givenNullValue_shouldAllowNull() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        root.setCurrentValue("Sample");

        // Act
        root.setCurrentValue(null);

        // Assert
        Assert.assertNull(root.getCurrentValue());
    }

    @Test
    public void createChildArrayContext_givenNullChildAndNoDups_shouldCreateNewArrayContext() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();

        // Act
        JsonWriteContext arrayContext = root.createChildArrayContext();

        // Assert
        Assert.assertNotNull(arrayContext);
        Assert.assertTrue(arrayContext.inArray());
        Assert.assertSame(root, arrayContext.getParent());
        Assert.assertNull(arrayContext.getDupDetector());
        Assert.assertEquals(-1, arrayContext.getEntryCount());
    }

    @Test
    public void createChildArrayContext_givenDupDetector_shouldCreateChildDetector() {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        // Act
        JsonWriteContext arrayContext = root.createChildArrayContext();

        // Assert
        Assert.assertNotNull(arrayContext.getDupDetector());
        Assert.assertNotSame(dd, arrayContext.getDupDetector());
    }

    @Test
    public void createChildArrayContext_givenExistingChildSlot_shouldReuseAndResetChild() throws JsonProcessingException {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext firstChild = root.createChildArrayContext();
        firstChild.setCurrentValue("value");
        firstChild.writeValue();

        // Act
        JsonWriteContext reusedChild = root.createChildArrayContext();

        // Assert
        Assert.assertSame(firstChild, reusedChild);
        Assert.assertTrue(reusedChild.inArray());
        Assert.assertEquals(-1, reusedChild.getEntryCount());
        Assert.assertNull(reusedChild.getCurrentValue());
        Assert.assertNull(reusedChild.getCurrentName());
    }

    @Test
    public void createChildObjectContext_givenNullChildAndNoDups_shouldCreateNewObjectContext() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();

        // Act
        JsonWriteContext objectContext = root.createChildObjectContext();

        // Assert
        Assert.assertNotNull(objectContext);
        Assert.assertTrue(objectContext.inObject());
        Assert.assertSame(root, objectContext.getParent());
        Assert.assertNull(objectContext.getDupDetector());
        Assert.assertEquals(-1, objectContext.getEntryCount());
    }

    @Test
    public void createChildObjectContext_givenDupDetector_shouldCreateChildDetector() {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        // Act
        JsonWriteContext objectContext = root.createChildObjectContext();

        // Assert
        Assert.assertNotNull(objectContext.getDupDetector());
        Assert.assertNotSame(dd, objectContext.getDupDetector());
    }

    @Test
    public void createChildObjectContext_givenExistingChildSlot_shouldReuseAndResetChild() throws JsonProcessingException {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext firstChild = root.createChildObjectContext();
        firstChild.setCurrentValue("temp");
        firstChild.writeFieldName("prop");
        firstChild.writeValue();

        // Act
        JsonWriteContext reusedChild = root.createChildObjectContext();

        // Assert
        Assert.assertSame(firstChild, reusedChild);
        Assert.assertTrue(reusedChild.inObject());
        Assert.assertEquals(-1, reusedChild.getEntryCount());
        Assert.assertNull(reusedChild.getCurrentValue());
        Assert.assertNull(reusedChild.getCurrentName());
    }

    @Test
    public void writeFieldName_givenFirstFieldInObject_shouldReturnOkAsIs() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();

        // Act
        int status = objContext.writeFieldName("field1");

        // Assert
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        Assert.assertEquals("field1", objContext.getCurrentName());
    }

    @Test
    public void writeFieldName_givenSecondFieldAfterValue_shouldReturnOkAfterComma() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("field1");
        objContext.writeValue();

        // Act
        int status = objContext.writeFieldName("field2");

        // Assert
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
        Assert.assertEquals("field2", objContext.getCurrentName());
    }

    @Test
    public void writeFieldName_givenConsecutiveCallsWithoutValue_shouldReturnExpectValue() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("field1");

        // Act
        int status = objContext.writeFieldName("field2");

        // Assert
        Assert.assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, status);
        Assert.assertEquals("field1", objContext.getCurrentName());
    }

    @Test
    public void writeFieldName_givenDuplicateFieldAndDupsEnabled_shouldThrowJsonGenerationException() throws JsonProcessingException {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("duplicateField");
        objContext.writeValue();

        // Act & Assert
        try {
            objContext.writeFieldName("duplicateField");
            Assert.fail("Expected JsonGenerationException for duplicate field");
        } catch (JsonGenerationException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("duplicateField") >= 0);
        }
    }

    @Test
    public void writeFieldName_givenDuplicateFieldAndNoDupDetector_shouldAllowDuplicate() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("dup");
        objContext.writeValue();

        // Act
        int status = objContext.writeFieldName("dup");

        // Assert
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
        Assert.assertEquals("dup", objContext.getCurrentName());
    }

    @Test
    public void writeValue_givenRootContext_shouldHandleFirstAndSubsequentValues() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();

        // Act 1: First value in root
        int status1 = root.writeValue();
        // Assert 1
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        Assert.assertEquals(0, root.getCurrentIndex());

        // Act 2: Second value in root
        int status2 = root.writeValue();
        // Assert 2
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status2);
        Assert.assertEquals(1, root.getCurrentIndex());
    }

    @Test
    public void writeValue_givenArrayContext_shouldHandleFirstAndSubsequentValues() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayContext = root.createChildArrayContext();

        // Act 1: First value in array
        int status1 = arrayContext.writeValue();
        // Assert 1
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        Assert.assertEquals(0, arrayContext.getCurrentIndex());

        // Act 2: Second value in array
        int status2 = arrayContext.writeValue();
        // Assert 2
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status2);
        Assert.assertEquals(1, arrayContext.getCurrentIndex());
    }

    @Test
    public void writeValue_givenObjectContext_shouldReturnOkAfterColonAndResetGotName() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("key");

        // Act
        int status = objContext.writeValue();

        // Assert
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, status);
        Assert.assertEquals(0, objContext.getCurrentIndex());

        // Verify gotName was cleared by writing another field successfully
        int nextFieldStatus = objContext.writeFieldName("nextKey");
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, nextFieldStatus);
    }

    @Test
    public void toString_givenRootContext_shouldReturnRootSlash() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();

        // Act
        String result = root.toString();

        // Assert
        Assert.assertEquals("/", result);
    }

    @Test
    public void toString_givenArrayContext_shouldDisplayCurrentIndex() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext arrayContext = root.createChildArrayContext();

        // Act 1: Before any values written
        String initialStr = arrayContext.toString();
        // Assert 1
        Assert.assertEquals("[0]", initialStr);

        // Act 2: After first value written
        arrayContext.writeValue();
        String afterOneStr = arrayContext.toString();
        // Assert 2
        Assert.assertEquals("[0]", afterOneStr);

        // Act 3: After second value written
        arrayContext.writeValue();
        String afterTwoStr = arrayContext.toString();
        // Assert 3
        Assert.assertEquals("[1]", afterTwoStr);
    }

    @Test
    public void toString_givenObjectContextWithoutFieldName_shouldDisplayQuestionMark() {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();

        // Act
        String result = objContext.toString();

        // Assert
        Assert.assertEquals("{?}", result);
    }

    @Test
    public void toString_givenObjectContextWithFieldName_shouldDisplayQuotedName() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("myProperty");

        // Act
        String result = objContext.toString();

        // Assert
        Assert.assertEquals("{\"myProperty\"}", result);
    }

    @Test
    public void reset_givenContextWithDups_shouldResetDupDetector() throws JsonProcessingException {
        // Arrange
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("attr");
        objContext.writeValue();

        // Act
        objContext.reset(JsonWriteContext.TYPE_OBJECT);

        // Assert
        // After reset on dup detector, the same field name can be used again without exception
        int status = objContext.writeFieldName("attr");
        Assert.assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
    }

    @Test
    public void reset_givenContextWithoutDups_shouldResetStateSafely() throws JsonProcessingException {
        // Arrange
        JsonWriteContext root = JsonWriteContext.createRootContext();
        JsonWriteContext objContext = root.createChildObjectContext();
        objContext.writeFieldName("prop");
        objContext.setCurrentValue("value");
        objContext.writeValue();

        // Act
        JsonWriteContext resetResult = objContext.reset(JsonWriteContext.TYPE_ARRAY);

        // Assert
        Assert.assertSame(objContext, resetResult);
        Assert.assertTrue(objContext.inArray());
        Assert.assertEquals(-1, objContext.getEntryCount());
        Assert.assertNull(objContext.getCurrentName());
        Assert.assertNull(objContext.getCurrentValue());
    }
}