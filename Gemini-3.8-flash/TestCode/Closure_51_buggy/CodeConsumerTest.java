package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CodeConsumerTest {

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuffer buffer = new StringBuffer();
        int startNewLineCalls = 0;
        int maybeCutLineCalls = 0;
        int endLineCalls = 0;
        int notePreferredLineBreakCalls = 0;
        int endFileCalls = 0;
        int appendOpCalls = 0;
        String lastAppendedOp = null;
        boolean lastOpBinOp = false;

        void append(String str) {
            buffer.append(str);
        }

        char getLastChar() {
            if (buffer.length() == 0) {
                return '\0';
            }
            return buffer.charAt(buffer.length() - 1);
        }

        void startNewLine() {
            startNewLineCalls++;
        }

        void maybeCutLine() {
            maybeCutLineCalls++;
        }

        void endLine() {
            endLineCalls++;
        }

        void notePreferredLineBreak() {
            notePreferredLineBreakCalls++;
        }

        void endFile() {
            endFileCalls++;
        }

        void appendOp(String op, boolean binOp) {
            appendOpCalls++;
            lastAppendedOp = op;
            lastOpBinOp = binOp;
            super.appendOp(op, binOp);
        }

        String getOutput() {
            return buffer.toString();
        }
    }

    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
    }

    @Test
    public void continueProcessing_givenDefaultImplementation_shouldReturnTrue() {
        // Arrange & Act
        boolean result = consumer.continueProcessing();

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void startSourceMapping_givenNode_shouldExecuteWithoutException() {
        // Arrange
        com.google.javascript.rhino.Node node = null;

        // Act & Assert (ensure no-op executes cleanly)
        consumer.startSourceMapping(node);
    }

    @Test
    public void endSourceMapping_givenNode_shouldExecuteWithoutException() {
        // Arrange
        com.google.javascript.rhino.Node node = null;

        // Act & Assert (ensure no-op executes cleanly)
        consumer.endSourceMapping(node);
    }

    @Test
    public void addIdentifier_givenString_shouldAppendString() {
        // Arrange
        String identifier = "myVariable";

        // Act
        consumer.addIdentifier(identifier);

        // Assert
        Assert.assertEquals("myVariable", consumer.getOutput());
        Assert.assertTrue(consumer.statementStarted);
    }

    @Test
    public void appendBlockStart_givenCall_shouldAppendOpenBrace() {
        // Act
        consumer.appendBlockStart();

        // Assert
        Assert.assertEquals("{", consumer.getOutput());
    }

    @Test
    public void appendBlockEnd_givenCall_shouldAppendCloseBrace() {
        // Act
        consumer.appendBlockEnd();

        // Assert
        Assert.assertEquals("}", consumer.getOutput());
    }

    @Test
    public void noOpMethods_givenCall_shouldExecuteAndTrackCalls() {
        // Act
        consumer.startNewLine();
        consumer.maybeLineBreak();
        consumer.maybeCutLine();
        consumer.endLine();
        consumer.notePreferredLineBreak();
        consumer.endCaseBody();
        consumer.endFile();

        // Assert
        Assert.assertEquals(1, consumer.startNewLineCalls);
        Assert.assertEquals(2, consumer.maybeCutLineCalls);
        Assert.assertEquals(1, consumer.endLineCalls);
        Assert.assertEquals(1, consumer.notePreferredLineBreakCalls);
        Assert.assertEquals(1, consumer.endFileCalls);
    }

    @Test
    public void beginBlock_givenNoStatementNeedsEnded_shouldAppendOpenBraceAndCallEndLine() {
        // Arrange
        consumer.statementNeedsEnded = false;

        // Act
        consumer.beginBlock();

        // Assert
        Assert.assertEquals("{", consumer.getOutput());
        Assert.assertEquals(1, consumer.endLineCalls);
        Assert.assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void beginBlock_givenStatementNeedsEnded_shouldAppendSemiColonAndOpenBrace() {
        // Arrange
        consumer.statementNeedsEnded = true;

        // Act
        consumer.beginBlock();

        // Assert
        Assert.assertEquals(";{", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
        Assert.assertEquals(1, consumer.endLineCalls);
        Assert.assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void endBlock_givenNoArgs_shouldAppendCloseBraceWithoutEndLine() {
        // Arrange
        consumer.statementNeedsEnded = true;

        // Act
        consumer.endBlock();

        // Assert
        Assert.assertEquals("}", consumer.getOutput());
        Assert.assertEquals(0, consumer.endLineCalls);
        Assert.assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void endBlock_givenShouldEndLineTrue_shouldAppendCloseBraceAndCallEndLine() {
        // Arrange
        consumer.statementNeedsEnded = true;

        // Act
        consumer.endBlock(true);

        // Assert
        Assert.assertEquals("}", consumer.getOutput());
        Assert.assertEquals(1, consumer.endLineCalls);
        Assert.assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void listSeparator_givenCall_shouldAppendCommaAndCallMaybeCutLine() {
        // Act
        consumer.listSeparator();

        // Assert
        Assert.assertEquals(",", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
    }

    @Test
    public void endStatement_givenNoArgs_shouldDelegateToFalse() {
        // Arrange
        consumer.statementStarted = true;

        // Act
        consumer.endStatement();

        // Assert
        Assert.assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void endStatement_givenNeedSemiColonTrue_shouldAppendSemiColonAndResetFlag() {
        // Arrange
        consumer.statementNeedsEnded = true;

        // Act
        consumer.endStatement(true);

        // Assert
        Assert.assertEquals(";", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
        Assert.assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void endStatement_givenNeedSemiColonFalseAndStatementStartedFalse_shouldNotSetFlag() {
        // Arrange
        consumer.statementStarted = false;
        consumer.statementNeedsEnded = false;

        // Act
        consumer.endStatement(false);

        // Assert
        Assert.assertEquals("", consumer.getOutput());
        Assert.assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void endStatement_givenNeedSemiColonFalseAndStatementStartedTrue_shouldSetStatementNeedsEnded() {
        // Arrange
        consumer.statementStarted = true;
        consumer.statementNeedsEnded = false;

        // Act
        consumer.endStatement(false);

        // Assert
        Assert.assertEquals("", consumer.getOutput());
        Assert.assertTrue(consumer.statementNeedsEnded);
    }

    @Test
    public void maybeEndStatement_givenStatementNeedsEndedFalse_shouldSetStatementStartedTrue() {
        // Arrange
        consumer.statementNeedsEnded = false;
        consumer.statementStarted = false;

        // Act
        consumer.maybeEndStatement();

        // Assert
        Assert.assertEquals("", consumer.getOutput());
        Assert.assertTrue(consumer.statementStarted);
        Assert.assertEquals(0, consumer.maybeCutLineCalls);
        Assert.assertEquals(0, consumer.endLineCalls);
    }

    @Test
    public void maybeEndStatement_givenStatementNeedsEndedTrue_shouldAppendSemiColonAndCallEndLine() {
        // Arrange
        consumer.statementNeedsEnded = true;
        consumer.statementStarted = false;

        // Act
        consumer.maybeEndStatement();

        // Assert
        Assert.assertEquals(";", consumer.getOutput());
        Assert.assertTrue(consumer.statementStarted);
        Assert.assertFalse(consumer.statementNeedsEnded);
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
        Assert.assertEquals(1, consumer.endLineCalls);
    }

    @Test
    public void endFunction_givenNoArgs_shouldSetSawFunctionTrueWithoutEndLine() {
        // Act
        consumer.endFunction();

        // Assert
        Assert.assertTrue(consumer.sawFunction);
        Assert.assertEquals(0, consumer.endLineCalls);
    }

    @Test
    public void endFunction_givenStatementContextTrue_shouldSetSawFunctionTrueAndCallEndLine() {
        // Act
        consumer.endFunction(true);

        // Assert
        Assert.assertTrue(consumer.sawFunction);
        Assert.assertEquals(1, consumer.endLineCalls);
    }

    @Test
    public void beginCaseBody_givenCall_shouldAppendColon() {
        // Act
        consumer.beginCaseBody();

        // Assert
        Assert.assertEquals(":", consumer.getOutput());
    }

    @Test
    public void add_givenEmptyString_shouldSetStatementStartedAndNotAppend() {
        // Act
        consumer.add("");

        // Assert
        Assert.assertEquals("", consumer.getOutput());
        Assert.assertTrue(consumer.statementStarted);
    }

    @Test
    public void add_givenWordCharAfterWordChar_shouldSeparateWithSpace() {
        // Act
        consumer.add("var");
        consumer.add("foo");

        // Assert
        Assert.assertEquals("var foo", consumer.getOutput());
    }

    @Test
    public void add_givenBackslashAfterWordChar_shouldSeparateWithSpace() {
        // Act
        consumer.add("a");
        consumer.add("\\u0041");

        // Assert
        Assert.assertEquals("a \\u0041", consumer.getOutput());
    }

    @Test
    public void add_givenWordCharAfterNonWordChar_shouldNotSeparateWithSpace() {
        // Act
        consumer.add("(");
        consumer.add("foo");

        // Assert
        Assert.assertEquals("(foo", consumer.getOutput());
    }

    @Test
    public void add_givenNonWordCharAfterWordChar_shouldNotSeparateWithSpace() {
        // Act
        consumer.add("foo");
        consumer.add("(");

        // Assert
        Assert.assertEquals("foo(", consumer.getOutput());
    }

    @Test
    public void addOp_givenPlusFollowingPlus_shouldSeparateWithSpace() {
        // Arrange
        consumer.add("x");
        consumer.addOp("+", true);

        // Act
        consumer.addOp("++", false);

        // Assert
        Assert.assertEquals("x+ ++", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
    }

    @Test
    public void addOp_givenMinusFollowingMinus_shouldSeparateWithSpace() {
        // Arrange
        consumer.add("x");
        consumer.addOp("-", true);

        // Act
        consumer.addOp("--", false);

        // Assert
        Assert.assertEquals("x- --", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
    }

    @Test
    public void addOp_givenLetterOpFollowingWordChar_shouldSeparateWithSpace() {
        // Arrange
        consumer.add("a");

        // Act
        consumer.addOp("instanceof", true);

        // Assert
        Assert.assertEquals("a instanceof", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
    }

    @Test
    public void addOp_givenGreaterThanFollowingMinus_shouldSeparateWithSpace() {
        // Arrange
        consumer.append("-");

        // Act
        consumer.addOp(">", true);

        // Assert
        Assert.assertEquals("- >", consumer.getOutput());
        Assert.assertEquals(1, consumer.maybeCutLineCalls);
    }

    @Test
    public void addOp_givenNonBinOp_shouldNotCallMaybeCutLine() {
        // Act
        consumer.addOp("!", false);

        // Assert
        Assert.assertEquals("!", consumer.getOutput());
        Assert.assertEquals(0, consumer.maybeCutLineCalls);
    }

    @Test
    public void addNumber_givenNegativeNumberFollowingMinus_shouldSeparateWithSpace() {
        // Arrange
        consumer.append("-");

        // Act
        consumer.addNumber(-4.0);

        // Assert
        Assert.assertEquals("- -4", consumer.getOutput());
    }

    @Test
    public void addNumber_givenNegativeNumberFollowingNonMinus_shouldNotAddExtraSpace() {
        // Arrange
        consumer.append("+");

        // Act
        consumer.addNumber(-4.0);

        // Assert
        Assert.assertEquals("+-4", consumer.getOutput());
    }

    @Test
    public void addNumber_givenSmallInteger_shouldFormatWithoutExponent() {
        // Act
        consumer.addNumber(42.0);

        // Assert
        Assert.assertEquals("42", consumer.getOutput());
    }

    @Test
    public void addNumber_givenZero_shouldFormatAsZero() {
        // Act
        consumer.addNumber(0.0);

        // Assert
        Assert.assertEquals("0", consumer.getOutput());
    }

    @Test
    public void addNumber_givenPowerOfTenWithExpLessThanThree_shouldFormatDirectly() {
        // 100 has exp=2, which is not > 2
        // Act
        consumer.addNumber(100.0);

        // Assert
        Assert.assertEquals("100", consumer.getOutput());
    }

    @Test
    public void addNumber_givenPowerOfTenWithExpGreaterThanTwo_shouldFormatWithExponent() {
        // 1000 has exp=3 (1E3)
        // Act
        consumer.addNumber(1000.0);

        // Assert
        Assert.assertEquals("1E3", consumer.getOutput());
    }

    @Test
    public void addNumber_givenLargeMultipleOfThousand_shouldFormatWithExponent() {
        // 120000 has exp=4 (12E4)
        // Act
        consumer.addNumber(120000.0);

        // Assert
        Assert.assertEquals("12E4", consumer.getOutput());
    }

    @Test
    public void addNumber_givenNegativeLargeMultipleOfThousand_shouldFormatWithExponent() {
        // -1000 has exp=3 (-1E3)
        // Act
        consumer.addNumber(-1000.0);

        // Assert
        Assert.assertEquals("-1E3", consumer.getOutput());
    }

    @Test
    public void addNumber_givenFloatingPointNumber_shouldFormatUsingDoubleString() {
        // Act
        consumer.addNumber(3.14159);

        // Assert
        Assert.assertEquals("3.14159", consumer.getOutput());
    }

    @Test
    public void isWordChar_givenVariousCharacters_shouldIdentifyCorrectly() {
        Assert.assertTrue(CodeConsumer.isWordChar('_'));
        Assert.assertTrue(CodeConsumer.isWordChar('$'));
        Assert.assertTrue(CodeConsumer.isWordChar('a'));
        Assert.assertTrue(CodeConsumer.isWordChar('Z'));
        Assert.assertTrue(CodeConsumer.isWordChar('0'));
        Assert.assertTrue(CodeConsumer.isWordChar('9'));

        Assert.assertFalse(CodeConsumer.isWordChar('+'));
        Assert.assertFalse(CodeConsumer.isWordChar('-'));
        Assert.assertFalse(CodeConsumer.isWordChar(' '));
        Assert.assertFalse(CodeConsumer.isWordChar('\n'));
        Assert.assertFalse(CodeConsumer.isWordChar('\0'));
        Assert.assertFalse(CodeConsumer.isWordChar('.'));
    }

    @Test
    public void shouldPreserveExtraBlocks_givenDefaultCall_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(consumer.shouldPreserveExtraBlocks());
    }

    @Test
    public void breakAfterBlockFor_givenContexts_shouldReturnContextValue() {
        // Act & Assert
        Assert.assertTrue(consumer.breakAfterBlockFor(null, true));
        Assert.assertFalse(consumer.breakAfterBlockFor(null, false));
    }
}