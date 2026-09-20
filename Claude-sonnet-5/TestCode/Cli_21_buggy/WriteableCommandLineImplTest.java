package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;
    private GroupBuilder gbuilder;
    private Group rootGroup;
    private WriteableCommandLineImpl cmdLine;

    @Before
    public void setUp() throws Exception {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();
        gbuilder = new GroupBuilder();

        Option baseOpt = obuilder.withShortName("r").create();
        rootGroup = gbuilder.withOption(baseOpt).create();

        cmdLine = new WriteableCommandLineImpl(rootGroup, new ArrayList());
    }

    // ---------- constructor / getNormalised ----------

    @Test
    public void testConstructorAndGetNormalised() {
        List args = Arrays.asList(new String[] {"-r", "value"});
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals(args, cl.getNormalised());
    }

    @Test
    public void testGetNormalisedIsUnmodifiable() {
        boolean thrown = false;
        try {
            cmdLine.getNormalised().add("x");
        } catch (UnsupportedOperationException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    // ---------- addOption / hasOption / getOptions / getOption ----------

    @Test
    public void testAddOptionAndHasOption() {
        Option opt = obuilder.withShortName("a").withLongName("alpha").create();
        assertFalse(cmdLine.hasOption(opt));
        cmdLine.addOption(opt);
        assertTrue(cmdLine.hasOption(opt));
        assertTrue(cmdLine.getOptions().contains(opt));
        assertSame(opt, cmdLine.getOption(opt.getPreferredName()));
    }

    @Test
    public void testHasOptionFalseForUnknown() {
        Option opt = obuilder.withShortName("b").create();
        assertFalse(cmdLine.hasOption(opt));
    }

    @Test
    public void testHasOptionNull() {
        assertFalse(cmdLine.hasOption(null));
    }

    @Test(expected = NullPointerException.class)
    public void testAddOptionNullThrows() {
        cmdLine.addOption(null);
    }

    @Test
    public void testAddOptionNoParent() {
        Option standalone = obuilder.withShortName("c").create();
        int before = cmdLine.getOptions().size();
        cmdLine.addOption(standalone);
        assertTrue(cmdLine.hasOption(standalone));
        assertEquals(before + 1, cmdLine.getOptions().size());
    }

    @Test
    public void testAddOptionSingleParent() {
        Option child = obuilder.withShortName("d").create();
        Group parent = gbuilder.withOption(child).create();
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(parent, new ArrayList());
        cl.addOption(child);
        assertTrue(cl.hasOption(child));
        assertTrue(cl.getOptions().contains(parent));
    }

    @Test
    public void testAddOptionMultipleParents() {
        Option leaf = obuilder.withShortName("e").create();
        Group innerGroup = gbuilder.withOption(leaf).create();
        Group outerGroup = gbuilder.withOption(innerGroup).create();
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(outerGroup, new ArrayList());
        cl.addOption(leaf);
        assertTrue(cl.hasOption(leaf));
        assertTrue(cl.getOptions().contains(innerGroup));
        assertTrue(cl.getOptions().contains(outerGroup));
    }

    @Test
    public void testAddOptionCalledTwiceAllowsDuplicate() {
        Option opt = obuilder.withShortName("f").create();
        cmdLine.addOption(opt);
        cmdLine.addOption(opt);
        int count = 0;
        for (Iterator it = cmdLine.getOptions().iterator(); it.hasNext();) {
            if (it.next() == opt) {
                count++;
            }
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetOptionByTrigger() {
        Option opt = obuilder.withShortName("g").withLongName("golf").create();
        cmdLine.addOption(opt);
        for (Iterator it = opt.getTriggers().iterator(); it.hasNext();) {
            String trig = (String) it.next();
            assertSame(opt, cmdLine.getOption(trig));
        }
        assertSame(opt, cmdLine.getOption(opt.getPreferredName()));
    }

    @Test
    public void testGetOptionNotAdded() {
        Option opt = obuilder.withShortName("h").create();
        assertNull(cmdLine.getOption(opt.getPreferredName()));
    }

    @Test
    public void testGetOptionNullTrigger() {
        assertNull(cmdLine.getOption(null));
    }

    @Test
    public void testGetOptionsUnmodifiable() {
        boolean thrown = false;
        try {
            cmdLine.getOptions().add(obuilder.withShortName("i").create());
        } catch (UnsupportedOperationException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testGetOptionTriggersContainsAndUnmodifiable() {
        Option opt = obuilder.withShortName("j").create();
        cmdLine.addOption(opt);
        Set triggers = cmdLine.getOptionTriggers();
        assertTrue(triggers.contains(opt.getPreferredName()));
        boolean thrown = false;
        try {
            triggers.add("newTrigger");
        } catch (UnsupportedOperationException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    // ---------- addValue / getValues / getUndefaultedValues ----------

    @Test
    public void testAddValueWithArgumentAutoAddsOption() {
        Argument arg = abuilder.withName("val").create();
        assertFalse(cmdLine.hasOption(arg));
        cmdLine.addValue(arg, "hello");
        assertTrue(cmdLine.hasOption(arg));
        List vals = cmdLine.getValues(arg, null);
        assertEquals(1, vals.size());
        assertEquals("hello", vals.get(0));
    }

    @Test
    public void testAddValueMultipleTimes() {
        Argument arg = abuilder.withName("val2").create();
        cmdLine.addValue(arg, "a");
        cmdLine.addValue(arg, "b");
        List vals = cmdLine.getValues(arg, null);
        assertEquals(2, vals.size());
        assertEquals("a", vals.get(0));
        assertEquals("b", vals.get(1));
    }

    @Test
    public void testAddValueNonArgumentOptionDoesNotAutoAdd() {
        Option opt = obuilder.withShortName("k").create();
        cmdLine.addValue(opt, "value");
        assertFalse(cmdLine.hasOption(opt));
        List vals = cmdLine.getUndefaultedValues(opt);
        assertEquals(1, vals.size());
        assertEquals("value", vals.get(0));
    }

    @Test
    public void testAddValueNullValue() {
        Option opt = obuilder.withShortName("l").create();
        cmdLine.addValue(opt, null);
        List vals = cmdLine.getUndefaultedValues(opt);
        assertEquals(1, vals.size());
        assertNull(vals.get(0));
    }

    @Test
    public void testGetValuesNoValuesNoDefaults() {
        Option opt = obuilder.withShortName("m").create();
        List result = cmdLine.getValues(opt, null);
        assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void testGetValuesNoValuesWithParamDefaults() {
        Option opt = obuilder.withShortName("n").create();
        List defaults = Arrays.asList(new String[] {"d1", "d2"});
        List result = cmdLine.getValues(opt, defaults);
        assertEquals(defaults, result);
    }

    @Test
    public void testGetValuesNoValuesWithMapDefaults() {
        Option opt = obuilder.withShortName("o").create();
        List defaults = Arrays.asList(new String[] {"m1"});
        cmdLine.setDefaultValues(opt, defaults);
        List result = cmdLine.getValues(opt, null);
        assertEquals(defaults, result);
        List result2 = cmdLine.getValues(opt, new ArrayList());
        assertEquals(defaults, result2);
    }

    @Test
    public void testGetValuesWithValuesLargerThanDefaults() {
        Option opt = obuilder.withShortName("p").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.addValue(opt, "v2");
        List defaults = Arrays.asList(new String[] {"d1"});
        List result = cmdLine.getValues(opt, defaults);
        assertEquals(2, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("v2", result.get(1));
    }

    @Test
    public void testGetValuesWithValuesSmallerThanDefaultsExtends() {
        Option opt = obuilder.withShortName("q").create();
        cmdLine.addValue(opt, "v1");
        List defaults = Arrays.asList(new String[] {"d1", "d2", "d3"});
        List result = cmdLine.getValues(opt, defaults);
        assertEquals(3, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("d2", result.get(1));
        assertEquals("d3", result.get(2));
    }

    @Test
    public void testGetValuesEqualSizeNoExtend() {
        Option opt = obuilder.withShortName("s").create();
        cmdLine.addValue(opt, "v1");
        List defaults = Arrays.asList(new String[] {"d1"});
        List result = cmdLine.getValues(opt, defaults);
        assertEquals(1, result.size());
        assertEquals("v1", result.get(0));
    }

    @Test
    public void testGetUndefaultedValuesEmpty() {
        Option opt = obuilder.withShortName("t").create();
        assertEquals(Collections.EMPTY_LIST, cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testGetUndefaultedValuesWithData() {
        Option opt = obuilder.withShortName("u").create();
        cmdLine.addValue(opt, "x");
        List result = cmdLine.getUndefaultedValues(opt);
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testSetDefaultValuesRemove() {
        Option opt = obuilder.withShortName("v").create();
        List defaults = Arrays.asList(new String[] {"a"});
        cmdLine.setDefaultValues(opt, defaults);
        assertEquals(defaults, cmdLine.getValues(opt, null));
        cmdLine.setDefaultValues(opt, null);
        assertEquals(Collections.EMPTY_LIST, cmdLine.getValues(opt, null));
    }

    // ---------- addSwitch / getSwitch / setDefaultSwitch ----------

    @Test
    public void testAddSwitchTrue() {
        Option opt = obuilder.withShortName("w").create();
        cmdLine.addSwitch(opt, true);
        assertTrue(cmdLine.hasOption(opt));
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testAddSwitchFalse() {
        Option opt = obuilder.withShortName("x").create();
        cmdLine.addSwitch(opt, false);
        assertEquals(Boolean.FALSE, cmdLine.getSwitch(opt, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchAlreadySetThrows() {
        Option opt = obuilder.withShortName("y").create();
        cmdLine.addSwitch(opt, true);
        cmdLine.addSwitch(opt, false);
    }

    @Test
    public void testGetSwitchAllNull() {
        Option opt = obuilder.withShortName("z").create();
        assertNull(cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitchParamDefaultUsedWhenNoDirect() {
        Option opt = obuilder.withShortName("1").create();
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testGetSwitchMapDefaultUsedWhenNoDirectAndNoParam() {
        Option opt = obuilder.withShortName("2").create();
        cmdLine.setDefaultSwitch(opt, Boolean.FALSE);
        assertEquals(Boolean.FALSE, cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitchDirectOverridesAll() {
        Option opt = obuilder.withShortName("3").create();
        cmdLine.setDefaultSwitch(opt, Boolean.FALSE);
        cmdLine.addSwitch(opt, true);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, Boolean.FALSE));
    }

    @Test
    public void testSetDefaultSwitchRemove() {
        Option opt = obuilder.withShortName("4").create();
        cmdLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));
        cmdLine.setDefaultSwitch(opt, null);
        assertNull(cmdLine.getSwitch(opt, null));
    }

    // ---------- properties ----------

    @Test
    public void testAddPropertyAndGetPropertyWithOption() {
        Option opt = obuilder.withShortName("5").create();
        assertEquals("def", cmdLine.getProperty(opt, "key1", "def"));
        cmdLine.addProperty(opt, "key1", "value1");
        assertEquals("value1", cmdLine.getProperty(opt, "key1", "def"));
        assertEquals("def2", cmdLine.getProperty(opt, "key2", "def2"));
    }

    @Test
    public void testGetPropertiesForOptionEmptyAndPopulated() {
        Option opt = obuilder.withShortName("6").create();
        assertEquals(Collections.EMPTY_SET, cmdLine.getProperties(opt));
        cmdLine.addProperty(opt, "propA", "1");
        cmdLine.addProperty(opt, "propB", "2");
        Set props = cmdLine.getProperties(opt);
        assertEquals(2, props.size());
        assertTrue(props.contains("propA"));
        assertTrue(props.contains("propB"));
    }

    @Test
    public void testGetPropertiesForOptionUnmodifiable() {
        Option opt = obuilder.withShortName("7").create();
        cmdLine.addProperty(opt, "propC", "3");
        Set props = cmdLine.getProperties(opt);
        boolean thrown = false;
        try {
            props.add("newKey");
        } catch (UnsupportedOperationException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testAddPropertyStringAndGetPropertyString() {
        cmdLine.addProperty("sysKey", "sysVal");
        assertEquals("sysVal", cmdLine.getProperty("sysKey"));
    }

    @Test
    public void testGetPropertiesGlobal() {
        cmdLine.addProperty("gk1", "gv1");
        Set props = cmdLine.getProperties();
        assertTrue(props.contains("gk1"));
    }

    // ---------- looksLikeOption ----------

    @Test
    public void testLooksLikeOptionTrue() {
        assertTrue(cmdLine.looksLikeOption("-r"));
    }

    @Test
    public void testLooksLikeOptionFalse() {
        assertFalse(cmdLine.looksLikeOption("plainArgument"));
    }

    @Test
    public void testLooksLikeOptionNoPrefixesWithArgumentRoot() {
        Argument rootArg = abuilder.withName("rootArg").create();
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootArg, new ArrayList());
        assertFalse(cl.looksLikeOption("-x"));
        assertFalse(cl.looksLikeOption("anything"));
    }

    @Test
    public void testLooksLikeOptionMultiplePrefixes() {
        Option opt = obuilder.withShortName("8").withLongName("hotel").create();
        Group grp = gbuilder.withOption(opt).create();
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(grp, new ArrayList());
        assertTrue(cl.looksLikeOption("--hotel"));
        assertTrue(cl.looksLikeOption("-8"));
        assertFalse(cl.looksLikeOption("hotel"));
    }

    // ---------- toString ----------

    @Test
    public void testToStringWithSpaces() {
        List args = Arrays.asList(new String[] {"hello world", "foo"});
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals("\"hello world\" foo", cl.toString());
    }

    @Test
    public void testToStringNoSpaces() {
        List args = Arrays.asList(new String[] {"foo", "bar"});
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals("foo bar", cl.toString());
    }

    @Test
    public void testToStringEmpty() {
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootGroup, new ArrayList());
        assertEquals("", cl.toString());
    }

    @Test
    public void testToStringSingleArg() {
        List args = Arrays.asList(new String[] {"onlyone"});
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals("onlyone", cl.toString());
    }
}