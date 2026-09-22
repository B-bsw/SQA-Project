package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonToken;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JsonTreeReaderTest {

  @Test
  public void beginArray_givenJsonArray_shouldOpenArrayAndResetIndex() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("first"));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();

    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("$[0]", reader.getPath());
    Assert.assertEquals("first", reader.nextString());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void beginArray_givenNonArrayElement_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("not an array"));
    reader.beginArray();
  }

  @Test
  public void endArray_givenEndOfArray_shouldCloseArrayAndIncrementPathIndex() throws IOException {
    JsonArray outer = new JsonArray();
    JsonArray inner = new JsonArray();
    outer.add(inner);
    outer.add(new JsonPrimitive("after"));

    JsonTreeReader reader = new JsonTreeReader(outer);
    reader.beginArray();
    reader.beginArray();
    Assert.assertEquals(JsonToken.END_ARRAY, reader.peek());
    reader.endArray();

    Assert.assertEquals("$[1]", reader.getPath());
    Assert.assertEquals("after", reader.nextString());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_givenArrayWithRemainingElements_shouldThrowIllegalStateException() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive(1));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    reader.endArray();
  }

  @Test
  public void beginObject_givenJsonObject_shouldOpenObject() throws IOException {
    JsonObject object = new JsonObject();
    object.addProperty("key", "val");
    JsonTreeReader reader = new JsonTreeReader(object);

    reader.beginObject();

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("$.", reader.getPath());
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("$.key", reader.getPath());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void beginObject_givenNonObjectElement_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("value"));
    reader.beginObject();
  }

  @Test
  public void endObject_givenEmptyObject_shouldCloseObjectAndAdvanceIndex() throws IOException {
    JsonObject root = new JsonObject();
    root.add("empty", new JsonObject());
    JsonTreeReader reader = new JsonTreeReader(root);

    reader.beginObject();
    Assert.assertEquals("empty", reader.nextName());
    reader.beginObject();
    Assert.assertEquals(JsonToken.END_OBJECT, reader.peek());
    reader.endObject();
    reader.endObject();

    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_givenObjectWithRemainingKeys_shouldThrowIllegalStateException() throws IOException {
    JsonObject object = new JsonObject();
    object.addProperty("k", "v");
    JsonTreeReader reader = new JsonTreeReader(object);

    reader.beginObject();
    reader.endObject();
  }

  @Test
  public void hasNext_givenArrayWithElements_shouldReturnTrueUntilEnd() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive(10));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    Assert.assertTrue(reader.hasNext());
    reader.nextInt();
    Assert.assertFalse(reader.hasNext());
    reader.endArray();
  }

  @Test
  public void hasNext_givenObjectWithElements_shouldReturnTrueUntilEnd() throws IOException {
    JsonObject object = new JsonObject();
    object.addProperty("k", 100);
    JsonTreeReader reader = new JsonTreeReader(object);

    reader.beginObject();
    Assert.assertTrue(reader.hasNext());
    reader.nextName();
    Assert.assertTrue(reader.hasNext());
    reader.nextInt();
    Assert.assertFalse(reader.hasNext());
    reader.endObject();
  }

  @Test
  public void peek_givenPrimitiveTypes_shouldReturnCorrectTokens() throws IOException {
    JsonTreeReader readerString = new JsonTreeReader(new JsonPrimitive("text"));
    Assert.assertEquals(JsonToken.STRING, readerString.peek());

    JsonTreeReader readerBoolean = new JsonTreeReader(new JsonPrimitive(Boolean.TRUE));
    Assert.assertEquals(JsonToken.BOOLEAN, readerBoolean.peek());

    JsonTreeReader readerNumber = new JsonTreeReader(new JsonPrimitive(Integer.valueOf(123)));
    Assert.assertEquals(JsonToken.NUMBER, readerNumber.peek());

    JsonTreeReader readerNull = new JsonTreeReader(JsonNull.INSTANCE);
    Assert.assertEquals(JsonToken.NULL, readerNull.peek());

    JsonTreeReader readerArray = new JsonTreeReader(new JsonArray());
    Assert.assertEquals(JsonToken.BEGIN_ARRAY, readerArray.peek());

    JsonObject emptyObj = new JsonObject();
    JsonTreeReader readerObj = new JsonTreeReader(emptyObj);
    Assert.assertEquals(JsonToken.BEGIN_OBJECT, readerObj.peek());
  }

  @Test
  public void peek_givenEmptyStack_shouldReturnEndDocument() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("single"));
    reader.nextString();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void peek_givenClosedReader_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("a"));
    reader.close();
    reader.peek();
  }

  @Test
  public void nextName_givenValidName_shouldReturnKeyAndExposeValue() throws IOException {
    JsonObject object = new JsonObject();
    object.addProperty("myKey", "myVal");
    JsonTreeReader reader = new JsonTreeReader(object);

    reader.beginObject();
    Assert.assertEquals("myKey", reader.nextName());
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("myVal", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void nextName_givenValueInsteadOfName_shouldThrowIllegalStateException() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("item"));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    reader.nextName();
  }

  @Test
  public void nextString_givenStringOrNumberPrimitive_shouldReturnStringValue() throws IOException {
    JsonTreeReader readerStr = new JsonTreeReader(new JsonPrimitive("hello"));
    Assert.assertEquals("hello", readerStr.nextString());

    JsonTreeReader readerNum = new JsonTreeReader(new JsonPrimitive(Integer.valueOf(42)));
    Assert.assertEquals("42", readerNum.nextString());
  }

  @Test(expected = IllegalStateException.class)
  public void nextString_givenBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Boolean.TRUE));
    reader.nextString();
  }

  @Test
  public void nextBoolean_givenBooleanPrimitive_shouldReturnBoolean() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Boolean.FALSE));
    Assert.assertFalse(reader.nextBoolean());
  }

  @Test(expected = IllegalStateException.class)
  public void nextBoolean_givenStringPrimitive_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("true"));
    reader.nextBoolean();
  }

  @Test
  public void nextNull_givenJsonNull_shouldConsumeNull() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(JsonNull.INSTANCE);
    reader.nextNull();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void nextNull_givenNotNull_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(0));
    reader.nextNull();
  }

  @Test
  public void nextDouble_givenValidDoubleAndLenientValues_shouldParseCorrectly() throws IOException {
    JsonTreeReader readerNumber = new JsonTreeReader(new JsonPrimitive(Double.valueOf(3.14159)));
    Assert.assertEquals(3.14159, readerNumber.nextDouble(), 0.000001);

    JsonTreeReader readerString = new JsonTreeReader(new JsonPrimitive("2.71828"));
    Assert.assertEquals(2.71828, readerString.nextDouble(), 0.000001);
  }

  @Test(expected = NumberFormatException.class)
  public void nextDouble_givenNaNAndNonLenient_shouldThrowNumberFormatException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.valueOf(Double.NaN)));
    reader.setLenient(false);
    reader.nextDouble();
  }

  @Test(expected = NumberFormatException.class)
  public void nextDouble_givenInfinityAndNonLenient_shouldThrowNumberFormatException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.valueOf(Double.POSITIVE_INFINITY)));
    reader.setLenient(false);
    reader.nextDouble();
  }

  @Test
  public void nextDouble_givenNaNAndLenient_shouldReturnNaN() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.valueOf(Double.NaN)));
    reader.setLenient(true);
    Assert.assertTrue(Double.isNaN(reader.nextDouble()));
  }

  @Test
  public void nextDouble_givenInfinityAndLenient_shouldReturnInfinity() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.valueOf(Double.POSITIVE_INFINITY)));
    reader.setLenient(true);
    Assert.assertTrue(Double.isInfinite(reader.nextDouble()));
  }

  @Test(expected = IllegalStateException.class)
  public void nextDouble_givenBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Boolean.TRUE));
    reader.nextDouble();
  }

  @Test
  public void nextLong_givenNumberOrNumberString_shouldReturnLong() throws IOException {
    JsonTreeReader readerNumber = new JsonTreeReader(new JsonPrimitive(Long.valueOf(9876543210L)));
    Assert.assertEquals(9876543210L, readerNumber.nextLong());

    JsonTreeReader readerString = new JsonTreeReader(new JsonPrimitive("123456789"));
    Assert.assertEquals(123456789L, readerString.nextLong());
  }

  @Test(expected = IllegalStateException.class)
  public void nextLong_givenBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Boolean.FALSE));
    reader.nextLong();
  }

  @Test
  public void nextInt_givenNumberOrNumberString_shouldReturnInt() throws IOException {
    JsonTreeReader readerNumber = new JsonTreeReader(new JsonPrimitive(Integer.valueOf(123)));
    Assert.assertEquals(123, readerNumber.nextInt());

    JsonTreeReader readerString = new JsonTreeReader(new JsonPrimitive("456"));
    Assert.assertEquals(456, readerString.nextInt());
  }

  @Test(expected = IllegalStateException.class)
  public void nextInt_givenBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Boolean.TRUE));
    reader.nextInt();
  }

  @Test
  public void skipValue_givenName_shouldSkipNameAndSetNullInPath() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("foo", "bar");
    obj.addProperty("second", "val");
    JsonTreeReader reader = new JsonTreeReader(obj);

    reader.beginObject();
    reader.skipValue(); // skips "foo"
    Assert.assertEquals("bar", reader.nextString());
    Assert.assertEquals("second", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test
  public void skipValue_givenValue_shouldPopValueAndAdvancePathIndex() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("first"));
    array.add(new JsonPrimitive("second"));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    reader.skipValue();
    Assert.assertEquals("$[1]", reader.getPath());
    Assert.assertEquals("second", reader.nextString());
    reader.endArray();
  }

  @Test
  public void promoteNameToValue_givenNameToken_shouldConvertNameToValue() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("key1", "val1");
    JsonTreeReader reader = new JsonTreeReader(obj);

    reader.beginObject();
    reader.promoteNameToValue();
    Assert.assertEquals("key1", reader.nextString());
    Assert.assertEquals("val1", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void promoteNameToValue_givenNonNameToken_shouldThrowIllegalStateException() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("val"));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    reader.promoteNameToValue();
  }

  @Test
  public void toString_shouldReturnSimpleClassName() {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("test"));
    Assert.assertEquals("JsonTreeReader", reader.toString());
  }

  @Test
  public void push_givenNestingDeeperThanInitialCapacity_shouldResizeStackArrays() throws IOException {
    JsonArray current = new JsonArray();
    JsonArray root = current;
    for (int i = 0; i < 40; i++) {
      JsonArray child = new JsonArray();
      current.add(child);
      current = child;
    }
    current.add(new JsonPrimitive("deepValue"));

    JsonTreeReader reader = new JsonTreeReader(root);
    for (int i = 0; i < 40; i++) {
      reader.beginArray();
    }
    reader.beginArray();
    Assert.assertEquals("deepValue", reader.nextString());
    for (int i = 0; i < 41; i++) {
      reader.endArray();
    }
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void getPath_givenComplexNestedStructure_shouldFormatPathCorrectly() throws IOException {
    JsonObject root = new JsonObject();
    JsonArray arr = new JsonArray();
    JsonObject nested = new JsonObject();
    nested.addProperty("field", "v");
    arr.add(nested);
    root.add("items", arr);

    JsonTreeReader reader = new JsonTreeReader(root);
    Assert.assertEquals("$", reader.getPath());

    reader.beginObject();
    Assert.assertEquals("items", reader.nextName());
    Assert.assertEquals("$.items", reader.getPath());

    reader.beginArray();
    Assert.assertEquals("$.items[0]", reader.getPath());

    reader.beginObject();
    Assert.assertEquals("field", reader.nextName());
    Assert.assertEquals("$.items[0].field", reader.getPath());

    Assert.assertEquals("v", reader.nextString());
    reader.endObject();
    reader.endArray();
    reader.endObject();
    Assert.assertEquals("$", reader.getPath());
  }

  @Test
  public void locationString_givenException_shouldIncludePathInMessage() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("str"));
    JsonTreeReader reader = new JsonTreeReader(array);

    reader.beginArray();
    try {
      reader.nextInt();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("at path $[0]"));
    }
  }

  @Test
  public void close_shouldPreventFurtherOperations() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("val"));
    reader.close();

    try {
      reader.nextString();
      Assert.fail("Expected IllegalStateException after close");
    } catch (IllegalStateException e) {
      Assert.assertEquals("JsonReader is closed", e.getMessage());
    }
  }
}