package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class ExtendedBufferedReaderTest {

    // -------------------- read() tests --------------------

    @Test
    public void testReadSimpleChars() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("ab"));
        assertEquals('a', r.read());
        assertEquals('b', r.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.read());
    }

    @Test
    public void testReadIncrementsLineCounterOnNewline() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("a\nb"));
        assertEquals('a', r.read());
        assertEquals(0, r.getLineNumber());
        assertEquals('\n', r.read());
        assertEquals(1, r.getLineNumber());
        assertEquals('b', r.read());
        assertEquals(1, r.getLineNumber());
    }

    @Test
    public void testReadAtEOFSetsLastCharToEndOfStream() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.read());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
    }

    // -------------------- readAgain() tests --------------------

    @Test
    public void testReadAgainInitiallyUndefined() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("abc"));
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
    }

    @Test
    public void testReadAgainAfterRead() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("xy"));
        r.read();
        assertEquals('x', r.readAgain());
        r.read();
        assertEquals('y', r.readAgain());
    }

    // -------------------- read(char[], offset, length) tests --------------------

    @Test
    public void testReadBufferLengthZeroReturnsZero() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("abc"));
        char[] buf = new char[5];
        int result = r.read(buf, 0, 0);
        assertEquals(0, result);
        // lastChar should remain UNDEFINED since no side effect happened
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
    }

    @Test
    public void testReadBufferAtEOFReturnsMinusOne() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        char[] buf = new char[5];
        int result = r.read(buf, 0, 5);
        assertEquals(-1, result);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
    }

    @Test
    public void testReadBufferNoNewlineNoIncrement() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("abc"));
        char[] buf = new char[3];
        int result = r.read(buf, 0, 3);
        assertEquals(3, result);
        assertEquals(0, r.getLineNumber());
        assertEquals('c', r.readAgain());
    }

    @Test
    public void testReadBufferLFWithPreviousCharInBufferNotCR() throws IOException {
        // "x\ny" length=3: i=1 is '\n', i>0 so check buf[i-1]='x' != '\r' -> increment
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("x\ny"));
        char[] buf = new char[3];
        int result = r.read(buf, 0, 3);
        assertEquals(3, result);
        assertEquals(1, r.getLineNumber());
        assertEquals('y', r.readAgain());
    }

    @Test
    public void testReadBufferCRLFWithinSameBufferNoDoubleIncrement() throws IOException {
        // "x\r\ny" length=4: i=1 '\r' -> increment; i=2 '\n' i>0 buf[1]='\r' -> no increment; i=3 'y'
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("x\r\ny"));
        char[] buf = new char[4];
        int result = r.read(buf, 0, 4);
        assertEquals(4, result);
        assertEquals(1, r.getLineNumber());
        assertEquals('y', r.readAgain());
    }

    @Test
    public void testReadBufferMultipleCRIncrementsMultipleTimes() throws IOException {
        // "x\r\ry" length=4: i=1 '\r' -> increment; i=2 '\r' -> increment; i=3 'y'
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("x\r\ry"));
        char[] buf = new char[4];
        int result = r.read(buf, 0, 4);
        assertEquals(4, result);
        assertEquals(2, r.getLineNumber());
        assertEquals('y', r.readAgain());
    }

    @Test
    public void testReadBufferLFAtOffsetZeroWithPreviousLastCharCR() throws IOException {
        // First read sets lastChar to '\r', then second read starts with '\n' at offset 0
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("a\r\nb"));
        char[] buf1 = new char[2];
        int result1 = r.read(buf1, 0, 2); // reads 'a','\r'
        assertEquals(2, result1);
        assertEquals(0, r.getLineNumber()); // 'a' no newline, '\r' increments -> actually check
        // 'a' at i=0 not newline; '\r' at i=1 increments lineCounter -> becomes 1
        assertEquals(1, r.getLineNumber());
        assertEquals('\r', r.readAgain());

        char[] buf2 = new char[2];
        int result2 = r.read(buf2, 0, 2); // reads '\n','b'
        assertEquals(2, result2);
        // i=0 is '\n', i>0 false, so check lastChar == '\r' -> true, no increment
        assertEquals(1, r.getLineNumber());
        assertEquals('b', r.readAgain());
    }

    @Test
    public void testReadBufferLFAtOffsetZeroWithPreviousLastCharNotCR() throws IOException {
        // First read sets lastChar to 'b' (not CR), then second read starts with '\n' at offset 0
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("ab\nc"));
        char[] buf1 = new char[2];
        int result1 = r.read(buf1, 0, 2); // reads 'a','b'
        assertEquals(2, result1);
        assertEquals(0, r.getLineNumber());
        assertEquals('b', r.readAgain());

        char[] buf2 = new char[2];
        int result2 = r.read(buf2, 0, 2); // reads '\n','c'
        assertEquals(2, result2);
        // i=0 is '\n', i>0 false, check lastChar == 'b' != '\r' -> increment
        assertEquals(1, r.getLineNumber());
        assertEquals('c', r.readAgain());
    }

    @Test
    public void testReadBufferWithOffset() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("hello"));
        char[] buf = new char[10];
        int result = r.read(buf, 2, 5);
        assertEquals(5, result);
        assertEquals('h', buf[2]);
        assertEquals('o', buf[6]);
        assertEquals('o', r.readAgain());
    }

    // -------------------- readLine() tests --------------------

    @Test
    public void testReadLineNormal() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("line1\nline2"));
        String line1 = r.readLine();
        assertEquals("line1", line1);
        assertEquals('1', r.readAgain());
        assertEquals(1, r.getLineNumber());

        String line2 = r.readLine();
        assertEquals("line2", line2);
        assertEquals('2', r.readAgain());
        assertEquals(2, r.getLineNumber());

        String line3 = r.readLine();
        assertNull(line3);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
    }

    @Test
    public void testReadLineEmptyFirstLine() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("\nabc"));
        String line1 = r.readLine();
        assertEquals("", line1);
        // length == 0, lastChar remains unchanged (UNDEFINED)
        assertEquals(ExtendedBufferedReader.UNDEFINED, r.readAgain());
        assertEquals(1, r.getLineNumber());

        String line2 = r.readLine();
        assertEquals("abc", line2);
        assertEquals('c', r.readAgain());
        assertEquals(2, r.getLineNumber());
    }

    @Test
    public void testReadLineAtEOFReturnsNull() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        String line = r.readLine();
        assertNull(line);
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
    }

    // -------------------- lookAhead() tests --------------------

    @Test
    public void testLookAheadDoesNotConsumeChar() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("ab"));
        int peeked = r.lookAhead();
        assertEquals('a', peeked);
        // reading should still return 'a' since lookAhead did not consume it
        assertEquals('a', r.read());
        assertEquals('b', r.lookAhead());
        assertEquals('b', r.read());
    }

    @Test
    public void testLookAheadAtEOF() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader(""));
        int peeked = r.lookAhead();
        assertEquals(-1, peeked);
    }

    // -------------------- getLineNumber() tests --------------------

    @Test
    public void testGetLineNumberInitiallyZero() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("abc"));
        assertEquals(0, r.getLineNumber());
    }

    @Test
    public void testGetLineNumberAfterMultipleNewlines() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("a\nb\nc\nd"));
        while (r.read() != ExtendedBufferedReader.END_OF_STREAM) {
            // consume all
        }
        assertEquals(3, r.getLineNumber());
    }

    @Test
    public void testCombinedUsageReadThenReadLine() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("x\nfoo\nbar"));
        assertEquals('x', r.read());
        assertEquals('\n', r.read());
        assertEquals(1, r.getLineNumber());

        String line = r.readLine();
        assertEquals("foo", line);
        assertEquals(2, r.getLineNumber());
        assertEquals('o', r.readAgain());

        String line2 = r.readLine();
        assertEquals("bar", line2);
        assertEquals(3, r.getLineNumber());
        assertEquals('r', r.readAgain());

        assertNull(r.readLine());
        assertEquals(ExtendedBufferedReader.END_OF_STREAM, r.readAgain());
    }

    @Test
    public void testCloseDoesNotThrow() throws IOException {
        ExtendedBufferedReader r = new ExtendedBufferedReader(new StringReader("abc"));
        r.close();
        assertTrue(true);
    }
}