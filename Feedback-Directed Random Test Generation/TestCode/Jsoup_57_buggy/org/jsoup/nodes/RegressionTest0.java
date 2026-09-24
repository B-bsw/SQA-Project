package org.jsoup.nodes;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = org.jsoup.nodes.Attributes.dataPrefix;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data-" + "'", str0, "data-");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes2.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes2.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.lang.Class<?> wildcardClass9 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str5 = attributes0.html();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute1 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        // The following exception was thrown during execution in test generation
        try {
            attributes1.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "data-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.lang.String str4 = attributes1.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeItor8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("hi!");
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("data-");
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributes1.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        java.lang.String str7 = attributes1.getIgnoreCase("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes1.html(appendable8, outputSettings9);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.lang.String str16 = attributes0.get("data-");
        java.lang.Class<?> wildcardClass17 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("hi!");
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        int int4 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        // The following exception was thrown during execution in test generation
        try {
            attributes4.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        java.lang.Class<?> wildcardClass10 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        attributes0.put("hi!", false);
        java.lang.Class<?> wildcardClass13 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.addAll(attributes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        int int5 = attributes1.size();
        boolean boolean7 = attributes1.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes9.asList();
        attributes9.put("data-", true);
        attributes0.addAll(attributes9);
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        int int4 = attributes0.size();
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes6);
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        java.lang.Class<?> wildcardClass3 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributes1.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes1.html(appendable13, outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            attributes1.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        boolean boolean8 = attributes5.equals((java.lang.Object) attributes6);
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes6.asList();
        attributes6.put("data-", "data-");
        attributes6.put("data-", false);
        boolean boolean17 = attributes6.hasKey("hi!");
        boolean boolean19 = attributes6.hasKey("hi!");
        attributes0.addAll(attributes6);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes2.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.String str8 = attributes0.toString();
        java.lang.Class<?> wildcardClass9 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        boolean boolean14 = attributes8.hasKey("");
        attributes0.addAll(attributes8);
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put("", "data-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        attributes0.html(appendable14, outputSettings15);
        java.lang.Class<?> wildcardClass17 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes4.get("hi!");
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        java.lang.Class<?> wildcardClass18 = attributes12.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        boolean boolean11 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.getIgnoreCase("hi!");
        attributes12.put("hi!", "");
        boolean boolean19 = attributes0.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = attributes0.hasKey("");
        java.lang.String str6 = attributes0.html();
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.lang.String str4 = attributes1.toString();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        int int9 = attributes0.size();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        attributes5.addAll(attributes14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = attributes14.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.lang.String str4 = attributes1.html();
        java.lang.String str5 = attributes1.html();
        int int6 = attributes1.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put("", "data-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.String str9 = attributes8.html();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        boolean boolean6 = attributes1.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes1.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeItor8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        attributes15.addAll(attributes17);
        attributes15.put("hi!", "hi!");
        attributes4.addAll(attributes15);
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes15.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor18);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        java.lang.String str29 = attributes0.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attributes4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.Class<?> wildcardClass10 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove("data-");
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str5 = attributes0.html();
        java.lang.String str6 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.put("data-", true);
        org.jsoup.nodes.Attributes attributes16 = attributes1.clone();
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        attributes2.put("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributes2.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        boolean boolean19 = attributes14.hasKeyIgnoreCase("");
        attributes0.addAll(attributes14);
        java.lang.Class<?> wildcardClass21 = attributes14.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        boolean boolean17 = attributes14.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes18.dataset();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        attributes18.addAll(attributes21);
        attributes14.addAll(attributes18);
        boolean boolean25 = attributes0.equals((java.lang.Object) attributes14);
        java.lang.Class<?> wildcardClass26 = attributes14.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        boolean boolean12 = attributes0.equals((java.lang.Object) "");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes0.iterator();
        java.lang.Class<?> wildcardClass14 = attributeItor13.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        attributes0.put("data-", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.lang.String str15 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str2 = attributes0.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        boolean boolean9 = attributes6.equals((java.lang.Object) attributes7);
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes7.asList();
        attributes7.put("data-", "data-");
        attributes7.put("data-", false);
        boolean boolean18 = attributes7.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes7.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes19.asList();
        attributes0.addAll(attributes19);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeList20);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        attributes5.put("hi!", "data-");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes1.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes13.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes4.spliterator();
        java.lang.Class<?> wildcardClass12 = attributeSpliterator11.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.hasKey("data-");
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        boolean boolean17 = attributes14.equals((java.lang.Object) attributes15);
        attributes1.addAll(attributes14);
        org.jsoup.nodes.Attributes attributes19 = attributes1.clone();
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        attributes15.addAll(attributes17);
        attributes15.put("hi!", "hi!");
        attributes4.addAll(attributes15);
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor18);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str5 = attributes0.html();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        int int6 = attributes0.size();
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        boolean boolean10 = attributes0.hasKey("hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.String str15 = attributes13.getIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass16 = attributes13.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        java.lang.String str19 = attributes12.get("hi!");
        boolean boolean21 = attributes12.hasKey("data-");
        org.jsoup.nodes.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes12.put(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        java.lang.Class<?> wildcardClass9 = attributeItor8.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes2.dataset();
        int int5 = attributes2.size();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        attributes2.addAll(attributes6);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes6.iterator();
        java.lang.String str17 = attributes6.html();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        attributes6.html(appendable18, outputSettings19);
        attributes0.addAll(attributes6);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes6.iterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor22);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        org.jsoup.nodes.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        boolean boolean19 = attributes14.hasKeyIgnoreCase("");
        attributes0.addAll(attributes14);
        boolean boolean22 = attributes0.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes0.html(appendable24, outputSettings25);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.Class<?> wildcardClass6 = strMap5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass8 = attributeSpliterator7.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeItor14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes7.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attributes6.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        attributes0.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes1.toString();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        attributes0.removeIgnoreCase("data-");
        java.lang.String str12 = attributes0.html();
        java.lang.Class<?> wildcardClass13 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        java.lang.String str19 = attributes12.get("hi!");
        boolean boolean21 = attributes12.hasKey("data-");
        attributes12.remove("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        int int10 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.lang.Class<?> wildcardClass13 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes4.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        attributes0.put("data-", false);
        java.lang.Class<?> wildcardClass17 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes4.get("hi!");
        int int15 = attributes4.size();
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        org.jsoup.nodes.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        boolean boolean8 = attributes5.equals((java.lang.Object) attributes6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes9.dataset();
        int int12 = attributes9.size();
        boolean boolean13 = attributes5.equals((java.lang.Object) attributes9);
        java.lang.Object obj14 = null;
        boolean boolean15 = attributes9.equals(obj14);
        attributes0.addAll(attributes9);
        boolean boolean18 = attributes0.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes4.toString();
        java.lang.Class<?> wildcardClass15 = attributes4.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        attributes0.removeIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        attributes6.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes6.dataset();
        attributes0.addAll(attributes6);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.removeIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass15 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes4.dataset();
        boolean boolean6 = attributes3.equals((java.lang.Object) attributes4);
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes4.asList();
        attributes4.put("data-", "data-");
        attributes4.put("data-", false);
        boolean boolean15 = attributes4.hasKey("hi!");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes4.html(appendable16, outputSettings17);
        boolean boolean20 = attributes4.hasKey("hi!");
        boolean boolean21 = attributes0.equals((java.lang.Object) boolean20);
        org.jsoup.nodes.Attributes attributes22 = attributes0.clone();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        attributes0.html(appendable23, outputSettings24);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes8.html(appendable13, outputSettings14);
        boolean boolean17 = attributes8.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes8.dataset();
        attributes0.addAll(attributes8);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes8.dataset();
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeList8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        boolean boolean9 = attributes7.hasKey("");
        java.lang.Class<?> wildcardClass10 = attributes7.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        boolean boolean12 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str13 = attributes0.toString();
        java.lang.Class<?> wildcardClass14 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        int int6 = attributes1.size();
        attributes1.removeIgnoreCase("hi!");
        int int9 = attributes1.size();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes10.dataset();
        int int13 = attributes10.size();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        attributes14.addAll(attributes16);
        boolean boolean20 = attributes14.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes14.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes14.iterator();
        attributes10.addAll(attributes14);
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes10.html(appendable24, outputSettings25);
        java.lang.String str28 = attributes10.getIgnoreCase("hi!");
        attributes1.addAll(attributes10);
        org.jsoup.nodes.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes10.put(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.lang.String str8 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " hi!=\"hi!\"" + "'", str8, " hi!=\"hi!\"");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes1.dataset();
        attributes1.put(" hi!=\"hi!\"", " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass7 = attributeSpliterator6.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attributes1.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = attributes2.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes10.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        int int5 = attributes1.size();
        java.lang.String str6 = attributes1.html();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes1.html(appendable7, outputSettings8);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.String str15 = attributes13.getIgnoreCase("hi!");
        int int16 = attributes13.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        boolean boolean14 = attributes8.hasKey("");
        attributes0.addAll(attributes8);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable16, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes4.iterator();
        int int7 = attributes4.size();
        attributes4.remove("hi!");
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        java.lang.String str15 = attributes11.html();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes11.dataset();
        java.lang.String str17 = attributes11.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes11.asList();
        attributes11.remove("data-");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        attributes11.html(appendable21, outputSettings22);
        java.lang.String str24 = attributes11.html();
        boolean boolean25 = attributes4.equals((java.lang.Object) attributes11);
        java.lang.String str27 = attributes4.getIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        attributes0.html(appendable14, outputSettings15);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass18 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = attributes4.equals(obj14);
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.toString();
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeList14);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        // The following exception was thrown during execution in test generation
        try {
            attributes12.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes7.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        attributes0.remove("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList13);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        java.lang.String str13 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str6 = attributes2.getIgnoreCase("hi!");
        attributes2.removeIgnoreCase(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass5 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        boolean boolean3 = attributes0.hasKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        boolean boolean8 = attributes5.equals((java.lang.Object) attributes6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes9.dataset();
        int int12 = attributes9.size();
        boolean boolean13 = attributes5.equals((java.lang.Object) attributes9);
        java.lang.Object obj14 = null;
        boolean boolean15 = attributes9.equals(obj14);
        attributes0.addAll(attributes9);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        attributes9.html(appendable17, outputSettings18);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str6 = attributes5.html();
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        attributes5.put("data-", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes5.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        attributes15.addAll(attributes17);
        boolean boolean21 = attributes15.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes15.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes15.iterator();
        attributes11.addAll(attributes15);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes15.iterator();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes26.spliterator();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes28.iterator();
        attributes26.addAll(attributes28);
        attributes26.put("hi!", "hi!");
        attributes15.addAll(attributes26);
        attributes1.addAll(attributes26);
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator37 = attributes36.spliterator();
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes38.iterator();
        attributes36.addAll(attributes38);
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator42 = attributes41.spliterator();
        java.lang.String str44 = attributes41.getIgnoreCase("hi!");
        int int45 = attributes41.size();
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor47 = attributes46.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor48 = attributes46.iterator();
        attributes41.addAll(attributes46);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = attributes46.dataset();
        java.lang.String str51 = attributes46.toString();
        boolean boolean52 = attributes36.equals((java.lang.Object) str51);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes36.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = attributes36.dataset();
        int int55 = attributes36.size();
        boolean boolean56 = attributes26.equals((java.lang.Object) attributes36);
        // The following exception was thrown during execution in test generation
        try {
            attributes26.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributeSpliterator37);
        org.junit.Assert.assertNotNull(attributeItor39);
        org.junit.Assert.assertNotNull(attributeSpliterator42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(attributeItor47);
        org.junit.Assert.assertNotNull(attributeItor48);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        boolean boolean14 = attributes1.hasKeyIgnoreCase("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        attributes1.html(appendable15, outputSettings16);
        java.lang.Class<?> wildcardClass18 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        attributes2.put("hi!", "hi!");
        boolean boolean12 = attributes2.hasKey("");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes13.dataset();
        int int16 = attributes13.size();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        attributes17.addAll(attributes19);
        boolean boolean23 = attributes17.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes17.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes17.iterator();
        attributes13.addAll(attributes17);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes17.iterator();
        java.lang.String str28 = attributes17.html();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        attributes17.html(appendable29, outputSettings30);
        boolean boolean32 = attributes2.equals((java.lang.Object) outputSettings30);
        java.lang.Class<?> wildcardClass33 = attributes2.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        boolean boolean19 = attributes14.hasKeyIgnoreCase("");
        attributes0.addAll(attributes14);
        boolean boolean22 = attributes0.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes23.html(appendable24, outputSettings25);
        boolean boolean28 = attributes23.hasKey("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.String str8 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        int int14 = attributes0.size();
        boolean boolean16 = attributes0.hasKey("");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        attributes0.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute33 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeList32);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes9.spliterator();
        java.lang.String str12 = attributes9.getIgnoreCase("data-");
        java.lang.String str13 = attributes9.html();
        org.jsoup.nodes.Attributes attributes14 = attributes9.clone();
        java.lang.String str15 = attributes14.html();
        attributes4.addAll(attributes14);
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes14.put(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        attributes0.remove("hi!");
        java.lang.String str13 = attributes0.toString();
        java.lang.Class<?> wildcardClass14 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = attributes0.hasKey("");
        java.lang.String str6 = attributes0.html();
        java.lang.String str7 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        attributes0.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        boolean boolean33 = attributes0.hasKey("");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        boolean boolean8 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        attributes0.put("data-", false);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes5.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeList6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes8.html(appendable13, outputSettings14);
        boolean boolean17 = attributes8.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes8.dataset();
        attributes0.addAll(attributes8);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str6 = attributes2.getIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.get("data-");
        java.lang.String str19 = attributes0.get("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        boolean boolean14 = attributes8.hasKey("");
        attributes0.addAll(attributes8);
        org.jsoup.nodes.Attributes attributes16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.addAll(attributes16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes6);
        boolean boolean17 = attributes0.hasKey(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList1 = attributes0.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeList1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        attributes1.remove("data-");
        java.lang.String str17 = attributes1.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("data-");
        boolean boolean23 = attributes18.hasKeyIgnoreCase("");
        boolean boolean24 = attributes1.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str11 = attributes0.getIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass12 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.String str10 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        java.lang.String str15 = attributes11.html();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes11.dataset();
        java.lang.String str17 = attributes11.html();
        attributes0.addAll(attributes11);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes11.dataset();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        boolean boolean14 = attributes1.hasKeyIgnoreCase("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        attributes1.html(appendable15, outputSettings16);
        org.jsoup.nodes.Attributes attributes18 = attributes1.clone();
        org.jsoup.nodes.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes1.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes1.spliterator();
        java.lang.Object obj16 = null;
        boolean boolean17 = attributes1.equals(obj16);
        org.jsoup.nodes.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        attributes0.remove("hi!");
        java.lang.String str13 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str11 = attributes0.getIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes2.put("hi!", "hi!");
        attributes2.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes2.dataset();
        boolean boolean12 = attributes2.hasKeyIgnoreCase(" hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes2.html(appendable13, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str8 = attributes0.get("hi!");
        java.lang.Class<?> wildcardClass9 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str5 = attributes0.toString();
        boolean boolean7 = attributes0.hasKeyIgnoreCase(" hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.lang.String str14 = attributes1.toString();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        boolean boolean18 = attributes15.equals((java.lang.Object) attributes16);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes19.dataset();
        int int22 = attributes19.size();
        boolean boolean23 = attributes15.equals((java.lang.Object) attributes19);
        attributes15.removeIgnoreCase("data-");
        attributes1.addAll(attributes15);
        org.jsoup.nodes.Attribute attribute27 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes15.put(attribute27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes1.html(appendable13, outputSettings14);
        boolean boolean17 = attributes1.hasKey("data-");
        java.lang.Class<?> wildcardClass18 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.lang.Class<?> wildcardClass2 = attributes0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        boolean boolean17 = attributes14.equals((java.lang.Object) attributes15);
        attributes1.addAll(attributes14);
        org.jsoup.nodes.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes9.asList();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes15.iterator();
        int int18 = attributes15.size();
        attributes15.remove("hi!");
        attributes11.addAll(attributes15);
        attributes9.addAll(attributes11);
        attributes0.addAll(attributes11);
        java.lang.String str25 = attributes11.get(" hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        attributes0.put("data-", "");
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        int int10 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        attributes0.put("hi!", "data-");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable16, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        int int14 = attributes0.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        boolean boolean19 = attributes15.hasKeyIgnoreCase("");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes15.html(appendable20, outputSettings21);
        attributes0.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes0.dataset();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.removeIgnoreCase("hi!");
        attributes1.removeIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put("", " hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = attributes4.equals(obj14);
        java.lang.Class<?> wildcardClass16 = obj14.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.put("data-", true);
        org.jsoup.nodes.Attributes attributes16 = attributes1.clone();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes16.html(appendable17, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        boolean boolean7 = attributes0.hasKeyIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        boolean boolean6 = attributes1.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes1.iterator();
        attributes1.put(" hi!", " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        int int12 = attributes5.size();
        java.lang.Class<?> wildcardClass13 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        attributes0.put("hi!", true);
        java.lang.String str7 = attributes0.get("data-");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes6);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes1.iterator();
        java.lang.String str5 = attributes1.toString();
        java.lang.String str6 = attributes1.html();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        attributes6.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes6.dataset();
        attributes0.addAll(attributes6);
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes6.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass2 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        java.lang.Class<?> wildcardClass12 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        boolean boolean9 = attributes7.hasKey("");
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes7.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.get("data-");
        java.lang.String str19 = attributes0.get("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes9.asList();
        attributes9.put("data-", true);
        attributes0.addAll(attributes9);
        boolean boolean18 = attributes9.hasKey(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = attributes4.equals(obj14);
        java.lang.Class<?> wildcardClass16 = attributes4.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes1.dataset();
        attributes1.put(" hi!=\"hi!\"", true);
        java.lang.String str18 = attributes1.get("hi!");
        java.lang.Class<?> wildcardClass19 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str15 = attributes5.get("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.lang.String str8 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " hi!=\"hi!\"" + "'", str8, " hi!=\"hi!\"");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        attributes5.put("data-", "hi!");
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        attributes0.put("hi!", true);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes12.dataset();
        boolean boolean14 = attributes11.equals((java.lang.Object) attributes12);
        boolean boolean16 = attributes12.hasKey("data-");
        java.lang.String str18 = attributes12.getIgnoreCase("hi!");
        attributes0.addAll(attributes12);
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable20, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.String str9 = attributes8.html();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes8.html(appendable10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str5 = attributes0.getIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str5 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.lang.String str4 = attributes1.html();
        java.lang.String str5 = attributes1.html();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        attributes0.put("data-", "hi!");
        boolean boolean8 = attributes0.hasKey("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.lang.String str15 = attributes4.html();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributeList8.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributeList8.spliterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        boolean boolean9 = attributes0.hasKey("hi!");
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        java.lang.String str7 = attributes1.getIgnoreCase("hi!");
        java.lang.String str9 = attributes1.get("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes1.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes1.dataset();
        attributes1.put("data-", "");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes1.asList();
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(attributeList15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.lang.String str14 = attributes1.toString();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        boolean boolean18 = attributes15.equals((java.lang.Object) attributes16);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes19.dataset();
        int int22 = attributes19.size();
        boolean boolean23 = attributes15.equals((java.lang.Object) attributes19);
        attributes15.removeIgnoreCase("data-");
        attributes1.addAll(attributes15);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = attributes28.dataset();
        boolean boolean30 = attributes27.equals((java.lang.Object) attributes28);
        java.util.List<org.jsoup.nodes.Attribute> attributeList31 = attributes28.asList();
        attributes28.put("data-", "data-");
        attributes28.put("data-", false);
        boolean boolean39 = attributes28.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes40 = attributes28.clone();
        boolean boolean42 = attributes40.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator44 = attributes43.spliterator();
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor46 = attributes45.iterator();
        attributes43.addAll(attributes45);
        attributes43.put("hi!", "hi!");
        java.lang.String str52 = attributes43.get("hi!");
        attributes43.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = attributes56.dataset();
        boolean boolean58 = attributes55.equals((java.lang.Object) attributes56);
        java.util.List<org.jsoup.nodes.Attribute> attributeList59 = attributes56.asList();
        attributes56.put("data-", "data-");
        attributes56.put("data-", false);
        boolean boolean67 = attributes56.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes68 = attributes56.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList69 = attributes68.asList();
        attributes43.addAll(attributes68);
        java.lang.String str71 = attributes43.html();
        attributes40.addAll(attributes43);
        attributes1.addAll(attributes43);
        org.jsoup.nodes.Attribute attribute74 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator44);
        org.junit.Assert.assertNotNull(attributeItor46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributeList59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(attributeList69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        boolean boolean8 = attributes0.hasKey("");
        java.lang.String str9 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.remove("hi!");
        java.lang.String str8 = attributes0.get(" hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.String str15 = attributes13.getIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes13.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes5.dataset();
        attributes5.put(" hi!=\"hi!\"", true);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.String str9 = attributes8.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes8.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        boolean boolean11 = attributes0.hasKeyIgnoreCase("");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes4.iterator();
        int int7 = attributes4.size();
        attributes4.remove("hi!");
        attributes0.addAll(attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str12 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        boolean boolean6 = attributes1.hasKeyIgnoreCase("");
        java.lang.Object obj7 = null;
        boolean boolean8 = attributes1.equals(obj7);
        java.lang.Class<?> wildcardClass9 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes6);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes18.dataset();
        int int21 = attributes18.size();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        boolean boolean28 = attributes22.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes22.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes22.iterator();
        attributes18.addAll(attributes22);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor32 = attributes22.iterator();
        java.lang.String str33 = attributes22.html();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        attributes22.html(appendable34, outputSettings35);
        attributes16.addAll(attributes22);
        attributes6.addAll(attributes16);
        org.jsoup.nodes.Attribute attribute39 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes6.put(attribute39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(attributeItor32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes14.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes14.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes14.dataset();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        attributes14.html(appendable19, outputSettings20);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList1 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes2.dataset();
        int int5 = attributes2.size();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes6.iterator();
        int int9 = attributes6.size();
        attributes6.remove("hi!");
        attributes2.addAll(attributes6);
        attributes0.addAll(attributes2);
        boolean boolean15 = attributes2.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        attributes16.addAll(attributes18);
        boolean boolean22 = attributes16.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes16.asList();
        java.lang.String str24 = attributes16.toString();
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes25.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes25.dataset();
        int int28 = attributes25.size();
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor32 = attributes31.iterator();
        attributes29.addAll(attributes31);
        boolean boolean35 = attributes29.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList36 = attributes29.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes29.iterator();
        attributes25.addAll(attributes29);
        boolean boolean39 = attributes16.equals((java.lang.Object) attributes25);
        boolean boolean40 = attributes2.equals((java.lang.Object) attributes16);
        org.jsoup.nodes.Attribute attribute41 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes16.put(attribute41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeList1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertNotNull(attributeItor32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributeList36);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        attributes0.put("hi!", false);
        java.lang.String str14 = attributes0.getIgnoreCase(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", true);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        java.lang.Class<?> wildcardClass12 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        java.lang.String str19 = attributes12.get("hi!");
        boolean boolean21 = attributes12.hasKey("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes12.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes12.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeItor23);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes10.dataset();
        java.lang.String str12 = attributes10.html();
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("data-");
        attributes0.addAll(attributes10);
        int int18 = attributes10.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes10.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        int int10 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        attributes0.put("hi!", "data-");
        attributes0.removeIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        boolean boolean6 = attributes1.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes1.iterator();
        java.lang.Class<?> wildcardClass8 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes4.dataset();
        boolean boolean6 = attributes3.equals((java.lang.Object) attributes4);
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes4.asList();
        attributes4.put("data-", "data-");
        attributes4.put("data-", false);
        boolean boolean15 = attributes4.hasKey("hi!");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes4.html(appendable16, outputSettings17);
        boolean boolean20 = attributes4.hasKey("hi!");
        boolean boolean21 = attributes0.equals((java.lang.Object) boolean20);
        org.jsoup.nodes.Attributes attributes22 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes22.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        attributes5.put("data-", "hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes5.clone();
        org.jsoup.nodes.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes17.put(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        attributes0.put("data-", false);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes0.dataset();
        attributes0.removeIgnoreCase(" hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        java.lang.String str18 = attributes15.getIgnoreCase("hi!");
        int int19 = attributes15.size();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes20.iterator();
        attributes15.addAll(attributes20);
        boolean boolean25 = attributes15.hasKey("hi!");
        boolean boolean27 = attributes15.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes15.asList();
        boolean boolean29 = attributes0.equals((java.lang.Object) attributes15);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes9.asList();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes15.iterator();
        int int18 = attributes15.size();
        attributes15.remove("hi!");
        attributes11.addAll(attributes15);
        attributes9.addAll(attributes11);
        attributes0.addAll(attributes11);
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes11.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        java.lang.String str7 = attributes1.getIgnoreCase("hi!");
        java.lang.String str9 = attributes1.get("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes1.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes1.dataset();
        attributes1.put("data-", "");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes1.asList();
        attributes1.put(" hi!=\"data-\"", "");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(attributeList15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes9.asList();
        attributes9.put("data-", true);
        attributes0.addAll(attributes9);
        java.lang.String str18 = attributes0.get(" hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        int int14 = attributes0.size();
        java.lang.Class<?> wildcardClass15 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        attributes0.put("data-", "");
        java.lang.String str14 = attributes0.get("hi!");
        attributes0.put(" hi!=\"hi!\"", " hi!=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes10.dataset();
        boolean boolean12 = attributes9.equals((java.lang.Object) attributes10);
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes10.asList();
        attributes10.put("data-", "data-");
        attributes10.put("data-", false);
        boolean boolean21 = attributes10.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes22.asList();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes22.html(appendable24, outputSettings25);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes22.html(appendable27, outputSettings28);
        attributes0.addAll(attributes22);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor31 = attributes22.iterator();
        java.lang.Class<?> wildcardClass32 = attributes22.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeItor31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes1.iterator();
        int int5 = attributes1.size();
        java.lang.String str6 = attributes1.html();
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        boolean boolean17 = attributes14.equals((java.lang.Object) attributes15);
        attributes1.addAll(attributes14);
        org.jsoup.nodes.Attributes attributes19 = attributes1.clone();
        attributes19.removeIgnoreCase("data-");
        int int22 = attributes19.size();
        java.lang.String str23 = attributes19.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = attributes19.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        java.lang.String str15 = attributes4.html();
        java.lang.String str16 = attributes4.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes4.spliterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeSpliterator17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("hi!");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.String str8 = attributes0.toString();
        boolean boolean10 = attributes0.hasKey("hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes3 = attributes0.clone();
        attributes0.put(" hi!=\"\"", false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes10.dataset();
        int int13 = attributes10.size();
        java.lang.String str14 = attributes10.html();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes10.dataset();
        boolean boolean16 = attributes0.equals((java.lang.Object) attributes10);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes10.iterator();
        org.jsoup.nodes.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes10.put(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(attributeItor17);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes2.dataset();
        int int5 = attributes2.size();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes6.addAll(attributes8);
        boolean boolean12 = attributes6.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes6.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes6.iterator();
        attributes2.addAll(attributes6);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes6.iterator();
        java.lang.String str17 = attributes6.html();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        attributes6.html(appendable18, outputSettings19);
        attributes0.addAll(attributes6);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        attributes13.addAll(attributes15);
        attributes13.put("hi!", "hi!");
        java.lang.String str22 = attributes13.get("hi!");
        attributes13.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes13.dataset();
        attributes0.addAll(attributes13);
        org.jsoup.nodes.Attribute attribute27 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.put("data-", true);
        int int16 = attributes1.size();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        java.lang.String str7 = attributes1.getIgnoreCase("hi!");
        java.lang.String str9 = attributes1.get("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes1.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes1.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes1.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes9.asList();
        attributes9.put("data-", true);
        attributes0.addAll(attributes9);
        java.lang.String str18 = attributes0.get(" hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.hasKey("data-");
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str5 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.lang.String str9 = attributes0.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes0.iterator();
        int int11 = attributes0.size();
        attributes0.removeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes5.spliterator();
        java.lang.String str8 = attributes5.getIgnoreCase("hi!");
        int int9 = attributes5.size();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes10.iterator();
        attributes5.addAll(attributes10);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes10.dataset();
        java.lang.String str15 = attributes10.toString();
        boolean boolean16 = attributes0.equals((java.lang.Object) str15);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        int int18 = attributes0.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes19.iterator();
        int int22 = attributes19.size();
        attributes19.remove("hi!");
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        attributes19.html(appendable25, outputSettings26);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes28.asList();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor31 = attributes30.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes30.dataset();
        int int33 = attributes30.size();
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor35 = attributes34.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes34.iterator();
        int int37 = attributes34.size();
        attributes34.remove("hi!");
        attributes30.addAll(attributes34);
        attributes28.addAll(attributes30);
        attributes19.addAll(attributes30);
        boolean boolean43 = attributes0.equals((java.lang.Object) attributes19);
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        attributes19.html(appendable44, outputSettings45);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertNotNull(attributeItor31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(attributeItor35);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes1.iterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributeItor14);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str11 = attributes0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        int int10 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        boolean boolean14 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes0.dataset();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes4.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes4.spliterator();
        java.lang.String str17 = attributes4.html();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        attributes4.html(appendable18, outputSettings19);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        attributes0.put("hi!", true);
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str5 = attributes2.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes2.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes1.html(appendable13, outputSettings14);
        boolean boolean17 = attributes1.hasKey("data-");
        boolean boolean19 = attributes1.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        boolean boolean23 = attributes20.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes20.html(appendable24, outputSettings25);
        org.jsoup.nodes.Attributes attributes27 = attributes20.clone();
        boolean boolean28 = attributes1.equals((java.lang.Object) attributes27);
        java.lang.String str30 = attributes27.get("hi!");
        java.lang.String str32 = attributes27.getIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes27.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = attributes4.equals(obj14);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes4.html(appendable16, outputSettings17);
        boolean boolean20 = attributes4.hasKey(" data-=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.lang.String str9 = attributes0.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        attributes1.put("data-", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = attributes1.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes14.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes14.iterator();
        java.lang.Class<?> wildcardClass18 = attributeItor17.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes1.dataset();
        attributes1.put(" hi!=\"hi!\"", true);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes1.dataset();
        org.jsoup.nodes.Attributes attributes18 = attributes1.clone();
        java.lang.Class<?> wildcardClass19 = attributes18.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        boolean boolean9 = attributes6.equals((java.lang.Object) attributes7);
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes7.asList();
        attributes7.put("data-", "data-");
        attributes7.put("data-", false);
        boolean boolean18 = attributes7.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes7.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes19.asList();
        attributes0.addAll(attributes19);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes23.dataset();
        boolean boolean25 = attributes22.equals((java.lang.Object) attributes23);
        java.lang.String str26 = attributes23.html();
        java.lang.String str27 = attributes23.html();
        int int28 = attributes23.size();
        boolean boolean29 = attributes0.equals((java.lang.Object) attributes23);
        boolean boolean31 = attributes0.hasKey("hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes0.asList();
        attributes0.put(" data-", true);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        boolean boolean17 = attributes14.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes18.dataset();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        attributes18.addAll(attributes21);
        attributes14.addAll(attributes18);
        boolean boolean25 = attributes0.equals((java.lang.Object) attributes14);
        boolean boolean27 = attributes14.hasKeyIgnoreCase("");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes14.html(appendable28, outputSettings29);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        attributes0.remove("hi!");
        java.lang.String str13 = attributes0.toString();
        java.lang.String str15 = attributes0.getIgnoreCase(" hi!=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.lang.String str14 = attributes1.toString();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        boolean boolean18 = attributes15.equals((java.lang.Object) attributes16);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes19.dataset();
        int int22 = attributes19.size();
        boolean boolean23 = attributes15.equals((java.lang.Object) attributes19);
        attributes15.removeIgnoreCase("data-");
        attributes1.addAll(attributes15);
        org.jsoup.nodes.Attribute attribute27 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.put(attribute27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes0.html(appendable13, outputSettings14);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.get("data-");
        java.lang.String str19 = attributes0.get("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        int int12 = attributes0.size();
        boolean boolean14 = attributes0.hasKeyIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        attributes0.remove("hi!");
        java.lang.String str13 = attributes0.toString();
        java.lang.String str15 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        int int11 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) 100);
        attributes0.removeIgnoreCase("data-");
        boolean boolean9 = attributes0.hasKey(" hi!=\"hi!\"");
        java.lang.Class<?> wildcardClass10 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        boolean boolean17 = attributes14.equals((java.lang.Object) attributes15);
        attributes1.addAll(attributes14);
        attributes1.remove(" hi!");
        java.lang.Class<?> wildcardClass21 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str8 = attributes0.getIgnoreCase(" data-");
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str11 = attributes0.get("hi!");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        java.lang.Class<?> wildcardClass15 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        org.jsoup.nodes.Attributes attributes14 = attributes13.clone();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes14.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        boolean boolean8 = attributes5.equals((java.lang.Object) attributes6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes9.dataset();
        int int12 = attributes9.size();
        boolean boolean13 = attributes5.equals((java.lang.Object) attributes9);
        java.lang.Object obj14 = null;
        boolean boolean15 = attributes9.equals(obj14);
        attributes0.addAll(attributes9);
        int int17 = attributes9.size();
        attributes9.removeIgnoreCase(" hi!");
        boolean boolean21 = attributes9.hasKeyIgnoreCase("data-");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes0.dataset();
        java.lang.Class<?> wildcardClass29 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        attributes1.remove("data-");
        java.lang.String str17 = attributes1.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        attributes18.addAll(attributes20);
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        attributes20.html(appendable23, outputSettings24);
        boolean boolean27 = attributes20.hasKeyIgnoreCase("");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes20.html(appendable28, outputSettings29);
        boolean boolean31 = attributes1.equals((java.lang.Object) outputSettings29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = attributes1.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes6.dataset();
        int int9 = attributes6.size();
        boolean boolean11 = attributes6.hasKeyIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes6.asList();
        boolean boolean13 = attributes0.equals((java.lang.Object) attributes6);
        java.lang.String str14 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes14.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        attributes17.addAll(attributes19);
        java.lang.String str22 = attributes17.html();
        java.lang.String str23 = attributes17.toString();
        attributes14.addAll(attributes17);
        org.jsoup.nodes.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes17.put(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        boolean boolean19 = attributes14.hasKeyIgnoreCase("");
        attributes0.addAll(attributes14);
        boolean boolean22 = attributes0.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes23.html(appendable24, outputSettings25);
        org.jsoup.nodes.Attributes attributes27 = attributes23.clone();
        attributes27.remove(" hi!");
        java.lang.String str31 = attributes27.get("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.removeIgnoreCase("hi!");
        java.lang.String str16 = attributes1.get(" hi!=\"data-\"");
        java.lang.Class<?> wildcardClass17 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes8.html(appendable13, outputSettings14);
        boolean boolean17 = attributes8.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes8.dataset();
        attributes0.addAll(attributes8);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes8.dataset();
        java.lang.String str22 = attributes8.get(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes1.iterator();
        java.lang.String str5 = attributes1.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes1.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        attributes0.put("data-", false);
        attributes0.remove(" hi!=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes5.spliterator();
        boolean boolean11 = attributes5.hasKey("data-");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        attributes12.addAll(attributes14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes12.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes12.spliterator();
        attributes5.addAll(attributes12);
        // The following exception was thrown during execution in test generation
        try {
            attributes5.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        int int14 = attributes0.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        boolean boolean19 = attributes15.hasKeyIgnoreCase("");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes15.html(appendable20, outputSettings21);
        attributes0.addAll(attributes15);
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes0.asList();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        attributes0.html(appendable25, outputSettings26);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor28 = attributes0.iterator();
        java.lang.Class<?> wildcardClass29 = attributeItor28.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributeItor28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        boolean boolean9 = attributes6.equals((java.lang.Object) attributes7);
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes7.asList();
        attributes7.put("data-", "data-");
        attributes7.put("data-", false);
        boolean boolean18 = attributes7.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes7.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes19.asList();
        attributes0.addAll(attributes19);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes19.spliterator();
        boolean boolean24 = attributes19.hasKey(" hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes9.asList();
        attributes9.put("data-", true);
        attributes0.addAll(attributes9);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable17, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.Class<?> wildcardClass9 = attributes8.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.lang.String str11 = attributes5.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        attributes0.html(appendable14, outputSettings15);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes19 = attributes0.clone();
        java.lang.String str21 = attributes19.get(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass15 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes1.html(appendable13, outputSettings14);
        boolean boolean17 = attributes1.hasKey("data-");
        boolean boolean19 = attributes1.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        boolean boolean23 = attributes20.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes20.html(appendable24, outputSettings25);
        org.jsoup.nodes.Attributes attributes27 = attributes20.clone();
        boolean boolean28 = attributes1.equals((java.lang.Object) attributes27);
        org.jsoup.nodes.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes27.put(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        boolean boolean19 = attributes0.hasKey(" hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes7.dataset();
        int int10 = attributes7.size();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes11.spliterator();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        attributes11.addAll(attributes13);
        boolean boolean17 = attributes11.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes11.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes11.iterator();
        attributes7.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes11.iterator();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        attributes22.put("hi!", "hi!");
        attributes11.addAll(attributes22);
        attributes0.addAll(attributes11);
        java.lang.Class<?> wildcardClass32 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        java.lang.Class<?> wildcardClass6 = attributeList5.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes2.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes2.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes7.dataset();
        int int10 = attributes7.size();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes11.spliterator();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        attributes11.addAll(attributes13);
        boolean boolean17 = attributes11.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes11.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes11.iterator();
        attributes7.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes11.iterator();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        attributes22.put("hi!", "hi!");
        attributes11.addAll(attributes22);
        attributes0.addAll(attributes11);
        org.jsoup.nodes.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes11.put(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        int int7 = attributes0.size();
        java.lang.String str9 = attributes0.getIgnoreCase(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes9.asList();
        attributes9.put("data-", true);
        attributes0.addAll(attributes9);
        attributes9.remove("data-");
        java.lang.Class<?> wildcardClass19 = attributes9.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        boolean boolean8 = attributes5.equals((java.lang.Object) attributes6);
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes6.asList();
        attributes6.put("data-", "data-");
        attributes6.put("data-", false);
        boolean boolean17 = attributes6.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes6.spliterator();
        attributes6.remove("data-");
        attributes1.addAll(attributes6);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes6.iterator();
        java.lang.Class<?> wildcardClass23 = attributes6.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        java.lang.String str3 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes5.dataset();
        boolean boolean7 = attributes4.equals((java.lang.Object) attributes5);
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes5.asList();
        attributes5.put("data-", "data-");
        attributes5.put("data-", false);
        boolean boolean16 = attributes5.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes5.spliterator();
        attributes5.remove("data-");
        attributes0.addAll(attributes5);
        java.lang.String str22 = attributes0.get(" data- hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        attributes13.addAll(attributes15);
        attributes13.put("hi!", "hi!");
        java.lang.String str22 = attributes13.get("hi!");
        attributes13.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes13.dataset();
        attributes0.addAll(attributes13);
        java.lang.String str27 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes28 = attributes0.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put("", " data-=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = attributes4.equals(obj14);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        attributes16.addAll(attributes18);
        java.lang.String str21 = attributes16.html();
        java.lang.String str22 = attributes16.toString();
        boolean boolean24 = attributes16.hasKey(" hi!");
        boolean boolean25 = attributes4.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        attributes0.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributeList32.spliterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeList32);
        org.junit.Assert.assertNotNull(attributeSpliterator33);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        boolean boolean11 = attributes0.hasKey("data-");
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        boolean boolean11 = attributes0.hasKey("");
        java.lang.String str12 = attributes0.html();
        attributes0.put(" hi!=\"\"", "");
        boolean boolean17 = attributes0.hasKeyIgnoreCase("hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes10.dataset();
        boolean boolean12 = attributes9.equals((java.lang.Object) attributes10);
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes10.asList();
        boolean boolean15 = attributes10.hasKeyIgnoreCase("");
        java.lang.Object obj16 = null;
        boolean boolean17 = attributes10.equals(obj16);
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        attributes10.html(appendable18, outputSettings19);
        attributes0.addAll(attributes10);
        org.jsoup.nodes.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes10.put(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.equals((java.lang.Object) 100.0d);
        java.lang.String str7 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) 100);
        attributes0.removeIgnoreCase("data-");
        boolean boolean9 = attributes0.hasKey(" hi!=\"hi!\"");
        java.lang.String str10 = attributes0.html();
        java.lang.Class<?> wildcardClass11 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        attributes0.put(" hi!", "data-");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes5.iterator();
        java.lang.String str13 = attributes5.toString();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        boolean boolean17 = attributes14.equals((java.lang.Object) attributes15);
        boolean boolean19 = attributes15.hasKey("data-");
        java.lang.String str21 = attributes15.getIgnoreCase("hi!");
        java.lang.String str23 = attributes15.get("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes15.dataset();
        attributes5.addAll(attributes15);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes5.html(appendable27, outputSettings28);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes4.get("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes13 = attributes4.clone();
        java.lang.String str15 = attributes13.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes16 = attributes13.clone();
        org.jsoup.nodes.Attributes attributes17 = attributes13.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeItor18);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = attributes2.clone();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes11.spliterator();
        java.lang.String str14 = attributes11.getIgnoreCase("hi!");
        int int15 = attributes11.size();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes16.iterator();
        attributes11.addAll(attributes16);
        boolean boolean21 = attributes11.hasKey("hi!");
        java.lang.String str23 = attributes11.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes25.dataset();
        boolean boolean27 = attributes24.equals((java.lang.Object) attributes25);
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes25.asList();
        boolean boolean30 = attributes25.hasKeyIgnoreCase("");
        attributes11.addAll(attributes25);
        boolean boolean33 = attributes11.hasKey("hi!");
        attributes10.addAll(attributes11);
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        attributes10.html(appendable35, outputSettings36);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        attributes0.put("hi!", true);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes12.dataset();
        boolean boolean14 = attributes11.equals((java.lang.Object) attributes12);
        boolean boolean16 = attributes12.hasKey("data-");
        java.lang.String str18 = attributes12.getIgnoreCase("hi!");
        attributes0.addAll(attributes12);
        java.lang.Class<?> wildcardClass20 = attributes12.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeList14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.String str10 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        java.lang.String str15 = attributes11.html();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes11.dataset();
        java.lang.String str17 = attributes11.html();
        attributes0.addAll(attributes11);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes20.dataset();
        boolean boolean22 = attributes19.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes23.dataset();
        int int26 = attributes23.size();
        boolean boolean27 = attributes19.equals((java.lang.Object) attributes23);
        attributes0.addAll(attributes19);
        java.lang.Class<?> wildcardClass29 = attributes19.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        org.jsoup.nodes.Attributes attributes28 = attributes25.clone();
        boolean boolean30 = attributes28.hasKeyIgnoreCase(" data-=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.put("data-", true);
        org.jsoup.nodes.Attributes attributes16 = attributes1.clone();
        int int17 = attributes1.size();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.html(appendable18, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes1.html(appendable13, outputSettings14);
        boolean boolean17 = attributes1.hasKey("data-");
        boolean boolean19 = attributes1.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        boolean boolean23 = attributes20.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes20.html(appendable24, outputSettings25);
        org.jsoup.nodes.Attributes attributes27 = attributes20.clone();
        boolean boolean28 = attributes1.equals((java.lang.Object) attributes27);
        java.lang.String str29 = attributes27.html();
        int int30 = attributes27.size();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        boolean boolean17 = attributes14.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes18.dataset();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        attributes18.addAll(attributes21);
        attributes14.addAll(attributes18);
        boolean boolean25 = attributes0.equals((java.lang.Object) attributes14);
        attributes0.remove(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes10.dataset();
        boolean boolean12 = attributes9.equals((java.lang.Object) attributes10);
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes10.asList();
        attributes10.put("data-", "data-");
        attributes10.put("data-", false);
        boolean boolean21 = attributes10.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes10.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes22.asList();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes22.html(appendable24, outputSettings25);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes22.html(appendable27, outputSettings28);
        attributes0.addAll(attributes22);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor31 = attributes22.iterator();
        org.jsoup.nodes.Attributes attributes32 = attributes22.clone();
        int int33 = attributes32.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes32.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeItor31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        attributes0.put("data-", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        java.lang.String str22 = attributes19.getIgnoreCase("hi!");
        int int23 = attributes19.size();
        java.lang.String str25 = attributes19.get("hi!");
        java.lang.String str26 = attributes19.html();
        attributes15.addAll(attributes19);
        java.lang.String str28 = attributes19.toString();
        org.jsoup.nodes.Attributes attributes29 = attributes19.clone();
        attributes0.addAll(attributes29);
        org.jsoup.nodes.Attribute attribute31 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.put(" hi!=\"data-\"", true);
        java.lang.String str5 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " hi!=\"data-\"" + "'", str5, " hi!=\"data-\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes14.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes14.iterator();
        attributes14.remove(" hi!=\"hi!\"");
        int int20 = attributes14.size();
        java.lang.String str21 = attributes14.html();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        attributes5.put("data-", "hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes5.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes5.dataset();
        java.lang.Class<?> wildcardClass19 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes1.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes13.asList();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        attributes13.html(appendable15, outputSettings16);
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        attributes13.html(appendable18, outputSettings19);
        org.jsoup.nodes.Attributes attributes21 = attributes13.clone();
        boolean boolean23 = attributes13.hasKey("data-");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.lang.String str9 = attributes5.toString();
        attributes5.put("data-", true);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes13.dataset();
        int int16 = attributes13.size();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        attributes17.addAll(attributes19);
        boolean boolean23 = attributes17.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes17.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes17.iterator();
        attributes13.addAll(attributes17);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes13.html(appendable27, outputSettings28);
        attributes13.put("data-", "");
        attributes13.put("data-", false);
        attributes5.addAll(attributes13);
        boolean boolean38 = attributes13.hasKeyIgnoreCase(" data-");
        java.lang.String str39 = attributes13.html();
        attributes13.put(" data-", false);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList1 = attributes0.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.put(" hi!=\"data-\"", " hi!=\"data-\"");
        attributes0.put("data-", true);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeList1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        boolean boolean15 = attributes11.hasKey("");
        attributes11.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes11.spliterator();
        attributes11.put("data-", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes11.asList();
        java.lang.String str24 = attributes11.html();
        boolean boolean25 = attributes0.equals((java.lang.Object) str24);
        org.jsoup.nodes.Attribute attribute26 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " hi!=\"hi!\"" + "'", str24, " hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        boolean boolean19 = attributes12.hasKeyIgnoreCase(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) 100);
        attributes0.removeIgnoreCase("data-");
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes10 = attributes0.clone();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str6 = attributes5.html();
        java.lang.String str7 = attributes5.toString();
        attributes5.remove(" data- hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes5.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        attributes0.removeIgnoreCase("data-");
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeList5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) 0);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes1.spliterator();
        attributes1.put(" hi!=\"\"", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator4);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes1.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes1.spliterator();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        java.lang.String str18 = attributes16.html();
        boolean boolean20 = attributes16.hasKeyIgnoreCase("hi!");
        java.lang.String str21 = attributes16.html();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        attributes16.html(appendable22, outputSettings23);
        boolean boolean25 = attributes1.equals((java.lang.Object) appendable22);
        java.lang.Class<?> wildcardClass26 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(attributeItor8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        int int10 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        boolean boolean14 = attributes0.hasKey("");
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str5 = attributes0.getIgnoreCase("data-");
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        attributes8.put("hi!", "hi!");
        java.lang.String str17 = attributes8.get("hi!");
        attributes8.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes8.dataset();
        int int21 = attributes8.size();
        attributes0.addAll(attributes8);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList1 = attributes0.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.put(" hi!=\"data-\"", "");
        java.lang.Class<?> wildcardClass6 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.String str9 = attributes8.html();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes10.spliterator();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        attributes10.addAll(attributes12);
        attributes10.removeIgnoreCase("hi!");
        java.lang.String str17 = attributes10.toString();
        attributes10.put("hi!", true);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes10.spliterator();
        attributes8.addAll(attributes10);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        int int6 = attributes0.size();
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str11 = attributes0.toString();
        attributes0.put(" hi!=\"hi!\"", false);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        boolean boolean14 = attributes1.hasKeyIgnoreCase("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        attributes1.html(appendable15, outputSettings16);
        org.jsoup.nodes.Attributes attributes18 = attributes1.clone();
        java.lang.String str20 = attributes1.getIgnoreCase("data-");
        java.lang.String str21 = attributes1.html();
        attributes1.removeIgnoreCase(" data- hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.lang.String str14 = attributes1.toString();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        boolean boolean18 = attributes15.equals((java.lang.Object) attributes16);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes19.dataset();
        int int22 = attributes19.size();
        boolean boolean23 = attributes15.equals((java.lang.Object) attributes19);
        attributes15.removeIgnoreCase("data-");
        attributes1.addAll(attributes15);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = attributes28.dataset();
        boolean boolean30 = attributes27.equals((java.lang.Object) attributes28);
        java.util.List<org.jsoup.nodes.Attribute> attributeList31 = attributes28.asList();
        attributes28.put("data-", "data-");
        attributes28.put("data-", false);
        boolean boolean39 = attributes28.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes40 = attributes28.clone();
        boolean boolean42 = attributes40.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator44 = attributes43.spliterator();
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor46 = attributes45.iterator();
        attributes43.addAll(attributes45);
        attributes43.put("hi!", "hi!");
        java.lang.String str52 = attributes43.get("hi!");
        attributes43.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = attributes56.dataset();
        boolean boolean58 = attributes55.equals((java.lang.Object) attributes56);
        java.util.List<org.jsoup.nodes.Attribute> attributeList59 = attributes56.asList();
        attributes56.put("data-", "data-");
        attributes56.put("data-", false);
        boolean boolean67 = attributes56.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes68 = attributes56.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList69 = attributes68.asList();
        attributes43.addAll(attributes68);
        java.lang.String str71 = attributes43.html();
        attributes40.addAll(attributes43);
        attributes1.addAll(attributes43);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator74 = attributes1.spliterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator44);
        org.junit.Assert.assertNotNull(attributeItor46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributeList59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(attributeList69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(attributeSpliterator74);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        attributes0.put("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.removeIgnoreCase("hi!");
        attributes1.removeIgnoreCase("data-");
        java.lang.String str9 = attributes1.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes1.spliterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        java.lang.Class<?> wildcardClass5 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        attributes0.html(appendable14, outputSettings15);
        attributes0.put("data-", "");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable20, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        attributes0.put(" data-", true);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        java.lang.String str13 = attributes4.toString();
        attributes4.put(" data-", " data-");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes4.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes1.clone();
        java.lang.String str14 = attributes1.html();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        attributes1.html(appendable15, outputSettings16);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        java.lang.String str29 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        int int14 = attributes0.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        boolean boolean19 = attributes15.hasKeyIgnoreCase("");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes15.html(appendable20, outputSettings21);
        attributes0.addAll(attributes15);
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("hi!");
        int int8 = attributes4.size();
        java.lang.String str10 = attributes4.get("hi!");
        java.lang.String str11 = attributes4.html();
        attributes0.addAll(attributes4);
        java.lang.String str14 = attributes4.get("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes4.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes4.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(attributeItor16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        boolean boolean5 = attributes2.equals((java.lang.Object) attributes3);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes6.dataset();
        int int9 = attributes6.size();
        boolean boolean10 = attributes2.equals((java.lang.Object) attributes6);
        attributes2.removeIgnoreCase("data-");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes2.html(appendable13, outputSettings14);
        int int16 = attributes2.size();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes17.dataset();
        boolean boolean21 = attributes17.hasKeyIgnoreCase("");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        attributes17.html(appendable22, outputSettings23);
        attributes2.addAll(attributes17);
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes2.asList();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes2.html(appendable27, outputSettings28);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes2.iterator();
        java.lang.String str31 = attributes2.toString();
        boolean boolean32 = attributes0.equals((java.lang.Object) str31);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes7.put(" hi!", false);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes7.html(appendable11, outputSettings12);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        int int12 = attributes5.size();
        boolean boolean14 = attributes5.hasKeyIgnoreCase(" data- hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        boolean boolean19 = attributes14.hasKeyIgnoreCase("");
        attributes0.addAll(attributes14);
        boolean boolean22 = attributes0.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes23.html(appendable24, outputSettings25);
        org.jsoup.nodes.Attributes attributes27 = attributes23.clone();
        int int28 = attributes27.size();
        java.lang.String str29 = attributes27.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        attributes15.addAll(attributes17);
        attributes15.put("hi!", "hi!");
        attributes4.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes15.dataset();
        int int25 = attributes15.size();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes26.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes26.dataset();
        int int29 = attributes26.size();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes32.iterator();
        attributes30.addAll(attributes32);
        boolean boolean36 = attributes30.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes30.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes30.iterator();
        attributes26.addAll(attributes30);
        java.lang.String str40 = attributes26.html();
        java.lang.String str41 = attributes26.html();
        attributes15.addAll(attributes26);
        org.jsoup.nodes.Attribute attribute43 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes26.put(attribute43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        attributes5.addAll(attributes14);
        java.lang.String str18 = attributes5.getIgnoreCase("hi!");
        boolean boolean20 = attributes5.hasKey(" hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        int int14 = attributes0.size();
        attributes0.put("hi!", true);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes0.dataset();
        attributes0.put("data-", "");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.lang.String str6 = attributes0.html();
        boolean boolean8 = attributes0.hasKeyIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        boolean boolean13 = attributes5.hasKey("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        attributes5.addAll(attributes14);
        java.lang.String str18 = attributes5.getIgnoreCase("hi!");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        attributes5.html(appendable19, outputSettings20);
        int int22 = attributes5.size();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.equals((java.lang.Object) 100.0d);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        java.lang.String str8 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.lang.String str9 = attributes0.html();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        attributes15.addAll(attributes17);
        attributes15.put("hi!", "hi!");
        attributes4.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes15.dataset();
        java.lang.String str26 = attributes15.getIgnoreCase(" hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes15.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributeList27);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes1.dataset();
        attributes1.put(" hi!=\"hi!\"", true);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        java.lang.String str20 = attributes17.getIgnoreCase("hi!");
        int int21 = attributes17.size();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes22.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes22.iterator();
        attributes17.addAll(attributes22);
        boolean boolean27 = attributes17.hasKey("hi!");
        java.lang.String str29 = attributes17.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes31.dataset();
        boolean boolean33 = attributes30.equals((java.lang.Object) attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes31.asList();
        boolean boolean36 = attributes31.hasKeyIgnoreCase("");
        attributes17.addAll(attributes31);
        attributes17.put("data-", false);
        attributes1.addAll(attributes17);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator42 = attributes1.spliterator();
        java.lang.String str44 = attributes1.getIgnoreCase(" hi!");
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.html(appendable45, outputSettings46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        boolean boolean19 = attributes14.hasKeyIgnoreCase("");
        attributes0.addAll(attributes14);
        // The following exception was thrown during execution in test generation
        try {
            attributes14.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        attributes0.remove("data-");
        int int10 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        boolean boolean14 = attributes0.hasKey("");
        attributes0.removeIgnoreCase(" hi!=\"data-\"");
        attributes0.removeIgnoreCase(" hi!");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        attributes19.addAll(attributes21);
        boolean boolean25 = attributes19.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes19.dataset();
        attributes0.addAll(attributes19);
        java.lang.Class<?> wildcardClass28 = attributes19.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        boolean boolean8 = attributes5.equals((java.lang.Object) attributes6);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes9.dataset();
        int int12 = attributes9.size();
        boolean boolean13 = attributes5.equals((java.lang.Object) attributes9);
        java.lang.Object obj14 = null;
        boolean boolean15 = attributes9.equals(obj14);
        attributes0.addAll(attributes9);
        boolean boolean18 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes19.dataset();
        int int22 = attributes19.size();
        boolean boolean24 = attributes19.hasKeyIgnoreCase("data-");
        attributes19.removeIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes19.spliterator();
        attributes19.put(" hi!=\"data-\"", " hi!=\"hi!\"");
        boolean boolean31 = attributes0.equals((java.lang.Object) " hi!=\"data-\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.put(" hi!", " hi!");
        boolean boolean14 = attributes0.hasKey(" hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.String str9 = attributes0.html();
        attributes0.put(" data-", " hi!");
        attributes0.removeIgnoreCase("hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        boolean boolean11 = attributes0.hasKey("hi!");
        java.lang.Class<?> wildcardClass12 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes5.dataset();
        boolean boolean7 = attributes4.equals((java.lang.Object) attributes5);
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes5.asList();
        attributes5.put("data-", "data-");
        attributes5.put("data-", false);
        boolean boolean16 = attributes5.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes5.clone();
        boolean boolean19 = attributes17.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes22.iterator();
        attributes20.addAll(attributes22);
        attributes20.put("hi!", "hi!");
        java.lang.String str29 = attributes20.get("hi!");
        attributes20.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes33.dataset();
        boolean boolean35 = attributes32.equals((java.lang.Object) attributes33);
        java.util.List<org.jsoup.nodes.Attribute> attributeList36 = attributes33.asList();
        attributes33.put("data-", "data-");
        attributes33.put("data-", false);
        boolean boolean44 = attributes33.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes45 = attributes33.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList46 = attributes45.asList();
        attributes20.addAll(attributes45);
        java.lang.String str48 = attributes20.html();
        attributes17.addAll(attributes20);
        attributes0.addAll(attributes17);
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = attributes52.dataset();
        boolean boolean54 = attributes51.equals((java.lang.Object) attributes52);
        java.util.List<org.jsoup.nodes.Attribute> attributeList55 = attributes52.asList();
        boolean boolean57 = attributes52.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor58 = attributes52.iterator();
        boolean boolean59 = attributes0.equals((java.lang.Object) attributes52);
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes52.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributeList36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributeList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(attributeList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(attributeItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(attributeList60);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes1.spliterator();
        java.lang.String str14 = attributes1.toString();
        attributes1.put(" hi!=\"\"", " hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        attributes0.put("data-", false);
        boolean boolean13 = attributes0.hasKey(" hi!");
        attributes0.put(" data-=\"hi!\"", "");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        java.lang.String str19 = attributes12.get("hi!");
        boolean boolean21 = attributes12.hasKey("data-");
        java.lang.Class<?> wildcardClass22 = attributes12.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes1.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes13.asList();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        attributes13.html(appendable15, outputSettings16);
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        attributes13.html(appendable18, outputSettings19);
        org.jsoup.nodes.Attributes attributes21 = attributes13.clone();
        java.lang.Class<?> wildcardClass22 = attributes21.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.put("data-", true);
        org.jsoup.nodes.Attributes attributes16 = attributes1.clone();
        int int17 = attributes1.size();
        attributes1.put("data-", " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.String str8 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes9.dataset();
        int int12 = attributes9.size();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        attributes13.addAll(attributes15);
        boolean boolean19 = attributes13.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes13.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes13.iterator();
        attributes9.addAll(attributes13);
        boolean boolean23 = attributes0.equals((java.lang.Object) attributes9);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes9.iterator();
        org.jsoup.nodes.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes9.put(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributeItor24);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("hi!");
        int int11 = attributes7.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes7.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        attributes0.addAll(attributes12);
        boolean boolean19 = attributes0.hasKey(" hi!=\"hi!\"");
        java.lang.Class<?> wildcardClass20 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        int int4 = attributes0.size();
        java.lang.String str5 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes1.dataset();
        attributes1.put(" hi!=\"hi!\"", true);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        java.lang.String str20 = attributes17.getIgnoreCase("hi!");
        int int21 = attributes17.size();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes22.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes22.iterator();
        attributes17.addAll(attributes22);
        boolean boolean27 = attributes17.hasKey("hi!");
        java.lang.String str29 = attributes17.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes31.dataset();
        boolean boolean33 = attributes30.equals((java.lang.Object) attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes31.asList();
        boolean boolean36 = attributes31.hasKeyIgnoreCase("");
        attributes17.addAll(attributes31);
        attributes17.put("data-", false);
        attributes1.addAll(attributes17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = attributes17.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes2.put("hi!", "hi!");
        attributes2.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes2.dataset();
        int int11 = attributes2.size();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        boolean boolean12 = attributes0.hasKeyIgnoreCase("hi!");
        int int13 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str5 = attributes0.html();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes0.html(appendable9, outputSettings10);
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("hi!");
        attributes0.put(" hi!=\"\"", " hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        java.lang.String str13 = attributes0.toString();
        boolean boolean15 = attributes0.hasKey(" data- hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"\"=\" hi!=&quot;&quot;\"" + "'", str13, " hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes8.html(appendable13, outputSettings14);
        boolean boolean17 = attributes8.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes8.dataset();
        attributes0.addAll(attributes8);
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        attributes0.put("data-", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        java.lang.String str16 = attributes0.get(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str5 = attributes0.getIgnoreCase("data-");
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        attributes8.addAll(attributes10);
        attributes8.put("hi!", "hi!");
        java.lang.String str17 = attributes8.get("hi!");
        attributes8.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes8.dataset();
        int int21 = attributes8.size();
        attributes0.addAll(attributes8);
        boolean boolean24 = attributes8.hasKeyIgnoreCase(" hi!=\"\"");
        java.lang.String str25 = attributes8.toString();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes5.spliterator();
        java.lang.String str8 = attributes5.getIgnoreCase("hi!");
        int int9 = attributes5.size();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes10.iterator();
        attributes5.addAll(attributes10);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes10.dataset();
        java.lang.String str15 = attributes10.toString();
        boolean boolean16 = attributes0.equals((java.lang.Object) str15);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        java.lang.String str18 = attributes0.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributeList19.spliterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        int int7 = attributes4.size();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributes4);
        attributes0.removeIgnoreCase("data-");
        attributes0.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        attributes0.put("hi!", true);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes12.dataset();
        boolean boolean14 = attributes11.equals((java.lang.Object) attributes12);
        boolean boolean16 = attributes12.hasKey("data-");
        java.lang.String str18 = attributes12.getIgnoreCase("hi!");
        attributes0.addAll(attributes12);
        attributes12.remove(" data-");
        org.jsoup.nodes.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes12.put(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        java.lang.String str9 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.String str10 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        int int14 = attributes11.size();
        java.lang.String str15 = attributes11.html();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes11.dataset();
        java.lang.String str17 = attributes11.html();
        attributes0.addAll(attributes11);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes20.dataset();
        boolean boolean22 = attributes19.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes23.dataset();
        int int26 = attributes23.size();
        boolean boolean27 = attributes19.equals((java.lang.Object) attributes23);
        attributes0.addAll(attributes19);
        attributes0.remove(" data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.toString();
        attributes0.removeIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes4.html(appendable9, outputSettings10);
        boolean boolean13 = attributes4.hasKeyIgnoreCase("");
        attributes0.addAll(attributes4);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.get("data-");
        java.lang.String str19 = attributes0.get("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes0.dataset();
        java.lang.Class<?> wildcardClass21 = strMap20.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        java.lang.String str6 = attributes0.html();
        attributes0.remove("hi!");
        attributes0.put("data-", true);
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str5 = attributes2.toString();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes6.dataset();
        int int9 = attributes6.size();
        java.lang.String str10 = attributes6.html();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes6.dataset();
        java.lang.String str12 = attributes6.html();
        org.jsoup.nodes.Attributes attributes13 = attributes6.clone();
        int int14 = attributes13.size();
        attributes2.addAll(attributes13);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes2.html(appendable16, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        boolean boolean22 = attributes19.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes23.dataset();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        attributes23.addAll(attributes26);
        attributes19.addAll(attributes23);
        attributes19.put("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList33 = attributes19.asList();
        boolean boolean34 = attributes2.equals((java.lang.Object) attributes19);
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes35.spliterator();
        java.lang.String str38 = attributes35.getIgnoreCase("hi!");
        int int39 = attributes35.size();
        java.lang.String str41 = attributes35.get("hi!");
        java.lang.String str43 = attributes35.get("data-");
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        attributes35.html(appendable44, outputSettings45);
        attributes2.addAll(attributes35);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = attributes2.dataset();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(attributeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes0.html(appendable9, outputSettings10);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str10 = attributes0.toString();
        java.lang.Class<?> wildcardClass11 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes13.dataset();
        boolean boolean15 = attributes12.equals((java.lang.Object) attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        attributes13.put("data-", "data-");
        attributes13.put("data-", false);
        boolean boolean24 = attributes13.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes13.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes25.asList();
        attributes0.addAll(attributes25);
        java.lang.String str28 = attributes0.html();
        attributes0.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes0.dataset();
        boolean boolean36 = attributes0.hasKeyIgnoreCase(" data- hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        java.lang.Class<?> wildcardClass11 = attributeList10.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        boolean boolean17 = attributes14.equals((java.lang.Object) attributes15);
        attributes1.addAll(attributes14);
        attributes1.remove(" hi!");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        attributes23.put("hi!", "hi!");
        attributes23.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes23.dataset();
        boolean boolean32 = attributes1.equals((java.lang.Object) attributes23);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Class<?> wildcardClass11 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        attributes0.put("data-", false);
        attributes0.put("data-", "");
        java.lang.String str14 = attributes0.get("hi!");
        attributes0.put(" hi!=\"hi!\"", " hi!=\"data-\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes0.spliterator();
        java.lang.String str20 = attributes0.getIgnoreCase(" data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes5.dataset();
        java.lang.String str10 = attributes5.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes5.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes5.dataset();
        java.lang.Class<?> wildcardClass14 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        attributes11.remove("hi!");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes11.html(appendable16, outputSettings17);
        java.lang.String str19 = attributes11.toString();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes11);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes0.dataset();
        java.lang.String str23 = attributes0.getIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        attributes4.addAll(attributes6);
        boolean boolean10 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes4.iterator();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        attributes15.addAll(attributes17);
        attributes15.put("hi!", "hi!");
        attributes4.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes15.dataset();
        int int25 = attributes15.size();
        attributes15.put(" data- hi!", " hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        attributes6.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes6.dataset();
        attributes0.addAll(attributes6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes6.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes0.get(" hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        attributes4.addAll(attributes7);
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("");
        int int14 = attributes0.size();
        attributes0.put("hi!", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes0.iterator();
        java.lang.String str20 = attributes0.get(" hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }
}

