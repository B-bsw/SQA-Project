package com.google.gson.internal.bind;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

public class ReflectiveTypeAdapterFactoryTest {

  private ConstructorConstructor constructorConstructor;
  private Excluder excluder;
  private ReflectiveTypeAdapterFactory factory;
  private Gson gson;

  @Before
  public void setUp() {
    Map<Type, InstanceCreator<?>> instanceCreators = Collections.emptyMap();
    this.constructorConstructor = new ConstructorConstructor(instanceCreators);
    this.excluder = Excluder.DEFAULT;
    this.factory = new ReflectiveTypeAdapterFactory(
        constructorConstructor, FieldNamingPolicy.IDENTITY, excluder);
    this.gson = new GsonBuilder().create();
  }

  // --- Static Classes for Test Scenarios ---

  static class SimpleClass {
    private String name;
    private int age;

    public SimpleClass() {}

    public SimpleClass(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  static class SerializedNameClass {
    @SerializedName("custom_name")
    private String name;

    public SerializedNameClass() {}

    public SerializedNameClass(String name) {
      this.name = name;
    }
  }

  static class AlternateSerializedNameClass {
    @SerializedName(value = "mainName", alternate = {"altName1", "altName2"})
    private String name;

    public AlternateSerializedNameClass() {}

    public AlternateSerializedNameClass(String name) {
      this.name = name;
    }
  }

  static class DuplicateFieldClass {
    @SerializedName("same_name")
    private String first;

    @SerializedName("same_name")
    private String second;
  }

  static class SelfReferencingClass {
    private SelfReferencingClass self;
    private String label;

    public SelfReferencingClass() {}

    public SelfReferencingClass(String label) {
      this.label = label;
    }
  }

  static class PrimitiveDefaultClass {
    private int number = 100;
  }

  static class ParentClass {
    protected String parentField;
  }

  static class ChildClass extends ParentClass {
    private String childField;

    public ChildClass() {}

    public ChildClass(String parentField, String childField) {
      this.parentField = parentField;
      this.childField = childField;
    }
  }

  static class TransientFieldClass {
    private transient String secret;
    private String publicInfo;

    public TransientFieldClass() {}

    public TransientFieldClass(String secret, String publicInfo) {
      this.secret = secret;
      this.publicInfo = publicInfo;
    }
  }

  public static class CustomUpperTypeAdapter extends TypeAdapter<String> {
    @Override
    public void write(JsonWriter out, String value) throws IOException {
      out.value(value == null ? null : value.toUpperCase());
    }

    @Override
    public String read(JsonReader in) throws IOException {
      return in.nextString().toLowerCase();
    }
  }

  static class JsonAdapterAnnotatedClass {
    @JsonAdapter(CustomUpperTypeAdapter.class)
    private String customText;

    public JsonAdapterAnnotatedClass() {}

    public JsonAdapterAnnotatedClass(String customText) {
      this.customText = customText;
    }
  }

  interface DummyInterface {
    void execute();
  }

  // --- Tests: create() ---

  @Test
  public void create_givenPrimitiveType_shouldReturnNull() {
    // Arrange
    TypeToken<Integer> primitiveType = TypeToken.get(int.class);

    // Act
    TypeAdapter<Integer> adapter = factory.create(gson, primitiveType);

    // Assert
    Assert.assertNull(adapter);
  }

  @Test
  public void create_givenInterface_shouldReturnAdapterWithNoBoundFields() throws IOException {
    // Arrange
    TypeToken<DummyInterface> interfaceType = TypeToken.get(DummyInterface.class);

    // Act
    TypeAdapter<DummyInterface> adapter = factory.create(gson, interfaceType);

    // Assert
    Assert.assertNotNull(adapter);
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    adapter.write(writer, null);
    Assert.assertEquals("null", out.toString());
  }

  @Test
  public void create_givenDuplicateFieldNames_shouldThrowIllegalArgumentException() {
    // Arrange
    TypeToken<DuplicateFieldClass> type = TypeToken.get(DuplicateFieldClass.class);

    // Act & Assert
    try {
      factory.create(gson, type);
      Assert.fail("Expected IllegalArgumentException on duplicate JSON field names");
    } catch (IllegalArgumentException expected) {
      Assert.assertTrue(expected.getMessage().contains("declares multiple JSON fields named same_name"));
    }
  }

  // --- Tests: Serialization & Deserialization Happy Paths ---

  @Test
  public void write_givenSimpleObject_shouldSerializeFieldsCorrectly() throws IOException {
    // Arrange
    TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
    SimpleClass instance = new SimpleClass("Alice", 30);
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act
    adapter.write(writer, instance);

    // Assert
    String json = out.toString();
    Assert.assertTrue(json.contains("\"name\":\"Alice\""));
    Assert.assertTrue(json.contains("\"age\":30"));
  }

  @Test
  public void read_givenSimpleJson_shouldDeserializeFieldsCorrectly() throws IOException {
    // Arrange
    TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
    String json = "{\"name\":\"Bob\",\"age\":25}";
    JsonReader reader = new JsonReader(new StringReader(json));

    // Act
    SimpleClass instance = adapter.read(reader);

    // Assert
    Assert.assertNotNull(instance);
    Assert.assertEquals("Bob", instance.name);
    Assert.assertEquals(25, instance.age);
  }

  @Test
  public void writeAndRead_givenInheritedClass_shouldHandleHierarchyFields() throws IOException {
    // Arrange
    TypeAdapter<ChildClass> adapter = factory.create(gson, TypeToken.get(ChildClass.class));
    ChildClass child = new ChildClass("fromParent", "fromChild");
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act
    adapter.write(writer, child);
    String json = out.toString();

    // Assert serialization
    Assert.assertTrue(json.contains("\"parentField\":\"fromParent\""));
    Assert.assertTrue(json.contains("\"childField\":\"fromChild\""));

    // Act deserialization
    JsonReader reader = new JsonReader(new StringReader(json));
    ChildClass readChild = adapter.read(reader);

    // Assert deserialization
    Assert.assertEquals("fromParent", readChild.parentField);
    Assert.assertEquals("fromChild", readChild.childField);
  }

  // --- Tests: Boundary & Edge Cases ---

  @Test
  public void write_givenNullObject_shouldWriteNull() throws IOException {
    // Arrange
    TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act
    adapter.write(writer, null);

    // Assert
    Assert.assertEquals("null", out.toString());
  }

  @Test
  public void read_givenNullToken_shouldReturnNull() throws IOException {
    // Arrange
    TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
    JsonReader reader = new JsonReader(new StringReader("null"));

    // Act
    SimpleClass instance = adapter.read(reader);

    // Assert
    Assert.assertNull(instance);
  }

  @Test
  public void write_givenSelfReferencingField_shouldSkipSelfToAvoidRecursion() throws IOException {
    // Arrange
    TypeAdapter<SelfReferencingClass> adapter = factory.create(gson, TypeToken.get(SelfReferencingClass.class));
    SelfReferencingClass obj = new SelfReferencingClass("loop");
    obj.self = obj; // circular reference

    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act
    adapter.write(writer, obj);

    // Assert - 'self' field should be skipped because fieldValue == value
    String json = out.toString();
    Assert.assertEquals("{\"label\":\"loop\"}", json);
  }

  @Test
  public void read_givenUnknownPropertiesInJson_shouldSkipUnknownValues() throws IOException {
    // Arrange
    TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
    String json = "{\"extraProperty\":12345,\"name\":\"Charlie\",\"unknownObj\":{\"x\":1},\"age\":40}";
    JsonReader reader = new JsonReader(new StringReader(json));

    // Act
    SimpleClass instance = adapter.read(reader);

    // Assert
    Assert.assertNotNull(instance);
    Assert.assertEquals("Charlie", instance.name);
    Assert.assertEquals(40, instance.age);
  }

  @Test
  public void read_givenNullValueForPrimitiveField_shouldNotOverwriteDefault() throws IOException {
    // Arrange
    TypeAdapter<PrimitiveDefaultClass> adapter = factory.create(gson, TypeToken.get(PrimitiveDefaultClass.class));
    String json = "{\"number\":null}";
    JsonReader reader = new JsonReader(new StringReader(json));

    // Act
    PrimitiveDefaultClass instance = adapter.read(reader);

    // Assert
    Assert.assertNotNull(instance);
    Assert.assertEquals(100, instance.number);
  }

  // --- Tests: Annotations (@SerializedName & @JsonAdapter) ---

  @Test
  public void writeAndRead_givenSerializedName_shouldUseConfiguredName() throws IOException {
    // Arrange
    TypeAdapter<SerializedNameClass> adapter = factory.create(gson, TypeToken.get(SerializedNameClass.class));
    SerializedNameClass instance = new SerializedNameClass("customValue");
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act
    adapter.write(writer, instance);
    String json = out.toString();

    // Assert
    Assert.assertEquals("{\"custom_name\":\"customValue\"}", json);

    JsonReader reader = new JsonReader(new StringReader("{\"custom_name\":\"newValue\"}"));
    SerializedNameClass deserialized = adapter.read(reader);
    Assert.assertEquals("newValue", deserialized.name);
  }

  @Test
  public void writeAndRead_givenAlternatesInSerializedName_shouldSerializeMainAndDeserializeAlternates() throws IOException {
    // Arrange
    TypeAdapter<AlternateSerializedNameClass> adapter =
        factory.create(gson, TypeToken.get(AlternateSerializedNameClass.class));
    AlternateSerializedNameClass instance = new AlternateSerializedNameClass("test");
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act: Write should use primary serialized name only
    adapter.write(writer, instance);
    String json = out.toString();
    Assert.assertEquals("{\"mainName\":\"test\"}", json);

    // Act: Read alternate 1
    JsonReader reader1 = new JsonReader(new StringReader("{\"altName1\":\"fromAlt1\"}"));
    AlternateSerializedNameClass res1 = adapter.read(reader1);
    Assert.assertEquals("fromAlt1", res1.name);

    // Act: Read alternate 2
    JsonReader reader2 = new JsonReader(new StringReader("{\"altName2\":\"fromAlt2\"}"));
    AlternateSerializedNameClass res2 = adapter.read(reader2);
    Assert.assertEquals("fromAlt2", res2.name);
  }

  @Test
  public void writeAndRead_givenJsonAdapterAnnotationOnField_shouldUseCustomAdapter() throws IOException {
    // Arrange
    TypeAdapter<JsonAdapterAnnotatedClass> adapter =
        factory.create(gson, TypeToken.get(JsonAdapterAnnotatedClass.class));
    JsonAdapterAnnotatedClass instance = new JsonAdapterAnnotatedClass("hello");
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act: Write uses CustomUpperTypeAdapter (uppercases)
    adapter.write(writer, instance);
    String json = out.toString();
    Assert.assertEquals("{\"customText\":\"HELLO\"}", json);

    // Act: Read uses CustomUpperTypeAdapter (lowercases)
    JsonReader reader = new JsonReader(new StringReader("{\"customText\":\"WORLD\"}"));
    JsonAdapterAnnotatedClass deserialized = adapter.read(reader);
    Assert.assertEquals("world", deserialized.customText);
  }

  // --- Tests: Field Exclusion & Modifier Tests ---

  @Test
  public void excludeField_givenTransientModifier_shouldExcludeField() throws NoSuchFieldException {
    // Arrange
    Field secretField = TransientFieldClass.class.getDeclaredField("secret");
    Field publicField = TransientFieldClass.class.getDeclaredField("publicInfo");

    // Act
    boolean secretSerialize = factory.excludeField(secretField, true);
    boolean secretDeserialize = factory.excludeField(secretField, false);
    boolean publicSerialize = factory.excludeField(publicField, true);
    boolean publicDeserialize = factory.excludeField(publicField, false);

    // Assert
    Assert.assertFalse(secretSerialize);
    Assert.assertFalse(secretDeserialize);
    Assert.assertTrue(publicSerialize);
    Assert.assertTrue(publicDeserialize);
  }

  @Test
  public void write_givenTransientField_shouldNotSerializeTransientField() throws IOException {
    // Arrange
    TypeAdapter<TransientFieldClass> adapter = factory.create(gson, TypeToken.get(TransientFieldClass.class));
    TransientFieldClass instance = new TransientFieldClass("mySecret", "openData");
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);

    // Act
    adapter.write(writer, instance);
    String json = out.toString();

    // Assert
    Assert.assertEquals("{\"publicInfo\":\"openData\"}", json);
  }

  // --- Tests: Error & Exception Handling ---

  @Test
  public void read_givenMalformedJson_shouldThrowJsonSyntaxException() throws IOException {
    // Arrange
    TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
    // Array instead of Object causes IllegalStateException inside adapter.read()
    JsonReader reader = new JsonReader(new StringReader("[\"notAnObject\"]"));

    // Act & Assert
    try {
      adapter.read(reader);
      Assert.fail("Expected JsonSyntaxException when beginning object from JSON array");
    } catch (JsonSyntaxException expected) {
      Assert.assertNotNull(expected.getCause());
      Assert.assertTrue(expected.getCause() instanceof IllegalStateException);
    }
  }
}