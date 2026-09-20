package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.junit.Test;

public class BitInputStreamTest {

    // ---------- Constructor / basic sanity ----------

    @Test
    public void testConstructorLittleEndian() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] {0x01});
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        assertEquals(1L, bis.readBits(8));
        bis.close();
    }

    @Test
    public void testConstructorBigEndian() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] {0x01});
        BitInputStream bis = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        assertEquals(1L, bis.readBits(8));
        bis.close();
    }

    // ---------- readBits: normal cases ----------

    @Test
    public void testReadBitsLittleEndianSingleByteSplit() throws IOException {
        // byte 0x0F -> readBits(4) twice
        InputStream in = new ByteArrayInputStream(new byte[] {0x0F});
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        long first = bis.readBits(4);
        long second = bis.readBits(4);
        ass