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
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        assertNotNull(formatter.getNewLine());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetterAndGetterMethods() {
        formatter.setWidth(80);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setNewLine("\n");
        formatter.setOptPrefix("-");
        formatter.setLongOptPrefix("--");
        formatter.setArgName("value");
        
        assertEquals(80, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("\n", formatter.getNewLine());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testSetNullOptionComparator() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertTrue(formatter.getOptionComparator() instanceof HelpFormatter.OptionComparator);
    }

    @Test
    public void testSetCustomOptionComparator() {
        Comparator<Option> customComparator = new Comparator<Option>() {
            @Override
            public int compare(Option o1, Option o2) {
                return o2.getKey().compareToIgnoreCase(o1.getKey());
            }
        };
        formatter.setOptionComparator(customComparator);
        assertSame(customComparator, formatter.getOptionComparator());
    }

    @Test
    public void testPrintHelpWithNullAndEmptyCmdLineSyntax() {
        Options options = new Options();
        options.addOption("h", "help", false, "print help");
        
        try {
            formatter.printHelp(printWriter, formatter.getWidth(), null, "", options, 1, 3, "", false);
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }

        try {
            formatter.printHelp(printWriter, formatter.getWidth(), "", "", options, 1, 3, "", false);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        Options options = new Options();
        Option option = new Option("f", "file", true, "file to read");
        options.addOption(option);
        
        formatter.printHelp(printWriter, 74, "cmd", "header", options, 1, 3, "footer", true);
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("usage: "));
        assertTrue(result.contains("cmd"));
        assertTrue(result.contains("header"));
        assertTrue(result.contains("footer"));
        assertTrue(result.contains("-f"));
        assertTrue(result.contains("--file"));
        assertTrue(result.contains("<file>"));
    }

    @Test
    public void testPrintHelpWithoutAutoUsage() {
        Options options = new Options();
        options.addOption("h", "help", false, "print help");
        
        formatter.printHelp(printWriter, 74, "cmd", null, options, 1, 3, null, false);
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("cmd"));
        assertTrue(result.contains("-h"));
        assertTrue(!result.contains("usage: "));
        assertTrue(!result.contains("header"));
        assertTrue(!result.contains("footer"));
    }

    @Test
    public void testPrintUsageWithOptionsGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "alpha option"));
        group.addOption(new Option("b", "beta", false, "beta option"));
        group.setRequired(true);
        options.addOptionGroup(group);
        
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("-b"));
    }

    @Test
    public void testPrintUsageWithNullableOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", "xx", false, "x option"));
        group.addOption(new Option("y", "why", false, "y option"));
        group.setRequired(false);
        options.addOptionGroup(group);
        
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("[-"));
        assertTrue(result.contains("["));
        assertTrue(result.contains("]"));
    }

    @Test
    public void testPrintUsageWithRequiredAndOptionalOptions() {
        Options options = new Options();
        Option required = new Option("r", "req", true, "required option");
        required.setRequired(true);
        Option optional = new Option("o", "opt", false, "optional option");
        
        options.addOption(required);
        options.addOption(optional);
        
        formatter.printUsage(printWriter, 74, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("app"));
        assertTrue(result.contains("-r"));
        assertTrue(result.contains("--req"));
        assertTrue(result.contains("-o"));
        assertTrue(result.contains("--opt"));
    }

    @Test
    public void testPrintWrappedTextWithNullText() {
        formatter.printWrapped(printWriter, 10, (String) null);
        printWriter.flush();
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testPrintWrappedTextWithEmptyText() {
        formatter.printWrapped(printWriter, 10, "");
        printWriter.flush();
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testPrintWrappedTextWithLongText() {
        formatter.printWrapped(printWriter, 20, "This is a very long text that should be wrapped at word boundaries");
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("This is a very long"));
        assertTrue(result.contains("text that should be"));
        String[] lines = result.split("\n");
        assertTrue(lines.length > 1);
        for (String line : lines) {
            assertFalse(line.length() > 20);
        }
    }

    @Test
    public void testPrintWrappedTextWithTabAndNewline() {
        formatter.printWrapped(printWriter, 50, "line1\nline2\twith\ttabs");
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("line1"));
        assertTrue(result.contains("line2"));
    }

    @Test
    public void testRenderOptionsWithOptions() {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", true, "alpha option");
        Option opt2 = new Option("b", "beta", false, "beta option");
        
        options.addOption(opt1);
        options.addOption(opt2);
        
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 30, options, 3, 3);
        String result = sb.toString();
        
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--alpha"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("--beta"));
        assertTrue(result.contains("alpha option"));
        assertTrue(result.contains("beta option"));
    }

    @Test
    public void testRenderOptionsWithOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", "xx", false, "x option"));
        group.addOption(new Option("y", "yy", false, "y option"));
        options.addOptionGroup(group);
        
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 30, options, 2, 3);
        String result = sb.toString();
        
        assertTrue(result.contains("-x"));
        assertTrue(result.contains("-y"));
        assertTrue(!result.contains("--xx"));
    }

    @Test
    public void testRenderOptionsWithArgName() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        opt.setArgName("file");
        options.addOption(opt);
        
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 50, options, 1, 3);
        String result = sb.toString();
        
        assertTrue(result.contains("<file>"));
    }

    @Test
    public void testCreatePadding() {
        String padding = formatter.createPadding(5);
        assertEquals("     ", padding);
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testRtrim() {
        assertEquals("hello", formatter.rtrim("hello   "));
        assertEquals("hello world", formatter.rtrim("hello world   "));
        assertEquals("", formatter.rtrim("   "));
    }

    @Test
    public void testFindWrapPos() {
        // text shorter than width
        String text = "short";
        int pos = formatter.findWrapPos(text, 20, 0);
        assertEquals(-1, pos);
        
        // text with newline at boundary
        text = "word\nsecond";
        pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(5, pos);
        
        // text with space exactly at width
        text = "hello world";
        pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testRenderWrappedText() {
        StringBuffer sb = new StringBuffer();
        String text = "This is a test string";
        formatter.renderWrappedText(sb, 10, 1, text);
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testRenderWrappedTextWithZeroWidth() {
        StringBuffer sb = new StringBuffer();
        String text = "This text will cause exception";
        try {
            formatter.renderWrappedText(sb, 5, 0, text);
            fail("Expected RuntimeException for long text");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("text too long"));
        }
    }

    @Test
    public void testPrintHelpWithWrappedText() {
        Options options = new Options();
        options.addOption("h", "help", false, "Help option with a very long description that should be wrapped");
        
        formatter.printHelp(printWriter, 40, "cmd", "Header line", options, 2, 4, "Footer line", false);
        printWriter.flush();
        String result = stringWriter.toString();
        
        assertTrue(result.contains("cmd"));
        assertTrue(result.contains("Header line"));
        assertTrue(result.contains("Footer line"));
        assertTrue(result.contains("-h"));
        assertTrue(result.contains("Help option"));
    }
}