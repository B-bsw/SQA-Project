package org.apache.commons.csv;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ExtendedBufferedReaderTest {

    private ExtendedBufferedReader reader;

    @Before
    public void setUp() {
        // Initialize with empty reader by default
        reader = new ExtendedBufferedReader(new StringReader(""));
    }

    @After
    public void tearDown() {
        try {
            reader.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void testReadSingleChar() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a"));
        Assert.assertEquals('a', reader.read());
        Assert.assertEquals(0, reader.getLineNumber());
        Assert.assertEquals('a', reader.readAgain());
    }

    @Test
    public void testReadNewlineIncrementsLineCounter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("\n"));
        Assert.assertEquals('\n', reader.read());
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadEndOfStream() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a"));
        Assert.assertEquals('a', reader.read());
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.read());
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadInitialStateUndefined() {
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
    }

    @Test
    public void testReadArrayZeroLength() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        char[] buf = new char[0];
        Assert.assertEquals(0, reader.read(buf, 0, 0));
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
    }

    @Test
    public void testReadArrayOneChar() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a"));
        char[] buf = new char[1];
        Assert.assertEquals(1, reader.read(buf, 0, 1));
        Assert.assertEquals('a', buf[0]);
        Assert.assertEquals('a', reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testReadArrayMultipleChars() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("ab\ncd"));
        char[] buf = new char[5];
        Assert.assertEquals(5, reader.read(buf, 0, 5));
        Assert.assertEquals("ab\ncd", new String(buf));
        Assert.assertEquals('d', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadArrayCarriageReturnIncrementsLineCounter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\rb"));
        char[] buf = new char[3];
        Assert.assertEquals(3, reader.read(buf, 0, 3));
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadArrayCRLFCountsAsOneLine() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\r\nb"));
        char[] buf = new char[4];
        Assert.assertEquals(4, reader.read(buf, 0, 4));
        // CRLF should be counted as one line break
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadArrayEndOfStream() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        char[] buf = new char[10];
        Assert.assertEquals(-1, reader.read(buf, 0, 10));
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadLineNormalLine() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("hello"));
        Assert.assertEquals("hello", reader.readLine());
        Assert.assertEquals('o', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadLineEmptyLine() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("\n"));
        Assert.assertEquals("", reader.readLine());
        Assert.assertEquals(1, reader.getLineNumber());
        // lastChar should be END_OF_STREAM only after next read
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
    }

    @Test
    public void testReadLineMultipleLines() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("line1\nline2\n"));
        Assert.assertEquals("line1", reader.readLine());
        Assert.assertEquals('1', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
        Assert.assertEquals("line2", reader.readLine());
        Assert.assertEquals('2', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testReadLineAtEOF() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        Assert.assertNull(reader.readLine());
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void testLookAheadReturnsNextCharWithoutConsuming() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("ab"));
        Assert.assertEquals('a', reader.lookAhead());
        Assert.assertEquals('a', reader.read());
        Assert.assertEquals('b', reader.lookAhead());
        Assert.assertEquals('b', reader.read());
    }

    @Test
    public void testLookAheadAtEOF() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.lookAhead());
    }

    @Test
    public void testKeepLastCharWithRead() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("abc"));
        reader.read();
        Assert.assertEquals('a', reader.readAgain());
        reader.read();
        Assert.assertEquals('b', reader.readAgain());
    }

    @Test
    public void testReadArrayUpdatesLastChar() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("xyz"));
        char[] buf = new char[2];
        reader.read(buf, 0, 2);
        Assert.assertEquals('y', reader.readAgain());
    }

    @Test
    public void testGetLineNumberAfterMultipleReads() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a\nb\nc"));
        Assert.assertEquals(0, reader.getLineNumber());
        reader.read();
        Assert.assertEquals(0, reader.getLineNumber());
        reader.read(); // \n
        Assert.assertEquals(1, reader.getLineNumber());
        reader.read();
        Assert.assertEquals(1, reader.getLineNumber());
        reader.read(); // \n
        Assert.assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testReadArrayCRLFAtBoundary() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("\r\n"));
        char[] buf = new char[2];
        Assert.assertEquals(2, reader.read(buf, 0, 2));
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadArrayLFOnly() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("\n"));
        char[] buf = new char[1];
        Assert.assertEquals(1, reader.read(buf, 0, 1));
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadArrayCROnly() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("\r"));
        char[] buf = new char[1];
        Assert.assertEquals(1, reader.read(buf, 0, 1));
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void testReadClearsStateAfterEOF() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("a"));
        reader.read();
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.read());
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
    }

    @Test
    public void testReadLineWithCRLF() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("hello\r\nworld"));
        Assert.assertEquals("hello", reader.readLine());
        Assert.assertEquals('o', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
        Assert.assertEquals("world", reader.readLine());
        Assert.assertEquals('d', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void testReadArrayOverwritesBuffer() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("ab"));
        char[] buf = new char[2];
        Assert.assertEquals(2, reader.read(buf, 0, 2));
        Assert.assertEquals('b', reader.readAgain());
        buf[0] = 'z';
        Assert.assertEquals(2, reader.read(buf, 0, 2));
        Assert.assertEquals(-1, reader.readAgain());
    }
}