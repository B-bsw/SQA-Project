package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ResolvedRecursiveTypeTest {

    private TypeBindings emptyBindings;
    private JavaType stringType;
    private JavaType integerType;

    @Before
    public void setUp() {
        emptyBindings = TypeBindings.emptyBindings();
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        integerType = TypeFactory.defaultInstance().constructType(Integer.class);
    }

    @Test
    public void constructor_givenClassAndBindings_shouldInitializeCorrectly() {
        // Arrange & Act
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Assert
        Assert.assertEquals(String.class, type.getRawClass());
        Assert.assertNull(type.getSelfReferencedType());
    }

    @Test
    public void setReference_givenValidReference_shouldSetReferencedType() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act
        type.setReference(stringType);

        // Assert
        Assert.assertSame(stringType, type.getSelfReferencedType());
    }

    @Test
    public void setReference_givenAlreadySetReference_shouldThrowIllegalStateException() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        type.setReference(stringType);

        // Act & Assert
        try {
            type.setReference(integerType);
            Assert.fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            String message = ex.getMessage();
            Assert.assertTrue(message.indexOf("Trying to re-set self reference") != -1);
            Assert.assertTrue(message.indexOf(stringType.toString()) != -1);
            Assert.assertTrue(message.indexOf(integerType.toString()) != -1);
        }
    }

    @Test
    public void getGenericSignature_givenResolvedReference_shouldDelegateToReferencedType() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        type.setReference(stringType);
        StringBuilder sb = new StringBuilder();

        // Act
        StringBuilder result = type.getGenericSignature(sb);

        // Assert
        Assert.assertSame(sb, result);
        Assert.assertEquals(stringType.getGenericSignature(), result.toString());
    }

    @Test
    public void getErasedSignature_givenResolvedReference_shouldDelegateToReferencedType() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        type.setReference(stringType);
        StringBuilder sb = new StringBuilder();

        // Act
        StringBuilder result = type.getErasedSignature(sb);

        // Assert
        Assert.assertSame(sb, result);
        Assert.assertEquals(stringType.getErasedSignature(), result.toString());
    }

    @Test
    public void withContentType_givenContentType_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act
        JavaType result = type.withContentType(stringType);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withTypeHandler_givenHandler_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        Object handler = new Object();

        // Act
        JavaType result = type.withTypeHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withContentTypeHandler_givenHandler_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        Object handler = new Object();

        // Act
        JavaType result = type.withContentTypeHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withValueHandler_givenHandler_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        Object handler = new Object();

        // Act
        JavaType result = type.withValueHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withContentValueHandler_givenHandler_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        Object handler = new Object();

        // Act
        JavaType result = type.withContentValueHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withStaticTyping_whenCalled_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act
        JavaType result = type.withStaticTyping();

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void narrow_givenSubclass_shouldReturnThis() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, emptyBindings);

        // Act
        JavaType result = type._narrow(String.class);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void refine_givenParameters_shouldReturnNull() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act
        JavaType result = type.refine(String.class, emptyBindings, null, null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isContainerType_whenCalled_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act
        boolean result = type.isContainerType();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void toString_givenUnresolvedReference_shouldReturnUnresolvedMessage() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act
        String result = type.toString();

        // Assert
        Assert.assertEquals("[recursive type; UNRESOLVED", result);
    }

    @Test
    public void toString_givenResolvedReference_shouldIncludeClassName() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        type.setReference(stringType);

        // Act
        String result = type.toString();

        // Assert
        Assert.assertEquals("[recursive type; " + String.class.getName(), result);
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act & Assert
        Assert.assertTrue(type.equals(type));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        type.setReference(stringType);

        // Act & Assert
        Assert.assertFalse(type.equals(null));
    }

    @Test
    public void equals_givenUnresolvedInstanceComparedWithAnother_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, emptyBindings);
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, emptyBindings);

        // Act & Assert
        Assert.assertFalse(type1.equals(type2));
    }

    @Test
    public void equals_givenDifferentClassType_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, emptyBindings);
        type.setReference(stringType);

        // Act & Assert
        Assert.assertFalse(type.equals("aStringObject"));
        Assert.assertFalse(type.equals(stringType));
    }

    @Test
    public void equals_givenDifferentReferencedType_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, emptyBindings);
        type1.setReference(stringType);

        ResolvedRecursiveType type2 = new ResolvedRecursiveType(Integer.class, emptyBindings);
        type2.setReference(integerType);

        // Act & Assert
        Assert.assertFalse(type1.equals(type2));
    }

    @Test
    public void equals_givenSameReferencedType_shouldReturnTrue() {
        // Arrange
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, emptyBindings);
        type1.setReference(stringType);

        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, emptyBindings);
        type2.setReference(stringType);

        // Act & Assert
        Assert.assertTrue(type1.equals(type2));
    }
}