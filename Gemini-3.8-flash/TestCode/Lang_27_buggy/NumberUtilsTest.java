package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    private static final float FLOAT_DELTA = 0.00001f;
    private static final double DOUBLE_DELTA = 0.00001d;

    @Test
    public void constructor_whenInstantiated_shouldNotNull() {
        NumberUtils utils = new NumberUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void constants_whenReferenced_shouldMatchExpectedValues() {
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
    public void toInt_givenValidString_shouldReturnParsedInt() {
        Assert.assertEquals(123, NumberUtils.toInt("123"));
        Assert.assertEquals(-123, NumberUtils.toInt("-123"));
        Assert.assertEquals(456, NumberUtils.toInt("456", 10));
    }

    @Test
    public void toInt_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
        Assert.assertEquals(5, NumberUtils.toInt(null, 5));
        Assert.assertEquals(0, NumberUtils.toInt("abc"));
        Assert.assertEquals(9, NumberUtils.toInt("invalid", 9));
        Assert.assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void toLong_givenValidString_shouldReturnParsedLong() {
        Assert.assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        Assert.assertEquals(-9876543210L, NumberUtils.toLong("-9876543210", 0L));
    }

    @Test
    public void toLong_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(42L, NumberUtils.toLong(null, 42L));
        Assert.assertEquals(0L, NumberUtils.toLong("abc"));
        Assert.assertEquals(7L, NumberUtils.toLong("notANumber", 7L));
    }

    @Test
    public void toFloat_givenValidString_shouldReturnParsedFloat() {
        Assert.assertEquals(12.34f, NumberUtils.toFloat("12.34"), FLOAT_DELTA);
        Assert.assertEquals(-5.67f, NumberUtils.toFloat("-5.67", 0.0f), FLOAT_DELTA);
    }

    @Test
    public void toFloat_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), FLOAT_DELTA);
        Assert.assertEquals(1.5f, NumberUtils.toFloat(null, 1.5f), FLOAT_DELTA);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("invalid"), FLOAT_DELTA);
        Assert.assertEquals(2.5f, NumberUtils.toFloat("invalid", 2.5f), FLOAT_DELTA);
    }

    @Test
    public void toDouble_givenValidString_shouldReturnParsedDouble() {
        Assert.assertEquals(123.456d, NumberUtils.toDouble("123.456"), DOUBLE_DELTA);
        Assert.assertEquals(-789.012d, NumberUtils.toDouble("-789.012", 0.0d), DOUBLE_DELTA);
    }

    @Test
    public void toDouble_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), DOUBLE_DELTA);
        Assert.assertEquals(3.14d, NumberUtils.toDouble(null, 3.14d), DOUBLE_DELTA);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("invalid"), DOUBLE_DELTA);
        Assert.assertEquals(9.99d, NumberUtils.toDouble("invalid", 9.99d), DOUBLE_DELTA);
    }

    @Test
    public void toByte_givenValidString_shouldReturnParsedByte() {
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12"));
        Assert.assertEquals((byte) -5, NumberUtils.toByte("-5", (byte) 0));
    }

    @Test
    public void toByte_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
        Assert.assertEquals((byte) 3, NumberUtils.toByte(null, (byte) 3));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        Assert.assertEquals((byte) 4, NumberUtils.toByte("invalid", (byte) 4));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("999", (byte) 5));
    }

    @Test
    public void toShort_givenValidString_shouldReturnParsedShort() {
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) -4321, NumberUtils.toShort("-4321", (short) 0));
    }

    @Test
    public void toShort_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
        Assert.assertEquals((short) 8, NumberUtils.toShort(null, (short) 8));
        Assert.assertEquals((short) 0, NumberUtils.toShort("invalid"));
        Assert.assertEquals((short) 9, NumberUtils.toShort("invalid", (short) 9));
        Assert.assertEquals((short) 2, NumberUtils.toShort("99999", (short) 2));
    }

    @Test
    public void createNumber_givenNullOrLeadingDashes_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
        Assert.assertNull(NumberUtils.createNumber("--123"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenBlankString_shouldThrowException() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenEmptyString_shouldThrowException() {
        NumberUtils.createNumber("");
    }

    @Test
    public void createNumber_givenHexStrings_shouldReturnDecodedInteger() {
        Assert.assertEquals(Integer.valueOf(26), NumberUtils.createNumber("0x1a"));
        Assert.assertEquals(Integer.valueOf(-26), NumberUtils.createNumber("-0x1a"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenExpBeforeDec_shouldThrowException() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void createNumber_givenLongSuffix_shouldReturnLongOrBigInteger() {
        Assert.assertEquals(Long.valueOf(123456L), NumberUtils.createNumber("123456L"));
        Assert.assertEquals(Long.valueOf(-123456L), NumberUtils.createNumber("-123456l"));
        BigInteger big = new BigInteger("123456789012345678901234567890");
        Assert.assertEquals(big, NumberUtils.createNumber("123456789012345678901234567890L"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLongSuffixFormat_shouldThrowException() {
        NumberUtils.createNumber("12.34L");
    }

    @Test
    public void createNumber_givenFloatSuffix_shouldReturnFloat() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("000f"));
    }

    @Test
    public void createNumber_givenDoubleSuffix_shouldReturnDoubleOrBigDecimal() {
        Assert.assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234d"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        Number num = NumberUtils.createNumber("1.7976931348623157e+309d");
        Assert.assertTrue(num instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenUnknownSuffix_shouldThrowException() {
        NumberUtils.createNumber("123z");
    }

    @Test
    public void createNumber_givenIntegerOrLongWithoutSuffix_shouldReturnExpectedNumber() {
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        Assert.assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        BigInteger big = new BigInteger("9223372036854775808");
        Assert.assertEquals(big, NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void createNumber_givenDecimalWithoutSuffix_shouldReturnFloatDoubleOrBigDecimal() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        Assert.assertEquals(Double.valueOf(1.23456789012345d), NumberUtils.createNumber("1.23456789012345"));
        Number bigDec = NumberUtils.createNumber("1.7976931348623157e+309");
        Assert.assertTrue(bigDec instanceof BigDecimal);
    }

    @Test
    public void createNumber_givenScientificNotationWithSuffix_shouldReturnExpectedNumber() {
        Assert.assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3f"));
        Assert.assertEquals(Double.valueOf(1.2e3d), NumberUtils.createNumber("1.2e3d"));
    }

    @Test
    public void createFloat_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(12.34f), NumberUtils.createFloat("12.34"));
    }

    @Test(expected = NumberFormatException.class)
    public void createFloat_givenInvalid_shouldThrowException() {
        NumberUtils.createFloat("invalid");
    }

    @Test
    public void createDouble_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(123.456d), NumberUtils.createDouble("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void createDouble_givenInvalid_shouldThrowException() {
        NumberUtils.createDouble("invalid");
    }

    @Test
    public void createInteger_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createInteger(null));
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        Assert.assertEquals(Integer.valueOf(15), NumberUtils.createInteger("0xf"));
        Assert.assertEquals(Integer.valueOf(8), NumberUtils.createInteger("010"));
    }

    @Test(expected = NumberFormatException.class)
    public void createInteger_givenInvalid_shouldThrowException() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void createLong_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createLong(null));
        Assert.assertEquals(Long.valueOf(123456789L), NumberUtils.createLong("123456789"));
    }

    @Test(expected = NumberFormatException.class)
    public void createLong_givenInvalid_shouldThrowException() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void createBigInteger_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("9876543210123456789"), NumberUtils.createBigInteger("9876543210123456789"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigInteger_givenInvalid_shouldThrowException() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void createBigDecimal_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("12345.6789"), NumberUtils.createBigDecimal("12345.6789"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenBlank_shouldThrowException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenInvalid_shouldThrowException() {
        NumberUtils.createBigDecimal("abc");
    }

    @Test
    public void min_givenLongArray_shouldReturnMinimum() {
        Assert.assertEquals(1L, NumberUtils.min(new long[] {5L, 3L, 1L, 4L, 2L}));
        Assert.assertEquals(-5L, NumberUtils.min(new long[] {-5L, -1L, 0L}));
        Assert.assertEquals(7L, NumberUtils.min(new long[] {7L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenNullLongArray_shouldThrowException() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenEmptyLongArray_shouldThrowException() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void min_givenIntArray_shouldReturnMinimum() {
        Assert.assertEquals(1, NumberUtils.min(new int[] {5, 3, 1, 4, 2}));
        Assert.assertEquals(-10, NumberUtils.min(new int[] {0, -10, 5}));
        Assert.assertEquals(4, NumberUtils.min(new int[] {4}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenNullIntArray_shouldThrowException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenEmptyIntArray_shouldThrowException() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void min_givenShortArray_shouldReturnMinimum() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[] {5, 3, 1, 4, 2}));
        Assert.assertEquals((short) -2, NumberUtils.min(new short[] {1, -2, 3}));
        Assert.assertEquals((short) 9, NumberUtils.min(new short[] {9}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenNullShortArray_shouldThrowException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenEmptyShortArray_shouldThrowException() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void min_givenByteArray_shouldReturnMinimum() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[] {5, 3, 1, 4, 2}));
        Assert.assertEquals((byte) -8, NumberUtils.min(new byte[] {0, 2, -8}));
        Assert.assertEquals((byte) 10, NumberUtils.min(new byte[] {10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenNullByteArray_shouldThrowException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenEmptyByteArray_shouldThrowException() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void min_givenDoubleArray_shouldReturnMinimumOrNaN() {
        Assert.assertEquals(1.2d, NumberUtils.min(new double[] {5.4d, 3.1d, 1.2d, 4.0d}), DOUBLE_DELTA);
        Assert.assertEquals(9.9d, NumberUtils.min(new double[] {9.9d}), DOUBLE_DELTA);
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[] {1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenNullDoubleArray_shouldThrowException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenEmptyDoubleArray_shouldThrowException() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void min_givenFloatArray_shouldReturnMinimumOrNaN() {
        Assert.assertEquals(1.2f, NumberUtils.min(new float[] {5.4f, 3.1f, 1.2f, 4.0f}), FLOAT_DELTA);
        Assert.assertEquals(8.8f, NumberUtils.min(new float[] {8.8f}), FLOAT_DELTA);
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenNullFloatArray_shouldThrowException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_givenEmptyFloatArray_shouldThrowException() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void max_givenLongArray_shouldReturnMaximum() {
        Assert.assertEquals(5L, NumberUtils.max(new long[] {1L, 3L, 5L, 4L, 2L}));
        Assert.assertEquals(-1L, NumberUtils.max(new long[] {-5L, -1L, -3L}));
        Assert.assertEquals(7L, NumberUtils.max(new long[] {7L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenNullLongArray_shouldThrowException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenEmptyLongArray_shouldThrowException() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void max_givenIntArray_shouldReturnMaximum() {
        Assert.assertEquals(5, NumberUtils.max(new int[] {1, 3, 5, 4, 2}));
        Assert.assertEquals(10, NumberUtils.max(new int[] {0, 10, -5}));
        Assert.assertEquals(3, NumberUtils.max(new int[] {3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenNullIntArray_shouldThrowException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenEmptyIntArray_shouldThrowException() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void max_givenShortArray_shouldReturnMaximum() {
        Assert.assertEquals((short) 5, NumberUtils.max(new short[] {1, 3, 5, 4, 2}));
        Assert.assertEquals((short) 6, NumberUtils.max(new short[] {1, -2, 6}));
        Assert.assertEquals((short) 4, NumberUtils.max(new short[] {4}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenNullShortArray_shouldThrowException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenEmptyShortArray_shouldThrowException() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void max_givenByteArray_shouldReturnMaximum() {
        Assert.assertEquals((byte) 5, NumberUtils.max(new byte[] {1, 3, 5, 4, 2}));
        Assert.assertEquals((byte) 8, NumberUtils.max(new byte[] {0, 8, -8}));
        Assert.assertEquals((byte) 2, NumberUtils.max(new byte[] {2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenNullByteArray_shouldThrowException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenEmptyByteArray_shouldThrowException() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void max_givenDoubleArray_shouldReturnMaximumOrNaN() {
        Assert.assertEquals(5.4d, NumberUtils.max(new double[] {1.2d, 3.1d, 5.4d, 4.0d}), DOUBLE_DELTA);
        Assert.assertEquals(2.2d, NumberUtils.max(new double[] {2.2d}), DOUBLE_DELTA);
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[] {1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenNullDoubleArray_shouldThrowException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenEmptyDoubleArray_shouldThrowException() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void max_givenFloatArray_shouldReturnMaximumOrNaN() {
        Assert.assertEquals(5.4f, NumberUtils.max(new float[] {1.2f, 3.1f, 5.4f, 4.0f}), FLOAT_DELTA);
        Assert.assertEquals(1.1f, NumberUtils.max(new float[] {1.1f}), FLOAT_DELTA);
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenNullFloatArray_shouldThrowException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_givenEmptyFloatArray_shouldThrowException() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void min_givenThreeLongs_shouldReturnMinimum() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void min_givenThreeInts_shouldReturnMinimum() {
        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
        Assert.assertEquals(1, NumberUtils.min(2, 1, 3));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void min_givenThreeShorts_shouldReturnMinimum() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void min_givenThreeBytes_shouldReturnMinimum() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void min_givenThreeDoubles_shouldReturnMinimum() {
        Assert.assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), DOUBLE_DELTA);
        Assert.assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), DOUBLE_DELTA);
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), DOUBLE_DELTA);
    }

    @Test
    public void min_givenThreeFloats_shouldReturnMinimum() {
        Assert.assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), FLOAT_DELTA);
        Assert.assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), FLOAT_DELTA);
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), FLOAT_DELTA);
    }

    @Test
    public void max_givenThreeLongs_shouldReturnMaximum() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
    }

    @Test
    public void max_givenThreeInts_shouldReturnMaximum() {
        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
        Assert.assertEquals(3, NumberUtils.max(3, 1, 2));
    }

    @Test
    public void max_givenThreeShorts_shouldReturnMaximum() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void max_givenThreeBytes_shouldReturnMaximum() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void max_givenThreeDoubles_shouldReturnMaximum() {
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), DOUBLE_DELTA);
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), DOUBLE_DELTA);
        Assert.assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), DOUBLE_DELTA);
    }

    @Test
    public void max_givenThreeFloats_shouldReturnMaximum() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), FLOAT_DELTA);
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), FLOAT_DELTA);
        Assert.assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), FLOAT_DELTA);
    }

    @Test
    public void isDigits_givenValidNumericString_shouldReturnTrue() {
        Assert.assertTrue(NumberUtils.isDigits("12345"));
        Assert.assertTrue(NumberUtils.isDigits("0"));
    }

    @Test
    public void isDigits_givenEmptyNullOrNonDigitString_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isDigits(null));
        Assert.assertFalse(NumberUtils.isDigits(""));
        Assert.assertFalse(NumberUtils.isDigits("12a34"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
        Assert.assertFalse(NumberUtils.isDigits("12.3"));
    }

    @Test
    public void isNumber_givenNullOrEmpty_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void isNumber_givenHexadecimal_shouldValidateProperly() {
        Assert.assertTrue(NumberUtils.isNumber("0x1234"));
        Assert.assertTrue(NumberUtils.isNumber("0xabcdef"));
        Assert.assertTrue(NumberUtils.isNumber("0xABCDEF"));
        Assert.assertTrue(NumberUtils.isNumber("-0x1a"));
        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("-0x"));
        Assert.assertFalse(NumberUtils.isNumber("0x12g4"));
    }

    @Test
    public void isNumber_givenValidIntegersAndDecimals_shouldReturnTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
        Assert.assertTrue(NumberUtils.isNumber("-123"));
        Assert.assertTrue(NumberUtils.isNumber("12.34"));
        Assert.assertTrue(NumberUtils.isNumber("-12.34"));
        Assert.assertTrue(NumberUtils.isNumber("0.5"));
        Assert.assertTrue(NumberUtils.isNumber(".5"));
        Assert.assertTrue(NumberUtils.isNumber("5."));
    }

    @Test
    public void isNumber_givenValidExponents_shouldReturnTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1e5"));
        Assert.assertTrue(NumberUtils.isNumber("1E5"));
        Assert.assertTrue(NumberUtils.isNumber("1.2e-3"));
        Assert.assertTrue(NumberUtils.isNumber("1.2E+3"));
        Assert.assertTrue(NumberUtils.isNumber("-1.2e3"));
    }

    @Test
    public void isNumber_givenValidTypeQualifiers_shouldReturnTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
        Assert.assertTrue(NumberUtils.isNumber("123l"));
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
        Assert.assertTrue(NumberUtils.isNumber("123.45F"));
        Assert.assertTrue(NumberUtils.isNumber("123.45d"));
        Assert.assertTrue(NumberUtils.isNumber("123.45D"));
        Assert.assertTrue(NumberUtils.isNumber("1e5f"));
        Assert.assertTrue(NumberUtils.isNumber("1e5d"));
    }

    @Test
    public void isNumber_givenInvalidFormats_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1e5L"));
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
        Assert.assertFalse(NumberUtils.isNumber("1e2e3"));
        Assert.assertFalse(NumberUtils.isNumber("e1"));
        Assert.assertFalse(NumberUtils.isNumber("1e"));
        Assert.assertFalse(NumberUtils.isNumber("1e+"));
        Assert.assertFalse(NumberUtils.isNumber("1e-"));
        Assert.assertFalse(NumberUtils.isNumber("1e+a"));
        Assert.assertFalse(NumberUtils.isNumber("."));
        Assert.assertFalse(NumberUtils.isNumber("-"));
        Assert.assertFalse(NumberUtils.isNumber("abc"));
        Assert.assertFalse(NumberUtils.isNumber("12a"));
        Assert.assertFalse(NumberUtils.isNumber("1.2.f"));
    }
}