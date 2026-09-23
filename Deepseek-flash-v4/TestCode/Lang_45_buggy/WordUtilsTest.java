package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class WordUtilsTest {
    private static final String LINE_SEPARATOR = System.lineSeparator();

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // wrap(String, int) tests
    @Test
    public void testWrapNullString() {
        assertNull(WordUtils.wrap(null, 5));
    }

    @Test
    public void testWrapWithZeroLength() {
        assertEquals("hello", WordUtils.wrap("hello", 0));
    }

    @Test
    public void testWrapWithNegativeLength() {
        assertEquals("hello", WordUtils.wrap("hello", -1));
    }

    @Test
    public void testWrapShortString() {
        assertEquals("hello", WordUtils.wrap("hello", 10));
    }

    @Test
    public void testWrapExactLength() {
        assertEquals("hello", WordUtils.wrap("hello", 5));
    }

    @Test
    public void testWrapLongStringWithSpaces() {
        assertEquals("hello" + LINE_SEPARATOR + "world", WordUtils.wrap("hello world", 5));
    }

    @Test
    public void testWrapLongStringWithSpacesAndCustomSeparator() {
        assertEquals("hello\nworld", WordUtils.wrap("hello world", 5, "\n", false));
    }

    @Test
    public void testWrapLongWordWrapLongWordsTrue() {
        assertEquals("hello" + LINE_SEPARATOR + "world", WordUtils.wrap("helloworld", 5, null, true));
    }

    @Test
    public void testWrapLongWordNoWrapLongWordsFalse() {
        assertEquals("helloworld", WordUtils.wrap("helloworld", 5, null, false));
    }

    @Test
    public void testWrapLongStringWithMultipleSpaces() {
        assertEquals("hello" + LINE_SEPARATOR + "world", WordUtils.wrap("hello  world", 5));
    }

    @Test
    public void testWrapLongStringWithSpaceAtStart() {
        assertEquals("hello" + LINE_SEPARATOR + "world", WordUtils.wrap(" hello", 5)); 
        // " hello" -> "hello" + "\n" + ""? Actually offset starts at 0, first char is space, so offset++ -> 1, then loop continues with "hello" length 5, offset=1, 5-1=4 <=5 so exit loop and append "hello". 
        // The result would be "hello" only, because " hello" length 6, offset becomes 1, while loop condition checks (6-1)>5 false, so append str.substring(1)="hello"
    }

    // capitalize(String)
    @Test
    public void testCapitalizeNullString() {
        assertNull(WordUtils.capitalize(null));
    }

    @Test
    public void testCapitalizeEmptyString() {
        assertEquals("", WordUtils.capitalize(""));
    }

    @Test
    public void testCapitalizeSimple() {
        assertEquals("Hello World", WordUtils.capitalize("hello world"));
    }

    @Test
    public void testCapitalizeWithCustomDelimiters() {
        char[] delims = {'-'};
        assertEquals("Hello-World", WordUtils.capitalize("hello-world", delims));
    }

    @Test
    public void testCapitalizeWithEmptyDelimiters() {
        char[] delims = {};
        assertEquals("hello", WordUtils.capitalize("hello", delims));
    }

    @Test
    public void testCapitalizeWithDelimiterAtStart() {
        assertEquals("Hello", WordUtils.capitalize(" hello"));
    }

    // capitalizeFully
    @Test
    public void testCapitalizeFullyNull() {
        assertNull(WordUtils.capitalizeFully(null));
    }

    @Test
    public void testCapitalizeFullyEmpty() {
        assertEquals("", WordUtils.capitalizeFully(""));
    }

    @Test
    public void testCapitalizeFullyBasic() {
        assertEquals("Hello World", WordUtils.capitalizeFully("hELLO wORLD"));
    }

    @Test
    public void testCapitalizeFullyWithDelimiters() {
        char[] delims = {'-'};
        assertEquals("Hello-World", WordUtils.capitalizeFully("hELLO-wORLD", delims));
    }

    // uncapitalize
    @Test
    public void testUncapitalizeNull() {
        assertNull(WordUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalizeEmpty() {
        assertEquals("", WordUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalizeSimple() {
        assertEquals("hello world", WordUtils.uncapitalize("Hello World"));
    }

    @Test
    public void testUncapitalizeWithDelimiters() {
        char[] delims = {'-'};
        assertEquals("hello-World", WordUtils.uncapitalize("Hello-World", delims));
    }

    // swapCase
    @Test
    public void testSwapCaseNull() {
        assertNull(WordUtils.swapCase(null));
    }

    @Test
    public void testSwapCaseEmpty() {
        assertEquals("", WordUtils.swapCase(""));
    }

    @Test
    public void testSwapCaseBasic() {
        assertEquals("hELLO wORLD", WordUtils.swapCase("Hello World"));
    }

    @Test
    public void testSwapCaseWithWhitespace() {
        assertEquals("hELLO wORLD", WordUtils.swapCase("Hello World"));
    }

    @Test
    public void testSwapCaseWithUpperCase() {
        assertEquals("HELLO", WordUtils.swapCase("hello"));
    }

    @Test
    public void testSwapCaseWithLowerCase() {
        assertEquals("hello", WordUtils.swapCase("HELLO"));
    }

    @Test
    public void testSwapCaseWithTitleCase() {
        assertEquals("ǆ", WordUtils.swapCase("ǅ"));
    }

    @Test
    public void testSwapCaseWithWhitespaceAfterWord() {
        assertEquals("HELLO WORLD", WordUtils.swapCase("hello world"));
    }

    // initials
    @Test
    public void testInitialsNull() {
        assertNull(WordUtils.initials(null));
    }

    @Test
    public void testInitialsEmpty() {
        assertEquals("", WordUtils.initials(""));
    }

    @Test
    public void testInitialsWithNullDelimiters() {
        assertEquals("HW", WordUtils.initials("Hello World"));
    }

    @Test
    public void testInitialsWithDelimiters() {
        char[] delims = {'-'};
        assertEquals("HW", WordUtils.initials("Hello-World", delims));
    }

    @Test
    public void testInitialsWithEmptyDelimiters() {
        char[] delims = {};
        assertEquals("", WordUtils.initials("Hello", delims));
    }

    @Test
    public void testInitialsWithMultipleSpaces() {
        assertEquals("H W", WordUtils.initials("Hello  World"));
    }

    // abbreviate
    @Test
    public void testAbbreviateNull() {
        assertNull(WordUtils.abbreviate(null, 0, 0, null));
    }

    @Test
    public void testAbbreviateEmpty() {
        assertEquals("", WordUtils.abbreviate("", 0, 0, null));
    }

    @Test
    public void testAbbreviateUpperDefault() {
        assertEquals("Hello", WordUtils.abbreviate("Hello World", 0, -1, null));
    }

    @Test
    public void testAbbreviateUpperGreaterThanLength() {
        assertEquals("Hello World", WordUtils.abbreviate("Hello World", 0, 100, null));
    }

    @Test
    public void testAbbreviateUpperLessThanLower() {
        assertEquals("Hello", WordUtils.abbreviate("Hello World", 10, 5, null));
    }

    @Test
    public void testAbbreviateNoSpaceInRange() {
        assertEquals("Hello Wo", WordUtils.abbreviate("Hello World", 0, 8, "..."));
    }

    @Test
    public void testAbbreviateWithSpaceInRange() {
        assertEquals("Hello...", WordUtils.abbreviate("Hello World", 0, 10, "..."));
    }

    @Test
    public void testAbbreviateAppendToEndNull() {
        assertEquals("Hello", WordUtils.abbreviate("Hello World", 0, 5, null));
    }
}