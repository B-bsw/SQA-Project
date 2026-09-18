package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;

public class GroupImplTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;

    @Before
    public void setUp() {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_EmptyOptions() {
        List options = new ArrayList();
        GroupImpl group = new GroupImpl(options, "name", "desc", 0, 0);

        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
        assertEquals("name", group.getPreferredName());
        assertEquals("desc", group.getDescription());
        assertEquals(0, group.getMinimum());
        assertEquals(0, group.getMaximum());
        assertFalse(group.isRequired());
    }

    @Test
    public void testConstructor_WithOptionAndArgument() {
        Option option = obuilder.withShortName("a").withLongName("apple").create();
        Argument argument = abuilder.withName("arg").create();

        List options = new ArrayList();
        options.add(option);
        options.add(argument);

        GroupImpl group = new GroupImpl(options, "grp", "description", 0, 2);

        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(option));
        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().contains(argument));

        assertTrue(group.getTriggers().contains("-a"));
        assertTrue(group.getTriggers().contains("--apple"));

        assertTrue(group.getPrefixes().contains("-"));
        assertTrue(group.getPrefixes().contains("--"));
    }

    @Test
    public void testIsRequired_True() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 1, 1);
        assertTrue(group.isRequired());
    }

    @Test
    public void testIsRequired_False() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 0, 1);
        assertFalse(group.isRequired());
    }

    // ---------- canProcess tests ----------

    @Test
    public void testCanProcess_NullArg() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 0, 1);
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, new ArrayList());
        assertFalse(group.canProcess(wcl, null));
    }

    @Test
    public void testCanProcess_DirectMatch() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, new ArrayList());
        assertTrue(group.canProcess(wcl, "-a"));
    }

    @Test
    public void testCanProcess_LooksLikeOptionNotProcessable() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, new ArrayList());
        assertFalse(group.canProcess(wcl, "--unknown"));
    }

    @Test
    public void testCanProcess_AnonymousPresent() {
        Argument argument = abuilder.withName("arg").create();
        List options = new ArrayList();
        options.add(argument);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, new ArrayList());
        assertTrue(group.canProcess(wcl, "value"));
    }

    @Test
    public void testCanProcess_NoAnonymousNoMatch() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, new ArrayList());
        assertFalse(group.canProcess(wcl, "value"));
    }

    // ---------- getPrefixes / getTriggers ----------

    @Test
    public void testGetPrefixesEmpty() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 0, 1);
        assertTrue(group.getPrefixes().isEmpty());
    }

    @Test
    public void testGetTriggersEmpty() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 0, 1);
        assertTrue(group.getTriggers().isEmpty());
    }

    // ---------- process tests ----------

    @Test
    public void testProcess_SimpleOption() throws OptionException {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList(Arrays.asList("-a"));
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);

        assertTrue(wcl.hasOption(option));
    }

    @Test
    public void testProcess_AnonymousArgument() throws OptionException {
        Argument argument = abuilder.withName("arg").withMinimum(1).withMaximum(1).create();
        List options = new ArrayList();
        options.add(argument);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList(Arrays.asList("value1"));
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);

        List values = wcl.getValues(argument);
        assertNotNull(values);
        assertTrue(values.contains("value1"));
    }

    @Test
    public void testProcess_UnknownOptionAborts() throws OptionException {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList(Arrays.asList("--unknown"));
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);

        assertFalse(wcl.hasOption(option));
        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testProcess_NonOptionNoAnonymousBreak() throws OptionException {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList(Arrays.asList("value"));
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);

        assertFalse(wcl.hasOption(option));
        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testProcess_EmptyArguments() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 0, 1);
        List args = new ArrayList();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);
        assertEquals(0, it.nextIndex());
    }

    // ---------- validate tests ----------

    @Test
    public void testValidate_MissingRequired() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 1, 1);

        List args = new ArrayList();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);

        try {
            group.validate(wcl);
            fail("Expected OptionException for missing option");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidate_TooManyOptions() throws OptionException {
        Option option1 = obuilder.withShortName("a").create();
        Option option2 = obuilder.withShortName("b").create();
        List options = new ArrayList();
        options.add(option1);
        options.add(option2);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList(Arrays.asList("-a", "-b"));
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);

        try {
            group.validate(wcl);
            fail("Expected OptionException for too many options");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidate_Success() throws OptionException {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList(Arrays.asList("-a"));
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);
        ListIterator it = args.listIterator();
        group.process(wcl, it);

        group.validate(wcl);
        assertTrue(wcl.hasOption(option));
    }

    @Test
    public void testValidate_AnonymousValidated() {
        Argument argument = abuilder.withName("arg").withMinimum(1).withMaximum(1).create();
        List options = new ArrayList();
        options.add(argument);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);

        try {
            group.validate(wcl);
            fail("Expected OptionException due to missing required argument value");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidate_NestedGroupAlwaysValidated() throws OptionException {
        GroupImpl nested = new GroupImpl(new ArrayList(), "inner", "d", 0, 0);

        List outerOptions = new ArrayList();
        outerOptions.add(nested);

        GroupImpl outer = new GroupImpl(outerOptions, "outer", "d", 0, 5);

        List args = new ArrayList();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(outer, args);

        outer.validate(wcl);
        // no exception expected
        assertFalse(wcl.hasOption(nested));
    }

    // ---------- getPreferredName / getDescription ----------

    @Test
    public void testGetPreferredNameNull() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, "d", 0, 1);
        assertNull(group.getPreferredName());
    }

    @Test
    public void testGetDescription() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "description text", 0, 1);
        assertEquals("description text", group.getDescription());
    }

    // ---------- appendUsage tests ----------

    @Test
    public void testAppendUsage_Optional() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "grpname", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        String usage = buffer.toString();
        assertTrue(usage.startsWith("["));
        assertTrue(usage.endsWith("]"));
    }

    @Test
    public void testAppendUsage_NamedNotExpanded() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "grpname", "d", 1, 1);

        Set settings = new HashSet();

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        assertEquals("grpname", buffer.toString());
    }

    @Test
    public void testAppendUsage_WithArguments() {
        Argument argument = abuilder.withName("arg").create();
        List options = new ArrayList();
        options.add(argument);
        GroupImpl group = new GroupImpl(options, null, "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        assertTrue(buffer.toString().length() > 0);
    }

    @Test
    public void testAppendUsage_WithComparatorSeparator() {
        Option option1 = obuilder.withShortName("a").create();
        Option option2 = obuilder.withShortName("b").create();
        List options = new ArrayList();
        options.add(option1);
        options.add(option2);
        GroupImpl group = new GroupImpl(options, null, "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null, ",");

        String result = buffer.toString();
        assertTrue(result.contains(","));
    }

    // ---------- helpLines tests ----------

    @Test
    public void testHelpLines_NameOnly() {
        GroupImpl group = new GroupImpl(new ArrayList(), "grpname", "d", 0, 1);
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        List lines = group.helpLines(0, settings, null);
        assertEquals(1, lines.size());
        assertTrue(lines.get(0) instanceof HelpLine);
    }

    @Test
    public void testHelpLines_Expanded() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "grpname", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        List lines = group.helpLines(0, settings, null);
        assertFalse(lines.isEmpty());
    }

    @Test
    public void testHelpLines_Arguments() {
        Argument argument = abuilder.withName("arg").create();
        List options = new ArrayList();
        options.add(argument);
        GroupImpl group = new GroupImpl(options, "grpname", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, settings, null);
        assertFalse(lines.isEmpty());
    }

    @Test
    public void testHelpLines_Empty() {
        GroupImpl group = new GroupImpl(new ArrayList(), "grpname", "d", 0, 1);
        Set settings = new HashSet();

        List lines = group.helpLines(0, settings, null);
        assertTrue(lines.isEmpty());
    }

    // ---------- findOption tests ----------

    @Test
    public void testFindOption_Found() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        Option found = group.findOption("-a");
        assertNotNull(found);
        assertEquals(option, found);
    }

    @Test
    public void testFindOption_NotFound() {
        Option option = obuilder.withShortName("a").create();
        List options = new ArrayList();
        options.add(option);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        Option found = group.findOption("-z");
        assertNull(found);
    }

    // ---------- getMinimum / getMaximum ----------

    @Test
    public void testGetMinimumMaximum() {
        GroupImpl group = new GroupImpl(new ArrayList(), "n", "d", 2, 5);
        assertEquals(2, group.getMinimum());
        assertEquals(5, group.getMaximum());
    }

    // ---------- defaults tests ----------

    @Test
    public void testDefaults() {
        Option option = obuilder.withShortName("a").create();
        Argument argument = abuilder.withName("arg").create();
        List options = new ArrayList();
        options.add(option);
        options.add(argument);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        List args = new ArrayList();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, args);

        group.defaults(wcl);
        // no exception expected
        assertNotNull(wcl);
    }

    // ---------- getOptions / getAnonymous ----------

    @Test
    public void testGetOptionsAndAnonymous() {
        Option option = obuilder.withShortName("a").create();
        Argument argument = abuilder.withName("arg").create();
        List options = new ArrayList();
        options.add(option);
        options.add(argument);
        GroupImpl group = new GroupImpl(options, "n", "d", 0, 1);

        assertEquals(1, group.getOptions().size());
        assertEquals(1, group.getAnonymous().size());
    }
}