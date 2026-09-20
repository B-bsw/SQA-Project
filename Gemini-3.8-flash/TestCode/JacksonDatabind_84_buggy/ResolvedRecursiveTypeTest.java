package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Test;

public class ResolvedRecursiveTypeTest {

    private static class StubJavaType extends ResolvedRecursiveType {
        private static final long serialVersionUID = 1L;
        private final String genericSig;
        private final String erasedSig;

        public StubJavaType(Class<?> erasedType, String genericSig, String erasedSig) {
            super(erasedType, TypeBindings.emptyBindings());
            this.genericSig = genericSig;
            this.erasedSig = erasedSig;
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            return sb.append(this.genericSig);
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            return sb.append(this.erasedSig);
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o == null || o.getClass() != getClass()) {
                return false;
            }
            StubJavaType other = (StubJavaType) o;
            return getRawClass() == other.getRawClass();
        }
    }

    @Test
    public void constructor_givenValidErasedTypeAndBindings_shouldInitializeWithNullReference() {
        // Arrange & Act
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Assert
        Assert.assertNull(type.getSelfReferencedType());
        Assert.assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void constructor_givenNullBindings_shouldInitializeCorrectly() {
        // Arrange & Act
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, null);

        // Assert
        Assert.assertNull(type.getSelfReferencedType());
        Assert.assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void setReference_givenInitialReference_shouldStoreReference() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType ref = new StubJavaType(String.class, "Ljava/lang/String;", "Ljava/lang/String;");

        // Act
        type.setReference(ref);

        // Assert
        Assert.assertSame(ref, type.getSelfReferencedType());
    }

    @Test
    public void setReference_givenAlreadyReferenced_shouldThrowIllegalStateException() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType firstRef = new StubJavaType(String.class, "Ljava/lang/String;", "Ljava/lang/String;");
        JavaType secondRef = new StubJavaType(Integer.class, "Ljava/lang/Integer;", "Ljava/lang/Integer;");
        type.setReference(firstRef);

        // Act & Assert
        try {
            type.setReference(secondRef);
            Assert.fail("Expected IllegalStateException when re-setting reference");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().indexOf("Trying to re-set self reference") >= 0);
            Assert.assertTrue(e.getMessage().indexOf("old value = " + firstRef) >= 0);
            Assert.assertTrue(e.getMessage().indexOf("new = " + secondRef) >= 0);
        }
    }

    @Test
    public void getSelfReferencedType_givenNoReference_shouldReturnNull() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        JavaType ref = type.getSelfReferencedType();

        // Assert
        Assert.assertNull(ref);
    }

    @Test
    public void getSelfReferencedType_givenReferenceSet_shouldReturnReference() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType expectedRef = new StubJavaType(String.class, "Ljava/lang/String;", "Ljava/lang/String;");
        type.setReference(expectedRef);

        // Act
        JavaType actualRef = type.getSelfReferencedType();

        // Assert
        Assert.assertSame(expectedRef, actualRef);
    }

    @Test
    public void getGenericSignature_givenValidReference_shouldDelegateToReferencedType() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType ref = new StubJavaType(String.class, "Ljava/lang/String;", "Ljava/lang/String;");
        type.setReference(ref);
        StringBuilder sb = new StringBuilder();

        // Act
        StringBuilder result = type.getGenericSignature(sb);

        // Assert
        Assert.assertSame(sb, result);
        Assert.assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void getErasedSignature_givenValidReference_shouldDelegateToReferencedType() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType ref = new StubJavaType(String.class, "Ljava/lang/String;", "Ljava/lang/String;");
        type.setReference(ref);
        StringBuilder sb = new StringBuilder();

        // Act
        StringBuilder result = type.getErasedSignature(sb);

        // Assert
        Assert.assertSame(sb, result);
        Assert.assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void withContentType_givenAnyType_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType dummyType = new StubJavaType(Integer.class, "", "");

        // Act
        JavaType result = type.withContentType(dummyType);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withTypeHandler_givenAnyHandler_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        Object handler = new Object();

        // Act
        JavaType result = type.withTypeHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withContentTypeHandler_givenAnyHandler_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        Object handler = new Object();

        // Act
        JavaType result = type.withContentTypeHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withValueHandler_givenAnyHandler_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        Object handler = new Object();

        // Act
        JavaType result = type.withValueHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withContentValueHandler_givenAnyHandler_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        Object handler = new Object();

        // Act
        JavaType result = type.withContentValueHandler(handler);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void withStaticTyping_givenInvocation_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        JavaType result = type.withStaticTyping();

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void _narrow_givenSubclass_shouldReturnSameInstance() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());

        // Act
        JavaType result = type._narrow(String.class);

        // Assert
        Assert.assertSame(type, result);
    }

    @Test
    public void refine_givenAnyArguments_shouldReturnNull() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType superClass = new StubJavaType(Object.class, "", "");
        JavaType[] interfaces = new JavaType[0];

        // Act
        JavaType result = type.refine(String.class, TypeBindings.emptyBindings(), superClass, interfaces);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isContainerType_givenInvocation_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        boolean result = type.isContainerType();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void toString_givenUnresolvedReference_shouldReturnUnresolvedString() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        String result = type.toString();

        // Assert
        Assert.assertEquals("[recursive type; UNRESOLVED", result);
    }

    @Test
    public void toString_givenResolvedReference_shouldReturnStringWithRawClassName() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType ref = new StubJavaType(String.class, "", "");
        type.setReference(ref);

        // Act
        String result = type.toString();

        // Assert
        Assert.assertEquals("[recursive type; java.lang.String", result);
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        boolean result = type.equals(type);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_givenNullObject_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(new StubJavaType(String.class, "", ""));

        // Act
        boolean result = type.equals(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenUnresolvedType_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        boolean result = type1.equals(type2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenDifferentClassType_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(new StubJavaType(String.class, "", ""));
        Object other = "some-string";

        // Act
        boolean result = type.equals(other);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenSameReferencedType_shouldReturnTrue() {
        // Arrange
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        JavaType ref1 = new StubJavaType(String.class, "", "");
        JavaType ref2 = new StubJavaType(String.class, "", "");

        type1.setReference(ref1);
        type2.setReference(ref2);

        // Act
        boolean result = type1.equals(type2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_givenDifferentReferencedType_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());

        JavaType ref1 = new StubJavaType(String.class, "", "");
        JavaType ref2 = new StubJavaType(Integer.class, "", "");

        type1.setReference(ref1);
        type2.setReference(ref2);

        // Act
        boolean result = type1.equals(type2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equals_givenResolvedComparingToUnresolved_shouldReturnFalse() {
        // Arrange
        ResolvedRecursiveType resolved = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        resolved.setReference(new StubJavaType(String.class, "", ""));

        ResolvedRecursiveType unresolved = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());

        // Act
        boolean result = resolved.equals(unresolved);

        // Assert
        Assert.assertFalse(result);
    }
}