package org.mockito.internal.matchers;

import org.hamcrest.StringDescription;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTest {

    @Test
    public void shouldMatchWhenSameReferenceString() {
        String wanted = "hello";
        Same same = new Same(wanted);
        assertTrue(same.matches(wanted));
    }

    @Test
    public void shouldNotMatchWhenDifferentReferenceEqualValue() {
        String wanted = new String("hello");
        String actual = new String("hello");
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    @Test
    public void shouldNotMatchWhenActualIsNullAndWantedIsNotNull() {
        Same same = new Same("hello");
        assertFalse(same.matches(null));
    }

    @Test
    public void shouldMatchWhenBothAreNull() {
        Same same = new Same(null);
        assertTrue(same.matches(null));
    }

    @Test
    public void shouldNotMatchWhenWantedIsNullButActualIsNot() {
        Same same = new Same(null);
        assertFalse(same.matches("something"));
    }

    @Test
    public void shouldMatchSameObjectInstance() {
        Object wanted = new Object();
        Same same = new Same(wanted);
        assertTrue(same.matches(wanted));
    }

    @Test
    public void shouldNotMatchDifferentObjectInstances() {
        Object wanted = new Object();
        Object actual = new Object();
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    @Test
    public void shouldDescribeToWithStringQuoting() {
        Same same = new Same("hello");
        StringDescription description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(\"hello\")", description.toString());
    }

    @Test
    public void shouldDescribeToWithCharacterQuoting() {
        Same same = new Same('c');
        StringDescription description = new StringDescription();
        same.describeTo(description);
        assertEquals("same('c')", description.toString());
    }

    @Test
    public void shouldDescribeToWithoutQuotingForOtherTypes() {
        Same same = new Same(Integer.valueOf(42));
        StringDescription description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(42)", description.toString());
    }

    @Test
    public void shouldDescribeToWithoutQuotingForObject() {
        Object wanted = new Object();
        Same same = new Same(wanted);
        StringDescription description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(" + wanted.toString() + ")", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenWantedIsNullOnDescribeTo() {
        Same same = new Same(null);
        StringDescription description = new StringDescription();
        same.describeTo(description);
    }

    @Test
    public void shouldMatchSameInstanceOfCustomObject() {
        class Custom {}
        Custom wanted = new Custom();
        Same same = new Same(wanted);
        assertTrue(same.matches(wanted));
        assertFalse(same.matches(new Custom()));
    }
}