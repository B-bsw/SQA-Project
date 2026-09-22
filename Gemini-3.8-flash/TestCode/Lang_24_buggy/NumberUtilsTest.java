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
    public void constants_givenPredefinedValues_shouldMatchExpected() {
        Assert.assertEquals(new Long(0L), NumberUtils.LONG_ZERO);
        Assert.assertEquals(new Long(1L), NumberUtils.LONG_ONE);
        Assert.assertEquals(new Long(-1L), NumberUtils.LONG_MINUS_ONE);
        Assert.assertEquals(new Integer(0), NumberUtils.INTEGER_ZERO);
        Assert.assertEquals(new Integer(1), NumberUtils.INTEGER_ONE);
        Assert.assertEquals(new Integer(-1), NumberUtils.INTEGER_MINUS_ONE);
        Assert.assertEquals(new Short((short) 0), NumberUtils.SHORT_ZERO);
        Assert.assertEquals(new Short((short) 1), NumberUtils.SHORT_ONE);
        Assert.assertEquals(new Short((short) -1), NumberUtils.SHORT_MINUS_ONE);
        Assert.assertEquals(Byte.valueOf((byte) 0), NumberUtils.BYTE_ZERO);
        Assert.assertEquals(Byte.valueOf((byte) 1), NumberUtils.BYTE_ONE);
        Assert.assertEquals(Byte.valueOf((byte) -1), NumberUtils.BYTE_MINUS_ONE);
        Assert.assertEquals(new Double(0.0d), NumberUtils.DOUBLE_ZERO);
        Assert.assertEquals(new Double(1.0d), NumberUtils.DOUBLE_ONE);
        Assert.assertEquals(new Double(-1.0d), NumberUtils.DOUBLE_MINUS_ONE);
        Assert.assertEquals(new Float(0.0f), NumberUtils.FLOAT_ZERO);
        Assert.assertEquals(new Float(1.0f), NumberUtils.FLOAT_ONE);
        Assert.assertEquals(new Float(-1.0f), NumberUtils.FLOAT_MINUS_ONE);
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
        Assert.assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void toLong_givenValidString_shouldReturnParsedLong() {
        Assert.assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        Assert.assertEquals(-1234567890123L, NumberUtils.toLong("-1234567890123"));
        Assert.assertEquals(456L, NumberUtils.toLong("456", 10L));
    }

    @Test
    public void toLong_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(5L, NumberUtils.toLong(null, 5L));
        Assert.assertEquals(0L, NumberUtils.toLong("xyz"));
        Assert.assertEquals(5L, NumberUtils.toLong("xyz", 5L));
    }

    @Test
    public void toFloat_givenValidString_shouldReturnParsedFloat() {
        Assert.assertEquals(12.34f, NumberUtils.toFloat("12.34"), 0.0001f);
        Assert.assertEquals(-12.34f, NumberUtils.toFloat("-12.34"), 0.0001f);
        Assert.assertEquals(5.67f, NumberUtils.toFloat("5.67", 1.23f), 0.0001f);
    }

    @Test
    public void toFloat_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        Assert.assertEquals(3.4f, NumberUtils.toFloat(null, 3.4f), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("not-a-float"), 0.0001f);
        Assert.assertEquals(3.4f, NumberUtils.toFloat("not-a-float", 3.4f), 0.0001f);
    }

    @Test
    public void toDouble_givenValidString_shouldReturnParsedDouble() {
        Assert.assertEquals(12.3456d, NumberUtils.toDouble("12.3456"), 0.00001d);
        Assert.assertEquals(-12.3456d, NumberUtils.toDouble("-12.3456"), 0.00001d);
        Assert.assertEquals(5.67d, NumberUtils.toDouble("5.67", 1.23d), 0.00001d);
    }

    @Test
    public void toDouble_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.00001d);
        Assert.assertEquals(3.4d, NumberUtils.toDouble(null, 3.4d), 0.00001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("not-a-double"), 0.00001d);
        Assert.assertEquals(3.4d, NumberUtils.toDouble("not-a-double", 3.4d), 0.00001d);
    }

    @Test
    public void toByte_givenValidString_shouldReturnParsedByte() {
        Assert.assertEquals((byte) 12, NumberUtils.toByte("12"));
        Assert.assertEquals((byte) -12, NumberUtils.toByte("-12"));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("5", (byte) 1));
    }

    @Test
    public void toByte_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
        Assert.assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("999"));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
    }

    @Test
    public void toShort_givenValidString_shouldReturnParsedShort() {
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) -1234, NumberUtils.toShort("-1234"));
        Assert.assertEquals((short) 5, NumberUtils.toShort("5", (short) 1));
    }

    @Test
    public void toShort_givenNullOrInvalidString_shouldReturnDefaultValue() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
        Assert.assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        Assert.assertEquals((short) 0, NumberUtils.toShort("999999"));
        Assert.assertEquals((short) 5, NumberUtils.toShort("invalid", (short) 5));
    }

    @Test
    public void createNumber_givenNull_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenEmptyOrBlank_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenWhitespace_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void createNumber_givenStartsWithDoubleDash_shouldReturnNull() {
        Assert.assertNull(NumberUtils.createNumber("--123"));
    }

    @Test
    public void createNumber_givenHexadecimal_shouldReturnInteger() {
        Assert.assertEquals(Integer.valueOf(16), NumberUtils.createNumber("0x10"));
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        Assert.assertEquals(Integer.valueOf(-16), NumberUtils.createNumber("-0x10"));
    }

    @Test
    public void createNumber_givenTrailingL_shouldReturnLongOrBigInteger() {
        Assert.assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        Assert.assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));
        Assert.assertEquals(new BigInteger("-9223372036854775809"), NumberUtils.createNumber("-9223372036854775809L"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLongFormat_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("12.34L");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidLongNonDigits_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("12aL");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidNegativeLongNonDigits_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("-12aL");
    }

    @Test
    public void createNumber_givenTrailingF_shouldReturnFloatOrDoubleOrBigDecimal() {
        Assert.assertEquals(Float.valueOf(12.34f), NumberUtils.createNumber("12.34f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0f"));
        Assert.assertEquals(Double.valueOf("1e39"), NumberUtils.createNumber("1e39f"));
    }

    @Test
    public void createNumber_givenTrailingD_shouldReturnDoubleOrBigDecimal() {
        Assert.assertEquals(Double.valueOf(12.34d), NumberUtils.createNumber("12.34d"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0d"));
        Assert.assertEquals(new BigDecimal("1e309"), NumberUtils.createNumber("1e309d"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenUnknownTrailingLetter_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("123z");
    }

    @Test
    public void createNumber_givenIntegerOrLongOrBigIntegerStrings_shouldReturnCorrespondingType() {
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        Assert.assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        Assert.assertEquals(Long.valueOf(3000000000L), NumberUtils.createNumber("3000000000"));
        Assert.assertEquals(new BigInteger("922337203685477580812345"), NumberUtils.createNumber("922337203685477580812345"));
    }

    @Test
    public void createNumber_givenFloatingPointStringsWithoutQualifier_shouldReturnFloatDoubleOrBigDecimal() {
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        Assert.assertEquals(Double.valueOf("1e39"), NumberUtils.createNumber("1e39"));
        Assert.assertEquals(new BigDecimal("1e309"), NumberUtils.createNumber("1e309"));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenExpBeforeDecPos_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenDoubleExp_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("1e2E3");
    }

    @Test
    public void createNumber_givenDecAndExponentValid_shouldParseCorrectly() {
        Assert.assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3"));
        Assert.assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3f"));
        Assert.assertEquals(Double.valueOf(1.2e3d), NumberUtils.createNumber("1.2e3d"));
    }

    @Test
    public void createNumber_givenOnlyDecimalPoint_shouldParseCorrectly() {
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber(".0"));
        Assert.assertEquals(Float.valueOf(1.0f), NumberUtils.createNumber("1."));
    }

    @Test(expected = NumberFormatException.class)
    public void createNumber_givenInvalidNumericFormat_shouldThrowNumberFormatException() {
        NumberUtils.createNumber("..123");
    }

    @Test
    public void createFloat_givenNullAndValid_shouldHandleCorrectly() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(12.34f), NumberUtils.createFloat("12.34"));
    }

    @Test(expected = NumberFormatException.class)
    public void createFloat_givenInvalid_shouldThrowNumberFormatException() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void createDouble_givenNullAndValid_shouldHandleCorrectly() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(12.3456d), NumberUtils.createDouble("12.3456"));
    }

    @Test(expected = NumberFormatException.class)
    public void createDouble_givenInvalid_shouldThrowNumberFormatException() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void createInteger_givenNullAndValid_shouldHandleCorrectly() {
        Assert.assertNull(NumberUtils.createInteger(null));
        Assert.assertEquals(Integer.valueOf(1234), NumberUtils.createInteger("1234"));
        Assert.assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
    }

    @Test(expected = NumberFormatException.class)
    public void createInteger_givenInvalid_shouldThrowNumberFormatException() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void createLong_givenNullAndValid_shouldHandleCorrectly() {
        Assert.assertNull(NumberUtils.createLong(null));
        Assert.assertEquals(Long.valueOf(1234567890L), NumberUtils.createLong("1234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void createLong_givenInvalid_shouldThrowNumberFormatException() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void createBigInteger_givenNullAndValid_shouldHandleCorrectly() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigInteger_givenInvalid_shouldThrowNumberFormatException() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void createBigDecimal_givenNullAndValid_shouldHandleCorrectly() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("12345.67890"), NumberUtils.createBigDecimal("12345.67890"));
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenBlankString_shouldThrowNumberFormatException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void createBigDecimal_givenInvalid_shouldThrowNumberFormatException() {
        NumberUtils.createBigDecimal("abc");
    }

    @Test
    public void min_longArray_givenValidArray_shouldReturnMinimum() {
        long[] array = new long[] { 5L, 2L, 8L, -1L, 3L };
        Assert.assertEquals(-1L, NumberUtils.min(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_longArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_longArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void min_intArray_givenValidArray_shouldReturnMinimum() {
        int[] array = new int[] { 5, 2, 8, -1, 3 };
        Assert.assertEquals(-1, NumberUtils.min(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_intArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_intArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void min_shortArray_givenValidArray_shouldReturnMinimum() {
        short[] array = new short[] { 5, 2, 8, -1, 3 };
        Assert.assertEquals((short) -1, NumberUtils.min(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_shortArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_shortArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void min_byteArray_givenValidArray_shouldReturnMinimum() {
        byte[] array = new byte[] { 5, 2, 8, -1, 3 };
        Assert.assertEquals((byte) -1, NumberUtils.min(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_byteArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_byteArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void min_doubleArray_givenValidArray_shouldReturnMinimum() {
        double[] array = new double[] { 5.0d, 2.0d, 8.0d, -1.0d, 3.0d };
        Assert.assertEquals(-1.0d, NumberUtils.min(array), 0.0001d);
        double[] nanArray = new double[] { 5.0d, Double.NaN, 2.0d };
        Assert.assertTrue(Double.isNaN(NumberUtils.min(nanArray)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_doubleArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_doubleArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void min_floatArray_givenValidArray_shouldReturnMinimum() {
        float[] array = new float[] { 5.0f, 2.0f, 8.0f, -1.0f, 3.0f };
        Assert.assertEquals(-1.0f, NumberUtils.min(array), 0.0001f);
        float[] nanArray = new float[] { 5.0f, Float.NaN, 2.0f };
        Assert.assertTrue(Float.isNaN(NumberUtils.min(nanArray)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_floatArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void min_floatArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void max_longArray_givenValidArray_shouldReturnMaximum() {
        long[] array = new long[] { 5L, 2L, 8L, -1L, 3L };
        Assert.assertEquals(8L, NumberUtils.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_longArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_longArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void max_intArray_givenValidArray_shouldReturnMaximum() {
        int[] array = new int[] { 5, 2, 8, -1, 3 };
        Assert.assertEquals(8, NumberUtils.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_intArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_intArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void max_shortArray_givenValidArray_shouldReturnMaximum() {
        short[] array = new short[] { 5, 2, 8, -1, 3 };
        Assert.assertEquals((short) 8, NumberUtils.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_shortArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_shortArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void max_byteArray_givenValidArray_shouldReturnMaximum() {
        byte[] array = new byte[] { 5, 2, 8, -1, 3 };
        Assert.assertEquals((byte) 8, NumberUtils.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_byteArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_byteArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void max_doubleArray_givenValidArray_shouldReturnMaximum() {
        double[] array = new double[] { 5.0d, 2.0d, 8.0d, -1.0d, 3.0d };
        Assert.assertEquals(8.0d, NumberUtils.max(array), 0.0001d);
        double[] nanArray = new double[] { 5.0d, Double.NaN, 2.0d };
        Assert.assertTrue(Double.isNaN(NumberUtils.max(nanArray)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_doubleArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_doubleArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void max_floatArray_givenValidArray_shouldReturnMaximum() {
        float[] array = new float[] { 5.0f, 2.0f, 8.0f, -1.0f, 3.0f };
        Assert.assertEquals(8.0f, NumberUtils.max(array), 0.0001f);
        float[] nanArray = new float[] { 5.0f, Float.NaN, 2.0f };
        Assert.assertTrue(Float.isNaN(NumberUtils.max(nanArray)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_floatArray_givenNull_shouldThrowIllegalArgumentException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void max_floatArray_givenEmpty_shouldThrowIllegalArgumentException() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void min_threeLongs_givenValues_shouldReturnSmallest() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void min_threeInts_givenValues_shouldReturnSmallest() {
        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
        Assert.assertEquals(1, NumberUtils.min(2, 1, 3));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void min_threeShorts_givenValues_shouldReturnSmallest() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void min_threeBytes_givenValues_shouldReturnSmallest() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void min_threeDoubles_givenValues_shouldReturnSmallest() {
        Assert.assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);
    }

    @Test
    public void min_threeFloats_givenValues_shouldReturnSmallest() {
        Assert.assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
    }

    @Test
    public void max_threeLongs_givenValues_shouldReturnLargest() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
    }

    @Test
    public void max_threeInts_givenValues_shouldReturnLargest() {
        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
        Assert.assertEquals(3, NumberUtils.max(3, 1, 2));
    }

    @Test
    public void max_threeShorts_givenValues_shouldReturnLargest() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void max_threeBytes_givenValues_shouldReturnLargest() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void max_threeDoubles_givenValues_shouldReturnLargest() {
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        Assert.assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), 0.0001d);
    }

    @Test
    public void max_threeFloats_givenValues_shouldReturnLargest() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        Assert.assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    @Test
    public void isDigits_givenValidAndInvalidStrings_shouldReturnExpected() {
        Assert.assertFalse(NumberUtils.isDigits(null));
        Assert.assertFalse(NumberUtils.isDigits(""));
        Assert.assertTrue(NumberUtils.isDigits("12345"));
        Assert.assertFalse(NumberUtils.isDigits("123a45"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
        Assert.assertFalse(NumberUtils.isDigits("12.34"));
    }

    @Test
    public void isNumber_givenNullOrEmpty_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void isNumber_givenHexadecimalStrings_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("0x123"));
        Assert.assertTrue(NumberUtils.isNumber("0xabcdef"));
        Assert.assertTrue(NumberUtils.isNumber("0xABCDEF"));
        Assert.assertTrue(NumberUtils.isNumber("-0x123"));
        Assert.assertTrue(NumberUtils.isNumber("-0xABCDEF"));
        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("-0x"));
        Assert.assertFalse(NumberUtils.isNumber("0x123g"));
        Assert.assertFalse(NumberUtils.isNumber("-0x123g"));
    }

    @Test
    public void isNumber_givenDecimalStrings_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
        Assert.assertTrue(NumberUtils.isNumber("-123"));
        Assert.assertTrue(NumberUtils.isNumber("12.34"));
        Assert.assertTrue(NumberUtils.isNumber("-12.34"));
        Assert.assertTrue(NumberUtils.isNumber(".5"));
        Assert.assertTrue(NumberUtils.isNumber("-.5"));
        Assert.assertTrue(NumberUtils.isNumber("5."));
        Assert.assertTrue(NumberUtils.isNumber("-5."));
        Assert.assertFalse(NumberUtils.isNumber("."));
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
        Assert.assertFalse(NumberUtils.isNumber("-"));
        Assert.assertFalse(NumberUtils.isNumber("--1"));
    }

    @Test
    public void isNumber_givenScientificNotation_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("1e5"));
        Assert.assertTrue(NumberUtils.isNumber("1E5"));
        Assert.assertTrue(NumberUtils.isNumber("1.2e+5"));
        Assert.assertTrue(NumberUtils.isNumber("1.2E-5"));
        Assert.assertTrue(NumberUtils.isNumber("-1.2e5"));
        Assert.assertFalse(NumberUtils.isNumber("e5"));
        Assert.assertFalse(NumberUtils.isNumber("1e"));
        Assert.assertFalse(NumberUtils.isNumber("1e+"));
        Assert.assertFalse(NumberUtils.isNumber("1e-"));
        Assert.assertFalse(NumberUtils.isNumber("1e5e5"));
        Assert.assertFalse(NumberUtils.isNumber("1e.5"));
    }

    @Test
    public void isNumber_givenTypeQualifiers_shouldValidateCorrectly() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
        Assert.assertTrue(NumberUtils.isNumber("123l"));
        Assert.assertFalse(NumberUtils.isNumber("1e5L"));
        Assert.assertFalse(NumberUtils.isNumber("1.5L"));
        Assert.assertTrue(NumberUtils.isNumber("123f"));
        Assert.assertTrue(NumberUtils.isNumber("123F"));
        Assert.assertTrue(NumberUtils.isNumber("12.3f"));
        Assert.assertTrue(NumberUtils.isNumber("1e5f"));
        Assert.assertTrue(NumberUtils.isNumber("123d"));
        Assert.assertTrue(NumberUtils.isNumber("123D"));
        Assert.assertTrue(NumberUtils.isNumber("12.3d"));
        Assert.assertTrue(NumberUtils.isNumber("1e5d"));
        Assert.assertFalse(NumberUtils.isNumber("d"));
        Assert.assertFalse(NumberUtils.isNumber("L"));
        Assert.assertFalse(NumberUtils.isNumber("f"));
        Assert.assertFalse(NumberUtils.isNumber("123z"));
    }

    @Test
    public void isNumber_givenInvalidSignsAndCharacters_shouldReturnFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1+2"));
        Assert.assertFalse(NumberUtils.isNumber("1-2"));
        Assert.assertFalse(NumberUtils.isNumber("123#"));
    }
}