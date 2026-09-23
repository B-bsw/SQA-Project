package org.mockito.internal.matchers;

import org.hamcrest.Description;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.mockito.internal.matchers.Same;

public class SameTest {
    private Same same;
    private Object wanted;
    private Object actual;
    private Description description;

    @Before
    public void setUp() {
        description = new Description() {
            private StringBuilder sb = new StringBuilder();
            public void appendText(String text) { sb.append(text); }
            public void appendValue(Object value) { sb.append(value); }
            public String toString() { return sb.toString(); }
        };
    }

    @After
    public void tearDown() {
        same = null;
        wanted = null;
        actual = null;
        description = null;
    }

    @Test
    public void testMatchesSameIdentity() {
        wanted = new Object();
        same = new Same(wanted);
        actual = wanted;
        assertTrue(same.matches(actual));
    }

    @Test
    public void testMatchesDifferentObject() {
        wanted = new Object();
        same = new Same(wanted);
        actual = new Object();
        assertFalse(same.matches(actual));
    }

    @Test
    public void testMatchesNull() {
        same = new Same(null);
        assertTrue(same.matches(null));
        assertFalse(same.matches(new Object()));
    }

    @Test
    public void testDescribeToString() {
        wanted = new Object();
        same = new Same(wanted);
        same.describeTo(description);
        assertEquals("same(" + wanted.toString() + ")", description.toString());
    }

    @Test
    public void testDescribeToStringWithString() {
        wanted = "hello";
        same = new Same(wanted);
        same.describeTo(description);
        assertEquals("same(\"" + wanted + "\")", description.toString());
    }

    @Test
    public void testDescribeToStringWithCharacter() {
        wanted = 'a';
        same = new Same(wanted);
        same.describeTo(description);
        assertEquals("same('" + wanted + "')", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testDescribeToStringWithNullWanted() {
        same = new Same(null);
        same.describeTo(description);
    }

    @Test
    public void testMatchesNullActual() {
        wanted = new Object();
        same = new Same(wanted);
        assertFalse(same.matches(null));
    }

    @Test
    public void testEqualsAndHashCodeContract() {
        wanted = "test";
        same = new Same(wanted);
        assertTrue(same.equals(wanted));
        assertFalse(same.equals(null));
        assertFalse(same.equals("other"));
    }
}