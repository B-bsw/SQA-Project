package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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
  public void testBeginBlockWithNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.beginBlock();
    assertEquals(";{", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testBeginBlockWithoutNeedsEnded() {
    consumer.beginBlock();
    assertEquals("{", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlockWithShouldEndLine() {
    consumer.endBlock(true);
    assertEquals("}", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndBlockWithoutShouldEndLine() {
    consumer.endBlock(false);
    assertEquals("}", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatementWithSemiColon() {
    consumer.statementStarted = true;
    consumer.endStatement(true);
    assertEquals(";", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testEndStatementNeedsSemiColon() {
    consumer.statementStarted = true;
    consumer.endStatement(false);
    assertTrue(consumer.statementNeedsEnded);
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testEndStatementWithoutSemiColonAndNotStarted() {
    consumer.endStatement(false);
    assertFalse(consumer.statementNeedsEnded);
  }

  @Test
  public void testMaybeEndStatementNeedsEnded() {
    consumer.statementNeedsEnded = true;
    consumer.maybeEndStatement();
    assertEquals(";", consumer.getCode());
    assertFalse(consumer.statementNeedsEnded);
    assertTrue(consumer.statementStarted);
  }

  @Test
  public void testMaybeEndStatementNotNeeded() {
    consumer.maybeEndStatement();
    assertEquals("", consumer.getCode());
    assertTrue(consumer.statementStarted);
  }

  @Test
  public void testEndFunctionWithStatementContext() {
    consumer.endFunction(true);
    assertTrue(consumer.sawFunction);
    assertEquals("\n", consumer.getCode());
  }

  @Test
  public void testEndFunctionWithoutStatementContext() {
    consumer.endFunction(false);
    assertTrue(consumer.sawFunction);
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testBeginCaseBody() {
    consumer.beginCaseBody();
    assertEquals(":", consumer.getCode());
  }

  @Test
  public void testAddWithNormalString() {
    consumer.add("abc");
    assertEquals("abc", consumer.getCode());
  }

  @Test
  public void testAddEmptyString() {
    consumer.add("");
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testAddWithWordCharSeparation() {
    consumer.add("return");
    consumer.add("foo");
    assertEquals("return foo", consumer.getCode());
  }

  @Test
  public void testAddWithSlashAfterDiv() {
    consumer.add("/");
    consumer.add("/");
    assertEquals("/ /", consumer.getCode());
  }

  @Test
  public void testAddNumber() {
    consumer.addNumber(100);
    assertEquals("100", consumer.getCode());
  }

  @Test
  public void testAddNumberNegative() {
    consumer.addNumber(-100);
    assertEquals("-100", consumer.getCode());
  }

  @Test
  public void testAddNumberNegativeZero() {
    consumer.addNumber(-0.0);
    assertEquals("-0.0", consumer.getCode());
  }

  @Test
  public void testAddNumberWithExp() {
    consumer.addNumber(1000);
    assertEquals("1E3", consumer.getCode());
  }

  @Test
  public void testIsNegativeZeroWithZero() {
    assertFalse(CodeConsumer.isNegativeZero(0.0));
  }

  @Test
  public void testIsNegativeZeroWithNegativeZero() {
    assertTrue(CodeConsumer.isNegativeZero(-0.0));
  }

  @Test
  public void testIsWordCharLetter() {
    assertTrue(CodeConsumer.isWordChar('a'));
  }

  @Test
  public void testIsWordCharSymbol() {
    assertTrue(CodeConsumer.isWordChar('_'));
  }

  @Test
  public void testIsWordCharNot() {
    assertFalse(CodeConsumer.isWordChar(' '));
  }

  @Test
  public void testShouldPreserveExtraBlocksDefault() {
    assertFalse(consumer.shouldPreserveExtraBlocks());
  }

  @Test
  public void testBreakAfterBlockForTrue() {
    assertTrue(consumer.breakAfterBlockFor(null, true));
  }

  @Test
  public void testBreakAfterBlockForFalse() {
    assertFalse(consumer.breakAfterBlockFor(null, false));
  }

  private static class TestCodeConsumer extends CodeConsumer {
    private final StringBuilder sb = new StringBuilder();

    @Override
    char getLastChar() {
      return sb.length() > 0 ? sb.charAt(sb.length() - 1) : ' ';
    }

    @Override
    void append(String str) {
      sb.append(str);
    }

    String getCode() {
      return sb.toString();
    }
  }
}