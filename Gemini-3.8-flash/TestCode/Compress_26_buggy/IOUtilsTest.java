package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class IOUtilsTest {

    @Test
    public void constructor_shouldBePrivateAndCallableViaReflection() throws Exception {
        Constructor constructor = IOUtils.class.getDeclaredConstructor(new Class[0]);
        Assert.assertTrue(java.lang.reflect.Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof IOUtils);
    }

    @Test
    public void copy_givenStandardData_shouldCopyAllBytes() throws IOException {
        byte[] sourceData = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        InputStream input = new ByteArrayInputStream(sourceData);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long copied = IOUtils.copy(input, output);

        Assert.assertEquals(sourceData.length, copied);
        Assert.assertArrayEquals(sourceData, output.toByteArray());
    }

    @Test
    public void copy_givenEmptySource_shouldCopyZeroBytes() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long copied = IOUtils.copy(input, output);

        Assert.assertEquals(0L, copied);
        Assert.assertEquals(0, output.toByteArray().length);
    }

    @Test
    public void copy_givenLargeDataExceedingDefaultBuffer_shouldCopyAllBytes() throws IOException {
        byte[] sourceData = new byte[16384];
        for (int i = 0; i < sourceData.length; i++) {
            sourceData[i] = (byte) (i % 127);
        }
        InputStream input = new ByteArrayInputStream(sourceData);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        long copied = IOUtils.copy(input, output);

        Assert.assertEquals(sourceData.length, copied);
        Assert.assertArrayEquals(sourceData, output.toByteArray());
    }

    @Test
    public void copy_givenCustomBufferSize_shouldCopyAllBytesCorrectly() throws IOException {
        byte[] sourceData = new byte[] { 10, 20, 30, 40, 50, 60, 70 };
        InputStream input = new ByteArrayInputStream(sourceData);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int customBufferSize = 2;

        long copied = IOUtils.copy(input, output, customBufferSize);

        Assert.assertEquals(sourceData.length, copied);
        Assert.assertArrayEquals(sourceData, output.toByteArray());
    }

    @Test(expected = NullPointerException.class)
    public void copy_givenNullInputStream_shouldThrowNullPointerException() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        IOUtils.copy(null, output);
    }

    @Test(expected = NullPointerException.class)
    public void copy_givenNullOutputStream_shouldThrowNullPointerException() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        IOUtils.copy(input, null);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void copy_givenNegativeBufferSize_shouldThrowNegativeArraySizeException() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2 });
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        IOUtils.copy(input, output, -1);
    }

    @Test
    public void skip_givenZeroOrNegativeSkipCount_shouldReturnZeroWithoutSkipping() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        InputStream inputZero = new ByteArrayInputStream(data);
        long skippedZero = IOUtils.skip(inputZero, 0);
        Assert.assertEquals(0L, skippedZero);

        InputStream inputNegative = new ByteArrayInputStream(data);
        long skippedNegative = IOUtils.skip(inputNegative, -5);
        Assert.assertEquals(0L, skippedNegative);
    }

    @Test
    public void skip_givenRequestedBytesWithinStreamLength_shouldSkipRequestedAmount() throws IOException {
        byte[] data = new byte[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        InputStream input = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(input, 4);

        Assert.assertEquals(4L, skipped);
        Assert.assertEquals(50, input.read());
    }

    @Test
    public void skip_givenRequestedBytesExceedingStreamLength_shouldSkipOnlyAvailable() throws IOException {
        byte[] data = new byte[] { 1, 2, 3 };
        InputStream input = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(input, 10);

        Assert.assertEquals(3L, skipped);
        Assert.assertEquals(-1, input.read());
    }

    @Test
    public void skip_givenStreamReturningZeroOnSkip_shouldBreakAndReturnSkippedCount() throws IOException {
        InputStream input = new FilterInputStream(new ByteArrayInputStream(new byte[] { 1, 2, 3 })) {
            public long skip(long n) throws IOException {
                return 0L;
            }
        };

        long skipped = IOUtils.skip(input, 5);

        Assert.assertEquals(0L, skipped);
    }

    @Test
    public void skip_givenStreamWithPartialSkips_shouldLoopUntilFulfilled() throws IOException {
        InputStream input = new FilterInputStream(new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6 })) {
            public long skip(long n) throws IOException {
                long toSkip = Math.min(2L, n);
                return super.skip(toSkip);
            }
        };

        long skipped = IOUtils.skip(input, 5);

        Assert.assertEquals(5L, skipped);
        Assert.assertEquals(6, input.read());
    }

    @Test
    public void readFully_givenFullArrayBuffer_shouldFillEntireArray() throws IOException {
        byte[] sourceData = new byte[] { 1, 2, 3, 4, 5 };
        InputStream input = new ByteArrayInputStream(sourceData);
        byte[] target = new byte[5];

        int readCount = IOUtils.readFully(input, target);

        Assert.assertEquals(5, readCount);
        Assert.assertArrayEquals(sourceData, target);
    }

    @Test
    public void readFully_givenArrayLargerThanStream_shouldReturnActualBytesRead() throws IOException {
        byte[] sourceData = new byte[] { 1, 2, 3 };
        InputStream input = new ByteArrayInputStream(sourceData);
        byte[] target = new byte[6];

        int readCount = IOUtils.readFully(input, target);

        Assert.assertEquals(3, readCount);
        Assert.assertEquals(1, target[0]);
        Assert.assertEquals(2, target[1]);
        Assert.assertEquals(3, target[2]);
        Assert.assertEquals(0, target[3]);
    }

    @Test
    public void readFully_givenOffsetAndLength_shouldFillSpecifiedRangeOnly() throws IOException {
        byte[] sourceData = new byte[] { 7, 8, 9 };
        InputStream input = new ByteArrayInputStream(sourceData);
        byte[] target = new byte[6];

        int readCount = IOUtils.readFully(input, target, 2, 3);

        Assert.assertEquals(3, readCount);
        Assert.assertEquals(0, target[0]);
        Assert.assertEquals(0, target[1]);
        Assert.assertEquals(7, target[2]);
        Assert.assertEquals(8, target[3]);
        Assert.assertEquals(9, target[4]);
        Assert.assertEquals(0, target[5]);
    }

    @Test
    public void readFully_givenZeroLength_shouldReturnZeroImmediately() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        byte[] target = new byte[5];

        int readCount = IOUtils.readFully(input, target, 1, 0);

        Assert.assertEquals(0, readCount);
    }

    @Test
    public void readFully_givenEmptyStream_shouldReturnZero() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        byte[] target = new byte[5];

        int readCount = IOUtils.readFully(input, target);

        Assert.assertEquals(0, readCount);
    }

    @Test
    public void readFully_givenFragmentedInputStream_shouldLoopUntilAllBytesRead() throws IOException {
        final byte[] source = new byte[] { 11, 12, 13, 14, 15 };
        InputStream input = new InputStream() {
            private int index = 0;

            public int read() throws IOException {
                if (index < source.length) {
                    return source[index++];
                }
                return -1;
            }

            public int read(byte[] b, int off, int len) throws IOException {
                if (index >= source.length) {
                    return -1;
                }
                b[off] = source[index++];
                return 1;
            }
        };

        byte[] target = new byte[5];
        int readCount = IOUtils.readFully(input, target, 0, 5);

        Assert.assertEquals(5, readCount);
        Assert.assertArrayEquals(source, target);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readFully_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        byte[] target = new byte[5];
        IOUtils.readFully(input, target, -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readFully_givenNegativeLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        byte[] target = new byte[5];
        IOUtils.readFully(input, target, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readFully_givenOffsetPlusLengthExceedingBufferSize_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        byte[] target = new byte[5];
        IOUtils.readFully(input, target, 3, 3);
    }

    @Test
    public void readFully_givenOffsetPlusLengthEqualToBufferSize_shouldSucceed() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 10, 20 });
        byte[] target = new byte[5];
        int readCount = IOUtils.readFully(input, target, 3, 2);

        Assert.assertEquals(2, readCount);
        Assert.assertEquals(10, target[3]);
        Assert.assertEquals(20, target[4]);
    }

    @Test(expected = NullPointerException.class)
    public void readFully_givenNullBuffer_shouldThrowNullPointerException() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        IOUtils.readFully(input, null, 0, 1);
    }

    @Test(expected = NullPointerException.class)
    public void readFully_givenNullInputStream_shouldThrowNullPointerException() throws IOException {
        byte[] target = new byte[5];
        IOUtils.readFully(null, target, 0, 2);
    }

    @Test
    public void toByteArray_givenPopulatedInputStream_shouldReturnExactByteArray() throws IOException {
        byte[] expected = new byte[] { 'H', 'e', 'l', 'l', 'o' };
        InputStream input = new ByteArrayInputStream(expected);

        byte[] actual = IOUtils.toByteArray(input);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void toByteArray_givenEmptyInputStream_shouldReturnEmptyByteArray() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[0]);

        byte[] actual = IOUtils.toByteArray(input);

        Assert.assertNotNull(actual);
        Assert.assertEquals(0, actual.length);
    }

    @Test(expected = NullPointerException.class)
    public void toByteArray_givenNullInputStream_shouldThrowNullPointerException() throws IOException {
        IOUtils.toByteArray(null);
    }

    @Test
    public void closeQuietly_givenNullCloseable_shouldDoNothingWithoutException() {
        try {
            IOUtils.closeQuietly(null);
        } catch (Throwable t) {
            Assert.fail("closeQuietly on null should not throw any exception: " + t.getMessage());
        }
    }

    @Test
    public void closeQuietly_givenValidCloseable_shouldCloseSuccessfully() {
        final boolean[] closed = new boolean[] { false };
        Closeable closeable = new Closeable() {
            public void close() throws IOException {
                closed[0] = true;
            }
        };

        IOUtils.closeQuietly(closeable);

        Assert.assertTrue("Closeable should have been closed", closed[0]);
    }

    @Test
    public void closeQuietly_givenCloseableThrowingIOException_shouldSwallowExceptionQuietly() {
        final boolean[] closeAttempted = new boolean[] { false };
        Closeable throwingCloseable = new Closeable() {
            public void close() throws IOException {
                closeAttempted[0] = true;
                throw new IOException("Simulated I/O failure");
            }
        };

        try {
            IOUtils.closeQuietly(throwingCloseable);
            Assert.assertTrue("Close method should have been called", closeAttempted[0]);
        } catch (Throwable t) {
            Assert.fail("closeQuietly must swallow IOException, but threw: " + t.getMessage());
        }
    }
}