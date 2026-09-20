package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/**
 * Complete Unit Test Suite for {@link JsonGeneratorImpl}.
 * Compatible with Java 1.4 / Java 7 and JUnit 4 without external mocking libraries.
 */
public class JsonGeneratorImplTest {

    // =========================================================================
    // Test Double / Mock Implementation
    // =========================================================================

    private static class ConcreteJsonGeneratorImpl extends JsonGeneratorImpl {
        private String recordedFieldName;
        private String recordedStringValue;
        private int writeFieldNameCallCount;
        private int writeStringCallCount;

        public ConcreteJsonGeneratorImpl(IOContext ctxt, int features, ObjectCodec codec) {
            super(ctxt, features, codec);
        }

        public void invokeCheckStdFeatureChanges(int newFeatureFlags, int changedFeatures) {
            _checkStdFeatureChanges(newFeatureFlags, changedFeatures);
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            this.recordedFieldName = name;
            this.writeFieldNameCallCount++;
        }

        @Override
        public void writeString(String text) throws IOException {
            this.recordedStringValue = text;
            this.writeStringCallCount++;
        }

        @Override
        public void writeStartArray() throws IOException {}

        @Override
        public void writeEndArray() throws IOException {}

        @Override
        public void writeStartObject() throws IOException {}

        @Override
        public void writeEndObject() throws IOException {}

        @Override
        public void writeString(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}

        @Override
        public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}

        @Override
        public void writeRaw(String text) throws IOException {}

        @Override
        public void writeRaw(String text, int offset, int len) throws IOException {}

        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeRaw(char c) throws IOException {}

        @Override
        public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {}

        @Override
        public void writeNumber(int v) throws IOException {}

        @Override
        public void writeNumber(long v) throws IOException {}

        @Override
        public void writeNumber(BigInteger v) throws IOException {}

        @Override
        public void writeNumber(double v) throws IOException {}

        @Override
        public void writeNumber(float v) throws IOException {}

        @Override
        public void writeNumber(BigDecimal v) throws IOException {}

        @Override
        public void writeNumber(String encodedValue) throws IOException {}

        @Override
        public void writeBoolean(boolean state) throws IOException {}

        @Override
        public void writeNull() throws IOException {}

        @Override
        public void flush() throws IOException {}

        @Override
        protected void _releaseBuffers() {}

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {}
    }

    private static class DummyCharacterEscapes extends CharacterEscapes {
        private static final long serialVersionUID = 1L;
        private final int[] customEscapes;

        public DummyCharacterEscapes(int[] escapes) {
            this.customEscapes = escapes;
        }

        @Override
        public int[] getEscapeCodesForAscii() {
            return this.customEscapes;
        }

        @Override
        public SerializableString getEscapeSequence(int ch) {
            return null;
        }
    }

    // =========================================================================
    // Phase 1 & 2: Constructor Tests
    // =========================================================================

    @Test
    public void constructor_givenEscapeNonAsciiEnabled_shouldSetMaxNonEscapedCharTo127() {
        // Arrange
        int features = Feature.ESCAPE_NON_ASCII.getMask();

        // Act
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, features, null);

        // Assert
        Assert.assertEquals(127, gen.getHighestEscapedChar());
        Assert.assertEquals(127, gen._maximumNonEscapedChar);
    }

    @Test
    public void constructor_givenEscapeNonAsciiDisabled_shouldSetMaxNonEscapedCharToZero() {
        // Arrange
        int features = 0;

        // Act
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, features, null);

        // Assert
        Assert.assertEquals(0, gen.getHighestEscapedChar());
        Assert.assertEquals(0, gen._maximumNonEscapedChar);
    }

    @Test
    public void constructor_givenQuoteFieldNamesEnabled_shouldSetCfgUnqNamesToFalse() {
        // Arrange
        int features = Feature.QUOTE_FIELD_NAMES.getMask();

        // Act
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, features, null);

        // Assert
        Assert.assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void constructor_givenQuoteFieldNamesDisabled_shouldSetCfgUnqNamesToTrue() {
        // Arrange
        int features = 0;

        // Act
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, features, null);

        // Assert
        Assert.assertTrue(gen._cfgUnqNames);
    }

    @Test
    public void constructor_givenBothFeaturesEnabled_shouldInitializeProperly() {
        // Arrange
        int features = Feature.ESCAPE_NON_ASCII.getMask() | Feature.QUOTE_FIELD_NAMES.getMask();

        // Act
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, features, null);

        // Assert
        Assert.assertEquals(127, gen.getHighestEscapedChar());
        Assert.assertFalse(gen._cfgUnqNames);
        Assert.assertSame(JsonGeneratorImpl.sOutputEscapes, gen._outputEscapes);
        Assert.assertEquals(DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, gen._rootValueSeparator);
        Assert.assertNull(gen.getCharacterEscapes());
    }

    @Test
    public void constructor_givenNonNullContextAndCodec_shouldRetainReferences() {
        // Arrange
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test-source", false);
        int features = 0;

        // Act
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(ctxt, features, null);

        // Assert
        Assert.assertSame(ctxt, gen._ioContext);
        Assert.assertNull(gen.getCodec());
    }

    // =========================================================================
    // Feature Configuration Tests: enable & _checkStdFeatureChanges
    // =========================================================================

    @Test
    public void enable_givenQuoteFieldNames_shouldUpdateCfgUnqNamesToFalseAndReturnSelf() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        Assert.assertTrue(gen._cfgUnqNames);

        // Act
        JsonGenerator returnedGen = gen.enable(Feature.QUOTE_FIELD_NAMES);

        // Assert
        Assert.assertSame(gen, returnedGen);
        Assert.assertFalse(gen._cfgUnqNames);
        Assert.assertTrue(gen.isEnabled(Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void enable_givenOtherFeature_shouldKeepCfgUnqNamesUnchanged() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        Assert.assertTrue(gen._cfgUnqNames);

        // Act
        JsonGenerator returnedGen = gen.enable(Feature.WRITE_NUMBERS_AS_STRINGS);

        // Assert
        Assert.assertSame(gen, returnedGen);
        Assert.assertTrue(gen._cfgUnqNames);
        Assert.assertTrue(gen.isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void checkStdFeatureChanges_givenQuoteFieldNamesNowEnabled_shouldSetCfgUnqNamesFalse() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        Assert.assertTrue(gen._cfgUnqNames);

        // Act
        int newFeatures = Feature.QUOTE_FIELD_NAMES.getMask();
        int changedFeatures = Feature.QUOTE_FIELD_NAMES.getMask();
        gen.invokeCheckStdFeatureChanges(newFeatures, changedFeatures);

        // Assert
        Assert.assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void checkStdFeatureChanges_givenQuoteFieldNamesNowDisabled_shouldSetCfgUnqNamesTrue() {
        // Arrange
        int initialFeatures = Feature.QUOTE_FIELD_NAMES.getMask();
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, initialFeatures, null);
        Assert.assertFalse(gen._cfgUnqNames);

        // Act
        int newFeatures = 0;
        int changedFeatures = Feature.QUOTE_FIELD_NAMES.getMask();
        gen.invokeCheckStdFeatureChanges(newFeatures, changedFeatures);

        // Assert
        Assert.assertTrue(gen._cfgUnqNames);
    }

    // =========================================================================
    // Highest Non-Escaped Char Configuration Tests
    // =========================================================================

    @Test
    public void setHighestNonEscapedChar_givenNegativeValues_shouldResetToZero() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);

        // Act & Assert for -1
        JsonGenerator res1 = gen.setHighestNonEscapedChar(-1);
        Assert.assertSame(gen, res1);
        Assert.assertEquals(0, gen.getHighestEscapedChar());

        // Act & Assert for Integer.MIN_VALUE
        gen.setHighestNonEscapedChar(Integer.MIN_VALUE);
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void setHighestNonEscapedChar_givenZero_shouldSetToZero() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, Feature.ESCAPE_NON_ASCII.getMask(), null);
        Assert.assertEquals(127, gen.getHighestEscapedChar());

        // Act
        gen.setHighestNonEscapedChar(0);

        // Assert
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void setHighestNonEscapedChar_givenPositiveBoundaryValues_shouldSetExactValue() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);

        // Act & Assert: boundary ASCII 127
        gen.setHighestNonEscapedChar(127);
        Assert.assertEquals(127, gen.getHighestEscapedChar());

        // Act & Assert: Unicode BMP upper bound 65535 (0xFFFF)
        gen.setHighestNonEscapedChar(65535);
        Assert.assertEquals(65535, gen.getHighestEscapedChar());

        // Act & Assert: boundary arbitrary code point
        gen.setHighestNonEscapedChar(1114111);
        Assert.assertEquals(1114111, gen.getHighestEscapedChar());
    }

    // =========================================================================
    // CharacterEscapes Configuration Tests
    // =========================================================================

    @Test
    public void setCharacterEscapes_givenCustomEscapes_shouldUpdateEscapesAndOutputArray() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        int[] customAsciiEscapes = new int[128];
        customAsciiEscapes['"'] = CharacterEscapes.ESCAPE_STANDARD;
        customAsciiEscapes['\\'] = CharacterEscapes.ESCAPE_STANDARD;
        customAsciiEscapes['\n'] = CharacterEscapes.ESCAPE_STANDARD;
        CharacterEscapes customEscapes = new DummyCharacterEscapes(customAsciiEscapes);

        // Act
        JsonGenerator returnedGen = gen.setCharacterEscapes(customEscapes);

        // Assert
        Assert.assertSame(gen, returnedGen);
        Assert.assertSame(customEscapes, gen.getCharacterEscapes());
        Assert.assertSame(customAsciiEscapes, gen._outputEscapes);
    }

    @Test
    public void setCharacterEscapes_givenNull_shouldRevertToStandardEscapes() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        int[] customAsciiEscapes = new int[128];
        CharacterEscapes customEscapes = new DummyCharacterEscapes(customAsciiEscapes);
        gen.setCharacterEscapes(customEscapes);
        Assert.assertSame(customEscapes, gen.getCharacterEscapes());

        // Act
        JsonGenerator returnedGen = gen.setCharacterEscapes(null);

        // Assert
        Assert.assertSame(gen, returnedGen);
        Assert.assertNull(gen.getCharacterEscapes());
        Assert.assertSame(JsonGeneratorImpl.sOutputEscapes, gen._outputEscapes);
    }

    // =========================================================================
    // Root Value Separator Tests
    // =========================================================================

    @Test
    public void setRootValueSeparator_givenCustomSeparator_shouldUpdateSeparatorAndReturnSelf() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        SerializableString separator = new SerializedString("/");

        // Act
        JsonGenerator returnedGen = gen.setRootValueSeparator(separator);

        // Assert
        Assert.assertSame(gen, returnedGen);
        Assert.assertSame(separator, gen._rootValueSeparator);
    }

    @Test
    public void setRootValueSeparator_givenNullSeparator_shouldStoreNull() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);

        // Act
        JsonGenerator returnedGen = gen.setRootValueSeparator(null);

        // Assert
        Assert.assertSame(gen, returnedGen);
        Assert.assertNull(gen._rootValueSeparator);
    }

    // =========================================================================
    // Version Test
    // =========================================================================

    @Test
    public void version_shouldReturnNonNullVersion() {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);

        // Act
        Version version = gen.version();

        // Assert
        Assert.assertNotNull(version);
        Assert.assertFalse(version.isUknownVersion());
    }

    // =========================================================================
    // Partial API: writeStringField Tests
    // =========================================================================

    @Test
    public void writeStringField_givenStandardFieldNameAndValue_shouldDelegateProperly() throws IOException {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        String fieldName = "username";
        String value = "john_doe";

        // Act
        gen.writeStringField(fieldName, value);

        // Assert
        Assert.assertEquals(1, gen.writeFieldNameCallCount);
        Assert.assertEquals("username", gen.recordedFieldName);
        Assert.assertEquals(1, gen.writeStringCallCount);
        Assert.assertEquals("john_doe", gen.recordedStringValue);
    }

    @Test
    public void writeStringField_givenEmptyStrings_shouldDelegateProperly() throws IOException {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);
        String fieldName = "";
        String value = "";

        // Act
        gen.writeStringField(fieldName, value);

        // Assert
        Assert.assertEquals(1, gen.writeFieldNameCallCount);
        Assert.assertEquals("", gen.recordedFieldName);
        Assert.assertEquals(1, gen.writeStringCallCount);
        Assert.assertEquals("", gen.recordedStringValue);
    }

    @Test
    public void writeStringField_givenNullStrings_shouldDelegateProperly() throws IOException {
        // Arrange
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(null, 0, null);

        // Act
        gen.writeStringField(null, null);

        // Assert
        Assert.assertEquals(1, gen.writeFieldNameCallCount);
        Assert.assertNull(gen.recordedFieldName);
        Assert.assertEquals(1, gen.writeStringCallCount);
        Assert.assertNull(gen.recordedStringValue);
    }
}