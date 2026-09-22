package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HelpFormatterTest {
    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
    }

    @After
    public void tearDown() {
        printWriter.close();
    }

    @Test
    public void testDefaultValues() {
        assertEquals(74, formatter.getWidth());
        assertEquals(1, formatter.getLeftPadding());
        assertEquals(3, formatter.getDescPadding());
        assertEquals("usage: ", formatter.getSyntaxPrefix());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getNewLine());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setNewLine("\n");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("//");
        formatter.setArgName("param");
        
        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("\n", formatter.getNewLine());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("//", formatter.getLongOptPrefix());
        assertEquals("param", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparatorNullUsesDefault() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorCustom() {
        java.util.Comparator custom = new java.util.Comparator() {
            public int compare(Object o1, Object o2) { return 0; }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpWithNullCmdLineSyntax() {
        formatter.printHelp(printWriter, 74, null, "header", new Options(), 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpWithEmptyCmdLineSyntax() {
        formatter.printHelp(printWriter, 74, "", "header", new Options(), 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelpBasicWithoutAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        formatter.printHelp(printWriter, 74, "app", "Header", options, 1, 3, "Footer", false);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("Header"));
        assertTrue(result.contains("Footer"));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--alpha"));
        assertTrue(result.contains("Alpha option"));
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        Options options = new Options();
        Option req = new Option("r", "required", true, "Required arg");
        req.setRequired(true);
        options.addOption(req);
        formatter.printHelp(printWriter, 74, "app", null, options, 1, 3, null, true);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("<required>"));
    }

    @Test
    public void testPrintUsageWithOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha");
        options.addOption("b", false, "Beta");
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("-a <arg>"));
        assertTrue(result.contains("--alpha"));
        assertTrue(result.contains("-b"));
    }

    @Test
    public void testPrintUsageWithOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "Alpha"));
        group.addOption(new Option("b", "beta", false, "Beta"));
        options.addOptionGroup(group);
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("["));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("|"));
        assertTrue(result.contains("]"));
    }

    @Test
    public void testPrintUsageWithGroupAndRequired() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", "xi", false, "Xi"));
        options.addOptionGroup(group);
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        assertFalse(result.contains("["));
        assertTrue(result.contains("-x"));
        assertTrue(result.contains("--xi"));
    }

    @Test
    public void testPrintUsageWithRequiredOption() {
        Options options = new Options();
        Option opt = new Option("r", "req", true, "Required");
        opt.setRequired(true);
        options.addOption(opt);
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("-r <arg>"));
        assertTrue(result.contains("--req"));
    }

    @Test
    public void testPrintUsageWithRequiredGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", "alpha", false, "Alpha"));
        options.addOptionGroup(group);
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        assertFalse(result.contains("["));
        assertTrue(result.contains("-a"));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha desc");
        options.addOption("b", false, "Beta desc");
        formatter.printOptions(printWriter, 74, options, 1, 3);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--alpha"));
        assertTrue(result.contains("<arg>"));
        assertTrue(result.contains("Alpha desc"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("Beta desc"));
    }

    @Test
    public void testPrintWrappedNoWrap() {
        formatter.printWrapped(printWriter, 74, "short text");
        printWriter.flush();
        assertEquals("short text" + formatter.getNewLine(), stringWriter.toString());
    }

    @Test
    public void testPrintWrappedWithWrap() {
        String longText = "This is a very long text that should be wrapped at some point when rendered";
        formatter.printWrapped(printWriter, 20, longText);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.indexOf('\n') > 0);
    }

    @Test
    public void testFindWrapPosWithNewline() {
        String text = "hello\nworld";
        assertEquals(6, formatter.findWrapPos(text, 74, 0));
    }

    @Test
    public void testFindWrapPosWithTab() {
        String text = "hello\tworld";
        assertEquals(6, formatter.findWrapPos(text, 74, 0));
    }

    @Test
    public void testFindWrapPosFitsWidth() {
        assertEquals(-1, formatter.findWrapPos("short", 74, 0));
    }

    @Test
    public void testFindWrapPosAtSpace() {
        String text = "hello world";
        assertEquals(5, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosNoSpaceBeforeWidth() {
        assertEquals(-1, formatter.findWrapPos("hello", 74, 0));
    }

    @Test
    public void testFindWrapPosWidthAtEnd() {
        String text = "hello";
        assertEquals(-1, formatter.findWrapPos(text, 10, 0));
    }

    @Test(expected = IllegalStateException.class)
    public void testRenderWrappedTextIndentTooLarge() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 10, "some text to wrap that is long enough");
    }

    @Test
    public void testRenderWrappedTextSimple() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 2, "hello world");
        String result = sb.toString();
        assertTrue(result.contains("hello"));
        assertTrue(result.contains("world"));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("  ", formatter.createPadding(2));
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testRtrim() {
        assertEquals("hello", formatter.rtrim("hello   "));
        assertEquals("hello", formatter.rtrim("hello"));
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testPrintHelpWithAllContent() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option with arg");
        options.addOption("b", false, "Beta option");
        options.addOption("c", "gamma", false, "Gamma with long name only");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 50, "MyApp", "Header text", options, 2, 4, "Footer text", false);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: MyApp"));
        assertTrue(result.contains("Header text"));
        assertTrue(result.contains("Footer text"));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--alpha"));
        assertTrue(result.contains("<arg>"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("--gamma"));
    }

    @Test
    public void testPrintHelpMultipleOverloads() {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        formatter.printHelp("app", options);
        formatter.printHelp("app", options, true);
        formatter.printHelp("app", "header", options, "footer");
        formatter.printHelp("app", "header", options, "footer", true);
        formatter.printHelp(80, "app", "header", options, "footer");
        formatter.printHelp(80, "app", "header", options, "footer", true);
    }

    @Test
    public void testPrintWrappedOverloads() {
        PrintWriter pw = new PrintWriter(System.out);
        formatter.printWrapped(pw, 20, "test text");
        formatter.printWrapped(pw, 20, 5, "test text for wrap");
    }

    @Test
    public void testRenderOptionsWithOptionGroups() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("g1", "group1", false, "Group 1"));
        group.addOption(new Option("g2", "group2", false, "Group 2"));
        options.addOptionGroup(group);
        Option normal = new Option("n", "normal", false, "Normal");
        options.addOption(normal);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 74, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-g1"));
        assertTrue(result.contains("--group1"));
        assertTrue(result.contains("-g2"));
        assertTrue(result.contains("--group2"));
        assertTrue(result.contains("-n"));
        assertTrue(result.contains("--normal"));
    }
}