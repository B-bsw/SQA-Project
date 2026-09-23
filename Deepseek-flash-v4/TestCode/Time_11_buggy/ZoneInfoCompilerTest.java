package org.joda.time.tz;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;
import org.joda.time.*;

public class ZoneInfoCompilerTest {
    private ZoneInfoCompiler compiler;
    private File tempDir;
    private File outputDir;

    @Before
    public void setUp() throws Exception {
        compiler = new ZoneInfoCompiler();
        tempDir = File.createTempFile("zic", ".dir");
        tempDir.delete();
        tempDir.mkdirs();
        outputDir = new File(tempDir, "out");
        outputDir.mkdirs();
    }

    @Test
    public void testVerboseDefaultFalse() {
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
        assertFalse(ZoneInfoCompiler.verbose());
    }

    @Test
    public void testVerboseSetTrue() {
        ZoneInfoCompiler.cVerbose.set(Boolean.TRUE);
        assertTrue(ZoneInfoCompiler.verbose());
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
    }

    @Test
    public void testGetStartOfYearInitializes() {
        ZoneInfoCompiler.cStartOfYear = null;
        assertNotNull(ZoneInfoCompiler.getStartOfYear());
    }

    @Test
    public void testGetStartOfYearCached() {
        ZoneInfoCompiler.cStartOfYear = null;
        ZoneInfoCompiler.DateTimeOfYear first = ZoneInfoCompiler.getStartOfYear();
        assertSame(first, ZoneInfoCompiler.getStartOfYear());
    }

    @Test
    public void testGetLenientISOChronologyInitializes() {
        ZoneInfoCompiler.cLenientISO = null;
        assertNotNull(ZoneInfoCompiler.getLenientISOChronology());
    }

    @Test
    public void testGetLenientISOChronologyCached() {
        ZoneInfoCompiler.cLenientISO = null;
        Object first = ZoneInfoCompiler.getLenientISOChronology();
        assertSame(first, ZoneInfoCompiler.getLenientISOChronology());
    }

    @Test
    public void testWriteZoneInfoMapBasic() throws IOException {
        Map<String, DateTimeZone> map = new TreeMap<String, DateTimeZone>();
        map.put("UTC", DateTimeZone.UTC);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);
        ZoneInfoCompiler.writeZoneInfoMap(dout, map);
        dout.flush();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testWriteZoneInfoMapEmpty() throws IOException {
        Map<String, DateTimeZone> map = new TreeMap<String, DateTimeZone>();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);
        try {
            ZoneInfoCompiler.writeZoneInfoMap(dout, map);
            byte[] data = baos.toByteArray();
            assertTrue(data.length >= 4);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testParseYearMinimum() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 2000));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 2000));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MIN", 2000));
    }

    @Test
    public void testParseYearMaximum() {
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 2000));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("max", 2000));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAX", 2000));
    }

    @Test
    public void testParseYearOnly() {
        assertEquals(2000, ZoneInfoCompiler.parseYear("only", 2000));
    }

    @Test
    public void testParseYearNumeric() {
        assertEquals(1999, ZoneInfoCompiler.parseYear("1999", 2000));
    }

    @Test
    public void testParseYearInvalid() {
        try {
            ZoneInfoCompiler.parseYear("abc", 2000);
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testParseMonthValid() {
        int month = ZoneInfoCompiler.parseMonth("January");
        assertEquals(1, month);
        month = ZoneInfoCompiler.parseMonth("Jan");
        assertEquals(1, month);
        month = ZoneInfoCompiler.parseMonth("december");
        assertEquals(12, month);
    }

    @Test
    public void testParseMonthInvalid() {
        try {
            ZoneInfoCompiler.parseMonth("NotAMonth");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseDayOfWeekValid() {
        int dow = ZoneInfoCompiler.parseDayOfWeek("Monday");
        assertEquals(1, dow);
        dow = ZoneInfoCompiler.parseDayOfWeek("Sunday");
        assertEquals(7, dow);
    }

    @Test
    public void testParseDayOfWeekInvalid() {
        try {
            ZoneInfoCompiler.parseDayOfWeek("Funday");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOptionalDashReturnsNull() {
        assertNull(ZoneInfoCompiler.parseOptional("-"));
    }

    @Test
    public void testParseOptionalNonDash() {
        assertEquals("abc", ZoneInfoCompiler.parseOptional("abc"));
        assertNull(ZoneInfoCompiler.parseOptional("-"));
        assertEquals("", ZoneInfoCompiler.parseOptional(""));
    }

    @Test
    public void testParseTimePositive() {
        int millis = ZoneInfoCompiler.parseTime("12:30");
        assertEquals(45000000, millis);
    }

    @Test
    public void testParseTimeNegative() {
        int millis = ZoneInfoCompiler.parseTime("-01:00");
        assertEquals(-3600000, millis);
    }

    @Test
    public void testParseTimeZero() {
        int millis = ZoneInfoCompiler.parseTime("00:00");
        assertEquals(0, millis);
    }

    @Test
    public void testParseTimeInvalid() {
        try {
            ZoneInfoCompiler.parseTime("notatime");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseZoneCharLowerCase() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('u'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('g'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
    }

    @Test
    public void testParseZoneCharUpperCase() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('U'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('G'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
    }

    @Test
    public void testParseZoneCharDefault() {
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('x'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('Y'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('?'));
    }

    @Test
    public void testTestMismatchedIds() {
        assertFalse(ZoneInfoCompiler.test("UTC", DateTimeZone.forID("America/New_York")));
    }

    @Test
    public void testTestMatching() {
        assertTrue(ZoneInfoCompiler.test("UTC", DateTimeZone.UTC));
    }

    @Test
    public void testCompileNullSources() throws IOException {
        Map<String, DateTimeZone> result = compiler.compile(outputDir, null);
        assertNull(result);
    }

    @Test
    public void testCompileEmptySources() throws IOException {
        File[] sources = new File[0];
        Map<String, DateTimeZone> result = new HashMap<String, DateTimeZone>();
        try {
            result = compiler.compile(outputDir, sources);
        } catch (Exception e) {
            // Since sources is empty, iZones should be empty and map should be empty
        }
    }

    @Test
    public void testCompileOutputDirNull() throws IOException {
        File[] sources = new File[0];
        Map<String, DateTimeZone> result = compiler.compile(null, sources);
        assertNull(result);
    }

    @Test
    public void testCompileNonExistentOutputDir() throws IOException {
        File nonExistent = new File(tempDir, "nonexistent");
        File[] sources = new File[0];
        Map<String, DateTimeZone> result = compiler.compile(nonExistent, sources);
        assertNotNull(result);
    }

    @Test
    public void testParseDataFileValidRules() throws IOException {
        File dataFile = new File(tempDir, "test.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile));
        writer.write("Rule\tUS\t1970\t2000\t-\tMar\tSun\tlast\t2:00\t0\tS\n");
        writer.close();
        try {
            BufferedReader in = new BufferedReader(new FileReader(dataFile));
            compiler.iRuleSets.clear();
            compiler.iZones.clear();
            compiler.iLinks.clear();
            compiler.parseDataFile(in);
            in.close();
            assertTrue(compiler.iRuleSets.size() > 0);
        } catch (Exception e) {
            fail("Unexpected: " + e.getMessage());
        }
    }

    @Test
    public void testParseDataFileEmptyLine() throws IOException {
        File dataFile = new File(tempDir, "empty.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile));
        writer.write("\n\n");
        writer.write("# comment\n");
        writer.close();
        BufferedReader in = new BufferedReader(new FileReader(dataFile));
        compiler.iRuleSets.clear();
        compiler.iZones.clear();
        compiler.iLinks.clear();
        try {
            compiler.parseDataFile(in);
        } catch (Exception e) {
            fail("Should not throw: " + e.getMessage());
        } finally {
            in.close();
        }
    }

    @Test
    public void testParseDataFileZone() throws IOException {
        File dataFile = new File(tempDir, "zone.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile));
        writer.write("Zone\tAmerica/New_York\t-5:00\tUS\tE%sT\n");
        writer.close();
        BufferedReader in = new BufferedReader(new FileReader(dataFile));
        compiler.iRuleSets.clear();
        compiler.iZones.clear();
        compiler.iLinks.clear();
        try {
            compiler.parseDataFile(in);
            assertEquals(1, compiler.iZones.size());
        } catch (Exception e) {
            fail("Unexpected: " + e.getMessage());
        } finally {
            in.close();
        }
    }

    @Test
    public void testParseDataFileLink() throws IOException {
        File dataFile = new File(tempDir, "link.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile));
        writer.write("Link\tAmerica/New_York\tUS/Eastern\n");
        writer.close();
        BufferedReader in = new BufferedReader(new FileReader(dataFile));
        compiler.iRuleSets.clear();
        compiler.iZones.clear();
        compiler.iLinks.clear();
        try {
            compiler.parseDataFile(in);
            assertEquals(1, compiler.iLinks.size());
        } catch (Exception e) {
            fail("Unexpected: " + e.getMessage());
        } finally {
            in.close();
        }
    }

    @Test
    public void testZoneAddToBuilderWithRules() {
        ZoneInfoCompiler.Zone zone = new ZoneInfoCompiler.Zone(0, "US", "E%sT", Integer.MAX_VALUE, null);
        ZoneInfoCompiler.DateTimeZoneBuilder builder = new ZoneInfoCompiler.DateTimeZoneBuilder();
        Map<String, ZoneInfoCompiler.RuleSet> ruleSets = new HashMap<String, ZoneInfoCompiler.RuleSet>();
        ZoneInfoCompiler.RuleSet rs = new ZoneInfoCompiler.RuleSet("US");
        ZoneInfoCompiler.Rule rule = new ZoneInfoCompiler.Rule("US", 2000, 2010, "-", new ZoneInfoCompiler.DateTimeOfYear(), 0, "S");
        rs.addRule(rule);
        ruleSets.put("US", rs);
        zone.iRules = "US";
        try {
            zone.addToBuilder(builder, ruleSets);
        } catch (Exception e) {
            fail("Should not throw: " + e.getMessage());
        }
    }

    @Test
    public void testZoneToString() {
        ZoneInfoCompiler.Zone zone = new ZoneInfoCompiler.Zone(1000, "US", "E%sT", 2020, null);
        assertNotNull(zone.toString());
    }

    @Test
    public void testZoneToStringWithNext() {
        ZoneInfoCompiler.Zone zone = new ZoneInfoCompiler.Zone(1000, "US", "E%sT", 2020, null);
        zone.iNext = new ZoneInfoCompiler.Zone(2000, "US", "E%sT", 2021, null);
        String s = zone.toString();
        assertTrue(s.contains("..."));
    }

    @Test
    public void testRuleConstructorValidation() {
        try {
            new ZoneInfoCompiler.Rule("R", 2020, 2019, "-", new ZoneInfoCompiler.DateTimeOfYear(), 0, "S");
            fail("Should throw IllegalArgumentException for iToYear < iFromYear");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRuleAddRecurring() {
        ZoneInfoCompiler.Rule rule = new ZoneInfoCompiler.Rule("R", 2020, 2022, "-",
                new ZoneInfoCompiler.DateTimeOfYear(), 3600000, "S");
        ZoneInfoCompiler.DateTimeZoneBuilder builder = new ZoneInfoCompiler.DateTimeZoneBuilder();
        try {
            rule.addRecurring(builder, "E%sT");
        } catch (Exception e) {
            fail("Should not throw: " + e.getMessage());
        }
    }

    @Test
    public void testDateTimeOfYearMonth() {
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear();
        assertEquals(1, dt.iMonthOfYear);
        assertEquals(1, dt.iDayOfMonth);
        assertEquals(0, dt.iDayOfWeek);
        assertFalse(dt.iAdvanceDayOfWeek);
        assertEquals(0, dt.iMillisOfDay);
        assertEquals('s', dt.iZoneChar);
    }

    @Test
    public void testDateTimeOfYearToString() {
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear();
        assertNotNull(dt.toString());
    }
}