package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

  private ConstructorConstructor constructorConstructor;
  private Gson gson;
  private JsonAdapterAnnotationTypeAdapterFactory factory;

  @Before
  public void setUp() {
    this.constructorConstructor = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    this.gson = new Gson();
    this.factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
  }

  private static class UnannotatedClass {
  }

  @JsonAdapter(CustomTypeAdapter.class)
  public static class AnnotatedWithTypeAdapterClass {
  }

  @JsonAdapter(CustomTypeAdapterFactory.class)
  public static class AnnotatedWithTypeAdapterFactoryClass {
  }

  @JsonAdapter(String.class)
  public static class AnnotatedWithInvalidClass {
  }

  public static class CustomTypeAdapter extends TypeAdapter<AnnotatedWithTypeAdapterClass> {
    public CustomTypeAdapter() {
    }

    @Override
    public void write(JsonWriter out, AnnotatedWithTypeAdapterClass value) throws IOException {
      out.value("custom-adapter");
    }

    @Override
    public AnnotatedWithTypeAdapterClass read(JsonReader in) throws IOException {
      in.nextString();
      return new AnnotatedWithTypeAdapterClass();
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    public CustomTypeAdapterFactory() {
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      return (TypeAdapter<T>) new TypeAdapter<AnnotatedWithTypeAdapterFactoryClass>() {
        @Override
        public void write(JsonWriter out, AnnotatedWithTypeAdapterFactoryClass value) throws IOException {
          out.value("factory-adapter");
        }

        @Override
        public AnnotatedWithTypeAdapterClass read(JsonReader in) throws IOException {
          in.nextString();
          return null;
        }
      };
    }
  }

  @Test
  public void create_givenTypeWithoutJsonAdapter_shouldReturnNull() {
    // Arrange
    TypeToken<UnannotatedClass> typeToken = TypeToken.get(UnannotatedClass.class);

    // Act
    TypeAdapter<UnannotatedClass> adapter = factory.create(gson, typeToken);

    // Assert
    Assert.assertNull(adapter);
  }

  @Test
  public void create_givenTypeAnnotatedWithTypeAdapter_shouldReturnTypeAdapter() throws Exception {
    // Arrange
    TypeToken<AnnotatedWithTypeAdapterClass> typeToken = TypeToken.get(AnnotatedWithTypeAdapterClass.class);

    // Act
    TypeAdapter<AnnotatedWithTypeAdapterClass> adapter = factory.create(gson, typeToken);

    // Assert
    Assert.assertNotNull(adapter);

    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    adapter.write(jsonWriter, new AnnotatedWithTypeAdapterClass());
    Assert.assertEquals("\"custom-adapter\"", stringWriter.toString());

    JsonReader jsonReader = new JsonReader(new StringReader("\"custom-adapter\""));
    AnnotatedWithTypeAdapterClass readValue = adapter.read(jsonReader);
    Assert.assertNotNull(readValue);
  }

  @Test
  public void create_givenTypeAnnotatedWithTypeAdapter_shouldBeNullSafe() throws Exception {
    // Arrange
    TypeToken<AnnotatedWithTypeAdapterClass> typeToken = TypeToken.get(AnnotatedWithTypeAdapterClass.class);
    TypeAdapter<AnnotatedWithTypeAdapterClass> adapter = factory.create(gson, typeToken);
    Assert.assertNotNull(adapter);

    // Act - Write Null
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    adapter.write(jsonWriter, null);

    // Assert - Write Null
    Assert.assertEquals("null", stringWriter.toString());

    // Act - Read Null
    JsonReader jsonReader = new JsonReader(new StringReader("null"));
    AnnotatedWithTypeAdapterClass readValue = adapter.read(jsonReader);

    // Assert - Read Null
    Assert.assertNull(readValue);
  }

  @Test
  public void create_givenTypeAnnotatedWithTypeAdapterFactory_shouldReturnTypeAdapter() throws Exception {
    // Arrange
    TypeToken<AnnotatedWithTypeAdapterFactoryClass> typeToken = TypeToken.get(AnnotatedWithTypeAdapterFactoryClass.class);

    // Act
    TypeAdapter<AnnotatedWithTypeAdapterFactoryClass> adapter = factory.create(gson, typeToken);

    // Assert
    Assert.assertNotNull(adapter);

    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    adapter.write(jsonWriter, new AnnotatedWithTypeAdapterFactoryClass());
    Assert.assertEquals("\"factory-adapter\"", stringWriter.toString());

    StringWriter nullWriter = new StringWriter();
    JsonWriter nullJsonWriter = new JsonWriter(nullWriter);
    adapter.write(nullJsonWriter, null);
    Assert.assertEquals("null", nullWriter.toString());

    JsonReader nullReader = new JsonReader(new StringReader("null"));
    AnnotatedWithTypeAdapterFactoryClass readValue = adapter.read(nullReader);
    Assert.assertNull(readValue);
  }

  @Test
  public void create_givenInvalidJsonAdapterAnnotationValue_shouldThrowIllegalArgumentException() {
    // Arrange
    TypeToken<AnnotatedWithInvalidClass> typeToken = TypeToken.get(AnnotatedWithInvalidClass.class);

    // Act & Assert
    try {
      factory.create(gson, typeToken);
      Assert.fail("Expected IllegalArgumentException was not thrown");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(
          "@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.",
          e.getMessage());
    }
  }

  @Test
  public void getTypeAdapter_givenDirectTypeAdapterAnnotation_shouldReturnNullSafeTypeAdapter() {
    // Arrange
    TypeToken<AnnotatedWithTypeAdapterClass> typeToken = TypeToken.get(AnnotatedWithTypeAdapterClass.class);
    JsonAdapter annotation = AnnotatedWithTypeAdapterClass.class.getAnnotation(JsonAdapter.class);

    // Act
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, typeToken, annotation);

    // Assert
    Assert.assertNotNull(adapter);
  }

  @Test
  public void getTypeAdapter_givenDirectTypeAdapterFactoryAnnotation_shouldReturnNullSafeTypeAdapter() {
    // Arrange
    TypeToken<AnnotatedWithTypeAdapterFactoryClass> typeToken = TypeToken.get(AnnotatedWithTypeAdapterFactoryClass.class);
    JsonAdapter annotation = AnnotatedWithTypeAdapterFactoryClass.class.getAnnotation(JsonAdapter.class);

    // Act
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, typeToken, annotation);

    // Assert
    Assert.assertNotNull(adapter);
  }

  @Test
  public void getTypeAdapter_givenDirectInvalidAnnotation_shouldThrowIllegalArgumentException() {
    // Arrange
    TypeToken<AnnotatedWithInvalidClass> typeToken = TypeToken.get(AnnotatedWithInvalidClass.class);
    JsonAdapter annotation = AnnotatedWithInvalidClass.class.getAnnotation(JsonAdapter.class);

    // Act & Assert
    try {
      JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
          constructorConstructor, gson, typeToken, annotation);
      Assert.fail("Expected IllegalArgumentException was not thrown");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(
          "@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.",
          e.getMessage());
    }
  }
}