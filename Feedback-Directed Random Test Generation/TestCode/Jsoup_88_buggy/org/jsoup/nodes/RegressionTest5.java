package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        java.lang.String str14 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute15 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        java.lang.String str18 = attribute2.getValue();
        java.lang.String str19 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute20 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute23 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        java.lang.String str24 = attribute23.html();
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute28 = attribute27.clone();
        boolean boolean30 = attribute28.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes31 = attribute28.parent;
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.nodes.Attribute attribute35 = new org.jsoup.nodes.Attribute("hi!=\"\"", "", attributes34);
        boolean boolean36 = attribute28.equals((java.lang.Object) attribute35);
        org.jsoup.nodes.Attribute attribute39 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes40 = attribute39.parent;
        java.lang.String str41 = attribute39.getKey();
        java.lang.String str42 = attribute39.toString();
        java.lang.String str43 = attribute39.getValue();
        attribute39.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes46 = null;
        attribute39.parent = attributes46;
        java.lang.String str48 = attribute39.getKey();
        boolean boolean49 = attribute39.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute50 = attribute39.clone();
        boolean boolean51 = attribute28.equals((java.lang.Object) attribute50);
        boolean boolean52 = attribute28.isDataAttribute();
        org.jsoup.nodes.Attributes attributes53 = null;
        attribute28.parent = attributes53;
        boolean boolean55 = attribute23.equals((java.lang.Object) attribute28);
        boolean boolean56 = attribute20.equals((java.lang.Object) boolean55);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str14, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"" + "'", str19, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"" + "'", str24, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertNull(attributes40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!=\"\"" + "'", str42, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!=\"hi!\"" + "'", str48, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attribute50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        java.lang.String str9 = attribute2.toString();
        boolean boolean10 = attribute2.isBooleanAttribute();
        java.lang.String str11 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes12 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes13 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str9, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        boolean boolean9 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attribute2.shouldCollapseAttribute(outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;&quot;\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!\"");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"", attributes2);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute5.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.String str7 = attribute2.toString();
        java.lang.String str8 = attribute2.getKey();
        java.lang.String str9 = attribute2.getValue();
        java.lang.String str10 = attribute2.html();
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attribute2.shouldCollapseAttribute(outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        boolean boolean9 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute2.parent = attributes11;
        java.lang.String str13 = attribute2.html();
        boolean boolean14 = attribute2.isBooleanAttribute();
        java.lang.String str15 = attribute2.getKey();
        java.lang.Class<?> wildcardClass16 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str13, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"" + "'", str15, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;\"", "", attributes2);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        java.lang.String str10 = attribute2.html();
        java.lang.String str11 = attribute2.toString();
        java.lang.String str12 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"\"", attributes2);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute5.html();
        java.lang.String str7 = attribute5.html();
        java.lang.String str8 = attribute5.getKey();
        java.lang.String str9 = attribute5.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"\"" + "'", str9, "hi!=\"\"");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        java.lang.String str7 = attribute6.toString();
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        java.lang.String str12 = attribute10.getKey();
        java.lang.String str13 = attribute10.toString();
        org.jsoup.nodes.Attributes attributes14 = attribute10.parent;
        org.jsoup.nodes.Attributes attributes15 = attribute10.parent;
        boolean boolean16 = attribute6.equals((java.lang.Object) attributes15);
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute20 = attribute19.clone();
        boolean boolean22 = attribute20.equals((java.lang.Object) 0.0d);
        boolean boolean23 = attribute20.isBooleanAttribute();
        java.lang.String str24 = attribute20.html();
        boolean boolean25 = attribute6.equals((java.lang.Object) attribute20);
        boolean boolean26 = attribute6.isDataAttribute();
        java.lang.Class<?> wildcardClass27 = attribute6.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"" + "'", str13, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"" + "'", str24, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute8.isBooleanAttribute();
        boolean boolean10 = attribute8.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.Class<?> wildcardClass6 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        java.lang.String str11 = attribute9.getKey();
        java.lang.String str12 = attribute9.toString();
        java.lang.String str13 = attribute9.getValue();
        attribute9.setKey("hi!=\"hi!\"");
        boolean boolean16 = attribute9.isDataAttribute();
        org.jsoup.nodes.Attributes attributes17 = attribute9.parent;
        java.lang.String str18 = attribute9.getKey();
        boolean boolean19 = attribute9.isDataAttribute();
        boolean boolean20 = attribute2.equals((java.lang.Object) boolean19);
        boolean boolean21 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"\"" + "'", str12, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str5, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        java.lang.String str14 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
        boolean boolean17 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str14, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        java.lang.String str9 = attribute7.getKey();
        java.lang.String str10 = attribute7.toString();
        java.lang.String str11 = attribute7.getValue();
        attribute7.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes14 = attribute7.parent;
        org.jsoup.nodes.Attribute attribute15 = attribute7.clone();
        java.lang.Class<?> wildcardClass16 = attribute15.getClass();
        boolean boolean17 = attribute4.equals((java.lang.Object) attribute15);
        java.lang.String str18 = attribute15.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str18, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "", attributes2);
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"\"");
        boolean boolean7 = attribute3.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        java.lang.String str9 = attribute8.getValue();
        java.lang.String str10 = attribute8.getValue();
        java.lang.String str11 = attribute8.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "");
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute9.parent = attributes10;
        boolean boolean12 = attribute6.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attribute attribute13 = attribute9.clone();
        boolean boolean14 = attribute3.equals((java.lang.Object) attribute13);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"\"", "", attributes9);
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attribute14.parent;
        java.lang.String str16 = attribute14.getKey();
        java.lang.String str17 = attribute14.toString();
        java.lang.String str18 = attribute14.getValue();
        attribute14.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute14.parent = attributes21;
        java.lang.String str23 = attribute14.getKey();
        boolean boolean24 = attribute14.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute25 = attribute14.clone();
        boolean boolean26 = attribute3.equals((java.lang.Object) attribute25);
        boolean boolean27 = attribute3.isDataAttribute();
        boolean boolean28 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"\"" + "'", str17, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.html();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "");
        boolean boolean9 = attribute8.isBooleanAttribute();
        boolean boolean10 = attribute2.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        boolean boolean13 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes16);
        java.lang.Class<?> wildcardClass18 = attribute17.getClass();
        boolean boolean19 = attribute2.equals((java.lang.Object) wildcardClass18);
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute2.parent = attributes20;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = attribute2.shouldCollapseAttribute(outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"\"=\"hi!=&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        org.jsoup.nodes.Attribute attribute11 = attribute9.clone();
        boolean boolean12 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute9.clone();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute2.parent = attributes15;
        boolean boolean17 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", attributes2);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        boolean boolean5 = attribute3.isDataAttribute();
        java.lang.String str6 = attribute3.toString();
        java.lang.String str7 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        java.lang.String str9 = attribute7.getKey();
        java.lang.String str10 = attribute7.toString();
        java.lang.String str11 = attribute7.getValue();
        attribute7.setKey("hi!=\"hi!\"");
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str15 = attribute7.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attribute7.shouldCollapseAttribute(outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str15, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        boolean boolean10 = attribute3.isDataAttribute();
        java.lang.Class<?> wildcardClass11 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"", "hi!=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getValue();
        boolean boolean7 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        boolean boolean5 = attribute2.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        java.lang.String str7 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attribute2.shouldCollapseAttribute(outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        java.lang.String str11 = attribute10.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"\"" + "'", str11, "hi!=\"\"");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute2.isBooleanAttribute();
        java.lang.String str8 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        java.lang.String str10 = attribute9.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.html();
        boolean boolean8 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        java.lang.String str9 = attribute2.getKey();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str14 = attribute2.html();
        java.lang.String str15 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str14, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        org.jsoup.nodes.Attribute attribute11 = attribute9.clone();
        java.lang.String str12 = attribute9.toString();
        boolean boolean13 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute14 = attribute9.clone();
        java.lang.Class<?> wildcardClass15 = attribute9.getClass();
        boolean boolean16 = attribute2.equals((java.lang.Object) wildcardClass15);
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"\"");
        boolean boolean20 = attribute2.equals((java.lang.Object) "hi!");
        java.lang.String str21 = attribute2.getKey();
        java.lang.String str22 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute25 = attribute2.clone();
        java.lang.String str26 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"\"" + "'", str12, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"\"" + "'", str22, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"" + "'", str26, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!=\"\"=\"\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        java.lang.String str9 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute2.parent = attributes10;
        java.lang.String str12 = attribute2.getKey();
        java.lang.String str13 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"\"" + "'", str9, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"" + "'", str13, "hi!=\"\"");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        java.lang.String str7 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute2.html();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute2.parent = attributes10;
        org.jsoup.nodes.Attribute attribute12 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        java.lang.String str14 = attribute12.toString();
        org.jsoup.nodes.Attributes attributes15 = attribute12.parent;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        boolean boolean19 = attribute12.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "");
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute9.parent = attributes10;
        boolean boolean12 = attribute6.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attribute attribute13 = attribute6.clone();
        boolean boolean14 = attribute3.equals((java.lang.Object) attribute6);
        attribute6.setKey("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute3.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        boolean boolean7 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        org.jsoup.nodes.Attributes attributes12 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attribute3.shouldCollapseAttribute(outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute3.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"\"", "", attributes9);
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute10.parent = attributes12;
        org.jsoup.nodes.Attributes attributes14 = attribute10.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attribute10.setValue("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        java.lang.String str7 = attribute6.toString();
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        java.lang.String str12 = attribute10.getKey();
        java.lang.String str13 = attribute10.toString();
        org.jsoup.nodes.Attributes attributes14 = attribute10.parent;
        org.jsoup.nodes.Attributes attributes15 = attribute10.parent;
        boolean boolean16 = attribute6.equals((java.lang.Object) attributes15);
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute20 = attribute19.clone();
        boolean boolean22 = attribute20.equals((java.lang.Object) 0.0d);
        boolean boolean23 = attribute20.isBooleanAttribute();
        java.lang.String str24 = attribute20.html();
        boolean boolean25 = attribute6.equals((java.lang.Object) attribute20);
        boolean boolean26 = attribute6.isDataAttribute();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute6.html(appendable27, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"" + "'", str13, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"" + "'", str24, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute5.html();
        java.lang.String str7 = attribute5.html();
        boolean boolean8 = attribute5.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        java.lang.String str13 = attribute2.html();
        boolean boolean14 = attribute2.isDataAttribute();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str13, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        boolean boolean8 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"\"=\"hi!=\"hi!\"\"");
        java.lang.String str11 = attribute2.getValue();
        java.lang.String str12 = attribute2.toString();
        java.lang.String str13 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"" + "'", str12, "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"" + "'", str13, "hi!=\"\"=\"hi!=\"hi!\"\"");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=\"\"\"=\"hi!=\"\"=\"hi!=&quot;hi!&quot;\"\"");
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes7);
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str6 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.html();
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str15 = attribute14.getKey();
        boolean boolean16 = attribute14.isDataAttribute();
        boolean boolean18 = attribute14.equals((java.lang.Object) 10L);
        java.lang.String str19 = attribute14.getKey();
        attribute14.setKey("hi!=\"hi!\"");
        boolean boolean22 = attribute2.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;&quot;\"", "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", attributes25);
        boolean boolean27 = attribute14.equals((java.lang.Object) attributes25);
        org.jsoup.nodes.Attribute attribute30 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str31 = attribute30.getKey();
        boolean boolean32 = attribute30.isDataAttribute();
        boolean boolean34 = attribute30.equals((java.lang.Object) 10L);
        java.lang.String str35 = attribute30.getKey();
        org.jsoup.nodes.Attributes attributes36 = attribute30.parent;
        org.jsoup.nodes.Attribute attribute39 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        attribute39.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute44 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes45 = attribute44.parent;
        java.lang.String str46 = attribute44.getKey();
        java.lang.String str47 = attribute44.toString();
        java.lang.String str48 = attribute44.getValue();
        attribute44.setKey("hi!=\"hi!\"");
        java.lang.String str51 = attribute44.getKey();
        attribute44.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        boolean boolean54 = attribute39.equals((java.lang.Object) attribute44);
        boolean boolean55 = attribute30.equals((java.lang.Object) attribute44);
        org.jsoup.nodes.Attribute attribute58 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes59 = attribute58.parent;
        java.lang.String str60 = attribute58.getKey();
        java.lang.String str61 = attribute58.toString();
        attribute58.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute66 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes67 = attribute66.parent;
        java.lang.String str68 = attribute66.getKey();
        java.lang.String str69 = attribute66.toString();
        java.lang.String str70 = attribute66.getValue();
        attribute66.setKey("hi!=\"hi!\"");
        boolean boolean73 = attribute66.isDataAttribute();
        java.lang.String str74 = attribute66.toString();
        boolean boolean75 = attribute58.equals((java.lang.Object) attribute66);
        org.jsoup.nodes.Attribute attribute76 = attribute66.clone();
        boolean boolean77 = attribute30.equals((java.lang.Object) attribute66);
        boolean boolean78 = attribute14.equals((java.lang.Object) attribute30);
        org.jsoup.nodes.Attributes attributes79 = null;
        attribute14.parent = attributes79;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str11, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(attributes36);
        org.junit.Assert.assertNotNull(attribute44);
        org.junit.Assert.assertNull(attributes45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!=\"\"" + "'", str47, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!=\"hi!\"" + "'", str51, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attribute58);
        org.junit.Assert.assertNull(attributes59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!=\"\"" + "'", str61, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute66);
        org.junit.Assert.assertNull(attributes67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!=\"\"" + "'", str69, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str74, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(attribute76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        boolean boolean7 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getValue();
        boolean boolean8 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.Object obj8 = null;
        boolean boolean9 = attribute2.equals(obj8);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10.0d);
        boolean boolean7 = attribute2.isBooleanAttribute();
        boolean boolean8 = attribute2.isDataAttribute();
        boolean boolean9 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        boolean boolean7 = attribute2.equals((java.lang.Object) 10.0d);
        boolean boolean8 = attribute2.isBooleanAttribute();
        boolean boolean10 = attribute2.equals((java.lang.Object) (byte) -1);
        boolean boolean11 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute9 = attribute8.clone();
        boolean boolean11 = attribute9.equals((java.lang.Object) 0.0d);
        java.lang.String str12 = attribute9.html();
        boolean boolean13 = attribute9.isDataAttribute();
        java.lang.Class<?> wildcardClass14 = attribute9.getClass();
        boolean boolean15 = attribute5.equals((java.lang.Object) wildcardClass14);
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute5.parent = attributes16;
        java.lang.String str18 = attribute5.toString();
        java.lang.Class<?> wildcardClass19 = attribute5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        boolean boolean7 = attribute5.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        boolean boolean7 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        org.jsoup.nodes.Attributes attributes12 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"");
        java.lang.String str15 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str12 = attribute3.getValue();
        boolean boolean13 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute3.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "", attributes6);
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"\"");
        boolean boolean11 = attribute7.equals((java.lang.Object) attribute10);
        java.lang.String str12 = attribute10.getKey();
        java.lang.String str13 = attribute10.toString();
        java.lang.String str14 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute15 = attribute10.clone();
        boolean boolean16 = attribute15.isBooleanAttribute();
        boolean boolean17 = attribute3.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str13, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"\"" + "'", str14, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        boolean boolean14 = attribute13.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"\"" + "'", str4, "hi!=\"\"=\"\"");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.getValue();
        java.lang.String str7 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"", "hi!");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.getKey();
        java.lang.String str7 = attribute2.toString();
        java.lang.String str8 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10.0d);
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        org.jsoup.nodes.Attribute attribute11 = attribute9.clone();
        java.lang.String str12 = attribute9.toString();
        org.jsoup.nodes.Attribute attribute13 = attribute9.clone();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute13);
        java.lang.String str15 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"\"" + "'", str12, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"\"" + "'", str15, "hi!=\"\"");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"\"=\"hi!=\"hi!\"\"");
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes10);
        java.lang.String str12 = attribute11.toString();
        java.lang.String str13 = attribute11.getValue();
        java.lang.String str14 = attribute11.toString();
        java.lang.String str15 = attribute11.html();
        java.lang.String str16 = attribute11.getKey();
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute11);
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str15, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"\"" + "'", str16, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.html();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.String str6 = attribute3.getValue();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        boolean boolean11 = attribute10.isDataAttribute();
        attribute10.setKey("hi!");
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute10);
        boolean boolean15 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str19 = attribute18.getKey();
        boolean boolean20 = attribute18.isDataAttribute();
        java.lang.String str21 = attribute18.toString();
        org.jsoup.nodes.Attribute attribute22 = attribute18.clone();
        boolean boolean23 = attribute18.isDataAttribute();
        org.jsoup.nodes.Attributes attributes24 = attribute18.parent;
        java.lang.String str25 = attribute18.getValue();
        boolean boolean26 = attribute2.equals((java.lang.Object) attribute18);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = attribute2.shouldCollapseAttribute(outputSettings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"" + "'", str5, "hi!=\"\"=\"hi!=\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        boolean boolean8 = attribute2.isBooleanAttribute();
        boolean boolean9 = attribute2.isBooleanAttribute();
        boolean boolean11 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean12 = attribute2.isBooleanAttribute();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable13, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        boolean boolean9 = attribute2.isBooleanAttribute();
        boolean boolean10 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.String str7 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"\"\"=\"hi!=\"\"=\"hi!=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.toString();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute2.parent = attributes13;
        boolean boolean15 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.getKey();
        java.lang.String str8 = attribute2.html();
        java.lang.String str9 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"\"");
        java.lang.String str12 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"\"");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        java.lang.String str9 = attribute3.toString();
        boolean boolean10 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes9);
        java.lang.String str11 = attribute10.toString();
        boolean boolean12 = attribute3.equals((java.lang.Object) str11);
        attribute3.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute15 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute16 = attribute15.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str11, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertNotNull(attribute16);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute15 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str16 = attribute15.getKey();
        boolean boolean17 = attribute2.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attribute attribute20 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes21 = attribute20.parent;
        org.jsoup.nodes.Attribute attribute22 = attribute20.clone();
        java.lang.String str23 = attribute20.toString();
        java.lang.String str24 = attribute20.getValue();
        org.jsoup.nodes.Attribute attribute25 = attribute20.clone();
        org.jsoup.nodes.Attribute attribute26 = attribute20.clone();
        boolean boolean27 = attribute2.equals((java.lang.Object) attribute20);
        java.lang.String str28 = attribute2.getKey();
        java.lang.String str29 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertNull(attributes21);
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"\"" + "'", str23, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertNotNull(attribute26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!=\"hi!\"" + "'", str28, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str29, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.getKey();
        java.lang.String str8 = attribute2.html();
        java.lang.String str9 = attribute2.html();
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute13 = attribute12.clone();
        boolean boolean15 = attribute13.equals((java.lang.Object) 0.0d);
        boolean boolean16 = attribute13.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = attribute13.parent;
        org.jsoup.nodes.Attribute attribute18 = attribute13.clone();
        org.jsoup.nodes.Attribute attribute19 = attribute18.clone();
        boolean boolean20 = attribute2.equals((java.lang.Object) attribute18);
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute2.parent = attributes21;
        boolean boolean24 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes25 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes26 = attribute2.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = attribute2.shouldCollapseAttribute(outputSettings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertNull(attributes26);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute3.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        boolean boolean6 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        boolean boolean12 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute2.parent = attributes13;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        boolean boolean9 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute2.parent = attributes11;
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute2.parent = attributes13;
        org.jsoup.nodes.Attribute attribute17 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"", "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"\"");
        boolean boolean18 = attribute2.equals((java.lang.Object) "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean22 = attribute2.equals((java.lang.Object) "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.Class<?> wildcardClass23 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!");
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes6);
        java.lang.String str8 = attribute7.getValue();
        java.lang.String str9 = attribute7.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute7);
        boolean boolean11 = attribute7.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes12 = attribute7.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        boolean boolean8 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"\"=\"hi!=\"hi!\"\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attribute2.shouldCollapseAttribute(outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        java.lang.String str10 = attribute8.getKey();
        boolean boolean12 = attribute8.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass13 = attribute8.getClass();
        boolean boolean14 = attribute2.equals((java.lang.Object) wildcardClass13);
        java.lang.String str15 = attribute2.html();
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute19 = attribute18.clone();
        boolean boolean20 = attribute2.equals((java.lang.Object) attribute18);
        java.lang.String str21 = attribute2.getKey();
        java.lang.String str22 = attribute2.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = attribute2.shouldCollapseAttribute(outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"\"" + "'", str15, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"\"" + "'", str22, "hi!=\"\"");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        java.lang.String str9 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute12 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        org.jsoup.nodes.Attribute attribute14 = attribute12.clone();
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Attributes attributes16 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes17 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertNull(attributes17);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"\"");
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute15 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str16 = attribute15.getKey();
        boolean boolean17 = attribute2.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attribute attribute20 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes21 = attribute20.parent;
        org.jsoup.nodes.Attribute attribute22 = attribute20.clone();
        java.lang.String str23 = attribute20.toString();
        java.lang.String str24 = attribute20.getValue();
        org.jsoup.nodes.Attribute attribute25 = attribute20.clone();
        org.jsoup.nodes.Attribute attribute26 = attribute20.clone();
        boolean boolean27 = attribute2.equals((java.lang.Object) attribute20);
        boolean boolean28 = attribute20.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertNull(attributes21);
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"\"" + "'", str23, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertNotNull(attribute26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"", "hi!=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"\"", "hi!=\"\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isDataAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"", "", attributes2);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"\"=\"hi!=\"hi!\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"=\"\"\"=\"hi!=\"hi!\"=\"hi!=\"\"\"\"=\"hi!=\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"=\"\"\"=\"\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"");
        boolean boolean9 = attribute5.equals((java.lang.Object) attribute8);
        attribute8.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        java.lang.String str7 = attribute3.html();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "", attributes10);
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"\"");
        boolean boolean15 = attribute11.equals((java.lang.Object) attribute14);
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute20 = attribute19.clone();
        org.jsoup.nodes.Attribute attribute21 = attribute19.clone();
        boolean boolean23 = attribute21.equals((java.lang.Object) (byte) 0);
        java.lang.String str24 = attribute21.getKey();
        org.jsoup.nodes.Attribute attribute25 = attribute21.clone();
        boolean boolean26 = attribute14.equals((java.lang.Object) attribute21);
        org.jsoup.nodes.Attribute attribute29 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes30 = attribute29.parent;
        java.lang.String str31 = attribute29.getKey();
        boolean boolean32 = attribute29.isBooleanAttribute();
        java.lang.String str33 = attribute29.html();
        org.jsoup.nodes.Attribute attribute36 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes37 = attribute36.parent;
        org.jsoup.nodes.Attribute attribute38 = attribute36.clone();
        java.lang.String str39 = attribute36.toString();
        boolean boolean40 = attribute36.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute41 = attribute36.clone();
        java.lang.Class<?> wildcardClass42 = attribute36.getClass();
        boolean boolean43 = attribute29.equals((java.lang.Object) wildcardClass42);
        org.jsoup.nodes.Attribute attribute46 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"\"");
        boolean boolean47 = attribute29.equals((java.lang.Object) "hi!");
        java.lang.String str48 = attribute29.getKey();
        java.lang.String str49 = attribute29.getKey();
        boolean boolean50 = attribute14.equals((java.lang.Object) str49);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNull(attributes30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"\"" + "'", str33, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertNull(attributes37);
        org.junit.Assert.assertNotNull(attribute38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!=\"\"" + "'", str39, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attribute41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"\"");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        java.lang.String str14 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute15 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        java.lang.String str18 = attribute2.getValue();
        java.lang.String str19 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute20 = attribute2.clone();
        boolean boolean21 = attribute20.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str14, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"" + "'", str19, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"", "hi!=\"\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        org.jsoup.nodes.Attribute attribute8 = attribute6.clone();
        java.lang.String str9 = attribute6.toString();
        java.lang.String str10 = attribute6.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute6.clone();
        org.jsoup.nodes.Attributes attributes12 = attribute6.parent;
        org.jsoup.nodes.Attribute attribute13 = attribute6.clone();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute13.parent = attributes14;
        boolean boolean16 = attribute2.equals((java.lang.Object) attribute13);
        java.lang.Object obj17 = null;
        boolean boolean18 = attribute2.equals(obj17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"\"" + "'", str9, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "hi!=\"\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"\"\"=\"\"");
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=\"\"\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"hi!=\"\"\"=\"\"");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"", "hi!");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.getKey();
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.html();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        boolean boolean10 = attribute2.isBooleanAttribute();
        java.lang.String str11 = attribute2.getValue();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attribute13.shouldCollapseAttribute(outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str9 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"" + "'", str9, "hi!=\"\"=\"hi!=\"hi!\"\"");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean10 = attribute8.equals((java.lang.Object) 0.0d);
        java.lang.String str11 = attribute8.html();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute8.parent = attributes12;
        boolean boolean14 = attribute2.equals((java.lang.Object) attributes12);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"\"" + "'", str4, "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str9 = attribute7.getValue();
        boolean boolean10 = attribute7.isBooleanAttribute();
        java.lang.Class<?> wildcardClass11 = attribute7.getClass();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.isDataAttribute();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes9 = attribute2.parent;
        java.lang.String str10 = attribute2.getValue();
        java.lang.Class<?> wildcardClass11 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.String str7 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        org.jsoup.nodes.Attribute attribute12 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean13 = attribute12.isDataAttribute();
        java.lang.String str14 = attribute12.toString();
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute18 = attribute17.clone();
        boolean boolean20 = attribute18.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes21 = attribute18.parent;
        org.jsoup.nodes.Attributes attributes22 = attribute18.parent;
        attribute18.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean25 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean26 = attribute12.isBooleanAttribute();
        attribute12.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean29 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(attributes21);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "", attributes2);
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"\"");
        boolean boolean7 = attribute3.equals((java.lang.Object) attribute6);
        java.lang.String str8 = attribute6.getKey();
        java.lang.String str9 = attribute6.toString();
        java.lang.String str10 = attribute6.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute6.clone();
        boolean boolean12 = attribute11.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str9, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "hi!", attributes2);
        java.lang.String str4 = attribute3.html();
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.String str7 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"\"", "", attributes9);
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attribute14.parent;
        java.lang.String str16 = attribute14.getKey();
        java.lang.String str17 = attribute14.toString();
        java.lang.String str18 = attribute14.getValue();
        attribute14.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute14.parent = attributes21;
        java.lang.String str23 = attribute14.getKey();
        boolean boolean24 = attribute14.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute25 = attribute14.clone();
        boolean boolean26 = attribute3.equals((java.lang.Object) attribute25);
        boolean boolean27 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes28 = null;
        attribute3.parent = attributes28;
        boolean boolean30 = attribute3.isDataAttribute();
        java.lang.Class<?> wildcardClass31 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"\"" + "'", str17, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean6 = attribute4.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = attribute4.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = attribute4.equals(obj8);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"", "");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        boolean boolean7 = attribute2.isBooleanAttribute();
        boolean boolean8 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute2.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"" + "'", str5, "hi!=\"\"=\"hi!=\"hi!\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        boolean boolean13 = attribute2.isDataAttribute();
        java.lang.String str14 = attribute2.getValue();
        boolean boolean15 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        java.lang.String str9 = attribute7.getKey();
        boolean boolean10 = attribute7.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute7.parent = attributes11;
        boolean boolean13 = attribute4.equals((java.lang.Object) attributes11);
        boolean boolean14 = attribute4.isDataAttribute();
        boolean boolean15 = attribute4.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str9 = attribute8.getKey();
        boolean boolean10 = attribute8.isDataAttribute();
        boolean boolean12 = attribute8.equals((java.lang.Object) 10L);
        java.lang.String str13 = attribute8.html();
        attribute8.setKey("hi!=\"\"=\"hi!=\"hi!\"\"");
        java.lang.String str16 = attribute8.getValue();
        boolean boolean17 = attribute2.equals((java.lang.Object) str16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute5.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        boolean boolean9 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute2.parent = attributes11;
        java.lang.String str13 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute16 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes17 = attribute16.parent;
        java.lang.String str18 = attribute16.getKey();
        boolean boolean20 = attribute16.equals((java.lang.Object) 10.0d);
        org.jsoup.nodes.Attribute attribute23 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes24 = attribute23.parent;
        org.jsoup.nodes.Attribute attribute25 = attribute23.clone();
        java.lang.String str26 = attribute23.toString();
        org.jsoup.nodes.Attribute attribute27 = attribute23.clone();
        boolean boolean28 = attribute16.equals((java.lang.Object) attribute27);
        boolean boolean29 = attribute16.isBooleanAttribute();
        attribute16.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        boolean boolean32 = attribute2.equals((java.lang.Object) attribute16);
        java.lang.String str33 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"\"" + "'", str26, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str33, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str17 = attribute16.getKey();
        boolean boolean18 = attribute16.isDataAttribute();
        boolean boolean20 = attribute16.equals((java.lang.Object) 10L);
        boolean boolean21 = attribute2.equals((java.lang.Object) attribute16);
        java.lang.String str22 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute23 = attribute2.clone();
        attribute23.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Class<?> wildcardClass26 = attribute23.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str22, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"\"", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
        attribute3.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"");
        java.lang.String str8 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10.0d);
        boolean boolean7 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute2.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"", "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        boolean boolean8 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        boolean boolean12 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        java.lang.String str7 = attribute5.getKey();
        java.lang.String str8 = attribute5.toString();
        java.lang.String str9 = attribute5.getValue();
        attribute5.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute5.parent = attributes12;
        java.lang.String str14 = attribute5.getKey();
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str16 = attribute5.html();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute5.parent = attributes17;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"\"" + "'", str8, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str16, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        boolean boolean7 = attribute2.equals((java.lang.Object) "hi!=\"\"=\"hi!\"");
        java.lang.String str8 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes9 = attribute2.parent;
        java.lang.String str10 = attribute2.toString();
        java.lang.String str11 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes12 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        java.lang.String str5 = attribute3.html();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes8);
        boolean boolean10 = attribute9.isDataAttribute();
        attribute9.setKey("hi!=\"\"=\"hi!=\"hi!\"\"");
        org.jsoup.nodes.Attribute attribute13 = attribute9.clone();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes16);
        java.lang.String str18 = attribute17.toString();
        java.lang.String str19 = attribute17.getValue();
        java.lang.String str20 = attribute17.toString();
        java.lang.String str21 = attribute17.html();
        java.lang.String str22 = attribute17.getKey();
        boolean boolean23 = attribute9.equals((java.lang.Object) attribute17);
        boolean boolean24 = attribute3.equals((java.lang.Object) attribute17);
        attribute17.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str20, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str21, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"\"" + "'", str22, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.html();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"\"", "hi!=\"\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "");
        boolean boolean3 = attribute2.isDataAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        java.lang.String str9 = attribute7.getKey();
        java.lang.String str10 = attribute7.toString();
        java.lang.String str11 = attribute7.getValue();
        attribute7.setKey("hi!=\"hi!\"");
        java.lang.String str14 = attribute7.getKey();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        boolean boolean17 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str18 = attribute7.getKey();
        org.jsoup.nodes.Attribute attribute19 = attribute7.clone();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute7.parent = attributes20;
        boolean boolean22 = attribute7.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.html();
        boolean boolean8 = attribute2.isDataAttribute();
        java.lang.String str9 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute2.parent = attributes10;
        java.lang.String str12 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;&quot;&quot;\"");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!=\"\"=\"\"\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.html();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!=\"\"=\"\"\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        boolean boolean9 = attribute7.equals((java.lang.Object) 0.0d);
        boolean boolean10 = attribute7.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute7.parent = attributes11;
        org.jsoup.nodes.Attribute attribute13 = attribute7.clone();
        java.lang.String str14 = attribute13.html();
        boolean boolean15 = attribute2.equals((java.lang.Object) str14);
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable16, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean8 = attribute6.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes9 = attribute6.parent;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!=\"\"", "", attributes12);
        boolean boolean14 = attribute6.equals((java.lang.Object) attribute13);
        org.jsoup.nodes.Attribute attribute17 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes18 = attribute17.parent;
        java.lang.String str19 = attribute17.getKey();
        java.lang.String str20 = attribute17.toString();
        java.lang.String str21 = attribute17.getValue();
        attribute17.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes24 = null;
        attribute17.parent = attributes24;
        java.lang.String str26 = attribute17.getKey();
        boolean boolean27 = attribute17.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute28 = attribute17.clone();
        boolean boolean29 = attribute6.equals((java.lang.Object) attribute28);
        java.lang.String str30 = attribute28.getValue();
        org.jsoup.nodes.Attributes attributes31 = attribute28.parent;
        boolean boolean32 = attribute2.equals((java.lang.Object) attributes31);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"\"" + "'", str20, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attribute28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute2.isBooleanAttribute();
        java.lang.String str8 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        java.lang.String str10 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str13 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        java.lang.String str6 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        java.lang.String str4 = attribute3.getKey();
        boolean boolean6 = attribute3.equals((java.lang.Object) 10.0d);
        boolean boolean7 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        java.lang.String str11 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isDataAttribute();
        java.lang.String str6 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        boolean boolean10 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes14 = attribute13.parent;
        org.jsoup.nodes.Attribute attribute15 = attribute13.clone();
        java.lang.String str16 = attribute13.toString();
        java.lang.String str17 = attribute13.getValue();
        org.jsoup.nodes.Attribute attribute18 = attribute13.clone();
        org.jsoup.nodes.Attribute attribute19 = attribute13.clone();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute13.parent = attributes20;
        java.lang.String str22 = attribute13.html();
        org.jsoup.nodes.Attribute attribute23 = attribute13.clone();
        boolean boolean24 = attribute2.equals((java.lang.Object) attribute23);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"\"" + "'", str16, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"\"" + "'", str22, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"\"");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        java.lang.Class<?> wildcardClass11 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!=\"\"=\"\"\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str5 = attribute3.getKey();
        java.lang.String str6 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute5.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        boolean boolean10 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        java.lang.String str13 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute14 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute15 = attribute10.clone();
        boolean boolean16 = attribute15.isDataAttribute();
        boolean boolean17 = attribute2.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"" + "'", str3, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attribute14.parent;
        java.lang.String str16 = attribute14.getKey();
        java.lang.String str17 = attribute14.toString();
        attribute14.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean20 = attribute2.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Attribute attribute21 = attribute14.clone();
        attribute14.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str24 = attribute14.getValue();
        org.jsoup.nodes.Attribute attribute27 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes28 = attribute27.parent;
        java.lang.String str29 = attribute27.getKey();
        boolean boolean30 = attribute27.isBooleanAttribute();
        java.lang.String str31 = attribute27.html();
        org.jsoup.nodes.Attribute attribute34 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes35 = attribute34.parent;
        org.jsoup.nodes.Attribute attribute36 = attribute34.clone();
        java.lang.String str37 = attribute34.toString();
        boolean boolean38 = attribute34.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute39 = attribute34.clone();
        java.lang.Class<?> wildcardClass40 = attribute34.getClass();
        boolean boolean41 = attribute27.equals((java.lang.Object) wildcardClass40);
        java.lang.String str42 = attribute27.toString();
        org.jsoup.nodes.Attributes attributes43 = attribute27.parent;
        java.lang.String str44 = attribute27.getKey();
        boolean boolean45 = attribute14.equals((java.lang.Object) str44);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"\"" + "'", str17, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!=\"\"" + "'", str31, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertNull(attributes35);
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!=\"\"" + "'", str37, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!=\"\"" + "'", str42, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute4.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.String str6 = attribute3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attribute3.setValue("hi!=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"", attributes2);
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.html();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        java.lang.String str7 = attribute6.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str7, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.getKey();
        java.lang.String str8 = attribute2.html();
        java.lang.String str9 = attribute2.html();
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute13 = attribute12.clone();
        boolean boolean15 = attribute13.equals((java.lang.Object) 0.0d);
        boolean boolean16 = attribute13.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = attribute13.parent;
        org.jsoup.nodes.Attribute attribute18 = attribute13.clone();
        org.jsoup.nodes.Attribute attribute19 = attribute18.clone();
        boolean boolean20 = attribute2.equals((java.lang.Object) attribute18);
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute2.parent = attributes21;
        boolean boolean24 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes25 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes26 = null;
        attribute2.parent = attributes26;
        java.lang.String str28 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = attribute2.shouldCollapseAttribute(outputSettings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str6 = attribute5.html();
        java.lang.String str7 = attribute5.toString();
        attribute5.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes10 = attribute5.parent;
        boolean boolean11 = attribute5.isDataAttribute();
        attribute5.setKey("hi!=\"\"=\"hi!=\"hi!\"\"");
        boolean boolean14 = attribute2.equals((java.lang.Object) "hi!=\"\"=\"hi!=\"hi!\"\"");
        boolean boolean15 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "", attributes2);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        java.lang.String str9 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        java.lang.Class<?> wildcardClass12 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        java.lang.String str9 = attribute7.getKey();
        boolean boolean10 = attribute7.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute7.parent = attributes11;
        boolean boolean13 = attribute4.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.Attribute attribute16 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        attribute16.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        boolean boolean19 = attribute16.isDataAttribute();
        boolean boolean20 = attribute4.equals((java.lang.Object) attribute16);
        org.jsoup.nodes.Attribute attribute23 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes24 = attribute23.parent;
        org.jsoup.nodes.Attribute attribute25 = attribute23.clone();
        java.lang.String str26 = attribute23.getValue();
        org.jsoup.nodes.Attribute attribute27 = attribute23.clone();
        java.lang.String str28 = attribute23.getValue();
        java.lang.String str29 = attribute23.getKey();
        boolean boolean30 = attribute23.isDataAttribute();
        boolean boolean31 = attribute4.equals((java.lang.Object) attribute23);
        org.jsoup.nodes.Attribute attribute32 = attribute23.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attribute32);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"\"", "", attributes9);
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = attribute14.parent;
        java.lang.String str16 = attribute14.getKey();
        java.lang.String str17 = attribute14.toString();
        java.lang.String str18 = attribute14.getValue();
        attribute14.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute14.parent = attributes21;
        java.lang.String str23 = attribute14.getKey();
        boolean boolean24 = attribute14.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute25 = attribute14.clone();
        boolean boolean26 = attribute3.equals((java.lang.Object) attribute25);
        boolean boolean27 = attribute3.isDataAttribute();
        java.lang.String str28 = attribute3.getKey();
        java.lang.String str29 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"\"" + "'", str17, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"", "", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"");
        java.lang.String str10 = attribute9.html();
        boolean boolean11 = attribute3.equals((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;\"" + "'", str10, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        java.lang.String str9 = attribute8.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute8.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"\"\"=\"\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.getKey();
        java.lang.String str6 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str5, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean10 = attribute8.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes11 = attribute8.parent;
        org.jsoup.nodes.Attributes attributes12 = attribute8.parent;
        attribute8.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute8);
        boolean boolean16 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str19 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str19, "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"\"\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attribute2.shouldCollapseAttribute(outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"\"\"=\"hi!=\"hi!\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"\"\"=\"hi!=\"hi!\"\"");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", "", attributes7);
        boolean boolean9 = attribute8.isBooleanAttribute();
        java.lang.String str10 = attribute8.getValue();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute3.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=\"\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute2.parent = attributes10;
        java.lang.String str12 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute2.parent = attributes13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        java.lang.String str13 = attribute10.getValue();
        boolean boolean14 = attribute10.isDataAttribute();
        org.jsoup.nodes.Attribute attribute15 = attribute10.clone();
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute3.parent = attributes17;
        boolean boolean19 = attribute3.isBooleanAttribute();
        java.lang.String str20 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str24 = attribute23.toString();
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        boolean boolean28 = attribute23.equals((java.lang.Object) attribute27);
        boolean boolean29 = attribute3.equals((java.lang.Object) attribute27);
        java.lang.String str30 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes31 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"" + "'", str24, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!=\"hi!\"" + "'", str30, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes31);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        boolean boolean6 = attribute2.isDataAttribute();
        boolean boolean7 = attribute2.isDataAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attribute2.shouldCollapseAttribute(outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"\"\"=\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"", "hi!");
        java.lang.String str3 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isBooleanAttribute();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        java.lang.String str9 = attribute8.html();
        boolean boolean10 = attribute4.equals((java.lang.Object) attribute8);
        java.lang.String str11 = attribute8.getKey();
        attribute8.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attribute8.shouldCollapseAttribute(outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        boolean boolean8 = attribute3.isBooleanAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attributes attributes7 = attribute5.parent;
        java.lang.String str8 = attribute5.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"\"" + "'", str8, "hi!=\"\"");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        java.lang.Class<?> wildcardClass6 = attribute3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getKey();
        boolean boolean12 = attribute2.isDataAttribute();
        boolean boolean13 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute2.parent = attributes14;
        java.lang.Class<?> wildcardClass16 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"=\"hi!\"=\"hi!=\"\"=\"\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        java.lang.String str6 = attribute3.html();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attribute3.setValue("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"\"" + "'", str11, "hi!=\"\"");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"\"", attributes2);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"\"", attributes2);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"\"", "hi!=\"\"=\"\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"=\"\"\"=\"hi!=\"hi!\"=\"hi!=\"\"\"\"=\"hi!=\"\"=\"\"=\"hi!=\"\"=\"hi!=\"hi!\"\"=\"\"\"=\"\"\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"", attributes5);
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        java.lang.String str8 = attribute6.getValue();
        boolean boolean9 = attribute6.isBooleanAttribute();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", attributes6);
        boolean boolean8 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute7.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"", "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"\"\"=\"hi!=\"\"=\"hi!=&quot;hi!&quot;\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = attribute2.parent;
        java.lang.String str10 = attribute2.getKey();
        boolean boolean11 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;=&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        java.lang.String str7 = attribute3.html();
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute11 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute11.setKey("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        boolean boolean14 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute3.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.getValue();
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean6 = attribute4.equals((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute4.parent = attributes7;
        boolean boolean9 = attribute4.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute4.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"\"=\"\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=\"hi!\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.Class<?> wildcardClass8 = attribute7.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        org.jsoup.nodes.Attribute attribute10 = attribute8.clone();
        java.lang.String str11 = attribute8.toString();
        java.lang.String str12 = attribute8.getValue();
        org.jsoup.nodes.Attribute attribute13 = attribute8.clone();
        org.jsoup.nodes.Attribute attribute14 = attribute8.clone();
        org.jsoup.nodes.Attributes attributes15 = attribute8.parent;
        java.lang.String str16 = attribute8.getKey();
        org.jsoup.nodes.Attribute attribute19 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "hi!");
        java.lang.String str20 = attribute19.getKey();
        org.jsoup.nodes.Attribute attribute21 = attribute19.clone();
        boolean boolean22 = attribute8.equals((java.lang.Object) attribute19);
        boolean boolean23 = attribute19.isDataAttribute();
        boolean boolean24 = attribute3.equals((java.lang.Object) attribute19);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = attribute19.shouldCollapseAttribute(outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"\"" + "'", str11, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"\"" + "'", str20, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.html();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        java.lang.Class<?> wildcardClass11 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        java.lang.String str13 = attribute2.html();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute2.parent = attributes14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attribute2.setValue("hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str13, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.toString();
        java.lang.String str7 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        java.lang.String str10 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"", attributes13);
        attribute14.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        boolean boolean17 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"" + "'", str6, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"\"" + "'", str7, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"\"" + "'", str4, "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"=\"hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"\"");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;&amp;amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        java.lang.String str13 = attribute2.html();
        java.lang.String str14 = attribute2.getValue();
        java.lang.String str15 = attribute2.getValue();
        java.lang.Class<?> wildcardClass16 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str13, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"\"\"=\"hi!=\"hi!\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isDataAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        boolean boolean5 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"=\"\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute2.parent = attributes13;
        java.lang.String str15 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;\"", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=\"hi!\"\"", "hi!=\"\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str9 = attribute7.getValue();
        boolean boolean10 = attribute7.isBooleanAttribute();
        boolean boolean11 = attribute7.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        boolean boolean7 = attribute2.isDataAttribute();
        boolean boolean8 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", "hi!=\"\"=\"hi!=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute2.parent = attributes13;
        boolean boolean15 = attribute2.isBooleanAttribute();
        java.lang.String str16 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str16, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        boolean boolean9 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute2.parent = attributes11;
        java.lang.String str13 = attribute2.html();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute2.parent = attributes14;
        org.jsoup.nodes.Attribute attribute16 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str13, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute16);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str11 = attribute10.html();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"\"" + "'", str11, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean10 = attribute8.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attributes attributes11 = attribute8.parent;
        org.jsoup.nodes.Attributes attributes12 = attribute8.parent;
        attribute8.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute8);
        java.lang.String str16 = attribute2.getValue();
        java.lang.String str17 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes18 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"" + "'", str16, "hi!=\"\"=\"hi!=\"hi!\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"" + "'", str17, "hi!=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"\"=\"\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        boolean boolean5 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.equals((java.lang.Object) 10L);
        java.lang.String str7 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        attribute11.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute16 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes17 = attribute16.parent;
        java.lang.String str18 = attribute16.getKey();
        java.lang.String str19 = attribute16.toString();
        java.lang.String str20 = attribute16.getValue();
        attribute16.setKey("hi!=\"hi!\"");
        java.lang.String str23 = attribute16.getKey();
        attribute16.setKey("hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
        boolean boolean26 = attribute11.equals((java.lang.Object) attribute16);
        boolean boolean27 = attribute2.equals((java.lang.Object) attribute16);
        org.jsoup.nodes.Attribute attribute30 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes31 = attribute30.parent;
        java.lang.String str32 = attribute30.getKey();
        java.lang.String str33 = attribute30.toString();
        attribute30.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute38 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes39 = attribute38.parent;
        java.lang.String str40 = attribute38.getKey();
        java.lang.String str41 = attribute38.toString();
        java.lang.String str42 = attribute38.getValue();
        attribute38.setKey("hi!=\"hi!\"");
        boolean boolean45 = attribute38.isDataAttribute();
        java.lang.String str46 = attribute38.toString();
        boolean boolean47 = attribute30.equals((java.lang.Object) attribute38);
        org.jsoup.nodes.Attribute attribute48 = attribute38.clone();
        boolean boolean49 = attribute2.equals((java.lang.Object) attribute38);
        org.jsoup.nodes.Attributes attributes50 = attribute2.parent;
        boolean boolean51 = attribute2.isBooleanAttribute();
        java.lang.Class<?> wildcardClass52 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"\"" + "'", str19, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"\"" + "'", str33, "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute38);
        org.junit.Assert.assertNull(attributes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!=\"\"" + "'", str41, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str46, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(attribute48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        java.lang.String str7 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        java.lang.Class<?> wildcardClass11 = attribute10.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        attribute10.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        java.lang.String str11 = attribute10.getValue();
        boolean boolean12 = attribute10.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;&quot;&quot;=&quot;&quot;=&quot;hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        java.lang.String str9 = attribute7.getKey();
        java.lang.String str10 = attribute7.toString();
        java.lang.String str11 = attribute7.getValue();
        attribute7.setKey("hi!=\"hi!\"");
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute7);
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute7.parent = attributes17;
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute7.html(appendable19, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"\"" + "'", str10, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attribute5.setValue("hi!=\"hi!\"=\"\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;&quot;\"");
    }
}

