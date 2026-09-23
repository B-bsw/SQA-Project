package com.fasterxml.jackson.databind.type;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str12 = myTokenizer1.nextToken();
        boolean boolean13 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        myTokenizer1._index = (-1);
        java.lang.String str14 = myTokenizer1._input;
        myTokenizer1._index = (short) 100;
        java.lang.String str17 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer32 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str33 = myTokenizer32.getRemainingInput();
        boolean boolean34 = myTokenizer32.hasMoreTokens();
        int int35 = myTokenizer32._index;
        java.util.Iterator<java.lang.Object> objItor36 = myTokenizer32.asIterator();
        boolean boolean37 = myTokenizer32.hasMoreElements();
        java.lang.IllegalArgumentException illegalArgumentException39 = typeParser30._problem(myTokenizer32, "");
        java.lang.String str40 = myTokenizer32._input;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        int int7 = myTokenizer1._index;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str11 = myTokenizer1._pushbackToken;
        int int12 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.Object obj13 = myTokenizer1.nextElement();
        boolean boolean14 = myTokenizer1.hasMoreElements();
        java.lang.String str15 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (byte) -1;
        myTokenizer1._index = (short) -1;
        java.lang.String str12 = myTokenizer1._input;
        boolean boolean13 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objItor14);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        typeFactory1.clearCache();
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory1.withClassLoader(classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withClassLoader(classLoader16);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap18 = typeFactory17._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap18);
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory19._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory19._unknownType();
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(objLRUMap18);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1._index;
        java.lang.String str9 = myTokenizer1.nextToken("hi!");
        java.lang.String str10 = myTokenizer1.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory30.withClassLoader(classLoader33);
        java.lang.ClassLoader classLoader35 = typeFactory30._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory30._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap37 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory38 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap37);
        java.lang.ClassLoader classLoader39 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeFactory38.withClassLoader(classLoader39);
        java.lang.Class<?> wildcardClass42 = typeFactory38._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType43 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType44 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType45 = typeFactory38.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType43, (com.fasterxml.jackson.databind.JavaType) simpleType44);
        com.fasterxml.jackson.databind.JavaType javaType46 = typeFactory38._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = typeFactory38._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeParser47._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = typeParser47._factory;
        java.lang.ClassLoader classLoader50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory49.withClassLoader(classLoader50);
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap54 = typeFactory51._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap55 = typeFactory51._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = typeFactory30.withCache(objLRUMap55);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(classLoader35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(simpleType43);
        org.junit.Assert.assertNotNull(simpleType44);
        org.junit.Assert.assertNotNull(javaType45);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertNotNull(typeParser47);
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNotNull(typeFactory49);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(objLRUMap54);
        org.junit.Assert.assertNotNull(objLRUMap55);
        org.junit.Assert.assertNotNull(typeFactory56);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory1._modifiers;
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory1.withClassLoader(classLoader10);
        java.lang.ClassLoader classLoader12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory1.withClassLoader(classLoader12);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType16 = typeParser14.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        int int8 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        java.lang.String str12 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withCache(objLRUMap5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap8);
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withClassLoader(classLoader10);
        java.lang.Class<?> wildcardClass13 = typeFactory9._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType15 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory9.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType14, (com.fasterxml.jackson.databind.JavaType) simpleType15);
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory9._unknownType();
        typeFactory9.clearCache();
        typeFactory9.clearCache();
        typeFactory9.clearCache();
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory9.withClassLoader(classLoader21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap23 = typeFactory22._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = typeFactory22._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray25 = new com.fasterxml.jackson.databind.type.TypeModifier[] {};
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7, typeParser24, typeModifierArray25, classLoader26);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        java.lang.ClassLoader classLoader29 = typeFactory28._classLoader;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(simpleType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(javaType17);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(objLRUMap23);
        org.junit.Assert.assertNotNull(typeParser24);
        org.junit.Assert.assertNotNull(typeModifierArray25);
        org.junit.Assert.assertArrayEquals(typeModifierArray25, new com.fasterxml.jackson.databind.type.TypeModifier[] {});
        org.junit.Assert.assertNull(classLoader29);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType15 = typeFactory13.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType14);
        java.lang.Class<?> wildcardClass16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType14);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(arrayType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.lang.String str10 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass36 = typeFactory32._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory32.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType37, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory32._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser41 = typeFactory32._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeParser41._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withModifier(typeModifier43);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap45 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap45);
        java.lang.ClassLoader classLoader47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = typeFactory46.withClassLoader(classLoader47);
        java.lang.Class<?> wildcardClass50 = typeFactory46._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType51 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType52 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType53 = typeFactory46.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType51, (com.fasterxml.jackson.databind.JavaType) simpleType52);
        com.fasterxml.jackson.databind.type.ArrayType arrayType54 = typeFactory42.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType52);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap55);
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap59 = typeFactory56._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory60 = typeFactory42.withCache(objLRUMap59);
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory60);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory62 = typeParser61._factory;
        com.fasterxml.jackson.databind.type.TypeParser typeParser63 = typeParser30.withFactory(typeFactory62);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = typeParser30._factory;
        java.lang.ClassLoader classLoader65 = typeFactory64._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser66 = typeFactory64._parser;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertNotNull(simpleType37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(typeParser41);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory48);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNotNull(simpleType51);
        org.junit.Assert.assertNotNull(simpleType52);
        org.junit.Assert.assertNotNull(javaType53);
        org.junit.Assert.assertNotNull(arrayType54);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNotNull(objLRUMap59);
        org.junit.Assert.assertNotNull(typeFactory60);
        org.junit.Assert.assertNotNull(typeFactory62);
        org.junit.Assert.assertNotNull(typeParser63);
        org.junit.Assert.assertNotNull(typeFactory64);
        org.junit.Assert.assertNull(classLoader65);
        org.junit.Assert.assertNotNull(typeParser66);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str13 = myTokenizer1._input;
        java.lang.String str14 = myTokenizer1.getAllInput();
        int int15 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str10 = myTokenizer1.nextToken("");
        boolean boolean11 = myTokenizer1.hasMoreTokens();
        int int12 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objItor13);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (byte) -1;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.lang.String str11 = myTokenizer1._input;
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        int int10 = myTokenizer1._index;
        java.lang.String str12 = myTokenizer1.nextToken("hi!");
        java.lang.String str13 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._index = (short) 10;
        java.lang.Class<?> wildcardClass7 = myTokenizer1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        myTokenizer1._index = 1;
        myTokenizer1._index = (short) 10;
        int int14 = myTokenizer1._index;
        int int15 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = typeParser30._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeParser30._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeParser30._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer36 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str37 = myTokenizer36.getRemainingInput();
        boolean boolean38 = myTokenizer36.hasMoreTokens();
        int int39 = myTokenizer36._index;
        java.util.Iterator<java.lang.Object> objItor40 = myTokenizer36.asIterator();
        java.util.Iterator<java.lang.Object> objItor41 = myTokenizer36.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass42 = typeParser30.findClass("hi!", myTokenizer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objItor40);
        org.junit.Assert.assertNotNull(objItor41);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap20);
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass25 = typeFactory21._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory21.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType26, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.ArrayType arrayType29 = typeFactory17.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap30);
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap34 = typeFactory31._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory17.withCache(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory5.withCache(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory37);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap39 = typeFactory37._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap39);
        java.lang.ClassLoader classLoader41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory40.withClassLoader(classLoader41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap43 = typeFactory42._typeCache;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(arrayType29);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(objLRUMap34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(objLRUMap39);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(objLRUMap43);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        int int8 = myTokenizer1.countTokens();
        int int9 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        boolean boolean14 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        java.lang.String str17 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 10;
        myTokenizer1._index = 0;
        int int22 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeParser25._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer28 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str29 = myTokenizer28.getRemainingInput();
        java.lang.String str30 = myTokenizer28._pushbackToken;
        int int31 = myTokenizer28.countTokens();
        myTokenizer28._pushbackToken = "";
        boolean boolean34 = myTokenizer28.hasMoreTokens();
        java.lang.String str35 = myTokenizer28.getAllInput();
        java.lang.String str36 = myTokenizer28.getAllInput();
        java.lang.String str37 = myTokenizer28._input;
        java.lang.IllegalArgumentException illegalArgumentException39 = typeParser25._problem(myTokenizer28, "");
        boolean boolean40 = myTokenizer28.hasMoreTokens();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(illegalArgumentException39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        int int8 = myTokenizer1.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        int int10 = myTokenizer1._index;
        int int11 = myTokenizer1._index;
        java.lang.String str12 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj13 = myTokenizer1.nextElement();
        int int14 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str7 = myTokenizer1._input;
        java.lang.Object obj8 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '4';
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType41 = typeParser39.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        java.lang.String str7 = myTokenizer1.getAllInput();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = typeFactory1.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory1._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory1.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classLoader2);
        org.junit.Assert.assertNotNull(objLRUMap3);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory9._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeParser2.withFactory(typeFactory9);
        java.lang.ClassLoader classLoader12 = typeFactory9._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        java.lang.ClassLoader classLoader6 = typeFactory5.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory5.getClassLoader();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory5.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap11);
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass16 = typeFactory12._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType17 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory12.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType17, (com.fasterxml.jackson.databind.JavaType) simpleType18);
        com.fasterxml.jackson.databind.type.TypeParser typeParser20 = typeParser10.withFactory(typeFactory12);
        java.lang.ClassLoader classLoader21 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = typeFactory12.withClassLoader(classLoader21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap23 = typeFactory22._typeCache;
        typeFactory22.clearCache();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(simpleType17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(typeParser20);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(objLRUMap23);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeParser24._factory;
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory25._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType27 = typeFactory25._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory25.withModifier(typeModifier28);
        java.lang.Class<?> wildcardClass31 = typeFactory25._findPrimitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = typeFactory25.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(javaType27);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNull(wildcardClass31);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str18 = myTokenizer17.getRemainingInput();
        boolean boolean19 = myTokenizer17.hasMoreTokens();
        boolean boolean20 = myTokenizer17.hasMoreElements();
        boolean boolean21 = myTokenizer17.hasMoreTokens();
        java.lang.IllegalArgumentException illegalArgumentException23 = typeParser10._problem(myTokenizer17, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer26 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str27 = myTokenizer26.getRemainingInput();
        boolean boolean28 = myTokenizer26.hasMoreTokens();
        int int29 = myTokenizer26._index;
        boolean boolean30 = myTokenizer26.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor31 = myTokenizer26.asIterator();
        myTokenizer26.pushBack("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = typeParser10.findClass("hi!", myTokenizer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objItor31);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.String str13 = myTokenizer1.nextToken("");
        java.lang.String str14 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        java.lang.String str10 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.Object obj13 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        int int13 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer1.asIterator();
        java.lang.String str17 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        int int6 = myTokenizer1.countTokens();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap13);
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory14.withModifier(typeModifier17);
        java.lang.Class<?> wildcardClass20 = typeFactory14._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap21 = typeFactory14._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeParser10.withFactory(typeFactory14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType24 = typeParser22.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objLRUMap21);
        org.junit.Assert.assertNotNull(typeParser22);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 10;
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withClassLoader(classLoader16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = typeFactory17.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory17);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory1.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeParser9.parseType(myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 1;
        java.lang.String str6 = myTokenizer1.getAllInput();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.Class<?> wildcardClass4 = typeFactory2._findPrimitive("hi!");
        typeFactory2.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory14);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str18 = myTokenizer17.getRemainingInput();
        boolean boolean19 = myTokenizer17.hasMoreTokens();
        int int20 = myTokenizer17._index;
        myTokenizer17.pushBack("hi!");
        int int23 = myTokenizer17._index;
        int int24 = myTokenizer17._index;
        java.lang.String str25 = myTokenizer17.nextToken();
        java.lang.IllegalArgumentException illegalArgumentException27 = typeParser15._problem(myTokenizer17, "");
        java.lang.String str28 = myTokenizer17.getAllInput();
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "hi!";
        int int12 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1._pushbackToken = "";
        java.lang.Object obj6 = myTokenizer1.nextElement();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap10 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory6.withModifier(typeModifier11);
        java.lang.ClassLoader classLoader13 = typeFactory12.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(objLRUMap10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNull(classLoader13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str16 = myTokenizer1.getAllInput();
        java.lang.String str17 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor18 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(objItor18);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory3.withModifier(typeModifier6);
        java.lang.Class<?> wildcardClass9 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap10 = typeFactory3._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap10);
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeParser1.withFactory(typeFactory11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeParser12._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer16 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer16._index = 1;
        java.lang.String str19 = myTokenizer16._input;
        java.util.Iterator<java.lang.Object> objItor20 = myTokenizer16.asIterator();
        boolean boolean21 = myTokenizer16.hasMoreElements();
        myTokenizer16._index = (byte) 1;
        myTokenizer16._pushbackToken = "hi!";
        boolean boolean26 = myTokenizer16.hasMoreElements();
        boolean boolean27 = myTokenizer16.hasMoreTokens();
        java.lang.String str28 = myTokenizer16.getAllInput();
        boolean boolean29 = myTokenizer16.hasMoreElements();
        myTokenizer16._pushbackToken = "";
        java.lang.String str32 = myTokenizer16.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = typeParser12.findClass("", myTokenizer16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objLRUMap10);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = typeFactory11._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer15 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str16 = myTokenizer15.getRemainingInput();
        java.lang.String str17 = myTokenizer15._pushbackToken;
        int int18 = myTokenizer15.countTokens();
        java.lang.String str19 = myTokenizer15._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException21 = typeParser13._problem(myTokenizer15, "hi!");
        int int22 = myTokenizer15.countTokens();
        int int23 = myTokenizer15._index;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeParser12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(illegalArgumentException21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 0;
        java.lang.String str11 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor12 = myTokenizer1.asIterator();
        java.lang.String str13 = myTokenizer1.getRemainingInput();
        myTokenizer1._index = (byte) -1;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory30.withClassLoader(classLoader33);
        java.lang.ClassLoader classLoader35 = typeFactory30._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory30._unknownType();
        java.lang.ClassLoader classLoader37 = typeFactory30.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(classLoader35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNull(classLoader37);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory1._modifiers;
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory1.withClassLoader(classLoader10);
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory1.classForName("hi!", false, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory3._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeParser5.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        boolean boolean14 = myTokenizer1.hasMoreTokens();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1.getAllInput();
        int int9 = myTokenizer1._index;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.String str7 = myTokenizer1._input;
        java.lang.Object obj8 = myTokenizer1.nextElement();
        java.lang.String str9 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = (short) 10;
        java.lang.String str9 = myTokenizer1.nextToken();
        myTokenizer1.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory1.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withModifier(typeModifier16);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory1.withModifier(typeModifier18);
        java.lang.Class<?> wildcardClass20 = typeFactory1.getClass();
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        java.lang.String str2 = myTokenizer1._pushbackToken;
        boolean boolean3 = myTokenizer1.hasMoreElements();
        int int4 = myTokenizer1._index;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        int int8 = myTokenizer1.countTokens();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        myTokenizer1._index = (-1);
        java.lang.String str14 = myTokenizer1._input;
        myTokenizer1._index = (short) 100;
        boolean boolean17 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory41.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType46, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory41._unknownType();
        typeFactory41.clearCache();
        java.lang.Class<?> wildcardClass52 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeParser39.withFactory(typeFactory41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = typeFactory41.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeParser53);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory30.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeParser typeParser35 = typeFactory30._parser;
        java.lang.ClassLoader classLoader36 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeFactory30.withClassLoader(classLoader36);
        java.lang.ClassLoader classLoader38 = typeFactory30._classLoader;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeParser35);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNull(classLoader38);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap20);
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass25 = typeFactory21._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory21.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType26, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.ArrayType arrayType29 = typeFactory17.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap30);
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap34 = typeFactory31._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory17.withCache(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory5.withCache(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory37);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap39 = typeFactory37._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap39);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap39);
        java.lang.Class<?> wildcardClass43 = typeFactory41._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(arrayType29);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(objLRUMap34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(objLRUMap39);
        org.junit.Assert.assertNull(wildcardClass43);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        int int6 = myTokenizer1.countTokens();
        java.lang.String str7 = myTokenizer1.getAllInput();
        int int8 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objItor9);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withModifier(typeModifier18);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap20);
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass25 = typeFactory21._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType26 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType27 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType28 = typeFactory21.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType26, (com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.type.ArrayType arrayType29 = typeFactory17.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap30);
        java.lang.ClassLoader classLoader32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = typeFactory31.withClassLoader(classLoader32);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap34 = typeFactory31._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory17.withCache(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory5.withCache(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap34);
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory37);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer40 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer40._index = 1;
        java.lang.String str43 = myTokenizer40._input;
        int int44 = myTokenizer40._index;
        java.util.Iterator<java.lang.Object> objItor45 = myTokenizer40.asIterator();
        java.lang.String str46 = myTokenizer40._pushbackToken;
        java.lang.String str47 = myTokenizer40._pushbackToken;
        java.lang.String str48 = myTokenizer40._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException50 = typeParser38._problem(myTokenizer40, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(simpleType26);
        org.junit.Assert.assertNotNull(simpleType27);
        org.junit.Assert.assertNotNull(javaType28);
        org.junit.Assert.assertNotNull(arrayType29);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(objLRUMap34);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objItor45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory41.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType46, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory41._unknownType();
        typeFactory41.clearCache();
        java.lang.Class<?> wildcardClass52 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeParser39.withFactory(typeFactory41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap54);
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory55.withClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass59 = typeFactory55._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType62 = typeFactory55.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType60, (com.fasterxml.jackson.databind.JavaType) simpleType61);
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory55._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser64 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeParser64._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = typeFactory65.withModifier(typeModifier66);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap68);
        java.lang.ClassLoader classLoader70 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = typeFactory69.withClassLoader(classLoader70);
        java.lang.Class<?> wildcardClass73 = typeFactory69._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType74 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType75 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType76 = typeFactory69.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType74, (com.fasterxml.jackson.databind.JavaType) simpleType75);
        com.fasterxml.jackson.databind.type.ArrayType arrayType77 = typeFactory65.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType75);
        com.fasterxml.jackson.databind.type.TypeParser typeParser78 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory65);
        java.lang.Class<?> wildcardClass80 = typeFactory65._findPrimitive("");
        java.lang.ClassLoader classLoader81 = typeFactory65._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType82 = typeFactory65._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser83 = typeParser53.withFactory(typeFactory65);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory84 = typeParser53._factory;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertNotNull(simpleType61);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(typeParser64);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNull(wildcardClass73);
        org.junit.Assert.assertNotNull(simpleType74);
        org.junit.Assert.assertNotNull(simpleType75);
        org.junit.Assert.assertNotNull(javaType76);
        org.junit.Assert.assertNotNull(arrayType77);
        org.junit.Assert.assertNull(wildcardClass80);
        org.junit.Assert.assertNull(classLoader81);
        org.junit.Assert.assertNotNull(javaType82);
        org.junit.Assert.assertNotNull(typeParser83);
        org.junit.Assert.assertNotNull(typeFactory84);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1._index = ' ';
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory14);
        java.lang.ClassLoader classLoader16 = typeFactory14._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType17 = typeFactory14._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser18 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(classLoader16);
        org.junit.Assert.assertNotNull(javaType17);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("");
        java.lang.String str13 = myTokenizer1._pushbackToken;
        java.lang.String str14 = myTokenizer1.getAllInput();
        int int15 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        java.lang.ClassLoader classLoader6 = typeFactory5.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory5.getClassLoader();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory5.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap11 = typeFactory9._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap11);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(objLRUMap11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory1.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory1.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory1._modifiers;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
        org.junit.Assert.assertNull(typeModifierArray10);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory3._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory3._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory3._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory3.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(objLRUMap6);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 10;
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (short) 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap13);
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory14.withModifier(typeModifier17);
        java.lang.Class<?> wildcardClass20 = typeFactory14._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap21 = typeFactory14._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser22 = typeParser10.withFactory(typeFactory14);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer24 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer24._index = 1;
        java.lang.String str27 = myTokenizer24._input;
        int int28 = myTokenizer24._index;
        myTokenizer24._index = (short) 0;
        java.lang.String str31 = myTokenizer24.getAllInput();
        java.lang.String str32 = myTokenizer24._input;
        myTokenizer24.pushBack("");
        java.lang.IllegalArgumentException illegalArgumentException36 = typeParser10._problem(myTokenizer24, "");
        int int37 = myTokenizer24._index;
        java.lang.String str38 = myTokenizer24.nextToken();
        java.util.Iterator<java.lang.Object> objItor39 = myTokenizer24.asIterator();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objLRUMap21);
        org.junit.Assert.assertNotNull(typeParser22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(illegalArgumentException36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(objItor39);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory41.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType46, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory41._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeFactory41._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeParser50._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = typeParser50._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeParser50._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType55 = typeFactory53.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType54);
        java.lang.ClassLoader classLoader56 = typeFactory53._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser57 = typeParser30.withFactory(typeFactory53);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier58 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory59 = typeFactory53.withModifier(typeModifier58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass61 = typeFactory59.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory52);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertNotNull(arrayType55);
        org.junit.Assert.assertNull(classLoader56);
        org.junit.Assert.assertNotNull(typeParser57);
        org.junit.Assert.assertNotNull(typeFactory59);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeParser2._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = typeFactory5._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeParser2.withFactory(typeFactory9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap13);
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass18 = typeFactory14._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory14.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType19, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory12.constructType((java.lang.reflect.Type) simpleType19, typeBindings22);
        typeFactory12.clearCache();
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeFactory12.withClassLoader(classLoader25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeParser10.withFactory(typeFactory12);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeParser10.withFactory(typeFactory28);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer31 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str32 = myTokenizer31.getRemainingInput();
        java.lang.String str33 = myTokenizer31._pushbackToken;
        int int34 = myTokenizer31.countTokens();
        myTokenizer31._pushbackToken = "";
        boolean boolean37 = myTokenizer31.hasMoreElements();
        java.lang.String str38 = myTokenizer31._pushbackToken;
        java.lang.IllegalArgumentException illegalArgumentException40 = typeParser10._problem(myTokenizer31, "");
        myTokenizer31._index = 'a';
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(objLRUMap8);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(illegalArgumentException40);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory1.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeParser9._factory;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer33 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str34 = myTokenizer33.getRemainingInput();
        java.lang.String str35 = myTokenizer33._pushbackToken;
        int int36 = myTokenizer33.countTokens();
        myTokenizer33._pushbackToken = "";
        boolean boolean39 = myTokenizer33.hasMoreTokens();
        java.lang.String str40 = myTokenizer33.getAllInput();
        myTokenizer33.pushBack("");
        boolean boolean43 = myTokenizer33.hasMoreTokens();
        myTokenizer33._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = typeParser30.findClass("", myTokenizer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Can not locate class '', problem: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        boolean boolean9 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        java.lang.String str12 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "hi!";
        int int15 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        int int12 = myTokenizer1.countTokens();
        java.lang.String str13 = myTokenizer1._input;
        java.lang.String str15 = myTokenizer1.nextToken("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        java.lang.Class<?> wildcardClass41 = typeFactory36._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory36);
        com.fasterxml.jackson.databind.JavaType javaType43 = typeFactory36._unknownType();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNotNull(javaType43);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer18 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("hi!");
        myTokenizer18.pushBack("");
        java.lang.String str21 = myTokenizer18.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = typeParser10.findClass("hi!", myTokenizer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: 'hi!'): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        boolean boolean14 = myTokenizer1.hasMoreTokens();
        int int15 = myTokenizer1.countTokens();
        java.lang.String str16 = myTokenizer1._pushbackToken;
        int int17 = myTokenizer1._index;
        java.lang.String str19 = myTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        java.lang.ClassLoader classLoader15 = typeFactory1._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withModifier(typeModifier16);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(typeModifierArray18);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.lang.String str4 = myTokenizer1.getRemainingInput();
        myTokenizer1.pushBack("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withCache(objLRUMap5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory9.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = '4';
        int int12 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        java.lang.String str9 = myTokenizer1._pushbackToken;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.lang.String str11 = myTokenizer1.getAllInput();
        java.lang.String str12 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        boolean boolean14 = myTokenizer1.hasMoreElements();
        java.lang.String str15 = myTokenizer1._pushbackToken;
        boolean boolean16 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap15);
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass20 = typeFactory16._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory16.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType21, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeParser25._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withModifier(typeModifier27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap29);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass34 = typeFactory30._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory30.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType35, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.ArrayType arrayType38 = typeFactory26.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap39 = typeFactory26._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser40 = typeParser13.withFactory(typeFactory26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap41);
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap45 = typeFactory42._typeCache;
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = typeFactory42.withClassLoader(classLoader46);
        java.lang.ClassLoader classLoader48 = typeFactory47.getClassLoader();
        java.lang.ClassLoader classLoader49 = typeFactory47.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeParser13.withFactory(typeFactory47);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer52 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer52._index = 1;
        java.lang.String str55 = myTokenizer52._pushbackToken;
        boolean boolean56 = myTokenizer52.hasMoreTokens();
        myTokenizer52._index = 10;
        myTokenizer52._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException62 = typeParser13._problem(myTokenizer52, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(arrayType38);
        org.junit.Assert.assertNotNull(objLRUMap39);
        org.junit.Assert.assertNotNull(typeParser40);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(objLRUMap45);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNull(classLoader48);
        org.junit.Assert.assertNull(classLoader49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeParser8._factory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory9.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        boolean boolean13 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        int int13 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor16 = myTokenizer1.asIterator();
        java.lang.String str17 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory1.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory17.withClassLoader(classLoader18);
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory17.withClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass23 = typeFactory17._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNull(wildcardClass23);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1.getAllInput();
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = (short) 10;
        myTokenizer1._index = 100;
        int int11 = myTokenizer1.countTokens();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.lang.String str10 = myTokenizer1.getRemainingInput();
        java.lang.String str11 = myTokenizer1.nextToken();
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        boolean boolean13 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory1._modifiers;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory1.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        java.lang.Class<?> wildcardClass12 = typeFactory11.getClass();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        java.lang.String str8 = myTokenizer1._input;
        java.lang.Object obj9 = myTokenizer1.nextElement();
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        java.lang.String str12 = myTokenizer1.getAllInput();
        java.lang.String str13 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("");
        java.lang.String str16 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (short) 1;
        myTokenizer1._index = (byte) -1;
        myTokenizer1._index = (short) -1;
        myTokenizer1._index = (short) -1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 10;
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        int int12 = myTokenizer1._index;
        java.lang.String str13 = myTokenizer1._input;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.getAllInput();
        myTokenizer1._index = (byte) -1;
        java.lang.String str12 = myTokenizer1.getAllInput();
        java.lang.String str13 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer1.asIterator();
        int int15 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader2 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.ClassStack classStack5 = null;
        java.lang.reflect.ParameterizedType parameterizedType6 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings7 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory4._fromParamType(classStack5, parameterizedType6, typeBindings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNull(classLoader2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeBindings7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeParser2._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        java.lang.ClassLoader classLoader6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory5.withClassLoader(classLoader6);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap8 = typeFactory5._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeParser2.withFactory(typeFactory9);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap13);
        java.lang.ClassLoader classLoader15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = typeFactory14.withClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass18 = typeFactory14._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory14.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType19, (com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory12.constructType((java.lang.reflect.Type) simpleType19, typeBindings22);
        typeFactory12.clearCache();
        java.lang.ClassLoader classLoader25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeFactory12.withClassLoader(classLoader25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeParser10.withFactory(typeFactory12);
        java.lang.ClassLoader classLoader28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory12.withClassLoader(classLoader28);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(objLRUMap8);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeFactory29);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeParser13.withFactory(typeFactory15);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer19._index = 1;
        java.lang.String str22 = myTokenizer19._input;
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer19.asIterator();
        java.lang.String str24 = myTokenizer19._input;
        java.lang.String str25 = myTokenizer19._pushbackToken;
        boolean boolean26 = myTokenizer19.hasMoreTokens();
        myTokenizer19._index = 0;
        java.lang.IllegalArgumentException illegalArgumentException30 = typeParser16._problem(myTokenizer19, "hi!");
        java.lang.String str31 = myTokenizer19.getRemainingInput();
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNull(typeFactory17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1._pushbackToken;
        boolean boolean10 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor12 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertNotNull(objItor12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory1.withModifier(typeModifier14);
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory15._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser16._factory;
        java.lang.ClassLoader classLoader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = typeFactory18.classForName("hi!", false, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1._index = 1;
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType2 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory19.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType24 = typeFactory22.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap25 = typeFactory22._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory19.withCache(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeParser5.withFactory(typeFactory19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeParser28._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap30 = typeFactory29._typeCache;
        java.lang.ClassLoader classLoader31 = typeFactory29._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser32 = typeFactory29._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(arrayType2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(arrayType24);
        org.junit.Assert.assertNotNull(objLRUMap25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(objLRUMap30);
        org.junit.Assert.assertNull(classLoader31);
        org.junit.Assert.assertNotNull(typeParser32);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        int int7 = myTokenizer1._index;
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        boolean boolean11 = myTokenizer1.hasMoreElements();
        int int12 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1._input;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        int int9 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType2 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType1);
        java.lang.Class<?> wildcardClass3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) arrayType2);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(arrayType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory1.withModifier(typeModifier14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = typeFactory1.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        int int12 = myTokenizer1.countTokens();
        java.lang.String str13 = myTokenizer1.nextToken();
        java.lang.String str14 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap15);
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass20 = typeFactory16._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory16.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType21, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeParser25._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withModifier(typeModifier27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap29);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass34 = typeFactory30._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory30.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType35, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.ArrayType arrayType38 = typeFactory26.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap39 = typeFactory26._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser40 = typeParser13.withFactory(typeFactory26);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = typeParser13.findClass("hi!", myTokenizer42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(arrayType38);
        org.junit.Assert.assertNotNull(objLRUMap39);
        org.junit.Assert.assertNotNull(typeParser40);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 1;
        java.lang.String str6 = myTokenizer1._input;
        int int7 = myTokenizer1.countTokens();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.getRemainingInput();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.lang.String str7 = myTokenizer1._input;
        int int8 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer41 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int42 = myTokenizer41.countTokens();
        myTokenizer41._pushbackToken = "hi!";
        java.lang.IllegalArgumentException illegalArgumentException46 = typeParser39._problem(myTokenizer41, "hi!");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = typeParser39._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer49 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer49._index = 1;
        java.lang.String str52 = myTokenizer49._input;
        int int53 = myTokenizer49._index;
        myTokenizer49.pushBack("");
        int int56 = myTokenizer49._index;
        java.lang.Object obj57 = myTokenizer49.nextElement();
        java.lang.String str58 = myTokenizer49.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException60 = typeParser39._problem(myTokenizer49, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException46);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "" + "'", obj57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = '4';
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        boolean boolean12 = myTokenizer1.hasMoreElements();
        java.lang.String str13 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor4 = myTokenizer1.asIterator();
        int int5 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        boolean boolean11 = myTokenizer1.hasMoreElements();
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        java.lang.String str13 = myTokenizer1.getAllInput();
        boolean boolean14 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor15 = myTokenizer1.asIterator();
        java.lang.String str16 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer14 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer14._index = 1;
        java.lang.String str17 = myTokenizer14._input;
        java.util.Iterator<java.lang.Object> objItor18 = myTokenizer14.asIterator();
        boolean boolean19 = myTokenizer14.hasMoreElements();
        int int20 = myTokenizer14._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = typeParser10.findClass("hi!", myTokenizer14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        java.lang.String str12 = myTokenizer1.nextToken();
        java.lang.String str13 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        myTokenizer1.pushBack("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.lang.String str11 = myTokenizer1._input;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType2 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory19.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType24 = typeFactory22.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap25 = typeFactory22._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory19.withCache(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeParser5.withFactory(typeFactory19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeParser5._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeParser5._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = typeParser5._factory;
        java.lang.ClassLoader classLoader32 = typeFactory31.getClassLoader();
        java.lang.Class<?> wildcardClass33 = typeFactory31.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(arrayType2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(arrayType24);
        org.junit.Assert.assertNotNull(objLRUMap25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNull(classLoader32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        myTokenizer1._index = (short) 0;
        java.lang.String str11 = myTokenizer1.nextToken("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType2 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory19.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType24 = typeFactory22.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap25 = typeFactory22._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory19.withCache(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeParser5.withFactory(typeFactory19);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer30 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer30._index = 1;
        java.lang.String str33 = myTokenizer30._input;
        java.util.Iterator<java.lang.Object> objItor34 = myTokenizer30.asIterator();
        java.lang.String str35 = myTokenizer30._input;
        java.lang.String str36 = myTokenizer30._pushbackToken;
        java.lang.String str37 = myTokenizer30._input;
        java.lang.String str38 = myTokenizer30._pushbackToken;
        boolean boolean39 = myTokenizer30.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor40 = myTokenizer30.asIterator();
        boolean boolean41 = myTokenizer30.hasMoreElements();
        myTokenizer30._pushbackToken = "";
        int int44 = myTokenizer30.countTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException46 = typeParser5._problem(myTokenizer30, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(arrayType2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(arrayType24);
        org.junit.Assert.assertNotNull(objLRUMap25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(objItor34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory1._modifiers;
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory1.withClassLoader(classLoader10);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass17 = typeFactory13._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory13.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType18, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory13._unknownType();
        typeFactory13.clearCache();
        typeFactory13.clearCache();
        typeFactory13.clearCache();
        java.lang.ClassLoader classLoader25 = typeFactory13.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap26 = typeFactory13._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory11.withCache(objLRUMap26);
        com.fasterxml.jackson.databind.type.ClassStack classStack28 = null;
        java.lang.reflect.WildcardType wildcardType29 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory27._fromWildcard(classStack28, wildcardType29, typeBindings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNull(classLoader25);
        org.junit.Assert.assertNotNull(objLRUMap26);
        org.junit.Assert.assertNotNull(typeFactory27);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        int int12 = myTokenizer1.countTokens();
        java.lang.String str13 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = typeParser30._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap32 = typeFactory31._typeCache;
        java.lang.ClassLoader classLoader33 = typeFactory31.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer35 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer35._index = 1;
        java.lang.String str38 = myTokenizer35._input;
        int int39 = myTokenizer35._index;
        java.util.Iterator<java.lang.Object> objItor40 = myTokenizer35.asIterator();
        java.util.Iterator<java.lang.Object> objItor41 = myTokenizer35.asIterator();
        java.lang.String str42 = myTokenizer35._input;
        myTokenizer35._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor45 = myTokenizer35.asIterator();
        myTokenizer35._index = 10;
        myTokenizer35._pushbackToken = "hi!";
        java.lang.String str50 = myTokenizer35.getAllInput();
        java.lang.String str51 = myTokenizer35.getAllInput();
        boolean boolean52 = myTokenizer35.hasMoreTokens();
        java.lang.Object obj53 = myTokenizer35.nextElement();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory31.constructType((java.lang.reflect.Type) wildcardClass54, javaType55);
        java.lang.Class<?> wildcardClass57 = typeFactory31.getClass();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNotNull(objLRUMap32);
        org.junit.Assert.assertNull(classLoader33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objItor40);
        org.junit.Assert.assertNotNull(objItor41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objItor45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "hi!" + "'", obj53, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1._input;
        boolean boolean11 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.lang.String str11 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = typeFactory4._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory9._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeParser2.withFactory(typeFactory9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType13 = typeFactory9.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        myTokenizer1._index = 1;
        myTokenizer1._index = (short) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeParser13.withFactory(typeFactory15);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer19._index = 1;
        java.lang.String str22 = myTokenizer19._input;
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer19.asIterator();
        java.lang.String str24 = myTokenizer19._input;
        java.lang.String str25 = myTokenizer19._pushbackToken;
        boolean boolean26 = myTokenizer19.hasMoreTokens();
        myTokenizer19._index = 0;
        java.lang.IllegalArgumentException illegalArgumentException30 = typeParser16._problem(myTokenizer19, "hi!");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer32 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer32._index = 1;
        java.lang.String str35 = myTokenizer32._input;
        java.util.Iterator<java.lang.Object> objItor36 = myTokenizer32.asIterator();
        java.lang.String str37 = myTokenizer32._input;
        java.lang.String str38 = myTokenizer32._pushbackToken;
        java.lang.String str39 = myTokenizer32._input;
        boolean boolean40 = myTokenizer32.hasMoreElements();
        boolean boolean41 = myTokenizer32.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList42 = typeParser16.parseTypes(myTokenizer32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNull(typeFactory17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(objItor36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer10 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer10._index = 1;
        int int13 = myTokenizer10.countTokens();
        int int14 = myTokenizer10._index;
        java.lang.String str15 = myTokenizer10._input;
        boolean boolean16 = myTokenizer10.hasMoreElements();
        java.lang.String str17 = myTokenizer10._pushbackToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = typeParser7.findClass("hi!", myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(objLRUMap6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray13 = typeFactory1._modifiers;
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory1.withClassLoader(classLoader14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withClassLoader(classLoader16);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNull(typeModifierArray13);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(typeFactory17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.getAllInput();
        java.lang.String str10 = myTokenizer1._input;
        int int11 = myTokenizer1.countTokens();
        java.lang.String str12 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer1.asIterator();
        java.lang.String str14 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj11 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer1.asIterator();
        java.lang.String str15 = myTokenizer1.getAllInput();
        java.lang.String str16 = myTokenizer1._input;
        myTokenizer1._index = ' ';
        java.lang.String str20 = myTokenizer1.nextToken("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 10;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1._index;
        int int10 = myTokenizer1._index;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "hi!";
        int int5 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1._input;
        boolean boolean7 = myTokenizer1.hasMoreElements();
        java.lang.String str8 = myTokenizer1._input;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeParser typeParser4 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        java.lang.Class<?> wildcardClass6 = typeFactory1._findPrimitive("hi!");
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1._unknownType();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory1.classForName("hi!", false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(javaType8);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeParser13.withFactory(typeFactory15);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer19 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer19._index = 1;
        java.lang.String str22 = myTokenizer19._input;
        java.util.Iterator<java.lang.Object> objItor23 = myTokenizer19.asIterator();
        java.lang.String str24 = myTokenizer19._input;
        java.lang.String str25 = myTokenizer19._pushbackToken;
        boolean boolean26 = myTokenizer19.hasMoreTokens();
        myTokenizer19._index = 0;
        java.lang.IllegalArgumentException illegalArgumentException30 = typeParser16._problem(myTokenizer19, "hi!");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer32 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer32._index = 1;
        int int35 = myTokenizer32.countTokens();
        myTokenizer32._index = (short) 10;
        myTokenizer32._pushbackToken = "";
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList40 = typeParser16.parseTypes(myTokenizer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNull(typeFactory17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(illegalArgumentException30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType15 = typeFactory13.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType14);
        java.lang.ClassLoader classLoader16 = typeFactory13._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray17 = typeFactory13._modifiers;
        java.lang.ClassLoader classLoader18 = typeFactory13.getClassLoader();
        com.fasterxml.jackson.databind.JavaType javaType19 = typeFactory13._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory13._unknownType();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(arrayType15);
        org.junit.Assert.assertNull(classLoader16);
        org.junit.Assert.assertNull(typeModifierArray17);
        org.junit.Assert.assertNull(classLoader18);
        org.junit.Assert.assertNotNull(javaType19);
        org.junit.Assert.assertNotNull(javaType20);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory30.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap35 = typeFactory30._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap35);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap35);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(objLRUMap35);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = typeParser24._factory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = typeFactory25.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory25);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser typeParser12 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType14 = typeParser12.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap10 = typeFactory1._typeCache;
        java.lang.ClassLoader classLoader11 = typeFactory1.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(objLRUMap10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str16 = myTokenizer1.getAllInput();
        java.lang.String str17 = myTokenizer1._input;
        int int18 = myTokenizer1.countTokens();
        java.lang.String str19 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        java.lang.Class<?> wildcardClass26 = typeFactory11._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory11._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        java.lang.ClassLoader classLoader30 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = typeFactory29.withClassLoader(classLoader30);
        java.lang.Class<?> wildcardClass33 = typeFactory29._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType34 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType36 = typeFactory29.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType34, (com.fasterxml.jackson.databind.JavaType) simpleType35);
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory29._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser38 = typeFactory29._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeParser38._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory40 = typeParser38._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeParser38._factory;
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeParser27.withFactory(typeFactory41);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeFactory31);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNotNull(simpleType34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(javaType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(typeParser38);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(typeFactory40);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeParser42);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser10._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap15);
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass20 = typeFactory16._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory16.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType21, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory16._unknownType();
        typeFactory16.clearCache();
        typeFactory16.clearCache();
        typeFactory16.clearCache();
        java.lang.ClassLoader classLoader28 = typeFactory16.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser29 = typeParser10.withFactory(typeFactory16);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeParser10._factory;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNull(classLoader28);
        org.junit.Assert.assertNotNull(typeParser29);
        org.junit.Assert.assertNotNull(typeFactory30);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1.getRemainingInput();
        boolean boolean13 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.lang.String str10 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        boolean boolean14 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        java.lang.String str17 = myTokenizer1.nextToken();
        myTokenizer1._index = (byte) 10;
        myTokenizer1._index = 0;
        java.lang.String str22 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer13 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer13._index = 1;
        java.lang.String str16 = myTokenizer13._pushbackToken;
        boolean boolean17 = myTokenizer13.hasMoreTokens();
        int int18 = myTokenizer13.countTokens();
        java.lang.String str19 = myTokenizer13.getAllInput();
        int int20 = myTokenizer13._index;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList21 = typeParser10.parseTypes(myTokenizer13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        java.lang.String str9 = myTokenizer1._pushbackToken;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        java.lang.String str11 = myTokenizer1.getAllInput();
        java.lang.String str12 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withCache(objLRUMap5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory6);
        typeFactory6.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory6.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory41.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType46, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory41._unknownType();
        typeFactory41.clearCache();
        java.lang.Class<?> wildcardClass52 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeParser39.withFactory(typeFactory41);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = typeParser53._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeParser53._factory;
        java.lang.ClassLoader classLoader56 = typeFactory55._classLoader;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap57 = typeFactory55._typeCache;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(typeFactory55);
        org.junit.Assert.assertNull(classLoader56);
        org.junit.Assert.assertNotNull(objLRUMap57);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withModifier(typeModifier2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory3._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory3.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory3._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser7);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        int int10 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        typeFactory1.clearCache();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory1.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory10);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory10.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeParser typeParser14 = typeParser9.withFactory(typeFactory10);
        java.lang.Class<?> wildcardClass15 = typeParser14.getClass();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeParser14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType2 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory4);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory7.withClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass11 = typeFactory7._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType12 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory7.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType12, (com.fasterxml.jackson.databind.JavaType) simpleType13);
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory7._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeFactory7._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeParser16._factory;
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        com.fasterxml.jackson.databind.type.ArrayType arrayType21 = typeFactory19.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType20);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory22 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType24 = typeFactory22.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType23);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap25 = typeFactory22._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory19.withCache(objLRUMap25);
        com.fasterxml.jackson.databind.type.TypeParser typeParser28 = typeParser5.withFactory(typeFactory19);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeParser28._factory;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType31 = typeParser28.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(arrayType2);
        org.junit.Assert.assertNotNull(objLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(simpleType12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(arrayType21);
        org.junit.Assert.assertNotNull(typeFactory22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(arrayType24);
        org.junit.Assert.assertNotNull(objLRUMap25);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(typeParser28);
        org.junit.Assert.assertNotNull(typeFactory29);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        int int7 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 1;
        java.lang.String str6 = myTokenizer1._input;
        int int7 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objItor8);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withClassLoader(classLoader5);
        typeFactory1.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory1._parser;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str14 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor3 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("hi!");
        java.lang.String str6 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        java.lang.ClassLoader classLoader15 = typeFactory1._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withModifier(typeModifier16);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = typeFactory1._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser19 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer21 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str22 = myTokenizer21.getRemainingInput();
        boolean boolean23 = myTokenizer21.hasMoreTokens();
        int int24 = myTokenizer21._index;
        myTokenizer21.pushBack("hi!");
        java.lang.String str27 = myTokenizer21.getAllInput();
        java.lang.Object obj28 = myTokenizer21.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList29 = typeParser19.parseTypes(myTokenizer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(classLoader15);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(typeModifierArray18);
        org.junit.Assert.assertNotNull(typeParser19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "hi!";
        int int5 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1.getRemainingInput();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        int int9 = myTokenizer1._index;
        boolean boolean10 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj11 = myTokenizer1.nextElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory3._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory3._parser;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap6 = typeFactory3._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeParser5);
        org.junit.Assert.assertNotNull(objLRUMap6);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        int int5 = myTokenizer1._index;
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._input;
        java.lang.String str8 = myTokenizer1._pushbackToken;
        java.util.Iterator<java.lang.Object> objItor9 = myTokenizer1.asIterator();
        boolean boolean10 = myTokenizer1.hasMoreElements();
        java.lang.String str11 = myTokenizer1._input;
        boolean boolean12 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 10;
        int int8 = myTokenizer1._index;
        int int9 = myTokenizer1._index;
        boolean boolean10 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        java.lang.String str9 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str12 = myTokenizer1.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1._input;
        myTokenizer1._index = (byte) -1;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        myTokenizer1._index = 10;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str16 = myTokenizer1.getAllInput();
        java.lang.String str17 = myTokenizer1._input;
        java.lang.String str18 = myTokenizer1.getAllInput();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "";
        myTokenizer1.pushBack("");
        java.lang.String str12 = myTokenizer1._pushbackToken;
        int int13 = myTokenizer1._index;
        java.lang.String str14 = myTokenizer1.getAllInput();
        int int15 = myTokenizer1.countTokens();
        boolean boolean16 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        int int4 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        myTokenizer1._index = 1;
        myTokenizer1._index = (short) 10;
        int int14 = myTokenizer1._index;
        int int15 = myTokenizer1.countTokens();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory14);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer17 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str18 = myTokenizer17.getRemainingInput();
        boolean boolean19 = myTokenizer17.hasMoreTokens();
        int int20 = myTokenizer17._index;
        myTokenizer17.pushBack("hi!");
        int int23 = myTokenizer17._index;
        int int24 = myTokenizer17._index;
        java.lang.String str25 = myTokenizer17.nextToken();
        java.lang.IllegalArgumentException illegalArgumentException27 = typeParser15._problem(myTokenizer17, "");
        boolean boolean28 = myTokenizer17.hasMoreElements();
        boolean boolean29 = myTokenizer17.hasMoreElements();
        java.lang.String str30 = myTokenizer17.getRemainingInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = myTokenizer17.nextToken("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(illegalArgumentException27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        int int8 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("hi!");
        java.lang.String str8 = myTokenizer1.getRemainingInput();
        myTokenizer1._pushbackToken = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        myTokenizer1.pushBack("");
        java.lang.String str11 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withModifier(typeModifier2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer41 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str42 = myTokenizer41.getRemainingInput();
        java.lang.String str43 = myTokenizer41._pushbackToken;
        int int44 = myTokenizer41._index;
        int int45 = myTokenizer41.countTokens();
        java.lang.IllegalArgumentException illegalArgumentException47 = typeParser30._problem(myTokenizer41, "");
        myTokenizer41._pushbackToken = "hi!";
        java.lang.String str50 = myTokenizer41.getAllInput();
        myTokenizer41.pushBack("");
        myTokenizer41.pushBack("hi!");
        java.lang.String str56 = myTokenizer41.nextToken("hi!");
        java.lang.String str57 = myTokenizer41.getAllInput();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj11 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("");
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer1.asIterator();
        java.lang.String str15 = myTokenizer1.getAllInput();
        java.lang.String str16 = myTokenizer1._input;
        boolean boolean17 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory1);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory1.withClassLoader(classLoader16);
        java.lang.ClassLoader classLoader18 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeFactory1.withClassLoader(classLoader18);
        java.lang.ClassLoader classLoader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = typeFactory1.classForName("", false, classLoader22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(typeFactory19);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = 10;
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        int int9 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory41.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType46, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory41._unknownType();
        typeFactory41.clearCache();
        java.lang.Class<?> wildcardClass52 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeParser39.withFactory(typeFactory41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap54);
        java.lang.ClassLoader classLoader56 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory57 = typeFactory55.withClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass59 = typeFactory55._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType60 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType62 = typeFactory55.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType60, (com.fasterxml.jackson.databind.JavaType) simpleType61);
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory55._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser64 = typeFactory55._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeParser64._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = typeFactory65.withModifier(typeModifier66);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap68 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory69 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap68);
        java.lang.ClassLoader classLoader70 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory71 = typeFactory69.withClassLoader(classLoader70);
        java.lang.Class<?> wildcardClass73 = typeFactory69._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType74 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType75 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType76 = typeFactory69.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType74, (com.fasterxml.jackson.databind.JavaType) simpleType75);
        com.fasterxml.jackson.databind.type.ArrayType arrayType77 = typeFactory65.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType75);
        com.fasterxml.jackson.databind.type.TypeParser typeParser78 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory65);
        java.lang.Class<?> wildcardClass80 = typeFactory65._findPrimitive("");
        java.lang.ClassLoader classLoader81 = typeFactory65._classLoader;
        com.fasterxml.jackson.databind.JavaType javaType82 = typeFactory65._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser83 = typeParser53.withFactory(typeFactory65);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray84 = typeFactory65._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass86 = typeFactory65.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeFactory57);
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertNotNull(simpleType60);
        org.junit.Assert.assertNotNull(simpleType61);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(typeParser64);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeFactory71);
        org.junit.Assert.assertNull(wildcardClass73);
        org.junit.Assert.assertNotNull(simpleType74);
        org.junit.Assert.assertNotNull(simpleType75);
        org.junit.Assert.assertNotNull(javaType76);
        org.junit.Assert.assertNotNull(arrayType77);
        org.junit.Assert.assertNull(wildcardClass80);
        org.junit.Assert.assertNull(classLoader81);
        org.junit.Assert.assertNotNull(javaType82);
        org.junit.Assert.assertNotNull(typeParser83);
        org.junit.Assert.assertNull(typeModifierArray84);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        int int7 = myTokenizer1.countTokens();
        boolean boolean8 = myTokenizer1.hasMoreElements();
        java.lang.String str9 = myTokenizer1.getAllInput();
        boolean boolean10 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap15);
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass20 = typeFactory16._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory16.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType21, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeParser25._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withModifier(typeModifier27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap29);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass34 = typeFactory30._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory30.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType35, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.ArrayType arrayType38 = typeFactory26.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap39 = typeFactory26._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser40 = typeParser13.withFactory(typeFactory26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap41);
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap45 = typeFactory42._typeCache;
        java.lang.ClassLoader classLoader46 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory47 = typeFactory42.withClassLoader(classLoader46);
        java.lang.ClassLoader classLoader48 = typeFactory47.getClassLoader();
        java.lang.ClassLoader classLoader49 = typeFactory47.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser50 = typeParser13.withFactory(typeFactory47);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory51.withClassLoader(classLoader52);
        com.fasterxml.jackson.databind.type.TypeParser typeParser54 = typeParser13.withFactory(typeFactory51);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer56 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str57 = myTokenizer56.getRemainingInput();
        boolean boolean58 = myTokenizer56.hasMoreTokens();
        boolean boolean59 = myTokenizer56.hasMoreElements();
        boolean boolean60 = myTokenizer56.hasMoreTokens();
        myTokenizer56.pushBack("hi!");
        myTokenizer56._index = (short) 0;
        myTokenizer56._pushbackToken = "hi!";
        myTokenizer56._index = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalArgumentException illegalArgumentException70 = typeParser54._problem(myTokenizer56, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(arrayType38);
        org.junit.Assert.assertNotNull(objLRUMap39);
        org.junit.Assert.assertNotNull(typeParser40);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(objLRUMap45);
        org.junit.Assert.assertNotNull(typeFactory47);
        org.junit.Assert.assertNull(classLoader48);
        org.junit.Assert.assertNull(classLoader49);
        org.junit.Assert.assertNotNull(typeParser50);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNotNull(typeParser54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass37 = typeFactory33._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory33.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType38, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory33._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeParser42._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass52 = typeFactory48._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType53 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory48.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType53, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory48._unknownType();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        java.lang.ClassLoader classLoader60 = typeFactory48.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeParser42.withFactory(typeFactory48);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = null;
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28, typeParser42, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeParser42._factory;
        java.lang.ClassLoader classLoader66 = typeFactory65._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass68 = typeFactory65.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(simpleType53);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNull(classLoader60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertNull(classLoader66);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        int int2 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "hi!";
        int int5 = myTokenizer1.countTokens();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1.nextToken("");
        java.lang.String str10 = myTokenizer1.getAllInput();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        myTokenizer1.pushBack("");
        java.lang.String str9 = myTokenizer1._pushbackToken;
        java.lang.Object obj10 = myTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory1._modifiers;
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory1.withClassLoader(classLoader10);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap12);
        java.lang.ClassLoader classLoader14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = typeFactory13.withClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass17 = typeFactory13._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType18 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType19 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType20 = typeFactory13.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType18, (com.fasterxml.jackson.databind.JavaType) simpleType19);
        com.fasterxml.jackson.databind.JavaType javaType21 = typeFactory13._unknownType();
        typeFactory13.clearCache();
        typeFactory13.clearCache();
        typeFactory13.clearCache();
        java.lang.ClassLoader classLoader25 = typeFactory13.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap26 = typeFactory13._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory11.withCache(objLRUMap26);
        com.fasterxml.jackson.databind.type.ClassStack classStack28 = null;
        java.lang.reflect.ParameterizedType parameterizedType29 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType31 = typeFactory11._fromParamType(classStack28, parameterizedType29, typeBindings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(simpleType18);
        org.junit.Assert.assertNotNull(simpleType19);
        org.junit.Assert.assertNotNull(javaType20);
        org.junit.Assert.assertNotNull(javaType21);
        org.junit.Assert.assertNull(classLoader25);
        org.junit.Assert.assertNotNull(objLRUMap26);
        org.junit.Assert.assertNotNull(typeFactory27);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = myTokenizer1.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        myTokenizer1.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        myTokenizer1._pushbackToken = "hi!";
        java.util.Iterator<java.lang.Object> objItor13 = myTokenizer1.asIterator();
        int int14 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        myTokenizer1._index = (short) 10;
        java.lang.String str9 = myTokenizer1.nextToken();
        boolean boolean10 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) -1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.SimpleType simpleType1 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType2 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType1);
        com.fasterxml.jackson.databind.type.SimpleType simpleType3 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        com.fasterxml.jackson.databind.type.ArrayType arrayType4 = typeFactory0.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType3);
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(simpleType1);
        org.junit.Assert.assertNotNull(arrayType2);
        org.junit.Assert.assertNotNull(simpleType3);
        org.junit.Assert.assertNotNull(arrayType4);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1.countTokens();
        java.lang.String str5 = myTokenizer1._pushbackToken;
        java.lang.String str6 = myTokenizer1._input;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("");
        java.lang.String str10 = myTokenizer1._input;
        java.lang.String str11 = myTokenizer1._pushbackToken;
        java.lang.String str12 = myTokenizer1.nextToken();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._pushbackToken = "";
        java.lang.String str11 = myTokenizer1.nextToken("");
        java.lang.String str12 = myTokenizer1.getAllInput();
        java.lang.String str13 = myTokenizer1._input;
        myTokenizer1._index = 100;
        boolean boolean16 = myTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory1.withModifier(typeModifier13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory14);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory14.withModifier(typeModifier16);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray18 = typeFactory14._modifiers;
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(typeModifierArray18);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._input;
        java.lang.String str7 = myTokenizer1._pushbackToken;
        java.lang.String str8 = myTokenizer1._input;
        boolean boolean9 = myTokenizer1.hasMoreElements();
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        java.lang.String str12 = myTokenizer1._pushbackToken;
        int int13 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor14 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objItor14);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        java.lang.ClassLoader classLoader7 = typeFactory6.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1.pushBack("hi!");
        java.lang.String str9 = myTokenizer1._input;
        int int10 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        boolean boolean2 = myTokenizer1.hasMoreTokens();
        myTokenizer1.pushBack("");
        java.lang.String str5 = myTokenizer1.getRemainingInput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass37 = typeFactory33._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory33.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType38, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory33._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeParser42._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass52 = typeFactory48._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType53 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory48.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType53, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory48._unknownType();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        java.lang.ClassLoader classLoader60 = typeFactory48.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeParser42.withFactory(typeFactory48);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = null;
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28, typeParser42, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap65 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap65);
        java.lang.ClassLoader classLoader67 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = typeFactory66.withClassLoader(classLoader67);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = typeFactory66.withModifier(typeModifier69);
        java.lang.Class<?> wildcardClass72 = typeFactory66._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser73 = typeParser42.withFactory(typeFactory66);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory74 = typeParser42._factory;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(simpleType53);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNull(classLoader60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeFactory68);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeParser73);
        org.junit.Assert.assertNotNull(typeFactory74);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass37 = typeFactory33._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory33.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType38, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory33._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeParser42._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass52 = typeFactory48._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType53 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory48.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType53, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory48._unknownType();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        java.lang.ClassLoader classLoader60 = typeFactory48.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeParser42.withFactory(typeFactory48);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = null;
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28, typeParser42, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap65 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap65);
        java.lang.ClassLoader classLoader67 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = typeFactory66.withClassLoader(classLoader67);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = typeFactory66.withModifier(typeModifier69);
        java.lang.Class<?> wildcardClass72 = typeFactory66._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser73 = typeParser42.withFactory(typeFactory66);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer76 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer76._index = 1;
        java.lang.String str79 = myTokenizer76._input;
        java.util.Iterator<java.lang.Object> objItor80 = myTokenizer76.asIterator();
        boolean boolean81 = myTokenizer76.hasMoreElements();
        myTokenizer76._index = (byte) 1;
        myTokenizer76._pushbackToken = "hi!";
        boolean boolean86 = myTokenizer76.hasMoreElements();
        boolean boolean87 = myTokenizer76.hasMoreTokens();
        java.lang.String str88 = myTokenizer76.getAllInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass89 = typeParser42.findClass("hi!", myTokenizer76);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(simpleType53);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNull(classLoader60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeFactory68);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeParser73);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(objItor80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory1.withModifier(typeModifier4);
        java.lang.ClassLoader classLoader6 = typeFactory5.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory5.getClassLoader();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory5.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory9);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer12 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer12._index = 1;
        java.lang.String str15 = myTokenizer12._input;
        int int16 = myTokenizer12._index;
        java.util.Iterator<java.lang.Object> objItor17 = myTokenizer12.asIterator();
        java.lang.String str18 = myTokenizer12.getAllInput();
        java.lang.String str19 = myTokenizer12.getAllInput();
        java.lang.String str20 = myTokenizer12._input;
        boolean boolean21 = myTokenizer12.hasMoreTokens();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType22 = typeParser10.parseType(myTokenizer12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.lang.String str8 = myTokenizer1.getAllInput();
        java.lang.String str9 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int7 = myTokenizer1._index;
        java.lang.String str9 = myTokenizer1.nextToken("hi!");
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        myTokenizer1.pushBack("hi!");
        myTokenizer1.pushBack("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1._index = (short) 0;
        java.lang.String str8 = myTokenizer1.getAllInput();
        int int9 = myTokenizer1._index;
        java.lang.String str10 = myTokenizer1.getAllInput();
        myTokenizer1._index = (byte) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory6._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeParser8.findClass("", myTokenizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        boolean boolean5 = myTokenizer1.hasMoreTokens();
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        myTokenizer1.pushBack("");
        java.lang.Object obj11 = myTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        boolean boolean7 = myTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass37 = typeFactory33._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory33.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType38, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory33._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeParser42._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass52 = typeFactory48._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType53 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory48.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType53, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory48._unknownType();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        java.lang.ClassLoader classLoader60 = typeFactory48.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeParser42.withFactory(typeFactory48);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = null;
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28, typeParser42, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory65 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer67 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str68 = myTokenizer67.getRemainingInput();
        boolean boolean69 = myTokenizer67.hasMoreTokens();
        boolean boolean70 = myTokenizer67.hasMoreElements();
        boolean boolean71 = myTokenizer67.hasMoreTokens();
        myTokenizer67.pushBack("hi!");
        myTokenizer67._index = (short) 0;
        myTokenizer67._pushbackToken = "hi!";
        java.lang.String str79 = myTokenizer67.nextToken("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType80 = typeParser42.parseType(myTokenizer67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(simpleType53);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNull(classLoader60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeFactory65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory30.withClassLoader(classLoader33);
        typeFactory34.clearCache();
        java.lang.Class<?> wildcardClass37 = typeFactory34._findPrimitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory34.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(wildcardClass37);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        java.lang.ClassLoader classLoader30 = typeFactory11._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray31 = typeFactory11._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray32 = typeFactory11._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory11.withModifier(typeModifier33);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNull(classLoader30);
        org.junit.Assert.assertNull(typeModifierArray31);
        org.junit.Assert.assertNull(typeModifierArray32);
        org.junit.Assert.assertNotNull(typeFactory34);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory3._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory3.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        java.lang.String str10 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor11 = myTokenizer1.asIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = myTokenizer1.nextToken("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("");
        int int11 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str14 = myTokenizer1._pushbackToken;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap40 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap40);
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass45 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType46 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType48 = typeFactory41.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType46, (com.fasterxml.jackson.databind.JavaType) simpleType47);
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory41._unknownType();
        typeFactory41.clearCache();
        java.lang.Class<?> wildcardClass52 = typeFactory41._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser53 = typeParser39.withFactory(typeFactory41);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier54 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory55 = typeFactory41.withModifier(typeModifier54);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNotNull(simpleType46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(javaType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeParser53);
        org.junit.Assert.assertNotNull(typeFactory55);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.TypeParser typeParser24 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory11);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap25 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap25);
        java.lang.ClassLoader classLoader27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass30 = typeFactory26._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType31 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType32 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType33 = typeFactory26.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType31, (com.fasterxml.jackson.databind.JavaType) simpleType32);
        com.fasterxml.jackson.databind.JavaType javaType34 = typeFactory26._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser35 = typeFactory26._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeParser35._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory37 = typeParser35._factory;
        java.lang.ClassLoader classLoader38 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory39 = typeFactory37.withClassLoader(classLoader38);
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory37._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap41);
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        java.lang.Class<?> wildcardClass46 = typeFactory42._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType47 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType48 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType49 = typeFactory42.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType47, (com.fasterxml.jackson.databind.JavaType) simpleType48);
        com.fasterxml.jackson.databind.JavaType javaType50 = typeFactory42._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser51 = typeFactory42._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory52 = typeParser51._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier53 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory54 = typeFactory52.withModifier(typeModifier53);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap55 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory56 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap55);
        java.lang.ClassLoader classLoader57 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory58 = typeFactory56.withClassLoader(classLoader57);
        java.lang.Class<?> wildcardClass60 = typeFactory56._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType61 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType62 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType63 = typeFactory56.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType61, (com.fasterxml.jackson.databind.JavaType) simpleType62);
        com.fasterxml.jackson.databind.type.ArrayType arrayType64 = typeFactory52.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType62);
        com.fasterxml.jackson.databind.JavaType javaType65 = typeFactory11.moreSpecificType(javaType40, (com.fasterxml.jackson.databind.JavaType) arrayType64);
        java.lang.ClassLoader classLoader66 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory67 = typeFactory11.withClassLoader(classLoader66);
        com.fasterxml.jackson.databind.type.TypeParser typeParser68 = typeFactory11._parser;
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNotNull(simpleType31);
        org.junit.Assert.assertNotNull(simpleType32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(javaType34);
        org.junit.Assert.assertNotNull(typeParser35);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNotNull(typeFactory37);
        org.junit.Assert.assertNotNull(typeFactory39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertNotNull(simpleType47);
        org.junit.Assert.assertNotNull(simpleType48);
        org.junit.Assert.assertNotNull(javaType49);
        org.junit.Assert.assertNotNull(javaType50);
        org.junit.Assert.assertNotNull(typeParser51);
        org.junit.Assert.assertNotNull(typeFactory52);
        org.junit.Assert.assertNotNull(typeFactory54);
        org.junit.Assert.assertNotNull(typeFactory58);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNotNull(simpleType61);
        org.junit.Assert.assertNotNull(simpleType62);
        org.junit.Assert.assertNotNull(javaType63);
        org.junit.Assert.assertNotNull(arrayType64);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(typeFactory67);
        org.junit.Assert.assertNotNull(typeParser68);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap4);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory6._modifiers;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap10 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory6.withClassLoader(classLoader11);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNull(typeModifierArray7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(objLRUMap10);
        org.junit.Assert.assertNotNull(typeFactory12);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        int int5 = myTokenizer1._index;
        myTokenizer1.pushBack("");
        java.lang.Object obj8 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("hi!");
        java.lang.Object obj11 = myTokenizer1.nextElement();
        myTokenizer1.pushBack("");
        int int14 = myTokenizer1._index;
        java.lang.Object obj15 = myTokenizer1.nextElement();
        java.lang.String str16 = myTokenizer1._input;
        int int17 = myTokenizer1.countTokens();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        java.lang.String str3 = myTokenizer1._pushbackToken;
        int int4 = myTokenizer1.countTokens();
        myTokenizer1._pushbackToken = "";
        boolean boolean7 = myTokenizer1.hasMoreElements();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        java.lang.String str9 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor10 = myTokenizer1.asIterator();
        java.lang.String str11 = myTokenizer1.getAllInput();
        java.lang.String str13 = myTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        boolean boolean4 = myTokenizer1.hasMoreElements();
        java.lang.String str5 = myTokenizer1._input;
        java.lang.String str6 = myTokenizer1.getAllInput();
        myTokenizer1.pushBack("");
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        myTokenizer1._index = (byte) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap4 = typeFactory1._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory1.withCache(objLRUMap5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap7);
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass12 = typeFactory8._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType14 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory8.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType13, (com.fasterxml.jackson.databind.JavaType) simpleType14);
        com.fasterxml.jackson.databind.JavaType javaType16 = typeFactory8._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser17 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeParser17._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory19 = typeParser17._factory;
        java.lang.ClassLoader classLoader20 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory21 = typeFactory19.withClassLoader(classLoader20);
        java.lang.ClassLoader classLoader22 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory23 = typeFactory21.withClassLoader(classLoader22);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = typeFactory23._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeFactory1.withCache(objLRUMap24);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap29);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass34 = typeFactory30._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory30.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType35, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory28.constructType((java.lang.reflect.Type) simpleType35, typeBindings38);
        typeFactory28.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = typeFactory28.withModifier(typeModifier41);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap43 = typeFactory42._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory1.withCache(objLRUMap43);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap43);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNotNull(objLRUMap4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(simpleType14);
        org.junit.Assert.assertNotNull(javaType15);
        org.junit.Assert.assertNotNull(javaType16);
        org.junit.Assert.assertNotNull(typeParser17);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNotNull(typeFactory19);
        org.junit.Assert.assertNotNull(typeFactory21);
        org.junit.Assert.assertNotNull(typeFactory23);
        org.junit.Assert.assertNotNull(objLRUMap24);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(typeFactory42);
        org.junit.Assert.assertNotNull(objLRUMap43);
        org.junit.Assert.assertNotNull(typeFactory44);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        boolean boolean7 = myTokenizer1.hasMoreTokens();
        java.lang.String str8 = myTokenizer1._pushbackToken;
        int int9 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "hi!";
        int int12 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeParser typeParser30 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier35 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory36 = typeFactory32.withModifier(typeModifier35);
        java.lang.ClassLoader classLoader37 = typeFactory36.getClassLoader();
        java.lang.ClassLoader classLoader38 = typeFactory36.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser39 = typeParser30.withFactory(typeFactory36);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer41 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str42 = myTokenizer41.getRemainingInput();
        java.lang.String str43 = myTokenizer41._pushbackToken;
        int int44 = myTokenizer41._index;
        int int45 = myTokenizer41.countTokens();
        java.lang.IllegalArgumentException illegalArgumentException47 = typeParser30._problem(myTokenizer41, "");
        myTokenizer41._pushbackToken = "hi!";
        java.lang.Object obj50 = myTokenizer41.nextElement();
        boolean boolean51 = myTokenizer41.hasMoreTokens();
        myTokenizer41._index = (short) -1;
        boolean boolean54 = myTokenizer41.hasMoreElements();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNotNull(typeFactory36);
        org.junit.Assert.assertNull(classLoader37);
        org.junit.Assert.assertNull(classLoader38);
        org.junit.Assert.assertNotNull(typeParser39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException47);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = null;
        com.fasterxml.jackson.databind.type.TypeParser typeParser16 = typeParser13.withFactory(typeFactory15);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap17);
        java.lang.ClassLoader classLoader19 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = typeFactory18.withClassLoader(classLoader19);
        java.lang.Class<?> wildcardClass22 = typeFactory18._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType23 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType24 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType25 = typeFactory18.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType23, (com.fasterxml.jackson.databind.JavaType) simpleType24);
        com.fasterxml.jackson.databind.JavaType javaType26 = typeFactory18._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser27 = typeFactory18._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeParser27._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = typeFactory28.withModifier(typeModifier29);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap31);
        java.lang.ClassLoader classLoader33 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory34 = typeFactory32.withClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass36 = typeFactory32._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType37 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType39 = typeFactory32.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType37, (com.fasterxml.jackson.databind.JavaType) simpleType38);
        com.fasterxml.jackson.databind.type.ArrayType arrayType40 = typeFactory28.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType38);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap41 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory42 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap41);
        java.lang.ClassLoader classLoader43 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeFactory42.withClassLoader(classLoader43);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap45 = typeFactory42._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeFactory28.withCache(objLRUMap45);
        com.fasterxml.jackson.databind.type.TypeParser typeParser47 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory46);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap48 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory49 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap48);
        java.lang.ClassLoader classLoader50 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory51 = typeFactory49.withClassLoader(classLoader50);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier52 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory53 = typeFactory49.withModifier(typeModifier52);
        java.lang.ClassLoader classLoader54 = typeFactory53.getClassLoader();
        java.lang.ClassLoader classLoader55 = typeFactory53.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser56 = typeParser47.withFactory(typeFactory53);
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer58 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str59 = myTokenizer58.getRemainingInput();
        java.lang.String str60 = myTokenizer58._pushbackToken;
        int int61 = myTokenizer58._index;
        int int62 = myTokenizer58.countTokens();
        java.lang.IllegalArgumentException illegalArgumentException64 = typeParser47._problem(myTokenizer58, "");
        myTokenizer58._pushbackToken = "hi!";
        boolean boolean67 = myTokenizer58.hasMoreElements();
        java.lang.IllegalArgumentException illegalArgumentException69 = typeParser13._problem(myTokenizer58, "");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer71 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer71._index = 1;
        java.lang.String str74 = myTokenizer71._input;
        int int75 = myTokenizer71._index;
        myTokenizer71.pushBack("");
        java.lang.Object obj78 = myTokenizer71.nextElement();
        myTokenizer71.pushBack("hi!");
        java.util.Iterator<java.lang.Object> objItor81 = myTokenizer71.asIterator();
        java.lang.String str82 = myTokenizer71.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType83 = typeParser13.parseType(myTokenizer71);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeParser16);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNotNull(simpleType23);
        org.junit.Assert.assertNotNull(simpleType24);
        org.junit.Assert.assertNotNull(javaType25);
        org.junit.Assert.assertNotNull(javaType26);
        org.junit.Assert.assertNotNull(typeParser27);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory30);
        org.junit.Assert.assertNotNull(typeFactory34);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertNotNull(simpleType37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(javaType39);
        org.junit.Assert.assertNotNull(arrayType40);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(objLRUMap45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory51);
        org.junit.Assert.assertNotNull(typeFactory53);
        org.junit.Assert.assertNull(classLoader54);
        org.junit.Assert.assertNull(classLoader55);
        org.junit.Assert.assertNotNull(typeParser56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(illegalArgumentException64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(illegalArgumentException69);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + "" + "'", obj78, "");
        org.junit.Assert.assertNotNull(objItor81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        int int5 = myTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor6 = myTokenizer1.asIterator();
        java.lang.String str7 = myTokenizer1.getAllInput();
        myTokenizer1._index = 0;
        int int10 = myTokenizer1._index;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = myTokenizer1.nextToken();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        java.lang.String str7 = myTokenizer1._pushbackToken;
        boolean boolean8 = myTokenizer1.hasMoreTokens();
        java.lang.String str9 = myTokenizer1._pushbackToken;
        myTokenizer1._index = (short) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        java.lang.String str2 = myTokenizer1.getRemainingInput();
        boolean boolean3 = myTokenizer1.hasMoreTokens();
        int int4 = myTokenizer1._index;
        boolean boolean5 = myTokenizer1.hasMoreElements();
        java.lang.String str6 = myTokenizer1._pushbackToken;
        java.lang.String str7 = myTokenizer1.getAllInput();
        java.util.Iterator<java.lang.Object> objItor8 = myTokenizer1.asIterator();
        boolean boolean9 = myTokenizer1.hasMoreTokens();
        int int10 = myTokenizer1._index;
        myTokenizer1._pushbackToken = "";
        boolean boolean13 = myTokenizer1.hasMoreElements();
        myTokenizer1._pushbackToken = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap14 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap14);
        java.lang.ClassLoader classLoader16 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = typeFactory15.withClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass19 = typeFactory15._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType20 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType22 = typeFactory15.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType20, (com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.type.ArrayType arrayType23 = typeFactory11.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType21);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap24 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory25 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap24);
        java.lang.ClassLoader classLoader26 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory27 = typeFactory25.withClassLoader(classLoader26);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap28 = typeFactory25._typeCache;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory29 = typeFactory11.withCache(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory31 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap32 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap32);
        java.lang.ClassLoader classLoader34 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory35 = typeFactory33.withClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass37 = typeFactory33._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType38 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType39 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType40 = typeFactory33.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType38, (com.fasterxml.jackson.databind.JavaType) simpleType39);
        com.fasterxml.jackson.databind.JavaType javaType41 = typeFactory33._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser42 = typeFactory33._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory44 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory45 = typeParser42._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory46 = typeParser42._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap47 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory48 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap47);
        java.lang.ClassLoader classLoader49 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory50 = typeFactory48.withClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass52 = typeFactory48._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType53 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType54 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType55 = typeFactory48.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType53, (com.fasterxml.jackson.databind.JavaType) simpleType54);
        com.fasterxml.jackson.databind.JavaType javaType56 = typeFactory48._unknownType();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        typeFactory48.clearCache();
        java.lang.ClassLoader classLoader60 = typeFactory48.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser61 = typeParser42.withFactory(typeFactory48);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray62 = null;
        java.lang.ClassLoader classLoader63 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory64 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap28, typeParser42, typeModifierArray62, classLoader63);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap65 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory66 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap65);
        java.lang.ClassLoader classLoader67 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory68 = typeFactory66.withClassLoader(classLoader67);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier69 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory70 = typeFactory66.withModifier(typeModifier69);
        java.lang.Class<?> wildcardClass72 = typeFactory66._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser73 = typeParser42.withFactory(typeFactory66);
        typeFactory66.clearCache();
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(simpleType20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNotNull(arrayType23);
        org.junit.Assert.assertNotNull(typeFactory27);
        org.junit.Assert.assertNotNull(objLRUMap28);
        org.junit.Assert.assertNotNull(typeFactory29);
        org.junit.Assert.assertNotNull(typeFactory35);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNotNull(simpleType38);
        org.junit.Assert.assertNotNull(simpleType39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(javaType41);
        org.junit.Assert.assertNotNull(typeParser42);
        org.junit.Assert.assertNotNull(typeFactory43);
        org.junit.Assert.assertNotNull(typeFactory44);
        org.junit.Assert.assertNotNull(typeFactory45);
        org.junit.Assert.assertNotNull(typeFactory46);
        org.junit.Assert.assertNotNull(typeFactory50);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNotNull(simpleType53);
        org.junit.Assert.assertNotNull(simpleType54);
        org.junit.Assert.assertNotNull(javaType55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNull(classLoader60);
        org.junit.Assert.assertNotNull(typeParser61);
        org.junit.Assert.assertNotNull(typeFactory68);
        org.junit.Assert.assertNotNull(typeFactory70);
        org.junit.Assert.assertNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeParser73);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap2);
        java.lang.ClassLoader classLoader4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory3.withClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass7 = typeFactory3._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType8 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType9 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory3.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType8, (com.fasterxml.jackson.databind.JavaType) simpleType9);
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory1.constructType((java.lang.reflect.Type) simpleType8, typeBindings11);
        com.fasterxml.jackson.databind.type.TypeParser typeParser13 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeParser13._factory;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap15 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap15);
        java.lang.ClassLoader classLoader17 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = typeFactory16.withClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass20 = typeFactory16._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType21 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType22 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType23 = typeFactory16.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType21, (com.fasterxml.jackson.databind.JavaType) simpleType22);
        com.fasterxml.jackson.databind.JavaType javaType24 = typeFactory16._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser25 = typeFactory16._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory26 = typeParser25._factory;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier27 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory28 = typeFactory26.withModifier(typeModifier27);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap29 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory30 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap29);
        java.lang.ClassLoader classLoader31 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory32 = typeFactory30.withClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass34 = typeFactory30._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType35 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType36 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType37 = typeFactory30.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType35, (com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.type.ArrayType arrayType38 = typeFactory26.constructArrayType((com.fasterxml.jackson.databind.JavaType) simpleType36);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap39 = typeFactory26._typeCache;
        com.fasterxml.jackson.databind.type.TypeParser typeParser40 = typeParser13.withFactory(typeFactory26);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = typeParser13._factory;
        java.lang.ClassLoader classLoader42 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory43 = typeFactory41.withClassLoader(classLoader42);
        typeFactory41.clearCache();
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(simpleType8);
        org.junit.Assert.assertNotNull(simpleType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNotNull(javaType12);
        org.junit.Assert.assertNotNull(typeParser13);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNotNull(typeFactory18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(simpleType21);
        org.junit.Assert.assertNotNull(simpleType22);
        org.junit.Assert.assertNotNull(javaType23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(typeParser25);
        org.junit.Assert.assertNotNull(typeFactory26);
        org.junit.Assert.assertNotNull(typeFactory28);
        org.junit.Assert.assertNotNull(typeFactory32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(simpleType35);
        org.junit.Assert.assertNotNull(simpleType36);
        org.junit.Assert.assertNotNull(javaType37);
        org.junit.Assert.assertNotNull(arrayType38);
        org.junit.Assert.assertNotNull(objLRUMap39);
        org.junit.Assert.assertNotNull(typeParser40);
        org.junit.Assert.assertNotNull(typeFactory41);
        org.junit.Assert.assertNotNull(typeFactory43);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._input;
        java.util.Iterator<java.lang.Object> objItor5 = myTokenizer1.asIterator();
        boolean boolean6 = myTokenizer1.hasMoreElements();
        myTokenizer1._index = (byte) 1;
        myTokenizer1._pushbackToken = "hi!";
        java.lang.String str11 = myTokenizer1._input;
        int int12 = myTokenizer1.countTokens();
        java.lang.String str13 = myTokenizer1._input;
        myTokenizer1._pushbackToken = "";
        int int16 = myTokenizer1._index;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        com.fasterxml.jackson.databind.type.TypeParser typeParser2 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory0._parser;
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer5 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer5._index = 1;
        java.lang.String str8 = myTokenizer5._pushbackToken;
        java.lang.String str9 = myTokenizer5.getAllInput();
        java.lang.String str10 = myTokenizer5.getAllInput();
        myTokenizer5._index = (short) 10;
        myTokenizer5._index = 100;
        myTokenizer5.pushBack("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.JavaType> javaTypeList17 = typeParser3.parseTypes(myTokenizer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser2);
        org.junit.Assert.assertNotNull(typeParser3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Object, com.fasterxml.jackson.databind.JavaType> objLRUMap0 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory1 = new com.fasterxml.jackson.databind.type.TypeFactory(objLRUMap0);
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory1.withClassLoader(classLoader2);
        java.lang.Class<?> wildcardClass5 = typeFactory1._findPrimitive("");
        com.fasterxml.jackson.databind.type.SimpleType simpleType6 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        com.fasterxml.jackson.databind.type.SimpleType simpleType7 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory1.moreSpecificType((com.fasterxml.jackson.databind.JavaType) simpleType6, (com.fasterxml.jackson.databind.JavaType) simpleType7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory1._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory1._parser;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeParser10._factory;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeParser10._factory;
        java.lang.ClassLoader classLoader13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory12.withClassLoader(classLoader13);
        com.fasterxml.jackson.databind.type.TypeParser typeParser15 = new com.fasterxml.jackson.databind.type.TypeParser(typeFactory14);
        java.lang.Class<?> wildcardClass17 = typeFactory14._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(simpleType6);
        org.junit.Assert.assertNotNull(simpleType7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer myTokenizer1 = new com.fasterxml.jackson.databind.type.TypeParser.MyTokenizer("");
        myTokenizer1._index = 1;
        java.lang.String str4 = myTokenizer1._pushbackToken;
        java.lang.String str5 = myTokenizer1.getAllInput();
        boolean boolean6 = myTokenizer1.hasMoreTokens();
        java.util.Iterator<java.lang.Object> objItor7 = myTokenizer1.asIterator();
        java.lang.String str8 = myTokenizer1.getAllInput();
        int int9 = myTokenizer1._index;
        myTokenizer1.pushBack("hi!");
        int int12 = myTokenizer1._index;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }
}

