package org.apache.commons.lang3.builder;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.*;

public class ToStringStyleTest {
    
    private ToStringStyle style;
    private StringBuffer buffer;
    private static final ToStringStyle DEFAULT = ToStringStyle.DEFAULT_STYLE;
    private static final ToStringStyle MULTI_LINE = ToStringStyle.MULTI_LINE_STYLE;
    private static final ToStringStyle NO_FIELD_NAMES = ToStringStyle.NO_FIELD_NAMES_STYLE;
    private static final ToStringStyle SHORT_PREFIX = ToStringStyle.SHORT_PREFIX_STYLE;
    private static final ToStringStyle SIMPLE = ToStringStyle.SIMPLE_STYLE;
    
    @Before
    public void setUp() {
        style = DEFAULT;
        buffer = new StringBuffer();
    }
    
    @Test
    public void testRegistryOperations() throws Exception {
        assertNotNull(ToStringStyle.getRegistry());
        assertTrue(ToStringStyle.getRegistry().isEmpty());
        Object obj = new Object();
        ToStringStyle.register(obj);
        assertTrue(ToStringStyle.isRegistered(obj));
        assertNotNull(ToStringStyle.getRegistry());
        ToStringStyle.unregister(obj);
        assertFalse(ToStringStyle.isRegistered(obj));
    }
    
    @Test
    public void testRegisterNullValue() {
        ToStringStyle.register(null);
        assertTrue(ToStringStyle.getRegistry().isEmpty());
    }
    
    @Test
    public void testAppendStartNullObject() {
        style.appendStart(buffer, null);
        assertEquals("", buffer.toString());
    }
    
    @Test
    public void testAppendStartNonNullObject() throws Exception {
        StringBuffer result = new StringBuffer();
        style.appendStart(result, new TestObject());
        assertTrue(result.length() > 0);
    }
    
    @Test
    public void testAppendEnd() {
        StringBuffer result = new StringBuffer("test");
        style.appendEnd(result, new TestObject());
        assertTrue(result.length() > 0);
    }
    
    @Test
    public void testAppendSuperWithNull() {
        style.appendSuper(buffer, null);
        assertEquals("", buffer.toString());
    }
    
    @Test
    public void testAppendSuperWithString() {
        buffer.append("prefix");
        style.appendSuper(buffer, "key[value]");
        assertEquals("prefixvalue", buffer.toString());
    }
    
    @Test
    public void testAppendToStringWithInvalidContent() {
        style.appendToString(buffer, "invalid");
        assertEquals("", buffer.toString());
    }
    
    @Test
    public void testRemoveLastFieldSeparator() throws Exception {
        StringBuffer sb = new StringBuffer();
        sb.append("abc,");
        invokeRemoveLastFieldSeparator(sb, ",");
        assertEquals("abc", sb.toString());
    }
    
    @Test
    public void testRemoveLastFieldSeparatorNoMatch() throws Exception {
        StringBuffer sb = new StringBuffer("abc");
        invokeRemoveLastFieldSeparator(sb, ",");
        assertEquals("abc", sb.toString());
    }
    
    @Test
    public void testRemoveLastFieldSeparatorEmpty() throws Exception {
        StringBuffer sb = new StringBuffer();
        invokeRemoveLastFieldSeparator(sb, ",");
        assertEquals("", sb.toString());
    }
    
    @Test
    public void testAppendObjectNullValue() {
        style.append(buffer, "field", (Object) null, Boolean.TRUE);
        assertTrue(buffer.toString().contains("field"));
    }
    
    @Test
    public void testAppendObjectNullValueWithFullDetailNull() {
        style.append(buffer, "field", (Object) null, null);
        assertTrue(buffer.toString().contains("field"));
    }
    
    @Test
    public void testAppendObjectWithValue() {
        style.append(buffer, "field", "value", Boolean.TRUE);
        assertTrue(buffer.toString().contains("value"));
    }
    
    @Test
    public void testAppendLong() {
        style.append(buffer, "field", 100L, Boolean.TRUE);
        assertTrue(buffer.toString().contains("100"));
    }
    
    @Test
    public void testAppendInt() {
        style.append(buffer, "field", 100, Boolean.TRUE);
        assertTrue(buffer.toString().contains("100"));
    }
    
    @Test
    public void testAppendShort() {
        style.append(buffer, "field", (short) 10, Boolean.TRUE);
        assertTrue(buffer.toString().contains("10"));
    }
    
    @Test
    public void testAppendByte() {
        style.append(buffer, "field", (byte) 5, Boolean.TRUE);
        assertTrue(buffer.toString().contains("5"));
    }
    
    @Test
    public void testAppendChar() {
        style.append(buffer, "field", 'a', Boolean.TRUE);
        assertTrue(buffer.toString().contains("a"));
    }
    
    @Test
    public void testAppendDouble() {
        style.append(buffer, "field", 1.5, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1.5"));
    }
    
    @Test
    public void testAppendFloat() {
        style.append(buffer, "field", 2.5f, Boolean.TRUE);
        assertTrue(buffer.toString().contains("2.5"));
    }
    
    @Test
    public void testAppendBoolean() {
        style.append(buffer, "field", true, Boolean.TRUE);
        assertTrue(buffer.toString().contains("true"));
    }
    
    @Test
    public void testAppendObjectArrayNull() {
        style.append(buffer, "field", (Object[]) null, Boolean.TRUE);
        assertTrue(buffer.length() == 0);
    }
    
    @Test
    public void testAppendObjectArrayDetail() {
        String[] arr = {"a", "b"};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("field"));
    }
    
    @Test
    public void testAppendObjectArraySummary() {
        String[] arr = {"a", "b"};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().length() > 0);
    }
    
    @Test
    public void testAppendObjectArrayDetailNullBoolean() {
        String[] arr = {"a"};
        style.append(buffer, "field", arr, null);
        assertTrue(buffer.toString().contains("a"));
    }
    
    @Test
    public void testAppendLongArrayNull() {
        style.append(buffer, "field", (long[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendLongArrayDetail() {
        long[] arr = {1L, 2L};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1"));
    }
    
    @Test
    public void testAppendLongArraySummary() {
        long[] arr = {1L, 2L};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendIntArrayNull() {
        style.append(buffer, "field", (int[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendIntArrayDetail() {
        int[] arr = {1, 2};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1"));
    }
    
    @Test
    public void testAppendIntArraySummary() {
        int[] arr = {1, 2};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendShortArrayNull() {
        style.append(buffer, "field", (short[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendShortArrayDetail() {
        short[] arr = {1, 2};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1"));
    }
    
    @Test
    public void testAppendShortArraySummary() {
        short[] arr = {1, 2};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendByteArrayNull() {
        style.append(buffer, "field", (byte[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendByteArrayDetail() {
        byte[] arr = {1, 2};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1"));
    }
    
    @Test
    public void testAppendByteArraySummary() {
        byte[] arr = {1, 2};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendCharArrayNull() {
        style.append(buffer, "field", (char[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendCharArrayDetail() {
        char[] arr = {'a', 'b'};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("a"));
    }
    
    @Test
    public void testAppendCharArraySummary() {
        char[] arr = {'a', 'b'};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendDoubleArrayNull() {
        style.append(buffer, "field", (double[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendDoubleArrayDetail() {
        double[] arr = {1.1, 2.2};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1.1"));
    }
    
    @Test
    public void testAppendDoubleArraySummary() {
        double[] arr = {1.1, 2.2};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendFloatArrayNull() {
        style.append(buffer, "field", (float[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendFloatArrayDetail() {
        float[] arr = {1.1f, 2.2f};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("1.1"));
    }
    
    @Test
    public void testAppendFloatArraySummary() {
        float[] arr = {1.1f, 2.2f};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendBooleanArrayNull() {
        style.append(buffer, "field", (boolean[]) null, Boolean.TRUE);
        assertEquals(0, buffer.length());
    }
    
    @Test
    public void testAppendBooleanArrayDetail() {
        boolean[] arr = {true, false};
        style.append(buffer, "field", arr, Boolean.TRUE);
        assertTrue(buffer.toString().contains("true"));
    }
    
    @Test
    public void testAppendBooleanArraySummary() {
        boolean[] arr = {true, false};
        style.append(buffer, "field", arr, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendCollectionDetail() {
        Collection<String> coll = Arrays.asList("a", "b");
        style.append(buffer, "field", coll, Boolean.TRUE);
        assertTrue(buffer.toString().contains("a"));
    }
    
    @Test
    public void testAppendCollectionSummary() {
        Collection<String> coll = Arrays.asList("a", "b");
        style.append(buffer, "field", coll, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendMapDetail() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        style.append(buffer, "field", map, Boolean.TRUE);
        assertTrue(buffer.toString().contains("value"));
    }
    
    @Test
    public void testAppendMapSummary() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        style.append(buffer, "field", map, Boolean.FALSE);
        assertTrue(buffer.toString().contains("size=1"));
    }
    
    @Test
    public void testAppendStringArraySummary() {
        String[] arr = {"a", "b", "c"};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=3"));
    }
    
    @Test
    public void testAppendLongArraySummaryMethod() {
        long[] arr = {1L, 2L};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendIntArraySummaryMethod() {
        int[] arr = {1, 2, 3};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=3"));
    }
    
    @Test
    public void testAppendShortArraySummaryMethod() {
        short[] arr = {1, 2};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendByteArraySummaryMethod() {
        byte[] arr = {1, 2, 3, 4};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=4"));
    }
    
    @Test
    public void testAppendCharArraySummaryMethod() {
        char[] arr = {'a', 'b'};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendDoubleArraySummaryMethod() {
        double[] arr = {1.1, 2.2, 3.3};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=3"));
    }
    
    @Test
    public void testAppendFloatArraySummaryMethod() {
        float[] arr = {1.1f, 2.2f};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=2"));
    }
    
    @Test
    public void testAppendBooleanArraySummaryMethod() {
        boolean[] arr = {true, false, true};
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", arr);
        assertTrue(sb.toString().contains("size=3"));
    }
    
    @Test
    public void testAppendDetailObject() {
        StringBuffer sb = new StringBuffer();
        style.appendDetail(sb, "field", new TestObject());
        assertTrue(sb.length() > 0);
    }
    
    @Test
    public void testAppendSummaryObject() {
        StringBuffer sb = new StringBuffer();
        style.appendSummary(sb, "field", new TestObject());
        assertTrue(sb.toString().contains("<"));
    }
    
    @Test
    public void testCyclicObjectReference() {
        TestObject obj = new TestObject();
        StringBuffer sb = new StringBuffer();
        style.appendInternal(sb, "field", obj, true);
        style.appendInternal(sb, "field", obj, true);
        assertTrue(sb.length() > 0);
    }
    
    @Test
    public void testAppendCyclicObjectMethod() {
        StringBuffer sb = new StringBuffer();
        style.appendCyclicObject(sb, "field", new TestObject());
        assertTrue(sb.length() > 0);
    }
    
    @Test
    public void testGettersAndSetters() throws Exception {
        assertNotNull(style.getArrayStart());
        assertNotNull(style.getArrayEnd());
        assertNotNull(style.getArraySeparator());
        assertNotNull(style.getContentStart());
        assertNotNull(style.getContentEnd());
        assertNotNull(style.getFieldNameValueSeparator());
        assertNotNull(style.getFieldSeparator());
        assertNotNull(style.getNullText());
        assertNotNull(style.getSizeStartText());
        assertNotNull(style.getSizeEndText());
        assertNotNull(style.getSummaryObjectStartText());
        assertNotNull(style.getSummaryObjectEndText());
        assertFalse(style.isArrayContentDetail());
        assertFalse(style.isFieldSeparatorAtEnd());
        assertFalse(style.isFieldSeparatorAtStart());
        assertTrue(style.isUseClassName());
        assertTrue(style.isUseFieldNames());
        assertTrue(style.isUseIdentityHashCode());
        assertFalse(style.isUseShortClassName());
    }
    
    @Test
    public void testGettersNullValues() throws Exception {
        ToStringStyle s = new DefaultToStringStyle() {
            @Override
            public String getArrayStart() {
                try {
                    Field f = ToStringStyle.class.getDeclaredField("arrayStart");
                    f.setAccessible(true);
                    f.set(this, null);
                } catch (Exception e) {
                    fail("Should not throw exception");
                }
                return super.getArrayStart();
            }
        };
        assertNotNull(s.getArrayStart());
    }
    
    @Test(expected = AssertionError.class)
    public void testAppendObjectArrayWithNullAndDetailTrue() {
        style.append(buffer, "field", (Object[]) null, Boolean.TRUE);
        fail("Should not reach here");
    }
    
    private void invokeRemoveLastFieldSeparator(StringBuffer sb, String sep) throws Exception {
        java.lang.reflect.Method method = ToStringStyle.class.getDeclaredMethod("removeLastFieldSeparator", StringBuffer.class);
        method.setAccessible(true);
        method.invoke(style, sb);
    }
    
    // Test subclass to expose protected methods
    private static class TestToStringStyle extends ToStringStyle {
        // Expose protected methods for testing
    }
    
    private static class TestObject {
        private String name = "test";
        
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }
}