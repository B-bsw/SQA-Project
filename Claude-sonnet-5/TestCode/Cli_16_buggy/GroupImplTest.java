package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;

public class GroupImplTest {

    private Option optA;
    private Option optB;
    private Argument arg;
    private Group group;
    private WriteableCommandLine wcl;

    @Before
    public void setUp() throws Exception {
        optA = new DefaultOptionBuilder()
            .withShortName("a")
            .withLongName("alpha")
            .withDescription("Option A")
            .create();

        optB = new DefaultOptionBuilder()
            .withShortName("b")
            .withLongName("beta")
            .withDescription("Option B")
            .create();

        arg = new ArgumentBuilder()
            .withName("arg")
            .withMinimum(0)
            .withMaximum(2)
            .create();

        group = new GroupBuilder()
            .withName("testGroup")
            .withDescription("A test group")
            .withOption(optA)
            .withOption(optB)
            .withOption(arg)
            .withMinimum(0)
            .withMaximum(2)
            .create();

        wcl = new WriteableCommandLineImpl(group, new ArrayList());
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_optionsSeparation() {
        assertEquals(2, group.getOptions().size());
        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getOptions().contains(optA));
        assertTrue(group.getOptions().contains(optB));
        assertTrue(group.getAnonymous().contains(arg));
    }

    @Test
    public void testGroupImplConstructorDirect() {
        List opts = new ArrayList();
        opts.add(optA);
        opts.add(arg);
        opts.add(optB);

        GroupImpl directGroup = new GroupImpl(opts, "direct", "desc", 0, 5);

        assertEquals(2, directGroup.getOptions().size());
        assertEquals(1, directGroup.getAnonymous().size());
        assertTrue(directGroup.getAnonymous().contains(arg));
        assertEquals("direct", directGroup.getPreferredName());
        assertEquals("desc", directGroup.getDescription());
        assertEquals(0, directGroup.getMinimum());
        assertEquals(5, directGroup.getMaximum());
    }

    @Test
    public void testEmptyGroup() {
        Group emptyGroup = new GroupBuilder().create();
        assertTrue(emptyGroup.getOptions().isEmpty());
        assertTrue(emptyGroup.getAnonymous().isEmpty());
        assertTrue(emptyGroup.getPrefixes().isEmpty());
        assertTrue(emptyGroup.getTriggers().isEmpty());
    }

    // ---------------------------------------------------------------
    // getPrefixes / getTriggers
    // ---------------------------------------------------------------

    @Test
    public void testGetPrefixes() {
        Set prefixes = group.getPrefixes();
        assertTrue(prefixes.contains("-"));
        assertTrue(prefixes.contains("--"));
    }

    @Test
    public void testGetTriggers() {
        Set triggers = group.getTriggers();
        assertTrue(triggers.contains("-a"));
        assertTrue(triggers.contains("--alpha"));
        assertTrue(triggers.contains("-b"));
        assertTrue(triggers.contains("--beta"));
    }

    // ---------------------------------------------------------------
    // canProcess
    // ---------------------------------------------------------------

    @Test
    public void testCanProcess_nullArg() {
        assertFalse(group.canProcess(wcl, null));
    }

    @Test
    public void testCanProcess_exactTrigger() {
        assertTrue(group.canProcess(wcl, "-a"));
        assertTrue(group.canProcess(wcl, "--alpha"));
        assertTrue(group.canProcess(wcl, "-b"));
    }

    @Test
    public void testCanProcess_looksLikeOptionButNoMatch() {
        assertFalse(group.canProcess(wcl, "-z"));
    }

    @Test
    public void testCanProcess_anonymousFallback() {
        assertTrue(group.canProcess(wcl, "somevalue"));
    }

    @Test
    public void testCanProcess_emptyGroupNoAnonymous() {
        Group emptyGroup = new GroupBuilder().create();
        WriteableCommandLine emptyWcl = new WriteableCommandLineImpl(emptyGroup, new ArrayList());
        assertFalse(emptyGroup.canProcess(emptyWcl, "somevalue"));
    }

    @Test
    public void testCanProcess_noOptionsWithAnonymous() {
        Group argOnlyGroup = new GroupBuilder().withOption(arg).withMinimum(0).withMaximum(1).create();
        WriteableCommandLine argWcl = new WriteableCommandLineImpl(argOnlyGroup, new ArrayList());
        assertTrue(argOnlyGroup.canProcess(argWcl, "value"));
    }

    // ---------------------------------------------------------------
    // process
    // ---------------------------------------------------------------

    @Test
    public void testProcess_directOptionFound() throws OptionException {
        List argsList = new ArrayList(Arrays.asList(new String[] {"-a"}));
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, argsList);
        ListIterator iterator = argsList.listIterator();

        group.process(cl, iterator);

        assertTrue(cl.hasOption(optA));
        assertFalse(cl.hasOption(optB));
    }

    @Test
    public void testProcess_switchAndArgument() throws OptionException {
        List argsList = new ArrayList(Arrays.asList(new String[] {"-a", "value1"}));
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, argsList);
        ListIterator iterator = argsList.listIterator();

        group.process(cl, iterator);

        assertTrue(cl.hasOption(optA));
        List values = cl.getValues(arg, Collections.EMPTY_LIST);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testProcess_looksLikeOptionNoMatch() throws OptionException {
        List argsList = new ArrayList(Arrays.asList(new String[] {"-z"}));
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, argsList);
        ListIterator iterator = argsList.listIterator();

        group.process(cl, iterator);

        assertTrue(iterator.hasNext());
        assertEquals("-z", iterator.next());
    }

    @Test
    public void testProcess_noAnonymousBreak() throws OptionException {
        Group grp = new GroupBuilder().withOption(optA).withMinimum(0).withMaximum(1).create();
        List argsList = new ArrayList(Arrays.asList(new String[] {"randomvalue"}));
        WriteableCommandLine cl = new WriteableCommandLineImpl(grp, argsList);
        ListIterator iterator = argsList.listIterator();

        grp.process(cl, iterator);

        assertTrue(iterator.hasNext());
        assertEquals("randomvalue", iterator.next());
        assertFalse(cl.hasOption(optA));
    }

    @Test
    public void testProcess_duplicateTokenAbort() throws OptionException {
        Argument onlyArg = new ArgumentBuilder()
            .withName("only")
            .withMinimum(0)
            .withMaximum(1)
            .create();

        Group grp = new GroupBuilder().withOption(onlyArg).withMinimum(0).withMaximum(1).create();

        List argsList = new ArrayList(Arrays.asList(new String[] {"value1", "value2"}));
        WriteableCommandLine cl = new WriteableCommandLineImpl(grp, argsList);
        ListIterator iterator = argsList.listIterator();

        grp.process(cl, iterator);

        List values = cl.getValues(onlyArg, Collections.EMPTY_LIST);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));

        assertTrue(iterator.hasNext());
        assertEquals("value2", iterator.next());
    }

    @Test
    public void testProcess_emptyArguments() throws OptionException {
        List argsList = new ArrayList();
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, argsList);
        ListIterator iterator = argsList.listIterator();

        group.process(cl, iterator);

        assertFalse(cl.hasOption(optA));
        assertFalse(cl.hasOption(optB));
    }

    // ---------------------------------------------------------------
    // validate
    // ---------------------------------------------------------------

    @Test
    public void testValidate_valid() throws OptionException {
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());
        cl.addOption(optA);
        group.validate(cl);
        assertTrue(cl.hasOption(optA));
    }

    @Test(expected = OptionException.class)
    public void testValidate_missingRequired() throws OptionException {
        Group requiredGroup = new GroupBuilder()
            .withOption(optA)
            .withOption(optB)
            .withMinimum(1)
            .withMaximum(2)
            .create();

        WriteableCommandLine cl = new WriteableCommandLineImpl(requiredGroup, new ArrayList());
        requiredGroup.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooMany() throws OptionException {
        Group maxGroup = new GroupBuilder()
            .withOption(optA)
            .withOption(optB)
            .withMinimum(0)
            .withMaximum(1)
            .create();

        WriteableCommandLine cl = new WriteableCommandLineImpl(maxGroup, new ArrayList());
        cl.addOption(optA);
        cl.addOption(optB);

        maxGroup.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_maximumZero() throws OptionException {
        Group zeroGroup = new GroupBuilder()
            .withOption(optA)
            .withMinimum(0)
            .withMaximum(0)
            .create();

        WriteableCommandLine cl = new WriteableCommandLineImpl(zeroGroup, new ArrayList());
        cl.addOption(optA);

        zeroGroup.validate(cl);
    }

    @Test
    public void testValidate_boundaryExactMinimum() throws OptionException {
        Group exactGroup = new GroupBuilder()
            .withOption(optA)
            .withOption(optB)
            .withMinimum(2)
            .withMaximum(2)
            .create();

        WriteableCommandLine cl = new WriteableCommandLineImpl(exactGroup, new ArrayList());
        cl.addOption(optA);
        cl.addOption(optB);

        exactGroup.validate(cl);

        assertTrue(cl.hasOption(optA));
        assertTrue(cl.hasOption(optB));
    }

    // ---------------------------------------------------------------
    // getPreferredName / getDescription
    // ---------------------------------------------------------------

    @Test
    public void testGetPreferredName() {
        assertEquals("testGroup", group.getPreferredName());
    }

    @Test
    public void testGetPreferredName_null() {
        Group noName = new GroupBuilder().withOption(optA).create();
        assertNull(noName.getPreferredName());
    }

    @Test
    public void testGetDescription() {
        assertEquals("A test group", group.getDescription());
    }

    // ---------------------------------------------------------------
    // appendUsage
    // ---------------------------------------------------------------

    @Test
    public void testAppendUsage_nameOnlyNotExpanded() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        group.appendUsage(buffer, settings, null);

        assertEquals("testGroup", buffer.toString());
    }

    @Test
    public void testAppendUsage_expandedOptional() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        group.appendUsage(buffer, settings, null);

        String result = buffer.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
    }

    @Test
    public void testAppendUsage_customSeparator() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buffer, settings, null, ",");

        String result = buffer.toString();
        assertTrue(result.indexOf(",") >= 0);
    }

    @Test
    public void testAppendUsage_withComparator() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option a1 = (Option) o1;
                Option a2 = (Option) o2;
                return a1.getPreferredName().compareTo(a2.getPreferredName());
            }
        };

        group.appendUsage(buffer, settings, comp);

        assertTrue(buffer.length() > 0);
    }

    @Test
    public void testAppendUsage_withArguments() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        group.appendUsage(buffer, settings, null);

        String result = buffer.toString();
        assertTrue(result.indexOf(' ') >= 0);
        assertTrue(result.startsWith("testGroup"));
    }

    @Test
    public void testAppendUsage_emptySettings() {
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();

        group.appendUsage(buffer, settings, null);

        assertEquals("testGroup", buffer.toString());
    }

    // ---------------------------------------------------------------
    // helpLines
    // ---------------------------------------------------------------

    @Test
    public void testHelpLines_nameOnly() {
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        List lines = group.helpLines(0, settings, null);

        assertEquals(1, lines.size());
    }

    @Test
    public void testHelpLines_expanded() {
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        List lines = group.helpLines(0, settings, null);

        assertTrue(lines.size() >= 2);
    }

    @Test
    public void testHelpLines_arguments() {
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, settings, null);

        assertTrue(lines.size() >= 1);
    }

    @Test
    public void testHelpLines_none() {
        Set settings = new HashSet();

        List lines = group.helpLines(0, settings, null);

        assertEquals(0, lines.size());
    }

    @Test
    public void testHelpLines_withComparator() {
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        List lines = group.helpLines(0, settings, comp);

        assertNotNull(lines);
        assertTrue(lines.size() >= 2);
    }

    // ---------------------------------------------------------------
    // getOptions / getAnonymous
    // ---------------------------------------------------------------

    @Test
    public void testGetOptions() {
        List options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));
    }

    @Test
    public void testGetAnonymous() {
        List anon = group.getAnonymous();
        assertEquals(1, anon.size());
        assertTrue(anon.contains(arg));
    }

    // ---------------------------------------------------------------
    // findOption
    // ---------------------------------------------------------------

    @Test
    public void testFindOption_found() {
        Option found = group.findOption("-a");
        assertNotNull(found);
    }

    @Test
    public void testFindOption_notFound() {
        Option found = group.findOption("-nonexistent");
        assertNull(found);
    }

    // ---------------------------------------------------------------
    // getMinimum / getMaximum / isRequired
    // ---------------------------------------------------------------

    @Test
    public void testGetMinimum() {
        assertEquals(0, group.getMinimum());
    }

    @Test
    public void testGetMaximum() {
        assertEquals(2, group.getMaximum());
    }

    @Test
    public void testIsRequired_false() {
        assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequired_true() {
        Group reqGroup = new GroupBuilder().withOption(optA).withMinimum(1).withMaximum(1).create();
        assertTrue(reqGroup.isRequired());
    }

    // ---------------------------------------------------------------
    // defaults
    // ---------------------------------------------------------------

    @Test
    public void testDefaults_noException() {
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());
        group.defaults(cl);
        assertNotNull(cl);
    }

    @Test
    public void testDefaults_withArgumentDefault() throws OptionException {
        Argument argWithDefault = new ArgumentBuilder()
            .withName("argD")
            .withMinimum(0)
            .withMaximum(1)
            .withDefault("defVal")
            .create();

        Group grp = new GroupBuilder().withOption(argWithDefault).withMinimum(0).withMaximum(1).create();

        WriteableCommandLine cl = new WriteableCommandLineImpl(grp, new ArrayList());

        grp.defaults(cl);

        List values = cl.getValues(argWithDefault, Collections.EMPTY_LIST);
        assertEquals(1, values.size());
        assertEquals("defVal", values.get(0));
    }

    // ---------------------------------------------------------------
    // ReverseStringComparator (package-private helper class)
    // ---------------------------------------------------------------

    @Test
    public void testReverseStringComparator() {
        Comparator comp = ReverseStringComparator.getInstance();

        assertTrue(comp.compare("b", "a") < 0);
        assertTrue(comp.compare("a", "b") > 0);
        assertEquals(0, comp.compare("a", "a"));
        assertSame(comp, ReverseStringComparator.getInstance());
    }
}