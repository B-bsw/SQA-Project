package org.joda.time;

import static org.junit.Assert.*;

import java.util.Locale;

import org.joda.time.chrono.BuddhistChronology;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PartialTest {

    private Partial yearMonth;

    @Before
    public void setUp() {
        yearMonth = new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear()
                },
                new int[]{2010, 6});
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEmptyConstructor() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals(DateTimeZone.UTC, p.getChronology().getZone());
        assertEquals(0, p.getFieldTypes().length);
        assertEquals(0, p.getValues().length);
        assertEquals("[]", p.toStringList());
    }

    @Test
    public void testConstructorWithSingleField() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2004, p.getValue(0));
        assertEquals(2004, p.getValues()[0]);
    }

    @Test
    public void testConstructorWithChronology() {
        Partial p = new Partial(
                DateTimeFieldType.monthOfYear(), 6, yearMonth.getChronology());

        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(0));
        assertEquals(6, p.getValue(0));
    }

    @Test
    public void testConstructorNullFieldTypeThrows() {
        try {
            new Partial((DateTimeFieldType) null, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testConstructorValidationThrows() {
        try {
            new Partial((DateTimeFieldType[]) null, new int[]{1});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }

        try {
            new Partial(
                    new DateTimeFieldType[]{DateTimeFieldType.year()}, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }

        try {
            new Partial(
                    new DateTimeFieldType[]{
                            DateTimeFieldType.year(),
                            DateTimeFieldType.monthOfYear()
                    },
                    new int[]{2010});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testConstructorRejectsNullElementAndWrongOrder() {
        try {
            new Partial(
                    new DateTimeFieldType[]{
                            DateTimeFieldType.year(),
                            null
                    },
                    new int[]{2010, 1});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }

        try {
            new Partial(
                    new DateTimeFieldType[]{
                            DateTimeFieldType.monthOfYear(),
                            DateTimeFieldType.year()
                    },
                    new int[]{1, 2010});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testValidMultiFieldConstructor() {
        Partial p = new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()
                },
                new int[]{2012, 12, 31});

        assertEquals(3, p.size());
        assertEquals(2012, p.getValue(0));
        assertEquals(12, p.getValue(1));
        assertEquals(31, p.getValue(2));
    }

    @Test
    public void testGetArraysReturnCopies() {
        DateTimeFieldType[] originalTypes = yearMonth.getFieldTypes();
        int[] originalValues = yearMonth.getValues();

        originalTypes[0] = DateTimeFieldType.dayOfMonth();
        originalValues[0] = 1999;

        assertEquals(DateTimeFieldType.year(), yearMonth.getFieldType(0));
        assertEquals(2010, yearMonth.getValue(0));
    }

    @Test
    public void testWithExistingFieldReturnsNewPartial() {
        Partial updated = yearMonth.with(DateTimeFieldType.year(), 2011);

        assertNotSame(yearMonth, updated);
        assertEquals(2011, updated.getValue(0));
        assertEquals(6, updated.getValue(1));

        assertEquals(2010, yearMonth.getValue(0));
        assertEquals(6, yearMonth.getValue(1));
    }

    @Test
    public void testWithSameValueReturnsThis() {
        assertSame(yearMonth, yearMonth.with(DateTimeFieldType.year(), 2010));
    }

    @Test
    public void testWithAddsFieldInCorrectOrder() {
        Partial monthFirst = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial addedYear = monthFirst.with(DateTimeFieldType.year(), 2010);

        assertEquals(2, addedYear.size());
        assertEquals(DateTimeFieldType.year(), addedYear.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), addedYear.getFieldType(1));

        Partial yearFirst = new Partial(DateTimeFieldType.year(), 2010);
        Partial addedMonth = yearFirst.with(DateTimeFieldType.monthOfYear(), 6);

        assertEquals(2, addedMonth.size());
        assertEquals(DateTimeFieldType.year(), addedMonth.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), addedMonth.getFieldType(1));
    }

    @Test
    public void testWithNullFieldTypeThrows() {
        try {
            yearMonth.with(null, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial converted = yearMonth.withChronologyRetainFields(
                BuddhistChronology.getInstanceUTC());

        assertNotSame(yearMonth, converted);
        assertSame(DateTimeFieldType.year(), converted.getFieldType(0));
        assertSame(DateTimeFieldType.monthOfYear(), converted.getFieldType(1));
        assertEquals(2010, converted.getValue(0));
        assertEquals(6, converted.getValue(1));

        assertSame(
                BuddhistChronology.getInstanceUTC(),
                converted.getChronology());

        assertSame(
                yearMonth,
                yearMonth.withChronologyRetainFields(yearMonth.getChronology()));
    }

    @Test
    public void testWithoutRemovesField() {
        Partial withoutYear = yearMonth.without(DateTimeFieldType.year());

        assertNotSame(yearMonth, withoutYear);
        assertEquals(1, withoutYear.size());
        assertEquals(DateTimeFieldType.monthOfYear(), withoutYear.getFieldType(0));
        assertEquals(6, withoutYear.getValue(0));

        Partial withoutAbsent = yearMonth.without(DateTimeFieldType.dayOfMonth());
        assertSame(yearMonth, withoutAbsent);
    }

    @Test
    public void testWithField() {
        Partial updated = yearMonth.withField(DateTimeFieldType.year(), 2012);

        assertEquals(2012, updated.getValue(0));
        assertEquals(6, updated.getValue(1));

        assertSame(yearMonth, yearMonth.withField(DateTimeFieldType.year(), 2010));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldUnsupportedThrows() {
        yearMonth.withField(DateTimeFieldType.dayOfMonth(), 1);
    }

    @Test
    public void testWithFieldAdded() {
        Partial added = yearMonth.withFieldAdded(DurationFieldType.years(), 5);

        assertEquals(2015, added.getValue(0));
        assertEquals(6, added.getValue(1));

        Partial carried = yearMonth.withFieldAdded(DurationFieldType.months(), 7);

        assertEquals(2011, carried.getValue(0));
        assertEquals(1, carried.getValue(1));

        assertSame(yearMonth, yearMonth.withFieldAdded(DurationFieldType.years(), 0));
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial wrapped = new Partial(DateTimeFieldType.monthOfYear(), 10)
                .withFieldAddWrapped(DurationFieldType.months(), 5);

        assertEquals(3, wrapped.getValue(0));
    }

    @Test
    public void testWithPeriodAdded() {
        Partial plus = yearMonth.plus(Period.years(5));

        assertEquals(2015, plus.getValue(0));
        assertEquals(6, plus.getValue(1));

        Partial minus = yearMonth.minus(Period.years(5));

        assertEquals(2005, minus.getValue(0));
        assertEquals(6, minus.getValue(1));

        assertSame(yearMonth, yearMonth.plus(null));
        assertSame(yearMonth, yearMonth.minus(null));
    }

    @Test
    public void testProperty() {
        Partial.Property prop = yearMonth.property(DateTimeFieldType.monthOfYear());

        assertEquals(6, prop.get());
        assertNotNull(prop.getField());
        assertSame(yearMonth, prop.getPartial());

        Partial added = prop.addToCopy(3);
        assertEquals(9, added.getValue(1));
        assertEquals(6, yearMonth.getValue(1));

        Partial wrapped = prop.addWrapFieldToCopy(10);
        assertEquals(4, wrapped.getValue(1));

        Partial set = prop.setCopy(12);
        assertEquals(12, set.getValue(1));
        assertEquals(6, yearMonth.getValue(1));

        Partial setText = prop.setCopy("12", Locale.ENGLISH);
        assertEquals(12, setText.getValue(1));

        Partial max = prop.withMaximumValue();
        assertEquals(12, max.getValue(1));

        Partial min = prop.withMinimumValue();
        assertEquals(1, min.getValue(1));
    }

    @Test
    public void testIsMatch() {
        assertTrue(yearMonth.isMatch(new LocalDate(2010, 6, 15)));
        assertFalse(yearMonth.isMatch(new LocalDate(2010, 7, 15)));

        assertTrue(yearMonth.isMatch(
                new DateTime(2010, 6, 15, 0, 0, 0, 0, DateTimeZone.UTC)));
        assertFalse(yearMonth.isMatch(
                new DateTime(2010, 7, 15, 0, 0, 0, 0, DateTimeZone.UTC)));
    }

    @Test
    public void testToStringMethods() {
        assertEquals("[year=2010, monthOfYear=6]", yearMonth.toStringList());
        assertNotNull(yearMonth.toString());
        assertEquals("2010-06", yearMonth.toString("yyyy-MM", Locale.US));
        assertEquals(yearMonth.toString(), yearMonth.toString((String) null));
    }

    @Test
    public void testGetFormatter() {
        assertNull(new Partial().getFormatter());
        assertNotNull(yearMonth.getFormatter());
    }
}