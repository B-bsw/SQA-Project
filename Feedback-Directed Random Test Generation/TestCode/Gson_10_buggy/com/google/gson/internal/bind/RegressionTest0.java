package com.google.gson.internal.bind;

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
        java.lang.reflect.Field field0 = null;
        com.google.gson.internal.Excluder excluder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(field0, true, excluder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy1 = null;
        com.google.gson.internal.Excluder excluder2 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy1, excluder2);
        java.lang.Class<?> wildcardClass4 = reflectiveTypeAdapterFactory3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy1 = null;
        com.google.gson.internal.Excluder excluder2 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy1, excluder2);
        java.lang.reflect.Field field4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = reflectiveTypeAdapterFactory3.excludeField(field4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement4 = strComparableAdapter2.toJsonTree((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement4 = strComparableAdapter2.toJsonTree((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strComparableAdapter2.toJson((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableAdapter2.toJson(writer3, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        com.google.gson.stream.JsonWriter jsonWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableAdapter2.write(jsonWriter3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strComparableAdapter2.toJson((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableAdapter2.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.reflect.Field field0 = null;
        com.google.gson.internal.Excluder excluder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(field0, false, excluder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableAdapter2.fromJson(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy1 = null;
        com.google.gson.internal.Excluder excluder2 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy1, excluder2);
        java.lang.reflect.Field field4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = reflectiveTypeAdapterFactory3.excludeField(field4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        java.lang.Class<?> wildcardClass3 = strComparableAdapter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableAdapter2.toJson(writer3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.gson.internal.ObjectConstructor<java.lang.reflect.AnnotatedElement> annotatedElementObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.reflect.AnnotatedElement> annotatedElementAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.reflect.AnnotatedElement>(annotatedElementObjectConstructor0, strMap1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        com.google.gson.TypeAdapter<java.lang.Comparable<java.lang.String>> strComparableTypeAdapter3 = strComparableAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strComparableTypeAdapter3.toJson((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableTypeAdapter3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.google.gson.internal.ObjectConstructor<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory> reflectiveTypeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory> reflectiveTypeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory>(reflectiveTypeAdapterFactoryObjectConstructor0, strMap1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.google.gson.internal.ObjectConstructor<com.google.gson.TypeAdapterFactory> typeAdapterFactoryObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory> typeAdapterFactoryAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<com.google.gson.TypeAdapterFactory>(typeAdapterFactoryObjectConstructor0, strMap1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        com.google.gson.TypeAdapter<java.lang.Comparable<java.lang.String>> strComparableTypeAdapter3 = strComparableAdapter2.nullSafe();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableTypeAdapter3.fromJson(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableTypeAdapter3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

