package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with arg");
        options.addOption("c", "gamma", false, "Gamma option");
    }

    @After
    public void tearDown() {
        parser = null;
        options = null;
    }

    @Test
    public void testFlattenSingleShortOption() {
        String[] args = {"-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlattenShortOptionWithArgument() {
        String[] args = {"-b", "value"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-b", "value"}, result);
    }

    @Test
    public void testFlattenShortOptionWithBurst() {
        String[] args = {"-ac"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-c"}, result);
    }

    @Test
    public void testFlattenLongOption() {
        String[] args = {"--alpha"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--alpha"}, result);
    }

    @Test
    public void testFlattenLongOptionWithEquals() {
        String[] args = {"--beta=value"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--beta", "value"}, result);
    }

    @Test
    public void testFlattenDoubleHyphen() {
        String[] args = {"--", "-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--", "-a"}, result);
    }

    @Test
    public void testFlattenSingleHyphen() {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlattenNonOptionToken() {
        String[] args = {"foo", "-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"foo", "-a"}, result);
    }

    @Test
    public void testFlattenStopAtNonOption() {
        String[] args = {"foo", "-a"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"foo", "--", "-a"}, result);
    }

    @Test
    public void testFlattenStopAtNonOptionWithBurst() {
        String[] args = {"-x", "foo", "-a"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-x", "--", "foo", "-a"}, result);
    }

    @Test
    public void testFlattenEmptyArray() {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void testFlattenNullArguments() {
        String[] result = parser.flatten(options, null, false);
        Assert.assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void testFlattenNullOptions() {
        String[] args = {"-a"};
        try {
            parser.flatten(null, args, false);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFlattenUnknownOptionFallsThrough() {
        String[] args = {"-z"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-z"}, result);
    }

    @Test
    public void testFlattenValidOptionWithArgInBurst() {
        String[] args = {"-bvalue"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-b", "value"}, result);
    }

    @Test
    public void testBurstTokenWithStopAtNonOption() {
        String[] args = {"-ab"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    private static class Options {
        private final List<Option> optionList = new ArrayList<Option>();

        public void addOption(String opt, String longOpt, boolean hasArg, String description) {
            optionList.add(new Option(opt, longOpt, hasArg, description));
        }

        public boolean hasOption(String opt) {
            for (Option o : optionList) {
                if (o.getOpt().equals(opt)) {
                    return true;
                }
            }
            return false;
        }

        public Option getOption(String opt) {
            for (Option o : optionList) {
                if (o.getOpt().equals(opt)) {
                    return o;
                }
            }
            return null;
        }
    }

    private static class Option {
        private final String opt;
        private final String longOpt;
        private final boolean hasArg;
        private final String description;

        public Option(String opt, String longOpt, boolean hasArg, String description) {
            this.opt = opt;
            this.longOpt = longOpt;
            this.hasArg = hasArg;
            this.description = description;
        }

        public String getOpt() {
            return opt;
        }

        public boolean hasArg() {
            return hasArg;
        }

        public boolean hasArgs() {
            return false; // Not used in this test context
        }
    }
}