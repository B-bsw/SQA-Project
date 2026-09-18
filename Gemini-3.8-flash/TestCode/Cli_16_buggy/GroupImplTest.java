package org.apache.commons.cli2.option;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.junit.Test;

public class GroupImplTest {

    // --- Helpers to build test stubs without external mocking frameworks ---

    private Option createMockOption(final String preferredName,
                                    final Set triggers,
                                    final Set prefixes,
                                    final boolean required,
                                    final boolean canProcessResult) {
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    } else if ("getTriggers".equals(name)) {
                        return triggers != null ? triggers : Collections.EMPTY_SET;
                    } else if ("getPrefixes".equals(name)) {
                        return prefixes != null ? prefixes : Collections.EMPTY_SET;
                    } else if ("isRequired".equals(name)) {
                        return Boolean.valueOf(required);
                    } else if ("canProcess".equals(name)) {
                        return Boolean.valueOf(canProcessResult);
                    } else if ("findOption".equals(name)) {
                        String trig = (String) args[0];
                        if (triggers != null && triggers.contains(trig)) {
                            return proxy;
                        }
                        return null;
                    } else if ("helpLines".equals(name)) {
                        List lines = new ArrayList();
                        lines.add(new HelpLineImpl((Option) proxy, ((Integer) args[0]).intValue()));
                        return lines;
                    } else if ("appendUsage".equals(name)) {
                        StringBuffer buf = (StringBuffer) args[0];
                        buf.append(preferredName);
                        return null;
                    } else if ("process".equals(name)) {
                        return null;
                    } else if ("validate".equals(name)) {
                        return null;
                    } else if ("defaults".equals(name)) {
                        return null;
                    } else if ("getDescription".equals(name)) {
                        return "desc-" + preferredName;
                    } else if ("getId".equals(name)) {
                        return new Integer(0);
                    } else if ("equals".equals(name)) {
                        return Boolean.valueOf(proxy == args[0]);
                    } else if ("hashCode".equals(name)) {
                        return new Integer(System.identityHashCode(proxy));
                    } else if ("toString".equals(name)) {
                        return preferredName != null ? preferredName : "MockOption";
                    }
                    Class returnType = method.getReturnType();
                    if (returnType == boolean.class) {
                        return Boolean.FALSE;
                    }
                    if (returnType == int.class) {
                        return new Integer(0);
                    }
                    return null;
                }
            }
        );
    }

    private Group createMockGroupOption(final String preferredName,
                                        final Set triggers,
                                        final boolean isRequired,
                                        final boolean hasOption) {
        return (Group) Proxy.newProxyInstance(
            Group.class.getClassLoader(),
            new Class[] { Group.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    } else if ("getTriggers".equals(name)) {
                        return triggers != null ? triggers : Collections.EMPTY_SET;
                    } else if ("getPrefixes".equals(name)) {
                        return Collections.EMPTY_SET;
                    } else if ("isRequired".equals(name)) {
                        return Boolean.valueOf(isRequired);
                    } else if ("canProcess".equals(name)) {
                        return Boolean.TRUE;
                    } else if ("findOption".equals(name)) {
                        String trig = (String) args[0];
                        if (triggers != null && triggers.contains(trig)) {
                            return proxy;
                        }
                        return null;
                    } else if ("validate".equals(name)) {
                        return null;
                    } else if ("appendUsage".equals(name)) {
                        StringBuffer buf = (StringBuffer) args[0];
                        buf.append(preferredName);
                        return null;
                    } else if ("helpLines".equals(name)) {
                        return Collections.EMPTY_LIST;
                    } else if ("defaults".equals(name)) {
                        return null;
                    } else if ("equals".equals(name)) {
                        return Boolean.valueOf(proxy == args[0]);
                    } else if ("hashCode".equals(name)) {
                        return new Integer(System.identityHashCode(proxy));
                    } else if ("toString".equals(name)) {
                        return preferredName;
                    }
                    Class returnType = method.getReturnType();
                    if (returnType == boolean.class) {
                        return Boolean.FALSE;
                    }
                    if (returnType == int.class) {
                        return new Integer(0);
                    }
                    return null;
                }
            }
        );
    }

    private Argument createMockArgument(final String preferredName,
                                        final boolean canProcessArgs) {
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    } else if ("getTriggers".equals(name)) {
                        return Collections.EMPTY_SET;
                    } else if ("getPrefixes".equals(name)) {
                        return Collections.EMPTY_SET;
                    } else if ("canProcess".equals(name)) {
                        return Boolean.valueOf(canProcessArgs);
                    } else if ("process".equals(name)) {
                        ListIterator li = (ListIterator) args[1];
                        if (li.hasNext()) {
                            li.next();
                        }
                        return null;
                    } else if ("appendUsage".equals(name)) {
                        StringBuffer buf = (StringBuffer) args[0];
                        buf.append("<").append(preferredName).append(">");
                        return null;
                    } else if ("helpLines".equals(name)) {
                        List lines = new ArrayList();
                        lines.add(new HelpLineImpl((Option) proxy, ((Integer) args[0]).intValue()));
                        return lines;
                    } else if ("validate".equals(name)) {
                        return null;
                    } else if ("defaults".equals(name)) {
                        return null;
                    } else if ("isRequired".equals(name)) {
                        return Boolean.FALSE;
                    } else if ("findOption".equals(name)) {
                        return null;
                    } else if ("equals".equals(name)) {
                        return Boolean.valueOf(proxy == args[0]);
                    } else if ("hashCode".equals(name)) {
                        return new Integer(System.identityHashCode(proxy));
                    } else if ("toString".equals(name)) {
                        return preferredName;
                    }
                    Class returnType = method.getReturnType();
                    if (returnType == boolean.class) {
                        return Boolean.FALSE;
                    }
                    if (returnType == int.class) {
                        return new Integer(0);
                    }
                    return null;
                }
            }
        );
    }

    private WriteableCommandLine createMockCommandLine(final Set presentOptions,
                                                        final Set optionLikeArgs) {
        return (WriteableCommandLine) Proxy.newProxyInstance(
            WriteableCommandLine.class.getClassLoader(),
            new Class[] { WriteableCommandLine.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("hasOption".equals(name)) {
                        return Boolean.valueOf(presentOptions != null && presentOptions.contains(args[0]));
                    } else if ("looksLikeOption".equals(name)) {
                        return Boolean.valueOf(optionLikeArgs != null && optionLikeArgs.contains(args[0]));
                    } else if ("equals".equals(name)) {
                        return Boolean.valueOf(proxy == args[0]);
                    } else if ("hashCode".equals(name)) {
                        return new Integer(System.identityHashCode(proxy));
                    } else if ("toString".equals(name)) {
                        return "MockCommandLine";
                    }
                    Class returnType = method.getReturnType();
                    if (returnType == boolean.class) {
                        return Boolean.FALSE;
                    }
                    if (returnType == int.class) {
                        return new Integer(0);
                    }
                    return null;
                }
            }
        );
    }

    // --- Constructor & Basic Property Tests ---

    @Test
    public void constructor_givenOptionsAndArguments_shouldSeparateThemCorrectly() {
        // Arrange
        List options = new ArrayList();
        Set triggers1 = new HashSet();
        triggers1.add("--file");
        Set prefixes1 = new HashSet();
        prefixes1.add("--");
        Option opt1 = createMockOption("--file", triggers1, prefixes1, false, true);

        Argument arg1 = createMockArgument("arg1", true);
        options.add(opt1);
        options.add(arg1);

        // Act
        GroupImpl group = new GroupImpl(options, "testGroup", "A test group", 1, 2);

        // Assert
        Assert.assertEquals("testGroup", group.getPreferredName());
        Assert.assertEquals("A test group", group.getDescription());
        Assert.assertEquals(1, group.getMinimum());
        Assert.assertEquals(2, group.getMaximum());
        Assert.assertTrue(group.isRequired());

        // Child options should only contain opt1, arg1 moved to anonymous
        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertSame(opt1, group.getOptions().get(0));
        Assert.assertEquals(1, group.getAnonymous().size());
        Assert.assertSame(arg1, group.getAnonymous().get(0));

        // Triggers and prefixes
        Assert.assertTrue(group.getTriggers().contains("--file"));
        Assert.assertTrue(group.getPrefixes().contains("--"));
    }

    @Test
    public void isRequired_givenZeroMinimum_shouldReturnFalse() {
        // Arrange
        GroupImpl group = new GroupImpl(new ArrayList(), "optionalGroup", "desc", 0, 1);

        // Act & Assert
        Assert.assertFalse(group.isRequired());
    }

    @Test
    public void isRequired_givenGreaterThanZeroMinimum_shouldReturnTrue() {
        // Arrange
        GroupImpl group = new GroupImpl(new ArrayList(), "reqGroup", "desc", 2, 5);

        // Act & Assert
        Assert.assertTrue(group.isRequired());
    }

    // --- canProcess Tests ---

    @Test
    public void canProcess_givenNullArgument_shouldReturnFalse() {
        // Arrange
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null);

        // Act
        boolean result = group.canProcess(cmd, (String) null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void canProcess_givenDirectTriggerMatch_shouldReturnTrue() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null);

        // Act
        boolean result = group.canProcess(cmd, "-a");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void canProcess_givenBurstingCandidateInTailMap_shouldReturnTrue() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        // option accepts bursting
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null);

        // Act: "-ab" is not directly in map, but "-a" is in tailMap("-ab")
        boolean result = group.canProcess(cmd, "-ab");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void canProcess_givenOptionLikeStringAndNoOptionCanProcess_shouldReturnFalse() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        // canProcess returns false for bursting
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, false);
        options.add(opt);

        // anonymous argument present
        Argument arg = createMockArgument("arg", true);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        Set optionLikes = new HashSet();
        optionLikes.add("--unknown");
        WriteableCommandLine cmd = createMockCommandLine(null, optionLikes);

        // Act
        boolean result = group.canProcess(cmd, "--unknown");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void canProcess_givenNonOptionWithAnonymousArguments_shouldReturnTrue() {
        // Arrange
        List options = new ArrayList();
        Argument arg = createMockArgument("file", true);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, Collections.EMPTY_SET);

        // Act
        boolean result = group.canProcess(cmd, "somefile.txt");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void canProcess_givenNonOptionWithoutAnonymousArguments_shouldReturnFalse() {
        // Arrange
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, Collections.EMPTY_SET);

        // Act
        boolean result = group.canProcess(cmd, "orphanValue");

        // Assert
        Assert.assertFalse(result);
    }

    // --- process Tests ---

    @Test
    public void process_givenDirectOptionTrigger_shouldDelegateToOption() throws OptionException {
        // Arrange
        final boolean[] processed = new boolean[1];
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-v");

        Option opt = (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("getTriggers".equals(method.getName())) {
                        Set s = new HashSet();
                        s.add("-v");
                        return s;
                    }
                    if ("getPrefixes".equals(method.getName())) {
                        return Collections.EMPTY_SET;
                    }
                    if ("process".equals(method.getName())) {
                        processed[0] = true;
                        ListIterator it = (ListIterator) args[1];
                        it.next(); // consume "-v"
                        return null;
                    }
                    return null;
                }
            }
        );
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null);

        List argsList = new ArrayList();
        argsList.add("-v");
        ListIterator it = argsList.listIterator();

        // Act
        group.process(cmd, it);

        // Assert
        Assert.assertTrue(processed[0]);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenRepeatedArgumentWithoutConsumption_shouldAbortToPreventInfiniteLoop() throws OptionException {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-x");

        // Option does NOT consume token from iterator
        Option opt = createMockOption("-x", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null);

        List argsList = new ArrayList();
        argsList.add("-x");
        ListIterator it = argsList.listIterator();

        // Act
        group.process(cmd, it);

        // Assert: loop breaks on cycle detection
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("-x", it.next());
    }

    @Test
    public void process_givenOptionLikeArgFoundInTailMap_shouldProcessMemberOption() throws OptionException {
        // Arrange
        final boolean[] processed = new boolean[1];
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-b");

        Option opt = (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("getTriggers".equals(name)) {
                        Set s = new HashSet();
                        s.add("-b");
                        return s;
                    }
                    if ("getPrefixes".equals(name)) {
                        return Collections.EMPTY_SET;
                    }
                    if ("canProcess".equals(name)) {
                        return Boolean.TRUE;
                    }
                    if ("process".equals(name)) {
                        processed[0] = true;
                        ListIterator it = (ListIterator) args[1];
                        it.next(); // consume
                        return null;
                    }
                    return null;
                }
            }
        );
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        Set optionLikes = new HashSet();
        optionLikes.add("-bar");
        WriteableCommandLine cmd = createMockCommandLine(null, optionLikes);

        List argsList = new ArrayList();
        argsList.add("-bar");
        ListIterator it = argsList.listIterator();

        // Act
        group.process(cmd, it);

        // Assert
        Assert.assertTrue(processed[0]);
    }

    @Test
    public void process_givenOptionLikeArgNotFoundInTailMap_shouldRollbackAndReturn() throws OptionException {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, false);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        Set optionLikes = new HashSet();
        optionLikes.add("--unknown");
        WriteableCommandLine cmd = createMockCommandLine(null, optionLikes);

        List argsList = new ArrayList();
        argsList.add("--unknown");
        ListIterator it = argsList.listIterator();

        // Act
        group.process(cmd, it);

        // Assert: iterator rolled back to start
        Assert.assertEquals(0, it.nextIndex());
        Assert.assertEquals("--unknown", it.next());
    }

    @Test
    public void process_givenNonOptionWithAnonymous_shouldProcessAnonymousArgument() throws OptionException {
        // Arrange
        List options = new ArrayList();
        Argument arg = createMockArgument("arg1", true);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, Collections.EMPTY_SET);

        List argsList = new ArrayList();
        argsList.add("value1");
        ListIterator it = argsList.listIterator();

        // Act
        group.process(cmd, it);

        // Assert: argument was consumed
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenNonOptionWithoutAnonymous_shouldRollbackAndBreak() throws OptionException {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-o");
        Option opt = createMockOption("-o", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, Collections.EMPTY_SET);

        List argsList = new ArrayList();
        argsList.add("notAnOption");
        ListIterator it = argsList.listIterator();

        // Act
        group.process(cmd, it);

        // Assert: rolled back
        Assert.assertEquals(0, it.nextIndex());
    }

    // --- validate Tests ---

    @Test
    public void validate_givenChildOptionsMeetingBounds_shouldPass() throws OptionException {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        Set present = new HashSet();
        present.add(opt);
        WriteableCommandLine cmd = createMockCommandLine(present, null);

        GroupImpl group = new GroupImpl(options, "group", "desc", 1, 1);

        // Act & Assert (no exception)
        group.validate(cmd);
    }

    @Test
    public void validate_givenChildGroup_shouldAlwaysValidateChildGroup() throws OptionException {
        // Arrange
        final boolean[] childValidated = new boolean[1];
        List options = new ArrayList();
        Group childGroup = (Group) Proxy.newProxyInstance(
            Group.class.getClassLoader(),
            new Class[] { Group.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("validate".equals(method.getName())) {
                        childValidated[0] = true;
                        return null;
                    }
                    if ("getTriggers".equals(method.getName()) || "getPrefixes".equals(method.getName())) {
                        return Collections.EMPTY_SET;
                    }
                    if ("isRequired".equals(method.getName())) {
                        return Boolean.FALSE;
                    }
                    return null;
                }
            }
        );
        options.add(childGroup);

        WriteableCommandLine cmd = createMockCommandLine(Collections.EMPTY_SET, null);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        // Act
        group.validate(cmd);

        // Assert
        Assert.assertTrue(childValidated[0]);
    }

    @Test
    public void validate_givenPresentOptionsLessThanMinimum_shouldThrowMissingOption() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        WriteableCommandLine cmd = createMockCommandLine(Collections.EMPTY_SET, null);
        GroupImpl group = new GroupImpl(options, "group", "desc", 1, 2);

        // Act & Assert
        try {
            group.validate(cmd);
            Assert.fail("Expected OptionException for missing option");
        } catch (OptionException e) {
            Assert.assertEquals(ResourceConstants.MISSING_OPTION, e.getMessageKey());
            Assert.assertSame(group, e.getOption());
        }
    }

    @Test
    public void validate_givenPresentOptionsExceedingMaximum_shouldThrowUnexpectedToken() {
        // Arrange
        List options = new ArrayList();
        Set triggers1 = new HashSet();
        triggers1.add("-a");
        Option opt1 = createMockOption("-a", triggers1, Collections.EMPTY_SET, false, true);

        Set triggers2 = new HashSet();
        triggers2.add("-b");
        Option opt2 = createMockOption("-b", triggers2, Collections.EMPTY_SET, false, true);

        options.add(opt1);
        options.add(opt2);

        Set present = new HashSet();
        present.add(opt1);
        present.add(opt2);
        WriteableCommandLine cmd = createMockCommandLine(present, null);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        // Act & Assert
        try {
            group.validate(cmd);
            Assert.fail("Expected OptionException for unexpected token");
        } catch (OptionException e) {
            Assert.assertEquals(ResourceConstants.UNEXPECTED_TOKEN, e.getMessageKey());
            Assert.assertSame(group, e.getOption());
        }
    }

    @Test
    public void validate_givenAnonymousArguments_shouldValidateEach() throws OptionException {
        // Arrange
        final boolean[] validated = new boolean[1];
        List options = new ArrayList();
        Argument arg = (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("validate".equals(method.getName())) {
                        validated[0] = true;
                        return null;
                    }
                    if ("getTriggers".equals(method.getName()) || "getPrefixes".equals(method.getName())) {
                        return Collections.EMPTY_SET;
                    }
                    return null;
                }
            }
        );
        options.add(arg);

        WriteableCommandLine cmd = createMockCommandLine(Collections.EMPTY_SET, null);
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        // Act
        group.validate(cmd);

        // Assert
        Assert.assertTrue(validated[0]);
    }

    // --- appendUsage Tests ---

    @Test
    public void appendUsage_givenDefaultSettings_shouldFormatCorrectly() {
        // Arrange
        List options = new ArrayList();
        Set triggers1 = new HashSet();
        triggers1.add("-a");
        Option opt1 = createMockOption("-a", triggers1, Collections.EMPTY_SET, false, true);

        Set triggers2 = new HashSet();
        triggers2.add("-b");
        Option opt2 = createMockOption("-b", triggers2, Collections.EMPTY_SET, false, true);

        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 2);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        // Act
        group.appendUsage(buffer, settings, null);

        // Assert: myGroup (-a|-b)
        Assert.assertEquals("myGroup (-a|-b)", buffer.toString());
    }

    @Test
    public void appendUsage_givenOptionalAndOuterAndArguments_shouldIncludeBracketsAndArgs() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-x");
        Option opt = createMockOption("-x", triggers, Collections.EMPTY_SET, false, true);
        Argument arg = createMockArgument("file", true);

        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "optGroup", "description", 0, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        // Act
        group.appendUsage(buffer, settings, null, ", ");

        // Assert: [ -x] <file>
        String result = buffer.toString();
        Assert.assertTrue(result.startsWith("["));
        Assert.assertTrue(result.indexOf("-x") >= 0);
        Assert.assertTrue(result.indexOf("<file>") >= 0);
    }

    @Test
    public void appendUsage_givenComparator_shouldSortOptions() {
        // Arrange
        List options = new ArrayList();
        Set triggersZ = new HashSet();
        triggersZ.add("-z");
        Option optZ = createMockOption("-z", triggersZ, Collections.EMPTY_SET, false, true);

        Set triggersA = new HashSet();
        triggersA.add("-a");
        Option optA = createMockOption("-a", triggersA, Collections.EMPTY_SET, false, true);

        options.add(optZ);
        options.add(optA);

        GroupImpl group = new GroupImpl(options, null, "description", 1, 2);
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

        // Act
        group.appendUsage(buffer, settings, comp, "|");

        // Assert: sorted as -a|-z
        Assert.assertEquals("-a|-z", buffer.toString());
    }

    @Test
    public void appendUsage_givenNamedOnlyWithoutExpanded_shouldAppendNameOnly() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-a");
        Option opt = createMockOption("-a", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "groupName", "desc", 1, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(); // No DISPLAY_GROUP_EXPANDED

        // Act
        group.appendUsage(buffer, settings, null);

        // Assert
        Assert.assertEquals("groupName", buffer.toString());
    }

    // --- helpLines Tests ---

    @Test
    public void helpLines_givenGroupNameAndExpanded_shouldReturnAllHelpLines() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("--help");
        Option opt = createMockOption("--help", triggers, Collections.EMPTY_SET, false, true);
        Argument arg = createMockArgument("target", true);
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "mainGroup", "Main command group", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        // Act
        List lines = group.helpLines(0, settings, null);

        // Assert: 1 for group name, 1 for opt, 1 for arg = 3 lines total
        Assert.assertEquals(3, lines.size());
        HelpLine first = (HelpLine) lines.get(0);
        Assert.assertSame(group, first.getOption());
        Assert.assertEquals(0, first.getIndent());
    }

    @Test
    public void helpLines_givenComparator_shouldSortOptionsInHelp() {
        // Arrange
        List options = new ArrayList();
        Set triggersB = new HashSet();
        triggersB.add("-b");
        Option optB = createMockOption("-b", triggersB, Collections.EMPTY_SET, false, true);

        Set triggersA = new HashSet();
        triggersA.add("-a");
        Option optA = createMockOption("-a", triggersA, Collections.EMPTY_SET, false, true);

        options.add(optB);
        options.add(optA);

        GroupImpl group = new GroupImpl(options, null, "desc", 0, 2);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };

        // Act
        List lines = group.helpLines(1, settings, comp);

        // Assert: 2 child lines, first should be -a, second -b
        Assert.assertEquals(2, lines.size());
        HelpLine line0 = (HelpLine) lines.get(0);
        HelpLine line1 = (HelpLine) lines.get(1);
        Assert.assertSame(optA, line0.getOption());
        Assert.assertSame(optB, line1.getOption());
    }

    // --- findOption Tests ---

    @Test
    public void findOption_givenExistingTrigger_shouldReturnMatchingOption() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-v");
        triggers.add("--version");
        Option opt = createMockOption("-v", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        // Act
        Option found = group.findOption("--version");

        // Assert
        Assert.assertSame(opt, found);
    }

    @Test
    public void findOption_givenNonExistingTrigger_shouldReturnNull() {
        // Arrange
        List options = new ArrayList();
        Set triggers = new HashSet();
        triggers.add("-v");
        Option opt = createMockOption("-v", triggers, Collections.EMPTY_SET, false, true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        // Act
        Option found = group.findOption("--nonexistent");

        // Assert
        Assert.assertNull(found);
    }

    // --- defaults Tests ---

    @Test
    public void defaults_givenOptionsAndArguments_shouldCallDefaultsOnAllChildren() {
        // Arrange
        final boolean[] optDefaultCalled = new boolean[1];
        final boolean[] argDefaultCalled = new boolean[1];

        List options = new ArrayList();
        Option opt = (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("defaults".equals(method.getName())) {
                        optDefaultCalled[0] = true;
                        return null;
                    }
                    if ("getTriggers".equals(method.getName()) || "getPrefixes".equals(method.getName())) {
                        return Collections.EMPTY_SET;
                    }
                    return null;
                }
            }
        );

        Argument arg = (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("defaults".equals(method.getName())) {
                        argDefaultCalled[0] = true;
                        return null;
                    }
                    if ("getTriggers".equals(method.getName()) || "getPrefixes".equals(method.getName())) {
                        return Collections.EMPTY_SET;
                    }
                    return null;
                }
            }
        );

        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null);

        // Act
        group.defaults(cmd);

        // Assert
        Assert.assertTrue(optDefaultCalled[0]);
        Assert.assertTrue(argDefaultCalled[0]);
    }

    // --- ReverseStringComparator Tests ---

    @Test
    public void reverseStringComparator_givenDifferentStrings_shouldSortInReverseOrder() {
        // Arrange
        Comparator comp = ReverseStringComparator.getInstance();

        // Act & Assert
        Assert.assertNotNull(comp);
        Assert.assertTrue(comp.compare("alpha", "beta") > 0);
        Assert.assertTrue(comp.compare("beta", "alpha") < 0);
        Assert.assertEquals(0, comp.compare("same", "same"));
    }
}