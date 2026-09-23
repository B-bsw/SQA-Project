package org.apache.commons.lang3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ClassUtilsTest {
    
    private static class TestInterface {}
    private static class TestParentClass {}
    private static class TestChildClass extends TestParentClass implements TestInterface {}
    private static class InnerClass {}
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetShortClassNameObject() {
        assertEquals("String", ClassUtils.getShortClassName("test", "default"));
        assertEquals("default", ClassUtils.getShortClassName((Object)null, "default"));
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName(this, "default"));
    }
    
    @Test
    public void testGetShortClassNameClass() {
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertNull(ClassUtils.getShortClassName((Class<?>)null));
        assertEquals("Integer", ClassUtils.getShortClassName(Integer.class));
    }
    
    @Test
    public void testGetShortClassNameString() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
        assertEquals("", ClassUtils.getShortClassName((String)null));
        assertEquals("", ClassUtils.getShortClassName(""));
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
        assertEquals("String[]", ClassUtils.getShortClassName("java.lang.String[]"));
        assertEquals("Map$Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
    }
    
    @Test
    public void testGetPackageNameObject() {
        assertEquals("java.lang", ClassUtils.getPackageName("test", "default"));
        assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(this, "default"));
        assertEquals("default", ClassUtils.getPackageName((Object)null, "default"));
    }
    
    @Test
    public void testGetPackageNameClass() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("", ClassUtils.getPackageName((Class<?>)null));
    }
    
    @Test
    public void testGetPackageNameString() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
        assertEquals("", ClassUtils.getPackageName(""));
        assertEquals("", ClassUtils.getPackageName((String)null));
        assertEquals("java.util", ClassUtils.getPackageName("java.util.Map$Entry"));
        assertEquals("", ClassUtils.getPackageName("NoPackage"));
    }
    
    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        List<Class<?>> superclasses = ClassUtils.getAllSuperclasses(TestChildClass.class);
        assertEquals(2, superclasses.size());
        assertEquals(TestParentClass.class, superclasses.get(0));
        assertEquals(Object.class, superclasses.get(1));
        
        assertEquals(1, ClassUtils.getAllSuperclasses(String.class).size());
    }
    
    @Test
    public void testGetAllInterfaces() {
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(TestChildClass.class);
        assertTrue(interfaces.contains(TestInterface.class));
        
        interfaces = ClassUtils.getAllInterfaces(ArrayList.class);
        assertTrue(interfaces.contains(List.class));
        assertTrue(interfaces.contains(java.util.RandomAccess.class));
        assertTrue(interfaces.contains(java.io.Serializable.class));
        assertTrue(interfaces.contains(Cloneable.class));
    }
    
    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
        
        List<String> names = new ArrayList<String>();
        names.add("java.lang.String");
        names.add("java.util.List");
        names.add("invalid.ClassName");
        
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(names);
        assertNotNull(classes);
        assertEquals(3, classes.size());
        assertEquals(String.class, classes.get(0));
        assertEquals(List.class, classes.get(1));
        assertNull(classes.get(2));
        
        List<String> emptyNames = new ArrayList<String>();
        assertEquals(0, ClassUtils.convertClassNamesToClasses(emptyNames).size());
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
        
        assertEquals(0, ClassUtils.convertClassesToClassNames(new ArrayList<Class<?>>()).size());
    }
    
    @Test
    public void testIsAssignablePrimitive() {
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.class));
        assertFalse(ClassUtils.isAssignable(Integer.class, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Short.TYPE));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Integer.TYPE));
        assertTrue(ClassUtils.isAssignable(Float.TYPE, Double.TYPE));
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Float.TYPE));
    }
    
    @Test
    public void testIsAssignableArray() {
        Class<?>[] source = {String.class};
        Class<?>[] target = {Object.class};
        assertTrue(ClassUtils.isAssignable(source, target));
        
        Class<?>[] source2 = {String.class, Integer.class};
        Class<?>[] target2 = {Object.class, Object.class};
        assertTrue(ClassUtils.isAssignable(source2, target2));
        
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], new Class<?>[0]));
        assertFalse(ClassUtils.isAssignable(source, new Class<?>[0]));
    }
    
    @Test
    public void testPrimitiveToWrapper() {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
        assertNull(ClassUtils.primitiveToWrapper(null));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(Boolean.TYPE));
    }
    
    @Test
    public void testPrimitivesToWrappers() {
        Class<?>[] primitives = {Integer.TYPE, Boolean.TYPE};
        Class<?>[] wrappers = ClassUtils.primitivesToWrappers(primitives);
        assertEquals(2, wrappers.length);
        assertEquals(Integer.class, wrappers[0]);
        assertEquals(Boolean.class, wrappers[1]);
        
        assertEquals(0, ClassUtils.primitivesToWrappers(new Class<?>[0]).length);
    }
    
    @Test
    public void testWrapperToPrimitive() {
        assertEquals(Integer.TYPE, ClassUtils.wrapperToPrimitive(Integer.class));
        assertNull(ClassUtils.wrapperToPrimitive(null));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
    }
    
    @Test
    public void testWrappersToPrimitives() {
        Class<?>[] wrappers = {Integer.class, Boolean.class};
        Class<?>[] primitives = ClassUtils.wrappersToPrimitives(wrappers);
        assertEquals(2, primitives.length);
        assertEquals(Integer.TYPE, primitives[0]);
        assertEquals(Boolean.TYPE, primitives[1]);
    }
    
    @Test
    public void testIsInnerClass() {
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        assertTrue(ClassUtils.isInnerClass(ClassUtilsTest.InnerClass.class));
    }
    
    @Test
    public void testGetClass() throws ClassNotFoundException {
        Class<?> clazz = ClassUtils.getClass("java.lang.String");
        assertEquals(String.class, clazz);
        
        clazz = ClassUtils.getClass(ClassUtils.class.getClassLoader(), "java.lang.Integer");
        assertEquals(Integer.class, clazz);
        
        clazz = ClassUtils.getClass("int");
        assertEquals(Integer.TYPE, clazz);
        
        clazz = ClassUtils.getClass(ClassUtils.class.getClassLoader(), "int", true);
        assertEquals(Integer.TYPE, clazz);
    }
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassNotFound() throws ClassNotFoundException {
        ClassUtils.getClass("invalid.ClassName");
    }
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassWithLoaderNotFound() throws ClassNotFoundException {
        ClassUtils.getClass(ClassUtils.class.getClassLoader(), "invalid.ClassName");
    }
    
    @Test
    public void testGetPublicMethod() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(method);
        assertEquals("length", method.getName());
        
        method = ClassUtils.getPublicMethod(TestChildClass.class, "toString", new Class<?>[0]);
        assertNotNull(method);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethodNotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonexistent", new Class<?>[0]);
    }
    
    @Test
    public void testToClass() {
        assertNull(ClassUtils.toClass(null));
        
        Object[] arr = {"hello", 1, true};
        Class<?>[] classes = ClassUtils.toClass(arr);
        assertEquals(3, classes.length);
        assertEquals(String.class, classes[0]);
        assertEquals(Integer.class, classes[1]);
        assertEquals(Boolean.class, classes[2]);
        
        assertEquals(0, ClassUtils.toClass(new Object[0]).length);
    }
}