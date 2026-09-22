package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.*;

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
        assertEquals(" ", formatter.getLongOptSeparator());
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(5);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("//");
        formatter.setLongOptSeparator("=");
        formatter.setArgName("value");
        
        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(5, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("//", formatter.getLongOptPrefix());
        assertEquals("=", formatter.getLongOptSeparator());
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparatorNull() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertTrue(formatter.getOptionComparator() instanceof HelpFormatter.OptionComparator);
    }

    @Test
    public void testSetOptionComparatorCustom() {
        Comparator custom = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());
    }

    @Test
    public void testPrintHelpNullCommandLineSyntax() {
        try {
            formatter.printHelp(printWriter, 80, null, null, new Options(), 1, 3, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpEmptyCommandLineSyntax() {
        try {
            formatter.printHelp(printWriter, 80, "", null, new Options(), 1, 3, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpBasic() {
        Options options = new Options();
        formatter.printHelp(printWriter, 80, "app", "header", options, 1, 3, "footer");
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("header"));
        assertTrue(result.contains("footer"));
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        Options options = new Options();
        formatter.printHelp(printWriter, 80, "app", "header", options, 1, 3, "footer", true);
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: app"));
    }

    @Test
    public void testPrintUsage() {
        Options options = new Options();
        formatter.printUsage(printWriter, 80, "myapp", options);
        assertEquals("usage: myapp \n", stringWriter.toString());
    }

    @Test
    public void testPrintUsageWithOptions() {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file option");
        options.addOption(opt);
        formatter.printUsage(printWriter, 80, "myapp", options);
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-f"));
        assertTrue(result.contains("--file"));
    }

    @Test
    public void testPrintWrappedSimpleText() {
        formatter.printWrapped(printWriter, 10, "Hello");
        assertEquals("Hello\n", stringWriter.toString());
    }

    @Test
    public void testPrintWrappedLongText() {
        formatter.printWrapped(printWriter, 10, "This is a long text that should wrap");
        String result = stringWriter.toString();
        assertTrue(result.length() > 0);
        assertFalse(result.endsWith(" \n"));
    }

    @Test
    public void testRenderWrappedTextShortText() {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderWrappedText(sb, 20, 3, "short");
        assertEquals("short", result.toString());
    }

    @Test
    public void testRenderWrappedTextExactWidth() {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderWrappedText(sb, 10, 2, "1234567890");
        assertEquals("1234567890", result.toString());
    }

    @Test
    public void testFindWrapPos() {
        assertEquals(5, formatter.findWrapPos("hello world", 10, 0));
        assertEquals(-1, formatter.findWrapPos("hello", 10, 0));
        assertEquals(6, formatter.findWrapPos("hello\nworld", 10, 0));
        assertEquals(6, formatter.findWrapPos("hello\tworld", 10, 0));
    }

    @Test
    public void testFindWrapPosNoSpace() {
        assertEquals(-1, formatter.findWrapPos("abcdefghijklmnopqrstuvwxyz", 10, 0));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("   ", formatter.createPadding(3));
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("hello", formatter.rtrim("  hello  "));
        assertEquals("hello world", formatter.rtrim("hello world  "));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        Option opt = new Option("v", "version", false, "print version");
        options.addOption(opt);
        formatter.printOptions(printWriter, 80, options, 1, 3);
        String result = stringWriter.toString();
        assertTrue(result.contains("-v"));
        assertTrue(result.contains("--version"));
        assertTrue(result.contains("print version"));
    }

    @Test
    public void testPrintOptionsWithRequiredFlag() {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file arg");
        opt.setRequired(true);
        options.addOption(opt);
        formatter.printOptions(printWriter, 80, options, 1, 3);
        String result = stringWriter.toString();
        assertTrue(result.contains("-f,--file"));
    }

    @Test
    public void testRenderOptionsWithOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option a = new Option("a", "alpha", false, "alpha desc");
        Option b = new Option("b", "beta", false, "beta desc");
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("[-a"));
        assertTrue(result.contains("-b]"));
    }

    @Test
    public void testAppendOption() {
        // Test via renderOptions since appendOption is private
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file arg");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("-f"));
    }

    @Test
    public void testOptionComparatorCompare() {
        HelpFormatter.OptionComparator comparator = new HelpFormatter.OptionComparator();
        Option a = new Option("a", "alpha", false, "desc");
        Option b = new Option("b", "beta", false, "desc");
        assertTrue(comparator.compare(a, b) < 0);
        assertTrue(comparator.compare(b, a) > 0);
        assertEquals(0, comparator.compare(a, new Option("a", "alpha", false, "desc")));
    }
}