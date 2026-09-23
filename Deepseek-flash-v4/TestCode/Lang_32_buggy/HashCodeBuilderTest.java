package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class HashCodeBuilderTest {

    @Test
    public void testConstructorAndAppendBoolean() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        builder.append(true);
        assertEquals(37*17 + 0, builder.toHashCode());
        builder.append(false);
        assertEquals((37*17 + 0)*37 + 1, builder.toHashCode());
    }

    @Test
    public void testConstructorZeroInitial() {
        try {
            new HashCodeBuilder(0, 37);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("HashCodeBuilder requires a non zero initial value", e.getMessage());
        }
    }

    @Test
    public void testConstructorEvenInitial() {
        try {
            new HashCodeBuilder(16, 37);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("HashCodeBuilder requires an odd initial value", e.getMessage());
        }
    }

    @Test
    public void testConstructorZeroMultiplier() {
        try {
            new HashCodeBuilder(17, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("HashCodeBuilder requires a non zero multiplier", e.getMessage());
        }
    }

    @Test
    public void testConstructorEvenMultiplier() {
        try {
            new HashCodeBuilder(17, 36);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("HashCodeBuilder requires an odd multiplier", e.getMessage());
        }
    }

    @Test
    public void testAppendObjectNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((Object) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayNormal() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {"a", "b"});
        int expected = 17;
        expected = expected * 37 + "a".hashCode();
        expected = expected * 37 + "b".hashCode();
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendShortArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((short[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendShortArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new short[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendCharArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new char[] {'a', 'b'});
        int expected = 17;
        expected = expected * 37 + 'a';
        expected = expected * 37 + 'b';
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendByteArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new byte[] {1, 2});
        int expected = 17;
        expected = expected * 37 + 1;
        expected = expected * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new double[] {1.0, 2.0});
        int expected = 17;
        long l1 = Double.doubleToLongBits(1.0);
        expected = expected * 37 + (int)(l1 ^ (l1 >> 32));
        long l2 = Double.doubleToLongBits(2.0);
        expected = expected * 37 + (int)(l2 ^ (l2 >> 32));
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new float[] {1.5f});
        int expected = 17;
        expected = expected * 37 + Float.floatToIntBits(1.5f);
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new boolean[] {true, false});
        int expected = 17;
        expected = expected * 37 + 0;
        expected = expected * 37 + 1;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendNullArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        int[] nullInt = null;
        builder.append(nullInt);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendLongArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new long[] {1L, 2L});
        int expected = 17;
        expected = expected * 37 + 1;
        expected = expected * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testReflectionHashCodeNullObject() {
        try {
            HashCodeBuilder.reflectionHashCode(17, 37, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The object to build a hash code for must not be null", e.getMessage());
        }
    }

    @Test
    public void testReflectionHashCodeBasic() {
        TestTestClass obj = new TestTestClass(5);
        int hash = HashCodeBuilder.reflectionHashCode(obj);
        assertTrue(hash != 0);
        TestTestClass obj2 = new TestTestClass(6);
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2);
        assertTrue(hash != hash2);
    }

    @Test
    public void testReflectionHashCodeWithExcludeFields() {
        TestTestClass obj = new TestTestClass(5);
        obj.setName("test");
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null, new String[] {"name"});
        TestTestClass obj2 = new TestTestClass(5);
        obj2.setName("different");
        int hash2 = HashCodeBuilder.reflectionHashCode(17, 37, obj2, false, null, new String[] {"name"});
        assertEquals(hash, hash2);
    }

    @Test
    public void testReflectionHashCodeWithTransients() {
        TestTestClass obj = new TestTestClass(5);
        obj.setTransientField(10);
        int hash = HashCodeBuilder.reflectionHashCode(obj);
        TestTestClass obj2 = new TestTestClass(5);
        obj2.setTransientField(20);
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2);
        assertEquals(hash, hash2);
    }

    @Test
    public void testReflectionHashCodeWithRegisteredObject() {
        TestTestClass obj = new TestTestClass(5);
        HashCodeBuilder.register(obj);
        try {
            assertEquals(0, HashCodeBuilder.reflectionHashCode(17, 37, obj));
        } finally {
            HashCodeBuilder.unregister(obj);
        }
    }

    @Test
    public void testReflectionHashCodeWithSuperClass() {
        SubTestClass obj = new SubTestClass(5, 10);
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, SubTestClass.class);
        assertTrue(hash != 0);
    }

    @Test
    public void testAppendSuper() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.appendSuper(10);
        assertEquals(17*37 + 10, builder.toHashCode());
    }

    @Test
    public void testAppendString() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append("hello");
        assertEquals(17*37 + "hello".hashCode(), builder.toHashCode());
    }

    @Test
    public void testAppendChar() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append('a');
        assertEquals(17*37 + 'a', builder.toHashCode());
    }

    @Test
    public void testAppendLong() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(10L);
        assertEquals(17*37 + 10, builder.toHashCode());
    }

    @Test
    public void testAppendShort() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((short) 5);
        assertEquals(17*37 + 5, builder.toHashCode());
    }

    @Test
    public void testAppendByte() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((byte) 3);
        assertEquals(17*37 + 3, builder.toHashCode());
    }

    @Test
    public void testAppendFloat() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(1.5f);
        assertEquals(17*37 + Float.floatToIntBits(1.5f), builder.toHashCode());
    }

    @Test
    public void testAppendDouble() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(1.5);
        assertEquals(17*37 + (int)(Double.doubleToLongBits(1.5) ^ (Double.doubleToLongBits(1.5) >> 32)), builder.toHashCode());
    }

    @Test
    public void testAppendIntArrayWithAll() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new int[] {1, 2, 3});
        assertEquals(17*37+1*37+2)*37+3, builder.toHashCode());
    }

    @Test
    public void testAppendIntArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new int[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendLongArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((long[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendShortArrayNormal() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new short[] {1, 2});
        assertEquals((17*37+1)*37+2, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((double[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new double[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendCharArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((char[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendCharArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new char[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendByteArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((byte[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendByteArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new byte[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((float[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendFloatArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new float[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((boolean[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new boolean[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testHashCodeMethod() {
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        assertEquals(17, builder.hashCode());
    }

    @Test
    public void testGetRegistry() {
        assertNotNull(HashCodeBuilder.getRegistry());
    }

    @Test
    public void testRegisterUnregister() {
        Object obj = new Object();
        HashCodeBuilder.register(obj);
        assertTrue(HashCodeBuilder.isRegistered(obj));
        HashCodeBuilder.unregister(obj);
        assertTrue(!HashCodeBuilder.isRegistered(obj));
    }

    @Test
    public void testReflectionHashCodeWithCollectionExcludes() {
        TestTestClass obj = new TestTestClass(5);
        obj.setName("test");
        java.util.Collection<String> excludes = new java.util.ArrayList<String>();
        excludes.add("name");
        int hash = HashCodeBuilder.reflectionHashCode(obj, excludes);
        TestTestClass obj2 = new TestTestClass(5);
        obj2.setName("different");
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2, excludes);
        assertEquals(hash, hash2);
    }

    @Test
    public void testReflectionHashCodeWithTransientAndExcludes() {
        TestTestClass obj = new TestTestClass(5);
        obj.setTransientField(10);
        obj.setName("test");
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, true, null, new String[] {"name"});
        TestTestClass obj2 = new TestTestClass(5);
        obj2.setTransientField(20);
        obj2.setName("test");
        int hash2 = HashCodeBuilder.reflectionHashCode(17, 37, obj2, true, null, new String[] {"name"});
        assertEquals(hash, hash2);
    }

    @Test
    public void testReflectionHashCodeNoSuperClass() {
        TestTestClass obj = new TestTestClass(5);
        int hash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false);
        assertTrue(hash != 0);
    }

    @Test
    public void testAppendObjectArrayNull() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append((Object[]) null);
        assertEquals(17*37, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayEmpty() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {});
        assertEquals(17, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayNestedArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new int[] {1, 2}, "a"});
        int expected = 17;
        expected = expected * 37 + 1;
        expected = expected * 37 + 2;
        expected = expected * 37 + "a".hashCode();
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayBooleanArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new boolean[] {true, false}});
        int expected = 17;
        expected = expected * 37 + 0;
        expected = expected * 37 + 1;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayShortArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new short[] {5, 6}});
        int expected = 17;
        expected = expected * 37 + 5;
        expected = expected * 37 + 6;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayCharArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new char[] {'a', 'b'}});
        int expected = 17;
        expected = expected * 37 + 'a';
        expected = expected * 37 + 'b';
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayByteArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new byte[] {1, 2}});
        int expected = 17;
        expected = expected * 37 + 1;
        expected = expected * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayDoubleArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new double[] {1.0}});
        long l = Double.doubleToLongBits(1.0);
        int expected = 17*37 + (int)(l ^ (l >> 32));
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayFloatArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new float[] {1.5f}});
        int expected = 17*37 + Float.floatToIntBits(1.5f);
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayLongArray() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {new long[] {1L, 2L}});
        int expected = 17;
        expected = expected * 37 + 1;
        expected = expected * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayNonArrayObject() {
        String str = "hello";
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {str});
        assertEquals(17*37 + str.hashCode(), builder.toHashCode());
    }

    @Test
    public void testAppendLongArrayWithNulls() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Long[] {1L, null, 2L});
        int expected = 17;
        expected = expected * 37 + 1;
        expected = expected * 37;
        expected = expected * 37 + 2;
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendObjectArrayWithNullElement() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Object[] {null, "a"});
        int expected = 17;
        expected = expected * 37;
        expected = expected * 37 + "a".hashCode();
        assertEquals(expected, builder.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayWithNullElement() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(new Boolean[] {null, true});
        int expected = 17;
        expected = expected * 37;
        expected = expected * 37 + 0;
        assertEquals(expected, builder.toHashCode());
    }

    static class TestTestClass {
        private int value;
        private transient int transientField;
        private String name;

        public TestTestClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setTransientField(int val) {
            transientField = val;
        }

        public int getTransientField() {
            return transientField;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestTestClass that = (TestTestClass) o;
            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    static class SubTestClass extends TestTestClass {
        private int subValue;

        public SubTestClass(int value, int subValue) {
            super(value);
            this.subValue = subValue;
        }

        public int getSubValue() {
            return subValue;
        }
    }
}