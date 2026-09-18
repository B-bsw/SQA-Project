package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupImplTest {

    private MockCommandLine commandLine;

    @Before
    public void setUp() {
        this.commandLine = new MockCommandLine();
    }

    @Test
    public void constructor_givenOptionsAndArguments_shouldSeparateAnonymousAndPopulateMaps() {
        MockOption option1 = new MockOption("--opt1", "Option 1", Collections.singleton("--opt1"), Collections.singleton("-"));
        MockOption option2 = new MockOption("--opt2", "Option 2", Collections.singleton("--opt2"), Collections.singleton("-"));
        MockArgument arg1 = new MockArgument("arg1");

        List optionsList = new ArrayList();
        optionsList.add(option1);
        optionsList.add(arg1);
        optionsList.add(option2);

        GroupImpl group = new GroupImpl(optionsList, "group1", "Group Description", 1, 2);

        Assert.assertEquals("group1", group.getPreferredName());
        Assert.assertEquals("Group Description", group.getDescription());
        Assert.assertEquals(1, group.getMinimum());
        Assert.assertEquals(2, group.getMaximum());
        Assert.assertTrue(group.isRequired());

        List nonArgOptions = group.getOptions();
        Assert.assertEquals(2, nonArgOptions.size());
        Assert.assertFalse(nonArgOptions.contains(arg1));

        List anonArgs = group.getAnonymous();
        Assert.assertEquals(1, anonArgs.size());
        Assert.assertTrue(anonArgs.contains(arg1));

        Set triggers = group.getTriggers();
        Assert.assertTrue(triggers.contains("--opt1"));
        Assert.assertTrue(triggers.contains("--opt2"));

        Set prefixes = group.getPrefixes();
        Assert.assertTrue(prefixes.contains("-"));
    }

    @Test
    public void canProcess_givenNullArgument_shouldReturnFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1);
        Assert.assertFalse(group.canProcess(commandLine, null));
    }

    @Test
    public void canProcess_givenExactTriggerMatch_shouldReturnTrue() {
        MockOption option = new MockOption("--opt", "Option", Collections.singleton("--opt"), Collections.singleton("-"));
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        Assert.assertTrue(group.canProcess(commandLine, "--opt"));
    }

    @Test
    public void canProcess_givenBurstingChildOptionCanProcess_shouldReturnTrue() {
        MockOption option = new MockOption("-a", "Option A", Collections.singleton("-a"), Collections.singleton("-"));
        option.setCanProcessReturns(true);
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        Assert.assertTrue(group.canProcess(commandLine, "-ab"));
    }

    @Test
    public void canProcess_givenLooksLikeOptionAndNoOptionCanProcess_shouldReturnFalse() {
        MockOption option = new MockOption("--opt", "Option", Collections.singleton("--opt"), Collections.singleton("-"));
        option.setCanProcessReturns(false);
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(true);
        Assert.assertFalse(group.canProcess(commandLine, "--unknown"));
    }

    @Test
    public void canProcess_givenNotLookingLikeOptionWithAnonymous_shouldReturnTrue() {
        MockArgument arg = new MockArgument("val");
        List list = new ArrayList();
        list.add(arg);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(false);
        Assert.assertTrue(group.canProcess(commandLine, "someValue"));
    }

    @Test
    public void canProcess_givenNotLookingLikeOptionAndNoAnonymous_shouldReturnFalse() {
        List list = new ArrayList();
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(false);
        Assert.assertFalse(group.canProcess(commandLine, "someValue"));
    }

    @Test
    public void process_givenDuplicateTokenConsecutively_shouldRollbackAndBreak() throws OptionException {
        MockOption option = new MockOption("--opt", "Option", Collections.singleton("--opt"), Collections.singleton("-"));
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 2);

        String sameInstance = "--opt";
        List tokens = new ArrayList();
        tokens.add(sameInstance);
        tokens.add(sameInstance);
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(1, option.getProcessCount());
        Assert.assertTrue(it.hasNext());
        Assert.assertSame(sameInstance, it.next());
    }

    @Test
    public void process_givenDirectOptionMatch_shouldDelegateToOption() throws OptionException {
        MockOption option = new MockOption("--file", "File", Collections.singleton("--file"), Collections.singleton("-"));
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        List tokens = new ArrayList();
        tokens.add("--file");
        tokens.add("target.txt");
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(1, option.getProcessCount());
    }

    @Test
    public void process_givenOptionLookingTokenMatchingChildOption_shouldProcessMemberOption() throws OptionException {
        MockOption option = new MockOption("-a", "Option A", Collections.singleton("-a"), Collections.singleton("-"));
        option.setCanProcessReturns(true);
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(true);
        List tokens = new ArrayList();
        tokens.add("-ab");
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(1, option.getProcessCount());
    }

    @Test
    public void process_givenOptionLookingTokenNotMatchingChildOption_shouldRollbackAndReturn() throws OptionException {
        MockOption option = new MockOption("-a", "Option A", Collections.singleton("-a"), Collections.singleton("-"));
        option.setCanProcessReturns(false);
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(true);
        List tokens = new ArrayList();
        tokens.add("-z");
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(0, option.getProcessCount());
        Assert.assertEquals(0, it.nextIndex());
    }

    @Test
    public void process_givenNonOptionTokenAndNoAnonymousArguments_shouldRollbackAndBreak() throws OptionException {
        MockOption option = new MockOption("--opt", "Option", Collections.singleton("--opt"), Collections.singleton("-"));
        List list = new ArrayList();
        list.add(option);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(false);
        List tokens = new ArrayList();
        tokens.add("nonOptionToken");
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(0, it.nextIndex());
    }

    @Test
    public void process_givenNonOptionTokenAndAnonymousArgumentProcesses_shouldConsumeToken() throws OptionException {
        MockArgument arg = new MockArgument("anon");
        arg.setCanProcessReturns(true);
        List list = new ArrayList();
        list.add(arg);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(false);
        List tokens = new ArrayList();
        tokens.add("param1");
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(1, arg.getProcessCount());
    }

    @Test
    public void process_givenNonOptionTokenAndAnonymousArgumentCannotProcess_shouldNotProcessArgument() throws OptionException {
        MockArgument arg = new MockArgument("anon");
        arg.setCanProcessReturns(false);
        List list = new ArrayList();
        list.add(arg);
        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);

        commandLine.setLooksLikeOptionReturns(false);
        List tokens = new ArrayList();
        tokens.add("param1");
        ListIterator it = tokens.listIterator();

        group.process(commandLine, it);

        Assert.assertEquals(0, arg.getProcessCount());
    }

    @Test
    public void validate_givenRequiredOptionAndChildGroup_shouldValidateThem() throws OptionException {
        MockOption reqOption = new MockOption("--req", "Req", Collections.singleton("--req"), Collections.singleton("-"));
        reqOption.setRequired(true);

        MockGroup childGroup = new MockGroup("subGroup");
        childGroup.setRequired(false);

        List list = new ArrayList();
        list.add(reqOption);
        list.add(childGroup);

        GroupImpl group = new GroupImpl(list, "mainGroup", "desc", 0, 5);
        group.validate(commandLine);

        Assert.assertEquals(1, reqOption.getValidateCount());
        Assert.assertEquals(1, childGroup.getValidateCount());
    }

    @Test
    public void validate_givenChildOptionPresentInCommandLine_shouldValidateIt() throws OptionException {
        MockOption option = new MockOption("--opt", "Opt", Collections.singleton("--opt"), Collections.singleton("-"));
        List list = new ArrayList();
        list.add(option);

        GroupImpl group = new GroupImpl(list, "mainGroup", "desc", 0, 2);
        commandLine.addPresentOption(option);

        group.validate(commandLine);

        Assert.assertEquals(1, option.getValidateCount());
    }

    @Test
    public void validate_givenTooManyOptions_shouldThrowUnexpectedTokenException() {
        MockOption opt1 = new MockOption("--opt1", "Opt1", Collections.singleton("--opt1"), Collections.singleton("-"));
        MockOption opt2 = new MockOption("--opt2", "Opt2", Collections.singleton("--opt2"), Collections.singleton("-"));

        List list = new ArrayList();
        list.add(opt1);
        list.add(opt2);

        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);
        commandLine.addPresentOption(opt1);
        commandLine.addPresentOption(opt2);

        try {
            group.validate(commandLine);
            Assert.fail("Expected OptionException due to maximum exceeded");
        } catch (OptionException oe) {
            Assert.assertEquals(ResourceConstants.UNEXPECTED_TOKEN, oe.getErrorCode());
            Assert.assertSame(group, oe.getOption());
        }
    }

    @Test
    public void validate_givenFewerOptionsThanMinimum_shouldThrowMissingOptionException() {
        MockOption opt1 = new MockOption("--opt1", "Opt1", Collections.singleton("--opt1"), Collections.singleton("-"));

        List list = new ArrayList();
        list.add(opt1);

        GroupImpl group = new GroupImpl(list, "grp", "desc", 2, 5);

        try {
            group.validate(commandLine);
            Assert.fail("Expected OptionException due to minimum not met");
        } catch (OptionException oe) {
            Assert.assertEquals(ResourceConstants.MISSING_OPTION, oe.getErrorCode());
            Assert.assertSame(group, oe.getOption());
        }
    }

    @Test
    public void validate_givenAnonymousArguments_shouldValidateEachAnonymousArgument() throws OptionException {
        MockArgument arg = new MockArgument("anon");
        List list = new ArrayList();
        list.add(arg);

        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);
        group.validate(commandLine);

        Assert.assertEquals(1, arg.getValidateCount());
    }

    @Test
    public void defaults_givenOptionsAndAnonymous_shouldCallDefaultsOnAll() {
        MockOption option = new MockOption("--opt", "Opt", Collections.singleton("--opt"), Collections.singleton("-"));
        MockArgument arg = new MockArgument("anon");

        List list = new ArrayList();
        list.add(option);
        list.add(arg);

        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 1);
        group.defaults(commandLine);

        Assert.assertEquals(1, option.getDefaultsCount());
        Assert.assertEquals(1, arg.getDefaultsCount());
    }

    @Test
    public void findOption_givenExistingTrigger_shouldReturnMatchingOption() {
        MockOption option1 = new MockOption("--first", "First", Collections.singleton("--first"), Collections.singleton("-"));
        MockOption option2 = new MockOption("--second", "Second", Collections.singleton("--second"), Collections.singleton("-"));

        List list = new ArrayList();
        list.add(option1);
        list.add(option2);

        GroupImpl group = new GroupImpl(list, "grp", "desc", 0, 2);

        Assert.assertSame(option1, group.findOption("--first"));
        Assert.assertSame(option2, group.findOption("--second"));
        Assert.assertNull(group.findOption("--unknown"));
    }

    @Test
    public void appendUsage_givenVariousDisplaySettings_shouldFormatCorrectly() {
        MockOption opt1 = new MockOption("-a", "A", Collections.singleton("-a"), Collections.singleton("-"));
        MockOption opt2 = new MockOption("-b", "B", Collections.singleton("-b"), Collections.singleton("-"));
        MockArgument arg1 = new MockArgument("ARG");

        List list = new ArrayList();
        list.add(opt1);
        list.add(opt2);
        list.add(arg1);

        GroupImpl group = new GroupImpl(list, "mygroup", "desc", 0, 2);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null, "|");

        String result = buffer.toString();
        Assert.assertTrue(result.startsWith("[mygroup ("));
        Assert.assertTrue(result.contains("-a|-b"));
        Assert.assertTrue(result.contains(" ARG"));
        Assert.assertTrue(result.endsWith("]"));
    }

    @Test
    public void appendUsage_givenDefaultAppendUsageCall_shouldUsePipeSeparator() {
        MockOption opt1 = new MockOption("-a", "A", Collections.singleton("-a"), Collections.singleton("-"));
        MockOption opt2 = new MockOption("-b", "B", Collections.singleton("-b"), Collections.singleton("-"));

        List list = new ArrayList();
        list.add(opt1);
        list.add(opt2);

        GroupImpl group = new GroupImpl(list, null, "desc", 1, 2);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        Assert.assertEquals("-a|-b", buffer.toString());
    }

    @Test
    public void appendUsage_givenComparator_shouldSortOptions() {
        MockOption opt1 = new MockOption("-b", "B", Collections.singleton("-b"), Collections.singleton("-"));
        MockOption opt2 = new MockOption("-a", "A", Collections.singleton("-a"), Collections.singleton("-"));

        List list = new ArrayList();
        list.add(opt1);
        list.add(opt2);

        GroupImpl group = new GroupImpl(list, null, "desc", 1, 2);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        StringBuffer buffer = new StringBuffer();
        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };

        group.appendUsage(buffer, settings, comp, ",");
        Assert.assertEquals("-a,-b", buffer.toString());
    }

    @Test
    public void appendUsage_givenOptionalWithoutOuter_shouldCloseBracketAtEnd() {
        MockOption opt1 = new MockOption("-a", "A", Collections.singleton("-a"), Collections.singleton("-"));
        MockArgument arg = new MockArgument("ARG");

        List list = new ArrayList();
        list.add(opt1);
        list.add(arg);

        GroupImpl group = new GroupImpl(list, "group", "desc", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        String out = buffer.toString();
        Assert.assertTrue(out.startsWith("[group"));
        Assert.assertTrue(out.endsWith(" ARG]"));
    }

    @Test
    public void helpLines_givenHelpSettings_shouldCollectHelpLines() {
        MockOption opt1 = new MockOption("-a", "Alpha", Collections.singleton("-a"), Collections.singleton("-"));
        MockArgument arg1 = new MockArgument("param");

        List list = new ArrayList();
        list.add(opt1);
        list.add(arg1);

        GroupImpl group = new GroupImpl(list, "grp", "Group Help", 1, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, settings, null);

        Assert.assertEquals(3, lines.size());
        HelpLine groupLine = (HelpLine) lines.get(0);
        Assert.assertSame(group, groupLine.getOption());
        Assert.assertEquals(0, groupLine.getIndent());

        HelpLine optLine = (HelpLine) lines.get(1);
        Assert.assertSame(opt1, optLine.getOption());
        Assert.assertEquals(1, optLine.getIndent());

        HelpLine argLine = (HelpLine) lines.get(2);
        Assert.assertSame(arg1, argLine.getOption());
        Assert.assertEquals(1, argLine.getIndent());
    }

    @Test
    public void helpLines_givenComparator_shouldSortHelpLines() {
        MockOption opt1 = new MockOption("-z", "Zeta", Collections.singleton("-z"), Collections.singleton("-"));
        MockOption opt2 = new MockOption("-a", "Alpha", Collections.singleton("-a"), Collections.singleton("-"));

        List list = new ArrayList();
        list.add(opt1);
        list.add(opt2);

        GroupImpl group = new GroupImpl(list, null, "desc", 1, 2);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };

        List lines = group.helpLines(1, settings, comp);

        Assert.assertEquals(2, lines.size());
        HelpLine hl1 = (HelpLine) lines.get(0);
        Assert.assertSame(opt2, hl1.getOption());
        HelpLine hl2 = (HelpLine) lines.get(1);
        Assert.assertSame(opt1, hl2.getOption());
    }

    @Test
    public void reverseStringComparator_givenStrings_shouldSortInDescendingOrder() {
        Comparator comp = ReverseStringComparator.getInstance();
        Assert.assertNotNull(comp);
        Assert.assertTrue(comp.compare("a", "b") > 0);
        Assert.assertTrue(comp.compare("b", "a") < 0);
        Assert.assertEquals(0, comp.compare("same", "same"));
    }

    // --- Test Doubles & Mock Implementations ---

    private static class MockCommandLine implements WriteableCommandLine {
        private boolean looksLikeOptionReturns;
        private final Set presentOptions = new HashSet();

        public void setLooksLikeOptionReturns(boolean b) {
            this.looksLikeOptionReturns = b;
        }

        public void addPresentOption(Option opt) {
            this.presentOptions.add(opt);
        }

        public boolean looksLikeOption(String trigger) {
            return looksLikeOptionReturns;
        }

        public boolean hasOption(Option option) {
            return presentOptions.contains(option);
        }

        public boolean hasOption(String trigger) {
            return false;
        }

        public Option getOption(String trigger) {
            return null;
        }

        public List getValues(Option option) {
            return Collections.EMPTY_LIST;
        }

        public List getValues(Option option, List defaultValues) {
            return defaultValues;
        }

        public List getValues(String trigger) {
            return Collections.EMPTY_LIST;
        }

        public List getValues(String trigger, List defaultValues) {
            return defaultValues;
        }

        public Object getValue(Option option) {
            return null;
        }

        public Object getValue(Option option, Object defaultValue) {
            return defaultValue;
        }

        public Object getValue(String trigger) {
            return null;
        }

        public Object getValue(String trigger, Object defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(Option option) {
            return null;
        }

        public Boolean getSwitch(Option option, Boolean defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(String trigger) {
            return null;
        }

        public Boolean getSwitch(String trigger, Boolean defaultValue) {
            return defaultValue;
        }

        public Object getProperty(String property) {
            return null;
        }

        public Object getProperty(String property, Object defaultValue) {
            return defaultValue;
        }

        public Set getProperties() {
            return Collections.EMPTY_SET;
        }

        public List getOptions() {
            return new ArrayList(presentOptions);
        }

        public Set getOptionTriggers() {
            return Collections.EMPTY_SET;
        }

        public List getUndefaultedValues(Option option) {
            return Collections.EMPTY_LIST;
        }

        public void addOption(Option option) {
            presentOptions.add(option);
        }

        public void addValue(Option option, Object value) {
        }

        public void addSwitch(Option option, boolean value) {
        }

        public void setProperty(String property, String value) {
        }
    }

    private static class MockOption implements Option {
        private final String preferredName;
        private final String description;
        private final Set triggers;
        private final Set prefixes;
        private boolean required;
        private boolean canProcessReturns;
        private int processCount;
        private int validateCount;
        private int defaultsCount;

        public MockOption(String preferredName, String description, Set triggers, Set prefixes) {
            this.preferredName = preferredName;
            this.description = description;
            this.triggers = triggers != null ? triggers : Collections.EMPTY_SET;
            this.prefixes = prefixes != null ? prefixes : Collections.EMPTY_SET;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }

        public void setCanProcessReturns(boolean canProcessReturns) {
            this.canProcessReturns = canProcessReturns;
        }

        public int getProcessCount() {
            return processCount;
        }

        public int getValidateCount() {
            return validateCount;
        }

        public int getDefaultsCount() {
            return defaultsCount;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String arg) {
            return canProcessReturns;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
            processCount++;
            if (arguments.hasNext()) {
                arguments.next();
            }
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            validateCount++;
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName);
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            List list = new ArrayList();
            list.add(new HelpLineImpl(this, depth));
            return list;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void defaults(WriteableCommandLine commandLine) {
            defaultsCount++;
        }

        public boolean isRequired() {
            return required;
        }

        public Option findOption(String trigger) {
            if (triggers.contains(trigger)) {
                return this;
            }
            return null;
        }

        public int getId() {
            return 0;
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public boolean checkPrefixes(Set prefixes) {
            return false;
        }
    }

    private static class MockArgument extends MockOption implements Argument {
        private boolean canProcessReturns = true;

        public MockArgument(String preferredName) {
            super(preferredName, preferredName, Collections.EMPTY_SET, Collections.EMPTY_SET);
        }

        public void setCanProcessReturns(boolean canProcessReturns) {
            this.canProcessReturns = canProcessReturns;
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            return canProcessReturns;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
            super.process(commandLine, arguments);
        }

        public void validate(WriteableCommandLine commandLine, Option option) throws OptionException {
            super.validate(commandLine);
        }

        public Object getInitialValue() {
            return null;
        }

        public List defaultValues(WriteableCommandLine commandLine, Option option) {
            return Collections.EMPTY_LIST;
        }

        public String getStripDelimiter() {
            return null;
        }

        public int getMaximum() {
            return 1;
        }

        public int getMinimum() {
            return 0;
        }
    }

    private static class MockGroup extends MockOption implements Group {
        public MockGroup(String name) {
            super(name, name, Collections.EMPTY_SET, Collections.EMPTY_SET);
        }

        public boolean isRequired() {
            return super.isRequired();
        }

        public int getMinimum() {
            return 0;
        }

        public int getMaximum() {
            return 1;
        }

        public List getOptions() {
            return Collections.EMPTY_LIST;
        }

        public List getAnonymous() {
            return Collections.EMPTY_LIST;
        }
    }
}