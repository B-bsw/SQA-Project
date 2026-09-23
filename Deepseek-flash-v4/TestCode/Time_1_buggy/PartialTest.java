package org.joda.time;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartialTest {

    private Partial partial;

    @Before
    public void setUp() {
        partial = new Partial(DateTimeFieldType.year(), 2000);
    }

    @Test
    public void testConstructor() {
        assertEquals(0, new Partial().size());
        assertEquals(1, new Partial(DateTimeFieldType.year(), 2000).size());
        assertEquals(2000, new Partial(DateTimeFieldType.year(), 2000).getValue(0));
        assertEquals(Chronology.getISO().withUTC(), new Partial(DateTimeFieldType.year(), 2000).getChronology());
    }

    @Test
    public void testConstructorWithNullType() {
        try {
            new Partial(null, 2000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The field type must not be null", e.getMessage());
        }
    }

    @Test
    public void testConstructorWithNullTypesArray() {
        try {
            new Partial((DateTimeFieldType[]) null, new int[]{2000});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Types array must not be null", e.getMessage());
        }
    }

    @Test
    public void testConstructorWithNullValuesArray() {
        try {
            new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Values array must not be null", e.getMessage());
        }
    }

    @Test
    public void testConstructorWithMismatchedLengths() {
        try {
            new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, new int[]{2000, 1});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Values array must be the same length as the types array", e.getMessage());
        }
    }

    @Test
    public void testConstructorNullTypeInArray() {
        try {
            new Partial(new DateTimeFieldType[]{null}, new int[]{2000});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Types array must not contain null: index 0", e.getMessage());
        }
    }

    @Test
    public void testSizeAndGetValue() {
        assertEquals(1, partial.size());
        assertEquals(2000, partial.getValue(0));
        assertEquals(2000, partial.getValue(0));
    }

    @Test
    public void testGetFieldTypes() {
        DateTimeFieldType[] types = partial.getFieldTypes();
        assertEquals(1, types.length);
        assertEquals(DateTimeFieldType.year(), types[0]);
        types[0] = DateTimeFieldType.monthOfYear();
        assertNotEquals(DateTimeFieldType.monthOfYear(), partial.getFieldTypes()[0]);
    }

    @Test
    public void testGetValues() {
        int[] values = partial.getValues();
        assertEquals(1, values.length);
        assertEquals(2000, values[0]);
        values[0] = 1000;
        assertEquals(2000, partial.getValues()[0]);
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial newPartial = partial.withChronologyRetainFields(Chronology.getISO());
        assertNotNull(newPartial);
        assertEquals(2000, newPartial.getValue(0));
    }

    @Test
    public void testWithField() {
        Partial newPartial = partial.with(DateTimeFieldType.monthOfYear(), 5);
        assertEquals(2, newPartial.size());
        assertEquals(5, newPartial.getValue(1));
    }

    @Test
    public void testWithFieldExistingIndex() {
        Partial newPartial = partial.with(DateTimeFieldType.year(), 2010);
        assertEquals(1, newPartial.size());
        assertEquals(2010, newPartial.getValue(0));
    }

    @Test
    public void testWithNullFieldType() {
        try {
            partial.with(null, 2010);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The field type must not be null", e.getMessage());
        }
    }

    @Test
    public void testWithout() {
        Partial newPartial = partial.with(DateTimeFieldType.monthOfYear(), 5);
        assertEquals(2, newPartial.size());
        Partial withoutMonth = newPartial.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, withoutMonth.size());
        assertEquals(DateTimeFieldType.year(), withoutMonth.getFieldType(0));
    }

    @Test
    public void testWithoutNonExistingField() {
        Partial newPartial = partial.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, newPartial.size());
        assertEquals(DateTimeFieldType.year(), newPartial.getFieldType(0));
    }

    @Test
    public void testWithFieldAdded() {
        Partial newPartial = partial.withFieldAdded(DurationFieldType.years(), 5);
        assertEquals(2005, newPartial.getValue(0));
    }

    @Test
    public void testWithFieldAddedZero() {
        Partial newPartial = partial.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(partial, newPartial);
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial newPartial = partial.withFieldAddWrapped(DurationFieldType.years(), 5);
        assertEquals(2005, newPartial.getValue(0));
    }

    @Test
    public void testWithFieldAddWrappedZero() {
        Partial newPartial = partial.withFieldAddWrapped(DurationFieldType.years(), 0);
        assertSame(partial, newPartial);
    }

    @Test
    public void testWithPeriodAdded() {
        Period period = new Period(5, 0, 0, 0);
        Partial newPartial = partial.withPeriodAdded(period, 1);
        assertEquals(2005, newPartial.getValue(0));
    }

    @Test
    public void testWithPeriodAddedNull() {
        assertSame(partial, partial.withPeriodAdded(null, 1));
    }

    @Test
    public void testWithPeriodAddedZeroScalar() {
        Period period = new Period(5, 0, 0, 0);
        assertSame(partial, partial.withPeriodAdded(period, 0));
    }

    @Test
    public void testPlus() {
        Period period = new Period(5, 0, 0, 0);
        Partial newPartial = partial.plus(period);
        assertEquals(2005, newPartial.getValue(0));
    }

    @Test
    public void testMinus() {
        Period period = new Period(5, 0, 0, 0);
        Partial newPartial = partial.minus(period);
        assertEquals(1995, newPartial.getValue(0));
    }

    @Test
    public void testProperty() {
        Property property = partial.property(DateTimeFieldType.year());
        assertNotNull(property);
        assertEquals(2000, property.get());
        assertSame(partial, property.getPartial());
    }

    @Test
    public void testIsMatchWithInstant() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertTrue(p.isMatch((ReadableInstant) null));
    }

    @Test
    public void testIsMatchWithPartial() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        Partial match = new Partial(DateTimeFieldType.year(), 2000);
        assertTrue(p.isMatch(match));
    }

    @Test
    public void testGetFormatter() {
        Partial p = new Partial(DateTimeFieldType.year(), 2000);
        assertNotNull(p.getFormatter());
    }

    @Test
    public void testGetFormatterEmpty() {
        Partial p = new Partial();
        assertNull(p.getFormatter());
    }

    @Test
    public void testToString() {
        assertFalse(partial.toString().isEmpty());
    }

    @Test
    public void testToStringList() {
        assertEquals("[year=2000]", partial.toStringList());
    }

    @Test
    public void testToStringPattern() {
        assertFalse(partial.toString("yyyy").isEmpty());
    }

    @Test
    public void testToStringPatternWithLocale() {
        assertFalse(partial.toString("yyyy", Locale.UK).isEmpty());
    }

    @Test
    public void testWithMaximumValue() {
        Partial newPartial = partial.withMaximumValue();
        assertEquals(999999999, newPartial.getValue(0));
    }

    @Test
    public void testWithMinimumValue() {
        Partial newPartial = partial.withMinimumValue();
        assertEquals(-999999999, newPartial.getValue(0));
    }
}