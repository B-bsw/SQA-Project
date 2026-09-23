package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ClassUtilsTest {
    
    private static class TestBase {}
    private static class TestSub extends TestBase implements TestInterface {}
    private interface TestInterface {}
    private static class TestImpl implements TestInterface {}
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetShortClassNameObjectString() {
        assertEquals("String", ClassUtils.getShortClassName("test", "default"));
        assertEquals("default", ClassUtils.getShortClassName((Object) null, "default"));
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(new Object() {}, "default"));
    }
    
    @Test
    public void testGetShortClassNameClass() {
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
        assertEquals("String[]", ClassUtils.getShortClassName(String[].class));
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(ClassUtilsTest.class));
    }
    
    @Test
    public void testGetShortClassNameString() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getShortClassName(""));
        assertEquals("TestSub", ClassUtils.getShortClassName("org.apache.commons.lang.ClassUtilsTest$TestSub"));
        assertEquals("TestSub", ClassUtils.getShortClassName("org.apache.commons.lang.ClassUtilsTest.TestSub"));
        assertEquals("", ClassUtils.getShortClassName((String) null));
    }
    
    @Test
    public void testGetPackageNameObject() {
        assertEquals("java.lang", ClassUtils.getPackageName("test", "default"));
        assertEquals("default", ClassUtils.getPackageName((Object) null, "default"));
        assertEquals("java.lang", ClassUtils.getPackageName(new String[] {"a"}, "default"));
    }
    
    @Test
    public void testGetPackageNameClass() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("java.lang", ClassUtils.getPackageName(String[].class));
        assertEquals("java.lang", ClassUtils.getPackageName(int[].class));
    }
    
    @Test
    public void testGetPackageNameString() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
        assertEquals("", ClassUtils.getPackageName("NoPackage"));
        assertEquals("java.lang", ClassUtils.getPackageName("[Ljava.lang.String;"));
        assertNull(ClassUtils.getPackageName((String) null));
    }
    
    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        List<Class<?>> supers = ClassUtils.getAllSuperclasses(TestSub.class);
        assertEquals(1, supers.size());
        assertEquals(TestBase.class, supers.get(0));
        assertNull(ClassUtils.getAllSuperclasses(TestImpl.class));
    }
    
    @Test
    public void testGetAllInterfaces() {
        assertNull(ClassUtils.getAllInterfaces(null));
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(TestSub.class);
        assertTrue(interfaces.contains(TestInterface.class));
        assertTrue(interfaces.contains(TestBase.class));
        interfaces = ClassUtils.getAllInterfaces(TestImpl.class);
        assertEquals(1, interfaces.size());
        assertEquals(TestInterface.class, interfaces.get(0));
    }
    
    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
        List<String> names = Arrays.asList("java.lang.String", "java.lang.Integer", "invalid.ClassName");
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(3, classes.size());
        assertEquals(String.class, classes.get(0));
        assertEquals(Integer.class, classes.get(1));
        assertNull(classes.get(2));
    }
    
    @Test
    public void testConvertClassesToClassNames() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        classes.add(Integer.class);
        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertEquals(3, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
        assertEquals("java.lang.Integer", names.get(2));
    }
    
    @Test
    public void testIsAssignableClassArray() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[] {String.class}, new Class<?>[] {Object.class}));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] {String.class}, new Class<?>[] {Integer.class}));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] {String.class}, new Class<?>[] {String.class, Integer.class}));
        assertTrue(ClassUtils.isAssignable(new Class<?>[] {}, new Class<?>[] {}));
    }
    
    @Test
    public void testIsAssignableClassClass() {
        assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Short.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Double.TYPE));
        assertTrue(ClassUtils.isAssignable(Float.TYPE, Double.TYPE));
        assertFalse(ClassUtils.isAssignable(Double.TYPE, Float.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE, true));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, Long.TYPE, true));
        assertFalse(ClassUtils.isAssignable(String.class, null));
        assertTrue(ClassUtils.isAssignable(null, Integer.class));
    }
    
    @Test
    public void testPrimitiveToWrapper() {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.class));
        assertNull(ClassUtils.primitiveToWrapper(null));
    }
    
    @Test
    public void testPrimitivesToWrappers() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        assertEquals(0, ClassUtils.primitivesToWrappers(new Class<?>[0]).length);
        Class<?>[] input = new Class<?>[] {Integer.TYPE, Character.TYPE};
        Class<?>[] output = ClassUtils.primitivesToWrappers(input);
        assertEquals(Integer.class, output[0]);
        assertEquals(Character.class, output[1]);
        assertNull(ClassUtils.primitivesToWrappers(new Class<?>[] {String.class, null}));
    }
    
    @Test
    public void testWrapperToPrimitive() {
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
        assertNull(ClassUtils.wrapperToPrimitive(Integer.TYPE));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }
    
    @Test
    public void testWrappersToPrimitives() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        assertEquals(0, ClassUtils.wrappersToPrimitives(new Class<?>[0]).length);
        Class<?>[] input = new Class<?>[] {Integer.class, Character.class, String.class, null};
        Class<?>[] output = ClassUtils.wrappersToPrimitives(input);
        assertEquals(Integer.TYPE, output[0]);
        assertEquals(Character.TYPE, output[1]);
        assertNull(output[2]);
        assertNull(output[3]);
    }
    
    @Test
    public void testIsInnerClass() {
        assertTrue(ClassUtils.isInnerClass(ClassUtilsTest.class));
        assertTrue(ClassUtils.isInnerClass(TestBase.class));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertFalse(ClassUtils.isInnerClass(int.class));
    }
    
    @Test
    public void testGetClassString() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(String[].class, ClassUtils.getClass("[Ljava.lang.String;"));
        assertEquals(String[].class, ClassUtils.getClass("java.lang.String[]"));
        assertEquals(int.class, ClassUtils.getClass("int"));
        assertEquals(int[].class, ClassUtils.getClass("int[]"));
        assertEquals(Integer[].class, ClassUtils.getClass("java.lang.Integer[]"));
        assertEquals(Integer.class, ClassUtils.getClass(ClassUtilsTest.class.getClassLoader(), "java.lang.Integer"));
        assertEquals(String.class, ClassUtils.getClass(String.class.getClassLoader(), "java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass(String.class.getClassLoader(), "java.lang.String", true));
        assertEquals(String.class, ClassUtils.getClass(String.class.getClassLoader(), "java.lang.String", false));
    }
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassInvalidClassName() throws Exception {
        ClassUtils.getClass("invalid.ClassName");
    }
    
    @Test
    public void testGetPublicMethod() throws Exception {
        Method m = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertEquals("length", m.getName());
        m = ClassUtils.getPublicMethod(TestSub.class, "toString", new Class<?>[0]);
        assertEquals("toString", m.getName());
        m = ClassUtils.getPublicMethod(TestImpl.class, "toString", new Class<?>[0]);
        assertEquals("toString", m.getName());
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethodNotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistent", new Class<?>[0]);
    }
    
    @Test
    public void testGetShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String[]"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName(String[].class));
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
        assertEquals("Test", ClassUtils.getShortCanonicalName("org.Test.Test"));
    }
    
    @Test
    public void testGetPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String[]"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String[].class));
        assertNull(ClassUtils.getPackageCanonicalName((String) null));
        assertEquals("", ClassUtils.getPackageCanonicalName("NoPackage"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(new String[] {"a"}, "fallback"));
        assertEquals("fallback", ClassUtils.getPackageCanonicalName((Object) null, "fallback"));
    }
}