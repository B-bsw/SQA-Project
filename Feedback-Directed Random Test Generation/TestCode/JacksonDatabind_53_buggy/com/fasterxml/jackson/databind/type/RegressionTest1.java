package com.fasterxml.jackson.databind.type;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withClassLoader(classLoader18);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray20 = typeFactory17._modifiers;
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray20, classLoader21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.ClassStack classStack26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withModifier(typeModifier28);
        typeFactory29.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory29.constructType((java.lang.reflect.Type) javaType31, javaType32);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory23._fromAny(classStack26, (java.lang.reflect.Type) javaType33, typeBindings34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withClassLoader(classLoader38);
        com.fasterxml.jackson.databind.type.ClassStack classStack40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withModifier(typeModifier42);
        typeFactory43.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType45 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType46 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory43.constructType((java.lang.reflect.Type) javaType45, javaType46);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings48 = null;
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory37._fromAny(classStack40, (java.lang.reflect.Type) javaType47, typeBindings48);
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier51 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray52 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier51 };
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray52, classLoader53);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray52);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.TypeParser typeParser59 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier60 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray61 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier60 };
        java.lang.ClassLoader classLoader62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser59, typeModifierArray61, classLoader62);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray61);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = typeFactory65.withClassLoader(classLoader66);
        com.fasterxml.jackson.databind.type.ClassStack classStack68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = typeFactory69.withModifier(typeModifier70);
        typeFactory71.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType73 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType74 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType75 = typeFactory71.constructType((java.lang.reflect.Type) javaType73, javaType74);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings76 = null;
        com.fasterxml.jackson.databind.JavaType javaType77 = typeFactory65._fromAny(classStack68, (java.lang.reflect.Type) javaType75, typeBindings76);
        com.fasterxml.jackson.databind.type.TypeParser typeParser78 = typeFactory65._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier79 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray80 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier79 };
        java.lang.ClassLoader classLoader81 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser78, typeModifierArray80, classLoader81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray80);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray80);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeModifierArray20);
        org.junit.Assert.assertArrayEquals(typeModifierArray20, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeModifierArray52);
        org.junit.Assert.assertArrayEquals(typeModifierArray52, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeParser59);
        org.junit.Assert.assertNotNull(typeModifierArray61);
        org.junit.Assert.assertArrayEquals(typeModifierArray61, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeFactory69);
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNotNull(javaType73);
        org.junit.Assert.assertNotNull(javaType74);
        org.junit.Assert.assertNotNull(javaType75);
        org.junit.Assert.assertNotNull(javaType77);
        org.junit.Assert.assertNotNull(typeParser78);
        org.junit.Assert.assertNotNull(typeModifierArray80);
        org.junit.Assert.assertArrayEquals(typeModifierArray80, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.ClassStack classStack11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14.constructType((java.lang.reflect.Type) javaType16, javaType17);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory8._fromAny(classStack11, (java.lang.reflect.Type) javaType18, typeBindings19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.ClassStack classStack29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withModifier(typeModifier31);
        typeFactory32.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory32.constructType((java.lang.reflect.Type) javaType34, javaType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory26._fromAny(classStack29, (java.lang.reflect.Type) javaType36, typeBindings37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray41, classLoader42);
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray41, classLoader44);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withModifier(typeModifier47);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray49 = typeFactory46._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory46.withModifier(typeModifier50);
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeModifierArray49);
        org.junit.Assert.assertArrayEquals(typeModifierArray49, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        boolean boolean7 = typeBindings6.isEmpty();
        java.lang.String str9 = typeBindings6.getBoundName((int) (short) 1);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        typeFactory19.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = typeFactory7.getClassLoader();
        java.lang.ClassLoader classLoader11 = typeFactory7._classLoader;
        java.lang.ClassLoader classLoader12 = typeFactory7._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = typeFactory7._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory2._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory2.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory9._unknownType();
        typeFactory9.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory9.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withModifier(typeModifier19);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory16.withModifier(typeModifier21);
        com.fasterxml.jackson.databind.type.ClassStack classStack23 = null;
        java.lang.reflect.GenericArrayType genericArrayType24 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory16._fromArrayType(classStack23, genericArrayType24, typeBindings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory4._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        java.lang.ClassLoader classLoader10 = typeFactory9.getClassLoader();
        java.lang.ClassLoader classLoader11 = typeFactory9.getClassLoader();
        java.lang.ClassLoader classLoader12 = typeFactory9.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        java.lang.Class<?> wildcardClass14 = typeFactory0._findPrimitive("<>");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory0._modifiers;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(typeModifierArray15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        typeFactory6.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        boolean boolean4 = typeBindings0.hasUnbound("");
        com.fasterxml.jackson.databind.JavaType javaType6 = typeBindings0.findBoundType("<>");
        java.lang.Object obj7 = typeBindings0.readResolve();
        java.lang.Object obj8 = typeBindings0.readResolve();
        java.lang.Object obj9 = typeBindings0.readResolve();
        java.lang.String str11 = typeBindings0.getBoundName(0);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "<>");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "<>");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "<>");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory9.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory13._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = typeFactory13.classForName("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory41.withModifier(typeModifier44);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = typeFactory41.withModifier(typeModifier46);
        java.lang.ClassLoader classLoader50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = typeFactory41.classForName("<>", false, classLoader50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory47);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory6._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory6._typeCache;
        typeFactory6.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory6.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory2.withModifier(typeModifier8);
        typeFactory9.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory2._parser;
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory2.withClassLoader(classLoader22);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeFactory23);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeFactory47.withClassLoader(classLoader48);
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory47._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory51._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier55 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray56 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier55 };
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser54, typeModifierArray56, classLoader57);
        java.lang.ClassLoader classLoader59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray56, classLoader59);
        java.lang.ClassLoader classLoader61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withClassLoader(classLoader61);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray63 = typeFactory60._modifiers;
        java.lang.ClassLoader classLoader64 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray63, classLoader64);
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray63, classLoader66);
        java.lang.ClassLoader classLoader68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = typeFactory67.withClassLoader(classLoader68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass71 = typeFactory67.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeParser54);
        org.junit.Assert.assertNotNull(typeModifierArray56);
        org.junit.Assert.assertArrayEquals(typeModifierArray56, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeModifierArray63);
        org.junit.Assert.assertArrayEquals(typeModifierArray63, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory69);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = typeFactory7.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory7.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory7._parser;
        java.lang.Class<?> wildcardClass16 = typeFactory7._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory2.constructFromCanonical("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<>' (remaining: '>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory7._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass3 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier14 };
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray15, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withModifier(typeModifier23);
        typeFactory24.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory24.constructType((java.lang.reflect.Type) javaType26, javaType27);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory18._fromAny(classStack21, (java.lang.reflect.Type) javaType28, typeBindings29);
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier32 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier32 };
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser31, typeModifierArray33, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray33, classLoader36);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeFactory38.withClassLoader(classLoader39);
        com.fasterxml.jackson.databind.type.ClassStack classStack41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withModifier(typeModifier43);
        typeFactory44.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType46 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType47 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory44.constructType((java.lang.reflect.Type) javaType46, javaType47);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory38._fromAny(classStack41, (java.lang.reflect.Type) javaType48, typeBindings49);
        com.fasterxml.jackson.databind.type.TypeParser typeParser51 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = typeFactory52.withClassLoader(classLoader53);
        com.fasterxml.jackson.databind.type.ClassStack classStack55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withModifier(typeModifier57);
        typeFactory58.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType60 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType61 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType62 = typeFactory58.constructType((java.lang.reflect.Type) javaType60, javaType61);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings63 = null;
        com.fasterxml.jackson.databind.JavaType javaType64 = typeFactory52._fromAny(classStack55, (java.lang.reflect.Type) javaType62, typeBindings63);
        com.fasterxml.jackson.databind.type.TypeParser typeParser65 = typeFactory52._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier66 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray67 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier66 };
        java.lang.ClassLoader classLoader68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser65, typeModifierArray67, classLoader68);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser51, typeModifierArray67);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = typeFactory71.withClassLoader(classLoader72);
        com.fasterxml.jackson.databind.type.TypeParser typeParser74 = typeFactory71._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier75 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray76 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier75 };
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser74, typeModifierArray76, classLoader77);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory79 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser51, typeModifierArray76);
        java.lang.ClassLoader classLoader80 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory81 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray76, classLoader80);
        java.lang.Class<?> wildcardClass83 = typeFactory81._findPrimitive("<>");
        java.lang.Class<?> wildcardClass84 = typeFactory81.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(typeParser51);
        org.junit.Assert.assertNotNull(typeFactory52);
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(javaType60);
        org.junit.Assert.assertNotNull(javaType61);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(typeParser65);
        org.junit.Assert.assertNotNull(typeModifierArray67);
        org.junit.Assert.assertArrayEquals(typeModifierArray67, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNotNull(typeFactory73);
        org.junit.Assert.assertNotNull(typeParser74);
        org.junit.Assert.assertNotNull(typeModifierArray76);
        org.junit.Assert.assertArrayEquals(typeModifierArray76, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        typeFactory7.clearCache();
        typeFactory7.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withModifier(typeModifier18);
        typeFactory16.clearCache();
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory16.withClassLoader(classLoader21);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory22);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory13.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory13._unknownType();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory13.withClassLoader(classLoader19);
        java.lang.Class<?> wildcardClass22 = typeFactory20._findPrimitive("");
        java.lang.ClassLoader classLoader23 = typeFactory20.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory20._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNull(classLoader23);
        org.junit.Assert.assertNotNull(typeParser24);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(typeModifierArray8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        java.lang.Class<?> wildcardClass15 = typeFactory5._findPrimitive("<>");
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory5._unknownType();
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType16);
        java.lang.Class<?> wildcardClass18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass17);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = null;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray15, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withClassLoader(classLoader23);
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier30 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier30 };
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray31, classLoader34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray31);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray37);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory39.withClassLoader(classLoader40);
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory39._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory43.withClassLoader(classLoader44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory43._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48, classLoader49);
        java.lang.ClassLoader classLoader51 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser42, typeModifierArray48, classLoader51);
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = typeFactory52.withClassLoader(classLoader53);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray55 = typeFactory52._modifiers;
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray55, classLoader56);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = typeFactory58.withClassLoader(classLoader59);
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeFactory58._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = typeFactory62.withClassLoader(classLoader63);
        com.fasterxml.jackson.databind.type.TypeParser typeParser65 = typeFactory62._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier66 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray67 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier66 };
        java.lang.ClassLoader classLoader68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser65, typeModifierArray67, classLoader68);
        java.lang.ClassLoader classLoader70 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser61, typeModifierArray67, classLoader70);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray72 = typeFactory71._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray72);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser14, typeModifierArray72);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(typeModifierArray55);
        org.junit.Assert.assertArrayEquals(typeModifierArray55, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeFactory64);
        org.junit.Assert.assertNotNull(typeParser65);
        org.junit.Assert.assertNotNull(typeModifierArray67);
        org.junit.Assert.assertArrayEquals(typeModifierArray67, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray72);
        org.junit.Assert.assertArrayEquals(typeModifierArray72, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withModifier(typeModifier19);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory16.withModifier(typeModifier21);
        java.lang.ClassLoader classLoader23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory16.withClassLoader(classLoader23);
        com.fasterxml.jackson.databind.type.ClassStack classStack25 = null;
        java.lang.reflect.WildcardType wildcardType26 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeBindings27.getBoundType((int) ' ');
        boolean boolean31 = typeBindings27.hasUnbound("");
        com.fasterxml.jackson.databind.JavaType javaType33 = typeBindings27.findBoundType("<>");
        java.lang.Object obj34 = typeBindings27.readResolve();
        java.lang.Object obj35 = typeBindings27.readResolve();
        java.lang.Object obj36 = typeBindings27.readResolve();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory16._fromWildcard(classStack25, wildcardType26, typeBindings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(typeBindings27);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "<>");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "<>");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "<>");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory2.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap8 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap8);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory13.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory13._unknownType();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory13.withClassLoader(classLoader19);
        java.lang.Class<?> wildcardClass22 = typeFactory20._findPrimitive("");
        java.lang.ClassLoader classLoader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = typeFactory20.classForName("", true, classLoader25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(wildcardClass22);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30, classLoader33);
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory34._modifiers;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.type.ClassStack classStack43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withModifier(typeModifier45);
        typeFactory46.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType48 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType49 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory46.constructType((java.lang.reflect.Type) javaType48, javaType49);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory40._fromAny(classStack43, (java.lang.reflect.Type) javaType50, typeBindings51);
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray54);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray71 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier70 };
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray71, classLoader72);
        java.lang.ClassLoader classLoader74 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray71, classLoader74);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray71);
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory76.withClassLoader(classLoader77);
        java.lang.Class<?> wildcardClass80 = typeFactory78._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeModifierArray54);
        org.junit.Assert.assertArrayEquals(typeModifierArray54, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeModifierArray71);
        org.junit.Assert.assertArrayEquals(typeModifierArray71, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNull(wildcardClass80);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory13.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        java.lang.ClassLoader classLoader21 = typeFactory18.getClassLoader();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory18.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeFactory24.withModifier(typeModifier25);
        typeFactory26.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory26.constructType((java.lang.reflect.Type) javaType28, javaType29);
        com.fasterxml.jackson.databind.type.ArrayType arrayType31 = typeFactory23.constructArrayType(javaType28);
        java.lang.Class<?> wildcardClass33 = typeFactory23._findPrimitive("<>");
        java.lang.Class<?> wildcardClass35 = typeFactory23._findPrimitive("hi!");
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory23._unknownType();
        com.fasterxml.jackson.databind.type.ArrayType arrayType37 = typeFactory13.constructArrayType(javaType36);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(arrayType31);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(arrayType37);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory2.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory13._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory13._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeModifierArray16);
        org.junit.Assert.assertArrayEquals(typeModifierArray16, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser17);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory2._parser;
        java.lang.ClassLoader classLoader5 = typeFactory2.getClassLoader();
        java.lang.Class<?> wildcardClass7 = typeFactory2._findPrimitive("<>");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory2._modifiers;
        typeFactory2.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(typeModifierArray8);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory7._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.ClassStack classStack11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14.constructType((java.lang.reflect.Type) javaType16, javaType17);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory8._fromAny(classStack11, (java.lang.reflect.Type) javaType18, typeBindings19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.ClassStack classStack29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withModifier(typeModifier31);
        typeFactory32.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory32.constructType((java.lang.reflect.Type) javaType34, javaType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory26._fromAny(classStack29, (java.lang.reflect.Type) javaType36, typeBindings37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray41, classLoader42);
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray41, classLoader44);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withModifier(typeModifier47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory46.withClassLoader(classLoader49);
        java.lang.ClassLoader classLoader51 = typeFactory50.getClassLoader();
        typeFactory50.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray53 = typeFactory50._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory50.withModifier(typeModifier54);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withModifier(typeModifier57);
        java.lang.ClassLoader classLoader59 = typeFactory56.getClassLoader();
        java.lang.ClassLoader classLoader60 = typeFactory56.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory56.withModifier(typeModifier61);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = typeFactory62.withModifier(typeModifier63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = typeFactory65.withClassLoader(classLoader66);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = typeFactory68.withModifier(typeModifier69);
        typeFactory70.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap72 = typeFactory70._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack73 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = typeFactory74.withModifier(typeModifier75);
        typeFactory76.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType78 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType79 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType80 = typeFactory76.constructType((java.lang.reflect.Type) javaType78, javaType79);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings81 = null;
        com.fasterxml.jackson.databind.JavaType javaType82 = typeFactory70._fromAny(classStack73, (java.lang.reflect.Type) javaType80, typeBindings81);
        com.fasterxml.jackson.databind.type.ArrayType arrayType83 = typeFactory67.constructArrayType(javaType80);
        com.fasterxml.jackson.databind.type.TypeParser typeParser84 = typeFactory67._parser;
        com.fasterxml.jackson.databind.JavaType javaType85 = typeFactory67._unknownType();
        com.fasterxml.jackson.databind.type.SimpleType simpleType86 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType87 = typeFactory67.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType86);
        com.fasterxml.jackson.databind.type.ArrayType arrayType88 = typeFactory62.constructArrayType((com.fasterxml.jackson.databind.JavaType) arrayType87);
        com.fasterxml.jackson.databind.JavaType javaType89 = typeFactory55.constructType((java.lang.reflect.Type) arrayType87);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNull(classLoader51);
        org.junit.Assert.assertNotNull(typeModifierArray53);
        org.junit.Assert.assertArrayEquals(typeModifierArray53, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNull(classLoader59);
        org.junit.Assert.assertNull(classLoader60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeFactory64);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeFactory68);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap72);
        org.junit.Assert.assertNotNull(typeFactory74);
        org.junit.Assert.assertNotNull(typeFactory76);
        org.junit.Assert.assertNotNull(javaType78);
        org.junit.Assert.assertNotNull(javaType79);
        org.junit.Assert.assertNotNull(javaType80);
        org.junit.Assert.assertNotNull(javaType82);
        org.junit.Assert.assertNotNull(arrayType83);
        org.junit.Assert.assertNotNull(typeParser84);
        org.junit.Assert.assertNotNull(javaType85);
        org.junit.Assert.assertNotNull(simpleType86);
        org.junit.Assert.assertNotNull(arrayType87);
        org.junit.Assert.assertNotNull(arrayType88);
        org.junit.Assert.assertNotNull(javaType89);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory41.withModifier(typeModifier44);
        com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory45._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(javaType46);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = typeBindings0.withUnboundVariable("<>");
        java.lang.String str9 = typeBindings0.toString();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList10 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeBindings0.findBoundType("hi!");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<>" + "'", str9, "<>");
        org.junit.Assert.assertNotNull(javaTypeList10);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = typeFactory16._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(typeModifierArray17);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory0._findPrimitive("hi!");
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.ClassStack classStack8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withModifier(typeModifier10);
        typeFactory11.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap13 = typeFactory11._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withModifier(typeModifier16);
        typeFactory17.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory17.constructType((java.lang.reflect.Type) javaType19, javaType20);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory11._fromAny(classStack14, (java.lang.reflect.Type) javaType21, typeBindings22);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap24 = typeFactory11._typeCache;
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeFactory11.withClassLoader(classLoader25);
        typeFactory26.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory26._parser;
        java.lang.ClassLoader classLoader29 = typeFactory26.getClassLoader();
        java.lang.Class<?> wildcardClass30 = typeFactory26.getClass();
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = typeFactory7._fromAny(classStack8, (java.lang.reflect.Type) wildcardClass30, typeBindings31);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap33 = typeFactory7._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNull(classLoader29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap33);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory4._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.type.ClassStack classStack45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withModifier(typeModifier47);
        typeFactory48.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType50 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType51 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory48.constructType((java.lang.reflect.Type) javaType50, javaType51);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings53 = null;
        com.fasterxml.jackson.databind.JavaType javaType54 = typeFactory42._fromAny(classStack45, (java.lang.reflect.Type) javaType52, typeBindings53);
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory42._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray71 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier70 };
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray71, classLoader72);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser55, typeModifierArray71);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray71);
        com.fasterxml.jackson.databind.type.TypeParser typeParser76 = typeFactory75._parser;
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory75.withClassLoader(classLoader77);
        java.lang.ClassLoader classLoader79 = typeFactory75.getClassLoader();
        java.lang.ClassLoader classLoader82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass83 = typeFactory75.classForName("<>", false, classLoader82);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(javaType54);
        org.junit.Assert.assertNotNull(typeParser55);
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeModifierArray71);
        org.junit.Assert.assertArrayEquals(typeModifierArray71, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser76);
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNull(classLoader79);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withModifier(typeModifier7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.findClass("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30, classLoader33);
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory34._modifiers;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory43.withClassLoader(classLoader44);
        com.fasterxml.jackson.databind.type.ClassStack classStack46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeFactory47.withModifier(typeModifier48);
        typeFactory49.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType51 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType52 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType53 = typeFactory49.constructType((java.lang.reflect.Type) javaType51, javaType52);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings54 = null;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory43._fromAny(classStack46, (java.lang.reflect.Type) javaType53, typeBindings54);
        com.fasterxml.jackson.databind.type.TypeParser typeParser56 = typeFactory43._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray57 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser56, typeModifierArray57);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = typeFactory59.withClassLoader(classLoader60);
        com.fasterxml.jackson.databind.type.ClassStack classStack62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier64 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeFactory63.withModifier(typeModifier64);
        typeFactory65.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType67 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType68 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType69 = typeFactory65.constructType((java.lang.reflect.Type) javaType67, javaType68);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings70 = null;
        com.fasterxml.jackson.databind.JavaType javaType71 = typeFactory59._fromAny(classStack62, (java.lang.reflect.Type) javaType69, typeBindings70);
        com.fasterxml.jackson.databind.type.TypeParser typeParser72 = typeFactory59._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier73 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray74 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier73 };
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser72, typeModifierArray74, classLoader75);
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser56, typeModifierArray74, classLoader77);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier79 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray80 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier79 };
        java.lang.ClassLoader classLoader81 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser56, typeModifierArray80, classLoader81);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray80);
        java.lang.ClassLoader classLoader84 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory85 = typeFactory83.withClassLoader(classLoader84);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(javaType53);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(typeParser56);
        org.junit.Assert.assertNotNull(typeModifierArray57);
        org.junit.Assert.assertArrayEquals(typeModifierArray57, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(typeFactory63);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(javaType67);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(javaType69);
        org.junit.Assert.assertNotNull(javaType71);
        org.junit.Assert.assertNotNull(typeParser72);
        org.junit.Assert.assertNotNull(typeModifierArray74);
        org.junit.Assert.assertArrayEquals(typeModifierArray74, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray80);
        org.junit.Assert.assertArrayEquals(typeModifierArray80, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory85);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier14 };
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray15, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withModifier(typeModifier23);
        typeFactory24.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory24.constructType((java.lang.reflect.Type) javaType26, javaType27);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory18._fromAny(classStack21, (java.lang.reflect.Type) javaType28, typeBindings29);
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier32 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier32 };
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser31, typeModifierArray33, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray33, classLoader36);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory39.withClassLoader(classLoader40);
        com.fasterxml.jackson.databind.type.ClassStack classStack42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory43.withModifier(typeModifier44);
        typeFactory45.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType47 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType48 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory45.constructType((java.lang.reflect.Type) javaType47, javaType48);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings50 = null;
        com.fasterxml.jackson.databind.JavaType javaType51 = typeFactory39._fromAny(classStack42, (java.lang.reflect.Type) javaType49, typeBindings50);
        com.fasterxml.jackson.databind.type.TypeParser typeParser52 = typeFactory39._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray53 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser52, typeModifierArray53);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory55.withClassLoader(classLoader56);
        com.fasterxml.jackson.databind.type.ClassStack classStack58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = typeFactory59.withModifier(typeModifier60);
        typeFactory61.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType63 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = typeFactory61.constructType((java.lang.reflect.Type) javaType63, javaType64);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings66 = null;
        com.fasterxml.jackson.databind.JavaType javaType67 = typeFactory55._fromAny(classStack58, (java.lang.reflect.Type) javaType65, typeBindings66);
        com.fasterxml.jackson.databind.type.TypeParser typeParser68 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier69 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray70 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier69 };
        java.lang.ClassLoader classLoader71 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser68, typeModifierArray70, classLoader71);
        java.lang.ClassLoader classLoader73 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser52, typeModifierArray70, classLoader73);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier75 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray76 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier75 };
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser52, typeModifierArray76, classLoader77);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory79 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser38, typeModifierArray76);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier80 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory81 = typeFactory79.withModifier(typeModifier80);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser38);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(typeParser52);
        org.junit.Assert.assertNotNull(typeModifierArray53);
        org.junit.Assert.assertArrayEquals(typeModifierArray53, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType67);
        org.junit.Assert.assertNotNull(typeParser68);
        org.junit.Assert.assertNotNull(typeModifierArray70);
        org.junit.Assert.assertArrayEquals(typeModifierArray70, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray76);
        org.junit.Assert.assertArrayEquals(typeModifierArray76, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory81);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = typeBindings0.withUnboundVariable("<>");
        boolean boolean10 = typeBindings8.hasUnbound("");
        boolean boolean12 = typeBindings8.hasUnbound("<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.ClassStack classStack19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory20.withModifier(typeModifier21);
        typeFactory22.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory22.constructType((java.lang.reflect.Type) javaType24, javaType25);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory16._fromAny(classStack19, (java.lang.reflect.Type) javaType26, typeBindings27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        com.fasterxml.jackson.databind.type.ClassStack classStack33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withModifier(typeModifier35);
        typeFactory36.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType38 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType39 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory36.constructType((java.lang.reflect.Type) javaType38, javaType39);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings41 = null;
        com.fasterxml.jackson.databind.JavaType javaType42 = typeFactory30._fromAny(classStack33, (java.lang.reflect.Type) javaType40, typeBindings41);
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory30._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray45 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier44 };
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray45, classLoader46);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory49.withClassLoader(classLoader50);
        com.fasterxml.jackson.databind.type.ClassStack classStack52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory53.withModifier(typeModifier54);
        typeFactory55.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType57 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType58 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType59 = typeFactory55.constructType((java.lang.reflect.Type) javaType57, javaType58);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings60 = null;
        com.fasterxml.jackson.databind.JavaType javaType61 = typeFactory49._fromAny(classStack52, (java.lang.reflect.Type) javaType59, typeBindings60);
        com.fasterxml.jackson.databind.type.TypeParser typeParser62 = typeFactory49._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader64 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeFactory63.withClassLoader(classLoader64);
        com.fasterxml.jackson.databind.type.TypeParser typeParser66 = typeFactory63._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = typeFactory67.withClassLoader(classLoader68);
        com.fasterxml.jackson.databind.type.TypeParser typeParser70 = typeFactory67._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier71 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray72 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier71 };
        java.lang.ClassLoader classLoader73 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser70, typeModifierArray72, classLoader73);
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser66, typeModifierArray72, classLoader75);
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory76.withClassLoader(classLoader77);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray79 = typeFactory76._modifiers;
        java.lang.ClassLoader classLoader80 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory81 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser62, typeModifierArray79, classLoader80);
        java.lang.ClassLoader classLoader82 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray79, classLoader82);
        java.lang.ClassLoader classLoader84 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory85 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray79, classLoader84);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray14);
        org.junit.Assert.assertArrayEquals(typeModifierArray14, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeModifierArray45);
        org.junit.Assert.assertArrayEquals(typeModifierArray45, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(javaType57);
        org.junit.Assert.assertNotNull(javaType58);
        org.junit.Assert.assertNotNull(javaType59);
        org.junit.Assert.assertNotNull(javaType61);
        org.junit.Assert.assertNotNull(typeParser62);
        org.junit.Assert.assertNotNull(typeFactory63);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(typeParser66);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeFactory69);
        org.junit.Assert.assertNotNull(typeParser70);
        org.junit.Assert.assertNotNull(typeModifierArray72);
        org.junit.Assert.assertArrayEquals(typeModifierArray72, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNotNull(typeModifierArray79);
        org.junit.Assert.assertArrayEquals(typeModifierArray79, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory17._findPrimitive("<>");
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory17.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory17._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(javaType22);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        java.lang.Class<?> wildcardClass15 = typeFactory5._findPrimitive("<>");
        java.lang.Class<?> wildcardClass17 = typeFactory5._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory5._parser;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory5._unknownType();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory5.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory25._unknownType();
        java.lang.ClassLoader classLoader31 = typeFactory25._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeFactory47.withClassLoader(classLoader48);
        com.fasterxml.jackson.databind.type.ClassStack classStack50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withModifier(typeModifier52);
        typeFactory53.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType55 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType56 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType57 = typeFactory53.constructType((java.lang.reflect.Type) javaType55, javaType56);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings58 = null;
        com.fasterxml.jackson.databind.JavaType javaType59 = typeFactory47._fromAny(classStack50, (java.lang.reflect.Type) javaType57, typeBindings58);
        com.fasterxml.jackson.databind.type.TypeParser typeParser60 = typeFactory47._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier61 };
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser60, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray62);
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray62, classLoader66);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray68 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray68, classLoader69);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray68);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNull(classLoader31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNotNull(javaType57);
        org.junit.Assert.assertNotNull(javaType59);
        org.junit.Assert.assertNotNull(typeParser60);
        org.junit.Assert.assertNotNull(typeModifierArray62);
        org.junit.Assert.assertArrayEquals(typeModifierArray62, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray68);
        org.junit.Assert.assertArrayEquals(typeModifierArray68, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory9._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withModifier(typeModifier16);
        typeFactory17.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap19 = typeFactory17._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withModifier(typeModifier22);
        typeFactory23.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory23.constructType((java.lang.reflect.Type) javaType25, javaType26);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory17._fromAny(classStack20, (java.lang.reflect.Type) javaType27, typeBindings28);
        com.fasterxml.jackson.databind.type.ArrayType arrayType30 = typeFactory0.constructArrayType(javaType27);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory0.withClassLoader(classLoader31);
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory32._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeParser typeParser37 = typeFactory34._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray39 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier38 };
        java.lang.ClassLoader classLoader40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray39, classLoader40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray39, classLoader42);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withClassLoader(classLoader45);
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = typeFactory44._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        com.fasterxml.jackson.databind.type.TypeParser typeParser51 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = typeFactory52.withClassLoader(classLoader53);
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory52._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier56 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray57 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier56 };
        java.lang.ClassLoader classLoader58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser55, typeModifierArray57, classLoader58);
        java.lang.ClassLoader classLoader60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser51, typeModifierArray57, classLoader60);
        java.lang.ClassLoader classLoader62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = typeFactory61.withClassLoader(classLoader62);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray64 = typeFactory61._modifiers;
        java.lang.ClassLoader classLoader65 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser47, typeModifierArray64, classLoader65);
        java.lang.ClassLoader classLoader67 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser33, typeModifierArray64, classLoader67);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(arrayType30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeParser33);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeParser37);
        org.junit.Assert.assertNotNull(typeModifierArray39);
        org.junit.Assert.assertArrayEquals(typeModifierArray39, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeParser47);
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNotNull(typeParser51);
        org.junit.Assert.assertNotNull(typeFactory52);
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(typeParser55);
        org.junit.Assert.assertNotNull(typeModifierArray57);
        org.junit.Assert.assertArrayEquals(typeModifierArray57, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory63);
        org.junit.Assert.assertNotNull(typeModifierArray64);
        org.junit.Assert.assertArrayEquals(typeModifierArray64, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.type.ArrayType arrayType18 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap19 = typeFactory2._typeCache;
        java.lang.Class<?> wildcardClass21 = typeFactory2._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = typeFactory2.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(arrayType18);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap19);
        org.junit.Assert.assertNull(wildcardClass21);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withModifier(typeModifier19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory16._parser;
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory16.withClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass25 = typeFactory23._findPrimitive("<>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = typeFactory23.classForName("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNull(wildcardClass25);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory16.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory19._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory19.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(javaType22);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory13.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory17._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(javaType18);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier5 };
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray6, classLoader7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withClassLoader(classLoader10);
        com.fasterxml.jackson.databind.type.ClassStack classStack12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withModifier(typeModifier14);
        typeFactory15.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory15.constructType((java.lang.reflect.Type) javaType17, javaType18);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory9._fromAny(classStack12, (java.lang.reflect.Type) javaType19, typeBindings20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory9._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray24 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier23 };
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray24, classLoader25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withClassLoader(classLoader28);
        com.fasterxml.jackson.databind.type.ClassStack classStack30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withModifier(typeModifier32);
        typeFactory33.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory33.constructType((java.lang.reflect.Type) javaType35, javaType36);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory27._fromAny(classStack30, (java.lang.reflect.Type) javaType37, typeBindings38);
        com.fasterxml.jackson.databind.type.TypeParser typeParser40 = typeFactory27._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier41 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray42 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier41 };
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser40, typeModifierArray42, classLoader43);
        java.lang.ClassLoader classLoader45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray42, classLoader45);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray42);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        com.fasterxml.jackson.databind.type.TypeParser typeParser51 = typeFactory48._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier52 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray53 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier52 };
        java.lang.ClassLoader classLoader54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser51, typeModifierArray53, classLoader54);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray71 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier70 };
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray71, classLoader72);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = typeFactory74.withClassLoader(classLoader75);
        com.fasterxml.jackson.databind.type.ClassStack classStack77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier79 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory80 = typeFactory78.withModifier(typeModifier79);
        typeFactory80.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType82 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType83 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType84 = typeFactory80.constructType((java.lang.reflect.Type) javaType82, javaType83);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings85 = null;
        com.fasterxml.jackson.databind.JavaType javaType86 = typeFactory74._fromAny(classStack77, (java.lang.reflect.Type) javaType84, typeBindings85);
        com.fasterxml.jackson.databind.type.TypeParser typeParser87 = typeFactory74._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier88 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray89 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier88 };
        java.lang.ClassLoader classLoader90 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory91 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser87, typeModifierArray89, classLoader90);
        java.lang.ClassLoader classLoader92 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory93 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray89, classLoader92);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory94 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser51, typeModifierArray89);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory95 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser4, typeModifierArray89);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory96 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeModifierArray6);
        org.junit.Assert.assertArrayEquals(typeModifierArray6, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeModifierArray24);
        org.junit.Assert.assertArrayEquals(typeModifierArray24, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(typeParser40);
        org.junit.Assert.assertNotNull(typeModifierArray42);
        org.junit.Assert.assertArrayEquals(typeModifierArray42, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNotNull(typeParser51);
        org.junit.Assert.assertNotNull(typeModifierArray53);
        org.junit.Assert.assertArrayEquals(typeModifierArray53, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeModifierArray71);
        org.junit.Assert.assertArrayEquals(typeModifierArray71, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory74);
        org.junit.Assert.assertNotNull(typeFactory76);
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNotNull(typeFactory80);
        org.junit.Assert.assertNotNull(javaType82);
        org.junit.Assert.assertNotNull(javaType83);
        org.junit.Assert.assertNotNull(javaType84);
        org.junit.Assert.assertNotNull(javaType86);
        org.junit.Assert.assertNotNull(typeParser87);
        org.junit.Assert.assertNotNull(typeModifierArray89);
        org.junit.Assert.assertArrayEquals(typeModifierArray89, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withModifier(typeModifier16);
        typeFactory17.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap19 = typeFactory17._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withModifier(typeModifier22);
        typeFactory23.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory23.constructType((java.lang.reflect.Type) javaType25, javaType26);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory17._fromAny(classStack20, (java.lang.reflect.Type) javaType27, typeBindings28);
        com.fasterxml.jackson.databind.type.ArrayType arrayType30 = typeFactory0.constructArrayType(javaType27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory0._parser;
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = typeFactory0.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(arrayType30);
        org.junit.Assert.assertNotNull(typeParser31);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        typeFactory3.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory3._parser;
        java.lang.ClassLoader classLoader6 = typeFactory3.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray21 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier20 };
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser19, typeModifierArray21, classLoader22);
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray21, classLoader24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertNotNull(typeModifierArray21);
        org.junit.Assert.assertArrayEquals(typeModifierArray21, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withModifier(typeModifier19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = typeFactory16.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory19._fromAny(classStack22, (java.lang.reflect.Type) javaType29, typeBindings30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray33);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory35.withClassLoader(classLoader36);
        com.fasterxml.jackson.databind.type.ClassStack classStack38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeFactory39.withModifier(typeModifier40);
        typeFactory41.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType43 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType44 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory41.constructType((java.lang.reflect.Type) javaType43, javaType44);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory35._fromAny(classStack38, (java.lang.reflect.Type) javaType45, typeBindings46);
        com.fasterxml.jackson.databind.type.TypeParser typeParser48 = typeFactory35._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier49 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray50 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier49 };
        java.lang.ClassLoader classLoader51 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser48, typeModifierArray50, classLoader51);
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray50, classLoader53);
        java.lang.ClassLoader classLoader55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray50, classLoader55);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray57 = typeFactory56._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType58 = typeFactory56._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType44);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(typeParser48);
        org.junit.Assert.assertNotNull(typeModifierArray50);
        org.junit.Assert.assertArrayEquals(typeModifierArray50, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray57);
        org.junit.Assert.assertArrayEquals(typeModifierArray57, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType58);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30, classLoader33);
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory34._modifiers;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.type.ClassStack classStack43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withModifier(typeModifier45);
        typeFactory46.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType48 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType49 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory46.constructType((java.lang.reflect.Type) javaType48, javaType49);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory40._fromAny(classStack43, (java.lang.reflect.Type) javaType50, typeBindings51);
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray54);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray71 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier70 };
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray71, classLoader72);
        java.lang.ClassLoader classLoader74 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray71, classLoader74);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray71);
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory76.withClassLoader(classLoader77);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass80 = typeFactory78.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeModifierArray54);
        org.junit.Assert.assertArrayEquals(typeModifierArray54, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeModifierArray71);
        org.junit.Assert.assertArrayEquals(typeModifierArray71, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory78);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory5.constructType((java.lang.reflect.Type) simpleType6, javaType7);
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory5.withClassLoader(classLoader9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory10.constructFromCanonical("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<>' (remaining: '>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        boolean boolean4 = typeBindings0.hasUnbound("");
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList5 = typeBindings0.getTypeParameters();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(javaTypeList5);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.JavaType javaType8 = typeBindings0.getBoundType(0);
        boolean boolean10 = typeBindings0.hasUnbound("");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withModifier(typeModifier16);
        typeFactory17.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap19 = typeFactory17._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withModifier(typeModifier22);
        typeFactory23.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory23.constructType((java.lang.reflect.Type) javaType25, javaType26);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory17._fromAny(classStack20, (java.lang.reflect.Type) javaType27, typeBindings28);
        com.fasterxml.jackson.databind.type.ArrayType arrayType30 = typeFactory0.constructArrayType(javaType27);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory0.withClassLoader(classLoader31);
        com.fasterxml.jackson.databind.type.TypeParser typeParser33 = typeFactory32._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = typeFactory32.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(arrayType30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeParser33);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory5._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory5.withModifier(typeModifier15);
        java.lang.Class<?> wildcardClass18 = typeFactory5._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = typeFactory5._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(typeModifierArray19);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory5._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory5.withModifier(typeModifier15);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = typeFactory16._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(typeModifierArray17);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory2.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = typeFactory21._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNull(typeModifierArray22);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = typeFactory32.findClass("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        java.lang.Class<?> wildcardClass8 = typeFactory4._findPrimitive("<>");
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory4.withClassLoader(classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory4.withClassLoader(classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory4.withClassLoader(classLoader14);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory4.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory2._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory7._parser;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory7.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withClassLoader(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withModifier(typeModifier17);
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withClassLoader(classLoader19);
        java.lang.ClassLoader classLoader21 = typeFactory20.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory20._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.ClassStack classStack26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withModifier(typeModifier28);
        typeFactory29.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory29.constructType((java.lang.reflect.Type) javaType31, javaType32);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = typeFactory23._fromAny(classStack26, (java.lang.reflect.Type) javaType33, typeBindings34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withClassLoader(classLoader38);
        com.fasterxml.jackson.databind.type.ClassStack classStack40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withModifier(typeModifier42);
        typeFactory43.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType45 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType46 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory43.constructType((java.lang.reflect.Type) javaType45, javaType46);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings48 = null;
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory37._fromAny(classStack40, (java.lang.reflect.Type) javaType47, typeBindings48);
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier51 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray52 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier51 };
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray52, classLoader53);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray52);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader71 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = typeFactory70.withClassLoader(classLoader71);
        com.fasterxml.jackson.databind.type.TypeParser typeParser73 = typeFactory70._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = typeFactory74.withClassLoader(classLoader75);
        com.fasterxml.jackson.databind.type.TypeParser typeParser77 = typeFactory74._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier78 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray79 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier78 };
        java.lang.ClassLoader classLoader80 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory81 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser77, typeModifierArray79, classLoader80);
        java.lang.ClassLoader classLoader82 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser73, typeModifierArray79, classLoader82);
        java.lang.ClassLoader classLoader84 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory85 = typeFactory83.withClassLoader(classLoader84);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray86 = typeFactory83._modifiers;
        java.lang.ClassLoader classLoader87 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory88 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray86, classLoader87);
        java.lang.ClassLoader classLoader89 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory90 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray86, classLoader89);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory91 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray86);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory92 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray86);
        com.fasterxml.jackson.databind.type.TypeParser typeParser93 = typeFactory92._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray14);
        org.junit.Assert.assertArrayEquals(typeModifierArray14, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(javaType32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeModifierArray52);
        org.junit.Assert.assertArrayEquals(typeModifierArray52, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNotNull(typeFactory72);
        org.junit.Assert.assertNotNull(typeParser73);
        org.junit.Assert.assertNotNull(typeFactory74);
        org.junit.Assert.assertNotNull(typeFactory76);
        org.junit.Assert.assertNotNull(typeParser77);
        org.junit.Assert.assertNotNull(typeModifierArray79);
        org.junit.Assert.assertArrayEquals(typeModifierArray79, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory85);
        org.junit.Assert.assertNotNull(typeModifierArray86);
        org.junit.Assert.assertArrayEquals(typeModifierArray86, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser93);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap44 = typeFactory41._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory41.withModifier(typeModifier45);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap44);
        org.junit.Assert.assertNotNull(typeFactory46);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        typeFactory17.clearCache();
        typeFactory17.clearCache();
        java.lang.ClassLoader classLoader20 = typeFactory17._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(classLoader20);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory7._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory7._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory7._unknownType();
        java.lang.ClassLoader classLoader11 = typeFactory7._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.ClassStack classStack18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        typeFactory21.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory21.constructType((java.lang.reflect.Type) javaType23, javaType24);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory15._fromAny(classStack18, (java.lang.reflect.Type) javaType25, typeBindings26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48, classLoader49);
        java.lang.ClassLoader classLoader51 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray48, classLoader51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory53.withModifier(typeModifier54);
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory53.withClassLoader(classLoader56);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray58 = typeFactory53._modifiers;
        java.lang.ClassLoader classLoader59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray58, classLoader59);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType62 = typeFactory60.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeModifierArray58);
        org.junit.Assert.assertArrayEquals(typeModifierArray58, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = typeBindings0.withUnboundVariable("<>");
        java.lang.String str9 = typeBindings0.toString();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList10 = typeBindings0.getTypeParameters();
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList11 = typeBindings0.getTypeParameters();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<>" + "'", str9, "<>");
        org.junit.Assert.assertNotNull(javaTypeList10);
        org.junit.Assert.assertNotNull(javaTypeList11);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory19._fromAny(classStack22, (java.lang.reflect.Type) javaType29, typeBindings30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48, classLoader49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray53 = null;
        java.lang.ClassLoader classLoader54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray53, classLoader54);
        java.lang.ClassLoader classLoader56 = typeFactory55.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(classLoader56);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory0.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.ClassStack classStack18 = null;
        java.lang.reflect.ParameterizedType parameterizedType19 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings20 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeBindings20.getBoundType((int) ' ');
        java.lang.String str23 = typeBindings20.toString();
        com.fasterxml.jackson.databind.JavaType javaType25 = typeBindings20.findBoundType("<>");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory17._fromParamType(classStack18, parameterizedType19, typeBindings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeBindings20);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<>" + "'", str23, "<>");
        org.junit.Assert.assertNull(javaType25);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        java.lang.Class<?> wildcardClass15 = typeFactory5._findPrimitive("<>");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory5.withModifier(typeModifier16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory5.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeFactory17);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass15 = typeFactory0._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass17 = typeFactory0._findPrimitive("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withModifier(typeModifier9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap11 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory5._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory5.withModifier(typeModifier15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = typeFactory5.classForName("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withClassLoader(classLoader11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser17, typeModifierArray23, classLoader26);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray23);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        com.fasterxml.jackson.databind.type.TypeParser typeParser34 = typeFactory31._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory35.withClassLoader(classLoader36);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = typeFactory35._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier39 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray40 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier39 };
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser38, typeModifierArray40, classLoader41);
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser34, typeModifierArray40, classLoader43);
        java.lang.ClassLoader classLoader45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withClassLoader(classLoader45);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray47 = typeFactory44._modifiers;
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray47, classLoader48);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier50 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray51 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier50 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory53.withClassLoader(classLoader54);
        com.fasterxml.jackson.databind.type.ClassStack classStack56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = typeFactory57.withModifier(typeModifier58);
        typeFactory59.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType61 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType62 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory59.constructType((java.lang.reflect.Type) javaType61, javaType62);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings64 = null;
        com.fasterxml.jackson.databind.JavaType javaType65 = typeFactory53._fromAny(classStack56, (java.lang.reflect.Type) javaType63, typeBindings64);
        com.fasterxml.jackson.databind.type.TypeParser typeParser66 = typeFactory53._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray67 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser66, typeModifierArray67);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader70 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = typeFactory69.withClassLoader(classLoader70);
        com.fasterxml.jackson.databind.type.ClassStack classStack72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier74 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = typeFactory73.withModifier(typeModifier74);
        typeFactory75.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType77 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType78 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType79 = typeFactory75.constructType((java.lang.reflect.Type) javaType77, javaType78);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings80 = null;
        com.fasterxml.jackson.databind.JavaType javaType81 = typeFactory69._fromAny(classStack72, (java.lang.reflect.Type) javaType79, typeBindings80);
        com.fasterxml.jackson.databind.type.TypeParser typeParser82 = typeFactory69._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier83 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray84 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier83 };
        java.lang.ClassLoader classLoader85 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory86 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser82, typeModifierArray84, classLoader85);
        java.lang.ClassLoader classLoader87 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory88 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser66, typeModifierArray84, classLoader87);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier89 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray90 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier89 };
        java.lang.ClassLoader classLoader91 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory92 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser66, typeModifierArray90, classLoader91);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory93 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray90);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray94 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory95 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray94);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory96 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser9, typeModifierArray94);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory97 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray94);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeParser34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeParser38);
        org.junit.Assert.assertNotNull(typeModifierArray40);
        org.junit.Assert.assertArrayEquals(typeModifierArray40, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeModifierArray47);
        org.junit.Assert.assertArrayEquals(typeModifierArray47, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray51);
        org.junit.Assert.assertArrayEquals(typeModifierArray51, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(javaType61);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(typeParser66);
        org.junit.Assert.assertNotNull(typeModifierArray67);
        org.junit.Assert.assertArrayEquals(typeModifierArray67, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory69);
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNotNull(typeFactory73);
        org.junit.Assert.assertNotNull(typeFactory75);
        org.junit.Assert.assertNotNull(javaType77);
        org.junit.Assert.assertNotNull(javaType78);
        org.junit.Assert.assertNotNull(javaType79);
        org.junit.Assert.assertNotNull(javaType81);
        org.junit.Assert.assertNotNull(typeParser82);
        org.junit.Assert.assertNotNull(typeModifierArray84);
        org.junit.Assert.assertArrayEquals(typeModifierArray84, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray90);
        org.junit.Assert.assertArrayEquals(typeModifierArray90, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray94);
        org.junit.Assert.assertArrayEquals(typeModifierArray94, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory2._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier14 };
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray15, classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory17._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withClassLoader(classLoader24);
        com.fasterxml.jackson.databind.type.TypeParser typeParser26 = typeFactory23._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray28 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier27 };
        java.lang.ClassLoader classLoader29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser26, typeModifierArray28, classLoader29);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser22, typeModifierArray28, classLoader31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeParser typeParser37 = typeFactory34._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeFactory38.withClassLoader(classLoader39);
        com.fasterxml.jackson.databind.type.TypeParser typeParser41 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.type.TypeParser typeParser45 = typeFactory42._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier46 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray47 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier46 };
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser45, typeModifierArray47, classLoader48);
        java.lang.ClassLoader classLoader50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser41, typeModifierArray47, classLoader50);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser37, typeModifierArray47);
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray47, classLoader53);
        java.lang.Class<?> wildcardClass56 = typeFactory54._findPrimitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass58 = typeFactory54.findClass("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeParser26);
        org.junit.Assert.assertNotNull(typeModifierArray28);
        org.junit.Assert.assertArrayEquals(typeModifierArray28, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeParser37);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeParser41);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeParser45);
        org.junit.Assert.assertNotNull(typeModifierArray47);
        org.junit.Assert.assertArrayEquals(typeModifierArray47, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(wildcardClass56);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30, classLoader33);
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory34._modifiers;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray37, classLoader38);
        java.lang.ClassLoader classLoader40 = typeFactory39.getClassLoader();
        typeFactory39.clearCache();
        java.lang.ClassLoader classLoader42 = typeFactory39.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray43 = typeFactory39._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(classLoader40);
        org.junit.Assert.assertNull(classLoader42);
        org.junit.Assert.assertNotNull(typeModifierArray43);
        org.junit.Assert.assertArrayEquals(typeModifierArray43, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withModifier(typeModifier9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap11 = typeFactory10._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap11);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory6.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        boolean boolean4 = typeBindings0.hasUnbound("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("<>");
        boolean boolean8 = typeBindings6.hasUnbound("<>");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings10 = typeBindings6.withUnboundVariable("");
        com.fasterxml.jackson.databind.JavaType javaType12 = typeBindings10.findBoundType("<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(typeBindings10);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2.constructType((java.lang.reflect.Type) javaType4, javaType5);
        java.lang.ClassLoader classLoader7 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory2._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory2.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withModifier(typeModifier19);
        java.lang.ClassLoader classLoader21 = typeFactory16.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(classLoader21);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier14 };
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray15, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withModifier(typeModifier23);
        typeFactory24.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory24.constructType((java.lang.reflect.Type) javaType26, javaType27);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory18._fromAny(classStack21, (java.lang.reflect.Type) javaType28, typeBindings29);
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier32 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier32 };
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser31, typeModifierArray33, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray33, classLoader36);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier39 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray40 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier39 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser38, typeModifierArray40);
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType43 = typeFactory41.constructArrayType(javaType42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser38);
        org.junit.Assert.assertNotNull(typeModifierArray40);
        org.junit.Assert.assertArrayEquals(typeModifierArray40, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withClassLoader(classLoader10);
        java.lang.ClassLoader classLoader12 = typeFactory11.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withClassLoader(classLoader12);
        typeFactory13.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory13._parser;
        java.lang.ClassLoader classLoader16 = typeFactory13.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory13._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withClassLoader(classLoader23);
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier30 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier30 };
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray31, classLoader32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser25, typeModifierArray31, classLoader34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser17, typeModifierArray31);
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray31, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.type.ClassStack classStack43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withModifier(typeModifier45);
        typeFactory46.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType48 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType49 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory46.constructType((java.lang.reflect.Type) javaType48, javaType49);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory40._fromAny(classStack43, (java.lang.reflect.Type) javaType50, typeBindings51);
        typeFactory40.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = typeFactory40._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory55.withModifier(typeModifier56);
        typeFactory57.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap59 = typeFactory57._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = typeFactory61.withModifier(typeModifier62);
        typeFactory63.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType67 = typeFactory63.constructType((java.lang.reflect.Type) javaType65, javaType66);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings68 = null;
        com.fasterxml.jackson.databind.JavaType javaType69 = typeFactory57._fromAny(classStack60, (java.lang.reflect.Type) javaType67, typeBindings68);
        com.fasterxml.jackson.databind.type.ArrayType arrayType70 = typeFactory40.constructArrayType(javaType67);
        java.lang.ClassLoader classLoader71 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = typeFactory40.withClassLoader(classLoader71);
        com.fasterxml.jackson.databind.type.TypeParser typeParser73 = typeFactory72._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader75 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = typeFactory74.withClassLoader(classLoader75);
        com.fasterxml.jackson.databind.type.TypeParser typeParser77 = typeFactory74._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier78 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray79 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier78 };
        java.lang.ClassLoader classLoader80 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory81 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser77, typeModifierArray79, classLoader80);
        java.lang.ClassLoader classLoader82 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory83 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser73, typeModifierArray79, classLoader82);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray79);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNull(classLoader16);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNull(typeModifierArray54);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(typeFactory63);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType67);
        org.junit.Assert.assertNotNull(javaType69);
        org.junit.Assert.assertNotNull(arrayType70);
        org.junit.Assert.assertNotNull(typeFactory72);
        org.junit.Assert.assertNotNull(typeParser73);
        org.junit.Assert.assertNotNull(typeFactory74);
        org.junit.Assert.assertNotNull(typeFactory76);
        org.junit.Assert.assertNotNull(typeParser77);
        org.junit.Assert.assertNotNull(typeModifierArray79);
        org.junit.Assert.assertArrayEquals(typeModifierArray79, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory2.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory0.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap18 = typeFactory17._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap18);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19, classLoader20);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray19);
        org.junit.Assert.assertArrayEquals(typeModifierArray19, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory2.withModifier(typeModifier9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNull(typeModifierArray8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.SimpleType simpleType16 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        java.lang.Class<?> wildcardClass17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType16);
        com.fasterxml.jackson.databind.type.ArrayType arrayType18 = typeFactory2.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType16);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = typeFactory2._modifiers;
        typeFactory2.clearCache();
        typeFactory2.clearCache();
        java.lang.Class<?> wildcardClass23 = typeFactory2._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNotNull(simpleType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(arrayType18);
        org.junit.Assert.assertNull(typeModifierArray19);
        org.junit.Assert.assertNull(wildcardClass23);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory2._parser;
        java.lang.ClassLoader classLoader5 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withModifier(typeModifier2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withClassLoader(classLoader4);
        java.lang.ClassLoader classLoader6 = typeFactory5.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory5._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        com.fasterxml.jackson.databind.type.ClassStack classStack19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory20.withModifier(typeModifier21);
        typeFactory22.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory22.constructType((java.lang.reflect.Type) javaType24, javaType25);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory16._fromAny(classStack19, (java.lang.reflect.Type) javaType26, typeBindings27);
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier30 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier30 };
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray31, classLoader32);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.ClassStack classStack37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeFactory38.withModifier(typeModifier39);
        typeFactory40.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType44 = typeFactory40.constructType((java.lang.reflect.Type) javaType42, javaType43);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings45 = null;
        com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory34._fromAny(classStack37, (java.lang.reflect.Type) javaType44, typeBindings45);
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = typeFactory34._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier48 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray49 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier48 };
        java.lang.ClassLoader classLoader50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser47, typeModifierArray49, classLoader50);
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser29, typeModifierArray49, classLoader52);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray49);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = typeFactory54.withModifier(typeModifier55);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray57 = typeFactory54._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray57);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertNotNull(typeModifierArray31);
        org.junit.Assert.assertArrayEquals(typeModifierArray31, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType44);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(typeParser47);
        org.junit.Assert.assertNotNull(typeModifierArray49);
        org.junit.Assert.assertArrayEquals(typeModifierArray49, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeModifierArray57);
        org.junit.Assert.assertArrayEquals(typeModifierArray57, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass4 = typeFactory0._findPrimitive("");
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = typeFactory6._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType15 = typeFactory13.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType14);
        java.lang.ClassLoader classLoader16 = typeFactory13._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        java.lang.ClassLoader classLoader20 = typeFactory17.getClassLoader();
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory17.withClassLoader(classLoader21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.type.ArrayType arrayType30 = typeFactory22.constructArrayType(javaType27);
        java.lang.Class<?> wildcardClass32 = typeFactory22._findPrimitive("<>");
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory22._unknownType();
        java.lang.Class<?> wildcardClass34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType33);
        java.lang.Class<?> wildcardClass35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType33);
        com.fasterxml.jackson.databind.type.ArrayType arrayType36 = typeFactory13.constructArrayType(javaType33);
        java.lang.ClassLoader classLoader37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = typeFactory13.withClassLoader(classLoader37);
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory13._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(arrayType15);
        org.junit.Assert.assertNull(classLoader16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNull(classLoader20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(arrayType30);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(arrayType36);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNotNull(javaType39);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory41.withModifier(typeModifier44);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = typeFactory41.withModifier(typeModifier46);
        java.lang.ClassLoader classLoader48 = typeFactory47.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNull(classLoader48);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeFactory41.withModifier(typeModifier44);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap46 = typeFactory41._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap46);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeParser5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
        int int1 = typeBindings0.size();
        int int2 = typeBindings0.size();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory16.withModifier(typeModifier19);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory16.withModifier(typeModifier21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap23 = typeFactory16._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap23);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser36 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier37 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray38 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier37 };
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser36, typeModifierArray38, classLoader39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.type.ClassStack classStack45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withModifier(typeModifier47);
        typeFactory48.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType50 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType51 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory48.constructType((java.lang.reflect.Type) javaType50, javaType51);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings53 = null;
        com.fasterxml.jackson.databind.JavaType javaType54 = typeFactory42._fromAny(classStack45, (java.lang.reflect.Type) javaType52, typeBindings53);
        com.fasterxml.jackson.databind.type.TypeParser typeParser55 = typeFactory42._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray71 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier70 };
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray71, classLoader72);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser55, typeModifierArray71);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray71);
        com.fasterxml.jackson.databind.type.TypeParser typeParser76 = typeFactory75._parser;
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory75.withClassLoader(classLoader77);
        com.fasterxml.jackson.databind.JavaType javaType79 = typeFactory75._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeParser36);
        org.junit.Assert.assertNotNull(typeModifierArray38);
        org.junit.Assert.assertArrayEquals(typeModifierArray38, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType51);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(javaType54);
        org.junit.Assert.assertNotNull(typeParser55);
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeModifierArray71);
        org.junit.Assert.assertArrayEquals(typeModifierArray71, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser76);
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNotNull(javaType79);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        java.lang.Class<?> wildcardClass15 = typeFactory5._findPrimitive("<>");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory5.withModifier(typeModifier16);
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory5._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(javaType18);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30, classLoader33);
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory34._modifiers;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.type.TypeParser typeParser43 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withClassLoader(classLoader45);
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = typeFactory44._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier48 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray49 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier48 };
        java.lang.ClassLoader classLoader50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser47, typeModifierArray49, classLoader50);
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser43, typeModifierArray49, classLoader52);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = typeFactory53._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray54);
        java.lang.ClassLoader classLoader58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass59 = typeFactory55.classForName("<>", false, classLoader58);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeParser43);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeParser47);
        org.junit.Assert.assertNotNull(typeModifierArray49);
        org.junit.Assert.assertArrayEquals(typeModifierArray49, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray54);
        org.junit.Assert.assertArrayEquals(typeModifierArray54, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory6._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory6._typeCache;
        typeFactory6.clearCache();
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory6.withClassLoader(classLoader11);
        com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory12._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(javaType13);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withModifier(typeModifier9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        boolean boolean4 = typeBindings0.hasUnbound("");
        com.fasterxml.jackson.databind.JavaType javaType6 = typeBindings0.findBoundType("<>");
        com.fasterxml.jackson.databind.JavaType javaType8 = typeBindings0.getBoundType((int) (byte) 100);
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory5._unknownType();
        typeFactory5.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory5.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.ClassStack classStack17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withModifier(typeModifier19);
        typeFactory20.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory20.constructType((java.lang.reflect.Type) javaType22, javaType23);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory14._fromAny(classStack17, (java.lang.reflect.Type) javaType24, typeBindings25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray29 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier28 };
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser27, typeModifierArray29, classLoader30);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeFactory47.withClassLoader(classLoader48);
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory47._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeFactory51._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier55 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray56 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier55 };
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser54, typeModifierArray56, classLoader57);
        java.lang.ClassLoader classLoader59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray56, classLoader59);
        java.lang.ClassLoader classLoader61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withClassLoader(classLoader61);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray63 = typeFactory60._modifiers;
        java.lang.ClassLoader classLoader64 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray63, classLoader64);
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray63, classLoader66);
        java.lang.ClassLoader classLoader68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = typeFactory67.withClassLoader(classLoader68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass71 = typeFactory69.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeModifierArray29);
        org.junit.Assert.assertArrayEquals(typeModifierArray29, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeParser54);
        org.junit.Assert.assertNotNull(typeModifierArray56);
        org.junit.Assert.assertArrayEquals(typeModifierArray56, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeModifierArray63);
        org.junit.Assert.assertArrayEquals(typeModifierArray63, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory69);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory0._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap18 = typeFactory16._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = typeFactory16.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap18);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        int int1 = typeBindings0.size();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType15 = typeFactory13.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType14);
        java.lang.ClassLoader classLoader16 = typeFactory13._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        java.lang.ClassLoader classLoader20 = typeFactory17.getClassLoader();
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory17.withClassLoader(classLoader21);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.type.ArrayType arrayType30 = typeFactory22.constructArrayType(javaType27);
        java.lang.Class<?> wildcardClass32 = typeFactory22._findPrimitive("<>");
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory22._unknownType();
        java.lang.Class<?> wildcardClass34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType33);
        java.lang.Class<?> wildcardClass35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType33);
        com.fasterxml.jackson.databind.type.ArrayType arrayType36 = typeFactory13.constructArrayType(javaType33);
        java.lang.ClassLoader classLoader37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = typeFactory13.withClassLoader(classLoader37);
        java.lang.ClassLoader classLoader39 = typeFactory13._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(arrayType15);
        org.junit.Assert.assertNull(classLoader16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNull(classLoader20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(arrayType30);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(arrayType36);
        org.junit.Assert.assertNotNull(typeFactory38);
        org.junit.Assert.assertNull(classLoader39);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        boolean boolean4 = typeBindings0.hasUnbound("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("<>");
        boolean boolean8 = typeBindings6.hasUnbound("");
        boolean boolean9 = typeBindings6.isEmpty();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        java.lang.Class<?> wildcardClass15 = typeFactory5._findPrimitive("<>");
        java.lang.Class<?> wildcardClass17 = typeFactory5._findPrimitive("hi!");
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory5._unknownType();
        typeFactory5.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(javaType18);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withModifier(typeModifier9);
        typeFactory10.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap12 = typeFactory10._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory16.constructType((java.lang.reflect.Type) javaType18, javaType19);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory10._fromAny(classStack13, (java.lang.reflect.Type) javaType20, typeBindings21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory2.constructArrayType(javaType22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory2.constructFromCanonical("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<>' (remaining: '>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = typeFactory7.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory7._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(typeModifierArray11);
        org.junit.Assert.assertArrayEquals(typeModifierArray11, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory2._modifiers;
        typeFactory2.clearCache();
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = typeFactory2.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNull(typeModifierArray18);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = typeFactory4._classLoader;
        java.lang.ClassLoader classLoader8 = typeFactory4._classLoader;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory4.classForName("<>", false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory2.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        java.lang.reflect.GenericArrayType genericArrayType23 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory2._fromArrayType(classStack22, genericArrayType23, typeBindings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(typeParser21);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        java.lang.ClassLoader classLoader17 = typeFactory16._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(classLoader17);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader8 = typeFactory4._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory4._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory19._fromAny(classStack22, (java.lang.reflect.Type) javaType29, typeBindings30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier33 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray34 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier33 };
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray34, classLoader35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withClassLoader(classLoader38);
        com.fasterxml.jackson.databind.type.ClassStack classStack40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withModifier(typeModifier42);
        typeFactory43.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType45 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType46 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType47 = typeFactory43.constructType((java.lang.reflect.Type) javaType45, javaType46);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings48 = null;
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory37._fromAny(classStack40, (java.lang.reflect.Type) javaType47, typeBindings48);
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier51 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray52 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier51 };
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray52, classLoader53);
        java.lang.ClassLoader classLoader55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray52, classLoader55);
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray52, classLoader57);
        java.lang.ClassLoader classLoader59 = typeFactory58._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray60 = typeFactory58._modifiers;
        java.lang.ClassLoader classLoader61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory58.withClassLoader(classLoader61);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeModifierArray34);
        org.junit.Assert.assertArrayEquals(typeModifierArray34, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(javaType47);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeModifierArray52);
        org.junit.Assert.assertArrayEquals(typeModifierArray52, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNull(classLoader59);
        org.junit.Assert.assertNotNull(typeModifierArray60);
        org.junit.Assert.assertArrayEquals(typeModifierArray60, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory62);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2.constructType((java.lang.reflect.Type) javaType4, javaType5);
        java.lang.ClassLoader classLoader7 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withModifier(typeModifier10);
        typeFactory11.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory11.constructType((java.lang.reflect.Type) javaType13, javaType14);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory11._unknownType();
        java.lang.ClassLoader classLoader17 = typeFactory11._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        com.fasterxml.jackson.databind.type.ClassStack classStack22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeFactory23.withModifier(typeModifier24);
        typeFactory25.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType29 = typeFactory25.constructType((java.lang.reflect.Type) javaType27, javaType28);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory19._fromAny(classStack22, (java.lang.reflect.Type) javaType29, typeBindings30);
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory19._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48, classLoader49);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser32, typeModifierArray48);
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray48, classLoader52);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray54, classLoader55);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = typeFactory57.withClassLoader(classLoader58);
        com.fasterxml.jackson.databind.type.ClassStack classStack60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier62 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory63 = typeFactory61.withModifier(typeModifier62);
        typeFactory63.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType67 = typeFactory63.constructType((java.lang.reflect.Type) javaType65, javaType66);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings68 = null;
        com.fasterxml.jackson.databind.JavaType javaType69 = typeFactory57._fromAny(classStack60, (java.lang.reflect.Type) javaType67, typeBindings68);
        com.fasterxml.jackson.databind.type.TypeParser typeParser70 = typeFactory57._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = typeFactory71.withClassLoader(classLoader72);
        com.fasterxml.jackson.databind.type.TypeParser typeParser74 = typeFactory71._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader76 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory77 = typeFactory75.withClassLoader(classLoader76);
        com.fasterxml.jackson.databind.type.TypeParser typeParser78 = typeFactory75._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier79 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray80 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier79 };
        java.lang.ClassLoader classLoader81 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory82 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser78, typeModifierArray80, classLoader81);
        java.lang.ClassLoader classLoader83 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser74, typeModifierArray80, classLoader83);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray85 = typeFactory84._modifiers;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory86 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser70, typeModifierArray85);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory87 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser18, typeModifierArray85);
        java.lang.ClassLoader classLoader88 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory89 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser8, typeModifierArray85, classLoader88);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(javaType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNull(classLoader17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType29);
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(typeParser32);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray54);
        org.junit.Assert.assertArrayEquals(typeModifierArray54, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(typeFactory63);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType67);
        org.junit.Assert.assertNotNull(javaType69);
        org.junit.Assert.assertNotNull(typeParser70);
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNotNull(typeFactory73);
        org.junit.Assert.assertNotNull(typeParser74);
        org.junit.Assert.assertNotNull(typeFactory75);
        org.junit.Assert.assertNotNull(typeFactory77);
        org.junit.Assert.assertNotNull(typeParser78);
        org.junit.Assert.assertNotNull(typeModifierArray80);
        org.junit.Assert.assertArrayEquals(typeModifierArray80, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray85);
        org.junit.Assert.assertArrayEquals(typeModifierArray85, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withModifier(typeModifier4);
        java.lang.Class<?> wildcardClass7 = typeFactory5._findPrimitive("");
        java.lang.ClassLoader classLoader8 = typeFactory5._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory5.findClass("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(classLoader8);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory4._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = typeFactory12._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier16 };
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser15, typeModifierArray17, classLoader18);
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray17, classLoader20);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray22 = typeFactory21._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory21._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory21._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory4.moreSpecificType(javaType24, javaType25);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser15);
        org.junit.Assert.assertNotNull(typeModifierArray17);
        org.junit.Assert.assertArrayEquals(typeModifierArray17, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeModifierArray22);
        org.junit.Assert.assertArrayEquals(typeModifierArray22, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory6._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory6._parser;
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory6._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory9._unknownType();
        java.lang.ClassLoader classLoader11 = typeFactory9._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.ClassStack classStack11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14.constructType((java.lang.reflect.Type) javaType16, javaType17);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory8._fromAny(classStack11, (java.lang.reflect.Type) javaType18, typeBindings19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.ClassStack classStack29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withModifier(typeModifier31);
        typeFactory32.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory32.constructType((java.lang.reflect.Type) javaType34, javaType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory26._fromAny(classStack29, (java.lang.reflect.Type) javaType36, typeBindings37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray41, classLoader42);
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray41, classLoader44);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeFactory47.withClassLoader(classLoader48);
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory47._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier51 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray52 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier51 };
        java.lang.ClassLoader classLoader53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray52, classLoader53);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory55.withClassLoader(classLoader56);
        com.fasterxml.jackson.databind.type.ClassStack classStack58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier60 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory61 = typeFactory59.withModifier(typeModifier60);
        typeFactory61.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType63 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = typeFactory61.constructType((java.lang.reflect.Type) javaType63, javaType64);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings66 = null;
        com.fasterxml.jackson.databind.JavaType javaType67 = typeFactory55._fromAny(classStack58, (java.lang.reflect.Type) javaType65, typeBindings66);
        com.fasterxml.jackson.databind.type.TypeParser typeParser68 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier69 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray70 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier69 };
        java.lang.ClassLoader classLoader71 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory72 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser68, typeModifierArray70, classLoader71);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader74 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = typeFactory73.withClassLoader(classLoader74);
        com.fasterxml.jackson.databind.type.ClassStack classStack76 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory77 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier78 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory79 = typeFactory77.withModifier(typeModifier78);
        typeFactory79.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType81 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType82 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType83 = typeFactory79.constructType((java.lang.reflect.Type) javaType81, javaType82);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings84 = null;
        com.fasterxml.jackson.databind.JavaType javaType85 = typeFactory73._fromAny(classStack76, (java.lang.reflect.Type) javaType83, typeBindings84);
        com.fasterxml.jackson.databind.type.TypeParser typeParser86 = typeFactory73._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier87 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray88 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier87 };
        java.lang.ClassLoader classLoader89 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory90 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser86, typeModifierArray88, classLoader89);
        java.lang.ClassLoader classLoader91 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory92 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser68, typeModifierArray88, classLoader91);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory93 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser50, typeModifierArray88);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory94 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray88);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier95 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory96 = typeFactory94.withModifier(typeModifier95);
        java.lang.ClassLoader classLoader97 = typeFactory94._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeModifierArray52);
        org.junit.Assert.assertArrayEquals(typeModifierArray52, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeFactory59);
        org.junit.Assert.assertNotNull(typeFactory61);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType67);
        org.junit.Assert.assertNotNull(typeParser68);
        org.junit.Assert.assertNotNull(typeModifierArray70);
        org.junit.Assert.assertArrayEquals(typeModifierArray70, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory73);
        org.junit.Assert.assertNotNull(typeFactory75);
        org.junit.Assert.assertNotNull(typeFactory77);
        org.junit.Assert.assertNotNull(typeFactory79);
        org.junit.Assert.assertNotNull(javaType81);
        org.junit.Assert.assertNotNull(javaType82);
        org.junit.Assert.assertNotNull(javaType83);
        org.junit.Assert.assertNotNull(javaType85);
        org.junit.Assert.assertNotNull(typeParser86);
        org.junit.Assert.assertNotNull(typeModifierArray88);
        org.junit.Assert.assertArrayEquals(typeModifierArray88, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory96);
        org.junit.Assert.assertNull(classLoader97);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory8.classForName("<>", false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: <>");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier12 };
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser11, typeModifierArray13, classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray13, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory21._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory25._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser24, typeModifierArray30, classLoader33);
        java.lang.ClassLoader classLoader35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory34.withClassLoader(classLoader35);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray37 = typeFactory34._modifiers;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray37, classLoader38);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.type.ClassStack classStack43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory44.withModifier(typeModifier45);
        typeFactory46.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType48 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType49 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory46.constructType((java.lang.reflect.Type) javaType48, javaType49);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings51 = null;
        com.fasterxml.jackson.databind.JavaType javaType52 = typeFactory40._fromAny(classStack43, (java.lang.reflect.Type) javaType50, typeBindings51);
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeFactory40._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray54 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray54);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.type.ClassStack classStack59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier61 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeFactory60.withModifier(typeModifier61);
        typeFactory62.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType64 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType65 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType66 = typeFactory62.constructType((java.lang.reflect.Type) javaType64, javaType65);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = typeFactory56._fromAny(classStack59, (java.lang.reflect.Type) javaType66, typeBindings67);
        com.fasterxml.jackson.databind.type.TypeParser typeParser69 = typeFactory56._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier70 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray71 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier70 };
        java.lang.ClassLoader classLoader72 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory73 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser69, typeModifierArray71, classLoader72);
        java.lang.ClassLoader classLoader74 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory75 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser53, typeModifierArray71, classLoader74);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory76 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray71);
        java.lang.ClassLoader classLoader77 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory78 = typeFactory76.withClassLoader(classLoader77);
        java.lang.ClassLoader classLoader79 = typeFactory78._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeModifierArray13);
        org.junit.Assert.assertArrayEquals(typeModifierArray13, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeModifierArray37);
        org.junit.Assert.assertArrayEquals(typeModifierArray37, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(javaType52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeModifierArray54);
        org.junit.Assert.assertArrayEquals(typeModifierArray54, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNotNull(typeFactory56);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(javaType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertNotNull(javaType68);
        org.junit.Assert.assertNotNull(typeParser69);
        org.junit.Assert.assertNotNull(typeModifierArray71);
        org.junit.Assert.assertArrayEquals(typeModifierArray71, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory78);
        org.junit.Assert.assertNull(classLoader79);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray7 = typeBindings0.typeParameterArray();
        com.fasterxml.jackson.databind.JavaType javaType9 = typeBindings0.getBoundType(100);
        com.fasterxml.jackson.databind.JavaType javaType11 = typeBindings0.findBoundType("<>");
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(javaTypeArray7);
        org.junit.Assert.assertArrayEquals(javaTypeArray7, new com.fasterxml.jackson.databind.JavaType[] {});
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.ClassStack classStack11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14.constructType((java.lang.reflect.Type) javaType16, javaType17);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory8._fromAny(classStack11, (java.lang.reflect.Type) javaType18, typeBindings19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.ClassStack classStack29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withModifier(typeModifier31);
        typeFactory32.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory32.constructType((java.lang.reflect.Type) javaType34, javaType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory26._fromAny(classStack29, (java.lang.reflect.Type) javaType36, typeBindings37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray41, classLoader42);
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray41, classLoader44);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withModifier(typeModifier47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory46.withClassLoader(classLoader49);
        typeFactory50.clearCache();
        com.fasterxml.jackson.databind.type.ClassStack classStack52 = null;
        java.lang.reflect.WildcardType wildcardType53 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings54 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory50._fromWildcard(classStack52, wildcardType53, typeBindings54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeFactory50);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.ClassStack classStack11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withModifier(typeModifier13);
        typeFactory14.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType18 = typeFactory14.constructType((java.lang.reflect.Type) javaType16, javaType17);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory8._fromAny(classStack11, (java.lang.reflect.Type) javaType18, typeBindings19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        com.fasterxml.jackson.databind.type.ClassStack classStack29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withModifier(typeModifier31);
        typeFactory32.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory32.constructType((java.lang.reflect.Type) javaType34, javaType35);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = typeFactory26._fromAny(classStack29, (java.lang.reflect.Type) javaType36, typeBindings37);
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier40 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray41 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier40 };
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser39, typeModifierArray41, classLoader42);
        java.lang.ClassLoader classLoader44 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray41, classLoader44);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray41);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withModifier(typeModifier47);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray49 = typeFactory46._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory46.withModifier(typeModifier50);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory46.withModifier(typeModifier52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = typeFactory46.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(javaType18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeModifierArray41);
        org.junit.Assert.assertArrayEquals(typeModifierArray41, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeModifierArray49);
        org.junit.Assert.assertArrayEquals(typeModifierArray49, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory0.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.ArrayType arrayType13 = typeFactory5.constructArrayType(javaType10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeFactory5._parser;
        java.lang.ClassLoader classLoader15 = typeFactory5.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray16 = typeFactory5._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(arrayType13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNull(typeModifierArray16);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory2._modifiers;
        typeFactory2.clearCache();
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        java.lang.Class<?> wildcardClass20 = typeFactory2._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory0.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory0.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory9._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory9._parser;
        java.lang.ClassLoader classLoader12 = typeFactory9._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory9.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = typeFactory9._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory9._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNull(classLoader12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(typeModifierArray15);
        org.junit.Assert.assertNotNull(typeParser16);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory14._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.TypeParser typeParser21 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier22 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray23 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier22 };
        java.lang.ClassLoader classLoader24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser21, typeModifierArray23, classLoader24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser17, typeModifierArray23, classLoader26);
        java.lang.ClassLoader classLoader28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory27.withClassLoader(classLoader28);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = typeFactory27._modifiers;
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray30, classLoader31);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withModifier(typeModifier33);
        java.lang.ClassLoader classLoader35 = typeFactory32._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeParser21);
        org.junit.Assert.assertNotNull(typeModifierArray23);
        org.junit.Assert.assertArrayEquals(typeModifierArray23, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(classLoader35);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier8 };
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser7, typeModifierArray9, classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray9, classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass17 = typeFactory13._findPrimitive("<>");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(typeModifierArray9);
        org.junit.Assert.assertArrayEquals(typeModifierArray9, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList1 = typeBindings0.getTypeParameters();
        com.fasterxml.jackson.databind.JavaType javaType3 = typeBindings0.getBoundType(100);
        java.lang.Object obj4 = typeBindings0.readResolve();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNotNull(javaTypeList1);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "<>");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "<>");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "<>");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory2.withClassLoader(classLoader20);
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory2.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap24 = typeFactory23._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap24);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier11 };
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray12, classLoader13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.ClassStack classStack18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withModifier(typeModifier20);
        typeFactory21.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory21.constructType((java.lang.reflect.Type) javaType23, javaType24);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory15._fromAny(classStack18, (java.lang.reflect.Type) javaType25, typeBindings26);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray30 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier29 };
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray30, classLoader31);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        com.fasterxml.jackson.databind.type.ClassStack classStack36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withModifier(typeModifier38);
        typeFactory39.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType41 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType42 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory39.constructType((java.lang.reflect.Type) javaType41, javaType42);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory33._fromAny(classStack36, (java.lang.reflect.Type) javaType43, typeBindings44);
        com.fasterxml.jackson.databind.type.TypeParser typeParser46 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier47 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray48 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier47 };
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser46, typeModifierArray48, classLoader49);
        java.lang.ClassLoader classLoader51 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser28, typeModifierArray48, classLoader51);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser10, typeModifierArray48);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory53.withModifier(typeModifier54);
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory53.withClassLoader(classLoader56);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray58 = typeFactory53._modifiers;
        java.lang.ClassLoader classLoader59 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser6, typeModifierArray58, classLoader59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass62 = typeFactory60.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeModifierArray12);
        org.junit.Assert.assertArrayEquals(typeModifierArray12, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeModifierArray30);
        org.junit.Assert.assertArrayEquals(typeModifierArray30, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(javaType42);
        org.junit.Assert.assertNotNull(javaType43);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(typeParser46);
        org.junit.Assert.assertNotNull(typeModifierArray48);
        org.junit.Assert.assertArrayEquals(typeModifierArray48, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNotNull(typeModifierArray58);
        org.junit.Assert.assertArrayEquals(typeModifierArray58, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory2.withClassLoader(classLoader20);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory21.constructFromCanonical("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<>' (remaining: '>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeFactory21);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        java.lang.ClassLoader classLoader15 = typeFactory2._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap16 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap16);
        org.junit.Assert.assertNull(typeModifierArray17);
        org.junit.Assert.assertNotNull(typeParser18);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory0.withModifier(typeModifier15);
        typeFactory16.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory16._parser;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory16.constructFromCanonical("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<>' (remaining: '>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeParser18);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        typeFactory6.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader9 = typeFactory2._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNull(typeModifierArray8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.ClassStack classStack3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        typeFactory6.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6.constructType((java.lang.reflect.Type) javaType8, javaType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory0._fromAny(classStack3, (java.lang.reflect.Type) javaType10, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray15 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier14 };
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray15, classLoader16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        com.fasterxml.jackson.databind.type.ClassStack classStack21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier23 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory24 = typeFactory22.withModifier(typeModifier23);
        typeFactory24.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory24.constructType((java.lang.reflect.Type) javaType26, javaType27);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = typeFactory18._fromAny(classStack21, (java.lang.reflect.Type) javaType28, typeBindings29);
        com.fasterxml.jackson.databind.type.TypeParser typeParser31 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier32 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray33 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier32 };
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser31, typeModifierArray33, classLoader34);
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser13, typeModifierArray33, classLoader36);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = typeFactory37._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier39 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray40 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier39 };
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser38, typeModifierArray40);
        typeFactory41.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType44 = typeFactory41.constructFromCanonical("<>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '<>' (remaining: '>'): Can not locate class '<', problem: <");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeModifierArray15);
        org.junit.Assert.assertArrayEquals(typeModifierArray15, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(typeFactory24);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(javaType30);
        org.junit.Assert.assertNotNull(typeParser31);
        org.junit.Assert.assertNotNull(typeModifierArray33);
        org.junit.Assert.assertArrayEquals(typeModifierArray33, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeParser38);
        org.junit.Assert.assertNotNull(typeModifierArray40);
        org.junit.Assert.assertArrayEquals(typeModifierArray40, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings0 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        com.fasterxml.jackson.databind.JavaType javaType2 = typeBindings0.getBoundType((int) ' ');
        java.lang.String str4 = typeBindings0.getBoundName((int) (short) 100);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings6 = typeBindings0.withUnboundVariable("");
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = typeBindings0.withUnboundVariable("<>");
        int int9 = typeBindings8.size();
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray10 = typeBindings8.typeParameterArray();
        org.junit.Assert.assertNotNull(typeBindings0);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(typeBindings6);
        org.junit.Assert.assertNotNull(typeBindings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeArray10);
        org.junit.Assert.assertArrayEquals(javaTypeArray10, new com.fasterxml.jackson.databind.JavaType[] {});
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        typeFactory8.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory8.constructType((java.lang.reflect.Type) javaType10, javaType11);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory2._fromAny(classStack5, (java.lang.reflect.Type) javaType12, typeBindings13);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap15 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory2.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = typeFactory2._parser;
        java.lang.Class<?> wildcardClass20 = typeFactory2._findPrimitive("hi!");
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory2.withClassLoader(classLoader21);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType11);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeParser18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeFactory22);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory2._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withClassLoader(classLoader5);
        typeFactory6.clearCache();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory6.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier4 };
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser3, typeModifierArray5, classLoader6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = typeFactory7.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory7.withModifier(typeModifier12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNotNull(typeModifierArray5);
        org.junit.Assert.assertArrayEquals(typeModifierArray5, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = typeFactory2._parser;
        java.lang.ClassLoader classLoader5 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory2._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
    }
}

