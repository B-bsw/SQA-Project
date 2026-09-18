package org.apache.commons.cli2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriteableCommandLineTest {

    private Map<Object, List<Object>> valuesMap;
    private Map<Object, Boolean> switchesMap;
    private Map<Object, Boolean> defaultSwitchesMap;
    private List<Object> optionsList;
    private Map<String, String> propertiesMap;
    private Map<Object, List> defaultValuesMap;

    private WriteableCommandLine commandLine;

    private static Option newOptionMock() {
        return (Option) Proxy.newProxyInstance(
                WriteableCommandLineTest.class.getClassLoader(),
                new Class[] { Option.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        String name = method.getName();
                        if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        }
                        if ("toString".equals(name)) {
                            return "OptionMock@" + System.identityHashCode(proxy);
                        }
                        Class<?> rt = method.getReturnType();
                        if (rt == boolean.class) {
                            return Boolean.FALSE;
                        }
                        if (rt == int.class) {
                            return Integer.valueOf(0);
                        }
                        if (rt == String.class) {
                            return "";
                        }
                        return null;
                    }
                });
    }

    @Before
    public void setUp() {
        valuesMap = new HashMap<Object, List<Object>>();
        switchesMap = new HashMap<Object, Boolean>();
        defaultSwitchesMap = new HashMap<Object, Boolean>();
        optionsList = new ArrayList<Object>();
        propertiesMap = new HashMap<String, String>();
        defaultValuesMap = new HashMap<Object, List>();

        commandLine = (WriteableCommandLine) Proxy.newProxyInstance(
                WriteableCommandLineTest.class.getClassLoader(),
                new Class[] { WriteableCommandLine.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();

                        if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        }
                        if ("toString".equals(name)) {
                            return "WriteableCommandLineMock@" + System.identityHashCode(proxy);
                        }

                        if ("addOption".equals(name)) {
                            optionsList.add(args[0]);
                            return null;
                        }

                        if ("addValue".equals(name)) {
                            Object opt = args[0];
                            List<Object> list = valuesMap.get(opt);
                            if (list == null) {
                                list = new ArrayList<Object>();
                                valuesMap.put(opt, list);
                            }
                            list.add(args[1]);
                            return null;
                        }

                        if ("setDefaultValues".equals(name)) {
                            defaultValuesMap.put(args[0], (List) args[1]);
                            return null;
                        }

                        if ("addSwitch".equals(name)) {
                            Object opt = args[0];
                            if (switchesMap.containsKey(opt)) {
                                throw new IllegalStateException("Switch already added");
                            }
                            switchesMap.put(opt, (Boolean) args[1]);
                            return null;
                        }

                        if ("setDefaultSwitch".equals(name)) {
                            defaultSwitchesMap.put(args[0], (Boolean) args[1]);
                            return null;
                        }

                        if ("addProperty".equals(name)) {
                            propertiesMap.put((String) args[0], (String) args[1]);
                            return null;
                        }

                        if ("looksLikeOption".equals(name)) {
                            String arg = (String) args[0];
                            return Boolean.valueOf(arg != null && arg.length() > 0 && arg.startsWith("-"));
                        }

                        // default behaviour for inherited CommandLine methods
                        Class<?> rt = method.getReturnType();
                        if (rt == boolean.class) {
                            return Boolean.FALSE;
                        }
                        if (rt == int.class) {
                            return Integer.valueOf(0);
                        }
                        if (rt == List.class) {
                            return new ArrayList<Object>();
                        }
                        return null;
                    }
                });
    }

    @Test
    public void testAddOption_normal() {
        Option opt = newOptionMock();
        commandLine.addOption(opt);
        assertEquals(1, optionsList.size());
        assertSame(opt, optionsList.get(0));
    }

    @Test
    public void testAddOption_multipleOptions() {
        Option opt1 = newOptionMock();
        Option opt2 = newOptionMock();
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);
        assertEquals(2, optionsList.size());
        assertSame(opt1, optionsList.get(0));
        assertSame(opt2, optionsList.get(1));
    }

    @Test
    public void testAddOption_nullOption() {
        commandLine.addOption(null);
        assertEquals(1, optionsList.size());
        assertNull(optionsList.get(0));
    }

    @Test
    public void testAddValue_normal() {
        Option opt = newOptionMock();
        commandLine.addValue(opt, "value1");
        List<Object> vals = valuesMap.get(opt);
        assertNotNull(vals);
        assertEquals(1, vals.size());
        assertEquals("value1", vals.get(0));
    }

    @Test
    public void testAddValue_multipleValues_manyIterations() {
        Option opt = newOptionMock();
        commandLine.addValue(opt, "v1");
        commandLine.addValue(opt, "v2");
        commandLine.addValue(opt, "v3");
        List<Object> vals = valuesMap.get(opt);
        assertEquals(3, vals.size());
        assertEquals("v1", vals.get(0));
        assertEquals("v2", vals.get(1));
        assertEquals("v3", vals.get(2));
    }

    @Test
    public void testAddValue_nullValue() {
        Option opt = newOptionMock();
        commandLine.addValue(opt, null);
        List<Object> vals = valuesMap.get(opt);
        assertEquals(1, vals.size());
        assertNull(vals.get(0));
    }

    @Test
    public void testAddValue_isolationBetweenOptions() {
        Option opt1 = newOptionMock();
        Option opt2 = newOptionMock();
        commandLine.addValue(opt1, "a");
        commandLine.addValue(opt2, "b");
        assertEquals(1, valuesMap.get(opt1).size());
        assertEquals("a", valuesMap.get(opt1).get(0));
        assertEquals(1, valuesMap.get(opt2).size());
        assertEquals("b", valuesMap.get(opt2).get(0));
    }

    @Test
    public void testSetDefaultValues_normal() {
        Option opt = newOptionMock();
        List<String> defaults = new ArrayList<String>();
        defaults.add("d1");
        defaults.add("d2");
        commandLine.setDefaultValues(opt, defaults);
        assertEquals(defaults, defaultValuesMap.get(opt));
    }

    @Test
    public void testSetDefaultValues_emptyList_zeroIterations() {
        Option opt = newOptionMock();
        List<String> defaults = new ArrayList<String>();
        commandLine.setDefaultValues(opt, defaults);
        List stored = defaultValuesMap.get(opt);
        assertNotNull(stored);
        assertTrue(stored.isEmpty());
    }

    @Test
    public void testSetDefaultValues_nullDefaults() {
        Option opt = newOptionMock();
        commandLine.setDefaultValues(opt, null);
        assertNull(defaultValuesMap.get(opt));
    }

    @Test
    public void testAddSwitch_trueValue() {
        Option opt = newOptionMock();
        commandLine.addSwitch(opt, true);
        assertEquals(Boolean.TRUE, switchesMap.get(opt));
    }

    @Test
    public void testAddSwitch_falseValue() {
        Option opt = newOptionMock();
        commandLine.addSwitch(opt, false);
        assertEquals(Boolean.FALSE, switchesMap.get(opt));
    }

    @Test
    public void testAddSwitch_differentOptions_noConflict() {
        Option opt1 = newOptionMock();
        Option opt2 = newOptionMock();
        commandLine.addSwitch(opt1, true);
        commandLine.addSwitch(opt2, false);
        assertEquals(Boolean.TRUE, switchesMap.get(opt1));
        assertEquals(Boolean.FALSE, switchesMap.get(opt2));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_alreadyAdded_throwsException() {
        Option opt = newOptionMock();
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testSetDefaultSwitch_trueValue() {
        Option opt = newOptionMock();
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, defaultSwitchesMap.get(opt));
    }

    @Test
    public void testSetDefaultSwitch_falseValue() {
        Option opt = newOptionMock();
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);
        assertEquals(Boolean.FALSE, defaultSwitchesMap.get(opt));
    }

    @Test
    public void testSetDefaultSwitch_nullValue() {
        Option opt = newOptionMock();
        commandLine.setDefaultSwitch(opt, null);
        assertNull(defaultSwitchesMap.get(opt));
    }

    @Test
    public void testAddProperty_normal() {
        commandLine.addProperty("key1", "value1");
        assertEquals("value1", propertiesMap.get("key1"));
    }

    @Test
    public void testAddProperty_overwriteExisting() {
        commandLine.addProperty("key1", "value1");
        commandLine.addProperty("key1", "value2");
        assertEquals("value2", propertiesMap.get("key1"));
        assertEquals(1, propertiesMap.size());
    }

    @Test
    public void testAddProperty_emptyValue() {
        commandLine.addProperty("key1", "");
        assertEquals("", propertiesMap.get("key1"));
    }

    @Test
    public void testAddProperty_nullValue() {
        commandLine.addProperty("key1", null);
        assertNull(propertiesMap.get("key1"));
        assertTrue(propertiesMap.containsKey("key1"));
    }

    @Test
    public void testAddProperty_multipleProperties_manyIterations() {
        commandLine.addProperty("k1", "v1");
        commandLine.addProperty("k2", "v2");
        commandLine.addProperty("k3", "v3");
        assertEquals(3, propertiesMap.size());
        assertEquals("v1", propertiesMap.get("k1"));
        assertEquals("v2", propertiesMap.get("k2"));
        assertEquals("v3", propertiesMap.get("k3"));
    }

    @Test
    public void testLooksLikeOption_trueForDash() {
        assertTrue(commandLine.looksLikeOption("-x"));
    }

    @Test
    public void testLooksLikeOption_falseForPlainValue() {
        assertFalse(commandLine.looksLikeOption("value"));
    }

    @Test
    public void testLooksLikeOption_emptyString() {
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOption_nullArgument() {
        assertFalse(commandLine.looksLikeOption(null));
    }

    @Test
    public void testLooksLikeOption_longOptionStyle() {
        assertTrue(commandLine.looksLikeOption("--long-option"));
    }
}