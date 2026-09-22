package org.apache.commons.lang3.math;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    private static final double DELTA_DOUBLE = 0.0001d;
    private static final float DELTA_FLOAT = 0.0001f;

    @Test
    public void constructor_default_shouldInstantiate() {
        NumberUtils nu = new NumberUtils();
        Assert.assertNotNull(nu);
    }

    @Test
    public void constants_publicStaticFinal_shouldHoldExpectedValues() {
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
        Assert.assertEquals(-45, NumberUtils.toInt("-45"));
        Assert.assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void toInt_givenInvalidOrNull_shouldReturnDefault() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
        Assert.assertEquals(10, NumberUtils.toInt(null, 10));
        Assert.assertEquals(0, NumberUtils.toInt("invalid"));
        Assert.assertEquals(99, NumberUtils.toInt("invalid", 99));
    }

    @Test
    public void toLong_givenValidString_shouldReturnParsedLong() {
        Assert.assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        Assert.assertEquals(-1234567890123L, NumberUtils.toLong("-1234567890123"));
        Assert.assertEquals(123L, NumberUtils.toLong("123", 5L));
    }

    @Test
    public void toLong_givenInvalidOrNull_shouldReturnDefault() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(10L, NumberUtils.toLong(null, 10L));
        Assert.assertEquals(0L, NumberUtils.toLong("not_long"));
        Assert.assertEquals(99L, NumberUtils.toLong("not_long", 99L));
    }

    @Test
    public void toFloat_givenValidString_shouldReturnParsedFloat() {
        Assert.assertEquals(12.34f, NumberUtils.toFloat("12.34"), DELTA_FLOAT);
        Assert.assertEquals(-12.34f, NumberUtils.toFloat("-12.34"), DELTA_FLOAT);
        Assert.assertEquals(5.5f, NumberUtils.toFloat("5.5", 1.0f), DELTA_FLOAT);
    }

    @Test
    public void toFloat_givenInvalidOrNull_shouldReturnDefault() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), DELTA_FLOAT);
        Assert.assertEquals(2.5f, NumberUtils.toFloat(null, 2.5f), DELTA_FLOAT);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("not_float"), DELTA_FLOAT);
        Assert.assertEquals(7.7f, NumberUtils.toFloat("not_float", 7.7f), DELTA_FLOAT);
    }

    @Test
    public void toDouble_givenValidString_shouldReturnParsedDouble() {
        Assert.assertEquals(123.456d, NumberUtils.toDouble("123.456"), DELTA_DOUBLE);
        Assert.assertEquals(-123.456d, NumberUtils.toDouble("-123.456"), DELTA_DOUBLE);
        Assert.assertEquals(9.9d, NumberUtils.toDouble("9.9", 1.1d), DELTA_DOUBLE);
    }

    @Test
    public void toDouble_givenInvalidOrNull_shouldReturnDefault() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), DELTA_DOUBLE);
        Assert.assertEquals(4.4d, NumberUtils.toDouble(null, 4.4d), DELTA_DOUBLE);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("not_double"), DELTA_DOUBLE);
        Assert.assertEquals(8.8d, NumberUtils.toDouble("not_double", 8.8d), DELTA_DOUBLE);
    }

    @Test
    public void toByte_givenValidString_shouldReturnParsedByte() {
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12"));
        Assert.assertEquals((byte) -12, NumberUtils.toByte("-12"));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("5", (byte) 1));
    }

    @Test
    public void toByte_givenInvalidOrNull_shouldReturnDefault() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
        Assert.assertEquals((byte) 7, NumberUtils.toByte(null, (byte) 7));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("not_byte"));
        Assert.assertEquals((byte) 9, NumberUtils.toByte("9999", (byte) 9));
    }

    @Test
    public void toShort_givenValidString_shouldReturnParsedShort() {
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) -1234, NumberUtils.toShort("-1234"));
        Assert.assertEquals((short) 50, NumberUtils.toShort("50", (short) 1));
    }

    @Test
    public void toShort_givenInvalidOrNull_shouldReturnDefault() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
        Assert.assertEquals((short) 7, NumberUtils.toShort(null, (short) 7));
        Assert.assertEquals((short) 0, NumberUtils.toShort("not_short"));
        Assert.assertEquals((short) 9, NumberUtils.toShort("9999999", (short) 9));
    }

    @Test
    public void createNumber_givenNull_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenBlankString_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenEmptyString_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("");
    }

    @Test
    public void createNumber_givenHexPrefixes_shouldReturnAppropriateNumber() {
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xff"));
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0XFF"));
        Assert.assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xff"));
        Assert.assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0XFF"));
        Assert.assertEquals(Integer.valueOf(16), NumberUtils.createNumber("#10"));
        Assert.assertEquals(Integer.valueOf(-16), NumberUtils.createNumber("-#10"));

        Assert.assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0x123456789"));
        Assert.assertEquals(new BigInteger("123456789012345678", 16), NumberUtils.createNumber("0x123456789012345678"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenMalformedDecAndExpPos_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("1.2e");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenExpBeforeDecPos_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void createNumber_givenLongSuffix_shouldReturnLongOrBigInteger() {
        Assert.assertEquals(Long.valueOf(100L), NumberUtils.createNumber("100l"));
        Assert.assertEquals(Long.valueOf(-100L), NumberUtils.createNumber("-100L"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixWithDecimals_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("10.5L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixWithExponent_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixNonDigits_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("abcL");
    }

    @Test
    public void createNumber_givenFloatSuffix_shouldReturnFloat() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Float.valueOf(1e2f), NumberUtils.createNumber("1e2f"));
    }

    @Test
    public void createNumber_givenFloatOverflow_shouldFallbackToDoubleOrBigDecimal() {
        Number num = NumberUtils.createNumber("1e50f");
        Assert.assertEquals(Double.valueOf("1e50"), num);

        Number bigNum = NumberUtils.createNumber("1e400f");
        Assert.assertEquals(new BigDecimal("1e400"), bigNum);
    }

    @Test
    public void createNumber_givenDoubleSuffix_shouldReturnDoubleOrBigDecimal() {
        Assert.assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0D"));
        Number bigNum = NumberUtils.createNumber("1e400d");
        Assert.assertEquals(new BigDecimal("1e400"), bigNum);
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidSuffix_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("1234z");
    }

    @Test
    public void createNumber_givenIntegerOrLongWithoutSuffix_shouldReturnExpectedType() {
        Assert.assertEquals(Integer.valueOf(12345), NumberUtils.createNumber("12345"));
        Assert.assertEquals(Long.valueOf(3000000000L), NumberUtils.createNumber("3000000000"));
        Assert.assertEquals(new BigInteger("9223372036854775808000"), NumberUtils.createNumber("9223372036854775808000"));
    }

    @Test
    public void createNumber_givenFloatingPointWithoutSuffix_shouldReturnFloatDoubleOrBigDecimal() {
        Assert.assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234"));
        Assert.assertEquals(Double.valueOf(1.123456789012d), NumberUtils.createNumber("1.123456789012"));
        Assert.assertEquals(new BigDecimal("1.1234567890123456789"), NumberUtils.createNumber("1.1234567890123456789"));
        Assert.assertEquals(Double.valueOf(1e20d), NumberUtils.createNumber("1e20"));
        Assert.assertEquals(new BigDecimal("1e500"), NumberUtils.createNumber("1e500"));
    }

    @Test
    public void createFloat_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(12.3f), NumberUtils.createFloat("12.3"));
    }

    @Test
    public void createDouble_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(12.3d), NumberUtils.createDouble("12.3"));
    }

    @Test
    public void createInteger_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createInteger(null));
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void createLong_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createLong(null));
        Assert.assertEquals(Long.valueOf(123456L), NumberUtils.createLong("123456"));
    }

    @Test
    public void createBigInteger_givenVariations_shouldParseCorrectly() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("12345"), NumberUtils.createBigInteger("12345"));
        Assert.assertEquals(new BigInteger("-12345"), NumberUtils.createBigInteger("-12345"));
        Assert.assertEquals(new BigInteger("ff", 16), NumberUtils.createBigInteger("0xff"));
        Assert.assertEquals(new BigInteger("-ff", 16), NumberUtils.createBigInteger("-0xff"));
        Assert.assertEquals(new BigInteger("10", 16), NumberUtils.createBigInteger("#10"));
        Assert.assertEquals(new BigInteger("-10", 16), NumberUtils.createBigInteger("-#10"));
        Assert.assertEquals(new BigInteger("77", 8), NumberUtils.createBigInteger("077"));
        Assert.assertEquals(new BigInteger("-77", 8), NumberUtils.createBigInteger("-077"));
    }

    @Test
    public void createBigDecimal_givenValidAndNull_shouldParseCorrectly() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenBlank_shouldThrowNumberFormatException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenDoubleMinus_shouldThrowNumberFormatException() {
        NumberUtils.createBigDecimal("--123");
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
    public void min_givenValidLongArray_shouldReturnMin() {
        long[] array = new long[] { 5L, -2L, 10L, -7L, 3L };
        Assert.assertEquals(-7L, NumberUtils.min(array));
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
    public void min_givenValidIntArray_shouldReturnMin() {
        int[] array = new int[] { 5, -2, 10, -7, 3 };
        Assert.assertEquals(-7, NumberUtils.min(array));
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
    public void min_givenValidShortArray_shouldReturnMin() {
        short[] array = new short[] { (short) 5, (short) -2, (short) 10, (short) -7 };
        Assert.assertEquals((short) -7, NumberUtils.min(array));
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
    public void min_givenValidByteArray_shouldReturnMin() {
        byte[] array = new byte[] { (byte) 5, (byte) -2, (byte) 10, (byte) -7 };
        Assert.assertEquals((byte) -7, NumberUtils.min(array));
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
    public void min_givenValidDoubleArray_shouldReturnMin() {
        double[] array = new double[] { 5.5d, -2.2d, 10.0d, -7.7d };
        Assert.assertEquals(-7.7d, NumberUtils.min(array), DELTA_DOUBLE);

        double[] nanArray = new double[] { 5.5d, Double.NaN, -2.2d };
        Assert.assertTrue(Double.isNaN(NumberUtils.min(nanArray)));
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
    public void min_givenValidFloatArray_shouldReturnMin() {
        float[] array = new float[] { 5.5f, -2.2f, 10.0f, -7.7f };
        Assert.assertEquals(-7.7f, NumberUtils.min(array), DELTA_FLOAT);

        float[] nanArray = new float[] { 5.5f, Float.NaN, -2.2f };
        Assert.assertTrue(Float.isNaN(NumberUtils.min(nanArray)));
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
    public void max_givenValidLongArray_shouldReturnMax() {
        long[] array = new long[] { 5L, -2L, 10L, -7L, 3L };
        Assert.assertEquals(10L, NumberUtils.max(array));
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
    public void max_givenValidIntArray_shouldReturnMax() {
        int[] array = new int[] { 5, -2, 10, -7, 3 };
        Assert.assertEquals(10, NumberUtils.max(array));
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
    public void max_givenValidShortArray_shouldReturnMax() {
        short[] array = new short[] { (short) 5, (short) -2, (short) 10, (short) -7 };
        Assert.assertEquals((short) 10, NumberUtils.max(array));
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
    public void max_givenValidByteArray_shouldReturnMax() {
        byte[] array = new byte[] { (byte) 5, (byte) -2, (byte) 10, (byte) -7 };
        Assert.assertEquals((byte) 10, NumberUtils.max(array));
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
    public void max_givenValidDoubleArray_shouldReturnMax() {
        double[] array = new double[] { 5.5d, -2.2d, 10.0d, -7.7d };
        Assert.assertEquals(10.0d, NumberUtils.max(array), DELTA_DOUBLE);

        double[] nanArray = new double[] { 5.5d, Double.NaN, -2.2d };
        Assert.assertTrue(Double.isNaN(NumberUtils.max(nanArray)));
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
    public void max_givenValidFloatArray_shouldReturnMax() {
        float[] array = new float[] { 5.5f, -2.2f, 10.0f, -7.7f };
        Assert.assertEquals(10.0f, NumberUtils.max(array), DELTA_FLOAT);

        float[] nanArray = new float[] { 5.5f, Float.NaN, -2.2f };
        Assert.assertTrue(Float.isNaN(NumberUtils.max(nanArray)));
    }

    @Test
    public void min_givenThreeLongs_shouldReturnSmallest() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void min_givenThreeInts_shouldReturnSmallest() {
        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
        Assert.assertEquals(1, NumberUtils.min(2, 1, 3));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void min_givenThreeShorts_shouldReturnSmallest() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void min_givenThreeBytes_shouldReturnSmallest() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void min_givenThreeDoubles_shouldReturnSmallest() {
        Assert.assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), DELTA_DOUBLE);
        Assert.assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), DELTA_DOUBLE);
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), DELTA_DOUBLE);
    }

    @Test
    public void min_givenThreeFloats_shouldReturnSmallest() {
        Assert.assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), DELTA_FLOAT);
        Assert.assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), DELTA_FLOAT);
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), DELTA_FLOAT);
    }

    @Test
    public void max_givenThreeLongs_shouldReturnLargest() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        Assert.assertEquals(3L, NumberUtils.max(2L, 3L, 1L));
        Assert.assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void max_givenThreeInts_shouldReturnLargest() {
        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
        Assert.assertEquals(3, NumberUtils.max(2, 3, 1));
        Assert.assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void max_givenThreeShorts_shouldReturnLargest() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 2, (short) 3, (short) 1));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void max_givenThreeBytes_shouldReturnLargest() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 3, (byte) 1));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void max_givenThreeDoubles_shouldReturnLargest() {
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), DELTA_DOUBLE);
        Assert.assertEquals(3.0d, NumberUtils.max(2.0d, 3.0d, 1.0d), DELTA_DOUBLE);
        Assert.assertEquals(3.0d, NumberUtils.max(3.0d, 2.0d, 1.0d), DELTA_DOUBLE);
    }

    @Test
    public void max_givenThreeFloats_shouldReturnLargest() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), DELTA_FLOAT);
        Assert.assertEquals(3.0f, NumberUtils.max(2.0f, 3.0f, 1.0f), DELTA_FLOAT);
        Assert.assertEquals(3.0f, NumberUtils.max(3.0f, 2.0f, 1.0f), DELTA_FLOAT);
    }

    @Test
    public void isDigits_givenVariousStrings_shouldReturnExpectedBoolean() {
        Assert.assertFalse(NumberUtils.isDigits(null));
        Assert.assertFalse(NumberUtils.isDigits(""));
        Assert.assertFalse(NumberUtils.isDigits("123a"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
        Assert.assertTrue(NumberUtils.isDigits("123450"));
    }

    @Test
    public void isNumber_givenNullOrEmpty_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void isNumber_givenHexStrings_shouldIdentifyCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("0x1234"));
        Assert.assertTrue(NumberUtils.isNumber("0Xabcdef"));
        Assert.assertTrue(NumberUtils.isNumber("-0x1234"));
        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("-0x"));
        Assert.assertFalse(NumberUtils.isNumber("0x123g"));
    }

    @Test
    public void isNumber_givenDecimalsAndExponents_shouldIdentifyCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
        Assert.assertTrue(NumberUtils.isNumber("-123"));
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
        Assert.assertTrue(NumberUtils.isNumber(".45"));
        Assert.assertTrue(NumberUtils.isNumber("123."));
        Assert.assertTrue(NumberUtils.isNumber("1.23e4"));
        Assert.assertTrue(NumberUtils.isNumber("1.23E+4"));
        Assert.assertTrue(NumberUtils.isNumber("1.23e-4"));
        Assert.assertTrue(NumberUtils.isNumber("-1.23e-4"));

        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
        Assert.assertFalse(NumberUtils.isNumber("1e2e3"));
        Assert.assertFalse(NumberUtils.isNumber("e12"));
        Assert.assertFalse(NumberUtils.isNumber("1e"));
        Assert.assertFalse(NumberUtils.isNumber("1e+"));
        Assert.assertFalse(NumberUtils.isNumber("--1"));
        Assert.assertFalse(NumberUtils.isNumber("."));
        Assert.assertFalse(NumberUtils.isNumber("1.2e.3"));
    }

    @Test
    public void isNumber_givenTypeQualifiers_shouldIdentifyCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("1234L"));
        Assert.assertTrue(NumberUtils.isNumber("1234l"));
        Assert.assertTrue(NumberUtils.isNumber("12.34f"));
        Assert.assertTrue(NumberUtils.isNumber("12.34F"));
        Assert.assertTrue(NumberUtils.isNumber("12.34d"));
        Assert.assertTrue(NumberUtils.isNumber("12.34D"));
        Assert.assertTrue(NumberUtils.isNumber("1e2f"));
        Assert.assertTrue(NumberUtils.isNumber("1e2d"));

        Assert.assertFalse(NumberUtils.isNumber("12.34L"));
        Assert.assertFalse(NumberUtils.isNumber("1e2L"));
        Assert.assertFalse(NumberUtils.isNumber("f"));
        Assert.assertFalse(NumberUtils.isNumber("d"));
        Assert.assertFalse(NumberUtils.isNumber("L"));
        Assert.assertFalse(NumberUtils.isNumber("1234z"));
    }
}