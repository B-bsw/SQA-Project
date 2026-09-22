package org.joda.time;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.Assert;
import org.junit.Test;

public class PeriodTest {

    @Test
    public void testZERO_constant_shouldHaveZeroValues() {
        Period p = Period.ZERO;
        Assert.assertEquals(0, p.getYears());
        Assert.assertEquals(0, p.getMonths());
        Assert.assertEquals(0, p.getWeeks());
        Assert.assertEquals(0, p.getDays());
        Assert.assertEquals(0, p.getHours());
        Assert.assertEquals(0, p.getMinutes());
        Assert.assertEquals(0, p.getSeconds());
        Assert.assertEquals(0, p.getMillis());
    }

    @Test
    public void parse_givenIsoString_shouldParseCorrectly() {
        Period p = Period.parse("P1Y2M3W4DT5H6M7.008S");
        Assert.assertEquals(1, p.getYears());
        Assert.assertEquals(2, p.getMonths());
        Assert.assertEquals(3, p.getWeeks());
        Assert.assertEquals(4, p.getDays());
        Assert.assertEquals(5, p.getHours());
        Assert.assertEquals(6, p.getMinutes());
        Assert.assertEquals(7, p.getSeconds());
        Assert.assertEquals(8, p.getMillis());
    }

    @Test
    public void parse_givenFormatter_shouldParseCorrectly() {
        PeriodFormatter formatter = ISOPeriodFormat.standard();
        Period p = Period.parse("PT2H30M", formatter);
        Assert.assertEquals(2, p.getHours());
        Assert.assertEquals(30, p.getMinutes());
    }

    @Test
    public void staticFactories_givenValues_shouldSetRespectiveFields() {
        Assert.assertEquals(10, Period.years(10).getYears());
        Assert.assertEquals(9, Period.months(9).getMonths());
        Assert.assertEquals(8, Period.weeks(8).getWeeks());
        Assert.assertEquals(7, Period.days(7).getDays());
        Assert.assertEquals(6, Period.hours(6).getHours());
        Assert.assertEquals(5, Period.minutes(5).getMinutes());
        Assert.assertEquals(4, Period.seconds(4).getSeconds());
        Assert.assertEquals(3, Period.millis(3).getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fieldDifference_givenNullStart_shouldThrowIllegalArgumentException() {
        Period.fieldDifference(null, new LocalTime(10, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void fieldDifference_givenNullEnd_shouldThrowIllegalArgumentException() {
        Period.fieldDifference(new LocalTime(10, 0), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fieldDifference_givenDifferentSizes_shouldThrowIllegalArgumentException() {
        ReadablePartial start = new LocalTime(10, 0);
        ReadablePartial end = new LocalTime(10, 0, 0);
        Period.fieldDifference(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fieldDifference_givenDifferentFieldTypes_shouldThrowIllegalArgumentException() {
        ReadablePartial start = new YearMonth(2020, 5);
        ReadablePartial end = new MonthDay(5, 20);
        Period.fieldDifference(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fieldDifference_givenOverlappingFields_shouldThrowIllegalArgumentException() {
        ReadablePartial start = new MockDuplicateDurationPartial(1, 2);
        ReadablePartial end = new MockDuplicateDurationPartial(3, 4);
        Period.fieldDifference(start, end);
    }

    @Test
    public void fieldDifference_givenValidPartials_shouldCalculateDifference() {
        LocalTime start = new LocalTime(10, 15, 30);
        LocalTime end = new LocalTime(12, 45, 50);
        Period diff = Period.fieldDifference(start, end);
        Assert.assertEquals(2, diff.getHours());
        Assert.assertEquals(30, diff.getMinutes());
        Assert.assertEquals(20, diff.getSeconds());
    }

    @Test
    public void constructors_givenVariousSignatures_shouldInitializeCorrectly() {
        Period p0 = new Period();
        Assert.assertEquals(0, p0.getMillis());

        Period p4 = new Period(1, 2, 3, 4);
        Assert.assertEquals(1, p4.getHours());
        Assert.assertEquals(2, p4.getMinutes());
        Assert.assertEquals(3, p4.getSeconds());
        Assert.assertEquals(4, p4.getMillis());

        Period p8 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertEquals(1, p8.getYears());
        Assert.assertEquals(2, p8.getMonths());
        Assert.assertEquals(3, p8.getWeeks());
        Assert.assertEquals(4, p8.getDays());
        Assert.assertEquals(5, p8.getHours());
        Assert.assertEquals(6, p8.getMinutes());
        Assert.assertEquals(7, p8.getSeconds());
        Assert.assertEquals(8, p8.getMillis());

        Period p9 = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Assert.assertEquals(1, p9.getYears());
        Assert.assertEquals(PeriodType.standard(), p9.getPeriodType());

        Period pDur = new Period(1000L);
        Assert.assertEquals(1, pDur.getSeconds());

        Period pDurType = new Period(1000L, PeriodType.standard());
        Assert.assertEquals(1, pDurType.getSeconds());

        Period pDurChrono = new Period(1000L, ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pDurChrono.getSeconds());

        Period pDurTypeChrono = new Period(1000L, PeriodType.standard(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pDurTypeChrono.getSeconds());

        Period pInstants = new Period(1000L, 5000L);
        Assert.assertEquals(4, pInstants.getSeconds());

        Period pInstantsType = new Period(1000L, 5000L, PeriodType.standard());
        Assert.assertEquals(4, pInstantsType.getSeconds());

        Period pInstantsChrono = new Period(1000L, 5000L, ISOChronology.getInstanceUTC());
        Assert.assertEquals(4, pInstantsChrono.getSeconds());

        Period pInstantsTypeChrono = new Period(1000L, 5000L, PeriodType.standard(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(4, pInstantsTypeChrono.getSeconds());

        Instant inst1 = new Instant(1000L);
        Instant inst2 = new Instant(6000L);
        Period pReadInst = new Period(inst1, inst2);
        Assert.assertEquals(5, pReadInst.getSeconds());

        Period pReadInstType = new Period(inst1, inst2, PeriodType.standard());
        Assert.assertEquals(5, pReadInstType.getSeconds());

        YearMonth ym1 = new YearMonth(2020, 1);
        YearMonth ym2 = new YearMonth(2022, 4);
        Period pPartials = new Period(ym1, ym2);
        Assert.assertEquals(2, pPartials.getYears());
        Assert.assertEquals(3, pPartials.getMonths());

        Period pPartialsType = new Period(ym1, ym2, PeriodType.standard());
        Assert.assertEquals(2, pPartialsType.getYears());

        Duration dur = new Duration(3000L);
        Period pInstDur = new Period(inst1, dur);
        Assert.assertEquals(3, pInstDur.getSeconds());

        Period pInstDurType = new Period(inst1, dur, PeriodType.standard());
        Assert.assertEquals(3, pInstDurType.getSeconds());

        Period pDurInst = new Period(dur, inst2);
        Assert.assertEquals(3, pDurInst.getSeconds());

        Period pDurInstType = new Period(dur, inst2, PeriodType.standard());
        Assert.assertEquals(3, pDurInstType.getSeconds());

        Period pObj = new Period("PT1H");
        Assert.assertEquals(1, pObj.getHours());

        Period pObjType = new Period("PT1H", PeriodType.standard());
        Assert.assertEquals(1, pObjType.getHours());

        Period pObjChrono = new Period("PT1H", ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pObjChrono.getHours());

        Period pObjTypeChrono = new Period("PT1H", PeriodType.standard(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pObjTypeChrono.getHours());
    }

    @Test
    public void toPeriod_givenPeriod_shouldReturnSameInstance() {
        Period p = new Period(1, 2, 3, 4);
        Assert.assertSame(p, p.toPeriod());
    }

    @Test
    public void withPeriodType_givenSameType_shouldReturnSameInstance() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period result = p.withPeriodType(PeriodType.standard());
        Assert.assertSame(p, result);
    }

    @Test
    public void withPeriodType_givenDifferentType_shouldConvertType() {
        Period p = new Period(0, 0, 0, 0, 1, 30, 0, 0);
        Period result = p.withPeriodType(PeriodType.time());
        Assert.assertEquals(PeriodType.time(), result.getPeriodType());
        Assert.assertEquals(1, result.getHours());
        Assert.assertEquals(30, result.getMinutes());
    }

    @Test
    public void withFields_givenNull_shouldReturnSameInstance() {
        Period p = new Period(1, 2, 3, 4);
        Assert.assertSame(p, p.withFields(null));
    }

    @Test
    public void withFields_givenValidPeriod_shouldMergeValues() {
        Period p1 = new Period(1, 2, 0, 0);
        Period p2 = new Period(0, 3, 4, 5);
        Period merged = p1.withFields(p2);
        Assert.assertEquals(1, merged.getHours());
        Assert.assertEquals(3, merged.getMinutes());
        Assert.assertEquals(4, merged.getSeconds());
        Assert.assertEquals(5, merged.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void withField_givenNullField_shouldThrowIllegalArgumentException() {
        Period p = new Period();
        p.withField(null, 5);
    }

    @Test
    public void withField_givenValidField_shouldSetSpecifiedFieldValue() {
        Period p = new Period();
        Period updated = p.withField(DurationFieldType.days(), 12);
        Assert.assertEquals(12, updated.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void withFieldAdded_givenNullField_shouldThrowIllegalArgumentException() {
        Period p = new Period();
        p.withFieldAdded(null, 5);
    }

    @Test
    public void withFieldAdded_givenZeroValue_shouldReturnSameInstance() {
        Period p = new Period(1, 2, 3, 4);
        Assert.assertSame(p, p.withFieldAdded(DurationFieldType.hours(), 0));
    }

    @Test
    public void withFieldAdded_givenNonZeroValue_shouldAddField() {
        Period p = new Period(1, 2, 3, 4);
        Period updated = p.withFieldAdded(DurationFieldType.hours(), 5);
        Assert.assertEquals(6, updated.getHours());
    }

    @Test
    public void withIndividualFields_givenNewValues_shouldReturnNewPeriodWithUpdatedValue() {
        Period p = new Period();
        Assert.assertEquals(1, p.withYears(1).getYears());
        Assert.assertEquals(2, p.withMonths(2).getMonths());
        Assert.assertEquals(3, p.withWeeks(3).getWeeks());
        Assert.assertEquals(4, p.withDays(4).getDays());
        Assert.assertEquals(5, p.withHours(5).getHours());
        Assert.assertEquals(6, p.withMinutes(6).getMinutes());
        Assert.assertEquals(7, p.withSeconds(7).getSeconds());
        Assert.assertEquals(8, p.withMillis(8).getMillis());
    }

    @Test
    public void plus_givenNullPeriod_shouldReturnSameInstance() {
        Period p = new Period(1, 2, 3, 4);
        Assert.assertSame(p, p.plus(null));
    }

    @Test
    public void plus_givenValidPeriod_shouldAddAllFields() {
        Period p1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period p2 = new Period(8, 7, 6, 5, 4, 3, 2, 1);
        Period res = p1.plus(p2);
        Assert.assertEquals(9, res.getYears());
        Assert.assertEquals(9, res.getMonths());
        Assert.assertEquals(9, res.getWeeks());
        Assert.assertEquals(9, res.getDays());
        Assert.assertEquals(9, res.getHours());
        Assert.assertEquals(9, res.getMinutes());
        Assert.assertEquals(9, res.getSeconds());
        Assert.assertEquals(9, res.getMillis());
    }

    @Test
    public void plusIndividualFields_givenZero_shouldReturnSameInstance() {
        Period p = new Period(1, 1, 1, 1, 1, 1, 1, 1);
        Assert.assertSame(p, p.plusYears(0));
        Assert.assertSame(p, p.plusMonths(0));
        Assert.assertSame(p, p.plusWeeks(0));
        Assert.assertSame(p, p.plusDays(0));
        Assert.assertSame(p, p.plusHours(0));
        Assert.assertSame(p, p.plusMinutes(0));
        Assert.assertSame(p, p.plusSeconds(0));
        Assert.assertSame(p, p.plusMillis(0));
    }

    @Test
    public void plusIndividualFields_givenNonZero_shouldAddValues() {
        Period p = new Period();
        Assert.assertEquals(2, p.plusYears(2).getYears());
        Assert.assertEquals(3, p.plusMonths(3).getMonths());
        Assert.assertEquals(4, p.plusWeeks(4).getWeeks());
        Assert.assertEquals(5, p.plusDays(5).getDays());
        Assert.assertEquals(6, p.plusHours(6).getHours());
        Assert.assertEquals(7, p.plusMinutes(7).getMinutes());
        Assert.assertEquals(8, p.plusSeconds(8).getSeconds());
        Assert.assertEquals(9, p.plusMillis(9).getMillis());
    }

    @Test
    public void minus_givenNullPeriod_shouldReturnSameInstance() {
        Period p = new Period(1, 2, 3, 4);
        Assert.assertSame(p, p.minus(null));
    }

    @Test
    public void minus_givenValidPeriod_shouldSubtractAllFields() {
        Period p1 = new Period(10, 10, 10, 10, 10, 10, 10, 10);
        Period p2 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period res = p1.minus(p2);
        Assert.assertEquals(9, res.getYears());
        Assert.assertEquals(8, res.getMonths());
        Assert.assertEquals(7, res.getWeeks());
        Assert.assertEquals(6, res.getDays());
        Assert.assertEquals(5, res.getHours());
        Assert.assertEquals(4, res.getMinutes());
        Assert.assertEquals(3, res.getSeconds());
        Assert.assertEquals(2, res.getMillis());
    }

    @Test
    public void minusIndividualFields_givenZero_shouldReturnSameInstance() {
        Period p = new Period(5, 5, 5, 5, 5, 5, 5, 5);
        Assert.assertSame(p, p.minusYears(0));
        Assert.assertSame(p, p.minusMonths(0));
        Assert.assertSame(p, p.minusWeeks(0));
        Assert.assertSame(p, p.minusDays(0));
        Assert.assertSame(p, p.minusHours(0));
        Assert.assertSame(p, p.minusMinutes(0));
        Assert.assertSame(p, p.minusSeconds(0));
        Assert.assertSame(p, p.minusMillis(0));
    }

    @Test
    public void minusIndividualFields_givenNonZero_shouldSubtractValues() {
        Period p = new Period(10, 10, 10, 10, 10, 10, 10, 10);
        Assert.assertEquals(9, p.minusYears(1).getYears());
        Assert.assertEquals(8, p.minusMonths(2).getMonths());
        Assert.assertEquals(7, p.minusWeeks(3).getWeeks());
        Assert.assertEquals(