package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

public class ReferenceTypeTest {

    private JavaType refTargetType;
    private JavaType refTargetType2;
    private ReferenceType baseReferenceType;

    @Before
    public void setUp() {
        TypeFactory tf = TypeFactory.defaultInstance();
        refTargetType = tf.constructType(String.class);
        refTargetType2 = tf.constructType(Integer.class);
        baseReferenceType = ReferenceType.construct(AtomicReference.class, refTargetType, null, null);
    }

    @Test
    public void construct_givenValidArguments_shouldInitializeProperly() {
        // Arrange
        Object dummyValueHandler = "dummyVal";
        Object dummyTypeHandler = "dummyType";

        // Act
        ReferenceType refType = ReferenceType.construct(
                AtomicReference.class,
                refTargetType,
                dummyValueHandler,
                dummyTypeHandler
        );

        // Assert
        Assert.assertNotNull(refType);
        Assert.assertEquals(AtomicReference.class, refType.getRawClass());
        Assert.assertEquals(refTargetType, refType.getReferencedType());
        Assert.assertNull(refType.getValueHandler());
        Assert.assertNull(refType.getTypeHandler());
        Assert.assertFalse(refType.useStaticTyping());
    }

    @Test
    public void withTypeHandler_givenSameHandler_shouldReturnSameInstance() {
        // Arrange & Act
        ReferenceType result = baseReferenceType.withTypeHandler(null);

        // Assert
        Assert.assertSame(baseReferenceType, result);
    }

    @Test
    public void withTypeHandler_givenDifferentHandler_shouldReturnNewInstanceWithUpdatedHandler() {
        // Arrange
        String newHandler = "newTypeHandler";

        // Act
        ReferenceType result = baseReferenceType.withTypeHandler(newHandler);

        // Assert
        Assert.assertNotSame(baseReferenceType, result);
        Assert.assertEquals(newHandler, result.getTypeHandler());
        Assert.assertEquals(baseReferenceType.getValueHandler(), result.getValueHandler());
        Assert.assertEquals(baseReferenceType.getReferencedType(), result.getReferencedType());
        Assert.assertEquals(baseReferenceType.useStaticTyping(), result.useStaticTyping());

        // Test returning same when handler matches new one
        ReferenceType sameResult = result.withTypeHandler(newHandler);
        Assert.assertSame(result, sameResult);
    }

    @Test
    public void withContentTypeHandler_givenSameHandler_shouldReturnSameInstance() {
        // Arrange & Act
        ReferenceType result = baseReferenceType.withContentTypeHandler(null);

        // Assert
        Assert.assertSame(baseReferenceType, result);
    }

    @Test
    public void withContentTypeHandler_givenDifferentHandler_shouldReturnNewInstance() {
        // Arrange
        String contentTypeHandler = "newContentTypeHandler";

        // Act
        ReferenceType result = baseReferenceType.withContentTypeHandler(contentTypeHandler);

        // Assert
        Assert.assertNotSame(baseReferenceType, result);
        Assert.assertNotNull(result.getReferencedType());
        Assert.assertEquals(contentTypeHandler, result.getReferencedType().getTypeHandler());

        // Calling again with same handler should return same ReferenceType
        ReferenceType sameResult = result.withContentTypeHandler(contentTypeHandler);
        Assert.assertSame(result, sameResult);
    }

    @Test
    public void withValueHandler_givenSameHandler_shouldReturnSameInstance() {
        // Arrange & Act
        ReferenceType result = baseReferenceType.withValueHandler(null);

        // Assert
        Assert.assertSame(baseReferenceType, result);
    }

    @Test
    public void withValueHandler_givenDifferentHandler_shouldReturnNewInstanceWithUpdatedHandler() {
        // Arrange
        String newValueHandler = "newValueHandler";

        // Act
        ReferenceType result = baseReferenceType.withValueHandler(newValueHandler);

        // Assert
        Assert.assertNotSame(baseReferenceType, result);
        Assert.assertEquals(newValueHandler, result.getValueHandler());
        Assert.assertEquals(baseReferenceType.getTypeHandler(), result.getTypeHandler());
        Assert.assertEquals(baseReferenceType.getReferencedType(), result.getReferencedType());
        Assert.assertEquals(baseReferenceType.useStaticTyping(), result.useStaticTyping());

        // Test returning same when handler matches new one
        ReferenceType sameResult = result.withValueHandler(newValueHandler);
        Assert.assertSame(result, sameResult);
    }

    @Test
    public void withContentValueHandler_givenSameHandler_shouldReturnSameInstance() {
        // Arrange & Act
        ReferenceType result = baseReferenceType.withContentValueHandler(null);

        // Assert
        Assert.assertSame(baseReferenceType, result);
    }

    @Test
    public void withContentValueHandler_givenDifferentHandler_shouldReturnNewInstance() {
        // Arrange
        String contentValueHandler = "newContentValueHandler";

        // Act
        ReferenceType result = baseReferenceType.withContentValueHandler(contentValueHandler);

        // Assert
        Assert.assertNotSame(baseReferenceType, result);
        Assert.assertNotNull(result.getReferencedType());
        Assert.assertEquals(contentValueHandler, result.getReferencedType().getValueHandler());

        // Calling again with same handler should return same ReferenceType
        ReferenceType sameResult = result.withContentValueHandler(contentValueHandler);
        Assert.assertSame(result, sameResult);
    }

    @Test
    public void withStaticTyping_givenNonStatic_shouldReturnNewInstanceWithStaticTyping() {
        // Arrange
        Assert.assertFalse(baseReferenceType.useStaticTyping());

        // Act
        ReferenceType staticRef = baseReferenceType.withStaticTyping();

        // Assert
        Assert.assertNotSame(baseReferenceType, staticRef);
        Assert.assertTrue(staticRef.useStaticTyping());
        Assert.assertTrue(staticRef.getReferencedType().useStaticTyping());

        // Act & Assert when already static
        ReferenceType idempotentStaticRef = staticRef.withStaticTyping();
        Assert.assertSame(staticRef, idempotentStaticRef);
    }

    @Test
    public void buildCanonicalName_givenValidReferenceType_shouldFormatCorrectly() {
        // Arrange & Act
        String canonical = baseReferenceType.buildCanonicalName();

        // Assert
        String expected = AtomicReference.class.getName() + "<" + refTargetType.toCanonical() + ">";
        Assert.assertEquals(expected, canonical);
    }

    @Test
    public void _narrow_givenSubclass_shouldReturnNarrowedReferenceType() {
        // Arrange
        Class<?> subclass = AtomicReference.class;

        // Act
        JavaType narrowed = baseReferenceType._narrow(subclass);

        // Assert
        Assert.assertNotNull(narrowed);
        Assert.assertTrue(narrowed instanceof ReferenceType);
        Assert.assertEquals(subclass, narrowed.getRawClass());
        Assert.assertEquals(baseReferenceType.getReferencedType(), ((ReferenceType) narrowed).getReferencedType());
    }

    @Test
    public void isReferenceType_shouldAlwaysReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(baseReferenceType.isReferenceType());
    }

    @Test
    public void getReferencedType_shouldReturnConfiguredType() {
        // Arrange & Act & Assert
        Assert.assertSame(refTargetType, baseReferenceType.getReferencedType());
    }

    @Test
    public void containedTypeCount_shouldAlwaysReturnOne() {
        // Arrange & Act & Assert
        Assert.assertEquals(1, baseReferenceType.containedTypeCount());
    }

    @Test
    public void containedType_givenIndexZero_shouldReturnReferencedType() {
        // Arrange & Act
        JavaType type = baseReferenceType.containedType(0);

        // Assert
        Assert.assertSame(refTargetType, type);
    }

    @Test
    public void containedType_givenIndexOutOfRange_shouldReturnNull() {
        // Boundary check: index 1 and -1
        Assert.assertNull(baseReferenceType.containedType(1));
        Assert.assertNull(baseReferenceType.containedType(-1));
        Assert.assertNull(baseReferenceType.containedType(99));
    }

    @Test
    public void containedTypeName_givenIndexZero_shouldReturnT() {
        // Arrange & Act
        String name = baseReferenceType.containedTypeName(0);

        // Assert
        Assert.assertEquals("T", name);
    }

    @Test
    public void containedTypeName_givenIndexOutOfRange_shouldReturnNull() {
        // Boundary check: index 1 and -1
        Assert.assertNull(baseReferenceType.containedTypeName(1));
        Assert.assertNull(baseReferenceType.containedTypeName(-1));
        Assert.assertNull(baseReferenceType.containedTypeName(99));
    }

    @Test
    public void getParameterSource_shouldReturnRawClass() {
        // Arrange & Act
        Class<?> source = baseReferenceType.getParameterSource();

        // Assert
        Assert.assertEquals(AtomicReference.class, source);
    }

    @Test
    public void getErasedSignature_givenStringBuilder_shouldAppendSignature() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        StringBuilder result = baseReferenceType.getErasedSignature(sb);

        // Assert
        Assert.assertSame(sb, result);
        Assert.assertEquals("Ljava/util/concurrent/atomic/AtomicReference;", result.toString());
    }

    @Test
    public void getGenericSignature_givenStringBuilder_shouldAppendFullGenericSignature() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        StringBuilder result = baseReferenceType.getGenericSignature(sb);

        // Assert
        Assert.assertSame(sb, result);
        String expected = "Ljava/util/concurrent/atomic/AtomicReference<" + refTargetType.getGenericSignature() + ";";
        Assert.assertEquals(expected, result.toString());
    }

    @Test
    public void toString_shouldContainReferenceTypeDetails() {
        // Arrange & Act
        String str = baseReferenceType.toString();

        // Assert
        Assert.assertNotNull(str);
        Assert.assertTrue(str.startsWith("[reference type, class "));
        Assert.assertTrue(str.contains(baseReferenceType.buildCanonicalName()));
        Assert.assertTrue(str.endsWith("]"));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Act & Assert
        Assert.assertTrue(baseReferenceType.equals(baseReferenceType));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(baseReferenceType.equals(null));
    }

    @Test
    public void equals_givenDifferentClass_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(baseReferenceType.equals("string-instance"));
        Assert.assertFalse(baseReferenceType.equals(refTargetType));
    }

    @Test
    public void equals_givenDifferentRawClass_shouldReturnFalse() {
        // Arrange
        ReferenceType other = new ReferenceType(
                Object.class,
                refTargetType,
                null,
                null,
                false
        );

        // Act & Assert
        Assert.assertFalse(baseReferenceType.equals(other));
        Assert.assertFalse(other.equals(baseReferenceType));
    }

    @Test
    public void equals_givenDifferentReferencedType_shouldReturnFalse() {
        // Arrange
        ReferenceType other = ReferenceType.construct(
                AtomicReference.class,
                refTargetType2,
                null,
                null
        );

        // Act & Assert
        Assert.assertFalse(baseReferenceType.equals(other));
        Assert.assertFalse(other.equals(baseReferenceType));
    }

    @Test
    public void equals_givenSameAttributes_shouldReturnTrue() {
        // Arrange
        ReferenceType copy = ReferenceType.construct(
                AtomicReference.class,
                refTargetType,
                null,
                null
        );

        // Act & Assert
        Assert.assertTrue(baseReferenceType.equals(copy));
        Assert.assertTrue(copy.equals(baseReferenceType));
        Assert.assertEquals(baseReferenceType.hashCode(), copy.hashCode());
    }

    @Test
    public void protectedConstructor_givenFullParameters_shouldInitializeAllFields() {
        // Arrange
        Object vh = new Object();
        Object th = new Object();

        // Act
        ReferenceType type = new ReferenceType(
                AtomicReference.class,
                refTargetType,
                vh,
                th,
                true
        );

        // Assert
        Assert.assertEquals(AtomicReference.class, type.getRawClass());
        Assert.assertSame(refTargetType, type.getReferencedType());
        Assert.assertSame(vh, type.getValueHandler());
        Assert.assertSame(th, type.getTypeHandler());
        Assert.assertTrue(type.useStaticTyping());
    }
}