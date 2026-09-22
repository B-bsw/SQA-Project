package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void constructor_default_shouldInstantiateSuccessfully() {
        NumberUtils utils = new NumberUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void constants_verifyValues_shouldMatchExpected() {
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
        Assert.assertEquals(123, NumberUtils.toInt("123", 456));
    }

    @Test
    public void toInt_givenNullOrInvalidString_shouldReturnDefault() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
        Assert.assertEquals(10, NumberUtils.toInt(null, 10));
        Assert.assertEquals(0, NumberUtils.toInt("invalid"));
        Assert.assertEquals(10, NumberUtils.toInt("invalid", 10));
    }

    @Test
    public void toLong_givenValidString_shouldReturnParsedLong() {
        Assert.assertEquals(12345678901L, NumberUtils.toLong("12345678901"));
        Assert.assertEquals(12345678901L, NumberUtils.toLong("12345678901", 0L));
    }

    @Test
    public void toLong_givenNullOrInvalidString_shouldReturnDefault() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(99L, NumberUtils.toLong(null, 99L));
        Assert.assertEquals(0L, NumberUtils.toLong("invalid"));
        Assert.assertEquals(99L, NumberUtils.toLong("invalid", 99L));
    }

    @Test
    public void toFloat_givenValidString_shouldReturnParsedFloat() {
        Assert.assertEquals(12.34f, NumberUtils.toFloat("12.34"), 0.0001f);
        Assert.assertEquals(12.34f, NumberUtils.toFloat("12.34", 1.0f), 0.0001f);
    }

    @Test
    public void toFloat_givenNullOrInvalidString_shouldReturnDefault() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        Assert.assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.0001f);
        Assert.assertEquals(5.5f, NumberUtils.toFloat("invalid", 5.5f), 0.0001f);
    }

    @Test
    public void toDouble_givenValidString_shouldReturnParsedDouble() {
        Assert.assertEquals(12.3456d, NumberUtils.toDouble("12.3456"), 0.00001d);
        Assert.assertEquals(12.3456d, NumberUtils.toDouble("12.3456", 1.0d), 0.00001d);
    }

    @Test
    public void toDouble_givenNullOrInvalidString_shouldReturnDefault() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.00001d);
        Assert.assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.00001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.00001d);
        Assert.assertEquals(5.5d, NumberUtils.toDouble("invalid", 5.5d), 0.00001d);
    }

    @Test
    public void toByte_givenValidString_shouldReturnParsedByte() {
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12"));
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12", (byte) 1));
    }

    @Test
    public void toByte_givenNullOrInvalidString_shouldReturnDefault() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
        Assert.assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
    }

    @Test
    public void toShort_givenValidString_shouldReturnParsedShort() {
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234", (short) 1));
    }

    @Test
    public void toShort_givenNullOrInvalidString_shouldReturnDefault() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
        Assert.assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        Assert.assertEquals((short) 0, NumberUtils.toShort("invalid"));
        Assert.assertEquals((short) 5, NumberUtils.toShort("invalid", (short) 5));
    }

    @Test
    public void createNumber_givenNull_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
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
    public void createNumber_givenHexStrings_shouldParseAppropriateType() {
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xff"));
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("#FF"));
        Assert.assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));
        Assert.assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-#FF"));
        Assert.assertEquals(Long.valueOf(0x1234567890L), NumberUtils.createNumber("0x1234567890"));
        Assert.assertEquals(new BigInteger("123456789012345678", 16), NumberUtils.createNumber("0x123456789012345678"));
    }

    @Test
    public void createNumber_givenIntegerOrLongOrBigIntegerString_shouldParseProperly() {
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        Assert.assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void createNumber_givenLongSuffix_shouldReturnLongOrBigInteger() {
        Assert.assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        Assert.assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        Assert.assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLongSuffix_shouldThrowException() {
        NumberUtils.createNumber("12.34L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLongPrefixWithNonDigits_shouldThrowException() {
        NumberUtils.createNumber("--123L");
    }

    @Test
    public void createNumber_givenFloatSuffix_shouldReturnFloatOrDoubleOrBigDecimal() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Double.valueOf(1.0E39d), (Double) NumberUtils.createNumber("1.0E39f"), 0.0001);
    }

    @Test
    public void createNumber_givenDoubleSuffix_shouldReturnDoubleOrBigDecimal() {
        Assert.assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        Assert.assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        Assert.assertEquals(new BigDecimal("1.0E400"), NumberUtils.createNumber("1.0E400d"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidSuffix_shouldThrowException() {
        NumberUtils.createNumber("123a");
    }

    @Test
    public void createNumber_givenDecimalAndScientific_shouldParseProperly() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        Assert.assertEquals(Double.valueOf(1.23456789012345d), (Double) NumberUtils.createNumber("1.23456789012345"), 0.00000001);
        Assert.assertEquals(new BigDecimal("1.23456789012345678901234567890"), NumberUtils.createNumber("1.23456789012345678901234567890"));
        Assert.assertEquals(Float.valueOf(1.23e4f), NumberUtils.createNumber("1.23e4"));
        Assert.assertEquals(Float.valueOf(1.23E4f), NumberUtils.createNumber("1.23E4"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidExpPosBeforeDecPos_shouldThrowException() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void createFloat_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
    }

    @Test
    public void createDouble_givenValidAndNull_shouldReturnExpected() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(1.23d), NumberUtils.createDouble("1.23"));
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
        Assert.assertEquals(Long.valueOf(123456789L), NumberUtils.createLong("123456789"));
        Assert.assertEquals(Long.valueOf(255L), NumberUtils.createLong("0xFF"));
    }

    @Test
    public void createBigInteger_givenVariousFormats_shouldParseCorrectly() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
        Assert.assertEquals(new BigInteger("-123"), NumberUtils.createBigInteger("-123"));
        Assert.assertEquals(new BigInteger("255"), NumberUtils.createBigInteger("0xFF"));
        Assert.assertEquals(new BigInteger("-255"), NumberUtils.createBigInteger("-0xFF"));
        Assert.assertEquals(new BigInteger("255"), NumberUtils.createBigInteger("#FF"));
        Assert.assertEquals(new BigInteger("-255"), NumberUtils.createBigInteger("-#FF"));
        Assert.assertEquals(new BigInteger("8"), NumberUtils.createBigInteger("010"));
        Assert.assertEquals(new BigInteger("-8"), NumberUtils.createBigInteger("-010"));
    }

    @Test
    public void createBigDecimal_givenValidAndNull_shouldParseCorrectly() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenBlankString_shouldThrowException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenDoubleMinus_shouldThrowException() {
        NumberUtils.createBigDecimal("--123");
    }

    @Test
    public void min_givenLongArray_shouldReturnMinimum() {
        Assert.assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        Assert.assertEquals(-5L, NumberUtils.min(new long[]{3L, -5L, 2L}));
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
        Assert.assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
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
        Assert.assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
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
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
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
        Assert.assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.3d, Double.NaN, 2.2d})));
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
        Assert.assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.3f, Float.NaN, 2.2f})));
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
        Assert.assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
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
        Assert.assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
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
        Assert.assertEquals((short) 3, NumberUtils.max(new short[]{(short) 1, (short) 3, (short) 2}));
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
        Assert.assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 1, (byte) 3, (byte) 2}));
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
        Assert.assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
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
    public void max_givenFloatArray_shouldReturnMaximumOrNaN() {
        Assert.assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);
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
    public void min_givenThreePrimitives_shouldReturnMinimum() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));

        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
        Assert.assertEquals(1, NumberUtils.min(2, 1, 3));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));

        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));

        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));

        Assert.assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);

        Assert.assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
    }

    @Test
    public void max_givenThreePrimitives_shouldReturnMaximum() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(3L, 1L, 2L));

        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
        Assert.assertEquals(3, NumberUtils.max(3, 1, 2));

        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));

        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));

        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        Assert.assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), 0.0001d);

        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        Assert.assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    @Test
    public void isDigits_givenVariousStrings_shouldReturnExpectedBoolean() {
        Assert.assertFalse(NumberUtils.isDigits(null));
        Assert.assertFalse(NumberUtils.isDigits(""));
        Assert.assertTrue(NumberUtils.isDigits("12345"));
        Assert.assertFalse(NumberUtils.isDigits("123a45"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
        Assert.assertFalse(NumberUtils.isDigits("12.3"));
    }

    @Test
    public void isNumber_givenNullOrEmpty_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void isNumber_givenHexStrings_shouldValidateProperly() {
        Assert.assertTrue(NumberUtils.isNumber("0x1234"));
        Assert.assertTrue(NumberUtils.isNumber("0xabcd"));
        Assert.assertTrue(NumberUtils.isNumber("0XABCD"));
        Assert.assertTrue(NumberUtils.isNumber("-0x1234"));
        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("-0x"));
        Assert.assertFalse(NumberUtils.isNumber("0x123g"));
    }

    @Test
    public void isNumber_givenStandardNumbers_shouldReturnTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1234"));
        Assert.assertTrue(NumberUtils.isNumber("-1234"));
        Assert.assertTrue(NumberUtils.isNumber("12.34"));
        Assert.assertTrue(NumberUtils.isNumber("-12.34"));
        Assert.assertTrue(NumberUtils.isNumber(".5"));
        Assert.assertTrue(NumberUtils.isNumber("-.5"));
        Assert.assertTrue(NumberUtils.isNumber("1234."));
    }

    @Test
    public void isNumber_givenScientificNotation_shouldValidateProperly() {
        Assert.assertTrue(NumberUtils.isNumber("1e5"));
        Assert.assertTrue(NumberUtils.isNumber("1E5"));
        Assert.assertTrue(NumberUtils.isNumber("1.2e5"));
        Assert.assertTrue(NumberUtils.isNumber("1e+5"));
        Assert.assertTrue(NumberUtils.isNumber("1e-5"));
        Assert.assertTrue(NumberUtils.isNumber("-1e-5"));

        Assert.assertFalse(NumberUtils.isNumber("1e"));
        Assert.assertFalse(NumberUtils.isNumber("1e+"));
        Assert.assertFalse(NumberUtils.isNumber("1e-"));
        Assert.assertFalse(NumberUtils.isNumber("1e5e5"));
        Assert.assertFalse(NumberUtils.isNumber("e5"));
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void isNumber_givenTypeSuffixes_shouldValidateProperly() {
        Assert.assertTrue(NumberUtils.isNumber("1234L"));
        Assert.assertTrue(NumberUtils.isNumber("1234l"));
        Assert.assertFalse(NumberUtils.isNumber("12.34L"));
        Assert.assertFalse(NumberUtils.isNumber("1e5L"));

        Assert.assertTrue(NumberUtils.isNumber("1234f"));
        Assert.assertTrue(NumberUtils.isNumber("1234F"));
        Assert.assertTrue(NumberUtils.isNumber("12.34f"));
        Assert.assertTrue(NumberUtils.isNumber("1e5f"));
        Assert.assertFalse(NumberUtils.isNumber("f"));

        Assert.assertTrue(NumberUtils.isNumber("1234d"));
        Assert.assertTrue(NumberUtils.isNumber("1234D"));
        Assert.assertTrue(NumberUtils.isNumber("12.34d"));
        Assert.assertTrue(NumberUtils.isNumber("1e5d"));
        Assert.assertFalse(NumberUtils.isNumber("d"));
    }

    @Test
    public void isNumber_givenInvalidCharacters_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber("abc"));
        Assert.assertFalse(NumberUtils.isNumber("--12"));
        Assert.assertFalse(NumberUtils.isNumber("12-"));
        Assert.assertFalse(NumberUtils.isNumber("12+"));
        Assert.assertFalse(NumberUtils.isNumber("."));
        Assert.assertFalse(NumberUtils.isNumber("-."));
    }
}