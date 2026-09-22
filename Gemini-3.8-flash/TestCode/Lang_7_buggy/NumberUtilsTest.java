package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void constructor_givenInvocation_shouldInstantiateSuccessfully() {
        NumberUtils utils = new NumberUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void constants_givenAccess_shouldMatchExpectedValues() {
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
    public void toInt_givenValidAndInvalidInputs_shouldParseOrDefault() {
        Assert.assertEquals(123, NumberUtils.toInt("123"));
        Assert.assertEquals(0, NumberUtils.toInt((String) null));
        Assert.assertEquals(0, NumberUtils.toInt("invalid"));
        Assert.assertEquals(5, NumberUtils.toInt(null, 5));
        Assert.assertEquals(5, NumberUtils.toInt("invalid", 5));
        Assert.assertEquals(42, NumberUtils.toInt("42", 5));
    }

    @Test
    public void toLong_givenValidAndInvalidInputs_shouldParseOrDefault() {
        Assert.assertEquals(123456789012L, NumberUtils.toLong("123456789012"));
        Assert.assertEquals(0L, NumberUtils.toLong((String) null));
        Assert.assertEquals(0L, NumberUtils.toLong("invalid"));
        Assert.assertEquals(99L, NumberUtils.toLong(null, 99L));
        Assert.assertEquals(99L, NumberUtils.toLong("invalid", 99L));
        Assert.assertEquals(42L, NumberUtils.toLong("42", 99L));
    }

    @Test
    public void toFloat_givenValidAndInvalidInputs_shouldParseOrDefault() {
        Assert.assertEquals(12.34f, NumberUtils.toFloat("12.34"), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat((String) null), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.0001f);
        Assert.assertEquals(1.5f, NumberUtils.toFloat(null, 1.5f), 0.0001f);
        Assert.assertEquals(1.5f, NumberUtils.toFloat("invalid", 1.5f), 0.0001f);
        Assert.assertEquals(3.14f, NumberUtils.toFloat("3.14", 1.5f), 0.0001f);
    }

    @Test
    public void toDouble_givenValidAndInvalidInputs_shouldParseOrDefault() {
        Assert.assertEquals(12.3456d, NumberUtils.toDouble("12.3456"), 0.00001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble((String) null), 0.00001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.00001d);
        Assert.assertEquals(2.718d, NumberUtils.toDouble(null, 2.718d), 0.00001d);
        Assert.assertEquals(2.718d, NumberUtils.toDouble("invalid", 2.718d), 0.00001d);
        Assert.assertEquals(3.14159d, NumberUtils.toDouble("3.14159", 2.718d), 0.00001d);
    }

    @Test
    public void toByte_givenValidAndInvalidInputs_shouldParseOrDefault() {
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12"));
        Assert.assertEquals((byte) 0, NumberUtils.toByte((String) null));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        Assert.assertEquals((byte) 8, NumberUtils.toByte(null, (byte) 8));
        Assert.assertEquals((byte) 8, NumberUtils.toByte("invalid", (byte) 8));
        Assert.assertEquals((byte) 64, NumberUtils.toByte("64", (byte) 8));
    }

    @Test
    public void toShort_givenValidAndInvalidInputs_shouldParseOrDefault() {
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) 0, NumberUtils.toShort((String) null));
        Assert.assertEquals((short) 0, NumberUtils.toShort("invalid"));
        Assert.assertEquals((short) 16, NumberUtils.toShort(null, (short) 16));
        Assert.assertEquals((short) 16, NumberUtils.toShort("invalid", (short) 16));
        Assert.assertEquals((short) 512, NumberUtils.toShort("512", (short) 16));
    }

    @Test
    public void createFloat_givenValidAndNull_shouldReturnCorrectValue() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
    }

    @Test(expected = NumberFormatException.class)
    public void createFloat_givenInvalidString_shouldThrowException() {
        NumberUtils.createFloat("not-a-float");
    }

    @Test
    public void createDouble_givenValidAndNull_shouldReturnCorrectValue() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(1.2345d), NumberUtils.createDouble("1.2345"));
    }

    @Test(expected = NumberFormatException.class)
    public void createDouble_givenInvalidString_shouldThrowException() {
        NumberUtils.createDouble("not-a-double");
    }

    @Test
    public void createInteger_givenValidAndNull_shouldReturnCorrectValue() {
        Assert.assertNull(NumberUtils.createInteger(null));
        Assert.assertEquals(Integer.valueOf(12345), NumberUtils.createInteger("12345"));
        Assert.assertEquals(Integer.valueOf(0x1a), NumberUtils.createInteger("0x1a"));
        Assert.assertEquals(Integer.valueOf(-0x1a), NumberUtils.createInteger("-0x1a"));
    }

    @Test(expected = NumberFormatException.class)
    public void createInteger_givenInvalidString_shouldThrowException() {
        NumberUtils.createInteger("not-an-int");
    }

    @Test
    public void createLong_givenValidAndNull_shouldReturnCorrectValue() {
        Assert.assertNull(NumberUtils.createLong(null));
        Assert.assertEquals(Long.valueOf(123456789012L), NumberUtils.createLong("123456789012"));
        Assert.assertEquals(Long.valueOf(0x100000000L), NumberUtils.createLong("0x100000000"));
        Assert.assertEquals(Long.valueOf(-0x100000000L), NumberUtils.createLong("-0x100000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void createLong_givenInvalidString_shouldThrowException() {
        NumberUtils.createLong("not-a-long");
    }

    @Test
    public void createBigInteger_givenValidAndNull_shouldReturnCorrectValue() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createBigInteger("123456789012345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigInteger_givenInvalidString_shouldThrowException() {
        NumberUtils.createBigInteger("not-a-big-integer");
    }

    @Test
    public void createBigDecimal_givenValidAndNull_shouldReturnCorrectValue() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("1234567890.1234567890"), NumberUtils.createBigDecimal("1234567890.1234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenBlankString_shouldThrowException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenEmptyString_shouldThrowException() {
        NumberUtils.createBigDecimal("");
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenInvalidString_shouldThrowException() {
        NumberUtils.createBigDecimal("not-a-big-decimal");
    }

    @Test
    public void createNumber_givenNullAndNegativePrefixes_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
        Assert.assertNull(NumberUtils.createNumber("--123"));
        Assert.assertNull(NumberUtils.createNumber("--"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenBlank_shouldThrowException() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenEmpty_shouldThrowException() {
        NumberUtils.createNumber("");
    }

    @Test
    public void createNumber_givenHexStrings_shouldParseIntegerOrLong() {
        Assert.assertEquals(Integer.valueOf(0x1F), NumberUtils.createNumber("0x1F"));
        Assert.assertEquals(Integer.valueOf(0x1F), NumberUtils.createNumber("0X1F"));
        Assert.assertEquals(Integer.valueOf(-0x1F), NumberUtils.createNumber("-0x1F"));
        Assert.assertEquals(Integer.valueOf(-0x1F), NumberUtils.createNumber("-0X1F"));

        Assert.assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0x123456789"));
        Assert.assertEquals(Long.valueOf(-0x123456789L), NumberUtils.createNumber("-0x123456789"));
        Assert.assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0X123456789"));
        Assert.assertEquals(Long.valueOf(-0x123456789L), NumberUtils.createNumber("-0X123456789"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenExponentBeforeDecimal_shouldThrowException() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void createNumber_givenLongSuffixes_shouldParseLongOrBigInteger() {
        Assert.assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234l"));
        Assert.assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234L"));
        Assert.assertEquals(Long.valueOf(-1234L), NumberUtils.createNumber("-1234l"));
        Assert.assertEquals(Long.valueOf(-1234L), NumberUtils.createNumber("-1234L"));

        String overflowLong = "123456789012345678901234567890L";
        Assert.assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createNumber(overflowLong));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixWithDecimal_shouldThrowException() {
        NumberUtils.createNumber("12.34L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixWithExponent_shouldThrowException() {
        NumberUtils.createNumber("12e3L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixWithNonDigits_shouldThrowException() {
        NumberUtils.createNumber("12a4L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenLongSuffixWithInvalidMinus_shouldThrowException() {
        NumberUtils.createNumber("-12-34L");
    }

    @Test
    public void createNumber_givenFloatSuffixes_shouldParseFloatOrFallback() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("000f"));

        Number floatOverflowToDouble = NumberUtils.createNumber("1e40f");
        Assert.assertEquals(Double.valueOf(1e40d), floatOverflowToDouble);
    }

    @Test
    public void createNumber_givenDoubleSuffixes_shouldParseDoubleOrFallback() {
        Assert.assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        Assert.assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("000d"));

        Number doubleOverflowToBigDecimal = NumberUtils.createNumber("1e400d");
        Assert.assertEquals(new BigDecimal("1e400"), doubleOverflowToBigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidSuffix_shouldThrowException() {
        NumberUtils.createNumber("1234q");
    }

    @Test
    public void createNumber_givenNoSuffixAndNoDecimalOrExp_shouldParseAppropriateIntLongBigInteger() {
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        Assert.assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        Assert.assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void createNumber_givenDecimalsOrExponentsWithoutSuffix_shouldParseFloatDoubleBigDecimal() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        Assert.assertEquals(Double.valueOf(1e40), NumberUtils.createNumber("1e40"));
        Assert.assertEquals(new BigDecimal("1e400"), NumberUtils.createNumber("1e400"));
        Assert.assertEquals(Float.valueOf(123.0f), NumberUtils.createNumber("123."));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidNumberFormat_shouldThrowException() {
        NumberUtils.createNumber("12.34.56");
    }

    @Test
    public void min_givenLongArray_shouldReturnMinimumValue() {
        Assert.assertEquals(1L, NumberUtils.min(new long[]{3L, 2L, 1L, 5L}));
        Assert.assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, 0L}));
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
    public void min_givenIntArray_shouldReturnMinimumValue() {
        Assert.assertEquals(1, NumberUtils.min(new int[]{3, 2, 1, 5}));
        Assert.assertEquals(-5, NumberUtils.min(new int[]{-1, -5, 0}));
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
    public void min_givenShortArray_shouldReturnMinimumValue() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[]{3, 2, 1, 5}));
        Assert.assertEquals((short) -5, NumberUtils.min(new short[]{-1, -5, 0}));
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
    public void min_givenByteArray_shouldReturnMinimumValue() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 2, 1, 5}));
        Assert.assertEquals((byte) -5, NumberUtils.min(new byte[]{-1, -5, 0}));
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
    public void min_givenDoubleArray_shouldReturnMinimumValueOrNaN() {
        Assert.assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 2.2d, 1.1d, 5.5d}), 0.0001d);
        Assert.assertEquals(-5.5d, NumberUtils.min(new double[]{-1.1d, -5.5d, 0.0d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.1d, Double.NaN, 2.2d})));
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
    public void min_givenFloatArray_shouldReturnMinimumValueOrNaN() {
        Assert.assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 2.2f, 1.1f, 5.5f}), 0.0001f);
        Assert.assertEquals(-5.5f, NumberUtils.min(new float[]{-1.1f, -5.5f, 0.0f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.1f, Float.NaN, 2.2f})));
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
    public void max_givenLongArray_shouldReturnMaximumValue() {
        Assert.assertEquals(5L, NumberUtils.max(new long[]{3L, 2L, 1L, 5L}));
        Assert.assertEquals(0L, NumberUtils.max(new long[]{-1L, -5L, 0L}));
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
    public void max_givenIntArray_shouldReturnMaximumValue() {
        Assert.assertEquals(5, NumberUtils.max(new int[]{3, 2, 1, 5}));
        Assert.assertEquals(0, NumberUtils.max(new int[]{-1, -5, 0}));
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
    public void max_givenShortArray_shouldReturnMaximumValue() {
        Assert.assertEquals((short) 5, NumberUtils.max(new short[]{3, 2, 1, 5}));
        Assert.assertEquals((short) 0, NumberUtils.max(new short[]{-1, -5, 0}));
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
    public void max_givenByteArray_shouldReturnMaximumValue() {
        Assert.assertEquals((byte) 5, NumberUtils.max(new byte[]{3, 2, 1, 5}));
        Assert.assertEquals((byte) 0, NumberUtils.max(new byte[]{-1, -5, 0}));
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
    public void max_givenDoubleArray_shouldReturnMaximumValueOrNaN() {
        Assert.assertEquals(5.5d, NumberUtils.max(new double[]{3.3d, 2.2d, 1.1d, 5.5d}), 0.0001d);
        Assert.assertEquals(0.0d, NumberUtils.max(new double[]{-1.1d, -5.5d, 0.0d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.1d, Double.NaN, 2.2d})));
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
    public void max_givenFloatArray_shouldReturnMaximumValueOrNaN() {
        Assert.assertEquals(5.5f, NumberUtils.max(new float[]{3.3f, 2.2f, 1.1f, 5.5f}), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.max(new float[]{-1.1f, -5.5f, 0.0f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.1f, Float.NaN, 2.2f})));
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
        Assert.assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);
    }

    @Test
    public void min_givenThreeFloats_shouldReturnMinimum() {
        Assert.assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
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
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        Assert.assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), 0.0001d);
    }

    @Test
    public void max_givenThreeFloats_shouldReturnMaximum() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        Assert.assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    @Test
    public void isDigits_givenVariousStrings_shouldValidateCorrectly() {
        Assert.assertFalse(NumberUtils.isDigits(null));
        Assert.assertFalse(NumberUtils.isDigits(""));
        Assert.assertFalse(NumberUtils.isDigits("  "));
        Assert.assertFalse(NumberUtils.isDigits("123a"));
        Assert.assertFalse(NumberUtils.isDigits("12.3"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
        Assert.assertTrue(NumberUtils.isDigits("0"));
        Assert.assertTrue(NumberUtils.isDigits("1234567890"));
    }

    @Test
    public void isNumber_givenNullAndEmpty_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
        Assert.assertFalse(NumberUtils.isNumber(""));
        Assert.assertFalse(NumberUtils.isNumber(" "));
    }

    @Test
    public void isNumber_givenHexStrings_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("0x1234"));
        Assert.assertTrue(NumberUtils.isNumber("0X1234"));
        Assert.assertTrue(NumberUtils.isNumber("-0x1234"));
        Assert.assertTrue(NumberUtils.isNumber("0xabcdef"));
        Assert.assertTrue(NumberUtils.isNumber("0xABCDEF"));

        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("-0x"));
        Assert.assertFalse(NumberUtils.isNumber("0x123g"));
    }

    @Test
    public void isNumber_givenStandardDecimalAndScientificNotation_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
        Assert.assertTrue(NumberUtils.isNumber("-123"));
        Assert.assertTrue(NumberUtils.isNumber("+123"));
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
        Assert.assertTrue(NumberUtils.isNumber(".45"));
        Assert.assertTrue(NumberUtils.isNumber("123."));
        Assert.assertTrue(NumberUtils.isNumber("-123.45"));
        Assert.assertTrue(NumberUtils.isNumber("1e5"));
        Assert.assertTrue(NumberUtils.isNumber("1.5e5"));
        Assert.assertTrue(NumberUtils.isNumber("1.5E5"));
        Assert.assertTrue(NumberUtils.isNumber("1.5e-5"));
        Assert.assertTrue(NumberUtils.isNumber("1.5e+5"));
        Assert.assertTrue(NumberUtils.isNumber("-1.5e-5"));

        Assert.assertFalse(NumberUtils.isNumber("."));
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
        Assert.assertFalse(NumberUtils.isNumber("1e2.3"));
        Assert.assertFalse(NumberUtils.isNumber("e1"));
        Assert.assertFalse(NumberUtils.isNumber("1e"));
        Assert.assertFalse(NumberUtils.isNumber("1e+"));
        Assert.assertFalse(NumberUtils.isNumber("1e-"));
        Assert.assertFalse(NumberUtils.isNumber("1ee2"));
        Assert.assertFalse(NumberUtils.isNumber("1+2"));
        Assert.assertFalse(NumberUtils.isNumber("1-2"));
        Assert.assertFalse(NumberUtils.isNumber("--1"));
        Assert.assertFalse(NumberUtils.isNumber("abc"));
    }

    @Test
    public void isNumber_givenTypeSuffixes_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("123f"));
        Assert.assertTrue(NumberUtils.isNumber("123F"));
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
        Assert.assertTrue(NumberUtils.isNumber("123d"));
        Assert.assertTrue(NumberUtils.isNumber("123D"));
        Assert.assertTrue(NumberUtils.isNumber("123.45d"));
        Assert.assertTrue(NumberUtils.isNumber("123l"));
        Assert.assertTrue(NumberUtils.isNumber("123L"));

        Assert.assertFalse(NumberUtils.isNumber("123.45L"));
        Assert.assertFalse(NumberUtils.isNumber("123e5L"));
        Assert.assertFalse(NumberUtils.isNumber("123.45e5L"));
        Assert.assertFalse(NumberUtils.isNumber("f"));
        Assert.assertFalse(NumberUtils.isNumber("d"));
        Assert.assertFalse(NumberUtils.isNumber("l"));
    }
}