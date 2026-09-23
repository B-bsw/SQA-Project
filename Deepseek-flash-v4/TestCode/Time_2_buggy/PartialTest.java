package org.joda.time;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Locale;

public class PartialTest {
    private Partial partial;
    private final Chronology chronology = ISOChronology.getInstanceUTC();

    @Before
    public void setUp() {
        partial = new Partial(DateTimeFieldType.year(), 2000);
    }

    @After
    public void tearDown() {
        partial = null;
    }

    @Test
    public void testDefaultConstructor() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertNotNull(p.getChronology());
        assertEquals(DateTimeZone.UTC, p.getChronology().getZone());
    }

    @Test
    public void testChronologyConstructor() {
        Partial p = new Partial((Chronology) null);
        assertNotNull(p.getChronology());
        assertEquals(DateTimeZone.UTC, p.getChronology().getZone());
    }

    @Test
    public void testTypeValueConstructor_NullType() {
        try {
            new Partial(null, 2000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The field type must not be null", e.getMessage());
        }
    }

    @Test
    public void testTypeValueConstructor_Valid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2023);
        assertEquals(1, p.size());
        assertEquals(2023, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_NullTypes() {
        new Partial(null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_NullValues() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_LengthMismatch() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, new int[]{1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_EmptyTypes() {
        new Partial(new DateTimeFieldType[0], new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_NullTypeInArray() {
        new Partial(new DateTimeFieldType[]{null}, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_DuplicateTypes() {
        new Partial(
            new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.year()},
            new int[]{2000, 12, 2000}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraysConstructor_OutOfOrderTypes() {
        new Partial(
            new DateTimeFieldType[]{DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year()},
            new int[]{15, 2000}
        );
    }

    @Test
    public void testReadablePartialConstructor() {
        Partial p = new Partial(partial);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2000, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadablePartialConstructor_Null() {
        new Partial((ReadablePartial) null);
    }

    @Test
    public void testGetChronology() {
        assertNotNull(partial.getChronology());
        assertEquals(DateTimeZone.UTC, partial.getChronology().getZone());
    }

    @Test
    public void testSize_Initially() {
        assertEquals(1, partial.size());
    }

    @Test
    public void testGetFieldType() {
        assertEquals(DateTimeFieldType.year(), partial.getFieldType(0));
    }

    @Test
    public void testGetFieldTypes() {
        DateTimeFieldType[] types = partial.getFieldTypes();
        assertEquals(1, types.length);
        assertEquals(DateTimeFieldType.year(), types[0]);
    }

    @Test
    public void testGetValues() {
        int[] values = partial.getValues();
        assertEquals(1, values.length);
        assertEquals(2000, values[0]);
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial p = partial.withChronologyRetainFields(null);
        assertNotNull(p.getChronology());
        assertEquals(partial.getValues()[0], p.getValues()[0]);
    }

    @Test
    public void testWithField_NewField() {
        Partial p = partial.with(DateTimeFieldType.monthOfYear(), 12);
        assertEquals(2, p.size());
        assertEquals(2000, p.getValue(0));
        assertEquals(12, p.getValue(1));
    }

    @Test
    public void testWithField_ExistingField() {
        Partial p = partial.with(DateTimeFieldType.year(), 2020);
        assertEquals(2020, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_NullType() {
        partial.with(null, 5);
    }

    @Test
    public void testWithField_InvalidValue() {
        try {
            partial.with(DateTimeFieldType.year(), 2023);
        } catch (IllegalArgumentException e) {
            fail("Expected valid year");
        }
    }

    @Test
    public void testWithout_Field() {
        Partial full = new Partial(
            new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
            new int[]{2000, 12}
        );
        Partial without = full.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, without.size());
        assertEquals(DateTimeFieldType.year(), without.getFieldType(0));
    }

    @Test
    public void testWithout_MissingField() {
        Partial without = partial.without(DateTimeFieldType.monthOfYear());
        assertSame(partial, without);
    }

    @Test
    public void testWithFieldAdded_Year() {
        Partial p = partial.withFieldAdded(DurationFieldType.years(), 25);
        assertNotNull(p);
        assertEquals(2025, p.getValue(0));
    }

    @Test
    public void testWithFieldAdded_Zero() {
        Partial p = partial.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(partial, p);
    }

    @Test
    public void testWithFieldAddWrapped_Year() {
        Partial p = partial.withFieldAddWrapped(DurationFieldType.years(), 30);
        assertNotNull(p);
    }

    @Test
    public void testWithPeriodAdded_Null() {
        Partial p = partial.withPeriodAdded(null, 1);
        assertSame(partial, p);
    }

    @Test
    public void testWithPeriodAdded_ZeroScalar() {
        Partial p = partial.withPeriodAdded(Period.years(5), 0);
        assertSame(partial, p);
    }

    @Test
    public void testWithPeriodAdded_Year() {
        Partial p = partial.withPeriodAdded(Period.years(2), 1);
        assertNotNull(p);
        assertEquals(2002, p.getValue(0));
    }

    @Test
    public void testPlus() {
        Partial p = partial.plus(Period.years(1));
        assertEquals(2001, p.getValue(0));
    }

    @Test
    public void testMinus() {
        Partial p = partial.minus(Period.years(1));
        assertEquals(1999, p.getValue(0));
    }

    @Test
    public void testProperty() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        assertNotNull(prop);
        assertEquals(2000, prop.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_NullType() {
        partial.property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_UnsupportedType() {
        partial.property(DateTimeFieldType.dayOfMonth());
    }

    @Test
    public void testIsMatch_ReadableInstant() {
        assertTrue(partial.isMatch(new Instant(0)));
    }

    @Test
    public void testIsMatch_ReadableInstant_False() {
        Partial p = new Partial(new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()}, new int[]{2000, 12});
        assertFalse(p.isMatch(new Instant(2000, 1, 1, 0, 0, 0)));
    }

    @Test
    public void testIsMatch_ReadablePartial() {
        assertTrue(partial.isMatch(new Partial(DateTimeFieldType.year(), 2000)));
    }

    @Test
    public void testIsMatch_ReadablePartial_False() {
        Partial p = new Partial(DateTimeFieldType.year(), 2001);
        assertFalse(partial.isMatch(p));
    }

    @Test
    public void testGetFormatter_Empty() {
        Partial empty = new Partial();
        assertNull(empty.getFormatter());
    }

    @Test
    public void testGetFormatter_NonEmpty() {
        assertNotNull(partial.getFormatter());
    }

    @Test
    public void testToStringList() {
        String result = partial.toStringList();
        assertEquals("[year=2000]", result);
    }

    @Test
    public void testToString() {
        assertNotNull(partial.toString());
    }

    @Test
    public void testToString_Pattern() {
        assertNotNull(partial.toString("yyyy"));
    }

    @Test
    public void testToString_NullPattern() {
        assertEquals(partial.toString(), partial.toString((String) null));
    }

    @Test
    public void testToString_PatternLocale() {
        assertNotNull(partial.toString("yyyy", Locale.US));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToString_InvalidPattern() {
        partial.toString("invalid-pattern!");
    }

    @Test
    public void testWithMinimumValue() {
        Partial p = partial.withMinimumValue();
        assertEquals(1, p.getValue(0)); 
    }

    @Test
    public void testWithMaximumValue() {
        Partial p = partial.withMaximumValue();
        assertEquals(292278994, p.getValue(0)); 
    }

    @Test
    public void testProperty_AddToCopy() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        Partial p = prop.addToCopy(5);
        assertEquals(2005, p.getValue(0));
    }

    @Test
    public void testProperty_AddWrapFieldToCopy() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        Partial p = prop.addWrapFieldToCopy(5);
        assertNotNull(p);
        assertEquals(2005, p.getValue(0));
    }

    @Test
    public void testProperty_SetCopy() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        Partial p = prop.setCopy(2010);
        assertEquals(2010, p.getValue(0));
    }

    @Test
    public void testProperty_SetCopy_Text() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        Partial p = prop.setCopy("2015", Locale.US);
        assertEquals(2015, p.getValue(0));
    }

    @Test
    public void testProperty_SetCopy_TextNoLocale() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        Partial p = prop.setCopy("2020");
        assertEquals(2020, p.getValue(0));
    }

    @Test
    public void testProperty_GetPartial() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        assertSame(partial, prop.getPartial());
    }

    @Test
    public void testProperty_GetField() {
        Partial.Property prop = partial.property(DateTimeFieldType.year());
        assertNotNull(prop.getField());
    }
}