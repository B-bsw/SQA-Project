package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZoneInfoCompilerTest {

    private PrintStream originalOut;
    private PrintStream originalErr;
    private ByteArrayOutputStream outContent;
    private File tempDir;

    @Before
    public void setUp() throws Exception {
        originalOut = System.out;
        originalErr = System.err;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        File sysTemp = new File(System.getProperty("java.io.tmpdir"));
        tempDir = new File(sysTemp, "zic_test_" + System.currentTimeMillis());
        if (!tempDir.mkdirs()) {
            throw new IOException("Failed to create temporary test directory: " + tempDir);
        }
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
        deleteRecursive(tempDir);
    }

    private void deleteRecursive(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (int i = 0; i < children.length; i++) {
                    deleteRecursive(children[i]);
                }
            }
        }
        file.delete();
    }

    @Test
    public void verbose_defaultState_shouldReturnFalse() {
        // Arrange & Act
        boolean isVerbose = ZoneInfoCompiler.verbose();

        // Assert
        Assert.assertFalse(isVerbose);
    }

    @Test
    public void getStartOfYear_invokedMultipleTimes_shouldReturnSameSingletonInstance() {
        // Act
        ZoneInfoCompiler.DateTimeOfYear first = ZoneInfoCompiler.getStartOfYear();
        ZoneInfoCompiler.DateTimeOfYear second = ZoneInfoCompiler.getStartOfYear();

        // Assert
        Assert.assertNotNull(first);
        Assert.assertSame(first, second);
        Assert.assertEquals(1, first.iMonthOfYear);
        Assert.assertEquals(1, first.iDayOfMonth);
        Assert.assertEquals(0, first.iDayOfWeek);
        Assert.assertFalse(first.iAdvanceDayOfWeek);
        Assert.assertEquals(0, first.iMillisOfDay);
        Assert.assertEquals('w', first.iZoneChar);
    }

    @Test
    public void getLenientISOChronology_invokedMultipleTimes_shouldReturnSameSingletonInstance() {
        // Act
        Chronology first = ZoneInfoCompiler.getLenientISOChronology();
        Chronology second = ZoneInfoCompiler.getLenientISOChronology();

        // Assert
        Assert.assertNotNull(first);
        Assert.assertSame(first, second);
    }

    @Test
    public void parseYear_givenMinimumKeywords_shouldReturnIntegerMinValue() {
        // Act & Assert
        Assert.assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 1970));
        Assert.assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 1970));
        Assert.assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MINIMUM", 1970));
        Assert.assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MIN", 1970));
    }

    @Test
    public void parseYear_givenMaximumKeywords_shouldReturnIntegerMaxValue() {
        // Act & Assert
        Assert.assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 1970));
        Assert.assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("max", 1970));
        Assert.assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAXIMUM", 1970));
        Assert.assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAX", 1970));
    }

    @Test
    public void parseYear_givenOnlyKeyword_shouldReturnDefaultValue() {
        // Act & Assert
        Assert.assertEquals(2005, ZoneInfoCompiler.parseYear("only", 2005));
        Assert.assertEquals(1980, ZoneInfoCompiler.parseYear("ONLY", 1980));
    }

    @Test
    public void parseYear_givenNumericStrings_shouldParseSuccessfully() {
        // Act & Assert
        Assert.assertEquals(1996, ZoneInfoCompiler.parseYear("1996", 2000));
        Assert.assertEquals(0, ZoneInfoCompiler.parseYear("0", 2000));
        Assert.assertEquals(-50, ZoneInfoCompiler.parseYear("-50", 2000));
    }

    @Test(expected = NumberFormatException.class)
    public void parseYear_givenInvalidString_shouldThrowNumberFormatException() {
        ZoneInfoCompiler.parseYear("invalid", 2000);
    }

    @Test
    public void parseMonth_givenValidMonthNames_shouldReturnCorrectMonthNumber() {
        // Act & Assert
        Assert.assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        Assert.assertEquals(1, ZoneInfoCompiler.parseMonth("January"));
        Assert.assertEquals(2, ZoneInfoCompiler.parseMonth("Feb"));
        Assert.assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
        Assert.assertEquals(12, ZoneInfoCompiler.parseMonth("December"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMonth_givenInvalidMonthName_shouldThrowIllegalArgumentException() {
        ZoneInfoCompiler.parseMonth("NotAMonth");
    }

    @Test
    public void parseDayOfWeek_givenValidDayNames_shouldReturnCorrectDayOfWeekNumber() {
        // Act & Assert
        Assert.assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        Assert.assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Monday"));
        Assert.assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
        Assert.assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sunday"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseDayOfWeek_givenInvalidDayName_shouldThrowIllegalArgumentException() {
        ZoneInfoCompiler.parseDayOfWeek("NotADay");
    }

    @Test
    public void parseOptional_givenDash_shouldReturnNull() {
        Assert.assertNull(ZoneInfoCompiler.parseOptional("-"));
    }

    @Test
    public void parseOptional_givenNonDashString_shouldReturnOriginalString() {
        Assert.assertEquals("standard", ZoneInfoCompiler.parseOptional("standard"));
        Assert.assertEquals("", ZoneInfoCompiler.parseOptional(""));
    }

    @Test
    public void parseTime_givenValidTimeFormats_shouldReturnMillisCorrectly() {
        // Act & Assert
        Assert.assertEquals(0, ZoneInfoCompiler.parseTime("0"));
        Assert.assertEquals(0, ZoneInfoCompiler.parseTime("0:00"));
        Assert.assertEquals(3600000, ZoneInfoCompiler.parseTime("1:00"));
        Assert.assertEquals(3661000, ZoneInfoCompiler.parseTime("1:01:01"));
        Assert.assertEquals(-3600000, ZoneInfoCompiler.parseTime("-1:00"));
        Assert.assertEquals(-7200000, ZoneInfoCompiler.parseTime("-02:00:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseTime_givenInvalidFormat_shouldThrowIllegalArgumentException() {
        ZoneInfoCompiler.parseTime("invalid:time:format");
    }

    @Test
    public void parseZoneChar_givenAllZoneCharVariations_shouldReturnExpectedStandardChar() {
        // 's' or 'S'
        Assert.assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        Assert.assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));

        // 'u', 'U', 'g', 'G', 'z', 'Z'
        Assert.assertEquals('u', ZoneInfoCompiler.parseZoneChar('u'));
        Assert.assertEquals('u', ZoneInfoCompiler.parseZoneChar('U'));
        Assert.assertEquals('u', ZoneInfoCompiler.parseZoneChar('g'));
        Assert.assertEquals('u', ZoneInfoCompiler.parseZoneChar('G'));
        Assert.assertEquals('u', ZoneInfoCompiler.parseZoneChar('z'));
        Assert.assertEquals('u', ZoneInfoCompiler.parseZoneChar('Z'));

        // 'w', 'W' or default
        Assert.assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
        Assert.assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
        Assert.assertEquals('w', ZoneInfoCompiler.parseZoneChar('x'));
        Assert.assertEquals('w', ZoneInfoCompiler.parseZoneChar(' '));
    }

    @Test
    public void test_givenIdMismatch_shouldReturnTrueDirectly() {
        // Arrange
        DateTimeZone tz = DateTimeZone.UTC;

        // Act & Assert
        Assert.assertTrue(ZoneInfoCompiler.test("MismatchID", tz));
    }

    @Test
    public void test_givenUtcDateTimeZone_shouldPassVerification() {
        // Arrange
        DateTimeZone tz = DateTimeZone.UTC;

        // Act & Assert
        Assert.assertTrue(ZoneInfoCompiler.test(tz.getID(), tz));
    }

    @Test
    public void writeZoneInfoMap_givenValidZoneMap_shouldSerializeSuccessfully() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);
        Map<String, DateTimeZone> map = new HashMap<String, DateTimeZone>();
        map.put("UTC", DateTimeZone.UTC);

        // Act
        ZoneInfoCompiler.writeZoneInfoMap(dout, map);
        dout.flush();

        // Assert
        byte[] bytes = baos.toByteArray();
        Assert.assertTrue(bytes.length > 0);
    }

    @Test
    public void dateTimeOfYear_defaultConstructor_shouldInitializeDefaults() {
        // Arrange & Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear();

        // Assert
        Assert.assertEquals(1, dt.iMonthOfYear);
        Assert.assertEquals(1, dt.iDayOfMonth);
        Assert.assertEquals(0, dt.iDayOfWeek);
        Assert.assertFalse(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(0, dt.iMillisOfDay);
        Assert.assertEquals('w', dt.iZoneChar);
        Assert.assertTrue(dt.toString().indexOf("MonthOfYear: 1") >= 0);
    }

    @Test
    public void dateTimeOfYear_tokenizerEmpty_shouldUseDefaults() {
        // Arrange
        StringTokenizer st = new StringTokenizer("");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(1, dt.iMonthOfYear);
        Assert.assertEquals(1, dt.iDayOfMonth);
        Assert.assertEquals(0, dt.iDayOfWeek);
        Assert.assertFalse(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(0, dt.iMillisOfDay);
        Assert.assertEquals('w', dt.iZoneChar);
    }

    @Test
    public void dateTimeOfYear_tokenizerMonthOnly_shouldParseMonthAndDefaultOthers() {
        // Arrange
        StringTokenizer st = new StringTokenizer("Mar");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(3, dt.iMonthOfYear);
        Assert.assertEquals(1, dt.iDayOfMonth);
        Assert.assertEquals(0, dt.iDayOfWeek);
        Assert.assertFalse(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(0, dt.iMillisOfDay);
    }

    @Test
    public void dateTimeOfYear_tokenizerLastDayOfWeek_shouldParseCorrectly() {
        // Arrange
        StringTokenizer st = new StringTokenizer("Oct lastSun 2:00s");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(10, dt.iMonthOfYear);
        Assert.assertEquals(-1, dt.iDayOfMonth);
        Assert.assertEquals(7, dt.iDayOfWeek);
        Assert.assertFalse(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(7200000, dt.iMillisOfDay);
        Assert.assertEquals('s', dt.iZoneChar);
    }

    @Test
    public void dateTimeOfYear_tokenizerDayGreaterOrEqual_shouldParseAdvanceTrue() {
        // Arrange
        StringTokenizer st = new StringTokenizer("Apr Sun>=1 03:00u");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(4, dt.iMonthOfYear);
        Assert.assertEquals(1, dt.iDayOfMonth);
        Assert.assertEquals(7, dt.iDayOfWeek);
        Assert.assertTrue(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(10800000, dt.iMillisOfDay);
        Assert.assertEquals('u', dt.iZoneChar);
    }

    @Test
    public void dateTimeOfYear_tokenizerDayLessOrEqual_shouldParseAdvanceFalse() {
        // Arrange
        StringTokenizer st = new StringTokenizer("Sep Mon<=15 01:30g");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(9, dt.iMonthOfYear);
        Assert.assertEquals(15, dt.iDayOfMonth);
        Assert.assertEquals(1, dt.iDayOfWeek);
        Assert.assertFalse(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(5400000, dt.iMillisOfDay);
        Assert.assertEquals('u', dt.iZoneChar);
    }

    @Test
    public void dateTimeOfYear_tokenizerTwentyFourHundredWithLastDay_shouldAdvanceToNextMonth() {
        // Arrange
        StringTokenizer st = new StringTokenizer("Jan lastSun 24:00");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(2, dt.iMonthOfYear);
        Assert.assertFalse(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(0, dt.iMillisOfDay);
    }

    @Test
    public void dateTimeOfYear_tokenizerTwentyFourHundredWithSpecificDay_shouldAdvanceToNextDay() {
        // Arrange
        StringTokenizer st = new StringTokenizer("Jan 15 24:00");

        // Act
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);

        // Assert
        Assert.assertEquals(1, dt.iMonthOfYear);
        Assert.assertEquals(16, dt.iDayOfMonth);
        Assert.assertTrue(dt.iAdvanceDayOfWeek);
        Assert.assertEquals(0, dt.iMillisOfDay);
    }

    @Test(expected = IllegalArgumentException.class)
    public void dateTimeOfYear_tokenizerInvalidDaySpecification_shouldThrowIllegalArgumentException() {
        StringTokenizer st = new StringTokenizer("Jan InvalidDayFormat 01:00");
        new ZoneInfoCompiler.DateTimeOfYear(st);
    }

    @Test
    public void dateTimeOfYear_addCutoverAndRecurring_shouldExecuteWithoutException() {
        // Arrange
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear();

        // Act
        dt.addCutover(builder, 2000);
        dt.addRecurring(builder, "TEST", 3600000, 1970, 2010);

        // Assert
        Assert.assertNotNull(builder.toDateTimeZone("TestZone", true));
    }

    @Test
    public void parseDataFile_commentsAndEmptyLines_shouldIgnoreGracefully() throws IOException {
        // Arrange
        String tzData = "\n# Just a comment\n   \n   # Indented comment\n";
        BufferedReader reader = new BufferedReader(new StringReader(tzData));
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        compiler.parseDataFile(reader);

        // Assert
        Map<String, DateTimeZone> map = compiler.compile(null, null);
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void parseDataFile_unknownToken_shouldPrintUnknownLine() throws IOException {
        // Arrange
        String tzData = "UnknownKeyword foo bar\n";
        BufferedReader reader = new BufferedReader(new StringReader(tzData));
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        compiler.parseDataFile(reader);

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Unknown line: UnknownKeyword foo bar") >= 0);
    }

    @Test
    public void compile_validZoneAndRule_shouldCompileAndReturnZoneMap() throws Exception {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("Rule US 1918 1919 - Mar lastSun 2:00 1:00 D\n");
        sb.append("Rule US 1918 1919 - Oct lastSun 2:00 0 S\n");
        sb.append("Zone America/Mock -4:56:02 - LMT 1883 Nov 18 12:03:58\n");
        sb.append("                  -5:00 US E%sT 1920\n");
        sb.append("                  -5:00 - EST\n");
        sb.append("Link America/Mock America/Mock_Alias\n");

        File dataFile = new File(tempDir, "mock_tzdata");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(sb.toString());
        writer.close();

        File outputDir = new File(tempDir, "output");
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        Map<String, DateTimeZone> result = compiler.compile(outputDir, new File[] { dataFile });

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.containsKey("America/Mock"));
        Assert.assertTrue(result.containsKey("America/Mock_Alias"));

        File generatedFile = new File(outputDir, "America/Mock");
        Assert.assertTrue(generatedFile.exists());
        File mapFile = new File(outputDir, "ZoneInfoMap");
        Assert.assertTrue(mapFile.exists());
    }

    @Test
    public void compile_zoneWithFixedOffsetRules_shouldCompileProperly() throws Exception {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("Zone Fixed/Mock 1:00 - FIX 1980\n");
        sb.append("                2:00 1:00 FIX_DST\n");

        File dataFile = new File(tempDir, "fixed_mock");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(sb.toString());
        writer.close();

        File outputDir = new File(tempDir, "output_fixed");
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        Map<String, DateTimeZone> result = compiler.compile(outputDir, new File[] { dataFile });

        // Assert
        Assert.assertTrue(result.containsKey("Fixed/Mock"));
    }

    @Test
    public void compile_zoneWithSlashFormat_shouldFormatCorrectly() throws Exception {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("Rule TestRule 2000 2005 - Mar 1 2:00 1:00 D\n");
        sb.append("Rule TestRule 2000 2005 - Oct 1 2:00 0 S\n");
        sb.append("Zone Slash/Mock 0:00 TestRule GMT/BST\n");

        File dataFile = new File(tempDir, "slash_mock");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(sb.toString());
        writer.close();

        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        Map<String, DateTimeZone> result = compiler.compile(null, new File[] { dataFile });

        // Assert
        Assert.assertTrue(result.containsKey("Slash/Mock"));
    }

    @Test
    public void compile_unresolvableLink_shouldWarnInPassTwo() throws Exception {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("Link NonExistentZone AliasZone\n");

        File dataFile = new File(tempDir, "orphan_link");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(sb.toString());
        writer.close();

        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        compiler.compile(null, new File[] { dataFile });

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Cannot find time zone 'NonExistentZone'") >= 0);
    }

    @Test(expected = IOException.class)
    public void compile_destinationIsFile_shouldThrowIOException() throws Exception {
        // Arrange
        File notADir = new File(tempDir, "not_a_dir.txt");
        if (!notADir.createNewFile()) {
            throw new IOException("Failed to create file");
        }
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();

        // Act
        compiler.compile(notADir, null);
    }

    @Test
    public void main_noArguments_shouldPrintUsage() throws Exception {
        // Act
        ZoneInfoCompiler.main(new String[0]);

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Usage: java org.joda.time.tz.ZoneInfoCompiler") >= 0);
    }

    @Test
    public void main_helpFlag_shouldPrintUsage() throws Exception {
        // Act
        ZoneInfoCompiler.main(new String[] { "-?" });

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Usage: java org.joda.time.tz.ZoneInfoCompiler") >= 0);
    }

    @Test
    public void main_missingSrcValue_shouldPrintUsage() throws Exception {
        // Act
        ZoneInfoCompiler.main(new String[] { "-src" });

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Usage: java org.joda.time.tz.ZoneInfoCompiler") >= 0);
    }

    @Test
    public void main_onlyFlagsWithoutSources_shouldPrintUsage() throws Exception {
        // Act
        ZoneInfoCompiler.main(new String[] { "-verbose" });

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Usage: java org.joda.time.tz.ZoneInfoCompiler") >= 0);
    }

    @Test
    public void main_fullExecutionWithVerboseAndSources_shouldCompleteExecution() throws Exception {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("Zone Minimal/Mock 0:00 - UTC\n");

        File srcDir = new File(tempDir, "src");
        srcDir.mkdirs();
        File dataFile = new File(srcDir, "sample.data");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(sb.toString());
        writer.close();

        File dstDir = new File(tempDir, "dst");

        String[] args = new String[] {
            "-verbose",
            "-src", srcDir.getAbsolutePath(),
            "-dst", dstDir.getAbsolutePath(),
            "sample.data"
        };

        // Act
        ZoneInfoCompiler.main(args);

        // Assert
        Assert.assertTrue(ZoneInfoCompiler.verbose());
        File generatedFile = new File(dstDir, "Minimal/Mock");
        Assert.assertTrue(generatedFile.exists());
    }

    @Test
    public void main_unknownOptionEncountered_shouldBreakAndParseRemainingAsFiles() throws Exception {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("Zone UnknownOption/Mock 0:00 - UTC\n");

        File dataFile = new File(tempDir, "unknown_opt.data");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(sb.toString());
        writer.close();

        String[] args = new String[] {
            "-unknownOption",
            dataFile.getAbsolutePath()
        };

        // Act
        ZoneInfoCompiler.main(args);

        // Assert
        Assert.assertTrue(outContent.toString().indexOf("Writing zoneinfo files") >= 0);
    }
}