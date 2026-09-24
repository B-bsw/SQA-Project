package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray32);
        java.lang.String str37 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray32, "lang");
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray32);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.Class<?>> wildcardClassList45 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList43);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (byte) 10, (byte) 100, strList43, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.toClass(objArray49);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.toClass(objArray49);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray51);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Class[]" + "'", str37, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClassList45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray23, wildcardClassArray29, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray32);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray32, true);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?> wildcardClass38 = wildcardClassArray32.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray65);
        java.lang.Class<?> wildcardClass67 = null;
        java.lang.Class[] classArray69 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass67;
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, (java.lang.Class<?>[]) classArray75, false);
        java.lang.Class[] classArray80 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray75, wildcardClassArray81, false);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray84);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray84);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray84, true);
        java.lang.String str91 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray84, "hi!");
        java.lang.Class<?> wildcardClass92 = wildcardClassArray84.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertArrayEquals(classArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertArrayEquals(classArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertArrayEquals(wildcardClassArray85, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "java.lang" + "'", str91, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "lang3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang3" + "'", str2, "lang3");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray20, "Short");
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, (java.lang.Class<?>[]) classArray36, false);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray36, true);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray42, false);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray51, true);
        java.lang.String str64 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray13, "Short");
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "Short", "ArrayList");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertArrayEquals(classArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertArrayEquals(classArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang" + "'", str64, "java.lang");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "String" + "'", str66, "String");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Float", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.String str43 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray41, "$");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Class[]" + "'", str43, "Class[]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] {});
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray24, "Short");
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40, false);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray40, true);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray55, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray55);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray60);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray46, true);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray8);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang" + "'", str31, "java.lang");
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "java.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray24, "Short");
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40, false);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray40, true);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray55, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray55);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray60);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray46, true);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray64, "Character");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang" + "'", str31, "java.lang");
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "java.lang" + "'", str66, "java.lang");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray27, true);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 10, (byte) 100, strList34, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass(objArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray41, false);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList48);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (byte) 10, (byte) 100, strList48, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray56, "Long");
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray56);
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.Class[] classArray71 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, (java.lang.Class<?>[]) classArray71, false);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray71);
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray71);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray76);
        java.lang.String str79 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray77, "String");
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray77, true);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassList36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class });
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertArrayEquals(classArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertArrayEquals(classArray71, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertArrayEquals(wildcardClassArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang" + "'", str79, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.Class<?>> wildcardClassList26 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 10, (byte) 100, strList24, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass(objArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass(objArray30);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.String str37 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray35, "$");
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClassList26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Class[]" + "'", str37, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] {});
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?> wildcardClass42 = null;
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class[] classArray50 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, (java.lang.Class<?>[]) classArray50, false);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray50);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray34, (java.lang.Class<?>[]) classArray50, true);
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) boolean56, "Byte");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertArrayEquals(classArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang" + "'", str58, "java.lang");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray46, "");
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray60);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray46);
        java.lang.String str68 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray66, "");
        java.lang.Class<?> wildcardClass69 = wildcardClassArray66.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang" + "'", str49, "java.lang");
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertArrayEquals(classArray59, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Class[]" + "'", str68, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray22, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray22);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] {});
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray68);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.String str69 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray67, "util");
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang" + "'", str69, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray20, "Short");
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, (java.lang.Class<?>[]) classArray36, false);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray36, true);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray42, false);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray46, ".");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertArrayEquals(classArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray27, true);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 10, (byte) 100, strList34, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass(objArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray41, false);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList48);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (byte) 10, (byte) 100, strList48, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray56, "Long");
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray56);
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.Class[] classArray71 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, (java.lang.Class<?>[]) classArray71, false);
        java.lang.Class[] classArray76 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray71, wildcardClassArray77, false);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray77);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray80);
        java.lang.String str83 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray81, "Integer");
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray84);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassList36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class });
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertArrayEquals(classArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertArrayEquals(classArray71, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertArrayEquals(classArray76, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "java.lang" + "'", str83, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray9 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray9, false);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "Short");
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray27, false);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray27, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.String str38 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray33, "lang");
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray33);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = null;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray45, false);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Class[]" + "'", str38, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26);
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray43, true);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<java.lang.Class<?>> wildcardClassList52 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList50);
        java.lang.Object[] objArray56 = new java.lang.Object[] { (byte) 10, (byte) 100, strList50, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass(objArray56);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray57, false);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        java.lang.Class<?> wildcardClass62 = null;
        java.lang.Class[] classArray64 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        wildcardClassArray65[0] = wildcardClass62;
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class[] classArray70 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray68, (java.lang.Class<?>[]) classArray70, false);
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray70, wildcardClassArray76, false);
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray76);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray79);
        java.lang.Class<?> wildcardClass81 = null;
        java.lang.Class[] classArray83 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        wildcardClassArray84[0] = wildcardClass81;
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        java.lang.Class[] classArray89 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray90 = (java.lang.Class<?>[]) classArray89;
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray87, (java.lang.Class<?>[]) classArray89, false);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray80, (java.lang.Class<?>[]) classArray89);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, (java.lang.Class<?>[]) classArray89);
        boolean boolean95 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray89);
        java.lang.Class<?>[] wildcardClassArray96 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray89);
        java.lang.Class<?>[] wildcardClassArray97 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray89);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertArrayEquals(classArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClassList52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertArrayEquals(classArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertArrayEquals(classArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertArrayEquals(classArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertArrayEquals(wildcardClassArray79, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertArrayEquals(classArray83, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray89);
        org.junit.Assert.assertArrayEquals(classArray89, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertArrayEquals(wildcardClassArray90, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray96);
        org.junit.Assert.assertArrayEquals(wildcardClassArray96, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray97);
        org.junit.Assert.assertArrayEquals(wildcardClassArray97, new java.lang.Class[] {});
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        java.lang.Class<?> wildcardClass61 = null;
        java.lang.Class[] classArray63 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass61;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, (java.lang.Class<?>[]) classArray69, false);
        java.lang.String str74 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray67, "Short");
        java.lang.Class<?> wildcardClass75 = null;
        java.lang.Class[] classArray77 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        wildcardClassArray78[0] = wildcardClass75;
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray78);
        java.lang.Class[] classArray83 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray81, (java.lang.Class<?>[]) classArray83, false);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, (java.lang.Class<?>[]) classArray83, true);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray57, (java.lang.Class<?>[]) classArray83);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray83);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray90);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray90, false);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray96 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray95);
        java.lang.Class<?>[] wildcardClassArray97 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray95);
        java.lang.Class<?>[] wildcardClassArray98 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray97);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertArrayEquals(classArray63, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang" + "'", str74, "java.lang");
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertArrayEquals(classArray77, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertArrayEquals(wildcardClassArray78, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertArrayEquals(classArray83, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertArrayEquals(wildcardClassArray90, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertArrayEquals(wildcardClassArray91, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertArrayEquals(wildcardClassArray92, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertArrayEquals(wildcardClassArray95, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray96);
        org.junit.Assert.assertArrayEquals(wildcardClassArray96, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray97);
        org.junit.Assert.assertArrayEquals(wildcardClassArray97, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray98);
        org.junit.Assert.assertArrayEquals(wildcardClassArray98, new java.lang.Class[] {});
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray22, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray6, "java");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Class[]" + "'", str32, "Class[]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, (java.lang.Class<?>[]) classArray24, false);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray24, wildcardClassArray30, false);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray34 = null;
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray41, true);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertArrayEquals(classArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertArrayEquals(classArray24, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertArrayEquals(classArray29, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] {});
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray17);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray17, true);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray32, false);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray32);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray46, false);
        java.lang.Class[] classArray51 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray46, wildcardClassArray52, false);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray55, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray60, true);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) 100.0d, "Object[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray21, "Short");
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        java.lang.Class<?> wildcardClass37 = null;
        java.lang.Class[] classArray39 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        wildcardClassArray40[0] = wildcardClass37;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray40);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class[] classArray53 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, (java.lang.Class<?>[]) classArray53, false);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray53);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray57, true);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.Class[] classArray71 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, (java.lang.Class<?>[]) classArray71, false);
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray69, "Short");
        java.lang.Class<?> wildcardClass77 = null;
        java.lang.Class[] classArray79 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass77;
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray80);
        java.lang.Class[] classArray85 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray83, (java.lang.Class<?>[]) classArray85, false);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, (java.lang.Class<?>[]) classArray85, true);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray69, true);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang" + "'", str28, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertArrayEquals(classArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertArrayEquals(classArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertArrayEquals(classArray71, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang" + "'", str76, "java.lang");
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertArrayEquals(classArray79, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertArrayEquals(wildcardClassArray83, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray85);
        org.junit.Assert.assertArrayEquals(classArray85, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass25 = null;
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray28);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray45, true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 10, (byte) 100, strList52, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass(objArray58);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray59, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?> wildcardClass65 = wildcardClassArray28.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray21, "Short");
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        java.lang.Class<?> wildcardClass37 = null;
        java.lang.Class[] classArray39 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        wildcardClassArray40[0] = wildcardClass37;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray40);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class[] classArray53 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, (java.lang.Class<?>[]) classArray53, false);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray53);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray57, true);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang" + "'", str28, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertArrayEquals(classArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] { null });
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray17, "java.lang");
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, (java.lang.Class<?>[]) classArray29, false);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray35, false);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray46, false);
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray44, "Short");
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, (java.lang.Class<?>[]) classArray60, false);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray60, true);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray67, false);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertArrayEquals(classArray29, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertArrayEquals(classArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertArrayEquals(classArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray20, "Short");
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, (java.lang.Class<?>[]) classArray36, false);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray36, true);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray42, false);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray51, true);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray64 = null;
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray64, true);
        java.lang.Class<?>[] wildcardClassArray67 = null;
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray67);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertArrayEquals(classArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertArrayEquals(classArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray9 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray9, false);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray9, wildcardClassArray15, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray19, false);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray60);
        java.lang.Class<?> wildcardClass65 = null;
        java.lang.Class[] classArray67 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        wildcardClassArray68[0] = wildcardClass65;
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray68);
        java.lang.Class[] classArray73 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray74 = (java.lang.Class<?>[]) classArray73;
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray71, (java.lang.Class<?>[]) classArray73, false);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray73);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, wildcardClassArray77, true);
        java.lang.String str81 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray77, "Class");
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray77);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray82);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertArrayEquals(classArray59, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertArrayEquals(classArray67, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertArrayEquals(classArray73, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Class[]" + "'", str81, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertArrayEquals(wildcardClassArray82, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray8);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.Class<?>> wildcardClassList55 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList53);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 10, (byte) 100, strList53, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass(objArray59);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.toClass(objArray59);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray63);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.List<java.lang.Class<?>> wildcardClassList71 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList69);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (byte) 10, (byte) 100, strList69, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.toClass(objArray75);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.toClass(objArray75);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray77);
        java.lang.String str80 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray77, "Long");
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray77);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray82, false);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassList55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClassList71);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertArrayEquals(wildcardClassArray78, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.lang" + "'", str80, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertArrayEquals(wildcardClassArray82, new java.lang.Class[] { null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertArrayEquals(wildcardClassArray85, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray9 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray9, false);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray9, wildcardClassArray15, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, (java.lang.Class<?>[]) classArray29, false);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray35, false);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray46, false);
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray44, "Short");
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, (java.lang.Class<?>[]) classArray60, false);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray60, true);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        java.lang.String str71 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray69, "Boolean");
        java.lang.Class<?> wildcardClass72 = null;
        java.lang.Class[] classArray74 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        wildcardClassArray75[0] = wildcardClass72;
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray75);
        java.lang.Class[] classArray80 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray78, (java.lang.Class<?>[]) classArray80, false);
        java.lang.Class[] classArray85 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray80, wildcardClassArray86, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray89);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, wildcardClassArray89, false);
        java.lang.String str94 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray69, "hi!");
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray69);
        boolean boolean97 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray95, true);
        java.lang.Class<?>[] wildcardClassArray98 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray95);
        boolean boolean99 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray98);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertArrayEquals(classArray29, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertArrayEquals(classArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertArrayEquals(classArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Class[]" + "'", str71, "Class[]");
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertArrayEquals(classArray74, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertArrayEquals(wildcardClassArray75, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertArrayEquals(wildcardClassArray78, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertArrayEquals(classArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(classArray85);
        org.junit.Assert.assertArrayEquals(classArray85, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertArrayEquals(wildcardClassArray89, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertArrayEquals(wildcardClassArray90, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Class[]" + "'", str94, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertArrayEquals(wildcardClassArray95, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray98);
        org.junit.Assert.assertArrayEquals(wildcardClassArray98, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 10, (byte) 100, strList4, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray23, wildcardClassArray29, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray42, false);
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray40, "Short");
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray56, false);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray56, true);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, (java.lang.Class<?>[]) classArray56);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, (java.lang.Class<?>[]) classArray56);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray64, "util");
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertArrayEquals(classArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang" + "'", str47, "java.lang");
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] { java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class, java.lang.Class.class });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "java.lang" + "'", str66, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] { null, null, null, null, null, null });
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray19, "Class[]");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang" + "'", str21, "java.lang");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray24, "Short");
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40, false);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray40, true);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray55, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray55);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray60);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray46, true);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang" + "'", str31, "java.lang");
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass68 = null;
        java.lang.Class[] classArray70 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass68;
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray71);
        java.lang.Class[] classArray76 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray74, (java.lang.Class<?>[]) classArray76, false);
        java.lang.Class[] classArray81 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray82 = (java.lang.Class<?>[]) classArray81;
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray76, wildcardClassArray82, false);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray76);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray76);
        java.lang.String str88 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray86, "Byte");
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray86);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray67);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertArrayEquals(classArray70, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertArrayEquals(classArray76, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(classArray81);
        org.junit.Assert.assertArrayEquals(classArray81, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertArrayEquals(wildcardClassArray82, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertArrayEquals(wildcardClassArray85, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Class[]" + "'", str88, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertArrayEquals(wildcardClassArray89, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertArrayEquals(wildcardClassArray91, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertArrayEquals(wildcardClassArray92, new java.lang.Class[] {});
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray68);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray27);
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40, false);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray40);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray44, true);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.Class<?>> wildcardClassList53 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList51);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (byte) 10, (byte) 100, strList51, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass(objArray57);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray58, false);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray58);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray61, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClassList53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray9 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray9, false);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray9, wildcardClassArray15, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray9);
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, (java.lang.Class<?>[]) classArray9, false);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray9);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Object[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LObject;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray22, wildcardClassArray28, false);
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray37, "Short");
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class[] classArray53 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, (java.lang.Class<?>[]) classArray53, false);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray53, true);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray22, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray22);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, (java.lang.Class<?>[]) classArray22);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang" + "'", str44, "java.lang");
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertArrayEquals(classArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?> wildcardClass41 = null;
        java.lang.Class[] classArray43 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass41;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, (java.lang.Class<?>[]) classArray49, false);
        java.lang.Class<?> wildcardClass53 = null;
        java.lang.Class[] classArray55 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass53;
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, (java.lang.Class<?>[]) classArray61, false);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray59, "Short");
        java.lang.Class<?> wildcardClass67 = null;
        java.lang.Class[] classArray69 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass67;
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, (java.lang.Class<?>[]) classArray75, false);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, (java.lang.Class<?>[]) classArray75, true);
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray49, (java.lang.Class<?>[]) classArray75);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray75);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray82);
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray84, false);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "java.lang" + "'", str66, "java.lang");
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertArrayEquals(classArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertArrayEquals(wildcardClassArray82, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertArrayEquals(wildcardClassArray83, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] {});
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray18, "ArrayList");
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?> wildcardClass22 = null;
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass22;
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class[] classArray30 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, (java.lang.Class<?>[]) classArray30, false);
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray30, wildcardClassArray36, false);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray39);
        java.lang.Class<?> wildcardClass41 = null;
        java.lang.Class[] classArray43 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass41;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, (java.lang.Class<?>[]) classArray49, false);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray49);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray21, "Integer");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertArrayEquals(classArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertArrayEquals(classArray30, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 0, "Object[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Integer" + "'", str2, "Integer");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass25 = null;
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray28);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray45, true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 10, (byte) 100, strList52, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass(objArray58);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray59, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.String str65 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray17, "Float");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] {});
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, (java.lang.Class<?>[]) classArray15, false);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray21, false);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray32, false);
        java.lang.String str37 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray30, "Short");
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray46, false);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray46, true);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray15);
        java.lang.Class<?> wildcardClass55 = null;
        java.lang.Class[] classArray57 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass55;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray58);
        java.lang.Class[] classArray63 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, (java.lang.Class<?>[]) classArray63, false);
        java.lang.Class[] classArray68 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray63, wildcardClassArray69, false);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray69);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray75, true);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray54, true);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertArrayEquals(classArray15, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang" + "'", str37, "java.lang");
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertArrayEquals(classArray63, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertArrayEquals(classArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertArrayEquals(wildcardClassArray75, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] {});
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray22, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) classArray22, "Double");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?> wildcardClass3 = null;
        java.lang.Class[] classArray5 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass3;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class[] classArray11 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, (java.lang.Class<?>[]) classArray11, false);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray11);
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) classArray11, "hi!");
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray11);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray11);
        java.lang.Class<?> wildcardClass20 = null;
        java.lang.Class[] classArray22 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass20;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray23);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, (java.lang.Class<?>[]) classArray28, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray28);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray42, false);
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray40, "Short");
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray56, false);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray56, true);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray62, false);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray62, "hi!");
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray11, wildcardClassArray62);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertArrayEquals(classArray5, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertArrayEquals(classArray11, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Class[]" + "'", str17, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertArrayEquals(classArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang" + "'", str47, "java.lang");
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Class[]" + "'", str66, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass20 = classArray8.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray27, false);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray27);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray41, wildcardClassArray47, false);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray50, false);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray56);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 10, (byte) 100, strList4, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?> wildcardClass13 = null;
        java.lang.Class[] classArray15 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        wildcardClassArray16[0] = wildcardClass13;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, (java.lang.Class<?>[]) classArray21, false);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray21, wildcardClassArray27, false);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40, false);
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray38, "Short");
        java.lang.Class<?> wildcardClass46 = null;
        java.lang.Class[] classArray48 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass46;
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        java.lang.Class[] classArray54 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, (java.lang.Class<?>[]) classArray54, false);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray54, true);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, (java.lang.Class<?>[]) classArray54);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertArrayEquals(classArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang" + "'", str45, "java.lang");
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertArrayEquals(classArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertArrayEquals(classArray54, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray55, false);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray55, wildcardClassArray61, false);
        java.lang.Class<?> wildcardClass64 = null;
        java.lang.Class[] classArray66 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        wildcardClassArray67[0] = wildcardClass64;
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray67);
        java.lang.Class[] classArray72 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray70, (java.lang.Class<?>[]) classArray72, false);
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray70, "Short");
        java.lang.Class<?> wildcardClass78 = null;
        java.lang.Class[] classArray80 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        wildcardClassArray81[0] = wildcardClass78;
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        java.lang.Class[] classArray86 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray87 = (java.lang.Class<?>[]) classArray86;
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray84, (java.lang.Class<?>[]) classArray86, false);
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray70, (java.lang.Class<?>[]) classArray86, true);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray55, wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray55);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray93);
        boolean boolean95 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray94);
        java.lang.Class<?>[] wildcardClassArray96 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray94);
        java.lang.Class<?>[] wildcardClassArray97 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray94);
        java.lang.Class<?>[] wildcardClassArray98 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray94);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertArrayEquals(classArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertArrayEquals(classArray66, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertArrayEquals(classArray72, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "java.lang" + "'", str77, "java.lang");
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertArrayEquals(classArray80, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray86);
        org.junit.Assert.assertArrayEquals(classArray86, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertArrayEquals(wildcardClassArray93, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertArrayEquals(wildcardClassArray94, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray96);
        org.junit.Assert.assertArrayEquals(wildcardClassArray96, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray97);
        org.junit.Assert.assertArrayEquals(wildcardClassArray97, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray98);
        org.junit.Assert.assertArrayEquals(wildcardClassArray98, new java.lang.Class[] {});
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 10, (byte) 100, strList4, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray23, wildcardClassArray29, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray33, "ArrayList");
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray33);
        java.lang.String str38 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray14, "Character");
        java.lang.Class<?> wildcardClass39 = wildcardClassArray14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang" + "'", str35, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang" + "'", str38, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray27, false);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray27, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37, true);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray56, false);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray56, wildcardClassArray62, false);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray68, true);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray71, "$");
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray71);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang" + "'", str73, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] {});
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "apache", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, (java.lang.Class<?>[]) classArray15, false);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray21, false);
        java.lang.Class<?> wildcardClass24 = null;
        java.lang.Class[] classArray26 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass24;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray32, false);
        java.lang.String str37 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray30, "Short");
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray46, false);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray46, true);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray15);
        java.lang.Class<?> wildcardClass55 = null;
        java.lang.Class[] classArray57 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass55;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray58);
        java.lang.Class[] classArray63 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, (java.lang.Class<?>[]) classArray63, false);
        java.lang.Class[] classArray68 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray63, wildcardClassArray69, false);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray69);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray75, true);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray54, true);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray54);
        java.lang.Class<?> wildcardClass81 = wildcardClassArray54.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertArrayEquals(classArray15, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang" + "'", str37, "java.lang");
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertArrayEquals(classArray63, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertArrayEquals(classArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertArrayEquals(wildcardClassArray75, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "Boolean");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Boolean" + "'", str2, "Boolean");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?> wildcardClass20 = wildcardClassArray18.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 10, (byte) 100, strList4, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray23, wildcardClassArray29, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray33, "ArrayList");
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray33);
        java.lang.String str38 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray14, "Character");
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang" + "'", str35, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang" + "'", str38, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, (java.lang.Class<?>[]) classArray24, false);
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray22, "Short");
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray42, false);
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray42, wildcardClassArray48, false);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray48);
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray48, "lang");
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray48);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray48, true);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray15, "lang");
        java.lang.String str61 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray15, "Double");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertArrayEquals(classArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertArrayEquals(classArray24, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang" + "'", str29, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertArrayEquals(classArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Class[]" + "'", str53, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { null });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Class[]" + "'", str61, "Class[]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 10, (byte) 100, strList4, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray22, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass29 = null;
        java.lang.Class[] classArray31 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass29;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray39);
        java.lang.Class<?> wildcardClass44 = null;
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
        java.lang.Class[] classArray52 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, (java.lang.Class<?>[]) classArray52, false);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray52);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray56, true);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray39, true);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.String str63 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray39, "Short");
        java.lang.String str65 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str63, "org.apache.commons");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertArrayEquals(classArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { null });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang" + "'", str63, "java.lang");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        java.lang.Class<?> wildcardClass61 = null;
        java.lang.Class[] classArray63 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass61;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, (java.lang.Class<?>[]) classArray69, false);
        java.lang.String str74 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray67, "Short");
        java.lang.Class<?> wildcardClass75 = null;
        java.lang.Class[] classArray77 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        wildcardClassArray78[0] = wildcardClass75;
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray78);
        java.lang.Class[] classArray83 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray81, (java.lang.Class<?>[]) classArray83, false);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, (java.lang.Class<?>[]) classArray83, true);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray57, (java.lang.Class<?>[]) classArray83);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray83);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray90);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray90, false);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray96 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertArrayEquals(classArray63, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang" + "'", str74, "java.lang");
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertArrayEquals(classArray77, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertArrayEquals(wildcardClassArray78, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertArrayEquals(classArray83, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertArrayEquals(wildcardClassArray90, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertArrayEquals(wildcardClassArray91, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertArrayEquals(wildcardClassArray92, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertArrayEquals(wildcardClassArray95, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray96);
        org.junit.Assert.assertArrayEquals(wildcardClassArray96, new java.lang.Class[] {});
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray27, false);
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray25, "Short");
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray41, true);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray41);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        java.lang.Class[] classArray62 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray57, wildcardClassArray63, false);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.String str69 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray67, "ArrayList");
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray73);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray74);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, wildcardClassArray74);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang" + "'", str32, "java.lang");
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertArrayEquals(classArray62, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang" + "'", str69, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertArrayEquals(wildcardClassArray75, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray12, "Integer");
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] {});
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] {});
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray17);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray17.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray27, false);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray27);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray41, wildcardClassArray47, false);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray50, false);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray32);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?> wildcardClass57 = wildcardClassArray18.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray18, "Integer");
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, (java.lang.Class<?>[]) classArray29, false);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray35, false);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray46, false);
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray44, "Short");
        java.lang.Class<?> wildcardClass52 = null;
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass52;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, (java.lang.Class<?>[]) classArray60, false);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, (java.lang.Class<?>[]) classArray60, true);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray29);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray29, false);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertArrayEquals(classArray29, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertArrayEquals(classArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertArrayEquals(classArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Long");
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, (java.lang.Class<?>[]) classArray29, false);
        java.lang.String str34 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray27, "Short");
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.Class<?> wildcardClass43 = null;
        java.lang.Class[] classArray45 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass43;
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray46);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray46);
        java.lang.Class<?> wildcardClass51 = null;
        java.lang.Class[] classArray53 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass51;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray54);
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, (java.lang.Class<?>[]) classArray59, false);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray63, true);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray63);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        java.lang.String str71 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray68, "Long");
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray68);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertArrayEquals(classArray29, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang" + "'", str34, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertArrayEquals(classArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertArrayEquals(classArray45, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertArrayEquals(classArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertArrayEquals(classArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang" + "'", str71, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray48);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?> wildcardClass66 = null;
        java.lang.Class[] classArray68 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        wildcardClassArray69[0] = wildcardClass66;
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray69);
        java.lang.Class[] classArray74 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray72, (java.lang.Class<?>[]) classArray74, false);
        java.lang.Class[] classArray79 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray74, wildcardClassArray80, false);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray80);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray65, true);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertArrayEquals(classArray59, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertArrayEquals(classArray68, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertArrayEquals(classArray74, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertArrayEquals(wildcardClassArray75, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertArrayEquals(classArray79, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] { null });
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray22, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass29 = null;
        java.lang.Class[] classArray31 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass29;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray39);
        java.lang.Class<?> wildcardClass44 = null;
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
        java.lang.Class[] classArray52 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, (java.lang.Class<?>[]) classArray52, false);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray52);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray56, true);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray39, true);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.Class<?> wildcardClass70 = null;
        java.lang.Class[] classArray72 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass70;
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray73);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, wildcardClassArray73);
        java.lang.Class<?> wildcardClass78 = null;
        java.lang.Class[] classArray80 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        wildcardClassArray81[0] = wildcardClass78;
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        java.lang.Class[] classArray86 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray87 = (java.lang.Class<?>[]) classArray86;
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray84, (java.lang.Class<?>[]) classArray86, false);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray86);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray90, true);
        java.lang.String str94 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray90, "Class");
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.String str97 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray90, "$");
        boolean boolean98 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray90);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertArrayEquals(classArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertArrayEquals(classArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertArrayEquals(classArray72, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertArrayEquals(classArray80, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray86);
        org.junit.Assert.assertArrayEquals(classArray86, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertArrayEquals(wildcardClassArray90, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Class[]" + "'", str94, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertArrayEquals(wildcardClassArray95, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Class[]" + "'", str97, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray47, "java.util");
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class[] classArray58 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, (java.lang.Class<?>[]) classArray58, false);
        java.lang.Class[] classArray63 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray58, wildcardClassArray64, false);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray71);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray73, false);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang" + "'", str49, "java.lang");
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertArrayEquals(classArray58, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertArrayEquals(classArray63, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray56, false);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray56, wildcardClassArray62, false);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray67, false);
        java.lang.Class<?> wildcardClass70 = wildcardClassArray67.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?> wildcardClass42 = null;
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class[] classArray50 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, (java.lang.Class<?>[]) classArray50, false);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray50, wildcardClassArray56, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray50);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray59);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray59, false);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertArrayEquals(classArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass25 = null;
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray28);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray45, true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 10, (byte) 100, strList52, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass(objArray58);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray59, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray28, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "java.lang" + "'", str66, "java.lang");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray22, wildcardClassArray28, false);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray31, false);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.Class[] classArray44 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, (java.lang.Class<?>[]) classArray44, false);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray56, false);
        java.lang.String str61 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray54, "Short");
        java.lang.Class<?> wildcardClass62 = null;
        java.lang.Class[] classArray64 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        wildcardClassArray65[0] = wildcardClass62;
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class[] classArray70 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray68, (java.lang.Class<?>[]) classArray70, false);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, (java.lang.Class<?>[]) classArray70, true);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray44, (java.lang.Class<?>[]) classArray70);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray70);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray77);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray77);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray77);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray80);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertArrayEquals(classArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertArrayEquals(classArray44, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang" + "'", str61, "java.lang");
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertArrayEquals(classArray64, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertArrayEquals(classArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertArrayEquals(wildcardClassArray78, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertArrayEquals(wildcardClassArray82, new java.lang.Class[] {});
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray9 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray9, false);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray9, wildcardClassArray15, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray19, false);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray23);
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray34);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, (java.lang.Class<?>[]) classArray48, false);
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray46, "Short");
        java.lang.Class<?> wildcardClass54 = null;
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray57);
        java.lang.Class[] classArray62 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, (java.lang.Class<?>[]) classArray62, false);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, (java.lang.Class<?>[]) classArray62, true);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray68, false);
        java.lang.Class<?> wildcardClass71 = null;
        java.lang.Class[] classArray73 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray74 = (java.lang.Class<?>[]) classArray73;
        wildcardClassArray74[0] = wildcardClass71;
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray74);
        java.lang.Class<?> wildcardClass78 = null;
        java.lang.Class[] classArray80 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        wildcardClassArray81[0] = wildcardClass78;
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray77, wildcardClassArray81);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray77);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray77, true);
        java.lang.String str90 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray39, "Short");
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray39, false);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertArrayEquals(classArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertArrayEquals(classArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang" + "'", str53, "java.lang");
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertArrayEquals(classArray62, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertArrayEquals(classArray73, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertArrayEquals(wildcardClassArray74, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertArrayEquals(classArray80, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "java.lang" + "'", str90, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertArrayEquals(wildcardClassArray93, new java.lang.Class[] {});
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray27, true);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 10, (byte) 100, strList34, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass(objArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray41, false);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class[] classArray53 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, (java.lang.Class<?>[]) classArray53, false);
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray51, "Short");
        java.lang.Class<?> wildcardClass59 = null;
        java.lang.Class[] classArray61 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        wildcardClassArray62[0] = wildcardClass59;
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray62);
        java.lang.Class[] classArray67 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, (java.lang.Class<?>[]) classArray67, false);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, (java.lang.Class<?>[]) classArray67, true);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray51);
        java.lang.Class<?> wildcardClass74 = null;
        java.lang.Class[] classArray76 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass74;
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray77);
        java.lang.Class[] classArray82 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray83 = (java.lang.Class<?>[]) classArray82;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray80, (java.lang.Class<?>[]) classArray82, false);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray82);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray82);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray87);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray87, true);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        java.lang.Class<?> wildcardClass93 = wildcardClassArray10.getClass();
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassList36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertArrayEquals(classArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertArrayEquals(wildcardClassArray54, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang" + "'", str58, "java.lang");
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertArrayEquals(classArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertArrayEquals(classArray76, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertArrayEquals(wildcardClassArray77, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertArrayEquals(wildcardClassArray80, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray82);
        org.junit.Assert.assertArrayEquals(classArray82, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertArrayEquals(wildcardClassArray83, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertArrayEquals(wildcardClassArray86, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertArrayEquals(wildcardClassArray87, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertArrayEquals(wildcardClassArray91, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertArrayEquals(wildcardClassArray92, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, (java.lang.Class<?>[]) classArray24, false);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray24, wildcardClassArray30, false);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray30);
        java.lang.Class<?> wildcardClass34 = null;
        java.lang.Class[] classArray36 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass34;
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, (java.lang.Class<?>[]) classArray42, false);
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray42, wildcardClassArray48, false);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        java.lang.Class<?> wildcardClass53 = null;
        java.lang.Class[] classArray55 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass53;
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, (java.lang.Class<?>[]) classArray61, false);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray61);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray61);
        java.lang.Class<?> wildcardClass67 = null;
        java.lang.Class[] classArray69 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass67;
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray73, (java.lang.Class<?>[]) classArray75, false);
        java.lang.Class[] classArray80 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray75, wildcardClassArray81, false);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, wildcardClassArray84, false);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, wildcardClassArray66);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertArrayEquals(classArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertArrayEquals(classArray24, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertArrayEquals(classArray29, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertArrayEquals(wildcardClassArray30, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertArrayEquals(classArray42, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertArrayEquals(classArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertArrayEquals(classArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertArrayEquals(classArray80, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertArrayEquals(wildcardClassArray81, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertArrayEquals(wildcardClassArray85, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertArrayEquals(wildcardClassArray90, new java.lang.Class[] {});
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray22);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray41, wildcardClassArray47, false);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, (java.lang.Class<?>[]) classArray41, true);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray52);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertArrayEquals(classArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] {});
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray10);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray10);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23, false);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray27, true);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 10, (byte) 100, strList34, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass(objArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray41, false);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList48);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (byte) 10, (byte) 100, strList48, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray56);
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray56, "Long");
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertArrayEquals(classArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassList36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray24 = null;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray24);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray67);
        java.lang.String str71 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray67, "apache");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertArrayEquals(wildcardClassArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Class[]" + "'", str71, "Class[]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?> wildcardClass20 = wildcardClassArray19.getClass();
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClass20, "Integer");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang" + "'", str22, "java.lang");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass25 = null;
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray28);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray45, true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 10, (byte) 100, strList52, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass(objArray58);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray59, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.String str65 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray28, "Object[]");
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) str65, "Object[]");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "String" + "'", str67, "String");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray25, false);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray23, "Short");
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, (java.lang.Class<?>[]) classArray39, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertArrayEquals(classArray19, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertArrayEquals(wildcardClassArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertArrayEquals(wildcardClassArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertArrayEquals(wildcardClassArray51, new java.lang.Class[] {});
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?> wildcardClass1 = null;
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray9 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray9, false);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray9, wildcardClassArray15, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray15);
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray15, false);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertArrayEquals(classArray9, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertArrayEquals(wildcardClassArray10, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] {});
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, (java.lang.Class<?>[]) classArray22, false);
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray22, wildcardClassArray28, false);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray40, false);
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray40, wildcardClassArray46, false);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        java.lang.String str62 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray55, "Short");
        java.lang.Class<?> wildcardClass63 = null;
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.Class[] classArray71 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, (java.lang.Class<?>[]) classArray71, false);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray71, true);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray40, wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray40);
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray78);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray79);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray28, true);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray83);
        java.lang.String str86 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray83, "Float");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertArrayEquals(classArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertArrayEquals(classArray40, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertArrayEquals(classArray45, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang" + "'", str62, "java.lang");
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertArrayEquals(classArray65, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertArrayEquals(classArray71, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals(wildcardClassArray72, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertArrayEquals(wildcardClassArray78, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertArrayEquals(wildcardClassArray79, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertArrayEquals(wildcardClassArray83, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertArrayEquals(wildcardClassArray84, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "java.lang" + "'", str86, "java.lang");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertArrayEquals(wildcardClassArray19, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertArrayEquals(wildcardClassArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertArrayEquals(wildcardClassArray23, new java.lang.Class[] {});
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 10, (byte) 100, strList4, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray15, "$");
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray26, false);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray32, false);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray43, false);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray41, "Short");
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, (java.lang.Class<?>[]) classArray57, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray57, true);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray26);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) classArray26, ".");
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, (java.lang.Class<?>[]) classArray26);
        java.lang.Class<?> wildcardClass68 = classArray26.getClass();
        java.lang.String str70 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClass68, "Object[]");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertArrayEquals(wildcardClassArray12, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertArrayEquals(wildcardClassArray13, new java.lang.Class[] { byte.class, byte.class, null, int.class, double.class, short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Class[]" + "'", str17, "Class[]");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertArrayEquals(classArray26, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertArrayEquals(wildcardClassArray27, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertArrayEquals(classArray37, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertArrayEquals(wildcardClassArray38, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertArrayEquals(classArray43, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertArrayEquals(wildcardClassArray44, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertArrayEquals(classArray57, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertArrayEquals(wildcardClassArray58, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Class[]" + "'", str66, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Class" + "'", str70, "Class");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray18, "ArrayList");
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.Class<?> wildcardClass23 = null;
        java.lang.Class[] classArray25 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass23;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, (java.lang.Class<?>[]) classArray31, false);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray31, wildcardClassArray37, false);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, (java.lang.Class<?>[]) classArray48, false);
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray46, "Short");
        java.lang.Class<?> wildcardClass54 = null;
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray57);
        java.lang.Class[] classArray62 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray60, (java.lang.Class<?>[]) classArray62, false);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, (java.lang.Class<?>[]) classArray62, true);
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray31, wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray31);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray69);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray70, "String");
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray70, false);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertArrayEquals(classArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertArrayEquals(wildcardClassArray26, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertArrayEquals(classArray31, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertArrayEquals(classArray36, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertArrayEquals(wildcardClassArray37, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertArrayEquals(classArray42, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertArrayEquals(wildcardClassArray43, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertArrayEquals(classArray48, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang" + "'", str53, "java.lang");
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertArrayEquals(classArray56, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertArrayEquals(wildcardClassArray57, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertArrayEquals(wildcardClassArray60, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertArrayEquals(classArray62, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertArrayEquals(wildcardClassArray71, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang" + "'", str73, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray6, "Short");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?> wildcardClass15 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?> wildcardClass22 = null;
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass22;
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        java.lang.Class[] classArray38 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, (java.lang.Class<?>[]) classArray38, false);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray38);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray42, true);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
        java.lang.Class<?> wildcardClass47 = null;
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray55, false);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray55, wildcardClassArray61, false);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray64);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertArrayEquals(classArray17, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertArrayEquals(classArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertArrayEquals(wildcardClassArray25, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertArrayEquals(classArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertArrayEquals(wildcardClassArray33, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertArrayEquals(classArray38, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertArrayEquals(wildcardClassArray46, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertArrayEquals(classArray60, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertArrayEquals(wildcardClassArray61, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertArrayEquals(wildcardClassArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertArrayEquals(wildcardClassArray66, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertArrayEquals(wildcardClassArray69, new java.lang.Class[] {});
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray20, false);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray18, "Short");
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray29);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, (java.lang.Class<?>[]) classArray34, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, (java.lang.Class<?>[]) classArray34, true);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray8);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertArrayEquals(classArray14, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertArrayEquals(wildcardClassArray15, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertArrayEquals(wildcardClassArray18, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang" + "'", str25, "java.lang");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertArrayEquals(classArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertArrayEquals(wildcardClassArray29, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertArrayEquals(wildcardClassArray32, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertArrayEquals(wildcardClassArray35, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertArrayEquals(wildcardClassArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray8, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass18 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass18;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?> wildcardClass25 = null;
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray28);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray41, false);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray45, true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 10, (byte) 100, strList52, 1, (-1.0d), (short) -1 };
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass(objArray58);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray59, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.String str65 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) true, "Class[]");
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertArrayEquals(classArray2, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertArrayEquals(wildcardClassArray6, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertArrayEquals(classArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertArrayEquals(wildcardClassArray9, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertArrayEquals(classArray20, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertArrayEquals(wildcardClassArray21, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertArrayEquals(wildcardClassArray24, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertArrayEquals(wildcardClassArray31, new java.lang.Class[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertArrayEquals(classArray35, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertArrayEquals(wildcardClassArray36, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertArrayEquals(wildcardClassArray39, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertArrayEquals(classArray41, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertArrayEquals(wildcardClassArray42, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertArrayEquals(wildcardClassArray45, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 100, [hi!], 1, -1.0, -1]");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] { java.lang.Byte.class, java.lang.Byte.class, java.util.ArrayList.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Short.class });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }
}

