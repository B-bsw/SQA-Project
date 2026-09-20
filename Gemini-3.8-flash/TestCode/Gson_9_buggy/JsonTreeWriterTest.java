package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JsonTreeWriterTest {

  @Test
  public void get_givenUnwrittenWriter_shouldReturnJsonNull() {
    JsonTreeWriter writer = new JsonTreeWriter();
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonNull());
    Assert.assertSame(JsonNull.INSTANCE, element);
  }

  @Test(expected = IllegalStateException.class)
  public void get_givenUnclosedWriterWithStack_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.get();
  }

  @Test
  public void value_givenString_shouldSetProduct() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value("hello");
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals("hello", element.getAsString());
  }

  @Test
  public void value_givenNullString_shouldSetJsonNull() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value((String) null);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonNull());
  }

  @Test
  public void nullValue_givenDefaultState_shouldSetJsonNull() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.nullValue();
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonNull());
  }

  @Test
  public void value_givenBoolean_shouldSetBooleanPrimitive() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value(true);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertTrue(element.getAsBoolean());

    JsonTreeWriter writerFalse = new JsonTreeWriter();
    writerFalse.value(false);
    Assert.assertFalse(writerFalse.get().getAsBoolean());
  }

  @Test
  public void value_givenLong_shouldSetLongPrimitive() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value(123456789012345L);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals(123456789012345L, element.getAsLong());
  }

  @Test
  public void value_givenDouble_shouldSetDoublePrimitive() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value(123.456d);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals(123.456d, element.getAsDouble(), 0.00001d);
  }

  @Test(expected = IllegalArgumentException.class)
  public void value_givenDoubleNaNStrict_shouldThrowIllegalArgumentException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(false);
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void value_givenDoublePositiveInfinityStrict_shouldThrowIllegalArgumentException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(false);
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void value_givenDoubleNegativeInfinityStrict_shouldThrowIllegalArgumentException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(false);
    writer.value(Double.NEGATIVE_INFINITY);
  }

  @Test
  public void value_givenDoubleNaNLenient_shouldSucceed() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(true);
    writer.value(Double.NaN);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertTrue(Double.isNaN(element.getAsDouble()));
  }

  @Test
  public void value_givenDoubleInfinityLenient_shouldSucceed() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(true);
    writer.value(Double.POSITIVE_INFINITY);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertTrue(Double.isInfinite(element.getAsDouble()));
  }

  @Test
  public void value_givenNumberNull_shouldSetJsonNull() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value((Number) null);
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonNull());
  }

  @Test
  public void value_givenNumberValid_shouldSetNumberPrimitive() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value(Integer.valueOf(42));
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals(42, element.getAsInt());
  }

  @Test(expected = IllegalArgumentException.class)
  public void value_givenNumberNaNStrict_shouldThrowIllegalArgumentException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(false);
    writer.value(Double.valueOf(Double.NaN));
  }

  @Test(expected = IllegalArgumentException.class)
  public void value_givenNumberInfinityStrict_shouldThrowIllegalArgumentException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(false);
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test
  public void value_givenNumberNaNLenient_shouldSucceed() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(true);
    writer.value(Double.valueOf(Double.NaN));
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertTrue(Double.isNaN(element.getAsDouble()));
  }

  @Test
  public void value_givenNumberInfinityLenient_shouldSucceed() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setLenient(true);
    writer.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertTrue(Double.isInfinite(element.getAsDouble()));
  }

  @Test
  public void beginArray_andEndArray_shouldProduceEmptyArray() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.endArray();
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonArray());
    Assert.assertEquals(0, element.getAsJsonArray().size());
  }

  @Test
  public void beginArray_withElements_shouldProducePopulatedArray() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.value("first");
    writer.value(2L);
    writer.value(true);
    writer.nullValue();
    writer.endArray();

    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonArray());
    JsonArray array = element.getAsJsonArray();
    Assert.assertEquals(4, array.size());
    Assert.assertEquals("first", array.get(0).getAsString());
    Assert.assertEquals(2L, array.get(1).getAsLong());
    Assert.assertTrue(array.get(2).getAsBoolean());
    Assert.assertTrue(array.get(3).isJsonNull());
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_givenEmptyStack_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_givenTopIsJsonObject_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_givenPendingName_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("key");
    writer.endArray();
  }

  @Test
  public void beginObject_andEndObject_shouldProduceEmptyObject() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.endObject();
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonObject());
    Assert.assertEquals(0, element.getAsJsonObject().entrySet().size());
  }

  @Test
  public void beginObject_withProperties_shouldProducePopulatedObject() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("name").value("Gson");
    writer.name("version").value(1L);
    writer.name("active").value(true);
    writer.endObject();

    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonObject());
    JsonObject obj = element.getAsJsonObject();
    Assert.assertEquals("Gson", obj.get("name").getAsString());
    Assert.assertEquals(1L, obj.get("version").getAsLong());
    Assert.assertTrue(obj.get("active").getAsBoolean());
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_givenEmptyStack_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_givenTopIsJsonArray_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_givenPendingName_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("incompleteKey");
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void name_givenEmptyStack_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.name("key");
  }

  @Test(expected = IllegalStateException.class)
  public void name_givenTopIsJsonArray_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.name("key");
  }

  @Test(expected = IllegalStateException.class)
  public void name_givenPendingNameAlreadySet_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("key1");
    writer.name("key2");
  }

  @Test(expected = IllegalStateException.class)
  public void put_givenObjectWithoutName_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.value("orphanValue");
  }

  @Test
  public void put_givenObjectWithNullAndSerializeNullsFalse_shouldNotAddProperty() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setSerializeNulls(false);
    writer.beginObject();
    writer.name("nullProp").nullValue();
    writer.name("validProp").value("value");
    writer.endObject();

    JsonObject obj = writer.get().getAsJsonObject();
    Assert.assertFalse(obj.has("nullProp"));
    Assert.assertTrue(obj.has("validProp"));
  }

  @Test
  public void put_givenObjectWithNullAndSerializeNullsTrue_shouldAddProperty() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setSerializeNulls(true);
    writer.beginObject();
    writer.name("nullProp").nullValue();
    writer.endObject();

    JsonObject obj = writer.get().getAsJsonObject();
    Assert.assertTrue(obj.has("nullProp"));
    Assert.assertTrue(obj.get("nullProp").isJsonNull());
  }

  @Test
  public void nestedStructures_givenComplexHierarchy_shouldConstructCorrectTree() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginObject();
    writer.name("data");
    writer.beginArray();
    writer.beginObject();
    writer.name("id").value(1L);
    writer.endObject();
    writer.beginObject();
    writer.name("id").value(2L);
    writer.endObject();
    writer.endArray();
    writer.endObject();

    JsonObject root = writer.get().getAsJsonObject();
    Assert.assertTrue(root.has("data"));
    JsonArray array = root.getAsJsonArray("data");
    Assert.assertEquals(2, array.size());
    Assert.assertEquals(1L, array.get(0).getAsJsonObject().get("id").getAsLong());
    Assert.assertEquals(2L, array.get(1).getAsJsonObject().get("id").getAsLong());
  }

  @Test
  public void flush_givenAnyState_shouldDoNothing() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value("test");
    writer.flush();
    Assert.assertEquals("test", writer.get().getAsString());
  }

  @Test
  public void close_givenEmptyStack_shouldSucceedAndBlockFurtherGet() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value("finished");
    writer.close();

    try {
      writer.get();
      Assert.fail("Expected IllegalStateException when calling get() after close()");
    } catch (IllegalStateException expected) {
      // Expected exception
    }
  }

  @Test(expected = IOException.class)
  public void close_givenOpenStack_shouldThrowIOException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.beginArray();
    writer.close();
  }

  @Test(expected = IllegalStateException.class)
  public void operations_givenClosedWriter_shouldThrowIllegalStateException() throws IOException {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.value("done");
    writer.close();
    writer.value("fails");
  }
}