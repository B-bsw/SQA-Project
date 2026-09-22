package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit tests for {@link SerializationUtils}.
 */
public class SerializationUtilsTest {

    static class DummySerializable implements Serializable {
        private static final long serialVersionUID = 1L;
        private String value;

        public DummySerializable() {
            super();
        }

        public DummySerializable(String value) {
            super();
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DummySerializable other = (DummySerializable) obj;
            if (value == null) {
                return other.value == null;
            }
            return value.equals(other.value);
        }

        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

    static class DummyNonSerializable {
        public DummyNonSerializable() {
            super();
        }
    }

    static class DummyWithNonSerializableField implements Serializable {
        private static final long serialVersionUID = 1L;
        private DummyNonSerializable nonSerializable = new DummyNonSerializable();

        public DummyWithNonSerializableField() {
            super();
        }
    }

    static class DummyClassNotFoundOnRead implements Serializable {
        private static final long serialVersionUID = 1L;

        public DummyClassNotFoundOnRead() {
            super();
        }

        private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new ClassNotFoundException("Simulated ClassNotFoundException during readObject");
        }
    }

    static class DummyIOExceptionOnRead implements Serializable {
        private static final long serialVersionUID = 1L;

        public DummyIOExceptionOnRead() {
            super();
        }

        private void readObject(java.io.ObjectInputStream in) throws IOException {
            throw new IOException("Simulated IOException during readObject");
        }
    }

    static class TestClassLoaderAwareObjectInputStream extends SerializationUtils.ClassLoaderAwareObjectInputStream {
        public TestClassLoaderAwareObjectInputStream(InputStream in, ClassLoader classLoader) throws IOException {
            super(in, classLoader);
        }

        public Class<?> resolveClassForTest(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
            return resolveClass(desc);
        }
    }

    // -------------------------------------------------------------------------
    // Constructor tests
    // -------------------------------------------------------------------------

    @Test
    public void constructor_givenNothing_shouldCreateInstance() {
        // Arrange & Act
        SerializationUtils utils = new SerializationUtils();

        // Assert
        Assert.assertNotNull(utils);
    }

    // -------------------------------------------------------------------------
    // clone() tests
    // -------------------------------------------------------------------------

    @Test
    public void clone_givenNullObject_shouldReturnNull() {
        // Arrange & Act
        Serializable result = SerializationUtils.clone(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void clone_givenValidSerializableObject_shouldReturnDeepClonedObject() {
        // Arrange
        Map<String, String> original = new HashMap<String, String>();
        original.put("key1", "value1");
        original.put("key2", "value2");

        // Act
        HashMap<String, String> cloned = SerializationUtils.clone((HashMap<String, String>) original);

        // Assert
        Assert.assertNotNull(cloned);
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original, cloned);
    }

    @Test
    public void clone_givenObjectWithNonSerializableField_shouldThrowSerializationException() {
        // Arrange
        DummyWithNonSerializableField invalidObject = new DummyWithNonSerializableField();

        // Act & Assert
        try {
            SerializationUtils.clone(invalidObject);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
        }
    }

    @Test
    public void clone_givenObjectThrowingClassNotFound_shouldThrowSerializationException() {
        // Arrange
        DummyClassNotFoundOnRead object = new DummyClassNotFoundOnRead();

        // Act & Assert
        try {
            SerializationUtils.clone(object);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertEquals("ClassNotFoundException while reading cloned object data", ex.getMessage());
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof ClassNotFoundException);
        }
    }

    @Test
    public void clone_givenObjectThrowingIOExceptionOnRead_shouldThrowSerializationException() {
        // Arrange
        DummyIOExceptionOnRead object = new DummyIOExceptionOnRead();

        // Act & Assert
        try {
            SerializationUtils.clone(object);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertEquals("IOException while reading cloned object data", ex.getMessage());
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
        }
    }

    // -------------------------------------------------------------------------
    // serialize(Serializable, OutputStream) tests
    // -------------------------------------------------------------------------

    @Test
    public void serialize_givenNullOutputStream_shouldThrowIllegalArgumentException() {
        // Arrange
        DummySerializable object = new DummySerializable("test");

        // Act & Assert
        try {
            SerializationUtils.serialize(object, null);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The OutputStream must not be null", ex.getMessage());
        }
    }

    @Test
    public void serialize_givenNullObjectAndValidOutputStream_shouldSerializeSuccessfully() {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Act
        SerializationUtils.serialize(null, baos);

        // Assert
        byte[] bytes = baos.toByteArray();
        Assert.assertTrue(bytes.length > 0);
        Object deserialized = SerializationUtils.deserialize(bytes);
        Assert.assertNull(deserialized);
    }

    @Test
    public void serialize_givenValidObjectAndOutputStream_shouldSerializeSuccessfully() {
        // Arrange
        DummySerializable object = new DummySerializable("hello");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Act
        SerializationUtils.serialize(object, baos);

        // Assert
        byte[] bytes = baos.toByteArray();
        Assert.assertTrue(bytes.length > 0);
        DummySerializable deserialized = (DummySerializable) SerializationUtils.deserialize(bytes);
        Assert.assertEquals(object, deserialized);
    }

    @Test
    public void serialize_givenObjectWithNonSerializableField_shouldThrowSerializationException() {
        // Arrange
        DummyWithNonSerializableField invalidObject = new DummyWithNonSerializableField();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Act & Assert
        try {
            SerializationUtils.serialize(invalidObject, baos);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
        }
    }

    @Test
    public void serialize_givenOutputStreamThrowingIOExceptionOnWrite_shouldThrowSerializationException() {
        // Arrange
        DummySerializable object = new DummySerializable("test");
        OutputStream failingStream = new OutputStream() {
            public void write(int b) throws IOException {
                throw new IOException("Simulated write error");
            }
        };

        // Act & Assert
        try {
            SerializationUtils.serialize(object, failingStream);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertEquals("Simulated write error", ex.getCause().getMessage());
        }
    }

    @Test
    public void serialize_givenOutputStreamThrowingIOExceptionOnClose_shouldIgnoreCloseException() {
        // Arrange
        DummySerializable object = new DummySerializable("test");
        final ByteArrayOutputStream underlyingStream = new ByteArrayOutputStream();
        OutputStream closeFailingStream = new OutputStream() {
            public void write(int b) throws IOException {
                underlyingStream.write(b);
            }

            public void close() throws IOException {
                throw new IOException("Simulated close error");
            }
        };

        // Act
        SerializationUtils.serialize(object, closeFailingStream);

        // Assert
        byte[] bytes = underlyingStream.toByteArray();
        DummySerializable deserialized = (DummySerializable) SerializationUtils.deserialize(bytes);
        Assert.assertEquals(object, deserialized);
    }

    // -------------------------------------------------------------------------
    // serialize(Serializable) tests
    // -------------------------------------------------------------------------

    @Test
    public void serialize_givenValidObject_shouldReturnByteArray() {
        // Arrange
        DummySerializable object = new DummySerializable("data");

        // Act
        byte[] bytes = SerializationUtils.serialize(object);

        // Assert
        Assert.assertNotNull(bytes);
        Assert.assertTrue(bytes.length > 0);
        DummySerializable deserialized = (DummySerializable) SerializationUtils.deserialize(bytes);
        Assert.assertEquals(object, deserialized);
    }

    @Test
    public void serialize_givenNullObject_shouldReturnByteArrayForNull() {
        // Arrange & Act
        byte[] bytes = SerializationUtils.serialize(null);

        // Assert
        Assert.assertNotNull(bytes);
        Assert.assertTrue(bytes.length > 0);
        Object deserialized = SerializationUtils.deserialize(bytes);
        Assert.assertNull(deserialized);
    }

    @Test
    public void serialize_givenObjectWithNonSerializableFieldToByteArray_shouldThrowSerializationException() {
        // Arrange
        DummyWithNonSerializableField object = new DummyWithNonSerializableField();

        // Act & Assert
        try {
            SerializationUtils.serialize(object);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
        }
    }

    // -------------------------------------------------------------------------
    // deserialize(InputStream) tests
    // -------------------------------------------------------------------------

    @Test
    public void deserialize_givenNullInputStream_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        try {
            SerializationUtils.deserialize((InputStream) null);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The InputStream must not be null", ex.getMessage());
        }
    }

    @Test
    public void deserialize_givenValidInputStream_shouldReturnDeserializedObject() {
        // Arrange
        DummySerializable original = new DummySerializable("deserialized");
        byte[] bytes = SerializationUtils.serialize(original);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        // Act
        Object result = SerializationUtils.deserialize(bais);

        // Assert
        Assert.assertEquals(original, result);
    }

    @Test
    public void deserialize_givenSerializedNullStream_shouldReturnNull() {
        // Arrange
        byte[] bytes = SerializationUtils.serialize(null);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        // Act
        Object result = SerializationUtils.deserialize(bais);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void deserialize_givenCorruptedStream_shouldThrowSerializationException() {
        // Arrange
        byte[] corruptedData = new byte[] { (byte) 0xAC, (byte) 0xED, 0x00, 0x05, 0x77, 0x02, 0x01 };
        ByteArrayInputStream bais = new ByteArrayInputStream(corruptedData);

        // Act & Assert
        try {
            SerializationUtils.deserialize(bais);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
        }
    }

    @Test
    public void deserialize_givenInputStreamThrowingIOExceptionOnRead_shouldThrowSerializationException() {
        // Arrange
        InputStream failingStream = new InputStream() {
            public int read() throws IOException {
                throw new IOException("Simulated read error");
            }
        };

        // Act & Assert
        try {
            SerializationUtils.deserialize(failingStream);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertEquals("Simulated read error", ex.getCause().getMessage());
        }
    }

    @Test
    public void deserialize_givenInputStreamThrowingIOExceptionOnClose_shouldIgnoreCloseException() {
        // Arrange
        DummySerializable original = new DummySerializable("close-test");
        byte[] bytes = SerializationUtils.serialize(original);
        final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        InputStream closeFailingStream = new InputStream() {
            public int read() throws IOException {
                return bais.read();
            }

            public int read(byte[] b, int off, int len) throws IOException {
                return bais.read(b, off, len);
            }

            public void close() throws IOException {
                throw new IOException("Simulated close error");
            }
        };

        // Act
        Object result = SerializationUtils.deserialize(closeFailingStream);

        // Assert
        Assert.assertEquals(original, result);
    }

    @Test
    public void deserialize_givenObjectThrowingClassNotFound_shouldThrowSerializationException() {
        // Arrange
        byte[] bytes = SerializationUtils.serialize(new DummyClassNotFoundOnRead());
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        // Act & Assert
        try {
            SerializationUtils.deserialize(bais);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof ClassNotFoundException);
        }
    }

    // -------------------------------------------------------------------------
    // deserialize(byte[]) tests
    // -------------------------------------------------------------------------

    @Test
    public void deserialize_givenNullByteArray_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        try {
            SerializationUtils.deserialize((byte[]) null);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The byte[] must not be null", ex.getMessage());
        }
    }

    @Test
    public void deserialize_givenValidByteArray_shouldReturnDeserializedObject() {
        // Arrange
        DummySerializable original = new DummySerializable("bytes-test");
        byte[] bytes = SerializationUtils.serialize(original);

        // Act
        Object result = SerializationUtils.deserialize(bytes);

        // Assert
        Assert.assertEquals(original, result);
    }

    @Test
    public void deserialize_givenEmptyByteArray_shouldThrowSerializationException() {
        // Arrange
        byte[] emptyBytes = new byte[0];

        // Act & Assert
        try {
            SerializationUtils.deserialize(emptyBytes);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
        }
    }

    @Test
    public void deserialize_givenCorruptedByteArray_shouldThrowSerializationException() {
        // Arrange
        byte[] invalidHeader = new byte[] { 0x01, 0x02, 0x03, 0x04 };

        // Act & Assert
        try {
            SerializationUtils.deserialize(invalidHeader);
            Assert.fail("Expected SerializationException was not thrown");
        } catch (SerializationException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
        }
    }

    // -------------------------------------------------------------------------
    // ClassLoaderAwareObjectInputStream tests
    // -------------------------------------------------------------------------

    @Test
    public void classLoaderAwareObjectInputStream_givenClassPresentInParamLoader_shouldResolveClass() throws Exception {
        // Arrange
        byte[] data = SerializationUtils.serialize(new DummySerializable("stream-test"));
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TestClassLoaderAwareObjectInputStream in =
                new TestClassLoaderAwareObjectInputStream(bais, DummySerializable.class.getClassLoader());
        ObjectStreamClass desc = ObjectStreamClass.lookup(DummySerializable.class);

        // Act
        Class<?> resolvedClass = in.resolveClassForTest(desc);

        // Assert
        Assert.assertEquals(DummySerializable.class, resolvedClass);
        in.close();
    }

    @Test
    public void classLoaderAwareObjectInputStream_givenClassAbsentInParamLoaderPresentInContextLoader_shouldResolveClass()
            throws Exception {
        // Arrange
        ClassLoader emptyClassLoader = new ClassLoader(null) {
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                throw new ClassNotFoundException(name);
            }
        };

        byte[] data = SerializationUtils.serialize(new DummySerializable("stream-test"));
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TestClassLoaderAwareObjectInputStream in =
                new TestClassLoaderAwareObjectInputStream(bais, emptyClassLoader);
        ObjectStreamClass desc = ObjectStreamClass.lookup(DummySerializable.class);

        // Act
        Class<?> resolvedClass = in.resolveClassForTest(desc);

        // Assert
        Assert.assertEquals(DummySerializable.class, resolvedClass);
        in.close();
    }

    @Test
    public void classLoaderAwareObjectInputStream_givenClassAbsentInBothLoaders_shouldThrowClassNotFoundException()
            throws Exception {
        // Arrange
        ClassLoader emptyClassLoader = new ClassLoader(null) {
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                throw new ClassNotFoundException(name);
            }
        };

        ClassLoader originalContextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(emptyClassLoader);

            byte[] data = SerializationUtils.serialize(new DummySerializable("stream-test"));
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            TestClassLoaderAwareObjectInputStream in =
                    new TestClassLoaderAwareObjectInputStream(bais, emptyClassLoader);
            ObjectStreamClass desc = ObjectStreamClass.lookup(DummySerializable.class);

            // Act & Assert
            try {
                in.resolveClassForTest(desc);
                Assert.fail("Expected ClassNotFoundException was not thrown");
            } catch (ClassNotFoundException ex) {
                Assert.assertEquals(DummySerializable.class.getName(), ex.getMessage());
            } finally {
                in.close();
            }
        } finally {
            Thread.currentThread().setContextClassLoader(originalContextClassLoader);
        }
    }
}