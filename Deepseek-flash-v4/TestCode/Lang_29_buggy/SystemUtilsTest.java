package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class SystemUtilsTest {
    @Before
    public void setUp() { }

    @After
    public void tearDown() { }

    @Test
    public void testGetJavaHome() {
        File result = SystemUtils.getJavaHome();
        assertNotNull(result);
        assertEquals(System.getProperty("java.home"), result.getPath());
    }

    @Test
    public void testGetJavaIoTmpDir() {
        File result = SystemUtils.getJavaIoTmpDir();
        assertNotNull(result);
        assertEquals(System.getProperty("java.io.tmpdir"), result.getPath());
    }

    @Test
    public void testIsJavaAwtHeadless() {
        boolean result = SystemUtils.isJavaAwtHeadless();
        if (SystemUtils.JAVA_AWT_HEADLESS != null) {
            assertEquals(SystemUtils.JAVA_AWT_HEADLESS.equals(Boolean.TRUE.toString()), result);
        } else {
            assertFalse(result);
        }
    }

    @Test
    public void testIsJavaVersionAtLeastFloat() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0F));
        assertTrue(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_FLOAT));
        assertFalse(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_FLOAT + 1F));
    }

    @Test
    public void testIsJavaVersionAtLeastInt() {
        assertTrue(SystemUtils.isJavaVersionAtLeast(0));
        assertTrue(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_INT));
        assertFalse(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_INT + 1));
    }

    @Test
    public void testIsJavaVersionMatch() {
        assertTrue(SystemUtils.isJavaVersionMatch("1.5.0", "1.5"));
        assertFalse(SystemUtils.isJavaVersionMatch("1.5.0", "1.6"));
        assertFalse(SystemUtils.isJavaVersionMatch(null, "1.5"));
        assertFalse(SystemUtils.isJavaVersionMatch("1.5", null));
    }

    @Test
    public void testIsOSMatch() {
        assertTrue(SystemUtils.isOSMatch("Windows", "5.1", "Windows", "5.1"));
        assertFalse(SystemUtils.isOSMatch("Windows", "5.1", "Windows", "6.0"));
        assertFalse(SystemUtils.isOSMatch(null, "5.1", "Windows", "5.1"));
        assertFalse(SystemUtils.isOSMatch("Windows", null, "Windows", "5.1"));
    }

    @Test
    public void testIsOSNameMatch() {
        assertTrue(SystemUtils.isOSNameMatch("Windows XP", "Windows"));
        assertFalse(SystemUtils.isOSNameMatch("Windows XP", "Linux"));
        assertFalse(SystemUtils.isOSNameMatch(null, "Windows"));
    }

    @Test
    public void testToJavaVersionFloat() {
        assertEquals(1.5F, SystemUtils.toJavaVersionFloat("1.5.0"), 0.001F);
        assertEquals(0F, SystemUtils.toJavaVersionFloat(null), 0.001F);
        assertEquals(1F, SystemUtils.toJavaVersionFloat("1"), 0.001F);
    }

    @Test
    public void testToJavaVersionInt() {
        assertEquals(150, SystemUtils.toJavaVersionInt("1.5.0"), 0.001F);
        assertEquals(0, SystemUtils.toJavaVersionInt(null), 0.001F);
        assertEquals(100, SystemUtils.toJavaVersionInt("1"), 0.001F);
    }

    @Test
    public void testToJavaVersionIntArray() {
        int[] result = SystemUtils.toJavaVersionIntArray("1.2.3");
        assertArrayEquals(new int[]{1, 2, 3}, result);
        
        result = SystemUtils.toJavaVersionIntArray(null);
        assertArrayEquals(new int[]{}, result);
        
        result = SystemUtils.toJavaVersionIntArray("");
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testToJavaVersionIntArrayWithLimit() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("toJavaVersionIntArray", String.class, int.class);
        method.setAccessible(true);
        int[] result = (int[]) method.invoke(null, "1.2.3.4", 3);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testToJavaVersionFloatWithArray() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("toJavaVersionFloat", int[].class);
        method.setAccessible(true);
        float result = (Float) method.invoke(null, new int[]{1, 2, 3});
        assertEquals(1.23F, result, 0.001F);
        
        result = (Float) method.invoke(null, null);
        assertEquals(0F, result, 0.001F);
        
        result = (Float) method.invoke(null, new int[]{1});
        assertEquals(1F, result, 0.001F);
    }

    @Test
    public void testToVersionInt() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("toVersionInt", int[].class);
        method.setAccessible(true);
        int result = (Integer) method.invoke(null, new int[]{1, 2, 3});
        assertEquals(123, result);
        
        result = (Integer) method.invoke(null, null);
        assertEquals(0, result);
        
        result = (Integer) method.invoke(null, new int[]{1});
        assertEquals(100, result);
        
        result = (Integer) method.invoke(null, new int[]{1, 2});
        assertEquals(120, result);
    }

    @Test
    public void testGetJavaVersionTrimmed() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getJavaVersionTrimmed");
        method.setAccessible(true);
        String version = SystemUtils.JAVA_VERSION;
        String result = (String) method.invoke(null);
        if (version != null) {
            assertNotNull(result);
            assertFalse(result.isEmpty());
        } else {
            assertNull(result);
        }
    }

    @Test
    public void testGetJavaVersionAsFloat() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getJavaVersionAsFloat");
        method.setAccessible(true);
        float result = (Float) method.invoke(null);
        assertEquals(SystemUtils.JAVA_VERSION_FLOAT, result, 0.001F);
    }

    @Test
    public void testGetJavaVersionAsInt() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getJavaVersionAsInt");
        method.setAccessible(true);
        int result = (Integer) method.invoke(null);
        assertEquals(SystemUtils.JAVA_VERSION_INT, result);
    }

    @Test
    public void testGetJavaVersionMatches() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getJavaVersionMatches", String.class);
        method.setAccessible(true);
        boolean result = (Boolean) method.invoke(null, "1.5");
        assertEquals(SystemUtils.JAVA_VERSION_TRIMMED != null && SystemUtils.JAVA_VERSION_TRIMMED.startsWith("1.5"), result);
    }

    @Test
    public void testGetOSMatches() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getOSMatches", String.class, String.class);
        method.setAccessible(true);
        boolean result = (Boolean) method.invoke(null, "Windows", "5.1");
        assertNotNull(result);
    }

    @Test
    public void testGetOSMatchesName() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getOSMatchesName", String.class);
        method.setAccessible(true);
        boolean result = (Boolean) method.invoke(null, "Windows");
        assertNotNull(result);
    }

    @Test
    public void testGetSystemProperty() throws Exception {
        java.lang.reflect.Method method = SystemUtils.class.getDeclaredMethod("getSystemProperty", String.class);
        method.setAccessible(true);
        String result = (String) method.invoke(null, "java.home");
        assertEquals(System.getProperty("java.home"), result);
    }

    @Test
    public void testGetUserDir() {
        File result = SystemUtils.getUserDir();
        assertNotNull(result);
        assertEquals(System.getProperty("user.dir"), result.getPath());
    }

    @Test
    public void testGetUserHome() {
        File result = SystemUtils.getUserHome();
        assertNotNull(result);
        assertEquals(System.getProperty("user.home"), result.getPath());
    }
}