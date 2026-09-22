package org.mockito.internal.util.reflection;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.reflect.WildcardType wildcardType0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType wildCardBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = wildCardBoundedType1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.reflect.WildcardType wildcardType0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType wildCardBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = wildCardBoundedType1.firstBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.reflect.WildcardType wildcardType0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType wildCardBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = wildCardBoundedType1.getTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.reflect.TypeVariable typeVariable0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType typeVarBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = typeVarBoundedType1.firstBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.reflect.TypeVariable typeVariable0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType typeVarBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray2 = typeVarBoundedType1.interfaceBounds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.reflect.TypeVariable typeVariable0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType typeVarBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = typeVarBoundedType1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.reflect.TypeVariable typeVariable0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType typeVarBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray2 = typeVarBoundedType1.interfaceBounds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.reflect.TypeVariable typeVariable0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType typeVarBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = typeVarBoundedType1.firstBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.TypeVariable typeVariable3 = null;
        java.lang.reflect.TypeVariable[] typeVariableArray4 = new java.lang.reflect.TypeVariable[] { typeVariable3 };
        // The following exception was thrown during execution in test generation
        try {
            genericMetadataSupport2.registerTypeParametersOn(typeVariableArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(typeVariableArray4);
        org.junit.Assert.assertArrayEquals(typeVariableArray4, new java.lang.reflect.TypeVariable[] { null });
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable typeVariable8 = null;
        java.lang.reflect.TypeVariable[] typeVariableArray9 = new java.lang.reflect.TypeVariable[] { typeVariable8 };
        // The following exception was thrown during execution in test generation
        try {
            genericMetadataSupport2.registerTypeParametersOn(typeVariableArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray9);
        org.junit.Assert.assertArrayEquals(typeVariableArray9, new java.lang.reflect.TypeVariable[] { null });
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.reflect.WildcardType wildcardType0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType wildCardBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = wildCardBoundedType1.firstBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.reflect.TypeVariable typeVariable0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType typeVarBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType(typeVariable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = typeVarBoundedType1.getTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        boolean boolean7 = genericMetadataSupport2.hasRawExtraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.reflect.WildcardType wildcardType0 = null;
        org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType wildCardBoundedType1 = new org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType(wildcardType0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type should not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.TypeVariable typeVariable3 = null;
        java.lang.reflect.Type type4 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable3);
        java.lang.reflect.TypeVariable[] typeVariableArray5 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray5);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(typeVariableArray5);
        org.junit.Assert.assertArrayEquals(typeVariableArray5, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.TypeVariable typeVariable3 = null;
        java.lang.reflect.Type type4 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable3);
        java.lang.reflect.TypeVariable typeVariable5 = null;
        java.lang.reflect.Type type6 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable5);
        java.lang.reflect.TypeVariable typeVariable7 = null;
        java.lang.reflect.Type type8 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.Class<?>[] wildcardClassArray8 = genericMetadataSupport2.rawExtraInterfaces();
        boolean boolean9 = genericMetadataSupport2.hasRawExtraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertArrayEquals(wildcardClassArray8, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap3 = genericMetadataSupport2.actualTypeArguments();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport2.contextualActualTypeParameters;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport6 = genericMetadataSupport2.resolveGenericReturnType(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(typeVariableMap3);
        org.junit.Assert.assertNotNull(typeVariableMap4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap3 = genericMetadataSupport2.actualTypeArguments();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport2.contextualActualTypeParameters;
        java.util.List<java.lang.reflect.Type> typeList5 = genericMetadataSupport2.extraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(typeVariableMap3);
        org.junit.Assert.assertNotNull(typeVariableMap4);
        org.junit.Assert.assertNotNull(typeList5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray8 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray8);
        org.junit.Assert.assertArrayEquals(typeVariableArray8, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = genericMetadataSupport3.resolveGenericReturnType(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(genericMetadataSupport3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?> wildcardClass3 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable typeVariable4 = null;
        java.lang.reflect.Type type5 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap3 = genericMetadataSupport2.actualTypeArguments();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport2.contextualActualTypeParameters;
        java.lang.Class<?>[] wildcardClassArray5 = genericMetadataSupport2.rawExtraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(typeVariableMap3);
        org.junit.Assert.assertNotNull(typeVariableMap4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertArrayEquals(wildcardClassArray5, new java.lang.Class[] {});
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray8 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray8);
        java.util.List<java.lang.reflect.Type> typeList10 = genericMetadataSupport2.extraInterfaces();
        java.lang.Class<?> wildcardClass11 = typeList10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray8);
        org.junit.Assert.assertArrayEquals(typeVariableArray8, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(typeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.TypeVariable typeVariable3 = null;
        java.lang.reflect.Type type4 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport7 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass6);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap8 = genericMetadataSupport7.actualTypeArguments();
        java.util.List<java.lang.reflect.Type> typeList9 = genericMetadataSupport7.extraInterfaces();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap10 = genericMetadataSupport7.contextualActualTypeParameters;
        genericMetadataSupport2.contextualActualTypeParameters = typeVariableMap10;
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(genericMetadataSupport7);
        org.junit.Assert.assertNotNull(typeVariableMap8);
        org.junit.Assert.assertNotNull(typeList9);
        org.junit.Assert.assertNotNull(typeVariableMap10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.Class<?>[] wildcardClassArray8 = genericMetadataSupport2.rawExtraInterfaces();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap9 = genericMetadataSupport2.actualTypeArguments();
        boolean boolean10 = genericMetadataSupport2.hasRawExtraInterfaces();
        java.lang.Class<?>[] wildcardClassArray11 = genericMetadataSupport2.rawExtraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertArrayEquals(wildcardClassArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(typeVariableMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] {});
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray8 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray8);
        java.util.List<java.lang.reflect.Type> typeList10 = genericMetadataSupport2.extraInterfaces();
        java.lang.Class<?>[] wildcardClassArray11 = genericMetadataSupport2.rawExtraInterfaces();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport14 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass13);
        java.lang.reflect.TypeVariable typeVariable15 = null;
        java.lang.reflect.Type type16 = genericMetadataSupport14.getActualTypeArgumentFor(typeVariable15);
        java.lang.reflect.TypeVariable[] typeVariableArray17 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport14.registerTypeParametersOn(typeVariableArray17);
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray8);
        org.junit.Assert.assertArrayEquals(typeVariableArray8, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(typeList10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(genericMetadataSupport14);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNotNull(typeVariableArray17);
        org.junit.Assert.assertArrayEquals(typeVariableArray17, new java.lang.reflect.TypeVariable[] {});
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap3 = genericMetadataSupport2.actualTypeArguments();
        java.util.List<java.lang.reflect.Type> typeList4 = genericMetadataSupport2.extraInterfaces();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap5 = genericMetadataSupport2.contextualActualTypeParameters;
        java.lang.Class<?> wildcardClass6 = genericMetadataSupport2.rawType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(typeVariableMap3);
        org.junit.Assert.assertNotNull(typeList4);
        org.junit.Assert.assertNotNull(typeVariableMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray8 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray8);
        java.util.List<java.lang.reflect.Type> typeList10 = genericMetadataSupport2.extraInterfaces();
        java.util.List<java.lang.reflect.Type> typeList11 = genericMetadataSupport2.extraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray8);
        org.junit.Assert.assertArrayEquals(typeVariableArray8, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(typeList10);
        org.junit.Assert.assertNotNull(typeList11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray8 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray8);
        java.lang.reflect.TypeVariable typeVariable10 = null;
        java.lang.reflect.Type type11 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray8);
        org.junit.Assert.assertArrayEquals(typeVariableArray8, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?>[] wildcardClassArray3 = genericMetadataSupport2.rawExtraInterfaces();
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = genericMetadataSupport2.resolveGenericReturnType(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] {});
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport3.contextualActualTypeParameters;
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(genericMetadataSupport3);
        org.junit.Assert.assertNotNull(typeVariableMap4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?>[] wildcardClassArray3 = genericMetadataSupport2.rawExtraInterfaces();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport2.contextualActualTypeParameters;
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap5 = genericMetadataSupport2.contextualActualTypeParameters;
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(typeVariableMap4);
        org.junit.Assert.assertNotNull(typeVariableMap5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.Class<?>[] wildcardClassArray8 = genericMetadataSupport2.rawExtraInterfaces();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap9 = genericMetadataSupport2.actualTypeArguments();
        boolean boolean10 = genericMetadataSupport2.hasRawExtraInterfaces();
        java.lang.reflect.TypeVariable typeVariable11 = null;
        java.lang.reflect.Type type12 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertArrayEquals(wildcardClassArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(typeVariableMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass4);
        genericMetadataSupport2.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = genericMetadataSupport2.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray8 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray8);
        java.util.List<java.lang.reflect.Type> typeList10 = genericMetadataSupport2.extraInterfaces();
        java.lang.Class<?>[] wildcardClassArray11 = genericMetadataSupport2.rawExtraInterfaces();
        boolean boolean12 = genericMetadataSupport2.hasRawExtraInterfaces();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(genericMetadataSupport5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeVariableArray8);
        org.junit.Assert.assertArrayEquals(typeVariableArray8, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(typeList10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.TypeVariable typeVariable3 = null;
        java.lang.reflect.Type type4 = genericMetadataSupport2.getActualTypeArgumentFor(typeVariable3);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap5 = genericMetadataSupport2.actualTypeArguments();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap6 = genericMetadataSupport2.contextualActualTypeParameters;
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(typeVariableMap5);
        org.junit.Assert.assertNotNull(typeVariableMap6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport2 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?>[] wildcardClassArray3 = genericMetadataSupport2.rawExtraInterfaces();
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport2.contextualActualTypeParameters;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport7 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport10 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass9);
        genericMetadataSupport7.registerTypeVariablesOn((java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = genericMetadataSupport7.rawType();
        java.lang.reflect.TypeVariable[] typeVariableArray13 = new java.lang.reflect.TypeVariable[] {};
        genericMetadataSupport7.registerTypeParametersOn(typeVariableArray13);
        genericMetadataSupport2.registerTypeParametersOn(typeVariableArray13);
        java.lang.Class<?> wildcardClass16 = genericMetadataSupport2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericMetadataSupport2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertArrayEquals(wildcardClassArray3, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(typeVariableMap4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(genericMetadataSupport7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericMetadataSupport10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeVariableArray13);
        org.junit.Assert.assertArrayEquals(typeVariableArray13, new java.lang.reflect.TypeVariable[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

