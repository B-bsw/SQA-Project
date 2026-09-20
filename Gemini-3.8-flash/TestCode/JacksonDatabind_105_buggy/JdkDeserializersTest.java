package com.fasterxml.jackson.databind.deser.std;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonDeserializer;

public class JdkDeserializersTest {

    @Test
    public void constructor_whenInstantiated_shouldNotBeNull() {
        // Arrange & Act
        JdkDeserializers deserializers = new JdkDeserializers();

        // Assert
        Assert.assertNotNull(deserializers);
    }

    @Test
    public void find_givenUuidClass_shouldReturnUuidDeserializer() {
        // Arrange
        Class<?> rawType = UUID.class;
        String clsName = rawType.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNotNull(deserializer);
        Assert.assertTrue(deserializer instanceof UUIDDeserializer);
    }

    @Test
    public void find_givenStackTraceElementClass_shouldReturnStackTraceElementDeserializer() {
        // Arrange
        Class<?> rawType = StackTraceElement.class;
        String clsName = rawType.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNotNull(deserializer);
        Assert.assertTrue(deserializer instanceof StackTraceElementDeserializer);
    }

    @Test
    public void find_givenAtomicBooleanClass_shouldReturnAtomicBooleanDeserializer() {
        // Arrange
        Class<?> rawType = AtomicBoolean.class;
        String clsName = rawType.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNotNull(deserializer);
        Assert.assertTrue(deserializer instanceof AtomicBooleanDeserializer);
    }

    @Test
    public void find_givenByteBufferClass_shouldReturnByteBufferDeserializer() {
        // Arrange
        Class<?> rawType = ByteBuffer.class;
        String clsName = rawType.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNotNull(deserializer);
        Assert.assertTrue(deserializer instanceof ByteBufferDeserializer);
    }

    @Test
    public void find_givenAllFromStringDeserializerTypes_shouldReturnValidDeserializers() {
        // Arrange
        Class<?>[] types = FromStringDeserializer.types();

        // Act & Assert
        for (int i = 0; i < types.length; i++) {
            Class<?> rawType = types[i];
            String clsName = rawType.getName();
            JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);
            Assert.assertNotNull("Deserializer for " + clsName + " should not be null", deserializer);
        }
    }

    @Test
    public void find_givenStandardFromStringTypesExplicitly_shouldReturnNonNullDeserializers() {
        // Arrange
        Class<?>[] explicitTypes = new Class<?>[] {
            File.class,
            URL.class,
            URI.class,
            Currency.class,
            Pattern.class,
            Locale.class,
            Charset.class,
            TimeZone.class,
            InetAddress.class,
            InetSocketAddress.class
        };

        // Act & Assert
        for (int i = 0; i < explicitTypes.length; i++) {
            Class<?> rawType = explicitTypes[i];
            String clsName = rawType.getName();
            JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);
            Assert.assertNotNull("Expected deserializer for: " + clsName, deserializer);
        }
    }

    @Test
    public void find_givenUnknownClassName_shouldReturnNull() {
        // Arrange
        Class<?> rawType = String.class;
        String clsName = rawType.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenNonJdkCustomClass_shouldReturnNull() {
        // Arrange
        Class<?> rawType = JdkDeserializers.class;
        String clsName = rawType.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenNullClassName_shouldReturnNull() {
        // Arrange
        Class<?> rawType = UUID.class;
        String clsName = null;

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenEmptyClassName_shouldReturnNull() {
        // Arrange
        Class<?> rawType = UUID.class;
        String clsName = "";

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, clsName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenValidClassNameWithMismatchedRawType_shouldReturnNull() {
        // Arrange: clsName is in _classNames but rawType is mismatched and does not match any branch
        Class<?> mismatchedRawType = Object.class;
        String validClassName = UUID.class.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(mismatchedRawType, validClassName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenValidByteBufferClassNameWithMismatchedRawType_shouldReturnNull() {
        // Arrange
        Class<?> mismatchedRawType = String.class;
        String validClassName = ByteBuffer.class.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(mismatchedRawType, validClassName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenValidAtomicBooleanClassNameWithMismatchedRawType_shouldReturnNull() {
        // Arrange
        Class<?> mismatchedRawType = Integer.class;
        String validClassName = AtomicBoolean.class.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(mismatchedRawType, validClassName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenValidStackTraceElementClassNameWithMismatchedRawType_shouldReturnNull() {
        // Arrange
        Class<?> mismatchedRawType = Exception.class;
        String validClassName = StackTraceElement.class.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(mismatchedRawType, validClassName);

        // Assert
        Assert.assertNull(deserializer);
    }

    @Test
    public void find_givenNullRawTypeWithValidClassName_shouldReturnNull() {
        // Arrange
        Class<?> rawType = null;
        String validClassName = UUID.class.getName();

        // Act
        JsonDeserializer<?> deserializer = JdkDeserializers.find(rawType, validClassName);

        // Assert
        Assert.assertNull(deserializer);
    }
}