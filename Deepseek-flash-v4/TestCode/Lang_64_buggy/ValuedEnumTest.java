package org.apache.commons.lang.enums;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ValuedEnumTest {

    private static final String TEST_ENUM_NAME = "TestEnum";
    private static final int TEST_ENUM_VALUE = 100;
    private static final String TEST_ENUM2_NAME = "TestEnum2";
    private static final int TEST_ENUM2_VALUE = 200;
    private static final String TEST_ENUM3_NAME = "TestEnum3";
    private static final int TEST_ENUM3_VALUE = 300;

    private static class TestValuedEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        protected TestValuedEnum(String name, int value) {
            super(name, value);
        }
    }

    private static class TestValuedEnumSub extends TestValuedEnum {
        private static final long serialVersionUID = 1L;

        protected TestValuedEnumSub(String name, int value) {
            super(name, value);
        }
    }

    private TestValuedEnum enum1;
    private TestValuedEnum enum2;
    private TestValuedEnum enum3;

    @Before
    public void setUp() {
        enum1 = new TestValuedEnum(TEST_ENUM_NAME, TEST_ENUM_VALUE);
        enum2 = new TestValuedEnum(TEST_ENUM2_NAME, TEST_ENUM2_VALUE);
        enum3 = new TestValuedEnum(TEST_ENUM3_NAME, TEST_ENUM3_VALUE);
        
        try {
            Method method = Enum.class.getDeclaredMethod("addEnum", new Class[]{String.class, Class.class});
            method.setAccessible(true);
            method.invoke(null, TEST_ENUM_NAME, TestValuedEnum.class);
            method.invoke(null, TEST_ENUM2_NAME, TestValuedEnum.class);
            method.invoke(null, TEST_ENUM3_NAME, TestValuedEnum.class);
        } catch (Exception e) {
            // If reflection fails, tests will fail with clearer errors
        }
    }

    @After
    public void tearDown() {
        enum1 = null;
        enum2 = null;
        enum3 = null;
    }

    @Test
    public void testGetValue() {
        assertEquals(TEST_ENUM_VALUE, enum1.getValue());
        assertEquals(TEST_ENUM2_VALUE, enum2.getValue());
        assertEquals(TEST_ENUM3_VALUE, enum3.getValue());
    }

    @Test
    public void testGetEnumByValue() {
        try {
            assertEquals(enum1, ValuedEnum.getEnum(TestValuedEnum.class, TEST_ENUM_VALUE));
            assertEquals(enum2, ValuedEnum.getEnum(TestValuedEnum.class, TEST_ENUM2_VALUE));
            assertEquals(enum3, ValuedEnum.getEnum(TestValuedEnum.class, TEST_ENUM3_VALUE));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetEnumByValueNotFound() {
        assertNull(ValuedEnum.getEnum(TestValuedEnum.class, 999));
    }

    @Test
    public void testGetEnumByValueNullClass() {
        try {
            ValuedEnum.getEnum(null, TEST_ENUM_VALUE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCompareTo() {
        assertEquals(0, enum1.compareTo(new TestValuedEnum(TEST_ENUM_NAME, TEST_ENUM_VALUE)));
        assertTrue(enum1.compareTo(enum2) < 0);
        assertTrue(enum2.compareTo(enum1) > 0);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareToDifferentClass() {
        enum1.compareTo(new TestValuedEnumSub(TEST_ENUM_NAME, TEST_ENUM_VALUE));
    }

    @Test(expected = NullPointerException.class)
    public void testCompareToNull() {
        enum1.compareTo(null);
    }

    @Test
    public void testToString() {
        assertNotNull(enum1.toString());
        assertTrue(enum1.toString().contains(TEST_ENUM_NAME));
        assertTrue(enum1.toString().contains(Integer.toString(TEST_ENUM_VALUE)));
    }

    @Test
    public void testToStringMultipleCalls() {
        String first = enum1.toString();
        String second = enum1.toString();
        assertSame(first, second);
    }
}