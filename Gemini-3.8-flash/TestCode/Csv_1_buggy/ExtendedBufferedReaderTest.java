package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Test suite for {@link ExtendedBufferedReader}.
 */
public class ExtendedBufferedReaderTest {

    private ExtendedBufferedReader createReader(String input) {
        return new ExtendedBufferedReader(new StringReader(input));
    }

    @Test
    public void constants_verifyValues() {
        Assert.assertEquals(-1, ExtendedBufferedReader.END_OF_STREAM);
        Assert.assertEquals(-2, ExtendedBufferedReader.UNDEFINED);
    }

    @Test
    public void initialState_givenNewInstance_shouldHaveDefaultValues() {
        ExtendedBufferedReader reader = createReader("test");

        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void read_givenSingleCharacters_shouldReturnCharAndMaintainState() throws IOException {
        ExtendedBufferedReader reader = createReader("a\nb");

        int first = reader.read();
        Assert.assertEquals('a', first);
        Assert.assertEquals('a', reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());

        int newline = reader.read();
        Assert.assertEquals('\n', newline);
        Assert.assertEquals('\n', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());

        int second = reader.read();
        Assert.assertEquals('b', second);
        Assert.assertEquals('b', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());

        int eof = reader.read();
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, eof);
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void read_givenCarriageReturn_shouldNotIncrementLineCounter() throws IOException {
        ExtendedBufferedReader reader = createReader("\r");

        int cr = reader.read();
        Assert.assertEquals('\r', cr);
        Assert.assertEquals('\r', reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void read_givenEmptyReader_shouldReturnEndOfStreamImmediately() throws IOException {
        ExtendedBufferedReader reader = createReader("");

        int result = reader.read();
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, result);
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenZeroLength_shouldReturnZeroAndNoChange() throws IOException {
        ExtendedBufferedReader reader = createReader("hello");
        char[] buf = new char[5];

        int bytesRead = reader.read(buf, 0, 0);

        Assert.assertEquals(0, bytesRead);
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenStandardContent_shouldPopulateBufferAndTrackLastChar() throws IOException {
        ExtendedBufferedReader reader = createReader("abcdef");
        char[] buf = new char[10];

        int bytesRead = reader.read(buf, 2, 4);

        Assert.assertEquals(4, bytesRead);
        Assert.assertEquals('a', buf[2]);
        Assert.assertEquals('b', buf[3]);
        Assert.assertEquals('c', buf[4]);
        Assert.assertEquals('d', buf[5]);
        Assert.assertEquals('d', reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenCarriageReturnOnly_shouldIncrementLineNumber() throws IOException {
        ExtendedBufferedReader reader = createReader("a\rb\rc");
        char[] buf = new char[10];

        int bytesRead = reader.read(buf, 0, 5);

        Assert.assertEquals(5, bytesRead);
        Assert.assertEquals('c', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenNewlineOnly_shouldIncrementLineNumber() throws IOException {
        ExtendedBufferedReader reader = createReader("a\nb\nc");
        char[] buf = new char[10];

        int bytesRead = reader.read(buf, 0, 5);

        Assert.assertEquals(5, bytesRead);
        Assert.assertEquals('c', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenCrlfInSameBuffer_shouldIncrementLineNumberOncePerPair() throws IOException {
        ExtendedBufferedReader reader = createReader("a\r\nb\r\n");
        char[] buf = new char[10];

        int bytesRead = reader.read(buf, 0, 6);

        Assert.assertEquals(6, bytesRead);
        Assert.assertEquals('\n', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenCrlfSplitAcrossReads_shouldIncrementLineNumberOnce() throws IOException {
        ExtendedBufferedReader reader = createReader("a\r\nb");
        char[] buf1 = new char[2];
        char[] buf2 = new char[2];

        int read1 = reader.read(buf1, 0, 2);
        Assert.assertEquals(2, read1);
        Assert.assertEquals('a', buf1[0]);
        Assert.assertEquals('\r', buf1[1]);
        Assert.assertEquals('\r', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());

        int read2 = reader.read(buf2, 0, 2);
        Assert.assertEquals(2, read2);
        Assert.assertEquals('\n', buf2[0]);
        Assert.assertEquals('b', buf2[1]);
        Assert.assertEquals('b', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenNewlineAtStartWhenPreviousNotCr_shouldIncrementLineNumber() throws IOException {
        ExtendedBufferedReader reader = createReader("a\nb");
        char[] buf1 = new char[1];
        char[] buf2 = new char[2];

        int read1 = reader.read(buf1, 0, 1);
        Assert.assertEquals(1, read1);
        Assert.assertEquals('a', buf1[0]);
        Assert.assertEquals('a', reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());

        int read2 = reader.read(buf2, 0, 2);
        Assert.assertEquals(2, read2);
        Assert.assertEquals('\n', buf2[0]);
        Assert.assertEquals('b', buf2[1]);
        Assert.assertEquals('b', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());
    }

    @Test
    public void readCharArray_givenEndOfStream_shouldReturnMinusOneAndSetLastChar() throws IOException {
        ExtendedBufferedReader reader = createReader("");
        char[] buf = new char[5];

        int bytesRead = reader.read(buf, 0, 5);

        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, bytesRead);
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void readLine_givenNonEmptyLines_shouldReturnLinesAndTrackState() throws IOException {
        ExtendedBufferedReader reader = createReader("first\nsecond\r\nthird");

        String line1 = reader.readLine();
        Assert.assertEquals("first", line1);
        Assert.assertEquals('t', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());

        String line2 = reader.readLine();
        Assert.assertEquals("second", line2);
        Assert.assertEquals('d', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());

        String line3 = reader.readLine();
        Assert.assertEquals("third", line3);
        Assert.assertEquals('d', reader.readAgain());
        Assert.assertEquals(3, reader.getLineNumber());

        String eof = reader.readLine();
        Assert.assertNull(eof);
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        Assert.assertEquals(3, reader.getLineNumber());
    }

    @Test
    public void readLine_givenEmptyLines_shouldIncrementLineCounterWithoutChangingLastChar() throws IOException {
        ExtendedBufferedReader reader = createReader("a\n\nb");

        String line1 = reader.readLine();
        Assert.assertEquals("a", line1);
        Assert.assertEquals('a', reader.readAgain());
        Assert.assertEquals(1, reader.getLineNumber());

        String line2 = reader.readLine();
        Assert.assertEquals("", line2);
        Assert.assertEquals('a', reader.readAgain());
        Assert.assertEquals(2, reader.getLineNumber());

        String line3 = reader.readLine();
        Assert.assertEquals("b", line3);
        Assert.assertEquals('b', reader.readAgain());
        Assert.assertEquals(3, reader.getLineNumber());
    }

    @Test
    public void readLine_givenInitiallyEmptyStream_shouldReturnNullAndSetEof() throws IOException {
        ExtendedBufferedReader reader = createReader("");

        String line = reader.readLine();

        Assert.assertNull(line);
        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test
    public void lookAhead_givenAvailableData_shouldPeekWithoutAdvancing() throws IOException {
        ExtendedBufferedReader reader = createReader("xy");

        int peek1 = reader.lookAhead();
        Assert.assertEquals('x', peek1);
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());

        int peek2 = reader.lookAhead();
        Assert.assertEquals('x', peek2);
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());

        int read1 = reader.read();
        Assert.assertEquals('x', read1);
        Assert.assertEquals('x', reader.readAgain());

        int peek3 = reader.lookAhead();
        Assert.assertEquals('y', peek3);
        Assert.assertEquals('x', reader.readAgain());

        int read2 = reader.read();
        Assert.assertEquals('y', read2);
        Assert.assertEquals('y', reader.readAgain());
    }

    @Test
    public void lookAhead_givenEndOfStream_shouldReturnMinusOne() throws IOException {
        ExtendedBufferedReader reader = createReader("");

        int peek = reader.lookAhead();

        Assert.assertEquals(ExtendedBufferedReader.END_OF_STREAM, peek);
        Assert.assertEquals(ExtendedBufferedReader.UNDEFINED, reader.readAgain());
        Assert.assertEquals(0, reader.getLineNumber());
    }

    @Test(expected = IOException.class)
    public void read_givenClosedReader_shouldThrowIOException() throws IOException {
        ExtendedBufferedReader reader = createReader("test");
        reader.close();

        reader.read();
    }

    @Test(expected = IOException.class)
    public void readCharArray_givenClosedReader_shouldThrowIOException() throws IOException {
        ExtendedBufferedReader reader = createReader("test");
        reader.close();
        char[] buf = new char[4];

        reader.read(buf, 0, 4);
    }

    @Test(expected = IOException.class)
    public void readLine_givenClosedReader_shouldThrowIOException() throws IOException {
        ExtendedBufferedReader reader = createReader("test");
        reader.close();

        reader.readLine();
    }

    @Test(expected = IOException.class)
    public void lookAhead_givenClosedReader_shouldThrowIOException() throws IOException {
        ExtendedBufferedReader reader = createReader("test");
        reader.close();

        reader.lookAhead();
    }

    @Test(expected = NullPointerException.class)
    public void constructor_givenNullReader_shouldThrowNullPointerException() {
        new ExtendedBufferedReader((Reader) null);
    }
}