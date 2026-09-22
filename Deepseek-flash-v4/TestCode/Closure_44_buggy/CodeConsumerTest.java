package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;

public class CodeConsumerTest {

    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
    }

    @Test
    public void testEndStatementNeedSemiColon() {
        consumer.statementStarted = true;
        consumer.endStatement(true);
        assertTrue(consumer.getCode().endsWith(";"));
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndStatementWithoutSemiColonWhenStatementStarted() {
        consumer.statementStarted = true;
        consumer.endStatement(false);
        assertTrue(consumer.statementNeedsEnded);
        consumer.maybeEndStatement();
        assertTrue(consumer.getCode().endsWith(";"));
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testEndStatementWithoutSemiColonWhenNoStatementStarted() {
        consumer.statementStarted = false;
        consumer.endStatement(false);
        assertFalse(consumer.statementNeedsEnded);
        consumer.maybeEndStatement();
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testMaybeEndStatementWhenStatementNeedsEnded() {
        consumer.statementNeedsEnded = true;
        consumer.maybeEndStatement();
        assertTrue(consumer.getCode().endsWith(";"));
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.statementStarted);
    }

    @Test
    public void testBeginBlockWithStatementNeedsEnded() {
        consumer.statementNeedsEnded = true;
        consumer.statementStarted = true;
        consumer.beginBlock();
        assertTrue(consumer.getCode().endsWith("{"));
        assertFalse(consumer.statementNeedsEnded);
        assertTrue(consumer.isEndLineCalled());
    }

    @Test
    public void testBeginBlockWithoutStatementNeedsEnded() {
        consumer.beginBlock();
        assertEquals("{", consumer.getCode());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndBlock() {
        consumer.endBlock();
        assertEquals("}", consumer.getCode());
        assertFalse(consumer.statementNeedsEnded);
        assertFalse(consumer.isEndLineCalled());
    }

    @Test
    public void testEndBlockShouldEndLine() {
        consumer.endBlock(true);
        assertEquals("}", consumer.getCode());
        assertTrue(consumer.isEndLineCalled());
        assertFalse(consumer.statementNeedsEnded);
    }

    @Test
    public void testEndFunction() {
        consumer.endFunction();
        assertTrue(consumer.sawFunction);
        assertFalse(consumer.isEndLineCalled());
    }

    @Test
    public void testEndFunctionStatementContext() {
        consumer.endFunction(true);
        assertTrue(consumer.sawFunction);
        assertTrue(consumer.isEndLineCalled());
    }

    @Test
    public void testAddIdentifierCallsAdd() {
        consumer.addIdentifier("foo");
        assertEquals("foo", consumer.getCode());
    }

    @Test
    public void testAddNumberZero() {
        consumer.addNumber(0);
        assertEquals("0", consumer.getCode());
    }

    @Test
    public void testAddNumberLong() {
        consumer.addNumber(123);
        assertEquals("123", consumer.getCode());
    }

    @Test
    public void testAddNumberNegative() {
        consumer.addNumber(-1);
        assertEquals("-1", consumer.getCode());
    }

    @Test
    public void testAddNumberNegativeZero() {
        consumer.addNumber(-0.0);
        assertEquals("-0.0", consumer.getCode());
    }

    @Test
    public void testAddNumberLarge() {
        consumer.addNumber(1e6);
        assertTrue(consumer.getCode().length() > 0);
    }

    @Test
    public void testAddNumberFraction() {
        consumer.addNumber(1.5);
        assertEquals("1.5", consumer.getCode());
    }

    @Test
    public void testAddNumberExpNotation() {
        consumer.addNumber(1e15);
        assertTrue(consumer.getCode().contains("E"));
    }

    @Test
    public void testIsNegativeZeroTrue() {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
    }

    @Test
    public void testIsNegativeZeroFalse() {
        assertFalse(CodeConsumer.isNegativeZero(0.0));
        assertFalse(CodeConsumer.isNegativeZero(1.0));
    }

    @Test
    public void testIsWordChar() {
        assertTrue(CodeConsumer.isWordChar('a'));
        assertTrue(CodeConsumer.isWordChar('Z'));
        assertTrue(CodeConsumer.isWordChar('0'));
        assertTrue(CodeConsumer.isWordChar('_'));
        assertTrue(CodeConsumer.isWordChar('$'));
        assertFalse(CodeConsumer.isWordChar(' '));
        assertFalse(CodeConsumer.isWordChar('-'));
    }

    @Test
    public void testShouldPreserveExtraBlocks() {
        assertFalse(consumer.shouldPreserveExtraBlocks());
    }

    @Test
    public void testBreakAfterBlockFor() {
        assertTrue(consumer.breakAfterBlockFor(null, true));
        assertFalse(consumer.breakAfterBlockFor(null, false));
    }

    @Test
    public void testEndFile() {
        consumer.endFile();
    }

    @Test
    public void testAddNegativeNumberAfterMinus() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('-');
        c.addNumber(-4);
        assertEquals(" -4", c.getCode());
    }

    @Test
    public void testAddNumberAfterWordNoSpaceNeeded() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('a');
        c.addNumber(4);
        assertEquals("a4", c.getCode());
    }

    @Test
    public void testAddNumberAfterOperator() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('+');
        c.addNumber(4);
        assertEquals("+4", c.getCode());
    }

    @Test
    public void testAddNumberWithDouble() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.addNumber(1.0);
        assertEquals("1", c.getCode());
    }

    @Test
    public void testAddNumberWithMinusZero() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.addNumber(-0.0);
        assertEquals("-0.0", c.getCode());
    }

    @Test
    public void testAppendOpBinOp() {
        consumer.appendOp("+", true);
        assertTrue(consumer.isMaybeCutLineCalled());
        assertEquals("+", consumer.getCode());
    }

    @Test
    public void testAppendOpNonBinOp() {
        consumer.appendOp("++", false);
        assertFalse(consumer.isMaybeCutLineCalled());
    }

    @Test
    public void testAddOpStartsWithLetter() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('a');
        c.addOp("in", true);
        assertEquals("a in", c.getCode());
    }

    @Test
    public void testAddOpWithSameSigns() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('+');
        c.addOp("+", true);
        assertEquals("+ +", c.getCode());
    }

    @Test
    public void testAddOpWithArrow() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('-');
        c.addOp(">", true);
        assertEquals("->", c.getCode());
    }

    @Test
    public void testAddOpNormal() {
        TestCodeConsumer c = new TestCodeConsumer();
        c.setLastChar('a');
        c.addOp("=", true);
        assertEquals("a=", c.getCode());
    }

    private static class TestCodeConsumer extends CodeConsumer {
        private StringBuilder code = new StringBuilder();
        private char lastChar = ' ';
        private boolean endLineCalled = false;
        private boolean maybeCutLineCalled = false;
        private boolean maybeLineBreakCalled = false;

        @Override
        char getLastChar() {
            return lastChar;
        }

        void setLastChar(char c) {
            this.lastChar = c;
        }

        @Override
        void append(String str) {
            if (str.length() > 0) {
                lastChar = str.charAt(str.length() - 1);
            }
            code.append(str);
        }

        @Override
        void startNewLine() {
        }

        @Override
        void maybeLineBreak() {
            maybeLineBreakCalled = true;
        }

        @Override
        void maybeCutLine() {
            maybeCutLineCalled = true;
        }

        @Override
        void endLine() {
            endLineCalled = true;
        }

        @Override
        void notePreferredLineBreak() {
        }

        String getCode() {
            return code.toString();
        }

        boolean isEndLineCalled() {
            return endLineCalled;
        }

        boolean isMaybeCutLineCalled() {
            return maybeCutLineCalled;
        }

        boolean isMaybeLineBreakCalled() {
            return maybeLineBreakCalled;
        }
    }
}