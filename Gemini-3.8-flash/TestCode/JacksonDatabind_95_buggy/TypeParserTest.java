package com.fasterxml.jackson.databind.type;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;

public class TypeParserTest {

    private TypeFactory _typeFactory;
    private TypeParser _typeParser;

    @Before
    public void setUp() {
        _typeFactory = TypeFactory.defaultInstance();
        _typeParser = new TypeParser(_typeFactory);
    }

    @Test
    public void withFactory_givenSameFactory_shouldReturnSameInstance() {
        // Arrange
        TypeParser parser = new TypeParser(_typeFactory);

        // Act
        TypeParser result = parser.withFactory(_typeFactory);

        // Assert
        Assert.assertSame(parser, result);
    }

    @Test
    public void withFactory_givenDifferentFactory_shouldReturnNewInstance() {
        // Arrange
        TypeParser parser = new TypeParser(_typeFactory);

        // Act
        TypeParser result = parser.withFactory(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(parser, result);
        Assert.assertNull(result._factory);
    }

    @Test
    public void withFactory_givenNullOriginalFactoryAndNullNewFactory_shouldReturnSameInstance() {
        // Arrange
        TypeParser parser = new TypeParser(null);

        // Act
        TypeParser result = parser.withFactory(null);

        // Assert
        Assert.assertSame(parser, result);
    }

    @Test
    public void parse_givenSimpleClass_shouldReturnJavaType() {
        // Arrange
        String canonical = "java.lang.String";

        // Act
        JavaType type = _typeParser.parse(canonical);

        // Assert
        Assert.assertNotNull(type);
        Assert.assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void parse_givenClassWithSurroundingWhitespace_shouldTrimAndParse() {
        // Arrange
        String canonical = "   java.lang.Integer   ";

        // Act
        JavaType type = _typeParser.parse(canonical);

        // Assert
        Assert.assertNotNull(type);
        Assert.assertEquals(Integer.class, type.getRawClass());
    }

    @Test
    public void parse_givenSingleGenericParameter_shouldReturnParameterizedType() {
        // Arrange
        String canonical = "java.util.ArrayList<java.lang.String>";

        // Act
        JavaType type = _typeParser.parse(canonical);

        // Assert
        Assert.assertNotNull(type);
        Assert.assertEquals(ArrayList.class, type.getRawClass());
        Assert.assertEquals(1, type.containedTypeCount());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());
    }

    @Test
    public void parse_givenMultipleGenericParameters_shouldReturnParameterizedType() {
        // Arrange
        String canonical = "java.util.HashMap<java.lang.String,java.lang.Integer>";

        // Act
        JavaType type = _typeParser.parse(canonical);

        // Assert
        Assert.assertNotNull(type);
        Assert.assertEquals(java.util.HashMap.class, type.getRawClass());
        Assert.assertEquals(2, type.containedTypeCount());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test
    public void parse_givenNestedGenericParameters_shouldReturnNestedParameterizedType() {
        // Arrange
        String canonical = "java.util.HashMap<java.lang.String,java.util.List<java.lang.Long>>";

        // Act
        JavaType type = _typeParser.parse(canonical);

        // Assert
        Assert.assertNotNull(type);
        Assert.assertEquals(java.util.HashMap.class, type.getRawClass());
        Assert.assertEquals(2, type.containedTypeCount());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());

        JavaType valueType = type.containedType(1);
        Assert.assertEquals(List.class, valueType.getRawClass());
        Assert.assertEquals(1, valueType.containedTypeCount());
        Assert.assertEquals(Long.class, valueType.containedType(0).getRawClass());
    }

    @Test
    public void parse_givenEmptyString_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException for empty input string");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-string") >= 0);
        }
    }

    @Test
    public void parse_givenWhitespaceOnly_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "    ";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException for whitespace-only input");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-string") >= 0);
        }
    }

    @Test
    public void parse_givenTokensRemainingAfterCompleteType_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "java.lang.String extraToken";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException when tokens remain after complete type");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected tokens after complete type") >= 0);
        }
    }

    @Test
    public void parse_givenUnclosedGenericWithoutType_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "java.util.List<";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException when generic type is unclosed and empty");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-string") >= 0);
        }
    }

    @Test
    public void parse_givenUnclosedGenericAfterType_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "java.util.List<java.lang.String";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException when generic closing bracket is missing");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-string") >= 0);
        }
    }

    @Test
    public void parse_givenUnexpectedTokenInsideGenerics_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "java.util.List<java.lang.String<java.lang.Integer>";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException when unexpected delimiter occurs inside generics");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected token '<', expected ',' or '>'") >= 0);
        }
    }

    @Test
    public void parse_givenNonExistentClassName_shouldThrowIllegalArgumentException() {
        // Arrange
        String canonical = "com.fasterxml.jackson.databind.type.NonExistentClass12345";

        // Act & Assert
        try {
            _typeParser.parse(canonical);
            Assert.fail("Expected IllegalArgumentException for non-existent class");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Can not locate class") >= 0);
            Assert.assertTrue(e.getMessage().indexOf("problem: ") >= 0);
        }
    }

    @Test
    public void findClass_givenNullFactory_shouldRethrowRuntimeException() {
        // Arrange
        TypeParser parserWithNullFactory = new TypeParser(null);

        // Act & Assert
        try {
            parserWithNullFactory.parse("java.lang.String");
            Assert.fail("Expected NullPointerException to be rethrown");
        } catch (NullPointerException e) {
            // Expected - verifies that RuntimeException is rethrown as-is
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void parseType_givenDirectEmptyTokenizer_shouldThrowIllegalArgumentException() {
        // Arrange
        TypeParser.MyTokenizer tokens = new TypeParser.MyTokenizer("");

        // Act & Assert
        try {
            _typeParser.parseType(tokens);
            Assert.fail("Expected IllegalArgumentException for empty tokenizer");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-string") >= 0);
        }
    }

    @Test
    public void tokenizer_givenValidInput_shouldTokenizeCorrectly() {
        // Arrange
        TypeParser.MyTokenizer tokenizer = new TypeParser.MyTokenizer("java.util.List<java.lang.String>");

        // Act & Assert
        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("java.util.List", tokenizer.nextToken());

        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("<", tokenizer.nextToken());

        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("java.lang.String", tokenizer.nextToken());

        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals(">", tokenizer.nextToken());

        Assert.assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void tokenizer_givenPushBack_shouldReturnPushedBackTokenFirst() {
        // Arrange
        TypeParser.MyTokenizer tokenizer = new TypeParser.MyTokenizer("first,second");
        String first = tokenizer.nextToken();
        Assert.assertEquals("first", first);

        // Act
        tokenizer.pushBack("customPushedBack");

        // Assert
        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("customPushedBack", tokenizer.nextToken());
        Assert.assertEquals(",", tokenizer.nextToken());
        Assert.assertEquals("second", tokenizer.nextToken());
        Assert.assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void tokenizer_hasMoreTokens_givenPushBackOnExhaustedInput_shouldReturnTrue() {
        // Arrange
        TypeParser.MyTokenizer tokenizer = new TypeParser.MyTokenizer("single");
        tokenizer.nextToken();
        Assert.assertFalse(tokenizer.hasMoreTokens());

        // Act
        tokenizer.pushBack("restored");

        // Assert
        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("restored", tokenizer.nextToken());
        Assert.assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void tokenizer_getAllInputAndRemainingInput_shouldTrackCorrectly() {
        // Arrange
        String input = "java.util.Map<java.lang.String,java.lang.Integer>";
        TypeParser.MyTokenizer tokenizer = new TypeParser.MyTokenizer(input);

        // Assert initial state
        Assert.assertEquals(input, tokenizer.getAllInput());
        Assert.assertEquals(input, tokenizer.getRemainingInput());

        // Act - consume first token
        String token1 = tokenizer.nextToken();
        Assert.assertEquals("java.util.Map", token1);

        // Assert remaining input after first token
        Assert.assertEquals("<java.lang.String,java.lang.Integer>", tokenizer.getRemainingInput());
        Assert.assertEquals(input, tokenizer.getAllInput());
    }

    @Test
    public void problem_givenContext_shouldFormatErrorMessageWithInputs() {
        // Arrange
        TypeParser.MyTokenizer tokenizer = new TypeParser.MyTokenizer("testInput<remains>");
        tokenizer.nextToken(); // consume "testInput"

        // Act
        IllegalArgumentException problem = _typeParser._problem(tokenizer, "Custom error message");

        // Assert
        Assert.assertNotNull(problem);
        String message = problem.getMessage();
        Assert.assertTrue(message.indexOf("Failed to parse type 'testInput<remains>'") >= 0);
        Assert.assertTrue(message.indexOf("(remaining: '<remains>')") >= 0);
        Assert.assertTrue(message.indexOf("Custom error message") >= 0);
    }
}