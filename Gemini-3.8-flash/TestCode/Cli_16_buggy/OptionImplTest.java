package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Assert;
import org.junit.Test;

public class OptionImplTest {

    private static class DummyOption extends OptionImpl {
        private String preferredName;
        private String description;
        private Set prefixes = new HashSet();
        private Set triggers = new HashSet();
        private boolean canProcessArgumentResult = true;
        private String appendUsageText = "dummyUsage";
        private String lastCanProcessArgument;

        public DummyOption(int id, boolean required) {
            super(id, required);
        }

        public void setPreferredName(String preferredName) {
            this.preferredName = preferredName;
        }

        public String getPreferredName() {
            return this.preferredName;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

        public void setPrefixes(Set prefixes) {
            this.prefixes = prefixes;
        }

        public Set getPrefixes() {
            return this.prefixes;
        }

        public void setTriggers(Set triggers) {
            this.triggers = triggers;
        }

        public Set getTriggers() {
            return this.triggers;
        }

        public void setCanProcessArgumentResult(boolean result) {
            this.canProcessArgumentResult = result;
        }

        public String getLastCanProcessArgument() {
            return this.lastCanProcessArgument;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            this.lastCanProcessArgument = argument;
            return this.canProcessArgumentResult;
        }

        public void setAppendUsageText(String appendUsageText) {
            this.appendUsageText = appendUsageText;
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            if (this.appendUsageText != null) {
                buffer.append(this.appendUsageText);
            }
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            // dummy implementation
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
            // dummy implementation
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return Collections.EMPTY_LIST;
        }

        public void invokeCheckPrefixes(Set prefixes) {
            super.checkPrefixes(prefixes);
        }
    }

    @Test
    public void getId_givenVariousIds_shouldReturnCorrectId() {
        // Arrange & Act & Assert
        DummyOption opt1 = new DummyOption(0, false);
        Assert.assertEquals(0, opt1.getId());

        DummyOption opt2 = new DummyOption(100, true);
        Assert.assertEquals(100, opt2.getId());

        DummyOption opt3 = new DummyOption(-5, false);
        Assert.assertEquals(-5, opt3.getId());
    }

    @Test
    public void isRequired_givenRequiredFlags_shouldReturnCorrectFlag() {
        // Arrange & Act & Assert
        DummyOption optRequired = new DummyOption(1, true);
        Assert.assertTrue(optRequired.isRequired());

        DummyOption optOptional = new DummyOption(2, false);
        Assert.assertFalse(optOptional.isRequired());
    }

    @Test
    public void canProcess_givenEmptyArgumentsIterator_shouldReturnFalse() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        List argsList = new ArrayList();
        ListIterator iterator = argsList.listIterator();

        // Act
        boolean result = option.canProcess(null, iterator);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void canProcess_givenArgumentsIterator_shouldPassFirstArgumentAndRestoreIteratorPosition() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setCanProcessArgumentResult(true);

        List argsList = new ArrayList();
        argsList.add("--help");
        argsList.add("extra");
        ListIterator iterator = argsList.listIterator();

        // Act
        boolean result = option.canProcess(null, iterator);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("--help", option.getLastCanProcessArgument());
        Assert.assertEquals(0, iterator.nextIndex());
        Assert.assertEquals("--help", iterator.next());
    }

    @Test
    public void canProcess_givenSubclassReturnsFalse_shouldReturnFalse() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setCanProcessArgumentResult(false);

        List argsList = new ArrayList();
        argsList.add("--unknown");
        ListIterator iterator = argsList.listIterator();

        // Act
        boolean result = option.canProcess(null, iterator);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(0, iterator.nextIndex());
    }

    @Test
    public void toString_givenCustomUsage_shouldReturnAppendedBufferString() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setAppendUsageText("[-f <file>]");

        // Act
        String result = option.toString();

        // Assert
        Assert.assertEquals("[-f <file>]", result);
    }

    @Test
    public void toString_givenEmptyUsage_shouldReturnEmptyString() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setAppendUsageText("");

        // Act
        String result = option.toString();

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void defaults_givenCommandLine_shouldExecuteWithoutException() {
        // Arrange
        DummyOption option = new DummyOption(1, false);

        // Act & Assert
        try {
            option.defaults(null);
        } catch (Exception e) {
            Assert.fail("defaults should not throw exception: " + e.getMessage());
        }
    }

    @Test
    public void findOption_givenMatchingTrigger_shouldReturnThis() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        Set triggers = new HashSet();
        triggers.add("--file");
        triggers.add("-f");
        option.setTriggers(triggers);

        // Act
        Option found = option.findOption("--file");

        // Assert
        Assert.assertSame(option, found);
    }

    @Test
    public void findOption_givenNonMatchingTrigger_shouldReturnNull() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        Set triggers = new HashSet();
        triggers.add("-f");
        option.setTriggers(triggers);

        // Act
        Option found = option.findOption("-v");

        // Assert
        Assert.assertNull(found);
    }

    @Test
    public void findOption_givenEmptyTriggers_shouldReturnNull() {
        // Arrange
        DummyOption option = new DummyOption(1, false);

        // Act
        Option found = option.findOption("-f");

        // Assert
        Assert.assertNull(found);
    }

    @Test
    public void equals_givenNullOrDifferentType_shouldReturnFalse() {
        // Arrange
        DummyOption option = new DummyOption(1, false);

        // Act & Assert
        Assert.assertFalse(option.equals(null));
        Assert.assertFalse(option.equals("someString"));
        Assert.assertFalse(option.equals(new Integer(1)));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        DummyOption option = new DummyOption(1, false);

        // Act & Assert
        Assert.assertTrue(option.equals(option));
    }

    @Test
    public void equals_givenEqualFields_shouldReturnTrue() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        opt1.setPreferredName("--help");
        opt1.setDescription("Displays help info");
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        opt1.setPrefixes(prefixes);
        Set triggers = new HashSet();
        triggers.add("--help");
        triggers.add("-h");
        opt1.setTriggers(triggers);

        DummyOption opt2 = new DummyOption(1, false);
        opt2.setPreferredName("--help");
        opt2.setDescription("Displays help info");
        Set prefixes2 = new HashSet();
        prefixes2.add("-");
        prefixes2.add("--");
        opt2.setPrefixes(prefixes2);
        Set triggers2 = new HashSet();
        triggers2.add("--help");
        triggers2.add("-h");
        opt2.setTriggers(triggers2);

        // Act & Assert
        Assert.assertTrue(opt1.equals(opt2));
        Assert.assertTrue(opt2.equals(opt1));
        Assert.assertEquals(opt1.hashCode(), opt2.hashCode());
    }

    @Test
    public void equals_givenBothNullNamesAndDescriptions_shouldReturnTrue() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        opt1.setPreferredName(null);
        opt1.setDescription(null);

        DummyOption opt2 = new DummyOption(1, false);
        opt2.setPreferredName(null);
        opt2.setDescription(null);

        // Act & Assert
        Assert.assertTrue(opt1.equals(opt2));
        Assert.assertEquals(opt1.hashCode(), opt2.hashCode());
    }

    @Test
    public void equals_givenDifferentId_shouldReturnFalse() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        DummyOption opt2 = new DummyOption(2, false);

        // Act & Assert
        Assert.assertFalse(opt1.equals(opt2));
    }

    @Test
    public void equals_givenDifferentPreferredName_shouldReturnFalse() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        opt1.setPreferredName("--help");

        DummyOption opt2 = new DummyOption(1, false);
        opt2.setPreferredName("--version");

        DummyOption optNull = new DummyOption(1, false);
        optNull.setPreferredName(null);

        // Act & Assert
        Assert.assertFalse(opt1.equals(opt2));
        Assert.assertFalse(opt1.equals(optNull));
        Assert.assertFalse(optNull.equals(opt1));
    }

    @Test
    public void equals_givenDifferentDescription_shouldReturnFalse() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        opt1.setPreferredName("--opt");
        opt1.setDescription("Desc A");

        DummyOption opt2 = new DummyOption(1, false);
        opt2.setPreferredName("--opt");
        opt2.setDescription("Desc B");

        DummyOption optNull = new DummyOption(1, false);
        optNull.setPreferredName("--opt");
        optNull.setDescription(null);

        // Act & Assert
        Assert.assertFalse(opt1.equals(opt2));
        Assert.assertFalse(opt1.equals(optNull));
        Assert.assertFalse(optNull.equals(opt1));
    }

    @Test
    public void equals_givenDifferentPrefixes_shouldReturnFalse() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        Set pref1 = new HashSet();
        pref1.add("-");
        opt1.setPrefixes(pref1);

        DummyOption opt2 = new DummyOption(1, false);
        Set pref2 = new HashSet();
        pref2.add("--");
        opt2.setPrefixes(pref2);

        // Act & Assert
        Assert.assertFalse(opt1.equals(opt2));
    }

    @Test
    public void equals_givenDifferentTriggers_shouldReturnFalse() {
        // Arrange
        DummyOption opt1 = new DummyOption(1, false);
        Set trig1 = new HashSet();
        trig1.add("-a");
        opt1.setTriggers(trig1);

        DummyOption opt2 = new DummyOption(1, false);
        Set trig2 = new HashSet();
        trig2.add("-b");
        opt2.setTriggers(trig2);

        // Act & Assert
        Assert.assertFalse(opt1.equals(opt2));
    }

    @Test
    public void hashCode_givenNullPreferredNameAndDescription_shouldComputeHashCodeWithoutNullPointer() {
        // Arrange
        DummyOption option = new DummyOption(42, true);
        option.setPreferredName(null);
        option.setDescription(null);

        // Act
        int code = option.hashCode();

        // Assert
        int expected = 42;
        expected = (expected * 37) + option.getPrefixes().hashCode();
        expected = (expected * 37) + option.getTriggers().hashCode();
        Assert.assertEquals(expected, code);
    }

    @Test
    public void hashCode_givenNonNullFields_shouldProduceConsistentHash() {
        // Arrange
        DummyOption option = new DummyOption(10, false);
        option.setPreferredName("--test");
        option.setDescription("A test option");
        Set prefixes = new HashSet();
        prefixes.add("--");
        option.setPrefixes(prefixes);
        Set triggers = new HashSet();
        triggers.add("--test");
        option.setTriggers(triggers);

        // Act
        int code1 = option.hashCode();
        int code2 = option.hashCode();

        // Assert
        Assert.assertEquals(code1, code2);
    }

    @Test
    public void checkPrefixes_givenEmptyPrefixes_shouldReturnWithoutValidating() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setPreferredName("invalidWithoutPrefix");
        Set triggers = new HashSet();
        triggers.add("anotherInvalidTrigger");
        option.setTriggers(triggers);

        // Act & Assert
        try {
            option.invokeCheckPrefixes(new HashSet());
        } catch (IllegalArgumentException e) {
            Assert.fail("Empty prefix set should return immediately without checking.");
        }
    }

    @Test
    public void checkPrefixes_givenMatchingPreferredNameAndTriggers_shouldPassSuccessfully() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setPreferredName("--help");
        Set triggers = new HashSet();
        triggers.add("--help");
        triggers.add("-h");
        option.setTriggers(triggers);

        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");

        // Act & Assert
        try {
            option.invokeCheckPrefixes(prefixes);
        } catch (IllegalArgumentException e) {
            Assert.fail("Valid prefixes should not throw exception: " + e.getMessage());
        }
    }

    @Test
    public void checkPrefixes_givenPreferredNameNotStartingWithPrefix_shouldThrowIllegalArgumentException() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setPreferredName("help");
        Set triggers = new HashSet();
        triggers.add("--help");
        option.setTriggers(triggers);

        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");

        // Act & Assert
        try {
            option.invokeCheckPrefixes(prefixes);
            Assert.fail("Expected IllegalArgumentException when preferredName does not start with any prefix");
        } catch (IllegalArgumentException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void checkPrefixes_givenTriggerNotStartingWithPrefix_shouldThrowIllegalArgumentException() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setPreferredName("--help");
        Set triggers = new HashSet();
        triggers.add("--help");
        triggers.add("h");
        option.setTriggers(triggers);

        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");

        // Act & Assert
        try {
            option.invokeCheckPrefixes(prefixes);
            Assert.fail("Expected IllegalArgumentException when a trigger does not start with any prefix");
        } catch (IllegalArgumentException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void checkPrefixes_givenMultiplePrefixes_shouldMatchAnyValidPrefix() {
        // Arrange
        DummyOption option = new DummyOption(1, false);
        option.setPreferredName("/help");
        Set triggers = new HashSet();
        triggers.add("/h");
        triggers.add("-h");
        triggers.add("--help");
        option.setTriggers(triggers);

        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        prefixes.add("/");

        // Act & Assert
        try {
            option.invokeCheckPrefixes(prefixes);
        } catch (IllegalArgumentException e) {
            Assert.fail("All triggers and preferredName start with one of the prefixes: " + e.getMessage());
        }
    }
}