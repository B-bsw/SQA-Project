package org.joda.time.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.junit.Assert;
import org.junit.Test;

public class FieldUtilsTest {

    // -----------------------------------------------------------------------
    // Constructor Test
    // -----------------------------------------------------------------------

    @Test
    public void constructor_shouldBePrivateAndCallableViaReflection() throws Exception {
        Constructor constructor = FieldUtils.class.getDeclaredConstructor(new Class[0]);
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof FieldUtils);
    }

    // -----------------------------------------------------------------------
    // safeNegate(int)
    // -----------------------------------------------------------------------

    @Test
    public void safeNegate_givenZero_shouldReturnZero() {
        Assert.assertEquals(0, FieldUtils.safeNegate(0));
    }

    @Test
    public void safeNegate_givenPositiveValue_shouldReturnNegative() {
        Assert.assertEquals(-1, FieldUtils.safeNegate(1));
        Assert.assertEquals(-42, FieldUtils.safeNegate(42));
        Assert.assertEquals(-Integer.MAX_VALUE, FieldUtils.safeNegate(Integer.MAX_VALUE));
    }

    @Test
    public void safeNegate_givenNegativeValue_shouldReturnPositive() {
        Assert.assertEquals(1, FieldUtils.safeNegate(-1));
        Assert.assertEquals(42, FieldUtils.safeNegate(-42));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeNegate(Integer.MIN_VALUE + 1));
    }

    @Test(expected = ArithmeticException.class)
    public void safeNegate_givenIntegerMinValue_shouldThrowArithmeticException() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeAdd(int, int)
    // -----------------------------------------------------------------------

    @Test
    public void safeAddInt_givenNormalInputs_shouldReturnSum() {
        Assert.assertEquals(5, FieldUtils.safeAdd(2, 3));
        Assert.assertEquals(-5, FieldUtils.safeAdd(-2, -3));
        Assert.assertEquals(1, FieldUtils.safeAdd(3, -2));
        Assert.assertEquals(-1, FieldUtils.safeAdd(-3, 2));
        Assert.assertEquals(0, FieldUtils.safeAdd(0, 0));
        Assert.assertEquals(7, FieldUtils.safeAdd(7, 0));
        Assert.assertEquals(7, FieldUtils.safeAdd(0, 7));
    }

    @Test
    public void safeAddInt_givenBoundaryValuesWithinRange_shouldSucceed() {
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE, 0));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeAdd(Integer.MIN_VALUE, 0));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE - 1, 1));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeAdd(Integer.MIN_VALUE + 1, -1));
        Assert.assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddInt_givenPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddInt_givenBothPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddInt_givenNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddInt_givenBothNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeAdd(long, long)
    // -----------------------------------------------------------------------

    @Test
    public void safeAddLong_givenNormalInputs_shouldReturnSum() {
        Assert.assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
        Assert.assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L));
        Assert.assertEquals(1L, FieldUtils.safeAdd(3L, -2L));
        Assert.assertEquals(-1L, FieldUtils.safeAdd(-3L, 2L));
        Assert.assertEquals(0L, FieldUtils.safeAdd(0L, 0L));
        Assert.assertEquals(7L, FieldUtils.safeAdd(7L, 0L));
        Assert.assertEquals(7L, FieldUtils.safeAdd(0L, 7L));
    }

    @Test
    public void safeAddLong_givenBoundaryValuesWithinRange_shouldSucceed() {
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeAdd(Long.MAX_VALUE, 0L));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeAdd(Long.MIN_VALUE, 0L));
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeAdd(Long.MAX_VALUE - 1L, 1L));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeAdd(Long.MIN_VALUE + 1L, -1L));
        Assert.assertEquals(-1L, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLong_givenPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLong_givenBothPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLong_givenNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLong_givenBothNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeSubtract(long, long)
    // -----------------------------------------------------------------------

    @Test
    public void safeSubtractLong_givenNormalInputs_shouldReturnDifference() {
        Assert.assertEquals(1L, FieldUtils.safeSubtract(3L, 2L));
        Assert.assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L));
        Assert.assertEquals(5L, FieldUtils.safeSubtract(2L, -3L));
        Assert.assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L));
        Assert.assertEquals(0L, FieldUtils.safeSubtract(0L, 0L));
        Assert.assertEquals(7L, FieldUtils.safeSubtract(7L, 0L));
        Assert.assertEquals(-7L, FieldUtils.safeSubtract(0L, 7L));
    }

    @Test
    public void safeSubtractLong_givenBoundaryValuesWithinRange_shouldSucceed() {
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeSubtract(Long.MAX_VALUE, 0L));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeSubtract(Long.MIN_VALUE, 0L));
        Assert.assertEquals(Long.MAX_VALUE - 1L, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L));
        Assert.assertEquals(Long.MIN_VALUE + 1L, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L));
        Assert.assertEquals(0L, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE));
        Assert.assertEquals(0L, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtractLong_givenPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtractLong_givenNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtractLong_givenZeroMinusMinValue_shouldThrowArithmeticException() {
        FieldUtils.safeSubtract(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtractLong_givenMaxValueMinusMinValue_shouldThrowArithmeticException() {
        FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeMultiply(int, int)
    // -----------------------------------------------------------------------

    @Test
    public void safeMultiplyInt_givenNormalInputs_shouldReturnProduct() {
        Assert.assertEquals(6, FieldUtils.safeMultiply(2, 3));
        Assert.assertEquals(-6, FieldUtils.safeMultiply(-2, 3));
        Assert.assertEquals(-6, FieldUtils.safeMultiply(2, -3));
        Assert.assertEquals(6, FieldUtils.safeMultiply(-2, -3));
        Assert.assertEquals(0, FieldUtils.safeMultiply(0, 5));
        Assert.assertEquals(0, FieldUtils.safeMultiply(5, 0));
        Assert.assertEquals(5, FieldUtils.safeMultiply(1, 5));
        Assert.assertEquals(5, FieldUtils.safeMultiply(5, 1));
        Assert.assertEquals(-5, FieldUtils.safeMultiply(-1, 5));
        Assert.assertEquals(-5, FieldUtils.safeMultiply(5, -1));
    }

    @Test
    public void safeMultiplyInt_givenBoundaryValuesWithinRange_shouldSucceed() {
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiply(Integer.MAX_VALUE, 1));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiply(Integer.MIN_VALUE, 1));
        Assert.assertEquals(-Integer.MAX_VALUE, FieldUtils.safeMultiply(Integer.MAX_VALUE, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyInt_givenPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyInt_givenNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyInt_givenBothNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyInt_givenPositiveAndNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, -2);
    }

    // -----------------------------------------------------------------------
    // safeMultiply(long, int)
    // -----------------------------------------------------------------------

    @Test
    public void safeMultiplyLongInt_givenSpecialCases_shouldReturnCorrectValues() {
        // val2 == -1
        Assert.assertEquals(-5L, FieldUtils.safeMultiply(5L, -1));
        Assert.assertEquals(5L, FieldUtils.safeMultiply(-5L, -1));
        Assert.assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1));

        // val2 == 0
        Assert.assertEquals(0L, FieldUtils.safeMultiply(5L, 0));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(Long.MAX_VALUE, 0));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(Long.MIN_VALUE, 0));

        // val2 == 1
        Assert.assertEquals(5L, FieldUtils.safeMultiply(5L, 1));
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1));
    }

    @Test
    public void safeMultiplyLongInt_givenNormalInputs_shouldReturnProduct() {
        Assert.assertEquals(10L, FieldUtils.safeMultiply(5L, 2));
        Assert.assertEquals(-10L, FieldUtils.safeMultiply(5L, -2));
        Assert.assertEquals(-10L, FieldUtils.safeMultiply(-5L, 2));
        Assert.assertEquals(10L, FieldUtils.safeMultiply(-5L, -2));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongInt_givenPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongInt_givenNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongInt_givenPositiveValueNegativeMultiplierOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, -2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongInt_givenNegativeValueNegativeMultiplierOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -2);
    }

    // -----------------------------------------------------------------------
    // safeMultiply(long, long)
    // -----------------------------------------------------------------------

    @Test
    public void safeMultiplyLongLong_givenSpecialCases_shouldReturnCorrectValues() {
        // val2 == 1
        Assert.assertEquals(12345L, FieldUtils.safeMultiply(12345L, 1L));
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L));

        // val1 == 1
        Assert.assertEquals(12345L, FieldUtils.safeMultiply(1L, 12345L));
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(1L, Long.MAX_VALUE));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(1L, Long.MIN_VALUE));

        // val1 == 0 or val2 == 0
        Assert.assertEquals(0L, FieldUtils.safeMultiply(0L, 5L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(5L, 0L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(0L, Long.MAX_VALUE));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(Long.MAX_VALUE, 0L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(0L, Long.MIN_VALUE));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(Long.MIN_VALUE, 0L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(0L, 0L));
    }

    @Test
    public void safeMultiplyLongLong_givenNormalInputs_shouldReturnProduct() {
        Assert.assertEquals(12L, FieldUtils.safeMultiply(3L, 4L));
        Assert.assertEquals(-12L, FieldUtils.safeMultiply(-3L, 4L));
        Assert.assertEquals(-12L, FieldUtils.safeMultiply(3L, -4L));
        Assert.assertEquals(12L, FieldUtils.safeMultiply(-3L, -4L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_givenPositiveOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_givenNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_givenVal1MinValueAndVal2MinusOne_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_givenVal1MinusOneAndVal2MinValue_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyLongLong_givenBothNegativeOverflow_shouldThrowArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE / 2L, -3L);
    }

    // -----------------------------------------------------------------------
    // safeToInt(long)
    // -----------------------------------------------------------------------

    @Test
    public void safeToInt_givenValueWithinIntRange_shouldReturnIntValue() {
        Assert.assertEquals(0, FieldUtils.safeToInt(0L));
        Assert.assertEquals(12345, FieldUtils.safeToInt(12345L));
        Assert.assertEquals(-12345, FieldUtils.safeToInt(-12345L));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt((long) Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt((long) Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeToInt_givenValueGreaterThanIntMax_shouldThrowArithmeticException() {
        FieldUtils.safeToInt(((long) Integer.MAX_VALUE) + 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeToInt_givenLongMax_shouldThrowArithmeticException() {
        FieldUtils.safeToInt(Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void safeToInt_givenValueLessThanIntMin_shouldThrowArithmeticException() {
        FieldUtils.safeToInt(((long) Integer.MIN_VALUE) - 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeToInt_givenLongMin_shouldThrowArithmeticException() {
        FieldUtils.safeToInt(Long.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // safeMultiplyToInt(long, long)
    // -----------------------------------------------------------------------

    @Test
    public void safeMultiplyToInt_givenInputsResultingInIntRange_shouldReturnIntValue() {
        Assert.assertEquals(6, FieldUtils.safeMultiplyToInt(2L, 3L));
        Assert.assertEquals(-6, FieldUtils.safeMultiplyToInt(-2L, 3L));
        Assert.assertEquals(0, FieldUtils.safeMultiplyToInt(0L, 100L));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiplyToInt((long) Integer.MAX_VALUE, 1L));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiplyToInt((long) Integer.MIN_VALUE, 1L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyToInt_givenInputsOverflowingLong_shouldThrowArithmeticException() {
        FieldUtils.safeMultiplyToInt(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyToInt_givenInputsFittingLongButOverflowingInt_shouldThrowArithmeticException() {
        FieldUtils.safeMultiplyToInt((long) Integer.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyToInt_givenInputsFittingLongButUnderflowingInt_shouldThrowArithmeticException() {
        FieldUtils.safeMultiplyToInt((long) Integer.MIN_VALUE, 2L);
    }

    // -----------------------------------------------------------------------
    // verifyValueBounds(DateTimeField, int, int, int)
    // -----------------------------------------------------------------------

    @Test
    public void verifyValueBounds_givenDateTimeFieldAndValueWithinBounds_shouldNotThrow() {
        DateTimeField field = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), null);
        FieldUtils.verifyValueBounds(field, 5, 1, 10);
        FieldUtils.verifyValueBounds(field, 1, 1, 10);
        FieldUtils.verifyValueBounds(field, 10, 1, 10);
        FieldUtils.verifyValueBounds(field, 0, 0, 0);
    }

    @Test
    public void verifyValueBounds_givenDateTimeFieldAndValueBelowLowerBound_shouldThrowIllegalFieldValueException() {
        DateTimeField field = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), null);
        try {
            FieldUtils.verifyValueBounds(field, 0, 1, 10);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertEquals(DateTimeFieldType.year(), ex.getDateTimeFieldType());
            Assert.assertEquals(Integer.valueOf(0), ex.getIllegalNumberValue());
            Assert.assertEquals(Integer.valueOf(1), ex.getLowerBound());
            Assert.assertEquals(Integer.valueOf(10), ex.getUpperBound());
        }
    }

    @Test
    public void verifyValueBounds_givenDateTimeFieldAndValueAboveUpperBound_shouldThrowIllegalFieldValueException() {
        DateTimeField field = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), null);
        try {
            FieldUtils.verifyValueBounds(field, 11, 1, 10);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertEquals(DateTimeFieldType.year(), ex.getDateTimeFieldType());
            Assert.assertEquals(Integer.valueOf(11), ex.getIllegalNumberValue());
            Assert.assertEquals(Integer.valueOf(1), ex.getLowerBound());
            Assert.assertEquals(Integer.valueOf(10), ex.getUpperBound());
        }
    }

    // -----------------------------------------------------------------------
    // verifyValueBounds(DateTimeFieldType, int, int, int)
    // -----------------------------------------------------------------------

    @Test
    public void verifyValueBounds_givenDateTimeFieldTypeAndValueWithinBounds_shouldNotThrow() {
        DateTimeFieldType fieldType = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(fieldType, 15, 1, 31);
        FieldUtils.verifyValueBounds(fieldType, 1, 1, 31);
        FieldUtils.verifyValueBounds(fieldType, 31, 1, 31);
    }

    @Test
    public void verifyValueBounds_givenDateTimeFieldTypeAndValueBelowLowerBound_shouldThrowIllegalFieldValueException() {
        DateTimeFieldType fieldType = DateTimeFieldType.dayOfMonth();
        try {
            FieldUtils.verifyValueBounds(fieldType, 0, 1, 31);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertEquals(DateTimeFieldType.dayOfMonth(), ex.getDateTimeFieldType());
            Assert.assertEquals(Integer.valueOf(0), ex.getIllegalNumberValue());
            Assert.assertEquals(Integer.valueOf(1), ex.getLowerBound());
            Assert.assertEquals(Integer.valueOf(31), ex.getUpperBound());
        }
    }

    @Test
    public void verifyValueBounds_givenDateTimeFieldTypeAndValueAboveUpperBound_shouldThrowIllegalFieldValueException() {
        DateTimeFieldType fieldType = DateTimeFieldType.dayOfMonth();
        try {
            FieldUtils.verifyValueBounds(fieldType, 32, 1, 31);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertEquals(DateTimeFieldType.dayOfMonth(), ex.getDateTimeFieldType());
            Assert.assertEquals(Integer.valueOf(32), ex.getIllegalNumberValue());
            Assert.assertEquals(Integer.valueOf(1), ex.getLowerBound());
            Assert.assertEquals(Integer.valueOf(31), ex.getUpperBound());
        }
    }

    // -----------------------------------------------------------------------
    // verifyValueBounds(String, int, int, int)
    // -----------------------------------------------------------------------

    @Test
    public void verifyValueBounds_givenFieldNameAndValueWithinBounds_shouldNotThrow() {
        FieldUtils.verifyValueBounds("monthOfYear", 6, 1, 12);
        FieldUtils.verifyValueBounds("monthOfYear", 1, 1, 12);
        FieldUtils.verifyValueBounds("monthOfYear", 12, 1, 12);
    }

    @Test
    public void verifyValueBounds_givenFieldNameAndValueBelowLowerBound_shouldThrowIllegalFieldValueException() {
        try {
            FieldUtils.verifyValueBounds("monthOfYear", 0, 1, 12);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertEquals("monthOfYear", ex.getFieldName());
            Assert.assertEquals(Integer.valueOf(0), ex.getIllegalNumberValue());
            Assert.assertEquals(Integer.valueOf(1), ex.getLowerBound());
            Assert.assertEquals(Integer.valueOf(12), ex.getUpperBound());
        }
    }

    @Test
    public void verifyValueBounds_givenFieldNameAndValueAboveUpperBound_shouldThrowIllegalFieldValueException() {
        try {
            FieldUtils.verifyValueBounds("monthOfYear", 13, 1, 12);
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertEquals("monthOfYear", ex.getFieldName());
            Assert.assertEquals(Integer.valueOf(13), ex.getIllegalNumberValue());
            Assert.assertEquals(Integer.valueOf(1), ex.getLowerBound());
            Assert.assertEquals(Integer.valueOf(12), ex.getUpperBound());
        }
    }

    // -----------------------------------------------------------------------
    // getWrappedValue(int, int, int, int)
    // -----------------------------------------------------------------------

    @Test
    public void getWrappedValue_givenFourArgsWithinRange_shouldReturnWrappedValue() {
        Assert.assertEquals(3, FieldUtils.getWrappedValue(1, 2, 1, 10));
        Assert.assertEquals(10, FieldUtils.getWrappedValue(5, 5, 1, 10));
        Assert.assertEquals(1, FieldUtils.getWrappedValue(5, 6, 1, 10));
        Assert.assertEquals(10, FieldUtils.getWrappedValue(1, -1, 1, 10));
        Assert.assertEquals(9, FieldUtils.getWrappedValue(1, -2, 1, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWrappedValue_givenFourArgsMinEqualMax_shouldThrowIllegalArgumentException() {
        FieldUtils.getWrappedValue(5, 1, 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWrappedValue_givenFourArgsMinGreaterThanMax_shouldThrowIllegalArgumentException() {
        FieldUtils.getWrappedValue(5, 1, 10, 5);
    }

    // -----------------------------------------------------------------------
    // getWrappedValue(int, int, int)
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void getWrappedValue_givenThreeArgsMinEqualMax_shouldThrowIllegalArgumentException() {
        FieldUtils.getWrappedValue(5, 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWrappedValue_givenThreeArgsMinGreaterThanMax_shouldThrowIllegalArgumentException() {
        FieldUtils.getWrappedValue(5, 11, 10);
    }

    @Test
    public void getWrappedValue_givenValueAlreadyInRange_shouldReturnSameValue() {
        Assert.assertEquals(1, FieldUtils.getWrappedValue(1, 1, 10));
        Assert.assertEquals(5, FieldUtils.getWrappedValue(5, 1, 10));
        Assert.assertEquals(10, FieldUtils.getWrappedValue(10, 1, 10));
    }

    @Test
    public void getWrappedValue_givenValueGreaterThanMax_shouldWrapCorrectly() {
        Assert.assertEquals(1, FieldUtils.getWrappedValue(11, 1, 10));
        Assert.assertEquals(2, FieldUtils.getWrappedValue(12, 1, 10));
        Assert.assertEquals(10, FieldUtils.getWrappedValue(20, 1, 10));
        Assert.assertEquals(1, FieldUtils.getWrappedValue(21, 1, 10));
    }

    @Test
    public void getWrappedValue_givenValueBelowMinAndRemByRangeIsZero_shouldReturnMinValue() {
        // minValue = 5, maxValue = 10 -> wrapRange = 6
        // value = -1 -> value - minValue = -6
        // remByRange = (-(-6)) % 6 = 0 -> returns minValue (5)
        Assert.assertEquals(5, FieldUtils.getWrappedValue(-1, 5, 10));
        Assert.assertEquals(5, FieldUtils.getWrappedValue(-7, 5, 10));
    }

    @Test
    public void getWrappedValue_givenValueBelowMinAndRemByRangeNonZero_shouldWrapCorrectly() {
        // minValue = 5, maxValue = 10 -> wrapRange = 6
        // value = 4 -> value - minValue = -1
        // remByRange = (-(-1)) % 6 = 1 -> returns (6 - 1) + 5 = 10
        Assert.assertEquals(10, FieldUtils.getWrappedValue(4, 5, 10));
        // value = 3 -> value - minValue = -2
        // remByRange = (-(-2)) % 6 = 2 -> returns (6 - 2) + 5 = 9
        Assert.assertEquals(9, FieldUtils.getWrappedValue(3, 5, 10));
        // value = 0 -> value - minValue = -5
        // remByRange = 5 % 6 = 5 -> returns (6 - 5) + 5 = 6
        Assert.assertEquals(6, FieldUtils.getWrappedValue(0, 5, 10));
    }

    @Test
    public void getWrappedValue_givenZeroBasedRange_shouldWrapCorrectly() {
        // minValue = 0, maxValue = 5 -> wrapRange = 6
        Assert.assertEquals(0, FieldUtils.getWrappedValue(0, 0, 5));
        Assert.assertEquals(5, FieldUtils.getWrappedValue(5, 0, 5));
        Assert.assertEquals(0, FieldUtils.getWrappedValue(6, 0, 5));
        Assert.assertEquals(1, FieldUtils.getWrappedValue(7, 0, 5));
        Assert.assertEquals(5, FieldUtils.getWrappedValue(-1, 0, 5));
        Assert.assertEquals(0, FieldUtils.getWrappedValue(-6, 0, 5));
    }

    // -----------------------------------------------------------------------
    // equals(Object, Object)
    // -----------------------------------------------------------------------

    @Test
    public void equals_givenBothNull_shouldReturnTrue() {
        Assert.assertTrue(FieldUtils.equals(null, null));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        String str = "test";
        Assert.assertTrue(FieldUtils.equals(str, str));
    }

    @Test
    public void equals_givenFirstNullSecondNonNull_shouldReturnFalse() {
        Assert.assertFalse(FieldUtils.equals(null, "test"));
    }

    @Test
    public void equals_givenFirstNonNullSecondNull_shouldReturnFalse() {
        Assert.assertFalse(FieldUtils.equals("test", null));
    }

    @Test
    public void equals_givenDifferentInstancesWithEqualValues_shouldReturnTrue() {
        String s1 = new String("hello");
        String s2 = new String("hello");
        Assert.assertNotSame(s1, s2);
        Assert.assertTrue(FieldUtils.equals(s1, s2));
    }

    @Test
    public void equals_givenDifferentInstancesWithDifferentValues_shouldReturnFalse() {
        Assert.assertFalse(FieldUtils.equals("hello", "world"));
        Assert.assertFalse(FieldUtils.equals(Integer.valueOf(1), Integer.valueOf(2)));
    }
}