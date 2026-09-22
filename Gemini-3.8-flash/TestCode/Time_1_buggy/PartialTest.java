package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class PartialTest {

    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    @Test
    public void constructor_givenNoArgs_shouldInitializeEmptyWithIsoUtc() {
        // Arrange & Act
        Partial p = new Partial();

        // Assert
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(ISO_UTC, p.getChronology());
        Assert.assertEquals(0, p.getFieldTypes().length);
        Assert.assertEquals(0, p.getValues().length);
    }

    @Test
    public void constructor_givenNullChronology_shouldInitializeEmptyWithIsoUtc() {
        // Arrange & Act
        Partial p = new Partial((Chronology) null);

        // Assert
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(ISO_UTC, p.getChronology());
    }

    @Test
    public void constructor_givenSpecificChronology_shouldInitializeWithUtcChrono() {
        // Arrange & Act
        Partial p = new Partial(BuddhistChronology.getInstance());

        // Assert
        Assert.assertEquals(0, p.size());
        Assert.assertEquals(BUDDHIST_UTC, p.getChronology());
    }

    @Test
    public void constructor_givenSingleFieldAndValue_shouldInitializeCorrectly() {
        // Arrange & Act
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 14);

        // Assert
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
        Assert.assertEquals(14, p.getValue(0));
        Assert.assertEquals(ISO_UTC, p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullSingleField_shouldThrowException() {
        // Act
        new Partial((DateTimeFieldType) null, 10);
    }

    @Test
    public void constructor_givenSingleFieldWithChrono_shouldInitializeCorrectly() {
        // Arrange & Act
        Partial p = new Partial(DateTimeFieldType.year(), 2550, BuddhistChronology.getInstance());

        // Assert
        Assert.assertEquals(1, p.size());
        Assert.assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        Assert.assertEquals(2550, p.getValue(0));
        Assert.assertEquals(BUDDHIST_UTC, p.getChronology());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTypesArray_shouldThrowException() {
        // Act
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullValuesArray_shouldThrowException() {
        // Act
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth()}, (int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenMismatchedLengths_shouldThrowException() {
        // Act
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth()}, new int[] {1, 2});
    }

    @Test
    public void constructor_givenEmptyArrays_shouldInitializeEmpty() {
        // Arrange & Act
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);

        // Assert
        Assert.assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenTypesArrayContainingNull_shouldThrowException() {
        // Act
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null}, new int[] {2020, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenTypesInIncreasingOrder_shouldThrowException() {
        // Act: dayOfMonth has smaller unit than monthOfYear
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear()}, new int[] {1, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenDuplicateTypesWithoutRange_shouldThrowException() {
        // Act: year has no range duration type
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.year()}, new int[] {2020, 2021});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEqualUnitFirstWithRangeSecondWithoutRange_shouldThrowException() {
        // Act: era has range null, centuryOfEra has range eras; centuryOfEra has unit centuries, era has unit eras.
        // For equal unit: year has unit=years, range=null. yearOfCentury has unit=years, range=centuries.
        // Order [yearOfCentury, year]: lastRange!=null, loopRange==null -> triggers compare == 0 && loopRange == null
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.yearOfCentury(), DateTimeFieldType.year()}, new int[] {20, 2020});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEqualUnitWithIncreasingRange_shouldThrowException() {
        // Act: dayOfWeek (range=weeks), dayOfMonth (range=months). Both unit=days.
        // Order [dayOfWeek, dayOfMonth]: lastRange(weeks) < loopRange(months) -> triggers lastRange.compareTo < 0
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfMonth()}, new int[] {1, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEqualUnitAndEqualRangeDuplicate_shouldThrowException() {
        // Act: duplicate dayOfMonth
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()}, new int[] {1, 2});
    }

    @Test
    public void constructor_givenEqualUnitWithDecreasingRange_shouldSucceed() {
        // Arrange & Act: dayOfMonth (range=months), dayOfWeek (range=weeks). Both unit=days.
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek()}, new int[] {15, 3});

        // Assert
        Assert.assertEquals(2, p.size());
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.dayOfWeek(), p.getFieldType(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullReadablePartial_shouldThrowException() {
        // Act
        new Partial((ReadablePartial) null);
    }

    @Test
    public void constructor_givenValidReadablePartial_shouldCopyFieldsAndValues() {
        // Arrange
        Partial original = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {10, 30});

        // Act
        Partial copy = new Partial(original);

        // Assert
        Assert.assertEquals(original.size(), copy.size());
        Assert.assertEquals(original.getFieldType(0), copy.getFieldType(0));
        Assert.assertEquals(original.getValue(0), copy.getValue(0));
        Assert.assertEquals(original.getFieldType(1), copy.getFieldType(1));
        Assert.assertEquals(original.getValue(1), copy.getValue(1));
    }

    @Test
    public void getField_givenValidIndex_shouldReturnDateTimeField() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 12);

        // Act
        DateTimeField field = p.getField(0);

        // Assert
        Assert.assertNotNull(field);
        Assert.assertEquals("hourOfDay", field.getName());
    }

    @Test
    public void getValuesAndFieldTypes_shouldReturnClonedArrays() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 12);

        // Act
        int[] values1 = p.getValues();
        int[] values2 = p.getValues();
        values1[0] = 99;

        DateTimeFieldType[] types1 = p.getFieldTypes();
        DateTimeFieldType[] types2 = p.getFieldTypes();
        types1[0] = DateTimeFieldType.minuteOfHour();

        // Assert
        Assert.assertEquals(12, values2[0]);
        Assert.assertEquals(12, p.getValue(0));
        Assert.assertEquals(DateTimeFieldType.hourOfDay(), types2[0]);
        Assert.assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
    }

    @Test
    public void withChronologyRetainFields_givenSameChrono_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 12, ISO_UTC);

        // Act
        Partial result = p.withChronologyRetainFields(ISO_UTC);

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void withChronologyRetainFields_givenNullChrono_shouldReturnSameIfAlreadyIsoUtc() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 12, null);

        // Act
        Partial result = p.withChronologyRetainFields(null);

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void withChronologyRetainFields_givenDifferentChrono_shouldReturnNewInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.year(), 2020, ISO_UTC);

        // Act
        Partial result = p.withChronologyRetainFields(BuddhistChronology.getInstance());

        // Assert
        Assert.assertNotSame(p, result);
        Assert.assertEquals(BUDDHIST_UTC, result.getChronology());
        Assert.assertEquals(2020, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void with_givenNullFieldType_shouldThrowException() {
        // Arrange
        Partial p = new Partial();

        // Act
        p.with(null, 1);
    }

    @Test
    public void with_givenExistingFieldWithSameValue_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.with(DateTimeFieldType.hourOfDay(), 10);

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void with_givenExistingFieldWithDifferentValue_shouldReturnUpdatedPartial() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.with(DateTimeFieldType.hourOfDay(), 15);

        // Assert
        Assert.assertNotSame(p, result);
        Assert.assertEquals(15, result.getValue(0));
    }

    @Test
    public void with_givenNewField_shouldInsertInCorrectOrder() {
        // Arrange: start with minuteOfHour
        Partial p = new Partial(DateTimeFieldType.minuteOfHour(), 30);

        // Act: insert hourOfDay (larger unit, should precede)
        Partial p1 = p.with(DateTimeFieldType.hourOfDay(), 10);

        // Act: insert secondOfMinute (smaller unit, should succeed)
        Partial p2 = p1.with(DateTimeFieldType.secondOfMinute(), 45);

        // Assert
        Assert.assertEquals(3, p2.size());
        Assert.assertEquals(DateTimeFieldType.hourOfDay(), p2.getFieldType(0));
        Assert.assertEquals(10, p2.getValue(0));
        Assert.assertEquals(DateTimeFieldType.minuteOfHour(), p2.getFieldType(1));
        Assert.assertEquals(30, p2.getValue(1));
        Assert.assertEquals(DateTimeFieldType.secondOfMinute(), p2.getFieldType(2));
        Assert.assertEquals(45, p2.getValue(2));
    }

    @Test
    public void with_givenEqualUnitFieldWithDifferentRange_shouldInsertInOrder() {
        // Arrange: dayOfWeek (range=weeks)
        Partial p = new Partial(DateTimeFieldType.dayOfWeek(), 3);

        // Act: add dayOfMonth (range=months > weeks, should be placed first)
        Partial result = p.with(DateTimeFieldType.dayOfMonth(), 15);

        // Assert
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.dayOfWeek(), result.getFieldType(1));
    }

    @Test
    public void with_givenEqualUnitFieldWithNullRange_shouldInsertBeforeNonNullRange() {
        // Arrange: yearOfCentury (range=centuries)
        Partial p = new Partial(DateTimeFieldType.yearOfCentury(), 20);

        // Act: add year (range=null, represents larger duration scope)
        Partial result = p.with(DateTimeFieldType.year(), 2020);

        // Assert
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(DateTimeFieldType.year(), result.getFieldType(0));
        Assert.assertEquals(DateTimeFieldType.yearOfCentury(), result.getFieldType(1));
    }

    @Test
    public void without_givenExistingField_shouldReturnNewPartialWithoutField() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {10, 30});

        // Act
        Partial result = p.without(DateTimeFieldType.minuteOfHour());

        // Assert
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        Assert.assertEquals(10, result.getValue(0));
    }

    @Test
    public void without_givenNonExistingField_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.without(DateTimeFieldType.minuteOfHour());

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void withField_givenExistingFieldWithSameValue_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.withField(DateTimeFieldType.hourOfDay(), 10);

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void withField_givenExistingFieldWithDifferentValue_shouldReturnNewInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.withField(DateTimeFieldType.hourOfDay(), 11);

        // Assert
        Assert.assertNotSame(p, result);
        Assert.assertEquals(11, result.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withField_givenUnsupportedField_shouldThrowException() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        p.withField(DateTimeFieldType.minuteOfHour(), 30);
    }

    @Test
    public void withFieldAdded_givenZeroAmount_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.withFieldAdded(DurationFieldType.hours(), 0);

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void withFieldAdded_givenNonZeroAmount_shouldReturnNewInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);

        // Act
        Partial result = p.withFieldAdded(DurationFieldType.hours(), 3);

        // Assert
        Assert.assertNotSame(p, result);
        Assert.assertEquals(13, result.getValue(0));
    }

    @Test
    public void withFieldAddWrapped_givenZeroAmount_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 20);

        // Act
        Partial result = p.withFieldAddWrapped(DurationFieldType.hours(), 0);

        // Assert
        Assert.assertSame(p, result);
    }

    @Test
    public void withFieldAddWrapped_givenWrappingAmount_shouldWrapCorrectly() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 20);

        // Act
        Partial result = p.withFieldAddWrapped(DurationFieldType.hours(), 6);

        // Assert
        Assert.assertNotSame(p, result);
        Assert.assertEquals(2, result.getValue(0));
    }

    @Test
    public void withPeriodAdded_givenNullPeriodOrZeroScalar_shouldReturnSameInstance() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Period period = Period.hours(2);

        // Act & Assert
        Assert.assertSame(p, p.withPeriodAdded(null, 1));
        Assert.assertSame(p, p.withPeriodAdded(period, 0));
    }

    @Test
    public void withPeriodAdded_givenValidPeriodAndScalar_shouldModifyMatchingFields() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {10, 20});
        Period period = Period.hours(2).withMinutes(15).withSeconds(30);

        // Act
        Partial result = p.withPeriodAdded(period, 2);

        // Assert
        Assert.assertEquals(14, result.getValue(0));
        Assert.assertEquals(50, result.getValue(1));
    }

    @Test
    public void plusAndMinus_givenPeriod_shouldAddAndSubtractCorrectly() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Period period = Period.hours(3);

        // Act
        Partial plusResult = p.plus(period);
        Partial minusResult = p.minus(period);

        // Assert
        Assert.assertEquals(13, plusResult.getValue(0));
        Assert.assertEquals(7, minusResult.getValue(0));
    }

    @Test
    public void isMatch_givenReadableInstant_shouldReturnTrueWhenMatching() {
        // Arrange
        DateTime dt = new DateTime(2023, 5, 20, 14, 30, 0, 0, ISO_UTC);
        Partial matching = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {14, 30});
        Partial nonMatching = new Partial(DateTimeFieldType.hourOfDay(), 15);

        // Act & Assert
        Assert.assertTrue(matching.isMatch(dt));
        Assert.assertFalse(nonMatching.isMatch(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMatch_givenNullReadablePartial_shouldThrowException() {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 14);

        // Act
        p.isMatch((ReadablePartial) null);
    }

    @Test
    public void isMatch_givenReadablePartial_shouldMatchCorrectly() {
        // Arrange
        Partial p1 = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {14, 30});
        Partial p2Same = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {14, 30});
        Partial p3Diff = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {14, 31});

        // Act & Assert
        Assert.assertTrue(p1.isMatch(p2Same));
        Assert.assertFalse(p1.isMatch(p3Diff));
    }

    @Test
    public void getFormatter_givenEmptyPartial_shouldReturnNull() {
        // Arrange
        Partial p = new Partial();

        // Act & Assert
        Assert.assertNull(p.getFormatter());
    }

    @Test
    public void getFormatter_givenIsoStandardFields_shouldReturnFormatter() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()}, new int[] {2020, 5});

        // Act & Assert
        Assert.assertNotNull(p.getFormatter());
    }

    @Test
    public void toString_givenIsoFields_shouldFormatUsingIsoFormatter() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()}, new int[] {2020, 5});

        // Act
        String str = p.toString();

        // Assert
        Assert.assertEquals("2020-05", str);
    }

    @Test
    public void toString_givenEmptyOrNonIsoFields_shouldFallbackToStringList() {
        // Arrange
        Partial empty = new Partial();
        Partial nonIso = new Partial(DateTimeFieldType.era(), 1);

        // Act & Assert
        Assert.assertEquals("[]", empty.toString());
        Assert.assertEquals("[era=1]", nonIso.toString());
    }

    @Test
    public void toStringList_givenMultipleFields_shouldFormatProperly() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {10, 30});

        // Act
        String listStr = p.toStringList();

        // Assert
        Assert.assertEquals("[hourOfDay=10, minuteOfHour=30]", listStr);
    }

    @Test
    public void toString_givenPattern_shouldFormatAccordingToPattern() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()}, new int[] {2020, 5});

        // Act & Assert
        Assert.assertEquals("2020-05", p.toString(null));
        Assert.assertEquals("05/2020", p.toString("MM/yyyy"));
    }

    @Test
    public void toString_givenPatternAndLocale_shouldFormatAccordingToPatternAndLocale() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()}, new int[] {2020, 5});

        // Act & Assert
        Assert.assertEquals("2020-05", p.toString(null, Locale.ENGLISH));
        Assert.assertEquals("May", p.toString("MMM", Locale.ENGLISH));
    }

    @Test
    public void property_givenField_shouldProvideAccessAndMutations() {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {10, 30});

        // Act
        Partial.Property prop = p.property(DateTimeFieldType.hourOfDay());

        // Assert
        Assert.assertEquals(10, prop.get());
        Assert.assertEquals("hourOfDay", prop.getField().getName());
        Assert.assertSame(p, prop.getPartial());
        Assert.assertSame(p, prop.getReadablePartial());

        // Test addToCopy
        Partial added = prop.addToCopy(5);
        Assert.assertEquals(15, added.getValue(0));

        // Test addWrapFieldToCopy
        Partial wrapped = prop.addWrapFieldToCopy(16);
        Assert.assertEquals(2, wrapped.getValue(0));

        // Test setCopy int
        Partial setVal = prop.setCopy(8);
        Assert.assertEquals(8, setVal.getValue(0));

        // Test setCopy string
        Partial setStr = prop.setCopy("18");
        Assert.assertEquals(18, setStr.getValue(0));

        // Test setCopy string with locale
        Partial setStrLoc = prop.setCopy("22", Locale.ENGLISH);
        Assert.assertEquals(22, setStrLoc.getValue(0));

        // Test withMaximumValue
        Partial maxPartial = prop.withMaximumValue();
        Assert.assertEquals(23, maxPartial.getValue(0));

        // Test withMinimumValue
        Partial minPartial = prop.withMinimumValue();
        Assert.assertEquals(0, minPartial.getValue(0));
    }

    @Test
    public void serialization_givenPartial_shouldRoundTripSuccessfully() throws Exception {
        // Arrange
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[] {14, 45});

        // Act
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(p);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial deserialized = (Partial) ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(p.size(), deserialized.size());
        Assert.assertEquals(p.getFieldType(0), deserialized.getFieldType(0));
        Assert.assertEquals(p.getValue(0), deserialized.getValue(0));
        Assert.assertEquals(p.getFieldType(1), deserialized.getFieldType(1));
        Assert.assertEquals(p.getValue(1), deserialized.getValue(1));
        Assert.assertEquals(p.getChronology(), deserialized.getChronology());
    }

    @Test
    public void serialization_givenProperty_shouldRoundTripSuccessfully() throws Exception {
        // Arrange
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 14);
        Partial.Property prop = p.property(DateTimeFieldType.hourOfDay());

        // Act
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial.Property deserialized = (Partial.Property) ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(prop.get(), deserialized.get());
        Assert.assertEquals(prop.getField().getName(), deserialized.getField().getName());
    }
}