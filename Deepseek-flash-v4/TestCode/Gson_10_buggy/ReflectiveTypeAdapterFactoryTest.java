```java
package com.google.gson.internal.bind;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.LinkedHashMap;

public class ReflectiveTypeAdapterFactoryTest {

    private Gson gson;
    private ConstructorConstructor constructorConstructor;
    private ReflectiveTypeAdapterFactory factory;

    // Test helper classes
    public static class TestClass {
        @SerializedName("custom_name")
        public String name;
        public int number;
        public boolean flag;
        @SerializedName(value = "alternate_one", alternate = {"alt1", "alt2"})
        public String alternate;
        public transient String ignored;
        public static String staticField = "static";
    }

    public static class NullableFields {
        public String str;
        public Integer intObj;
    }

    public static class NoDefaultConstructor {
        public int value;
        public NoDefaultConstructor(int value) { this.value = value; }
    }

    public static class JsonAnnotated {
        @JsonAdapter(CustomTypeAdapter.class)
        public String custom;
    }

    public static class CustomTypeAdapter extends TypeAdapter<String> {
        @Override
        public void write(JsonWriter out, String value) throws IOException {
            out.value("custom_" + value);
        }
        @Override
        public String read(JsonReader in) throws IOException {
            String value = in.nextString();
            return value.replace("custom_", "");
        }
    }

    @Before
    public void setUp() {
        gson = new Gson();
        constructorConstructor = new ConstructorConstructor();
        FieldNamingStrategy fieldNamingPolicy = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                return f.getName();
            }
        };
        Excluder excluder = Excluder.DEFAULT;
        factory = new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingPolicy, excluder);
    }

    @After
    public void tearDown() {
        gson = null;
        constructorConstructor = null;
        factory = null;
    }

    @Test
    public void testExcludeFieldWithClassAndFieldExclusion() throws Exception {
        Field field = TestClass.class.getDeclaredField("ignored");
        assertTrue(factory.excludeField(field, true));
        assertTrue(factory.excludeField(field, false));
    }

    @Test
    public void testGetFieldNamesWithSerializedName() throws Exception {
        Field field = TestClass.class.getDeclaredField("alternate");
        List<String> names = factory.getFieldNames(field);
        assertEquals(3, names.size());
        assertEquals("alternate_one", names.get(0));
        assertEquals("alt1", names.get(1));
        assertEquals("alt2", names.get(2));
    }

    @Test
    public void testGetFieldNamesWithoutAnnotation() throws Exception {
        Field field = TestClass.class.getDeclaredField("name");
        List<String> names = factory.getFieldNames(field);
        assertEquals(1, names.size());
        assertEquals("name", names.get(0));
    }

    @Test
    public void testCreateBoundFieldWithNull() {
        try {
            factory.createBoundField(gson, null, "test", TypeToken.get(String.class), true, true);
            fail("Expected NPE");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAdapterReadNull() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass result = adapter.read(new JsonReader(new StringReader("null")));
        assertNull(result);
    }

    @Test
    public void testAdapterReadNormal() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass result = adapter.fromJson("{\"custom_name\":\"Hello\",\"number\":42,\"flag\":true}");
        assertNotNull(result);
        assertEquals("Hello", result.name);
        assertEquals(42, result.number);
        assertTrue(result.flag);
        assertNull(result.alternate);
    }

    @Test
    public void testAdapterReadWithAlternates() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass result = adapter.fromJson("{\"alt1\":\"testing\"}");
        assertNotNull(result);
        assertEquals("testing", result.alternate);
    }

    @Test
    public void testAdapterWrite() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass obj = new TestClass();
        obj.name = "test";
        obj.number = 100;
        obj.flag = true;
        String json = adapter.toJson(obj);
        assertTrue(json.contains("\"custom_name\":\"test\""));
        assertTrue(json.contains("\"number\":100"));
        assertTrue(json.contains("\"flag\":true"));
        assertFalse(json.contains("\"ignored\""));
        assertFalse(json.contains("\"staticField\""));
    }

    @Test
    public void testAdapterWriteNull() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        String json = adapter.toJson((TestClass) null);
        assertEquals("null", json);
    }

    @Test
    public void testOldVersionRead() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass result = adapter.fromJson("{\"custom_name\":\"Hello\"}");
        assertEquals("Hello", result.name);
    }

    @Test
    public void testBoundFieldWriteIgnoresNullAndPrimitives() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass obj = new TestClass();
        obj.name = null;
        obj.number = 0;
        obj.flag = false;
        String json = adapter.toJson(obj);
        assertTrue(json.contains("\"custom_name\":null") || !json.contains("custom_name"));
        assertEquals("{\"number\":0,\"flag\":false}", json.replaceAll("\\s+", ""));
    }

    @Test
    public void testReadWithJsonAdapterAnnotation() throws Exception {
        TypeAdapter<JsonAnnotated> adapter = factory.create(gson, TypeToken.get(JsonAnnotated.class));
        JsonAnnotated obj = adapter.fromJson("{\"custom\":\"value\"}");
        assertNotNull(obj);
        assertEquals("value", obj.custom);
    }

    @Test
    public void testReadInvalidJsonThrowsJsonSyntaxException() {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        try {
            adapter.fromJson("{\"custom_name\":\"test\", \"number\":\"not_a_number\"}");
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException e) {
            // expected
        }
    }

    @Test
    public void testBoundFieldsResultEmptyForInterface() {
        TypeToken<TestInterface> type = TypeToken.get(TestInterface.class);
        Map<String, ReflectiveTypeAdapterFactory.BoundField> fields = factory.getBoundFields(gson, type, TestInterface.class);
        assertNotNull(fields);
        assertTrue(fields.isEmpty());
    }

    public interface TestInterface {}

    @Test
    public void testMultipleFieldsWithSameJsonNameThrows() {
        // This should throw IllegalArgumentException with duplicate field names
        try {
            TypeAdapter<DuplicateField> adapter = factory.create(gson, TypeToken.get(DuplicateField.class));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    public static class DuplicateField {
        @SerializedName("same")
        public String field1;
        @SerializedName("same")
        public String field2;
    }

    @Test
    public void testConstructorWithNoDefaultConstructor() throws Exception {
        TypeAdapter<NoDefaultConstructor> adapter = factory.create(gson, TypeToken.get(NoDefaultConstructor.class));
        NoDefaultConstructor obj = adapter.fromJson("{\"value\":10}");
        assertNotNull(obj);
        assertEquals(10, obj.value);
    }

    @Test
    public void testReadWithNullValueWhenDeserializeFalse() throws Exception {
        TypeAdapter<TestClass> adapter = factory.create(gson, TypeToken.get(TestClass.class));
        TestClass result = adapter.fromJson("{\"name\":null}");
        assertNotNull(result);
        assertNull(result.name);
    }
}