package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Charsets;

public class SourceFileTest {

    private static final String LINE1 = "var x = 1;";
    private static final String LINE2 = "var y = 2;";
    private static final String LINE3 = "var z = 3;";
    private static final String LINE4 = "var a = 4;";
    private static final String LINE5 = "var b = 5;";
    private static final String LINE6 = "var c = 6;";
    private static final String CODE = LINE1 + "\n" + LINE2 + "\n" + LINE3 + "\n" + LINE4 + "\n" + LINE5 + "\n" + LINE6;

    private SourceFile sourceFile;

    @Before
    public void setUp() {
        sourceFile = SourceFile.fromCode("test.js", CODE);
    }

    @Test
    public void testConstructorNullFileName() {
        try {
            new SourceFile(null);
            fail("Expected IllegalArgumentException for null file name");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorEmptyFileName() {
        try {
            new SourceFile("");
            fail("Expected IllegalArgumentException for empty file name");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorValidFileName() {
        SourceFile sf = new SourceFile("test.js");
        assertEquals("test.js", sf.getName());
        assertFalse(sf.isExtern());
        assertFalse(sf.hasSourceInMemory());
        assertNull(sf.getOriginalPath());
    }

    @Test
    public void testGetLineOffsetInvalidLow() {
        try {
            sourceFile.getLineOffset(0);
            fail("Expected IllegalArgumentException for line number 0");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetLineOffsetInvalidHigh() {
        try {
            sourceFile.getLineOffset(100);
            fail("Expected IllegalArgumentException for line number too high");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetLineOffsetValidFirstLine() {
        assertEquals(0, sourceFile.getLineOffset(1));
    }

    @Test
    public void testGetLineOffsetValidMiddleLine() {
        int offset = sourceFile.getLineOffset(3);
        assertEquals(LINE1.length() + 1 + LINE2.length() + 1, offset);
    }

    @Test
    public void testGetNumLines() {
        assertEquals(6, sourceFile.getNumLines());
    }

    @Test
    public void testGetLineFirstLine() throws IOException {
        assertEquals(LINE1, sourceFile.getLine(1));
    }

    @Test
    public void testGetLineMiddle() throws IOException {
        assertEquals(LINE3, sourceFile.getLine(3));
    }

    @Test
    public void testGetLineLastLine() throws IOException {
        assertEquals(LINE6, sourceFile.getLine(6));
    }

    @Test
    public void testGetLineLineNumberTooHigh() throws IOException {
        assertNull(sourceFile.getLine(7));
    }

    @Test
    public void testGetLineIOErrorReturnsNull() throws IOException {
        SourceFile sf = new SourceFile("test.js");
        assertNull(sf.getLine(1));
    }

    @Test
    public void testGetRegionInsideFirstRegion() {
        SourceFile.Region region = sourceFile.getRegion(1);
        assertNotNull(region);
        assertTrue(region.getBeginningLineNumber() >= 1);
        assertTrue(region.getEndingLineNumber() >= 1);
        String regionCode = region.getSourceExcerpt();
        assertNotNull(regionCode);
        assertTrue(regionCode.contains(LINE1));
    }

    @Test
    public void testGetRegionNearEndOfFile() {
        SourceFile.Region region = sourceFile.getRegion(6);
        assertNotNull(region);
        String regionCode = region.getSourceExcerpt();
        assertTrue(regionCode.contains(LINE6));
    }

    @Test
    public void testGetRegionMultipleLines() {
        SourceFile.Region region = sourceFile.getRegion(3);
        assertNotNull(region);
        String regionCode = region.getSourceExcerpt();
        assertTrue(regionCode.contains(LINE2));
        assertTrue(regionCode.contains(LINE3));
        assertTrue(regionCode.contains(LINE4));
    }

    @Test
    public void testFromFile() throws IOException {
        File tempFile = File.createTempFile("source", ".js");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), CODE.getBytes(Charsets.UTF_8));
        SourceFile sf = SourceFile.fromFile(tempFile.getPath());
        assertNotNull(sf);
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testFromFileWithCharset() throws IOException {
        File tempFile = File.createTempFile("source", ".js");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), CODE.getBytes(Charsets.UTF_8));
        SourceFile sf = SourceFile.fromFile(tempFile, Charsets.UTF_8);
        assertNotNull(sf);
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testFromCodeWithOriginalPath() {
        SourceFile sf = SourceFile.fromCode("test.js", "original/path/test.js", CODE);
        assertEquals("original/path/test.js", sf.getOriginalPath());
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testFromCodeWithoutOriginalPath() {
        SourceFile sf = SourceFile.fromCode("test.js", CODE);
        assertEquals("test.js", sf.getOriginalPath());
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testFromReader() throws IOException {
        Reader reader = new StringReader(CODE);
        SourceFile sf = SourceFile.fromReader("test.js", reader);
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testFromGenerator() throws IOException {
        SourceFile sf = SourceFile.fromGenerator("test.js", new SourceFile.Generator() {
            @Override
            public String getCode() {
                return CODE;
            }
        });
        assertEquals(CODE, sf.getCode());
        assertTrue(sf.hasSourceInMemory());
    }

    @Test
    public void testSetOriginalPath() {
        SourceFile sf = new SourceFile("test.js");
        sf.setOriginalPath("custom/path.js");
        assertEquals("custom/path.js", sf.getOriginalPath());
    }

    @Test
    public void testGetOriginalPathDefaultsToFileName() {
        SourceFile sf = new SourceFile("test.js");
        assertEquals("test.js", sf.getOriginalPath());
    }

    @Test
    public void testSetIsExtern() {
        SourceFile sf = new SourceFile("test.js");
        sf.setIsExtern(true);
        assertTrue(sf.isExtern());
        sf.setIsExtern(false);
        assertFalse(sf.isExtern());
    }

    @Test
    public void testClearCachedSource() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE);
        assertEquals(CODE, sf.getCode());
        sf.clearCachedSource();
        assertNotNull(sf.getCode());
    }

    @Test
    public void testHasSourceInMemory() {
        SourceFile sf = new SourceFile("test.js");
        assertFalse(sf.hasSourceInMemory());
        SourceFile preloaded = SourceFile.fromCode("test.js", CODE);
        assertTrue(preloaded.hasSourceInMemory());
    }

    @Test
    public void testFromInputStream() throws IOException {
        java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream(CODE.getBytes(Charsets.UTF_8));
        SourceFile sf = SourceFile.fromInputStream("test.js", input);
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testFromInputStreamWithOriginalPath() throws IOException {
        java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream(CODE.getBytes(Charsets.UTF_8));
        SourceFile sf = SourceFile.fromInputStream("test.js", "original/path.js", input);
        assertEquals("original/path.js", sf.getOriginalPath());
        assertEquals(CODE, sf.getCode());
    }

    @Test
    public void testGeneratedGetCode() throws IOException {
        final String generatedCode = "var generated = 1;";
        SourceFile.Generator generator = new SourceFile.Generator() {
            @Override
            public String getCode() {
                return generatedCode;
            }
        };
        SourceFile sf = SourceFile.fromGenerator("test.js", generator);
        assertEquals(generatedCode, sf.getCode());
        sf.clearCachedSource();
        assertEquals(generatedCode, sf.getCode());
    }

    @Test
    public void testOnDiskGetCode() throws IOException {
        File tempFile = File.createTempFile("source", ".js");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), CODE.getBytes(Charsets.UTF_8));
        SourceFile.OnDisk onDisk = new SourceFile.OnDisk(tempFile, Charsets.UTF_8);
        assertEquals(CODE, onDisk.getCode());
    }

    @Test
    public void testOnDiskWithNullCharset() throws IOException {
        File tempFile = File.createTempFile("source", ".js");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), CODE.getBytes(Charsets.UTF_8));
        SourceFile.OnDisk onDisk = new SourceFile.OnDisk(tempFile, null);
        assertEquals(CODE, onDisk.getCode());
    }

    @Test
    public void testOnDiskSetCharset() throws IOException {
        File tempFile = File.createTempFile("source", ".js");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), CODE.getBytes(Charsets.UTF_8));
        SourceFile.OnDisk onDisk = new SourceFile.OnDisk(tempFile);
        onDisk.setCharset(Charsets.UTF_8);
        assertEquals(CODE, onDisk.getCode());
    }

    @Test
    public void testOnDiskGetCharsetDefault() {
        File tempFile = new File("test.js");
        SourceFile.OnDisk onDisk = new SourceFile.OnDisk(tempFile);
        assertEquals(Charsets.UTF_8, onDisk.getCharset());
    }

    @Test
    public void testOnDiskGetCodeReader() throws IOException {
        File tempFile = File.createTempFile("source", ".js");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), CODE.getBytes(Charsets.UTF_8));
        SourceFile.OnDisk onDisk = new SourceFile.OnDisk(tempFile);
        onDisk.setCharset(Charsets.UTF_8);
        Reader reader = onDisk.getCodeReader();
        assertNotNull(reader);
    }

    @Test
    public void testPreloadedGetCode() throws IOException {
        SourceFile.Preloaded preloaded = new SourceFile.Preloaded("test.js", CODE);
        assertEquals(CODE, preloaded.getCode());
    }

    @Test
    public void testPreloadedWithOriginalPath() throws IOException {
        SourceFile.Preloaded preloaded = new SourceFile.Preloaded("test.js", "original/path.js", CODE);
        assertEquals("original/path.js", preloaded.getOriginalPath());
        assertEquals(CODE, preloaded.getCode());
    }

    @Test
    public void testGetCodeNoCache() {
        SourceFile.Preloaded preloaded = new SourceFile.Preloaded("test.js", CODE);
        assertEquals(CODE, preloaded.getCodeNoCache());
    }

    @Test
    public void testGetCodeReaderPreloaded() throws IOException {
        SourceFile.Preloaded preloaded = new SourceFile.Preloaded("test.js", CODE);
        Reader reader = preloaded.getCodeReader();
        assertNotNull(reader);
    }
}