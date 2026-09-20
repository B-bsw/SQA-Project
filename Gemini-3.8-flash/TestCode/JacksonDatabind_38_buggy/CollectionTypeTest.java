package com.fasterxml.jackson.databind.type;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;

public class CollectionTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType integerType;
    private CollectionType collectionType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        integerType = typeFactory.constructType(Integer.class);
        collectionType = CollectionType.construct(
                ArrayList.class,
                TypeBindings.emptyBindings(),
                typeFactory.constructType(Object.class),
                new JavaType[0],
                stringType
        );
    }

    @Test
    public void construct_givenExplicitBindingsAndSupers_shouldPopulateFieldsCorrectly() {
        // Arrange
        Class<?> rawClass = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = typeFactory.constructType(Object.class);
        JavaType[] superInterfaces = new JavaType[0];

        // Act
        CollectionType result = CollectionType.construct(rawClass, bindings, superClass, superInterfaces, stringType);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(rawClass, result.getRawClass());
        Assert.assertEquals(stringType, result.getContentType());
        Assert.assertNull(result.getValueHandler());
        Assert.assertNull(result.getTypeHandler());
        Assert.assertFalse(result.useStaticType());
    }

    @Test
    public void construct_givenDeprecatedTwoArgMethod_shouldCreateValidInstance() {
        // Arrange
        Class<?> rawClass = List.class;

        // Act
        CollectionType result = CollectionType.construct(rawClass, stringType);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(rawClass, result.getRawClass());
        Assert.assertEquals(stringType, result.getContentType());
        Assert.assertNull(result.getValueHandler());
        Assert.assertNull(result.getTypeHandler());
        Assert.assertFalse(result.useStaticType());
    }

    @Test
    public void narrow_givenSubclass_shouldReturnNarrowedCollectionTypeWithSameElements() {
        // Arrange
        Class<?> subclass = LinkedList.class;

        // Act
        JavaType narrowed = collectionType._narrow(subclass);

        // Assert
        Assert.assertNotNull(narrowed);
        Assert.assertTrue(narrowed instanceof CollectionType);
        Assert.assertEquals(subclass, narrowed.getRawClass());
        Assert.assertEquals(stringType, narrowed.getContentType());
        Assert.assertFalse(narrowed.useStaticType());
    }

    @Test
    public void withContentType_givenSameContentType_shouldReturnSameInstance() {
        // Arrange & Act
        JavaType result = collectionType.withContentType(stringType);

        // Assert
        Assert.assertSame(collectionType, result);
    }

    @Test
    public void withContentType_givenDifferentContentType_shouldReturnNewInstance() {
        // Arrange & Act
        JavaType result = collectionType.withContentType(integerType);

        // Assert
        Assert.assertNotSame(collectionType, result);
        Assert.assertTrue(result instanceof CollectionType);
        Assert.assertEquals(integerType, result.getContentType());
        Assert.assertEquals(collectionType.getRawClass(), result.getRawClass());
    }

    @Test
    public void withTypeHandler_givenCustomHandler_shouldAssignHandlerToReturnedType() {
        // Arrange
        Object handler = "customTypeHandler";

        // Act
        CollectionType result = collectionType.withTypeHandler(handler);

        // Assert
        Assert.assertNotSame(collectionType, result);
        Assert.assertEquals(handler, result.getTypeHandler());
        Assert.assertNull(collectionType.getTypeHandler());
    }

    @Test
    public void withContentTypeHandler_givenHandler_shouldAssignHandlerToContentType() {
        // Arrange
        Object contentHandler = "contentTypeHandler";

        // Act
        CollectionType result = collectionType.withContentTypeHandler(contentHandler);

        // Assert
        Assert.assertNotSame(collectionType, result);
        Assert.assertNotNull(result.getContentType());
        Assert.assertEquals(contentHandler, result.getContentType().getTypeHandler());
    }

    @Test
    public void withValueHandler_givenCustomHandler_shouldAssignHandlerToReturnedType() {
        // Arrange
        Object handler = "customValueHandler";

        // Act
        CollectionType result = collectionType.withValueHandler(handler);

        // Assert
        Assert.assertNotSame(collectionType, result);
        Assert.assertEquals(handler, result.getValueHandler());
        Assert.assertNull(collectionType.getValueHandler());
    }

    @Test
    public void withContentValueHandler_givenHandler_shouldAssignHandlerToContentType() {
        // Arrange
        Object contentHandler = "contentValueHandler";

        // Act
        CollectionType result = collectionType.withContentValueHandler(contentHandler);

        // Assert
        Assert.assertNotSame(collectionType, result);
        Assert.assertNotNull(result.getContentType());
        Assert.assertEquals(contentHandler, result.getContentType().getValueHandler());
    }

    @Test
    public void withStaticTyping_givenNonStaticType_shouldReturnNewInstanceWithStaticTypingEnabled() {
        // Arrange
        Assert.assertFalse(collectionType.useStaticType());

        // Act
        CollectionType result = collectionType.withStaticTyping();

        // Assert
        Assert.assertNotSame(collectionType, result);
        Assert.assertTrue(result.useStaticType());
        Assert.assertTrue(result.getContentType().useStaticType());
    }

    @Test
    public void withStaticTyping_givenAlreadyStaticType_shouldReturnSameInstance() {
        // Arrange
        CollectionType staticType = collectionType.withStaticTyping();

        // Act
        CollectionType result = staticType.withStaticTyping();

        // Assert
        Assert.assertSame(staticType, result);
    }

    @Test
    public void refine_givenNewSuperTypesAndClass_shouldReturnRefinedInstance() {
        // Arrange
        Class<?> newRawType = Vector.class;
        TypeBindings newBindings = TypeBindings.emptyBindings();
        JavaType newSuperClass = typeFactory.constructType(List.class);
        JavaType[] newSuperInts = new JavaType[0];

        // Act
        JavaType refined = collectionType.refine(newRawType, newBindings, newSuperClass, newSuperInts);

        // Assert
        Assert.assertNotNull(refined);
        Assert.assertTrue(refined instanceof CollectionType);
        Assert.assertEquals(newRawType, refined.getRawClass());
        Assert.assertEquals(stringType, refined.getContentType());
    }

    @Test
    public void toString_givenCollectionType_shouldMatchExpectedFormat() {
        // Arrange
        String expected = "[collection type; class " + ArrayList.class.getName() + ", contains " + stringType + "]";

        // Act
        String actual = collectionType.toString();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void protectedConstructor_givenTypeBaseAndElementType_shouldConstructInstance() {
        // Arrange
        TypeBase base = (TypeBase) collectionType;

        // Act
        CollectionType derived = new CollectionType(base, integerType);

        // Assert
        Assert.assertNotNull(derived);
        Assert.assertEquals(base.getRawClass(), derived.getRawClass());
        Assert.assertEquals(integerType, derived.getContentType());
    }
}