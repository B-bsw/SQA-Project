package com.fasterxml.jackson.databind;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.inclusion(as1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = stdTypeResolverBuilder0.buildTypeDeserializer(deserializationConfig1, javaType2, namedTypeCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Can not build, 'init()' not yet called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList5 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList5, namedTypeArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = defaultTypeResolverBuilder1.buildTypeDeserializer(deserializationConfig2, javaType3, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = defaultTypeResolverBuilder1.buildTypeSerializer(serializationConfig2, javaType3, namedTypeCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray5 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList6, namedTypeArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = stdTypeResolverBuilder2.buildTypeSerializer(serializationConfig3, javaType4, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Can not build, 'init()' not yet called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(namedTypeArray5);
        org.junit.Assert.assertArrayEquals(namedTypeArray5, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.init(id2, typeIdResolver3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        java.lang.Class<?> wildcardClass1 = stdTypeResolverBuilder0.getClass();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray5 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList6, namedTypeArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = stdTypeResolverBuilder2.buildTypeDeserializer(deserializationConfig3, javaType4, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Can not build, 'init()' not yet called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(namedTypeArray5);
        org.junit.Assert.assertArrayEquals(namedTypeArray5, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.init(id1, typeIdResolver2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.inclusion(as1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
        java.lang.Class<?> wildcardClass1 = defaultTyping0.getClass();
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray5 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList6 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList6, namedTypeArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = stdTypeResolverBuilder0.buildTypeSerializer(serializationConfig3, javaType4, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Can not build, 'init()' not yet called");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(namedTypeArray5);
        org.junit.Assert.assertArrayEquals(namedTypeArray5, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        java.lang.Class<?> wildcardClass1 = stdTypeResolverBuilder0.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.inclusion(as2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper0.writeValue(jsonGenerator1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: [no message for java.lang.NullPointerException]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.cfg.BaseSettings baseSettings0 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_BASE;
        org.junit.Assert.assertNotNull(baseSettings0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping5 = objectMapper2.convertValue((java.lang.Object) 0.0d, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.core.FormatSchema formatSchema3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader4 = objectMapper0.reader(formatSchema3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = stdTypeResolverBuilder3.typeProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper2.setDefaultTyping((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder>) stdTypeResolverBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        objectMapper0.registerSubtypes(namedTypeArray4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1 };
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.Format format10 = objectMapper0.readValue(byteArray8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature2 = null;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature3 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray4 = new com.fasterxml.jackson.databind.SerializationFeature[] { serializationFeature3 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.disable(serializationFeature2, serializationFeatureArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(serializationFeatureArray4);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray4, new com.fasterxml.jackson.databind.SerializationFeature[] { null });
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator2 = null;
        java.lang.Object obj3 = objectMapper0.setHandlerInstantiator(handlerInstantiator2);
        com.fasterxml.jackson.annotation.PropertyAccessor propertyAccessor4 = null;
        com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper0.setVisibility(propertyAccessor4, visibility5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker0 = com.fasterxml.jackson.databind.ObjectMapper.STD_VISIBILITY_CHECKER;
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        objectMapper0.registerSubtypes(namedTypeArray4);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectMapper0.readTree(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.annotation.PropertyAccessor propertyAccessor3 = null;
        com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setVisibility(propertyAccessor3, visibility4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = objectMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray4 = new com.fasterxml.jackson.databind.MapperFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.disable(mapperFeatureArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(mapperFeatureArray4);
        org.junit.Assert.assertArrayEquals(mapperFeatureArray4, new com.fasterxml.jackson.databind.MapperFeature[] {});
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.MapperFeature mapperFeature3 = null;
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray4 = new com.fasterxml.jackson.databind.MapperFeature[] { mapperFeature3 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.enable(mapperFeatureArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(mapperFeatureArray4);
        org.junit.Assert.assertArrayEquals(mapperFeatureArray4, new com.fasterxml.jackson.databind.MapperFeature[] { null });
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.core.TreeNode treeNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper2.writeTree(jsonGenerator8, treeNode9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: [no message for java.lang.NullPointerException]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectMapper0.createObjectNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = objectMapper4.reader(deserializationFeature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.core.JsonParser.Feature feature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objectMapper0.isEnabled(feature4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.core.TreeNode treeNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = objectMapper4.treeAsTokens(treeNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.core.JsonParser.Feature feature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper2.configure(feature4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader4 = objectMapper2.reader(contextAttributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator2 = null;
        java.lang.Object obj3 = objectMapper0.setHandlerInstantiator(handlerInstantiator2);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature4 = null;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature5 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray6 = new com.fasterxml.jackson.databind.SerializationFeature[] { serializationFeature5 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.disable(serializationFeature4, serializationFeatureArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(serializationFeatureArray6);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray6, new com.fasterxml.jackson.databind.SerializationFeature[] { null });
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.MapperFeature mapperFeature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper2.configure(mapperFeature5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectMapper2.readTree(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.disable(serializationFeature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = defaultTypeResolverBuilder1.inclusion(as2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper4.copy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        objectMapper0.registerSubtypes(namedTypeArray4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper0.writer(base64Variant7);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectMapper0.readTree(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertNotNull(defaultDeserializationContext6);
        org.junit.Assert.assertNotNull(objectWriter8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver4 = objectMapper3._mixIns;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper3.enable(deserializationFeature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(simpleMixInResolver4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.enableDefaultTyping(defaultTyping2);
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = objectMapper0.readValue(reader4, typeReference5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE));
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objectMapper2.isEnabled(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter4 = objectMapper2.writerWithType(javaType3);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectMapper2.readTree(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature8 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray9 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader10 = objectMapper7.reader(deserializationFeature8, deserializationFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(deserializationFeatureArray9);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray9, new com.fasterxml.jackson.databind.DeserializationFeature[] {});
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        java.lang.Iterable<com.fasterxml.jackson.databind.Module> moduleIterable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.registerModules(moduleIterable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        java.net.URL uRL6 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper5.readValue(uRL6, typeReference7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray6 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature5 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.disable(deserializationFeature4, deserializationFeatureArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(deserializationFeatureArray6);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray6, new com.fasterxml.jackson.databind.DeserializationFeature[] { null });
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = objectMapper2._initForReading(jsonParser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        java.lang.Class<?> wildcardClass2 = defaultTypeResolverBuilder1.getDefaultImpl();
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        com.fasterxml.jackson.core.type.TypeReference typeReference9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.DatabindContext databindContext10 = objectMapper2.readValue("hi!", typeReference9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = stdTypeResolverBuilder0.init(id3, typeIdResolver4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        objectMapper3.setFilters(filterProvider4);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = objectMapper2.writer(characterEscapes9);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(objectWriter10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver4 = objectMapper3._mixIns;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objectMapper3.isEnabled(serializationFeature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(simpleMixInResolver4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper12.disableDefaultTyping();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.ClassIntrospector classIntrospector3 = objectMapper0.defaultClassIntrospector();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(classIntrospector3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy5 = objectMapper4.getPropertyNamingStrategy();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper4.reader(formatSchema6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull(propertyNamingStrategy5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        java.io.Writer writer4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper5.enable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader12 = objectMapper10.readerForUpdating((java.lang.Object) annotationIntrospector11);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext13 = objectMapper10._deserializationContext;
        objectMapper9._deserializationContext = defaultDeserializationContext13;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = objectMapper9.getTypeFactory();
        // The following exception was thrown during execution in test generation
        try {
            objectMapper0.writeValue(writer4, (java.lang.Object) objectMapper9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No serializer found for class com.fasterxml.jackson.core.util.DefaultPrettyPrinter and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.fasterxml.jackson.databind.ObjectMapper[\"serializationConfig\"]->com.fasterxml.jackson.databind.SerializationConfig[\"defaultPrettyPrinter\"])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertArrayEquals(featureArray8, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(objectReader12);
        org.junit.Assert.assertNotNull(defaultDeserializationContext13);
        org.junit.Assert.assertNotNull(typeFactory15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator2 = null;
        java.lang.Object obj3 = objectMapper0.setHandlerInstantiator(handlerInstantiator2);
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = objectMapper0.getInjectableValues();
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(injectableValues4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.init(id1, typeIdResolver2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper2.clearProblemHandlers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objectMapper7.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker12 = objectMapper4.readValue(reader10, javaType11);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No content to map due to end-of-input? at [Source: UNKNOWN; line: 1, column: 0]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = objectMapper4.getTypeFactory();
        com.fasterxml.jackson.core.type.TypeReference typeReference12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.RandomAccess randomAccess13 = objectMapper4.readValue("hi!", typeReference12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = objectMapper6._deserializationConfig;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(deserializationConfig7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setAnnotationIntrospector(annotationIntrospector4);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature6 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray7 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper0.writer(serializationFeature6, serializationFeatureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializationFeatureArray7);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray7, new com.fasterxml.jackson.databind.SerializationFeature[] {});
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        com.fasterxml.jackson.databind.InjectableValues injectableValues9 = objectMapper2._injectableValues;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = objectMapper2.getSerializerProviderInstance();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNull(injectableValues9);
        org.junit.Assert.assertNotNull(serializerProvider10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper0.writeValue(writer4, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker4 = objectMapper3.getVisibilityChecker();
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.enableDefaultTyping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper4.disable(serializationFeature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper6.disable(deserializationFeature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeIdVisibility(true);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = stdTypeResolverBuilder0.inclusion(as4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectMapper5.readTree("hi!");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'hi': was expecting ('true', 'false' or 'null')? at [Source: hi!; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        java.lang.Class<?> wildcardClass6 = objectMapper5.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy5 = objectMapper4.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = objectMapper4.getDeserializationContext();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull(propertyNamingStrategy5);
        org.junit.Assert.assertNotNull(deserializationContext6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.MapperFeature mapperFeature8 = null;
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray9 = new com.fasterxml.jackson.databind.MapperFeature[] { mapperFeature8 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper7.enable(mapperFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(mapperFeatureArray9);
        org.junit.Assert.assertArrayEquals(mapperFeatureArray9, new com.fasterxml.jackson.databind.MapperFeature[] { null });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = objectMapper0.writer(base64Variant8);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectWriter9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(objectMapper0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory.Feature feature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objectMapper4.isEnabled(feature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeIdVisibility(false);
        boolean boolean4 = stdTypeResolverBuilder3.isTypeIdVisible();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = objectMapper4.writer(prettyPrinter10);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper4.writer();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectWriter12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeIdVisibility(true);
        java.lang.String str4 = stdTypeResolverBuilder0.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setLocale(locale1);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter4 = objectMapper0.writer(serializationFeature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter5 = objectMapper0.writer(filterProvider4);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objectMapper0.isEnabled(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
        org.junit.Assert.assertNotNull(objectWriter5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.enableDefaultTyping(defaultTyping2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectMapper3.readTree("hi!");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'hi': was expecting ('true', 'false' or 'null')? at [Source: hi!; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE));
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter5 = objectMapper0.writer(filterProvider4);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector7 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader8 = objectMapper6.readerForUpdating((java.lang.Object) annotationIntrospector7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper6.enable(featureArray9);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper11.readerForUpdating((java.lang.Object) annotationIntrospector12);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext14 = objectMapper11._deserializationContext;
        objectMapper10._deserializationContext = defaultDeserializationContext14;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory16 = objectMapper10.getTypeFactory();
        objectMapper0._typeFactory = typeFactory16;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory18 = objectMapper0._typeFactory;
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
        org.junit.Assert.assertNotNull(objectWriter5);
        org.junit.Assert.assertNotNull(annotationIntrospector7);
        org.junit.Assert.assertNotNull(objectReader8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertArrayEquals(featureArray9, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(annotationIntrospector12);
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(defaultDeserializationContext14);
        org.junit.Assert.assertNotNull(typeFactory16);
        org.junit.Assert.assertNotNull(typeFactory18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        java.io.InputStream inputStream7 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = objectMapper6.readValue(inputStream7, typeReference8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.core.FormatSchema formatSchema12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = objectMapper11.writer(formatSchema12);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(objectWriter13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeIdVisibility(true);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.inclusion(as3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objectMapper7.isEnabled(deserializationFeature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = objectMapper0._injectableValues;
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectMapper0.readTree(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(injectableValues4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setLocale(locale1);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(deserializationFeature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.enableDefaultTyping(defaultTyping2);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder4 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping2);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE));
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.core.type.TypeReference typeReference6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver7 = objectMapper2.readValue("\"\"", typeReference6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature8 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray9 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper4.disable(serializationFeature8, serializationFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(serializationFeatureArray9);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray9, new com.fasterxml.jackson.databind.SerializationFeature[] {});
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = stdTypeResolverBuilder3.inclusion(as4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        java.text.DateFormat dateFormat4 = objectMapper0.getDateFormat();
        com.fasterxml.jackson.core.Version version5 = objectMapper0.version();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(version5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.Class<?> wildcardClass3 = stdTypeResolverBuilder0.getDefaultImpl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setAnnotationIntrospector(annotationIntrospector4);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objectMapper5.isEnabled(deserializationFeature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter5 = objectMapper0.writer(filterProvider4);
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper0.reader(injectableValues6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
        org.junit.Assert.assertNotNull(objectWriter5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        int int4 = objectMapper2.mixInCount();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.core.TreeNode treeNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper2.writeTree(jsonGenerator5, treeNode6);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: [no message for java.lang.NullPointerException]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        java.text.DateFormat dateFormat4 = objectMapper0.getDateFormat();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray7 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature6 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader8 = objectMapper0.reader(deserializationFeature5, deserializationFeatureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(deserializationFeatureArray7);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray7, new com.fasterxml.jackson.databind.DeserializationFeature[] { null });
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = objectMapper0._injectableValues;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature5 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray7 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature6 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper0.enable(deserializationFeature5, deserializationFeatureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(injectableValues4);
        org.junit.Assert.assertNotNull(deserializationFeatureArray7);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray7, new com.fasterxml.jackson.databind.DeserializationFeature[] { null });
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.InjectableValues injectableValues1 = objectMapper0._injectableValues;
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.configure(feature2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(injectableValues1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setSerializationInclusion(include2);
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectMapper3.readTree(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        objectMapper0.registerSubtypes(namedTypeArray4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = objectMapper0._deserializationContext;
        java.io.File file7 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = objectMapper0.readValue(file7, typeReference8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertNotNull(defaultDeserializationContext6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = objectMapper4._typeFactory;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        java.lang.Class<?> wildcardClass1 = stdTypeResolverBuilder0.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.init(id2, typeIdResolver3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray5 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper0.enable(deserializationFeature4, deserializationFeatureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
        org.junit.Assert.assertNotNull(deserializationFeatureArray5);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray5, new com.fasterxml.jackson.databind.DeserializationFeature[] {});
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig5 = objectMapper4._serializationConfig;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper4.configure(serializationFeature6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(serializationConfig5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeIdVisibility(true);
        java.lang.String str4 = stdTypeResolverBuilder3.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        java.lang.String str3 = stdTypeResolverBuilder2.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectMapper0.readTree("hi!");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'hi': was expecting ('true', 'false' or 'null')? at [Source: hi!; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(serializationFeature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.setConfig(deserializationConfig3);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray5 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper4.disable(featureArray5);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig7 = objectMapper6._serializationConfig;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider8 = objectMapper0._serializerProvider(serializationConfig7);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objectMapper0.isEnabled(serializationFeature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertArrayEquals(featureArray5, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(serializationConfig7);
        org.junit.Assert.assertNotNull(defaultSerializerProvider8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        int int6 = objectMapper4.mixInCount();
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper4.setLocale(locale7);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objectMapper8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader5 = objectMapper3.reader(injectableValues4);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectReader5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        java.io.File file8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy10 = objectMapper9.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping11 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.enableDefaultTyping(defaultTyping11);
        com.fasterxml.jackson.core.Base64Variant base64Variant13 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = objectMapper9.reader(base64Variant13);
        // The following exception was thrown during execution in test generation
        try {
            objectMapper4.writeValue(file8, (java.lang.Object) objectMapper9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNull(propertyNamingStrategy10);
        org.junit.Assert.assertTrue("'" + defaultTyping11 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE + "'", defaultTyping11.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE));
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectReader14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = objectMapper4.getTypeFactory();
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objectMapper4.isEnabled(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides4 = objectMapper0._propertyOverrides;
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides5 = objectMapper0._propertyOverrides;
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(configOverrides4);
        org.junit.Assert.assertNotNull(configOverrides5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = null;
        objectMapper0._deserializationContext = defaultDeserializationContext6;
        com.fasterxml.jackson.core.JsonGenerator.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objectMapper0.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.core.JsonFactory.Feature feature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = objectMapper0.isEnabled(feature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature3 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray4 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.disable(deserializationFeature3, deserializationFeatureArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(deserializationFeatureArray4);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray4, new com.fasterxml.jackson.databind.DeserializationFeature[] {});
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        java.lang.Class<?> wildcardClass1 = stdTypeResolverBuilder0.getDefaultImpl();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        int int6 = objectMapper4.mixInCount();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objectMapper4.isEnabled(deserializationFeature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.init(id2, typeIdResolver3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader12 = objectMapper10.readerForUpdating((java.lang.Object) annotationIntrospector11);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray13 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper10.enable(featureArray13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = objectMapper14.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper14.setPropertyNamingStrategy(propertyNamingStrategy16);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides18 = objectMapper17._propertyOverrides;
        objectMapper4._propertyOverrides = configOverrides18;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNotNull(annotationIntrospector11);
        org.junit.Assert.assertNotNull(objectReader12);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertArrayEquals(featureArray13, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(configOverrides18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature5 = null;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature6 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray7 = new com.fasterxml.jackson.databind.SerializationFeature[] { serializationFeature6 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper2.enable(serializationFeature5, serializationFeatureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(serializationFeatureArray7);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray7, new com.fasterxml.jackson.databind.SerializationFeature[] { null });
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = objectMapper4.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = objectMapper4.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objectMapper4.isEnabled(feature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(objectWriter11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        java.text.DateFormat dateFormat4 = objectMapper0.getDateFormat();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy5);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(objectMapper6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper6.setDefaultPrettyPrinter(prettyPrinter7);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = objectMapper8.writer(filterProvider9);
        java.lang.Class<?> wildcardClass11 = objectWriter10.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        java.lang.Class<?> wildcardClass3 = stdTypeResolverBuilder0.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = stdTypeResolverBuilder0.inclusion(as4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides6 = objectMapper5._propertyOverrides;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(configOverrides6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper0.configure(deserializationFeature6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeProperty("10");
        java.lang.String str5 = stdTypeResolverBuilder2.getTypeProperty();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = stdTypeResolverBuilder2.inclusion(as6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper2._mixIns;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter5 = objectMapper2.writer(serializationFeature4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper6.writer(formatSchema7);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig9 = objectMapper6.getSerializationConfig();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(serializationConfig9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        java.lang.Class<?> wildcardClass5 = stdTypeResolverBuilder4.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = stdTypeResolverBuilder4.typeIdVisibility(false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        objectMapper0.registerSubtypes(namedTypeArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = objectMapper0.getNodeFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = objectMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker4 = objectMapper2.getVisibilityChecker();
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectMapper2.readValue(reader5, typeReference6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides8 = objectMapper7._propertyOverrides;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature9 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray10 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper7.disable(serializationFeature9, serializationFeatureArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(configOverrides8);
        org.junit.Assert.assertNotNull(serializationFeatureArray10);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray10, new com.fasterxml.jackson.databind.SerializationFeature[] {});
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = defaultTypeResolverBuilder1._appliesFor;
        boolean boolean3 = defaultTypeResolverBuilder1.isTypeIdVisible();
        boolean boolean4 = defaultTypeResolverBuilder1.isTypeIdVisible();
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver5 = objectMapper0.getSubtypeResolver();
        java.text.DateFormat dateFormat6 = objectMapper0.getDateFormat();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectMapper0.readTree(byteArray8);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Illegal character ((CTRL-CHAR, code 1)): only regular white space (\\r, \\n, \\t) is allowed between tokens? at [Source: [B@77f08f44; line: 1, column: 2]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(subtypeResolver5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1 });
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = objectMapper0._injectableValues;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = objectMapper0._deserializationConfig;
        com.fasterxml.jackson.core.Base64Variant base64Variant6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper0.reader(base64Variant6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(injectableValues4);
        org.junit.Assert.assertNull(deserializationConfig5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides8 = objectMapper7._propertyOverrides;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList9 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper7.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList9);
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = objectMapper10._rootDeserializers;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(configOverrides8);
        org.junit.Assert.assertNotNull(moduleList9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory3);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper4.enable(serializationFeature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setSerializationInclusion(include2);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes4 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader5 = objectMapper0.reader(contextAttributes4);
        java.util.Set<java.lang.Object> objSet6 = objectMapper0._registeredModuleTypes;
        java.io.File file7 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver9 = objectMapper0.readValue(file7, typeReference8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectReader5);
        org.junit.Assert.assertNull(objSet6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy5 = objectMapper4.getPropertyNamingStrategy();
        java.io.Reader reader6 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objectMapper4.readValue(reader6, typeReference7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull(propertyNamingStrategy5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder3 = stdTypeResolverBuilder0.typeIdVisibility(true);
        boolean boolean4 = stdTypeResolverBuilder3.isTypeIdVisible();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = objectMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker4 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper2.disable(serializationFeature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder4.typeIdVisibility(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = defaultTypeResolverBuilder1._appliesFor;
        boolean boolean3 = defaultTypeResolverBuilder1.isTypeIdVisible();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping4 = defaultTypeResolverBuilder1._appliesFor;
        boolean boolean5 = defaultTypeResolverBuilder1.isTypeIdVisible();
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + defaultTyping4 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping4.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = objectMapper4.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = objectMapper4.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector13 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = objectMapper12.readerForUpdating((java.lang.Object) annotationIntrospector13);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray15 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper12.enable(featureArray15);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = objectMapper16.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector20 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader21 = objectMapper19.readerForUpdating((java.lang.Object) annotationIntrospector20);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext22 = objectMapper19._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory17, defaultSerializerProvider18, defaultDeserializationContext22);
        objectMapper4._deserializationContext = defaultDeserializationContext22;
        java.lang.Class<?> wildcardClass25 = objectMapper4.getClass();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(annotationIntrospector13);
        org.junit.Assert.assertNotNull(objectReader14);
        org.junit.Assert.assertNotNull(featureArray15);
        org.junit.Assert.assertArrayEquals(featureArray15, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(annotationIntrospector20);
        org.junit.Assert.assertNotNull(objectReader21);
        org.junit.Assert.assertNotNull(defaultDeserializationContext22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder0.inclusion(as5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = objectMapper2.writerWithDefaultPrettyPrinter();
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version6 = objectMapper2.readValue(reader4, typeReference5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver4 = objectMapper3._mixIns;
        com.fasterxml.jackson.annotation.JsonInclude.Value value5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper3.setPropertyInclusion(value5);
        com.fasterxml.jackson.databind.InjectableValues injectableValues7 = objectMapper6._injectableValues;
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(simpleMixInResolver4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNull(injectableValues7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper3.setTimeZone(timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        objectMapper0._injectableValues = injectableValues4;
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder2.inclusion(as5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder2 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder3 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider4 = objectMapper0._serializerProvider;
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = objectMapper0.writer(base64Variant5);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides7 = objectMapper0._propertyOverrides;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature8 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray9 = new com.fasterxml.jackson.databind.SerializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper0.disable(serializationFeature8, serializationFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(defaultSerializerProvider4);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(configOverrides7);
        org.junit.Assert.assertNotNull(serializationFeatureArray9);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray9, new com.fasterxml.jackson.databind.SerializationFeature[] {});
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = objectMapper12._jsonFactory;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory13);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(jsonFactory13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setAnnotationIntrospector(annotationIntrospector4);
        java.io.InputStream inputStream6 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializable.Base base8 = objectMapper5.readValue(inputStream6, typeReference7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeProperty("10");
        java.lang.String str5 = stdTypeResolverBuilder2.getTypeProperty();
        boolean boolean6 = stdTypeResolverBuilder2.isTypeIdVisible();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder4.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = stdTypeResolverBuilder6.inclusion(as7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = objectMapper5._typeFactory;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature7 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature8 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray9 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature8 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper5.disable(deserializationFeature7, deserializationFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(deserializationFeatureArray9);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray9, new com.fasterxml.jackson.databind.DeserializationFeature[] { null });
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeIdVisibility(false);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder2.typeIdVisibility(false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = objectMapper0.setHandlerInstantiator(handlerInstantiator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = null;
        objectMapper0._deserializationContext = defaultDeserializationContext6;
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = objectMapper0.writer(base64Variant8);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectWriter9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides4 = objectMapper0._propertyOverrides;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = objectMapper5.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper5.setNodeFactory(jsonNodeFactory7);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides9 = objectMapper5._propertyOverrides;
        objectMapper0._propertyOverrides = configOverrides9;
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper0.writer(contextAttributes11);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(configOverrides4);
        org.junit.Assert.assertNull(propertyNamingStrategy6);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(configOverrides9);
        org.junit.Assert.assertNotNull(objectWriter12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.InjectableValues injectableValues3 = objectMapper0._injectableValues;
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNull(injectableValues3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = objectMapper0._injectableValues;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = objectMapper0._deserializationConfig;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = objectMapper0._typeFactory;
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(injectableValues4);
        org.junit.Assert.assertNull(deserializationConfig5);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = objectMapper2.writerWithDefaultPrettyPrinter();
        java.text.DateFormat dateFormat4 = objectMapper2.getDateFormat();
        com.fasterxml.jackson.databind.InjectableValues injectableValues5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader6 = objectMapper2.reader(injectableValues5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator2 = null;
        java.lang.Object obj3 = objectMapper0.setHandlerInstantiator(handlerInstantiator2);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.clearProblemHandlers();
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objectMapper4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext5 = objectMapper4._deserializationContext;
        com.fasterxml.jackson.core.Version version6 = objectMapper4.version();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = objectMapper4.getDeserializationContext();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(defaultDeserializationContext5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(deserializationContext7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.ObjectReader objectReader8 = objectMapper7.reader();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectReader8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = defaultTypeResolverBuilder1._appliesFor;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder3 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping2);
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides8 = objectMapper7._propertyOverrides;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList9 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper7.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList9);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = objectMapper10.createArrayNode();
        com.fasterxml.jackson.core.Base64Variant base64Variant12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper10.reader(base64Variant12);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(configOverrides8);
        org.junit.Assert.assertNotNull(moduleList9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(arrayNode11);
        org.junit.Assert.assertNotNull(objectReader13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        java.lang.String str5 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.Class<?> wildcardClass6 = stdTypeResolverBuilder0.getDefaultImpl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder2 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = defaultTypeResolverBuilder2.init(id3, typeIdResolver4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        java.text.DateFormat dateFormat4 = objectMapper0.getDateFormat();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = objectMapper0._rootDeserializers;
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig6 = objectMapper0._serializationConfig;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(serializationConfig6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext13 = objectMapper12._deserializationContext;
        com.fasterxml.jackson.databind.MapperFeature mapperFeature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper12.configure(mapperFeature14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(defaultDeserializationContext13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = objectMapper11._jsonFactory;
        java.lang.ClassLoader classLoader13 = null;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList14 = com.fasterxml.jackson.databind.ObjectMapper.findModules(classLoader13);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper11.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList14);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature16 = null;
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature17 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray18 = new com.fasterxml.jackson.databind.DeserializationFeature[] { deserializationFeature17 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper11.enable(deserializationFeature16, deserializationFeatureArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(moduleList14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(deserializationFeatureArray18);
        org.junit.Assert.assertArrayEquals(deserializationFeatureArray18, new com.fasterxml.jackson.databind.DeserializationFeature[] { null });
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper0.writer(formatSchema6);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper0.configure(serializationFeature8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig8 = objectMapper4.getDeserializationConfig();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(deserializationConfig8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.introspect.ClassIntrospector classIntrospector4 = objectMapper0.defaultClassIntrospector();
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(classIntrospector4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeIdVisibility(false);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder4.typeIdVisibility(false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray4 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        objectMapper0.registerSubtypes(namedTypeArray4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper0.writer(base64Variant7);
        java.io.OutputStream outputStream9 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper0.writeValue(outputStream9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(namedTypeArray4);
        org.junit.Assert.assertArrayEquals(namedTypeArray4, new com.fasterxml.jackson.databind.jsontype.NamedType[] {});
        org.junit.Assert.assertNotNull(defaultDeserializationContext6);
        org.junit.Assert.assertNotNull(objectWriter8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonParser.Feature feature3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.configure(feature3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setSerializationInclusion(include2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader5 = objectMapper3.reader(formatSchema4);
        java.io.OutputStream outputStream6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray10 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper7.enable(featureArray10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = objectMapper11.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper11.setPropertyNamingStrategy(propertyNamingStrategy13);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides15 = objectMapper14._propertyOverrides;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList16 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper14.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList16);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver18 = objectMapper17._subtypeResolver;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper3.writeValue(outputStream6, (java.lang.Object) objectMapper17);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No serializer found for class com.fasterxml.jackson.core.util.DefaultPrettyPrinter and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.fasterxml.jackson.databind.ObjectMapper[\"serializationConfig\"]->com.fasterxml.jackson.databind.SerializationConfig[\"defaultPrettyPrinter\"])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectReader5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertArrayEquals(featureArray10, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(configOverrides15);
        org.junit.Assert.assertNotNull(moduleList16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(subtypeResolver18);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectMapper2.readTree(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = objectMapper11._jsonFactory;
        java.lang.ClassLoader classLoader13 = null;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList14 = com.fasterxml.jackson.databind.ObjectMapper.findModules(classLoader13);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper11.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList14);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver16 = objectMapper15._subtypeResolver;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig17 = objectMapper15._deserializationConfig;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(moduleList14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(subtypeResolver16);
        org.junit.Assert.assertNotNull(deserializationConfig17);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder0.inclusion(as5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        java.lang.Class<?> wildcardClass5 = stdTypeResolverBuilder4.getDefaultImpl();
        java.lang.String str6 = stdTypeResolverBuilder4.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides8 = objectMapper7._propertyOverrides;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = objectMapper7.getNodeFactory();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory10 = objectMapper7._serializerFactory;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(configOverrides8);
        org.junit.Assert.assertNotNull(jsonNodeFactory9);
        org.junit.Assert.assertNotNull(serializerFactory10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = objectMapper0.getSerializerProviderInstance();
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(serializerProvider4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectMapper5.readTree(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setAnnotationIntrospector(annotationIntrospector4);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper0.writer(prettyPrinter6);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig8 = objectMapper7.getSerializationConfig();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(serializationConfig8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext5 = objectMapper4._deserializationContext;
        com.fasterxml.jackson.core.Version version6 = objectMapper4.version();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = objectMapper4._rootDeserializers;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(defaultDeserializationContext5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder2 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        java.lang.Class<?> wildcardClass3 = defaultTypeResolverBuilder2.getDefaultImpl();
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.copy();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectMapper5.readTree(byteArray11);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'T?': was expecting ('true', 'false' or 'null')? at [Source: [B@166bb20; line: 2, column: 2]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes6 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper0.reader(contextAttributes6);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectReader7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper4.writer(prettyPrinter6);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper6.writer(formatSchema7);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        objectMapper9._deserializationConfig = deserializationConfig10;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader12 = objectMapper6.readerForUpdating((java.lang.Object) deserializationConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectWriter8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        com.fasterxml.jackson.databind.InjectableValues injectableValues9 = objectMapper2._injectableValues;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = objectMapper2._rootDeserializers;
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNull(injectableValues9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        objectMapper0._deserializationConfig = deserializationConfig1;
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver3 = objectMapper0._mixIns;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter5 = objectMapper0.writer(filterProvider4);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper0.writer(contextAttributes6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = new com.fasterxml.jackson.databind.ObjectMapper(objectMapper0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleMixInResolver3);
        org.junit.Assert.assertNotNull(objectWriter5);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.inclusion(as3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        boolean boolean5 = stdTypeResolverBuilder4.isTypeIdVisible();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = stdTypeResolverBuilder4.init(id6, typeIdResolver7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = objectMapper0.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str5 = stdTypeResolverBuilder4.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = stdTypeResolverBuilder4.typeIdVisibility(false);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder9 = stdTypeResolverBuilder7.typeProperty("10");
        // The following exception was thrown during execution in test generation
        try {
            objectMapper0._configAndWriteValue(jsonGenerator3, (java.lang.Object) stdTypeResolverBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker3 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper2._newWriter(serializationConfig4, javaType5, prettyPrinter6);
        java.text.DateFormat dateFormat8 = objectMapper2.getDateFormat();
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.Module[] moduleArray11 = objectMapper2.readValue(reader9, typeReference10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker3);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setSerializationInclusion(include2);
        com.fasterxml.jackson.annotation.JsonInclude.Value value4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setPropertyInclusion(value4);
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver6 = objectMapper5._mixIns;
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(simpleMixInResolver6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig5 = objectMapper4._serializationConfig;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper4.writer(characterEscapes6);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(serializationConfig5);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = objectMapper5._typeFactory;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper5.writer();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = objectMapper5.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy10 = objectMapper9.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory11 = null;
        objectMapper9._serializerFactory = serializerFactory11;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper9.setFilterProvider(filterProvider13);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext15 = null;
        objectMapper9._deserializationContext = defaultDeserializationContext15;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory17 = objectMapper9._typeFactory;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper5.setTypeFactory(typeFactory17);
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(propertyNamingStrategy10);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(typeFactory17);
        org.junit.Assert.assertNotNull(objectMapper18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides4 = objectMapper0._propertyOverrides;
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory5 = objectMapper0._serializerFactory;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper6.setConfig(deserializationConfig7);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker9 = objectMapper8.getVisibilityChecker();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = objectMapper8._newWriter(serializationConfig10, javaType11, prettyPrinter12);
        java.text.DateFormat dateFormat14 = objectMapper8.getDateFormat();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper0.writer(dateFormat14);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(configOverrides4);
        org.junit.Assert.assertNotNull(serializerFactory5);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker9);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(objectWriter15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeProperty("10");
        java.lang.String str5 = stdTypeResolverBuilder2.getTypeProperty();
        java.lang.String str6 = stdTypeResolverBuilder2.getTypeProperty();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = objectMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker4 = objectMapper2.getVisibilityChecker();
        com.fasterxml.jackson.databind.Module module5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper2.registerModule(module5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = null;
        objectMapper0._deserializationContext = defaultDeserializationContext6;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = objectMapper0._typeFactory;
        com.fasterxml.jackson.core.JsonGenerator.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper0.configure(feature9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.init(id2, typeIdResolver3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.cfg.ConfigOverrides configOverrides8 = objectMapper7._propertyOverrides;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper7.disable(serializationFeature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(configOverrides8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = stdTypeResolverBuilder4.init(id5, typeIdResolver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = null;
        objectMapper0._deserializationContext = defaultDeserializationContext6;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = objectMapper0._typeFactory;
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig9 = objectMapper0.getSerializationConfig();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = objectMapper0._rootDeserializers;
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(serializationConfig9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig5 = objectMapper4._serializationConfig;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = objectMapper4._jsonFactory;
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(serializationConfig5);
        org.junit.Assert.assertNotNull(jsonFactory6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext3 = objectMapper0._deserializationContext;
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = objectMapper5._typeFactory;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper5.writer();
        com.fasterxml.jackson.databind.InjectableValues injectableValues8 = null;
        objectMapper5._injectableValues = injectableValues8;
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(defaultDeserializationContext3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        java.lang.String str5 = stdTypeResolverBuilder0.getTypeProperty();
        boolean boolean6 = stdTypeResolverBuilder0.isTypeIdVisible();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = objectMapper0.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature3 = null;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature4 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray5 = new com.fasterxml.jackson.databind.SerializationFeature[] { serializationFeature4 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = objectMapper0.writer(serializationFeature3, serializationFeatureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(serializationFeatureArray5);
        org.junit.Assert.assertArrayEquals(serializationFeatureArray5, new com.fasterxml.jackson.databind.SerializationFeature[] { null });
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setNodeFactory(jsonNodeFactory2);
        com.fasterxml.jackson.databind.introspect.SimpleMixInResolver simpleMixInResolver4 = objectMapper3._mixIns;
        com.fasterxml.jackson.annotation.JsonInclude.Value value5 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper3.setPropertyInclusion(value5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        objectMapper3._deserializationConfig = deserializationConfig7;
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(simpleMixInResolver4);
        org.junit.Assert.assertNotNull(objectMapper6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = objectMapper7.readerForUpdating((java.lang.Object) annotationIntrospector8);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext10 = objectMapper7._deserializationContext;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5, defaultSerializerProvider6, defaultDeserializationContext10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = objectMapper12._jsonFactory;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.enableDefaultTyping();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(annotationIntrospector8);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(defaultDeserializationContext10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(objectMapper14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = defaultTypeResolverBuilder1._appliesFor;
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        java.lang.Class<?> wildcardClass2 = defaultTypeResolverBuilder1.getDefaultImpl();
        com.fasterxml.jackson.annotation.JsonTypeInfo.Id id3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolver4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = defaultTypeResolverBuilder1.init(id3, typeIdResolver4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: idType can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver5 = objectMapper0.getSubtypeResolver();
        java.text.DateFormat dateFormat6 = objectMapper0.getDateFormat();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper0.copy();
        java.io.Reader reader8 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping> defaultTypingEnum10 = objectMapper7.readValue(reader8, typeReference9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(subtypeResolver5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(objectMapper7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setLocale(locale1);
        com.fasterxml.jackson.annotation.PropertyAccessor propertyAccessor3 = null;
        com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setVisibility(propertyAccessor3, visibility4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        java.lang.Class<?> wildcardClass3 = stdTypeResolverBuilder0.getDefaultImpl();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = stdTypeResolverBuilder0.typeIdVisibility(true);
        boolean boolean6 = stdTypeResolverBuilder0.isTypeIdVisible();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = defaultTypeResolverBuilder1._appliesFor;
        boolean boolean3 = defaultTypeResolverBuilder1.isTypeIdVisible();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping4 = defaultTypeResolverBuilder1._appliesFor;
        java.lang.Class<?> wildcardClass5 = defaultTypeResolverBuilder1.getDefaultImpl();
        boolean boolean6 = defaultTypeResolverBuilder1.isTypeIdVisible();
        java.lang.String str7 = defaultTypeResolverBuilder1.getTypeProperty();
        org.junit.Assert.assertTrue("'" + defaultTyping0 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping0.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + defaultTyping2 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping2.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + defaultTyping4 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL + "'", defaultTyping4.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL));
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        java.lang.String str5 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder7 = stdTypeResolverBuilder0.inclusion(as6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = null;
        objectMapper0._serializerFactory = serializerFactory2;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setFilterProvider(filterProvider4);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext6 = null;
        objectMapper0._deserializationContext = defaultDeserializationContext6;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = objectMapper0._typeFactory;
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = objectMapper0.writer(filterProvider9);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(objectWriter10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setSerializationInclusion(include2);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes4 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader5 = objectMapper0.reader(contextAttributes4);
        java.util.Set<java.lang.Object> objSet6 = objectMapper0._registeredModuleTypes;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectMapper0.readTree("hi!");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'hi': was expecting ('true', 'false' or 'null')? at [Source: hi!; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectReader5);
        org.junit.Assert.assertNull(objSet6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.setConfig(deserializationConfig3);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray5 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper4.disable(featureArray5);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig7 = objectMapper6._serializationConfig;
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider8 = objectMapper0._serializerProvider(serializationConfig7);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectMapper0.readTree("\"\"");
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertArrayEquals(featureArray5, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(serializationConfig7);
        org.junit.Assert.assertNotNull(defaultSerializerProvider8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper4.setPropertyNamingStrategy(propertyNamingStrategy6);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper7.findAndRegisterModules();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper0.setSerializationInclusion(include2);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes4 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader5 = objectMapper0.reader(contextAttributes4);
        java.util.Set<java.lang.Object> objSet6 = objectMapper0._registeredModuleTypes;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = objectMapper0.writer(serializationFeature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectReader5);
        org.junit.Assert.assertNull(objSet6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy5 = objectMapper4.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.MapperFeature mapperFeature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper4.configure(mapperFeature6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull(propertyNamingStrategy5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy1 = objectMapper0.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator2 = null;
        java.lang.Object obj3 = objectMapper0.setHandlerInstantiator(handlerInstantiator2);
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.setInjectableValues(injectableValues4);
        org.junit.Assert.assertNull(propertyNamingStrategy1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objectMapper5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder0.typeProperty("hi!");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder2.typeIdVisibility(false);
        java.lang.Class<?> wildcardClass5 = stdTypeResolverBuilder4.getDefaultImpl();
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper0.getFactory();
        com.fasterxml.jackson.databind.InjectableValues injectableValues4 = objectMapper0._injectableValues;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig5 = objectMapper0._deserializationConfig;
        java.lang.Class<?> wildcardClass6 = objectMapper0.getClass();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(injectableValues4);
        org.junit.Assert.assertNull(deserializationConfig5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
        java.lang.String str1 = stdTypeResolverBuilder0.getTypeProperty();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeProperty("\"\"");
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder0.inclusion(as5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = objectMapper4.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory5);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper6.setDefaultPrettyPrinter(prettyPrinter7);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = objectMapper6.getNodeFactory();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(jsonNodeFactory9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setConfig(deserializationConfig1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper2.disable(featureArray3);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy5 = objectMapper4.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory6 = objectMapper4.getSerializerFactory();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objectMapper4.isEnabled(deserializationFeature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNull(propertyNamingStrategy5);
        org.junit.Assert.assertNotNull(serializerFactory6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        boolean boolean1 = stdTypeResolverBuilder0.isTypeIdVisible();
        java.lang.String str2 = stdTypeResolverBuilder0.getTypeProperty();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = stdTypeResolverBuilder0.typeIdVisibility(false);
        boolean boolean5 = stdTypeResolverBuilder4.isTypeIdVisible();
        java.lang.String str6 = stdTypeResolverBuilder4.getTypeProperty();
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = stdTypeResolverBuilder4.inclusion(as7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setLocale(locale1);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider3 = null;
        objectMapper0.setFilters(filterProvider3);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = objectMapper0.writer(formatSchema5);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = objectMapper0.writerWithDefaultPrettyPrinter();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(objectWriter7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping0 = null;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder1 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping0);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping2 = defaultTypeResolverBuilder1._appliesFor;
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder4 = defaultTypeResolverBuilder1.typeIdVisibility(false);
        com.fasterxml.jackson.annotation.JsonTypeInfo.As as5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder6 = stdTypeResolverBuilder4.inclusion(as5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: includeAs can not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(defaultTyping2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader2 = objectMapper0.readerForUpdating((java.lang.Object) annotationIntrospector1);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray3 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = objectMapper0.enable(featureArray3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector6 = com.fasterxml.jackson.databind.ObjectMapper.DEFAULT_ANNOTATION_INTROSPECTOR;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.readerForUpdating((java.lang.Object) annotationIntrospector6);
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext defaultDeserializationContext8 = objectMapper5._deserializationContext;
        objectMapper4._deserializationContext = defaultDeserializationContext8;
        com.fasterxml.jackson.databind.InjectableValues injectableValues10 = objectMapper4.getInjectableValues();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = objectMapper4.writerWithDefaultPrettyPrinter();
        org.junit.Assert.assertNotNull(annotationIntrospector1);
        org.junit.Assert.assertNotNull(objectReader2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertArrayEquals(featureArray3, new com.fasterxml.jackson.core.JsonGenerator.Feature[] {});
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(annotationIntrospector6);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(defaultDeserializationContext8);
        org.junit.Assert.assertNull(injectableValues10);
        org.junit.Assert.assertNotNull(objectWriter11);
    }
}

