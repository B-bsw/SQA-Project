package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionBuilderTest {
    private static final String LONG_OPT = "test-long";
    private static final String DESCRIPTION = "Test description";
    private static final String ARG_NAME = "arg";
    private static final char OPT_CHAR = 't';
    private static final char SEPARATOR = ':';

    @Before
    public void setUp() {
        // Test fixture setup
    }

    @After
    public void tearDown() {
        // Ensure builder is reset after each test
        try {
            OptionBuilder.reset();
        } catch (Exception e) {
            // Ignore - reset may not be accessible
        }
    }

    @Test
    public void testCreateWithLongOptAndAllSettings() {
        OptionBuilder.withLongOpt("longOption");
        OptionBuilder.hasArg();
        OptionBuilder.hasArg();
        OptionBuilder.withArgName("argument");
        OptionBuilder.isRequired();
        OptionBuilder.withType(String.class);
        OptionBuilder.withDescription("desc");
        OptionBuilder.withValueSeparator('=');
        OptionBuilder.hasOptionalArgs(3);
        
        Option opt = OptionBuilder.create('a');
        
        assertEquals("longOption", opt.getLongOpt());
        assertEquals("argument", opt.getArgName());
        assertEquals("desc", opt.getDescription());
        assertTrue(opt.isRequired());
        assertTrue(opt.hasArgName());
        assertTrue(opt.hasArgs());
        assertEquals(String.class, opt.getType());
        assertEquals('=', opt.getValueSeparator());
        assertTrue(opt.hasOptionalArg());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithoutLongOptThrowsException() {
        OptionBuilder.create();
        // Since we don't set longopt, create() should throw
    }

    @Test
    public void testCreateWithNoArgsAndNoLongOpt() {
        // Test default creation
        Option opt = OptionBuilder.create('x');
        assertNotNull(opt);
        assertEquals("x", opt.getOpt());
        assertNull(opt.getLongOpt());
        assertFalse(opt.isRequired());
        assertEquals(-1, opt.getArgs());
    }

    @Test
    public void testCreateWithCharAndResetState() {
        // First create with some options
        OptionBuilder.withLongOpt("prev-long");
        OptionBuilder.withDescription("prev-desc");
        OptionBuilder.hasArgs(2);
        
        Option opt = OptionBuilder.create('y');
        
        // Verify the created option
        assertEquals("y", opt.getOpt());
        assertEquals("prev-long", opt.getLongOpt());
        assertEquals(2, opt.getArgs());
        
        // After create, builder state should be reset
        Option resetOpt = OptionBuilder.create('z');
        assertNull(resetOpt.getLongOpt());
        assertEquals(-1, resetOpt.getArgs());
    }

    @Test
    public void testCreateWithOnlyLongOpt() {
        OptionBuilder.withLongOpt("simple-long");
        Option opt = OptionBuilder.create('s');
        assertEquals("s", opt.getOpt());
        assertEquals("simple-long", opt.getLongOpt());
    }

    @Test
    public void testFluentChain() {
        Option opt = OptionBuilder
            .withLongOpt("chain")
            .withDescription("chained")
            .isRequired()
            .hasArg()
            .withArgName("argName")
            .withType(Integer.class)
            .withValueSeparator()
            .hasOptionalArg()
            .create('c');
        
        assertNotNull(opt);
        assertEquals("chain", opt.getLongOpt());
        assertEquals("chained", opt.getDescription());
        assertTrue(opt.isRequired());
        assertTrue(opt.hasArg());
        assertEquals("argName", opt.getArgName());
        assertEquals(Integer.class, opt.getType());
        assertEquals('=', opt.getValueSeparator());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void testIsRequiredBoolean() {
        // Test true case
        OptionBuilder.withLongOpt("req-true").isRequired(true);
        Option opt1 = OptionBuilder.create('1');
        assertTrue(opt1.isRequired());

        // Test false case  
        OptionBuilder.withLongOpt("req-false").isRequired(false);
        Option opt2 = OptionBuilder.create('2');
        assertFalse(opt2.isRequired());
    }

    @Test
    public void testHasOptionalArgCounts() {
        // Test no optional arg - should use default
        OptionBuilder.withLongOpt("no-opt");
        Option opt1 = OptionBuilder.create('n');
        assertFalse(opt1.hasOptionalArg());

        // Test single optional
        OptionBuilder.withLongOpt("single-opt").hasOptionalArg();
        Option opt2 = OptionBuilder.create('o');
        assertTrue(opt2.hasOptionalArg());

        // Test unlimited optional args
        OptionBuilder.withLongOpt("unlimited-opt").hasOptionalArgs();
        Option opt3 = OptionBuilder.create('u');
        assertTrue(opt3.hasOptionalArg());
        assertEquals(-2, opt3.getArgs());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithInvalidOptThrows() {
        OptionBuilder.create("");
    }
}