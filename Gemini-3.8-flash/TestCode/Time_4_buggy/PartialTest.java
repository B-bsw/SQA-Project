package org.joda.time;

import java.util.Locale;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class PartialTest {

    @Test
    public void constructor_givenDefault_shouldInitializeEmptyWithUTC() {
        Partial p = new Partial();
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void constructor_givenNullChronology_shouldDefaultToISOChronologyUTC() {
        Partial p = new Partial((Chronology) null);
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void constructor_givenValidChronology_shouldSetWithUTC() {
        Chronology chrono = BuddhistChronology.getInstance();
        Partial p = new Partial(chrono);
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullFieldType_shouldThrowException() {
        new Partial((DateTimeFieldType) null, 2020);
    }

    @Test
    public void constructor_givenValidFieldTypeAndValue_shouldInitialize() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(2021, p.getValue(0));
        Assert.assertEquals(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void constructor_givenFieldTypeAndChronology_shouldSetChronologyUTC() {
        Partial p = new Partial(DateTimeFieldType.year(), 2564, BuddhistChronology.getInstance());
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), p.getChronology());
        Assert.assertEquals(2564, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTypesArray_shouldThrowException() {
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullValuesArray_shouldThrowException() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenMismatchedArrayLengths_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {DateTimeFieldType.year()};
        int[] values = new int[] {2021, 5};
        new Partial(types, values);
    }

    @Test
    public void constructor_givenEmptyArrays_shouldInitializeEmpty() {
        DateTimeFieldType[] types = new DateTimeFieldType[0];
        int[] values = new int[0];
        Partial p = new Partial(types, values);
        Assert.assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenArrayWithNullElement_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {DateTimeFieldType.year(), null};
        int[] values = new int[] {2021, 5};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenWrongOrder_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.year()
        };
        int[] values = new int[] {5, 2021};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenDuplicateTypes_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.year()
        };
        int[] values = new int[] {2020, 2021};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenDuplicateSameRangeTypes_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.hourOfDay()
        };
        int[] values = new int[] {10, 11};
        new Partial(types, values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenSameUnitAscendingRange_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfWeek(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] {1, 1};
        new Partial(types, values);
    }

    @Test
    public void constructor_givenValidMultiFields_shouldInitializeCorrectly() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] {2021, 10, 25};
        Partial p = new Partial(types, values);
        Assert.assertEquals(3, p.size());
        Assert.assertEquals(2021, p.getValue(0));
        Assert.assertEquals(10, p.getValue(1));
        Assert.assertEquals(25, p.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullReadablePartial_shouldThrowException() {
        new Partial((ReadablePartial) null);
    }

    @Test
    public void constructor_givenValidReadablePartial_shouldCopyAllValues() {
        Partial original = new Partial(DateTimeFieldType.year(), 2021);
        Partial copy = new Partial(original);
        Assert.assertEquals(original.size(), copy.size());
        Assert.assertEquals(original.getFieldType(0), copy.getFieldType(0));
        Assert.assertEquals(original.getValue(0), copy.getValue(0));
        Assert.assertEquals(original.getChronology(), copy.getChronology());
    }

    @Test
    public void getFieldTypes_givenPartial_shouldReturnDefensiveCopy() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {DateTimeFieldType.year()};
        int[] values = new int[] {2021};
        Partial p = new Partial(types, values);
        DateTimeFieldType[] copy = p.getFieldTypes();
        Assert.assertEquals(1, copy.length);
        copy[0] = DateTimeFieldType.monthOfYear();
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
    }

    @Test
    public void getValues_givenPartial_shouldReturnDefensiveCopy() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        int[] vals = p.getValues();
        Assert.assertEquals(1, vals.length);
        vals[0] = 1999;
        Assert.assertEquals(2021, p.getValue(0));
    }

    @Test
    public void withChronologyRetainFields_givenSameChronology_shouldReturnSameInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021, ISOChronology.getInstanceUTC());
        Partial result = p.withChronologyRetainFields(ISOChronology.getInstanceUTC());
        Assert.assertSame(p, result);
    }

    @Test
    public void withChronologyRetainFields_givenNullChronology_shouldTreatAsISOUTC() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021, ISOChronology.getInstanceUTC());
        Partial result = p.withChronologyRetainFields(null);
        Assert.assertSame(p, result);
    }

    @Test
    public void withChronologyRetainFields_givenDifferentChronology_shouldReturnNewInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021, ISOChronology.getInstanceUTC());
        Partial result = p.withChronologyRetainFields(CopticChronology.getInstanceUTC());
        Assert.assertNotSame(p, result);
        Assert.assertEquals(CopticChronology.getInstanceUTC(), result.getChronology());
        Assert.assertEquals(2021, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void with_givenNullFieldType_shouldThrowException() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        p.with(null, 1);
    }

    @Test
    public void with_givenExistingFieldAndSameValue_shouldReturnSameInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.with(DateTimeFieldType.year(), 2021);
        Assert.assertSame(p, result);
    }

    @Test
    public void with_givenExistingFieldAndDifferentValue_shouldReturnNewInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.with(DateTimeFieldType.year(), 2022);
        Assert.assertNotSame(p, result);
        Assert.assertEquals(2022, result.getValue(0));
    }

    @Test
    public void with_givenNewFieldAtEnd_shouldInsertInOrder() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.with(DateTimeFieldType.monthOfYear(), 12);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        Assert.assertEquals(2021, result.getValue(0));
        Assert.assertEquals(12, result.getValue(1));
    }

    @Test
    public void with_givenNewFieldAtBeginning_shouldInsertInOrder() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial result = p.with(DateTimeFieldType.year(), 2021);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        Assert.assertEquals(2021, result.getValue(0));
        Assert.assertEquals(12, result.getValue(1));
    }

    @Test
    public void with_givenNewFieldInBetween_shouldInsertInOrder() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfMonth()
        };
        Partial p = new Partial(types, new int[] {2021, 25});
        Partial result = p.with(DateTimeFieldType.monthOfYear(), 10);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(1));
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(2));
        Assert.assertEquals(2021, result.getValue(0));
        Assert.assertEquals(10, result.getValue(1));
        Assert.assertEquals(25, result.getValue(2));
    }

    @Test
    public void with_givenSameDurationDifferentRange_shouldInsertCorrectly() {
        Partial p = new Partial(DateTimeFieldType.dayOfWeek(), 2);
        Partial result = p.with(DateTimeFieldType.dayOfMonth(), 15);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.dayOfWeek(), result.getFieldType(1));
    }

    @Test
    public void without_givenFieldNotPresent_shouldReturnSameInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.without(DateTimeFieldType.monthOfYear());
        Assert.assertSame(p, result);
    }

    @Test
    public void without_givenFieldPresent_shouldReturnNewPartialWithoutField() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        };
        Partial p = new Partial(types, new int[] {2021, 10});
        Partial result = p.without(DateTimeFieldType.year());
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(DateTimeFieldType.monthOfYear(), result.getFieldType(0));
        Assert.assertEquals(10, result.getValue(0));
    }

    @Test
    public void withField_givenSameValue_shouldReturnSameInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.withField(DateTimeFieldType.year(), 2021);
        Assert.assertSame(p, result);
    }

    @Test
    public void withField_givenDifferentValue_shouldReturnUpdatedPartial() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.withField(DateTimeFieldType.year(), 2025);
        Assert.assertNotSame(p, result);
        Assert.assertEquals(2025, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withField_givenUnsupportedField_shouldThrowException() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        p.withField(DateTimeFieldType.monthOfYear(), 5);
    }

    @Test
    public void withFieldAdded_givenZeroAmount_shouldReturnSameInstance() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.withFieldAdded(DurationFieldType.years(), 0);
        Assert.assertSame(p, result);
    }

    @Test
    public void withFieldAdded_givenNonZeroAmount_shouldAddAmount() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        Partial result = p.withFieldAdded(DurationFieldType.years(), 5);
        Assert.assertNotSame(p, result);
        Assert.assertEquals(2026, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withFieldAdded_givenUnsupportedFieldType_shouldThrowException() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);
        p.withFieldAdded(DurationFieldType.months(), 1);
    }

    @Test
    public void withFieldAddWrapped_givenZeroAmount_shouldReturnSameInstance() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 10);
        Partial result = p.withFieldAddWrapped(DurationFieldType.months(), 0);
        Assert.assertSame(p, result);
    }

    @Test
    public void withFieldAddWrapped_givenNonZeroAmount_shouldWrapAround() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 11);
        Partial result = p.withFieldAddWrapped(DurationFieldType.months(), 3);
        Assert.assertEquals(2, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withFieldAddWrapped_givenUnsupportedFieldType_shouldThrowException() {
        Partial p = new Partial(DateTimeFieldType.year(), 2021);