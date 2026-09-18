package org.apache.commons.cli2.option;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.junit.Assert;
import org.junit.Test;

public class GroupImplTest {

    private static class MockOptionHandler implements InvocationHandler {
        private String preferredName = "opt";
        private String description = "opt desc";
        private Set triggers = new HashSet();
        private Set prefixes = new HashSet();
        private boolean required = false;
        private boolean canProcessString = false;
        private boolean canProcessIterator = false;
        private boolean consumeOnProcess = false;
        private boolean throwOnValidate = false;
        private Option findOptionResult = null;
        private List helpLines = new ArrayList();
        private String usageString = "";
        private Option parent = null;
        private int processCount = 0;
        private int validateCount = 0;
        private int defaultsCount = 0;

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            if ("setParent".equals(name)) {
                this.parent = (Option) args[0];
                return null;
            } else if ("getParent".equals(name)) {
                return this.parent;
            } else if ("getTriggers".equals(name)) {
                return triggers;
            } else if ("getPrefixes".equals(name)) {
                return prefixes;
            } else if ("canProcess".equals(name)) {
                if (args != null && args.length == 2 && args[1] instanceof String) {
                    return Boolean.valueOf(canProcessString);
                } else if (args != null && args.length == 2 && args[1] instanceof ListIterator) {
                    return Boolean.valueOf(canProcessIterator);
                }
                return Boolean.FALSE;
            } else if ("process".equals(name)) {
                processCount++;
                if (consumeOnProcess && args != null && args.length > 1 && args[1] instanceof ListIterator) {
                    ListIterator it = (ListIterator) args[1];
                    if (it.hasNext()) {
                        it.next();
                    }
                }
                return null;
            } else if ("isRequired".equals(name)) {
                return Boolean.valueOf(required);
            } else if ("validate".equals(name)) {
                validateCount++;
                if (throwOnValidate) {
                    throw new OptionException(parent != null ? parent : (Option) proxy, ResourceConstants.MISSING_OPTION);
                }
                return null;
            } else if ("getPreferredName".equals(name)) {
                return preferredName;
            } else if ("getDescription".equals(name)) {
                return description;
            } else if ("appendUsage".equals(name)) {
                StringBuffer sb = (StringBuffer) args[0];
                sb.append(usageString);
                return null;
            } else if ("helpLines".equals(name)) {
                return helpLines;
            } else if ("findOption".equals(name)) {
                String trigger = (String) args[0];
                if (triggers.contains(trigger)) {
                    return proxy;
                }
                return findOptionResult;
            } else if ("defaults".equals(name)) {
                defaultsCount++;
                return null;
            } else if ("equals".equals(name)) {
                return Boolean.valueOf(proxy == args[0]);
            } else if ("hashCode".equals(name)) {
                return new Integer(System.identityHashCode(proxy));
            } else if ("toString".equals(name)) {
                return "MockOption[" + preferredName + "]";
            }

            Class returnType = method.getReturnType();
            if (returnType.equals(Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (returnType.equals(Integer.TYPE)) {
                return new Integer(0);
            }
            return null;
        }
    }

    private static class MockCommandLineHandler implements InvocationHandler {
        private Set presentOptions = new HashSet();
        private Set optionLikeTokens = new HashSet();
        private boolean defaultLooksLikeOption = false;

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            if ("hasOption".equals(name)) {
                return Boolean.valueOf(presentOptions.contains(args[0]));
            } else if ("looksLikeOption".equals(name)) {
                if (optionLikeTokens.contains(args[0])) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(defaultLooksLikeOption);
            } else if ("equals".equals(name)) {
                return Boolean.valueOf(proxy == args[0]);
            } else if ("hashCode".equals(name)) {
                return new Integer(System.identityHashCode(proxy));
            }
            Class returnType = method.getReturnType();
            if (returnType.equals(Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (returnType.equals(Integer.TYPE)) {
                return new Integer(0);
            }
            return null;
        }
    }

    private Option createMockOption(MockOptionHandler handler) {
        return (Option) Proxy.newProxyInstance(
                Option.class.getClassLoader(),
                new Class[] { Option.class },
                handler
        );
    }

    private Argument createMockArgument(MockOptionHandler handler) {
        return (Argument) Proxy.newProxyInstance(
                Argument.class.getClassLoader(),
                new Class[] { Argument.class },
                handler
        );
    }

    private WriteableCommandLine createMockCommandLine(MockCommandLineHandler handler) {
        return (WriteableCommandLine) Proxy.newProxyInstance(
                WriteableCommandLine.class.getClassLoader(),
                new Class[] { WriteableCommandLine.class },
                handler
        );
    }

    @Test
    public void constructor_givenOptionsAndArguments_shouldSeparateAnonymousAndSetupTriggers() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.preferredName = "--test";
        optHandler.triggers.add("--test");
        optHandler.triggers.add("-t");
        optHandler.prefixes.add("--");
        optHandler.prefixes.add("-");
        Option opt = createMockOption(optHandler);

        MockOptionHandler argHandler = new MockOptionHandler();
        argHandler.preferredName = "arg";
        Argument arg = createMockArgument(argHandler);

        List inputList = new ArrayList();
        inputList.add(opt);
        inputList.add(arg);

        GroupImpl group = new GroupImpl(inputList, "group1", "Group Description", 1, 2, true);

        Assert.assertEquals("group1", group.getPreferredName());
        Assert.assertEquals("Group Description", group.getDescription());
        Assert.assertEquals(1, group.getMinimum());
        Assert.assertEquals(2, group.getMaximum());
        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertTrue(group.getOptions().contains(opt));
        Assert.assertEquals(1, group.getAnonymous().size());
        Assert.assertTrue(group.getAnonymous().contains(arg));
        Assert.assertTrue(group.getPrefixes().contains("--"));
        Assert.assertTrue(group.getPrefixes().contains("-"));
        Assert.assertTrue(group.getTriggers().contains("--test"));
        Assert.assertTrue(group.getTriggers().contains("-t"));
        Assert.assertSame(group, optHandler.parent);
        Assert.assertSame(group, argHandler.parent);
    }

    @Test
    public void canProcess_givenNullArgument_shouldReturnFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "test", "desc", 0, 1, false);
        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        Assert.assertFalse(group.canProcess(cmd, null));
    }

    @Test
    public void canProcess_givenDirectTriggerMatch_shouldReturnTrue() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("--file");
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        Assert.assertTrue(group.canProcess(cmd, "--file"));
    }

    @Test
    public void canProcess_givenBurstingChildCanProcess_shouldReturnTrue() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("-ab");
        optHandler.canProcessString = true;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        Assert.assertTrue(group.canProcess(cmd, "-a"));
    }

    @Test
    public void canProcess_givenLooksLikeOptionWithoutMatch_shouldReturnFalse() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("-b");
        optHandler.canProcessString = false;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.optionLikeTokens.add("-unknown");
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        Assert.assertFalse(group.canProcess(cmd, "-unknown"));
    }

    @Test
    public void canProcess_givenAnonymousArgumentAvailableAndNotOptionLike_shouldReturnTrue() {
        MockOptionHandler argHandler = new MockOptionHandler();
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.defaultLooksLikeOption = false;
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        Assert.assertTrue(group.canProcess(cmd, "plainValue"));
    }

    @Test
    public void canProcess_givenNoAnonymousAndNotOptionLike_shouldReturnFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.defaultLooksLikeOption = false;
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        Assert.assertFalse(group.canProcess(cmd, "plainValue"));
    }

    @Test
    public void process_givenExactTriggerMatch_shouldDelegateToOption() throws OptionException {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("--run");
        optHandler.consumeOnProcess = true;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("--run");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertEquals(1, optHandler.processCount);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenSameInstanceRepetition_shouldRollbackAndAbort() throws OptionException {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("--flag");
        optHandler.consumeOnProcess = false;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("--flag");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertEquals(1, optHandler.processCount);
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("--flag", it.next());
    }

    @Test
    public void process_givenOptionLikeTokenWithTailMapMatch_shouldProcessMemberOption() throws OptionException {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("-xyz");
        optHandler.canProcessString = true;
        optHandler.consumeOnProcess = true;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.optionLikeTokens.add("-x");
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("-x");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertEquals(1, optHandler.processCount);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenOptionLikeTokenWithoutMemberOptionMatch_shouldBacktrackAndReturn() throws OptionException {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.triggers.add("-zzz");
        optHandler.canProcessString = false;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.optionLikeTokens.add("-unrecognized");
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("-unrecognized");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertEquals(0, optHandler.processCount);
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("-unrecognized", it.next());
    }

    @Test
    public void process_givenNotOptionLikeTokenAndNoAnonymousArguments_shouldBacktrackAndBreak() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.defaultLooksLikeOption = false;
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("token");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("token", it.next());
    }

    @Test
    public void process_givenNotOptionLikeTokenAndAnonymousArgumentsCanProcess_shouldProcessArgument() throws OptionException {
        MockOptionHandler argHandler = new MockOptionHandler();
        argHandler.canProcessIterator = true;
        argHandler.consumeOnProcess = true;
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.defaultLooksLikeOption = false;
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("param1");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertEquals(1, argHandler.processCount);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenNotOptionLikeTokenAndAnonymousArgumentCannotProcess_shouldSkipProcessing() throws OptionException {
        MockOptionHandler argHandler = new MockOptionHandler();
        argHandler.canProcessIterator = false;
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.defaultLooksLikeOption = false;
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        List argList = new ArrayList();
        argList.add("param1");
        ListIterator it = argList.listIterator();

        group.process(cmd, it);

        Assert.assertEquals(0, argHandler.processCount);
    }

    @Test
    public void validate_givenValidOptionsWithinMinAndMax_shouldSucceed() throws OptionException {
        MockOptionHandler optHandler1 = new MockOptionHandler();
        optHandler1.preferredName = "-a";
        Option opt1 = createMockOption(optHandler1);

        MockOptionHandler optHandler2 = new MockOptionHandler();
        optHandler2.preferredName = "-b";
        Option opt2 = createMockOption(optHandler2);

        MockOptionHandler argHandler = new MockOptionHandler();
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 1, 2, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.presentOptions.add(opt1);
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        group.validate(cmd);

        Assert.assertEquals(1, optHandler1.validateCount);
        Assert.assertEquals(0, optHandler2.validateCount);
        Assert.assertEquals(1, argHandler.validateCount);
    }

    @Test
    public void validate_givenRequiredOptionNotPresent_shouldStillValidateOption() throws OptionException {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.preferredName = "-req";
        optHandler.required = true;
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        group.validate(cmd);

        Assert.assertEquals(1, optHandler.validateCount);
    }

    @Test
    public void validate_givenTooManyOptions_shouldThrowUnexpectedToken() {
        MockOptionHandler optHandler1 = new MockOptionHandler();
        optHandler1.preferredName = "-a";
        Option opt1 = createMockOption(optHandler1);

        MockOptionHandler optHandler2 = new MockOptionHandler();
        optHandler2.preferredName = "-b";
        Option opt2 = createMockOption(optHandler2);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        cmdHandler.presentOptions.add(opt1);
        cmdHandler.presentOptions.add(opt2);
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        try {
            group.validate(cmd);
            Assert.fail("Should throw OptionException for unexpected token");
        } catch (OptionException oe) {
            Assert.assertEquals(group, oe.getOption());
        }
    }

    @Test
    public void validate_givenTooFewOptions_shouldThrowMissingOption() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.preferredName = "-a";
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 1, 2, true);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        try {
            group.validate(cmd);
            Assert.fail("Should throw OptionException for missing option");
        } catch (OptionException oe) {
            Assert.assertEquals(group, oe.getOption());
        }
    }

    @Test
    public void validate_givenAnonymousArgumentFailsValidation_shouldPropagateException() {
        MockOptionHandler argHandler = new MockOptionHandler();
        argHandler.throwOnValidate = true;
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        try {
            group.validate(cmd);
            Assert.fail("Should propagate child validation exception");
        } catch (OptionException oe) {
            Assert.assertNotNull(oe);
        }
    }

    @Test
    public void isRequired_givenCombinationsOfParentAndRequired_shouldReturnExpected() {
        GroupImpl rootWithMin = new GroupImpl(new ArrayList(), "root", "desc", 1, 1, false);
        Assert.assertTrue(rootWithMin.isRequired());

        GroupImpl rootWithoutMin = new GroupImpl(new ArrayList(), "root", "desc", 0, 1, false);
        Assert.assertFalse(rootWithoutMin.isRequired());

        GroupImpl childGroupReq = new GroupImpl(new ArrayList(), "child", "desc", 1, 1, true);
        GroupImpl parentGroup = new GroupImpl(new ArrayList(), "parent", "desc", 0, 1, false);
        childGroupReq.setParent(parentGroup);
        Assert.assertTrue(childGroupReq.isRequired());

        GroupImpl childGroupNotReq = new GroupImpl(new ArrayList(), "child", "desc", 1, 1, false);
        childGroupNotReq.setParent(parentGroup);
        Assert.assertFalse(childGroupNotReq.isRequired());
    }

    @Test
    public void defaults_givenOptionsAndAnonymous_shouldCallDefaultsOnAll() {
        MockOptionHandler optHandler = new MockOptionHandler();
        Option opt = createMockOption(optHandler);

        MockOptionHandler argHandler = new MockOptionHandler();
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1, false);

        MockCommandLineHandler cmdHandler = new MockCommandLineHandler();
        WriteableCommandLine cmd = createMockCommandLine(cmdHandler);

        group.defaults(cmd);

        Assert.assertEquals(1, optHandler.defaultsCount);
        Assert.assertEquals(1, argHandler.defaultsCount);
    }

    @Test
    public void findOption_givenTriggerPresentInChildren_shouldReturnFoundOption() {
        MockOptionHandler optHandler1 = new MockOptionHandler();
        optHandler1.triggers.add("-a");
        Option opt1 = createMockOption(optHandler1);

        MockOptionHandler optHandler2 = new MockOptionHandler();
        optHandler2.triggers.add("-b");
        Option opt2 = createMockOption(optHandler2);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 2, false);

        Assert.assertSame(opt1, group.findOption("-a"));
        Assert.assertSame(opt2, group.findOption("-b"));
        Assert.assertNull(group.findOption("-unknown"));
    }

    @Test
    public void appendUsage_givenDefaultSettingsAndSeparator_shouldFormatCorrectly() {
        MockOptionHandler optHandler1 = new MockOptionHandler();
        optHandler1.usageString = "-a";
        Option opt1 = createMockOption(optHandler1);

        MockOptionHandler optHandler2 = new MockOptionHandler();
        optHandler2.usageString = "-b";
        Option opt2 = createMockOption(optHandler2);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "mygroup", "desc", 0, 2, false);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        group.appendUsage(buffer, settings, null);

        Assert.assertEquals("mygroup (-a|-b)", buffer.toString());
    }

    @Test
    public void appendUsage_givenCustomSeparatorAndOptionalWithOuter_shouldIncludeOuterBrackets() {
        MockOptionHandler optHandler1 = new MockOptionHandler();
        optHandler1.usageString = "-x";
        Option opt1 = createMockOption(optHandler1);

        MockOptionHandler optHandler2 = new MockOptionHandler();
        optHandler2.usageString = "-y";
        Option opt2 = createMockOption(optHandler2);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, null, "desc", 0, 2, false);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buffer, settings, null, " , ");

        Assert.assertEquals("[-x , -y]", buffer.toString());
    }

    @Test
    public void appendUsage_givenOptionalWithoutOuterAndWithArguments_shouldFormatArguments() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.usageString = "-opt";
        Option opt = createMockOption(optHandler);

        MockOptionHandler argHandler = new MockOptionHandler();
        argHandler.usageString = "<file>";
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, null, "desc", 0, 1, false);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buffer, settings, null);

        Assert.assertEquals("[-opt <file>]", buffer.toString());
    }

    @Test
    public void appendUsage_givenComparator_shouldSortOptions() {
        MockOptionHandler optHandler1 = new MockOptionHandler();
        optHandler1.preferredName = "Z";
        optHandler1.usageString = "-z";
        Option opt1 = createMockOption(optHandler1);

        MockOptionHandler optHandler2 = new MockOptionHandler();
        optHandler2.preferredName = "A";
        optHandler2.usageString = "-a";
        Option opt2 = createMockOption(optHandler2);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, null, "desc", 0, 2, true);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };

        group.appendUsage(buffer, settings, comp);

        Assert.assertEquals("-a|-z", buffer.toString());
    }

    @Test
    public void appendUsage_givenExpandedWithoutDisplayGroupExpandedSetting_shouldPassNoneChildSettings() {
        MockOptionHandler optHandler = new MockOptionHandler();
        optHandler.usageString = "opt";
        Option opt = createMockOption(optHandler);

        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, null, "desc", 1, 1, true);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();

        group.appendUsage(buffer, settings, null);

        Assert.assertEquals("opt", buffer.toString());
    }

    @Test
    public void helpLines_givenSettingsForNameExpandedAndArguments_shouldAggregateLines() {
        MockOptionHandler optHandler = new MockOptionHandler();
        HelpLine lineOpt = new HelpLineImpl(createMockOption(optHandler), 1);
        optHandler.helpLines.add(lineOpt);
        Option opt = createMockOption(optHandler);

        MockOptionHandler argHandler = new MockOptionHandler();
        HelpLine lineArg = new HelpLineImpl(createMockArgument(argHandler), 1);
        argHandler.helpLines.add(lineArg);
        Argument arg = createMockArgument(argHandler);

        List options = new ArrayList();
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "mainGroup", "Main Group Desc", 0, 1, false);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, settings, null);

        Assert.assertEquals(3, lines.size());
    }

    @Test
    public void helpLines_givenComparator_shouldSortExpandedOptions() {
        MockOptionHandler optHandlerZ = new MockOptionHandler();
        optHandlerZ.preferredName = "Z";
        Option optZ = createMockOption(optHandlerZ);

        MockOptionHandler optHandlerA = new MockOptionHandler();
        optHandlerA.preferredName = "A";
        Option optA = createMockOption(optHandlerA);

        List options = new ArrayList();
        options.add(optZ);
        options.add(optA);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2, false);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };

        List lines = group.helpLines(0, settings, comp);
        Assert.assertNotNull(lines);
    }

    @Test
    public void reverseStringComparator_shouldOrderStringsInReverse() {
        Comparator comp = ReverseStringComparator.getInstance();
        Assert.assertNotNull(comp);
        Assert.assertSame(comp, ReverseStringComparator.getInstance());

        Assert.assertTrue(comp.compare("a", "b") > 0);
        Assert.assertTrue(comp.compare("b", "a") < 0);
        Assert.assertEquals(0, comp.compare("same", "same"));
    }
}