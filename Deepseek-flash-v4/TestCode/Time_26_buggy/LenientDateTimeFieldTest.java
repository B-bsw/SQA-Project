package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.joda.time.field.BaseDateTimeField;

public class LenientDateTimeFieldTest {
    private static final DateTimeZone ZONE = DateTimeZone.UTC;
    private Chronology chronology;
    private DateTimeField wrappedField;
    private LenientDateTimeField lenientField;

    private static class TestField extends BaseDateTimeField {
        private TestField() {
            super(DateTimeFieldType.year());
        }
        public int get(long instant) { return 2024; }
        public long set(long instant, int value) { return instant; }
        public long add(long instant, int value) { return instant + value * 1000L; }
        public boolean isLenient() { return false; }
        public boolean isSupported() { return true; }
        public int getMinimumValue() { return 0; }
        public int getMaximumValue() { return 2999; }
        public long roundFloor(long instant) { return instant; }
    }

    @Before
    public void setUp() {
        chronology = new org.joda.time.chrono.ISOChronology();
        wrappedField = new TestField();
        lenientField = new LenientDateTimeField(wrappedField, chronology);
    }

    @After
    public void tearDown() {
        chronology = null;
        wrappedField = null;
        lenientField = null;
    }

    @Test
    public void testGetInstanceWithNullField() {
        assertNull(LenientDateTimeField.getInstance(null, chronology));
    }

    @Test
    public void testGetInstanceWithLenientField() {
        DateTimeField lenient = new TestField() {
            @Override
            public boolean isLenient() { return true; }
        };
        assertSame(lenient, LenientDateTimeField.getInstance(lenient, chronology));
    }

    @Test
    public void testGetInstanceWithStrictField() {
        DateTimeField strict = new StrictDateTimeField(wrappedField);
        DateTimeField result = LenientDateTimeField.getInstance(strict, chronology);
        assertNotNull(result);
        assertTrue(result.isLenient());
    }

    @Test
    public void testGetInstanceWithNonStrictField() {
        DateTimeField result = LenientDateTimeField.getInstance(wrappedField, chronology);
        assertNotNull(result);
        assertTrue(result instanceof LenientDateTimeField);
        assertTrue(result.isLenient());
    }

    @Test
    public void testIsLenientReturnsTrue() {
        assertTrue(lenientField.isLenient());
    }

    @Test
    public void testSetWithNormalValue() {
        long instant = 1000L;
        long result = lenientField.set(instant, 2025);
        assertTrue(result != instant);
    }

    @Test
    public void testSetWithSameValue() {
        long instant = 1000L;
        long result = lenientField.set(instant, 2024);
        assertTrue(result != instant);
    }

    @Test
    public void testSetWithBoundaryValue() {
        long result = lenientField.set(1000L, Integer.MAX_VALUE);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWithNullBase() {
        LenientDateTimeField nullField = new LenientDateTimeField(wrappedField, null);
        nullField.set(1000L, 2025);
    }

    @Test
    public void testSetWithZeroInstant() {
        long result = lenientField.set(0L, 2025);
        assertTrue(result != 0L);
    }

    @Test
    public void testConstructorWithNullField() {
        try {
            new LenientDateTimeField(null, chronology);
            fail("Expected IllegalArgumentException or NullPointerException");
        } catch (Exception e) {
            // expected
        }
    }
}