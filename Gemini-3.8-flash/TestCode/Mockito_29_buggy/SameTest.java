package org.mockito.internal.matchers;

import org.hamcrest.Description;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SameTest {

    private Description createDescriptionMock(final StringBuffer buffer) {
        return (Description) Proxy.newProxyInstance(
                Description.class.getClassLoader(),
                new Class[] { Description.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("appendText".equals(method.getName()) && args != null && args.length == 1) {
                            buffer.append(args[0]);
                            return proxy;
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void matches_givenSameObjectReference_shouldReturnTrue() {
        // Arrange
        Object target = new Object();
        Same matcher = new Same(target);

        // Act
        boolean result = matcher.matches(target);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void matches_givenDifferentObjectReferenceWithEqualValue_shouldReturnFalse() {
        // Arrange
        String first = new String("test");
        String second = new String("test");
        Same matcher = new Same(first);

        // Act
        boolean result = matcher.matches(second);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void matches_givenBothNullReferences_shouldReturnTrue() {
        // Arrange
        Same matcher = new Same(null);

        // Act
        boolean result = matcher.matches(null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void matches_givenWantedNullAndActualNonNull_shouldReturnFalse() {
        // Arrange
        Same matcher = new Same(null);
        Object actual = new Object();

        // Act
        boolean result = matcher.matches(actual);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void matches_givenWantedNonNullAndActualNull_shouldReturnFalse() {
        // Arrange
        Same matcher = new Same(new Object());

        // Act
        boolean result = matcher.matches(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void describeTo_givenStringWanted_shouldFormatWithDoubleQuotes() {
        // Arrange
        String wantedText = "hello";
        Same matcher = new Same(wantedText);
        StringBuffer buffer = new StringBuffer();
        Description description = createDescriptionMock(buffer);

        // Act
        matcher.describeTo(description);

        // Assert
        Assert.assertEquals("same(\"hello\")", buffer.toString());
    }

    @Test
    public void describeTo_givenEmptyStringWanted_shouldFormatWithEmptyDoubleQuotes() {
        // Arrange
        String wantedText = "";
        Same matcher = new Same(wantedText);
        StringBuffer buffer = new StringBuffer();
        Description description = createDescriptionMock(buffer);

        // Act
        matcher.describeTo(description);

        // Assert
        Assert.assertEquals("same(\"\")", buffer.toString());
    }

    @Test
    public void describeTo_givenCharacterWanted_shouldFormatWithSingleQuotes() {
        // Arrange
        Character wantedChar = Character.valueOf('x');
        Same matcher = new Same(wantedChar);
        StringBuffer buffer = new StringBuffer();
        Description description = createDescriptionMock(buffer);

        // Act
        matcher.describeTo(description);

        // Assert
        Assert.assertEquals("same('x')", buffer.toString());
    }

    @Test
    public void describeTo_givenIntegerWanted_shouldFormatWithoutQuotes() {
        // Arrange
        Integer wantedNumber = Integer.valueOf(12345);
        Same matcher = new Same(wantedNumber);
        StringBuffer buffer = new StringBuffer();
        Description description = createDescriptionMock(buffer);

        // Act
        matcher.describeTo(description);

        // Assert
        Assert.assertEquals("same(12345)", buffer.toString());
    }

    @Test
    public void describeTo_givenCustomObjectWanted_shouldFormatWithoutQuotes() {
        // Arrange
        Object customObject = new Object() {
            public String toString() {
                return "CustomObjectRepresentation";
            }
        };
        Same matcher = new Same(customObject);
        StringBuffer buffer = new StringBuffer();
        Description description = createDescriptionMock(buffer);

        // Act
        matcher.describeTo(description);

        // Assert
        Assert.assertEquals("same(CustomObjectRepresentation)", buffer.toString());
    }

    @Test(expected = NullPointerException.class)
    public void describeTo_givenNullWanted_shouldThrowNullPointerException() {
        // Arrange
        Same matcher = new Same(null);
        StringBuffer buffer = new StringBuffer();
        Description description = createDescriptionMock(buffer);

        // Act
        matcher.describeTo(description);

        // Assert via expected NullPointerException
    }

    @Test
    public void serialization_givenSameInstance_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        String payload = "serializablePayload";
        Same originalMatcher = new Same(payload);
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objectOut = new ObjectOutputStream(byteOut);

        // Act
        objectOut.writeObject(originalMatcher);
        objectOut.flush();

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream objectIn = new ObjectInputStream(byteIn);
        Same deserializedMatcher = (Same) objectIn.readObject();

        // Assert
        Assert.assertNotNull(deserializedMatcher);
        Assert.assertTrue(deserializedMatcher.matches(payload));
        Assert.assertFalse(deserializedMatcher.matches("other"));
    }
}