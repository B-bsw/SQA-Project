package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CodeConsumerTest {

  private TestCodeConsumer consumer;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
  }

  @Test
  public void testAddIdentifier() {
    consumer.addIdentifier("myVar");
    assertEquals("myVar", consumer.getCode());
  }

  @Test
  public void testAddNumberInteger() {
    consumer.addNumber(42);
    assertEquals("42", consumer.getCode());
  }

  @Test
  public void testAddNumberNegative() {
    consumer.addNumber(-4);
    assertEquals("-4", consumer.getCode());
  }

  @Test
  public void testAddNumberLarge() {
    consumer.addNumber(1000);
    assertEquals("1E3", consumer.getCode());
  }

  @Test
  public void testAddNumberDouble() {
    consumer.addNumber(3.14);
    assertEquals("3.14", consumer.getCode());
  }

  @Test
  public void testAddNumberLargeDouble() {
    consumer.addNumber(3.14159E20);
    assertEquals("3.14159E20", consumer.getCode());
  }

  @Test
  public void testAddNumberZero() {
    consumer.addNumber(0);
    assertEquals("0", consumer.getCode());
  }

  @Test
  public void testAddNumberNegativeDouble() {
    consumer.addNumber(-2.5);
    assertEquals("-2.5", consumer.getCode());
  }

  @Test
  public void testAddNumberExpNegative() {
    consumer.addNumber(1.5E-2);
    assertEquals("0.015", consumer.getCode());
  }

  @Test
  public void testAddNumberExactLongOverflow() {
    consumer.addNumber(9.223372036854776E18);
    assertEquals("9223372036854775807", consumer.getCode());
  }

  @Test
  public void testAddNumberExactLongUnderflow() {
    consumer.addNumber(-9.223372036854776E18);
    assertEquals("-9223372036854775808", consumer.getCode());
  }

  @Test
  public void testAddNumberExactLong() {
    consumer.addNumber(1234567890123.0);
    assertEquals("1234567890123", consumer.getCode());
  }

  @Test
  public void testAddNumberExactLongWithExp() {
    consumer.addNumber(12345678901234.0);
    assertEquals("1234567890123E1", consumer.getCode());
  }

  @Test
  public void testAddNumberMinusAfterMinus() {
    CodeConsumer c = new TestCodeConsumer() {
      @Override
      public char getLastChar() {
        return '-';
      }
    };
    c.addNumber(-4);
    assertEquals(" -4", c.getCode());
  }

  @Test
  public void testAddNumberNotWordAfterOp() {
    CodeConsumer c = new TestCodeConsumer() {
      @Override
      public char getLastChar() {
        return 'a';
      }
    };
    c.addNumber(4);
    assertEquals(" 4", c.getCode());
  }

  @Test
  public void testAddNumberNoSpaceNeeded() {
    CodeConsumer c = new TestCodeConsumer() {
      @Override
      public char getLastChar() {
        return ' ';
      }
    };
    c.addNumber(4);
    assertEquals("4", c.getCode());
  }

  @Test
  public void testIsWordChar() {
    assertTrue(CodeConsumer.isWordChar('a'));
    assertTrue(CodeConsumer.isWordChar('Z'));
    assertTrue(CodeConsumer.isWordChar('_'));
    assertTrue(CodeConsumer.isWordChar('$'));
    assertTrue(CodeConsumer.isWordChar('0'));
    assertFalse(CodeConsumer.isWordChar(' '));
    assertFalse(CodeConsumer.isWordChar('-'));
    assertFalse(CodeConsumer.isWordChar('+'));
    assertFalse(CodeConsumer.isWordChar('.'));
    assertFalse(CodeConsumer.isWordChar('@'));
  }

  @Test
  public void testAddOpWithPlus() {
    consumer.add("a");
    consumer.addOp("+", true);
    consumer.add("b");
    assertEquals("a+b", consumer.getCode());
  }

  @Test
  public void testAddOpWithMinus() {
    consumer.add("a");
    consumer.addOp("-", true);
    consumer.add("b");
    assertEquals("a-b", consumer.getCode());
  }

  @Test
  public void testAddOpWithDoublePlus() {
    consumer.add("a");
    consumer.addOp("++", true);
    assertEquals("a ++", consumer.getCode());
  }

  @Test
  public void testAddOpWithDoubleMinus() {
    consumer.add("a");
    consumer.addOp("--", true);
    assertEquals("a --", consumer.getCode());
  }

  @Test
  public void testAddOpWithWordAndLetter() {
    consumer.add("typeof x");
    consumer.addOp("y", true);
    assertEquals("typeof x y", consumer.getCode());
  }

  @Test
  public void testAddOpWithWord() {
    consumer.add("typeof");
    consumer.addOp(" x", true);
    assertEquals("typeof  x", consumer.getCode());
  }

  @Test
  public void testAddOpWithMinusGreater() {
    consumer.add("a");
    consumer.addOp("->", true);
    consumer.add("b");
    assertEquals("a ->b", consumer.getCode());
  }

  @Test
  public void testAddOpWithBinOp() {
    consumer.add("a");
    consumer.addOp("+", true);
    consumer.add("b");
    assertEquals("a+b", consumer.getCode());
  }

  @Test
  public void testAddOpNonBinOp() {
    consumer.add("a");
    consumer.addOp("+", false);
    consumer.add("b");
    assertEquals("a+b", consumer.getCode());
  }

  @Test
  public void testAddOpNoSpaceNeeded() {
    consumer.add("a");
    consumer.addOp("+", true);
    consumer.add("b");
    assertEquals("a+b", consumer.getCode());
  }

  @Test
  public void testAddWordChar() {
    consumer.add("a");
    consumer.addOp("b", true);
    consumer.add("c");
    assertEquals("a bc", consumer.getCode());
  }

  @Test
  public void testAddPrevAndFirst() {
    consumer.add("a");
    consumer.addOp("-", true);
    consumer.add(">");
    consumer.add("b");
    assertEquals("a ->b", consumer.getCode());
  }

  @Test
  public void testAddInteger() {
    consumer.add("123");
    assertEquals("123", consumer.getCode());
  }

  @Test
  public void testAddEmpty() {
    consumer.add("");
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testAddWord() {
    consumer.add("hello");
    consumer.add("world");
    assertEquals("hello world", consumer.getCode());
  }

  @Test
  public void testAddWordWithNoSpaceNeeded() {
    consumer.add("hello");
    consumer.add(" world");
    assertEquals("hello world", consumer.getCode());
  }

  @Test
  public void testAddWordWithSeparator() {
    consumer.add("hello");
    consumer.add(",");
    consumer.add("world");
    assertEquals("hello,world", consumer.getCode());
  }

  @Test
  public void testAddWordWithSpace() {
    consumer.add("hello ");
    consumer.add("world");
    assertEquals("hello world", consumer.getCode());
  }

  @Test
  public void testAddInterrupted() {
    consumer.add("a");
    consumer.add("b");
    assertEquals("ab", consumer.getCode());
  }

  @Test
  public void testAddWithLastChar() {
    consumer.add("a");
    consumer.add("b");
    assertEquals("ab", consumer.getCode());
  }

  @Test
  public void testAddWithLastCharSpace() {
    consumer.add("a ");
    consumer.add("b");
    assertEquals("a b", consumer.getCode());
  }

  @Test
  public void testBeginBlock() {
    consumer.beginBlock();
    assertEquals("{", consumer.getCode());
  }

  @Test
  public void testBeginBlockStatementNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.beginBlock();
    assertEquals(";{", consumer.getCode());
  }

  @Test
  public void testBeginBlockStatementStarted() {
    consumer.statementStarted = true;
    consumer.beginBlock();
    assertEquals("{", consumer.getCode());
  }

  @Test
  public void testEndBlock() {
    consumer.endBlock();
    assertEquals("}", consumer.getCode());
  }

  @Test
  public void testEndBlockShouldEndLine() {
    consumer.endBlock(true);
    assertEquals("}", consumer.getCode());
  }

  @Test
  public void testEndBlockShouldNotEndLine() {
    consumer.endBlock(false);
    assertEquals("}", consumer.getCode());
  }

  @Test
  public void testEndBlockResetsStatementNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.endBlock();
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testListSeparator() {
    consumer.add("a");
    consumer.listSeparator();
    consumer.add("b");
    assertEquals("a,b", consumer.getCode());
  }

  @Test
  public void testListSeparatorEmpty() {
    consumer.listSeparator();
    assertEquals(",", consumer.getCode());
  }

  @Test
  public void testListSeparatorStatementNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.listSeparator();
    assertEquals(",", consumer.getCode());
  }

  @Test
  public void testEndStatement() {
    consumer.endStatement();
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatementWithNeedSemiColon() {
    consumer.endStatement(true);
    assertFalse(consumer.statementNeedsEnded);
    assertEquals(";", consumer.getCode());
  }

  @Test
  public void testEndStatementNoNeedSemiColon() {
    consumer.endStatement(false);
    assertFalse(consumer.statementNeedsEnded);
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testEndStatementStatementStarted() {
    consumer.statementStarted = true;
    consumer.endStatement();
    assertTrue(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatementStatementNotStarted() {
    consumer.statementStarted = false;
    consumer.endStatement();
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testMaybeEndStatement() {
    consumer.maybeEndStatement();
    assertTrue(consumer.statementStarted);
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testMaybeEndStatementNeedsEnded() {
    consumer.statementStarted = true;
    consumer.statementNeedsEnded = true;
    consumer.maybeEndStatement();
    assertTrue(consumer.statementStarted);
    assertFalse(consumer.statementNeedsEnded);
    assertEquals(";", consumer.getCode());
  }

  @Test
  public void testEndFunction() {
    consumer.endFunction();
    assertTrue(consumer.sawFunction);
  }

  @Test
  public void testEndFunctionStatementContext() {
    consumer.endFunction(true);
    assertTrue(consumer.sawFunction);
  }

  @Test
  public void testEndFunctionNotStatementContext() {
    consumer.endFunction(false);
    assertTrue(consumer.sawFunction);
  }

  @Test
  public void testBeginCaseBody() {
    consumer.beginCaseBody();
    assertEquals(":", consumer.getCode());
  }

  @Test
  public void testEndCaseBody() {
    consumer.endCaseBody();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testAppendBlockStart() {
    consumer.appendBlockStart();
    assertEquals("{", consumer.getCode());
  }

  @Test
  public void testAppendBlockEnd() {
    consumer.appendBlockEnd();
    assertEquals("}", consumer.getCode());
  }

  @Test
  public void testAppend() {
    consumer.append("abc");
    assertEquals("abc", consumer.getCode());
  }

  @Test
  public void testStartNewLine() {
    consumer.startNewLine();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testMaybeLineBreak() {
    consumer.maybeLineBreak();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testMaybeCutLine() {
    consumer.maybeCutLine();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testEndLine() {
    consumer.endLine();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testNotePreferredLineBreak() {
    consumer.notePreferredLineBreak();
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testContinueProcessing() {
    assertTrue(consumer.continueProcessing());
  }

  @Test
  public void testShouldPreserveExtraBlocks() {
    assertFalse(consumer.shouldPreserveExtraBlocks());
  }

  @Test
  public void testBreakAfterBlockFor() {
    Node node = new Node(1);
    assertTrue(consumer.breakAfterBlockFor(node, true));
    assertFalse(consumer.breakAfterBlockFor(node, false));
  }

  @Test
  public void testAddOpWithCurlyBrace() {
    consumer.add("a");
    consumer.addOp("{", true);
    consumer.add("b");
    assertEquals("a{b", consumer.getCode());
  }

  private static class TestCodeConsumer extends CodeConsumer {
    private final StringBuilder code = new StringBuilder();

    @Override
    public char getLastChar() {
      if (code.length() == 0) {
        return ' ';
      }
      return code.charAt(code.length() - 1);
    }

    @Override
    public void append(String str) {
      code.append(str);
    }

    public String getCode() {
      return code.toString();
    }
  }
}