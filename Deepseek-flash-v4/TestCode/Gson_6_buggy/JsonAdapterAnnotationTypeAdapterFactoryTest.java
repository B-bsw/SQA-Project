package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

    private JsonAdapterAnnotationTypeAdapterFactory factory;
    private Gson gson;
    private ConstructorConstructor constructorConstructor;

    @Before
    public void setUp() {
        constructorConstructor = new ConstructorConstructor();
        factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        gson = new Gson();
    }

    // Test Dummy Classes
    static class TestClass {
        @JsonAdapter(ManualTypeAdapter.class)
        public String field;
    }

    static class TestFactoryClass {
        @JsonAdapter(ManualFactory.class)
        public String field;
    }

    static class NoAnnotationClass {
        public String field;
    }

    static class ManualTypeAdapter extends TypeAdapter<String> {
        @Override
        public void write(JsonWriter out, String value) throws IOException {
            out.value("adapted:" + value);
        }

        @Override
        public String read(JsonReader in) throws IOException {
            String value = in.nextString();
            return "adapted:" + value;
        }
    }

    static class ManualFactory implements TypeAdapterFactory {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            return (TypeAdapter<T>) new TypeAdapter<String>() {
                @Override
                public void write(JsonWriter out, String value) throws IOException {
                    out.value("factory:" + value);
                }

                @Override
                public String read(JsonReader in) throws IOException {
                    String value = in.nextString();
                    return "factory:" + value;
                }
            };
        }
    }

    @Test
    public void testCreateWithNullAnnotationReturnsNull() {
        TypeToken<NoAnnotationClass> type = TypeToken.get(NoAnnotationClass.class);
        assertNull(factory.create(gson, type));
    }

    @Test
    public void testCreateWithTypeAdapterAnnotation() throws IOException {
        TypeToken<TestClass> type = TypeToken.get(TestClass.class);
        TypeAdapter<TestClass> adapter = factory.create(gson, type);
        assertNotNull(adapter);

        TestClass testObj = new TestClass();
        testObj.field = "test";
        String json = adapter.toJson(testObj);
        assertNotNull(json);
        assertTrue(json.contains("adapted:test"));

        TestClass readObj = adapter.fromJson("{\"field\":\"test\"}");
        assertEquals("adapted:test", readObj.field);
    }

    @Test
    public void testGetTypeAdapterWithTypeAdapterAndNullSafe() throws Exception {
        TypeToken<TestClass> fieldType = TypeToken.get(TestClass.class);
        JsonAdapter annotation = TestClass.class.getField("field").getAnnotation(JsonAdapter.class);
        TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                constructorConstructor, gson, fieldType, annotation);
        assertNotNull(adapter);
        assertEquals("adapted:null", adapter.toJson((String) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTypeAdapterWithInvalidValue() throws Exception {
        class InvalidAnnotationClass {
            @JsonAdapter(String.class)
            public String field;
        }
        TypeToken<InvalidAnnotationClass> fieldType = TypeToken.get(InvalidAnnotationClass.class);
        JsonAdapter annotation = InvalidAnnotationClass.class.getField("field").getAnnotation(JsonAdapter.class);
        JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                constructorConstructor, gson, fieldType, annotation);
    }

    @Test
    public void testGetTypeAdapterWithFactory() throws Exception {
        class FactoryClass {
            @JsonAdapter(ManualFactory.class)
            public String field;
        }
        TypeToken<FactoryClass> fieldType = TypeToken.get(FactoryClass.class);
        JsonAdapter annotation = FactoryClass.class.getField("field").getAnnotation(JsonAdapter.class);
        TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                constructorConstructor, gson, fieldType, annotation);
        assertNotNull(adapter);
        assertEquals("factory:null", adapter.toJson((String) null));
    }

    @Test
    public void testCreateWithFactoryAnnotation() throws IOException {
        TypeToken<TestFactoryClass> type = TypeToken.get(TestFactoryClass.class);
        TypeAdapter<TestFactoryClass> adapter = factory.create(gson, type);
        assertNotNull(adapter);

        TestFactoryClass testObj = new TestFactoryClass();
        testObj.field = "test";
        String json = adapter.toJson(testObj);
        assertNotNull(json);
        assertTrue(json.contains("factory:test"));
    }

    @Test
    public void testNullSafeAdapterHandlesNull() throws IOException {
        TypeToken<TestClass> type = TypeToken.get(TestClass.class);
        TypeAdapter<TestClass> adapter = factory.create(gson, type);
        assertNotNull(adapter);
        assertEquals("null", adapter.toJson((TestClass) null));
    }
}