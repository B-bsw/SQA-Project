package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonWriteContext;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class GeneratorBaseTest {

    private static class TestGenerator extends GeneratorBase {
        private String rawText;
        private int rawOffset;
        private int rawLength;
        private char[] rawChars;
        private Object writtenObject;
        private int verifyValueWriteCount;

        TestGenerator(int features, ObjectCodec codec) {
            super(features, codec);
        }

        TestGenerator(int features, ObjectCodec codec, JsonWriteContext ctxt) {
            super(features, codec, ctxt);
        }

        @Override
        public void flush() throws IOException {}

        @Override
        protected void _releaseBuffers() {}

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {
            verifyValueWriteCount++;
        }

        @Override
        public void writeNumber(int i) throws IOException {}
        @Override
        public void writeNumber(long l) throws IOException {}
        @Override
        public void writeNumber(double d) throws IOException {}
        @Override
        public void writeNumber(float f) throws IOException {}
        @Override
        public void writeNumber(BigDecimal dec) throws IOException {}
        @Override
        public void writeBoolean(boolean state) throws IOException {}
        @Override
        public void writeNull() throws IOException {}
        @Override
        public void writeString(String text) throws IOException {}
        @Override
        public void writeRaw(String text) throws IOException { rawText = text; }
        @Override
        public void writeRaw(String text, int offset, int len) throws IOException {
            rawText = text;
            rawOffset = offset;
            rawLength = len;
        }
        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException {
            rawChars = text;
            rawOffset = offset;
            rawLength = len;
        }
        @Override
        public void writeRaw(char c) throws IOException {}

        @Override
        protected void _writeSimpleObject(Object value) {
            writtenObject = value;
        }

        @Override
        protected PrettyPrinter _constructDefaultPrettyPrinter() {
            return super._constructDefaultPrettyPrinter();
        }
    }

    private TestGenerator generator;

    @Before
    public void setUp() {
        generator = new TestGenerator(0, null);
    }

    @After
    public void tearDown() {
        generator = null;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorWithDefaultFeatures() {
        assertEquals(0, generator.getFeatureMask());
        assertNotNull(generator.getOutputContext());
        assertNull(generator.getCurrentValue());
        assertFalse(generator._cfgNumbersAsStrings);
        assertNotNull(generator.version());
        assertNull(generator.getCodec());
    }

    @Test
    public void testConstructorWithWriteNumbersAsStringsFeature() {
        TestGenerator gen = new TestGenerator(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask(), null);
        assertTrue(gen._cfgNumbersAsStrings);
        assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testConstructorWithStrictDuplicateDetectionFeature() {
        TestGenerator gen = new TestGenerator(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask(), null);
        assertNotNull(gen.getOutputContext().getDupDetector());
    }

    @Test
    public void testConstructorWithoutStrictDuplicateDetectionFeature() {
        assertNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testConstructorWithCustomContext() {
        JsonWriteContext context = JsonWriteContext.createRootContext(null);
        TestGenerator gen = new TestGenerator(0, null, context);
        assertSame(context, gen.getOutputContext());
    }

    // ---------- feature enabling/disabling tests ----------

    @Test
    public void testEnableWriteNumbersAsStrings() {
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        assertTrue(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testEnableEscapeNonAscii() {
        generator.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
    }

    @Test
    public void testEnableStrictDuplicateDetectionWhenNull() {
        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testEnableStrictDuplicateDetectionWhenAlreadyEnabled() {
        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(generator.getOutputContext().getDupDetector());
        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testDisableWriteNumbersAsStrings() {
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertFalse(generator.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        assertFalse(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testDisableEscapeNonAscii() {
        generator.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        generator.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertFalse(generator.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
    }

    @Test
    public void testDisableStrictDuplicateDetectionWhenEnabled() {
        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        generator.disable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testSetFeatureMask() {
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        generator.setFeatureMask(mask);
        assertEquals(mask, generator.getFeatureMask());
        assertTrue(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testSetFeatureMaskWithNoChange() {
        int mask = generator.getFeatureMask();
        generator.setFeatureMask(mask);
        assertEquals(mask, generator.getFeatureMask());
    }

    @Test
    public void testOverrideStdFeatures() {
        int values = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        generator.overrideStdFeatures(values, values);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
    }

    @Test
    public void testOverrideStdFeaturesWithNoChange() {
        int values = generator.getFeatureMask();
        generator.overrideStdFeatures(values, 0);
        assertEquals(values, generator.getFeatureMask());
    }

    // ---------- _checkStdFeatureChanges tests ----------

    @Test
    public void testCheckStdFeatureChangesNoChange() {
        generator._checkStdFeatureChanges(0, 0);
        assertFalse(generator._cfgNumbersAsStrings);
        assertNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testCheckStdFeatureChangesWriteNumbersAsStringsChange() {
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        generator._checkStdFeatureChanges(mask, mask);
        assertTrue(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testCheckStdFeatureChangesEscapeNonAsciiEnable() {
        int mask = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        generator._checkStdFeatureChanges(mask, mask);
        // No explicit way to check, but should not throw
    }

    @Test
    public void testCheckStdFeatureChangesEscapeNonAsciiDisable() {
        int mask = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        generator._checkStdFeatureChanges(0, mask);
        // No explicit way to check, but should not throw
    }

    @Test
    public void testCheckStdFeatureChangesStrictDuplicateEnable() {
        int mask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        generator._checkStdFeatureChanges(mask, mask);
        assertNotNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testCheckStdFeatureChangesStrictDuplicateDisable() {
        int enableMask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        generator._checkStdFeatureChanges(enableMask, enableMask);
        generator._checkStdFeatureChanges(0, enableMask);
        assertNull(generator.getOutputContext().getDupDetector());
    }

    // ---------- useDefaultPrettyPrinter tests ----------

    @Test
    public void testUseDefaultPrettyPrinterWithNoExisting() {
        JsonGenerator result = generator.useDefaultPrettyPrinter();
        assertNotNull(result);
        assertNotNull(generator.getPrettyPrinter());
        assertTrue(generator.getPrettyPrinter() instanceof DefaultPrettyPrinter);
    }

    @Test
    public void testUseDefaultPrettyPrinterWithExisting() {
        DefaultPrettyPrinter prettyPrinter = new DefaultPrettyPrinter();
        generator.setPrettyPrinter(prettyPrinter);
        JsonGenerator result = generator.useDefaultPrettyPrinter();
        assertSame(prettyPrinter, result);
    }

    // ---------- Codec tests ----------

    @Test
    public void testSetCodec() {
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public void writeValue(JsonGenerator gen, Object value) throws IOException {}
            @Override
            public <T extends TreeNode> T readValue(JsonGenerator gen, Class<T> type) throws IOException { return null; }
            @Override
            public TreeNode readTree(JsonParser p) throws IOException { return null; }
        };
        generator.setCodec(codec);
        assertSame(codec, generator.getCodec());
    }

    // ---------- writeObject tests ----------

    @Test
    public void testWriteObjectNullWithCodec() throws IOException {
        TestGenerator gen = new TestGenerator(0, new ObjectCodec() {
            @Override
            public void writeValue(JsonGenerator gen, Object value) throws IOException {}
            @Override
            public <T extends TreeNode> T readValue(JsonGenerator gen, Class<T> type) throws IOException { return null; }
            @Override
            public TreeNode readTree(JsonParser p) throws IOException { return null; }
        });
        gen.writeObject(null);
        // should call writeNull, but we can't easily verify without mocking; just ensure no exception
    }

    @Test
    public void testWriteObjectNullWithoutCodec() throws IOException {
        generator.writeObject(null);
        // should call writeNull(); can't verify easily, but no exception expected
    }

    @Test
    public void testWriteObjectNonNullWithCodec() throws IOException {
        TestGenerator gen = new TestGenerator(0, new ObjectCodec() {
            @Override
            public void writeValue(JsonGenerator gen, Object value) throws IOException {
                gen.writeString("test");
            }
            @Override
            public <T extends TreeNode> T readValue(JsonGenerator gen, Class<T> type) throws IOException { return null; }
            @Override
            public TreeNode readTree(JsonParser p) throws IOException { return null; }
        });
        gen.writeObject("test");
        // no exception expected; codec handles serialization
    }

    // ---------- writeTree tests ----------

    @Test(expected = IOException.class)
    public void testWriteTreeNullWithoutCodec() throws IOException {
        generator.writeTree(null);
    }

    @Test
    public void testWriteTreeNonNullWithCodec() throws IOException {
        TestGenerator gen = new TestGenerator(0, new ObjectCodec() {
            @Override
            public void writeValue(JsonGenerator gen, Object value) throws IOException {
                gen.writeString("tree");
            }
            @Override
            public <T extends TreeNode> T readValue(JsonGenerator gen, Class<T> type) throws IOException { return null; }
            @Override
            public TreeNode readTree(JsonParser p) throws IOException { return null; }
        });
        gen.writeTree(new TreeNode() {
            @Override
            public JsonToken asToken() { return null; }
            @Override
            public JsonParser traverse() { return null; }
            @Override
            public JsonParser traverse(ObjectCodec codec) { return null; }
            @Override
            public JsonParser.NumberType numberType() { return null; }
            @Override
            public int size() { return 0; }
            @Override
            public boolean isValueNode() { return false; }
            @Override
            public boolean isContainerNode() { return false; }
            @Override
            public boolean isMissingNode() { return false; }
            @Override
            public boolean isArray() { return false; }
            @Override
            public boolean isObject() { return false; }
            @Override
            public TreeNode get(String fieldName) { return null; }
            @Override
            public TreeNode get(int index) { return null; }
            @Override
            public TreeNode path(String fieldName) { return null; }
            @Override
            public TreeNode path(int index) { return null; }
            @Override
            public java.util.Iterator<String> fieldNames() { return null; }
            @Override
            public TreeNode get(String fieldName, boolean ignoreCase) { return null; }
            @Override
            public TreeNode get(int index, boolean ignoreCase) { return null; }
            @Override
            public TreeNode path(String fieldName, boolean ignoreCase) { return null; }
            @Override
            public TreeNode path(int index, boolean ignoreCase) { return null; }
            @Override
            public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {}
            @Override
            public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {}
            @Override
            public void writeTo(JsonGenerator gen) throws IOException {}
            @Override
            public void writeTo(JsonGenerator gen, SerializerProvider ser) throws IOException {}
        });
    }

    // ---------- writeRawValue tests ----------

    @Test
    public void testWriteRawValueString() throws IOException {
        generator.writeRawValue("test");
        assertEquals("test", generator.rawText);
        assertEquals(1, generator.verifyValueWriteCount);
    }

    @Test
    public void testWriteRawValueStringWithOffsetLen() throws IOException {
        generator.writeRawValue("hello", 1, 3);
        assertEquals("hello", generator.rawText);
        assertEquals(1, generator.rawOffset);
        assertEquals(3, generator.rawLength);
        assertEquals(1, generator.verifyValueWriteCount);
    }

    @Test
    public void testWriteRawValueCharArray() throws IOException {
        char[] chars = {'a', 'b', 'c'};
        generator.writeRawValue(chars, 0, 2);
        assertArrayEquals(chars, generator.rawChars);
        assertEquals(0, generator.rawOffset);
        assertEquals(2, generator.rawLength);
        assertEquals(1, generator.verifyValueWriteCount);
    }

    @Test
    public void testWriteRawValueSerializableString() throws IOException {
        SerializableString str = new SerializableString() {
            @Override
            public String getValue() { return "raw"; }
            @Override
            public int charLength() { return 3; }
            @Override
            public char[] asQuotedChars() { return new char[]{'r','a','w'}; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[]{'r','a','w'}; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[]{'r','a','w'}; }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            @Override
            public int writeQuotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeUnquotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeQuoted(Writer w) throws IOException { return 0; }
            @Override
            public int writeUnquoted(Writer w) throws IOException { return 0; }
        };
        generator.writeRawValue(str);
        assertEquals("raw", generator.rawText);
        assertEquals(1, generator.verifyValueWriteCount);
    }

    @Test
    public void testWriteBinary() throws IOException {
        int result = generator.writeBinary(Base64Variant.getDefaultVariant(), new ByteArrayInputStream(new byte[]{1,2}), 2);
        assertEquals(0, result);
    }

    // ---------- close/closed tests ----------

    @Test
    public void testCloseSetsClosedFlag() throws IOException {
        assertFalse(generator.isClosed());
        generator.close();
        assertTrue(generator.isClosed());
    }

    @Test
    public void testIsClosedDefaultFalse() {
        assertFalse(generator.isClosed());
    }

    // ---------- _asString tests ----------

    @Test
    public void testAsString() throws IOException {
        BigDecimal value = new BigDecimal("123.45");
        assertEquals("123.45", generator._asString(value));
    }

    @Test
    public void testAsStringScale() throws IOException {
        BigDecimal value = new BigDecimal("1E+2");
        assertEquals("100", generator._asString(value));
    }

    // ---------- _decodeSurrogate tests ----------

    @Test
    public void testDecodeSurrogateValidPair() throws IOException {
        int result = generator._decodeSurrogate(0xD800, 0xDC00);
        assertEquals(0x10000, result);
    }

    @Test(expected = JsonParseException.class)
    public void testDecodeSurrogateInvalidSecond() throws IOException {
        generator._decodeSurrogate(0xD800, 0x0001);
    }

    @Test
    public void testDecodeSurrogateMaxValid() throws IOException {
        int result = generator._decodeSurrogate(0xDBFF, 0xDFFF);
        assertEquals(0x10FFFF, result);
    }

    @Test(expected = JsonParseException.class)
    public void testDecodeSurrogateInvalidSecondLow() throws IOException {
        generator._decodeSurrogate(0xD800, 0xDBFF);
    }

    // ---------- writeFieldName(SerializableString) tests ----------

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        // Can't easily test without overriding writeFieldName(String), but at least ensure no exception
        // when using an anonymous SerializableString
        SerializableString str = new SerializableString() {
            @Override
            public String getValue() { return "field"; }
            @Override
            public int charLength() { return 5; }
            @Override
            public char[] asQuotedChars() { return new char[]{'f','i','e','l','d'}; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[]{'f','i','e','l','d'}; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[]{'f','i','e','l','d'}; }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            @Override
            public int writeQuotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeUnquotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeQuoted(Writer w) throws IOException { return 0; }
            @Override
            public int writeUnquoted(Writer w) throws IOException { return 0; }
        };
        // We want to ensure writeFieldName calls writeFieldName(String) which is abstract; but base class calls it,
        // and our test subclass doesn't override it, so it will be abstract and cannot be instantiated.
        // So we use a subclass that overrides writeFieldName(String) to capture.
        TestGenerator gen = new TestGenerator(0, null) {
            @Override
            public void writeFieldName(String name) throws IOException {
                capturedFieldName = name;
            }
        };
        gen.writeFieldName(str);
        assertEquals("field", gen.capturedFieldName);
    }

    private String capturedFieldName;

    // ---------- writeString(SerializableString) tests ----------

    @Test
    public void testWriteStringSerializableString() throws IOException {
        TestGenerator gen = new TestGenerator(0, null) {
            @Override
            public void writeString(String text) throws IOException {
                capturedString = text;
            }
        };
        SerializableString str = new SerializableString() {
            @Override
            public String getValue() { return "hello"; }
            @Override
            public int charLength() { return 5; }
            @Override
            public char[] asQuotedChars() { return new char[]{'h','e','l','l','o'}; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[]{'h','e','l','l','o'}; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[]{'h','e','l','l','o'}; }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            @Override
            public int writeQuotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeUnquotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeQuoted(Writer w) throws IOException { return 0; }
            @Override
            public int writeUnquoted(Writer w) throws IOException { return 0; }
        };
        gen.writeString(str);
        assertEquals("hello", capturedString);
    }

    private String capturedString;

    // ---------- getCurrentValue/setCurrentValue tests ----------

    @Test
    public void testGetSetCurrentValue() {
        Object value = new Object();
        generator.setCurrentValue(value);
        assertSame(value, generator.getCurrentValue());
    }

    @Test
    public void testGetCurrentValueInitial() {
        assertNull(generator.getCurrentValue());
    }

    @Test
    public void testGetOutputContextInitial() {
        assertNotNull(generator.getOutputContext());
    }

    @Test
    public void testVersionNotNull() {
        assertNotNull(generator.version());
    }

    @Test
    public void testWriteObjectWithObjectCodec() throws IOException {
        final Object[] written = new Object[1];
        TestGenerator gen = new TestGenerator(0, new ObjectCodec() {
            @Override
            public void writeValue(JsonGenerator gen, Object value) throws IOException {
                written[0] = value;
            }
            @Override
            public <T extends TreeNode> T readValue(JsonGenerator gen, Class<T> type) throws IOException { return null; }
            @Override
            public TreeNode readTree(JsonParser p) throws IOException { return null; }
        });
        gen.writeObject("test");
        assertEquals("test", written[0]);
    }
}