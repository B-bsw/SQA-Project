package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void constructor_givenInstantiation_shouldNotBeNull() {
        NumberUtils nu = new NumberUtils();
        Assert.assertNotNull(nu);
    }

    @Test
    public void constants_givenConstants_shouldMatchExpectedValues() {
        Assert.assertEquals(Long.valueOf(0L), NumberUtils.LONG_ZERO);
        Assert.assertEquals(Long.valueOf(1L), NumberUtils.LONG_ONE);
        Assert.assertEquals(Long.valueOf(-1L), NumberUtils.LONG_MINUS_ONE);

        Assert.assertEquals(Integer.valueOf(0), NumberUtils.INTEGER_ZERO);
        Assert.assertEquals(Integer.valueOf(1), NumberUtils.INTEGER_ONE);
        Assert.assertEquals(Integer.valueOf(-1), NumberUtils.INTEGER_MINUS_ONE);

        Assert.assertEquals(Short.valueOf((short) 0), NumberUtils.SHORT_ZERO);
        Assert.assertEquals(Short.valueOf((short) 1), NumberUtils.SHORT_ONE);
        Assert.assertEquals(Short.valueOf((short) -1), NumberUtils.SHORT_MINUS_ONE);

        Assert.assertEquals(Byte.valueOf((byte) 0), NumberUtils.BYTE_ZERO);
        Assert.assertEquals(Byte.valueOf((byte) 1), NumberUtils.BYTE_ONE);
        Assert.assertEquals(Byte.valueOf((byte) -1), NumberUtils.BYTE_MINUS_ONE);

        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.DOUBLE_ZERO);
        Assert.assertEquals(Double.valueOf(1.0d), NumberUtils.DOUBLE_ONE);
        Assert.assertEquals(Double.valueOf(-1.0d), NumberUtils.DOUBLE_MINUS_ONE);

        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.FLOAT_ZERO);
        Assert.assertEquals(Float.valueOf(1.0f), NumberUtils.FLOAT_ONE);
        Assert.assertEquals(Float.valueOf(-1.0f), NumberUtils.FLOAT_MINUS_ONE);
    }

    @Test
    public void toInt_givenValidString_shouldReturnParsedInteger() {
        Assert.assertEquals(123, NumberUtils.toInt("123"));
        Assert.assertEquals(-45, NumberUtils.toInt("-45"));
        Assert.assertEquals(0, NumberUtils.toInt("0"));
    }

    @Test
    public void toInt_givenNullOrInvalidString_shouldReturnZero() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
        Assert.assertEquals(0, NumberUtils.toInt("abc"));
        Assert.assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void toInt_givenNullOrInvalidStringWithDefault_shouldReturnDefaultValue() {
        Assert.assertEquals(10, NumberUtils.toInt(null, 10));
        Assert.assertEquals(20, NumberUtils.toInt("invalid", 20));
        Assert.assertEquals(30, NumberUtils.toInt("30", 50));
    }

    @Test
    public void toLong_givenValidString_shouldReturnParsedLong() {
        Assert.assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        Assert.assertEquals(-9876543210L, NumberUtils.toLong("-9876543210"));
        Assert.assertEquals(0L, NumberUtils.toLong("0"));
    }

    @Test
    public void toLong_givenNullOrInvalidString_shouldReturnZero() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(0L, NumberUtils.toLong("xyz"));
        Assert.assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void toLong_givenNullOrInvalidStringWithDefault_shouldReturnDefaultValue() {
        Assert.assertEquals(99L, NumberUtils.toLong(null, 99L));
        Assert.assertEquals(88L, NumberUtils.toLong("invalid", 88L));
        Assert.assertEquals(77L, NumberUtils.toLong("77", 66L));
    }

    @Test
    public void toFloat_givenValidString_shouldReturnParsedFloat() {
        Assert.assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0001f);
        Assert.assertEquals(-4.56f, NumberUtils.toFloat("-4.56"), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("0"), 0.0001f);
    }

    @Test
    public void toFloat_givenNullOrInvalidString_shouldReturnZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("not-a-float"), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
    }

    @Test
    public void toFloat_givenNullOrInvalidStringWithDefault_shouldReturnDefaultValue() {
        Assert.assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        Assert.assertEquals(6.6f, NumberUtils.toFloat("bad", 6.6f), 0.0001f);
        Assert.assertEquals(7.7f, NumberUtils.toFloat("7.7", 1.1f), 0.0001f);
    }

    @Test
    public void toDouble_givenValidString_shouldReturnParsedDouble() {
        Assert.assertEquals(1.23456d, NumberUtils.toDouble("1.23456"), 0.000001d);
        Assert.assertEquals(-9.87654d, NumberUtils.toDouble("-9.87654"), 0.000001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("0"), 0.000001d);
    }

    @Test
    public void toDouble_givenNullOrInvalidString_shouldReturnZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.000001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("definitely-not-double"), 0.000001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble(""), 0.000001d);
    }

    @Test
    public void toDouble_givenNullOrInvalidStringWithDefault_shouldReturnDefaultValue() {
        Assert.assertEquals(12.34d, NumberUtils.toDouble(null, 12.34d), 0.000001d);
        Assert.assertEquals(56.78d, NumberUtils.toDouble("bad", 56.78d), 0.000001d);
        Assert.assertEquals(90.12d, NumberUtils.toDouble("90.12", 0.0d), 0.000001d);
    }

    @Test
    public void toByte_givenValidString_shouldReturnParsedByte() {
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12"));
        Assert.assertEquals((byte) -34, NumberUtils.toByte("-34"));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("0"));
    }

    @Test
    public void toByte_givenNullOrInvalidString_shouldReturnZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("xyz"));
        Assert.assertEquals((byte) 0, NumberUtils.toByte(""));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("999"));
    }

    @Test
    public void toByte_givenNullOrInvalidStringWithDefault_shouldReturnDefaultValue() {
        Assert.assertEquals((byte) 7, NumberUtils.toByte(null, (byte) 7));
        Assert.assertEquals((byte) 8, NumberUtils.toByte("invalid", (byte) 8));
        Assert.assertEquals((byte) 9, NumberUtils.toByte("9", (byte) 1));
    }

    @Test
    public void toShort_givenValidString_shouldReturnParsedShort() {
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) -5678, NumberUtils.toShort("-5678"));
        Assert.assertEquals((short) 0, NumberUtils.toShort("0"));
    }

    @Test
    public void toShort_givenNullOrInvalidString_shouldReturnZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
        Assert.assertEquals((short) 0, NumberUtils.toShort("bad"));
        Assert.assertEquals((short) 0, NumberUtils.toShort(""));
        Assert.assertEquals((short) 0, NumberUtils.toShort("99999999"));
    }

    @Test
    public void toShort_givenNullOrInvalidStringWithDefault_shouldReturnDefaultValue() {
        Assert.assertEquals((short) 15, NumberUtils.toShort(null, (short) 15));
        Assert.assertEquals((short) 25, NumberUtils.toShort("bad", (short) 25));
        Assert.assertEquals((short) 35, NumberUtils.toShort("35", (short) 45));
    }

    @Test
    public void createNumber_givenNull_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenBlank_shouldThrowException() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenWhitespace_shouldThrowException() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void createNumber_givenDoubleDash_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber("--123"));
    }

    @Test
    public void createNumber_givenHexadecimal_shouldReturnInteger() {
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        Assert.assertEquals(Integer.valueOf(16), NumberUtils.createNumber("0x10"));
        Assert.assertEquals(Integer.valueOf(-16), NumberUtils.createNumber("-0x10"));
    }

    @Test
    public void createNumber_givenIntegerWithinRange_shouldReturnInteger() {
        Assert.assertEquals(Integer.valueOf(12345), NumberUtils.createNumber("12345"));
        Assert.assertEquals(Integer.valueOf(-12345), NumberUtils.createNumber("-12345"));
    }

    @Test
    public void createNumber_givenLongWithinRange_shouldReturnLong() {
        Assert.assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        Assert.assertEquals(Long.valueOf(-2147483649L), NumberUtils.createNumber("-2147483649"));
    }

    @Test
    public void createNumber_givenBigInteger_shouldReturnBigInteger() {
        String large = "123456789012345678901234567890";
        Assert.assertEquals(new BigInteger(large), NumberUtils.createNumber(large));
    }

    @Test
    public void createNumber_givenFloatTypeSuffix_shouldReturnFloat() {
        Assert.assertEquals(Float.valueOf(12.34f), NumberUtils.createNumber("12.34f"));
        Assert.assertEquals(Float.valueOf(12.34F), NumberUtils.createNumber("12.34F"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Float.valueOf(0f), NumberUtils.createNumber("0f"));
    }

    @Test
    public void createNumber_givenDoubleTypeSuffix_shouldReturnDouble() {
        Assert.assertEquals(Double.valueOf(12.34d), NumberUtils.createNumber("12.34d"));
        Assert.assertEquals(Double.valueOf(12.34D), NumberUtils.createNumber("12.34D"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        Assert.assertEquals(Double.valueOf(0d), NumberUtils.createNumber("0d"));
    }

    @Test
    public void createNumber_givenDoubleTypeSuffixOverflow_shouldReturnBigDecimal() {
        String hugeDouble = "1.7976931348623157e+309d";
        Number num = NumberUtils.createNumber(hugeDouble);
        Assert.assertTrue(num instanceof BigDecimal);
    }

    @Test
    public void createNumber_givenLongTypeSuffix_shouldReturnLongOrBigInteger() {
        Assert.assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345l"));
        Assert.assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345L"));
        Assert.assertEquals(Long.valueOf(-12345L), NumberUtils.createNumber("-12345L"));

        String bigLong = "9223372036854775808L";
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber(bigLong));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLongSuffixFormat_shouldThrowException() {
        NumberUtils.createNumber("12.34L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLastCharacter_shouldThrowException() {
        NumberUtils.createNumber("12345Q");
    }

    @Test
    public void createNumber_givenDecimalWithoutSuffix_shouldReturnFloatOrDoubleOrBigDecimal() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        Assert.assertEquals(Double.valueOf(1.7976931348623157e+307), NumberUtils.createNumber("1.7976931348623157e+307"));
        Assert.assertEquals(new BigDecimal("1.7976931348623157e+309"), NumberUtils.createNumber("1.7976931348623157e+309"));
    }

    @Test
    public void createNumber_givenScientificNotationWithExponent_shouldParseCorrectly() {
        Assert.assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3"));
        Assert.assertEquals(Float.valueOf(1.2E3f), NumberUtils.createNumber("1.2E3"));
        Assert.assertEquals(Float.valueOf(1e3f), NumberUtils.createNumber("1e3"));
        Assert.assertEquals(Float.valueOf(1e3f), NumberUtils.createNumber("1e3f"));
        Assert.assertEquals(Double.valueOf(1e3d), NumberUtils.createNumber("1e3d"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidDecAndExpOrder_shouldThrowException() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void createNumber_givenAllZerosDecimal_shouldReturnZeroFloat() {
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.00"));
    }

    @Test
    public void createFloat_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(12.34f), NumberUtils.createFloat("12.34"));
    }

    @Test
    public void createDouble_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(12.3456d), NumberUtils.createDouble("12.3456"));
    }

    @Test
    public void createInteger_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createInteger(null));
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        Assert.assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
    }

    @Test
    public void createLong_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createLong(null));
        Assert.assertEquals(Long.valueOf(1234567890L), NumberUtils.createLong("1234567890"));
    }

    @Test
    public void createBigInteger_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("99999999999999999999"), NumberUtils.createBigInteger("99999999999999999999"));
    }

    @Test
    public void createBigDecimal_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("123.456789"), NumberUtils.createBigDecimal("123.456789"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenBlank_shouldThrowException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void minLongArray_givenNullArray_shouldThrowException() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minLongArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void minLongArray_givenValidArray_shouldReturnMin() {
        Assert.assertEquals(1L, NumberUtils.min(new long[] {5L, 3L, 1L, 4L, 2L}));
        Assert.assertEquals(-10L, NumberUtils.min(new long[] {0L, -10L, 5L}));
        Assert.assertEquals(7L, NumberUtils.min(new long[] {7L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minIntArray_givenNullArray_shouldThrowException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minIntArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void minIntArray_givenValidArray_shouldReturnMin() {
        Assert.assertEquals(1, NumberUtils.min(new int[] {5, 3, 1, 4, 2}));
        Assert.assertEquals(-10, NumberUtils.min(new int[] {0, -10, 5}));
        Assert.assertEquals(7, NumberUtils.min(new int[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minShortArray_givenNullArray_shouldThrowException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minShortArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void minShortArray_givenValidArray_shouldReturnMin() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[] {5, 3, 1, 4, 2}));
        Assert.assertEquals((short) -10, NumberUtils.min(new short[] {0, -10, 5}));
        Assert.assertEquals((short) 7, NumberUtils.min(new short[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minByteArray_givenNullArray_shouldThrowException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minByteArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void minByteArray_givenValidArray_shouldReturnMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[] {5, 3, 1, 4, 2}));
        Assert.assertEquals((byte) -10, NumberUtils.min(new byte[] {0, -10, 5}));
        Assert.assertEquals((byte) 7, NumberUtils.min(new byte[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minDoubleArray_givenNullArray_shouldThrowException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minDoubleArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void minDoubleArray_givenValidArray_shouldReturnMin() {
        Assert.assertEquals(1.1d, NumberUtils.min(new double[] {5.5d, 3.3d, 1.1d, 4.4d, 2.2d}), 0.0001d);
        Assert.assertEquals(-10.5d, NumberUtils.min(new double[] {0.0d, -10.5d, 5.2d}), 0.0001d);
        Assert.assertEquals(7.0d, NumberUtils.min(new double[] {7.0d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[] {1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minFloatArray_givenNullArray_shouldThrowException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minFloatArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void minFloatArray_givenValidArray_shouldReturnMin() {
        Assert.assertEquals(1.1f, NumberUtils.min(new float[] {5.5f, 3.3f, 1.1f, 4.4f, 2.2f}), 0.0001f);
        Assert.assertEquals(-10.5f, NumberUtils.min(new float[] {0.0f, -10.5f, 5.2f}), 0.0001f);
        Assert.assertEquals(7.0f, NumberUtils.min(new float[] {7.0f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxLongArray_givenNullArray_shouldThrowException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxLongArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void maxLongArray_givenValidArray_shouldReturnMax() {
        Assert.assertEquals(5L, NumberUtils.max(new long[] {5L, 3L, 1L, 4L, 2L}));
        Assert.assertEquals(5L, NumberUtils.max(new long[] {0L, -10L, 5L}));
        Assert.assertEquals(7L, NumberUtils.max(new long[] {7L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxIntArray_givenNullArray_shouldThrowException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxIntArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void maxIntArray_givenValidArray_shouldReturnMax() {
        Assert.assertEquals(5, NumberUtils.max(new int[] {5, 3, 1, 4, 2}));
        Assert.assertEquals(5, NumberUtils.max(new int[] {0, -10, 5}));
        Assert.assertEquals(7, NumberUtils.max(new int[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxShortArray_givenNullArray_shouldThrowException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxShortArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void maxShortArray_givenValidArray_shouldReturnMax() {
        Assert.assertEquals((short) 5, NumberUtils.max(new short[] {5, 3, 1, 4, 2}));
        Assert.assertEquals((short) 5, NumberUtils.max(new short[] {0, -10, 5}));
        Assert.assertEquals((short) 7, NumberUtils.max(new short[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxByteArray_givenNullArray_shouldThrowException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxByteArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void maxByteArray_givenValidArray_shouldReturnMax() {
        Assert.assertEquals((byte) 5, NumberUtils.max(new byte[] {5, 3, 1, 4, 2}));
        Assert.assertEquals((byte) 5, NumberUtils.max(new byte[] {0, -10, 5}));
        Assert.assertEquals((byte) 7, NumberUtils.max(new byte[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxDoubleArray_givenNullArray_shouldThrowException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxDoubleArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void maxDoubleArray_givenValidArray_shouldReturnMax() {
        Assert.assertEquals(5.5d, NumberUtils.max(new double[] {5.5d, 3.3d, 1.1d, 4.4d, 2.2d}), 0.0001d);
        Assert.assertEquals(5.2d, NumberUtils.max(new double[] {0.0d, -10.5d, 5.2d}), 0.0001d);
        Assert.assertEquals(7.0d, NumberUtils.max(new double[] {7.0d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[] {1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxFloatArray_givenNullArray_shouldThrowException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxFloatArray_givenEmptyArray_shouldThrowException() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void maxFloatArray_givenValidArray_shouldReturnMax() {
        Assert.assertEquals(5.5f, NumberUtils.max(new float[] {5.5f, 3.3f, 1.1f, 4.4f, 2.2f}), 0.0001f);
        Assert.assertEquals(5.2f, NumberUtils.max(new float[] {0.0f, -10.5f, 5.2f}), 0.0001f);
        Assert.assertEquals(7.0f, NumberUtils.max(new float[] {7.0f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test
    public void minThreeLongs_givenValues_shouldReturnSmallest() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void minThreeInts_givenValues_shouldReturnSmallest() {
        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
        Assert.assertEquals(1, NumberUtils.min(2, 1, 3));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void minThreeShorts_givenValues_shouldReturnSmallest() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void minThreeBytes_givenValues_shouldReturnSmallest() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        Assert.assertEquals((byte) 1,