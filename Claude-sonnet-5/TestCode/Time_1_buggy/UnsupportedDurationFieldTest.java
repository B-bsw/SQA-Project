package org.joda.time.field;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Test;

public class UnsupportedDurationFieldTest {

    //-----------------------------------------------------------------------
    // getInstance
    //-----------------------------------------------------------------------

    @Test
    public void testGetInstance_returnsNonNull() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertNotNull(field);
    }

    @Test
    public void testGetInstance_cachesSameType() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_differentTypesProduceDifferentInstances() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertNotSame(field1, field2);
        assertFalse(field1.equals(field2));
    }

    @Test
    public void testGetInstance_multipleTypesCachedCorrectly() {
        UnsupportedDurationField f1 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        UnsupportedDurationField f2 = UnsupportedDurationField.getInstance(DurationFieldType.months());
        UnsupportedDurationField f3 = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        UnsupportedDurationField f1Again = UnsupportedDurationField.getInstance(DurationFieldType.years());
        UnsupportedDurationField f2Again = UnsupportedDurationField.getInstance(DurationFieldType.months());
        UnsupportedDurationField f3Again = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        assertSame(f1, f1Again);
        assertSame(f2, f2Again);
        assertSame(f3, f3Again);
    }

    //-----------------------------------------------------------------------
    // getType / getName
    //-----------------------------------------------------------------------

    @Test
    public void testGetType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(DurationFieldType.days(), field.getType());
    }

    @Test
    public void testGetName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(DurationFieldType.days().getName(), field.getName());
    }

    //-----------------------------------------------------------------------
    // isSupported / isPrecise
    //-----------------------------------------------------------------------

    @Test
    public void testIsSupported() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(field.isPrecise());
    }

    //-----------------------------------------------------------------------
    // getValue / getValueAsLong (single arg)
    //-----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getValue(100L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getValueAsLong(100L);
    }

    //-----------------------------------------------------------------------
    // getValue / getValueAsLong (two args)
    //-----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getValue(100L, 200L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getValueAsLong(100L, 200L);
    }

    //-----------------------------------------------------------------------
    // getMillis
    //-----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisInt() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getMillis(5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getMillis(5L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisIntLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getMillis(5, 100L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getMillis(5L, 100L);
    }

    //-----------------------------------------------------------------------
    // add
    //-----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongInt() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.add(100L, 5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.add(100L, 5L);
    }

    //-----------------------------------------------------------------------
    // getDifference
    //-----------------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getDifference(200L, 100L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getDifferenceAsLong(200L, 100L);
    }

    //-----------------------------------------------------------------------
    // getUnitMillis
    //-----------------------------------------------------------------------

    @Test
    public void testGetUnitMillis() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(0L, field.getUnitMillis());
    }

    //-----------------------------------------------------------------------
    // compareTo
    //-----------------------------------------------------------------------

    @Test
    public void testCompareTo_withUnsupportedField_returnsZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField other = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertEquals(0, field.compareTo(other));
    }

    @Test
    public void testCompareTo_withSupportedField_returnsOne() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        DurationField supported = MillisDurationField.INSTANCE;
        assertTrue(supported.isSupported());
        assertEquals(1, field.compareTo(supported));
    }

    //-----------------------------------------------------------------------
    // equals
    //-----------------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_sameType_differentInstanceViaSerialization() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(field.equals(field2));
    }

    @Test
    public void testEquals_differentType() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertFalse(field1.equals(field2));
    }

    @Test
    public void testEquals_notInstanceOfClass() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertFalse(field.equals("not a duration field"));
    }

    @Test
    public void testEquals_null() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertFalse(field.equals(null));
    }

    //-----------------------------------------------------------------------
    // hashCode
    //-----------------------------------------------------------------------

    @Test
    public void testHashCode_consistentWithEquals() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(field1.hashCode(), field2.hashCode());
    }

    @Test
    public void testHashCode_matchesNameHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(field.getName().hashCode(), field.hashCode());
    }

    //-----------------------------------------------------------------------
    // toString
    //-----------------------------------------------------------------------

    @Test
    public void testToString() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("UnsupportedDurationField[" + field.getName() + ']', field.toString());
    }

    //-----------------------------------------------------------------------
    // readResolve / serialization
    //-----------------------------------------------------------------------

    @Test
    public void testSerialization_returnsSingletonInstance() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(field);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnsupportedDurationField deserialized = (UnsupportedDurationField) ois.readObject();
        ois.close();

        assertSame(field, deserialized);
    }
}