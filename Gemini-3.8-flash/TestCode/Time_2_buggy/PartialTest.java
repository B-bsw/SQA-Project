package org.joda.time;

import java.util.Locale;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.Assert;
import org.junit.Test;

public class PartialTest {

    // ---------------------------------------------------------
    // Constructor Tests
    // ---------------------------------------------------------

    @Test
    public void constructor_default_shouldCreateEmptyPartial() {
        Partial partial = new Partial();
        Assert.assertEquals(0, partial.size());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), partial.getChronology());
        Assert.assertEquals(0, partial.getFieldTypes().length);
        Assert.assertEquals(0, partial.getValues().length);
    }

    @Test
    public void constructor_withChronology_shouldInitializeWithUTCChronology() {
        Chronology chrono = GregorianChronology.getInstance();
        Partial partial = new Partial(chrono);
        Assert.assertEquals(0, partial.size());
        Assert.assertEquals(chrono.withUTC(), partial.getChronology());
    }

    @Test
    public void constructor_withNullChronology_shouldDefaultToISOUTC() {
        Partial partial = new Partial((Chronology) null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), partial.getChronology());
        Assert.assertEquals(0, partial.size());
    }

    @Test
    public void constructor_typeAndValue_shouldCreateSingleFieldPartial() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Assert.assertEquals(1, partial.size());
        Assert.assertEquals(DateTimeFieldType.year(), partial.getFieldType(0));
        Assert.assertEquals(2020, partial.getValue(0));
        Assert.assertEquals(ISOChronology.getInstanceUTC(), partial.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_typeAndValue_nullType_shouldThrowIllegalArgumentException() {
        new Partial((DateTimeFieldType) null, 2020);
    }

    @Test
    public void constructor_typeValueChronology_shouldInitializeProperly() {
        Chronology chrono = GregorianChronology.getInstance();
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 6, chrono);
        Assert.assertEquals(1, partial.size());
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), partial.getFieldType(0));
        Assert.assertEquals(6, partial.getValue(0));
        Assert.assertEquals(chrono.withUTC(), partial.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_typeValueChronology_nullType_shouldThrowIllegalArgumentException() {
        new Partial(null, 1, ISOChronology.getInstanceUTC());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_typeValueChronology_invalidValue_shouldThrowIllegalArgumentException() {
        new Partial(DateTimeFieldType.monthOfYear(), 13, ISOChronology.getInstanceUTC());
    }

    @Test
    public void constructor_typesAndValues_shouldInitializeProperly() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] {2020, 5, 20};
        Partial partial = new Partial(types, values);

        Assert.assertEquals(3, partial.size());
        Assert.assertArrayEquals(types, partial.getFieldTypes());
        Assert.assertArrayEquals(values, partial.getValues());
    }

    @Test
    public void constructor_emptyArrays_shouldInitializeEmptyPartial() {
        DateTimeFieldType[] types = new DateTimeFieldType[0];
        int[] values = new int[0];
        Partial partial = new Partial(types, values);
        Assert.assertEquals(0, partial.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullTypesArray_shouldThrowIllegalArgumentException() {
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullValuesArray_shouldThrowIllegalArgumentException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_mismatchedArraysLength_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {DateTimeFieldType.year()};
        int[] values = new int[] {2020, 5};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_arrayContainsNull_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {DateTimeFieldType.year(), null};
        int[] values = new int[] {2020, 5};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_orderAscending_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.year()
        };
        int[] values = new int[] {5, 2020};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_sameUnitNoRangeDuplicate_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.year()
        };
        int[] values = new int[] {2020, 2021};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_sameUnitLastHasRangeLoopHasNoRange_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.yearOfEra(),
            DateTimeFieldType.year()
        };
        int[] values = new int[] {2020, 2020};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_sameUnitRangeInvertedOrder_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfYear()
        };
        int[] values = new int[] {1, 1};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_sameUnitSameRangeDuplicate_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] {1, 2};
        new Partial(types, values);
    }

    @Test
    public void constructor_sameUnitValidRangeOrder_shouldInitializeProperly() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] {100, 10};
        Partial partial = new Partial(types, values);
        Assert.assertEquals(2, partial.size());
    }

    @Test
    public void constructor_fromReadablePartial_shouldCopyFieldsAndValues() {
        Partial original = new Partial(DateTimeFieldType.year(), 2020);
        Partial copy = new Partial(original);
        Assert.assertEquals(1, copy.size());
        Assert.assertEquals(original.getFieldType(0), copy.getFieldType(0));
        Assert.assertEquals(original.getValue(0), copy.getValue(0));
        Assert.assertEquals(original.getChronology(), copy.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_fromReadablePartialNull_shouldThrowIllegalArgumentException() {
        new Partial((ReadablePartial) null);
    }

    // ---------------------------------------------------------
    // Field Accessor Tests
    // ---------------------------------------------------------

    @Test
    public void getField_shouldReturnDateTimeFieldInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        DateTimeField field = partial.getField(0, ISOChronology.getInstanceUTC());
        Assert.assertNotNull(field);
        Assert.assertEquals("year", field.getName());
    }

    @Test
    public void getValuesAndTypes_shouldReturnClonedArrays() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        int[] values = partial.getValues();
        values[0] = 1999;
        Assert.assertEquals(2020, partial.getValue(0));

        DateTimeFieldType[] types = partial.getFieldTypes();
        types[0] = DateTimeFieldType.dayOfMonth();
        Assert.assertEquals(DateTimeFieldType.year(), partial.getFieldType(0));
    }

    // ---------------------------------------------------------
    // withChronologyRetainFields Tests
    // ---------------------------------------------------------

    @Test
    public void withChronologyRetainFields_sameChronology_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.withChronologyRetainFields(ISOChronology.getInstanceUTC());
        Assert.assertSame(partial, result);
    }

    @Test
    public void withChronologyRetainFields_nullChronology_shouldDefaultToISOAndReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.withChronologyRetainFields(null);
        Assert.assertSame(partial, result);
    }

    @Test
    public void withChronologyRetainFields_differentChronology_shouldReturnNewInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Chronology gj = GregorianChronology.getInstance();
        Partial result = partial.withChronologyRetainFields(gj);
        Assert.assertNotSame(partial, result);
        Assert.assertEquals(gj.withUTC(), result.getChronology());
        Assert.assertEquals(2020, result.getValue(0));
    }

    // ---------------------------------------------------------
    // with and without Tests
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void with_nullFieldType_shouldThrowIllegalArgumentException() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        partial.with(null, 1);
    }

    @Test
    public void with_existingFieldSameValue_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.with(DateTimeFieldType.year(), 2020);
        Assert.assertSame(partial, result);
    }

    @Test
    public void with_existingFieldDifferentValue_shouldReturnNewInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.with(DateTimeFieldType.year(), 2021);
        Assert.assertNotSame(partial, result);
        Assert.assertEquals(2021, result.getValue(0));
    }

    @Test
    public void with_newFieldInsertMiddle_shouldMaintainOrder() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020)
                .with(DateTimeFieldType.dayOfMonth(), 15);
        Partial result = partial.with(DateTimeFieldType.monthOfYear(), 6);

        Assert.assertEquals(3, result.size());
        Assert.assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(2));
        Assert.assertEquals(2020, result.getValue(0));
        Assert.assertEquals(6, result.getValue(1));
        Assert.assertEquals(15, result.getValue(2));
    }

    @Test
    public void with_newFieldSameUnitHigherRange_shouldInsertCorrectly() {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial result = partial.with(DateTimeFieldType.dayOfYear(), 100);

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.dayOfYear(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(1));
    }

    @Test
    public void without_existingField_shouldRemoveField() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        Partial partial = new Partial(types, new int[] {2020, 5, 20});
        Partial result = partial.without(DateTimeFieldType.monthOfYear());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(1));
        Assert.assertEquals(2020, result.getValue(0));
        Assert.assertEquals(20, result.getValue(1));
    }

    @Test
    public void without_nonExistingField_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.without(DateTimeFieldType.monthOfYear());
        Assert.assertSame(partial, result);
    }

    // ---------------------------------------------------------
    // withField, withFieldAdded, withFieldAddWrapped Tests
    // ---------------------------------------------------------

    @Test
    public void withField_sameValue_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.withField(DateTimeFieldType.year(), 2020);
        Assert.assertSame(partial, result);
    }

    @Test
    public void withField_differentValue_shouldReturnNewInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.withField(DateTimeFieldType.year(), 2025);
        Assert.assertNotSame(partial, result);
        Assert.assertEquals(2025, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withField_unsupportedField_shouldThrowIllegalArgumentException() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        partial.withField(DateTimeFieldType.hourOfDay(), 12);
    }

    @Test
    public void withFieldAdded_zeroAmount_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.withFieldAdded(DurationFieldType.years(), 0);
        Assert.assertSame(partial, result);
    }

    @Test
    public void withFieldAdded_nonZeroAmount_shouldModifyValue() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.withFieldAdded(DurationFieldType.years(), 5);
        Assert.assertNotSame(partial, result);
        Assert.assertEquals(2025, result.getValue(0));
    }

    @Test
    public void withFieldAddWrapped_zeroAmount_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 5);
        Partial result = partial.withFieldAddWrapped(DurationFieldType.months(), 0);
        Assert.assertSame(partial, result);
    }

    @Test
    public void withFieldAddWrapped_nonZeroAmount_shouldWrapValue() {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 11);
        Partial result = partial.withFieldAddWrapped(DurationFieldType.months(), 3);
        Assert.assertNotSame(partial, result);
        Assert.assertEquals(2, result.getValue(0));
    }

    // ---------------------------------------------------------
    // Period Addition and Subtraction Tests
    // ---------------------------------------------------------

    @Test
    public void withPeriodAdded_nullPeriodOrZeroScalar_shouldReturnSameInstance() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Assert.assertSame(partial, partial.withPeriodAdded(null, 1));
        Assert.assertSame(partial, partial.withPeriodAdded(Period.years(5), 0));
    }

    @Test
    public void withPeriodAdded_matchingAndNonMatchingFields_shouldAddOnlyMatching() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Period period = new Period().withYears(3).withMonths(2);
        Partial result = partial.withPeriodAdded(period, 2);

        Assert.assertNotSame(partial, result);
        Assert.assertEquals(2026, result.getValue(0));
    }

    @Test
    public void plus_shouldAddPeriodWithScalarOne() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial result = partial.plus(Period.years(4));
        Assert.assertEquals(2024, result.getValue(0));
    }

    @Test
    public void minus_shouldSubtractPeriodWithScalar