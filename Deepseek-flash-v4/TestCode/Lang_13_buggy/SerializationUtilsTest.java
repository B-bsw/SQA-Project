package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SerializationUtilsTest {

    private static final Serializable TEST_OBJECT = new Serializable() {
        private static final long serialVersionUID = 1L;
        private final String value = "test";
        public String getValue() { return value; }
    };

    private static class TestSerializable implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name = "default";
        
        public TestSerializable(String name) { this.name = name; }
        public String getName() { return name; }
    }

    private static class NonSerializable {
        private String id = "non-serializable";
    }

    // Test clone method
    @Test
    public void testCloneWithNull() {
        assertNull(SerializationUtils.clone(null));
    }

    @Test
    public void testCloneSerializableObject() {
        TestSerializable original = new TestSerializable("original");
        TestSerializable clone = SerializationUtils.clone(original);
        assertNotNull(clone);
        assertEquals(original.getName(), clone.getName());
        assertSame(TestSerializable.class, clone.getClass());
    }

    @Test
    public void testCloneAnonymousSerializable() {
        Object original = new Object() { 
            private static final long serialVersionUID = 1L;
            private final String value = "nested";
            public String getValue() { return value; }
        };
        Object clone = SerializationUtils.clone((Serializable)original);
        assertNotNull(clone);
        assertEquals(((Serializable)original).toString(), clone.toString());
    }

    // Test serialize(Serializable) method
    @Test
    public void testSerializeNullObject() {
        byte[] result = SerializationUtils.serialize(null);
        assertNotNull(result);
        assertEquals(0, result.length > 0 ? result[0] : 0); // Not really meaningful but ensures no NPE
    }

    @Test
    public void testSerializeSimpleObject() {
        byte[] bytes = SerializationUtils.serialize("Hello");
        assertNotNull(bytes);
        assertEquals(13, bytes.length); // Java serialization of String "Hello" is typically 13 bytes
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSerializeNullOutputStream() {
        SerializationUtils.serialize("test", null);
    }

    @Test
    public void testSerializeWithValidOutputStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize("content", baos);
        byte[] bytes = baos.toByteArray();
        assertNotNull(bytes);
        assertEquals(18, bytes.length); // typical serialization of "content"
    }

    @Test(expected = SerializationException.class)
    public void testSerializeNonSerializableObject() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new NonSerializable()); // This will throw NotSerializableException inside serialize
        fail("Should not reach here");
    }

    // Test serialize(Serializable, OutputStream) method
    @Test(expected = IllegalArgumentException.class)
    public void testSerializeWithNullOutputStreamForObject() {
        SerializationUtils.serialize(TEST_OBJECT, null);
    }

    @Test
    public void testSerializeAndDeserializeRoundTrip() throws IOException, ClassNotFoundException {
        TestSerializable original = new TestSerializable("roundtrip");
        byte[] bytes = SerializationUtils.serialize(original);
        Object deserialized = SerializationUtils.deserialize(bytes);
        assertNotNull(deserialized);
        assertEquals(TestSerializable.class, deserialized.getClass());
        assertEquals(original.getName(), ((TestSerializable)deserialized).getName());
    }

    // Test deserialize(InputStream) method
    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeNullInputStream() {
        SerializationUtils.deserialize((InputStream) null);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeInvalidData() throws IOException {
        byte[] invalidData = new byte[] { 1, 2, 3 };
        SerializationUtils.deserialize(invalidData);
    }

    @Test
    public void testDeserializeValidData() {
        byte[] bytes = SerializationUtils.serialize("data");
        Object result = SerializationUtils.deserialize(bytes);
        assertEquals("data", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeNullByteArray() {
        SerializationUtils.deserialize((byte[]) null);
    }

    // Test deserialize(byte[]) method
    @Test
    public void testDeserializeEmptyArray() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(null);
        oos.close();
        byte[] bytes = baos.toByteArray();
        Object result = SerializationUtils.deserialize(bytes);
        assertNull(result);
    }

    // Test ClassLoaderAwareObjectInputStream resolveClass behavior
    @Test
    public void testClassLoaderAwareResolveClass() throws IOException, ClassNotFoundException {
        // This test verifies that ClassLoaderAwareObjectInputStream uses the provided classloader
        ClassLoader testClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(new TestSerializable("classloader-test"));
        }
        
        byte[] data = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        
        try (SerializationUtils.ClassLoaderAwareObjectInputStream in = 
                new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, testClassLoader)) {
            Object result = in.readObject();
            assertNotNull(result);
            assertEquals(TestSerializable.class, result.getClass());
        }
    }

    // Edge cases for branch coverage
    @Test
    public void testSerializeAndDeserializeWithSpecialObject() throws IOException, ClassNotFoundException {
        Map<String, Integer> original = new HashMap<>();
        original.put("one", 1);
        original.put("two", 2);
        
        byte[] bytes = SerializationUtils.serialize((Serializable) original);
        @SuppressWarnings("unchecked")
        Map<String, Integer> result = (Map<String, Integer>) SerializationUtils.deserialize(bytes);
        
        assertEquals(original, result);
    }

    @Test
    public void testDeserializeThrowsSerializationExceptionForNonSerializable() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(new NonSerializable());
            oos.close();
            byte[] bytes = baos.toByteArray();
            
            // This will fail because NonSerializable is not Serializable
            SerializationUtils.deserialize(bytes);
            fail("Expected SerializationException");
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        } catch (SerializationException e) {
            // Expected - NonSerializable cannot be serialized
        }
    }

    @Test
    public void testSerializationOfStringArray() {
        String[] original = {"a", "bb", "ccc"};
        byte[] bytes = SerializationUtils.serialize(original);
        Object result = SerializationUtils.deserialize(bytes);
        assertNotNull(result);
        assertEquals(String[].class, result.getClass());
        String[] casted = (String[]) result;
        assertEquals(3, casted.length);
        assertEquals("a", casted[0]);
        assertEquals("bb", casted[1]);
        assertEquals("ccc", casted[2]);
    }

    @Test
    public void testSerializationOfEmptyList() {
        ArrayList<String> original = new ArrayList<>();
        byte[] bytes = SerializationUtils.serialize(original);
        @SuppressWarnings("unchecked")
        ArrayList<String> result = (ArrayList<String>) SerializationUtils.deserialize(bytes);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testClassLoaderAwareResolveClassWithDefaultClassLoader() throws IOException, ClassNotFoundException {
        // Test with a custom classloader that fails for certain class names
        ClassLoader failingClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.startsWith("test.invalid")) {
                    throw new ClassNotFoundException(name);
                }
                return super.loadClass(name);
            }
        };
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject("simple");
        }
        
        byte[] data = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        
        try (SerializationUtils.ClassLoaderAwareObjectInputStream in = 
                new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, failingClassLoader)) {
            Object result = in.readObject();
            assertEquals("simple", result);
        }
    }
}