package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        attributes15.removeIgnoreCase("data-");
        attributes15.remove(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        attributes15.removeIgnoreCase(" data- hi!=\" data-\"");
        java.lang.Class<?> wildcardClass33 = attributes15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes15 = attributes14.clone();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes24.dataset();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes27.dataset();
        attributes24.addAll(attributes27);
        attributes24.remove("hi!");
        boolean boolean33 = attributes24.hasKeyIgnoreCase("");
        attributes24.remove("data-");
        org.jsoup.nodes.Attributes attributes36 = attributes24.clone();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes37.iterator();
        int int40 = attributes37.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor41 = attributes37.iterator();
        boolean boolean42 = attributes36.equals((java.lang.Object) attributes37);
        boolean boolean44 = attributes36.hasKeyIgnoreCase(" data-");
        java.lang.String str46 = attributes36.get(" data-=\" data-\"");
        attributes36.remove(" hi!=\"\"=\" hi!=&quot;&quot;\"=\"\"");
        attributes0.addAll(attributes36);
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
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertNotNull(attributeItor39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(attributeItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes0.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        java.lang.String str20 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes11.iterator();
        int int14 = attributes11.size();
        attributes11.remove("hi!");
        attributes10.addAll(attributes11);
        attributes10.removeIgnoreCase(" hi!=\"\"=\"data-\"");
        java.lang.String str21 = attributes10.get(" hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        int int6 = attributes1.size();
        attributes1.removeIgnoreCase("hi!");
        attributes1.put("hi!", "hi!");
        attributes1.put(" data-=\" hi!=&quot;hi!&quot;\"", " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        java.lang.String str21 = attributes0.getIgnoreCase(" hi!");
        attributes0.remove(" hi!=\"hi!\" data-=\" hi!=&quot;hi!&quot;\"");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        attributes0.remove(" hi!");
        boolean boolean22 = attributes0.hasKey(" hi!=\"\"=\"data-\"=\" hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        attributes24.put("hi!", "hi!");
        attributes24.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes24.dataset();
        boolean boolean34 = attributes24.hasKeyIgnoreCase(" hi!");
        boolean boolean36 = attributes24.hasKeyIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        boolean boolean37 = attributes5.equals((java.lang.Object) " hi!=\"\"=\" hi!=&quot;&quot;\"");
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
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.hasKey("data-");
        java.lang.String str10 = attributes0.getIgnoreCase(" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes12.dataset();
        int int15 = attributes12.size();
        boolean boolean17 = attributes12.hasKeyIgnoreCase("data-");
        attributes12.removeIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes12.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes12.dataset();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes23.dataset();
        boolean boolean25 = attributes22.equals((java.lang.Object) attributes23);
        boolean boolean27 = attributes23.hasKey("data-");
        int int28 = attributes23.size();
        attributes23.removeIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes23.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes23.spliterator();
        org.jsoup.nodes.Attributes attributes33 = attributes23.clone();
        boolean boolean34 = attributes12.equals((java.lang.Object) attributes23);
        attributes11.addAll(attributes23);
        attributes23.remove(" hi!=\"\"");
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        attributes23.html(appendable38, outputSettings39);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.lang.String str20 = attributes1.html();
        boolean boolean22 = attributes1.hasKey(" data-");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("data-");
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
        org.jsoup.nodes.Attributes attributes24 = attributes10.clone();
        boolean boolean26 = attributes24.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes24.iterator();
        boolean boolean28 = attributes0.equals((java.lang.Object) attributeItor27);
        org.jsoup.nodes.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.lang.String str4 = attributes1.html();
        attributes1.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes1.asList();
        boolean boolean10 = attributes1.hasKeyIgnoreCase(" hi!=\"\"=\"data-\"");
        boolean boolean12 = attributes1.hasKeyIgnoreCase(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        boolean boolean16 = attributes13.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes17.dataset();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes20.dataset();
        attributes17.addAll(attributes20);
        attributes13.addAll(attributes17);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes13.dataset();
        boolean boolean26 = attributes13.hasKeyIgnoreCase("");
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes13.html(appendable27, outputSettings28);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes13.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList31 = attributes13.asList();
        attributes13.remove(" hi!");
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        attributes13.html(appendable34, outputSettings35);
        boolean boolean37 = attributes1.equals((java.lang.Object) attributes13);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes1.spliterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertNotNull(attributeList31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        attributes16.put(" data-", "hi!");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes20.dataset();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes23.dataset();
        attributes20.addAll(attributes23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes20.html(appendable26, outputSettings27);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes29.dataset();
        int int32 = attributes29.size();
        java.lang.String str33 = attributes29.html();
        attributes29.put("data-", true);
        attributes29.put("hi!", true);
        attributes29.removeIgnoreCase("hi!");
        java.lang.String str42 = attributes29.html();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes29.dataset();
        attributes20.addAll(attributes29);
        java.util.List<org.jsoup.nodes.Attribute> attributeList45 = attributes29.asList();
        attributes16.addAll(attributes29);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = attributes48.dataset();
        boolean boolean50 = attributes47.equals((java.lang.Object) attributes48);
        java.util.List<org.jsoup.nodes.Attribute> attributeList51 = attributes48.asList();
        attributes48.put("data-", "data-");
        attributes48.put("data-", false);
        boolean boolean59 = attributes48.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = attributes48.dataset();
        attributes48.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList63 = attributes48.asList();
        boolean boolean64 = attributes29.equals((java.lang.Object) attributeList63);
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
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " data-" + "'", str42, " data-");
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(attributeList45);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(attributeList51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(attributeList63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.lang.String str2 = attributes0.html();
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes0.spliterator();
        boolean boolean7 = attributes0.hasKey(" hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        java.lang.String str11 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        attributes0.put("data-", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes0.asList();
        java.lang.String str13 = attributes0.html();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes14.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("hi!");
        int int22 = attributes18.size();
        java.lang.String str24 = attributes18.get("hi!");
        java.lang.String str25 = attributes18.html();
        attributes14.addAll(attributes18);
        attributes0.addAll(attributes14);
        attributes14.put(" data-=\"hi!\"", " data-=\"hi!\"");
        boolean boolean32 = attributes14.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes14.spliterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"hi!\"" + "'", str13, " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator33);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes7.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes7.asList();
        boolean boolean12 = attributes7.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes7.put(attribute13);
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
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes17.dataset();
        int int26 = attributes17.size();
        attributes17.removeIgnoreCase(" hi!=\"data-\"");
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
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes0.spliterator();
        boolean boolean22 = attributes0.hasKeyIgnoreCase(" data-=\" data- hi!\"");
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
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        attributes0.put("data-", false);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        int int18 = attributes15.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        attributes19.addAll(attributes21);
        boolean boolean25 = attributes19.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes19.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes19.iterator();
        attributes15.addAll(attributes19);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes19.iterator();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes32.iterator();
        attributes30.addAll(attributes32);
        attributes30.put("hi!", "hi!");
        attributes19.addAll(attributes30);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes30.dataset();
        java.lang.String str41 = attributes30.getIgnoreCase(" hi!");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes42.dataset();
        java.lang.String str44 = attributes42.html();
        boolean boolean46 = attributes42.hasKeyIgnoreCase("hi!");
        java.lang.String str47 = attributes42.html();
        java.lang.Appendable appendable48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        attributes42.html(appendable48, outputSettings49);
        java.lang.Appendable appendable51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        attributes42.html(appendable51, outputSettings52);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor55 = attributes54.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap56 = attributes54.dataset();
        int int57 = attributes54.size();
        org.jsoup.nodes.Attributes attributes58 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator59 = attributes58.spliterator();
        org.jsoup.nodes.Attributes attributes60 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor61 = attributes60.iterator();
        attributes58.addAll(attributes60);
        boolean boolean64 = attributes58.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList65 = attributes58.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor66 = attributes58.iterator();
        attributes54.addAll(attributes58);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor68 = attributes58.iterator();
        java.lang.String str69 = attributes58.html();
        java.lang.Appendable appendable70 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = null;
        attributes58.html(appendable70, outputSettings71);
        java.lang.String str73 = attributes58.toString();
        boolean boolean74 = attributes42.equals((java.lang.Object) str73);
        attributes30.addAll(attributes42);
        java.util.List<org.jsoup.nodes.Attribute> attributeList76 = attributes30.asList();
        boolean boolean77 = attributes0.equals((java.lang.Object) attributes30);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator59);
        org.junit.Assert.assertNotNull(attributeItor61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributeList65);
        org.junit.Assert.assertNotNull(attributeItor66);
        org.junit.Assert.assertNotNull(attributeItor68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributeList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        java.lang.String str32 = attributes29.getIgnoreCase("data-");
        java.lang.String str33 = attributes29.html();
        attributes29.removeIgnoreCase("hi!");
        boolean boolean37 = attributes29.hasKeyIgnoreCase("hi!");
        attributes29.put(" hi!=\"\"", " hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes29.spliterator();
        java.lang.String str42 = attributes29.toString();
        java.lang.String str43 = attributes29.html();
        attributes28.addAll(attributes29);
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor46 = attributes45.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = attributes45.dataset();
        boolean boolean49 = attributes45.hasKey("");
        attributes45.put("hi!", "hi!");
        boolean boolean54 = attributes45.hasKey("hi!");
        attributes45.remove(" hi!=\" hi!=&quot;data-&quot;\"");
        boolean boolean57 = attributes28.equals((java.lang.Object) attributes45);
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
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " hi!=\"\"=\" hi!=&quot;&quot;\"" + "'", str42, " hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " hi!=\"\"=\" hi!=&quot;&quot;\"" + "'", str43, " hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        boolean boolean28 = attributes13.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes29 = attributes13.clone();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes31.dataset();
        boolean boolean33 = attributes30.equals((java.lang.Object) attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes31.asList();
        attributes31.put("data-", "data-");
        attributes31.put("data-", false);
        boolean boolean42 = attributes31.hasKey("hi!");
        attributes31.put("data-", true);
        boolean boolean46 = attributes13.equals((java.lang.Object) attributes31);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = attributes13.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes13.removeIgnoreCase("");
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
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str6 = attributes5.html();
        java.lang.String str7 = attributes5.toString();
        org.jsoup.nodes.Attributes attributes8 = attributes5.clone();
        attributes5.put(" data- hi!", false);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes5.html(appendable12, outputSettings13);
        attributes5.remove("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes5.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributeList17);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes0.spliterator();
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        attributes0.remove(" hi!");
        attributes0.put(" hi!=\"hi!\"", true);
        org.jsoup.nodes.Attribute attribute35 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute35);
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
        org.junit.Assert.assertNotNull(attributeSpliterator27);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes5.html(appendable6, outputSettings7);
        boolean boolean10 = attributes5.hasKey(" hi!=\" hi!=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str6 = attributes5.html();
        java.lang.String str7 = attributes5.toString();
        attributes5.remove(" data- hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes10.spliterator();
        java.lang.String str13 = attributes10.getIgnoreCase("hi!");
        int int14 = attributes10.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes15.iterator();
        attributes10.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes15.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes15.iterator();
        boolean boolean21 = attributes5.equals((java.lang.Object) attributes15);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes22.html(appendable27, outputSettings28);
        boolean boolean31 = attributes22.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes22.dataset();
        attributes22.remove("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator35 = attributes22.spliterator();
        boolean boolean36 = attributes15.equals((java.lang.Object) attributeSpliterator35);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator37 = attributes15.spliterator();
        java.lang.String str39 = attributes15.getIgnoreCase(" data-=\"hi!\"=\" data-=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(attributeSpliterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        java.lang.String str8 = attributes1.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes1.spliterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " data-=\"data-\"" + "'", str8, " data-=\"data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        int int8 = attributes7.size();
        java.lang.String str9 = attributes7.html();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes7.html(appendable10, outputSettings11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes7.html(appendable13, outputSettings14);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes15 = attributes0.clone();
        attributes0.remove(" hi!=\" hi!=&quot;&quot;\"");
        boolean boolean19 = attributes0.hasKey(" hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes1.dataset();
        attributes1.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes1.asList();
        java.lang.Class<?> wildcardClass17 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        int int5 = attributes1.size();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes1.html(appendable6, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        boolean boolean12 = attributes9.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes13.dataset();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        attributes13.addAll(attributes16);
        attributes9.addAll(attributes13);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes9.dataset();
        boolean boolean22 = attributes9.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes23 = attributes9.clone();
        java.lang.String str24 = attributes9.toString();
        attributes1.addAll(attributes9);
        attributes1.remove(" hi!");
        boolean boolean29 = attributes1.hasKey(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.String str10 = attributes0.get(" hi!=\"data-\"=\" hi!=&quot; hi!=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        attributes14.addAll(attributes16);
        java.lang.String str19 = attributes14.html();
        java.lang.String str20 = attributes14.toString();
        boolean boolean22 = attributes14.hasKey(" hi!");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        attributes14.html(appendable23, outputSettings24);
        attributes14.put(" hi!=\"hi!\"", "");
        int int29 = attributes14.size();
        boolean boolean30 = attributes0.equals((java.lang.Object) int29);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        attributes0.removeIgnoreCase(" hi!=\"\"=\"data-\"");
        attributes0.put(" hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"", false);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes37.dataset();
        boolean boolean41 = attributes37.hasKey("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator42 = attributes37.spliterator();
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes43.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes43.dataset();
        boolean boolean47 = attributes43.hasKey("");
        attributes43.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes43.spliterator();
        attributes43.put("data-", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList55 = attributes43.asList();
        boolean boolean56 = attributes37.equals((java.lang.Object) attributeList55);
        attributes0.addAll(attributes37);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator42);
        org.junit.Assert.assertNotNull(attributeItor44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator51);
        org.junit.Assert.assertNotNull(attributeList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        boolean boolean15 = attributes0.hasKeyIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        java.lang.String str20 = attributes17.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes21.html(appendable26, outputSettings27);
        boolean boolean30 = attributes21.hasKeyIgnoreCase("");
        attributes17.addAll(attributes21);
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes17.asList();
        boolean boolean33 = attributes0.equals((java.lang.Object) attributes17);
        org.jsoup.nodes.Attributes attributes34 = attributes17.clone();
        attributes17.remove(" hi!=\"data-\"");
        java.lang.Class<?> wildcardClass37 = attributes17.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        java.util.Map<java.lang.String, java.lang.String> strMap51 = attributes17.dataset();
        java.lang.String str52 = attributes17.toString();
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList54 = attributes53.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = attributes53.dataset();
        boolean boolean57 = attributes53.hasKey(" hi!=\"data-\"");
        java.lang.String str58 = attributes53.toString();
        boolean boolean60 = attributes53.hasKey("hi!");
        attributes17.addAll(attributes53);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor62 = attributes17.iterator();
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
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(attributeList54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(attributeItor62);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        java.lang.String str13 = attributes0.html();
        int int14 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        org.jsoup.nodes.Attributes attributes27 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes28.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes28.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor31 = attributes28.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes28.spliterator();
        org.jsoup.nodes.Attributes attributes33 = attributes28.clone();
        boolean boolean34 = attributes27.equals((java.lang.Object) attributes33);
        java.util.List<org.jsoup.nodes.Attribute> attributeList35 = attributes33.asList();
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
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(attributeItor31);
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributeList35);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        int int11 = attributes0.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.getIgnoreCase("hi!");
        int int16 = attributes12.size();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes17.iterator();
        attributes12.addAll(attributes17);
        boolean boolean22 = attributes12.hasKey("hi!");
        java.lang.String str24 = attributes12.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        boolean boolean28 = attributes25.equals((java.lang.Object) attributes26);
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes26.asList();
        boolean boolean31 = attributes26.hasKeyIgnoreCase("");
        attributes12.addAll(attributes26);
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator34 = attributes33.spliterator();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes35.iterator();
        attributes33.addAll(attributes35);
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator39 = attributes38.spliterator();
        java.lang.String str41 = attributes38.getIgnoreCase("hi!");
        int int42 = attributes38.size();
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes43.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes43.iterator();
        attributes38.addAll(attributes43);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = attributes43.dataset();
        java.lang.String str48 = attributes43.toString();
        boolean boolean49 = attributes33.equals((java.lang.Object) str48);
        java.lang.String str50 = attributes33.html();
        boolean boolean51 = attributes12.equals((java.lang.Object) attributes33);
        java.lang.String str52 = attributes33.html();
        attributes0.addAll(attributes33);
        java.lang.String str54 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator34);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertNotNull(attributeSpliterator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(attributeItor44);
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        attributes0.remove("data-");
        java.lang.String str24 = attributes0.toString();
        int int25 = attributes0.size();
        java.lang.String str27 = attributes0.get(" data-=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes0.spliterator();
        boolean boolean30 = attributes0.hasKey("hi!");
        boolean boolean32 = attributes0.hasKey("");
        boolean boolean34 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList35 = attributes0.asList();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributeList35);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        boolean boolean9 = attributes0.hasKeyIgnoreCase(" hi!=\"\"");
        attributes0.put(" hi!=\"data-\"", false);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        attributes14.put("data-", "data-");
        attributes14.put("data-", false);
        boolean boolean25 = attributes14.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator26 = attributes14.spliterator();
        boolean boolean28 = attributes14.hasKey("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        attributes30.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes30.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = attributes30.dataset();
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes36.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes36.dataset();
        int int39 = attributes36.size();
        boolean boolean41 = attributes36.hasKeyIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes36.asList();
        boolean boolean43 = attributes30.equals((java.lang.Object) attributes36);
        boolean boolean45 = attributes30.hasKey(" data-");
        java.lang.String str46 = attributes30.html();
        attributes14.addAll(attributes30);
        attributes0.addAll(attributes14);
        int int49 = attributes0.size();
        java.lang.Appendable appendable50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable50, outputSettings51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.lang.String str6 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes8.html(appendable9, outputSettings10);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        attributes1.remove("data-");
        attributes1.put(" hi!=\"hi!\"", false);
        boolean boolean48 = attributes1.hasKey(" data-=\" data-\"");
        java.lang.String str50 = attributes1.getIgnoreCase(" data- hi!");
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        int int4 = attributes0.size();
        attributes0.remove(" hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        attributes0.put(" hi!=\"data-\"=\"hi!\"", false);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes1.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes1.dataset();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes1.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes4.html(appendable16, outputSettings17);
        boolean boolean20 = attributes4.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes21.dataset();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes24.dataset();
        attributes21.addAll(attributes24);
        attributes21.remove("hi!");
        attributes21.removeIgnoreCase("data-");
        attributes4.addAll(attributes21);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeList10);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        boolean boolean15 = attributes0.hasKey(" data-");
        java.lang.String str16 = attributes0.html();
        attributes0.put(" data-=\" data-\"", "");
        attributes0.removeIgnoreCase(" data- hi!=\" hi!\"");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable22, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        attributes4.put("hi!", false);
        java.lang.String str19 = attributes4.html();
        attributes4.put(" data-=\"hi!\"", " data-=\"hi!\"");
        int int23 = attributes4.size();
        int int24 = attributes4.size();
        boolean boolean26 = attributes4.hasKeyIgnoreCase(" data-=\"hi!\"=\" data-\"");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes2.html(appendable5, outputSettings6);
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes2.html(appendable10, outputSettings11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes2.iterator();
        java.lang.String str15 = attributes2.getIgnoreCase(" data-=\"hi!\"");
        int int16 = attributes2.size();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        boolean boolean14 = attributes0.hasKey(" hi!=\"hi!\"");
        attributes0.put(" data-=\"hi!\"", false);
        attributes0.put("hi!", true);
        boolean boolean22 = attributes0.hasKeyIgnoreCase(" hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        java.lang.String str34 = attributes0.getIgnoreCase(" data-");
        java.lang.String str35 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes36 = attributes0.clone();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        java.lang.String str15 = attributes4.toString();
        java.lang.String str17 = attributes4.getIgnoreCase(" data-=\"\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        java.lang.String str15 = attributes0.getIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        attributes16.addAll(attributes18);
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        attributes16.html(appendable21, outputSettings22);
        boolean boolean25 = attributes16.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes16.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes16.dataset();
        attributes0.addAll(attributes16);
        attributes0.removeIgnoreCase(" data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        attributes0.html(appendable17, outputSettings18);
        boolean boolean21 = attributes0.hasKey(" hi!=\"hi!\"");
        attributes0.removeIgnoreCase(" hi!");
        boolean boolean25 = attributes0.hasKey(" data-=\"hi!\"=\" data-\"");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        java.lang.String str36 = attributes19.get(" data-");
        boolean boolean38 = attributes19.hasKeyIgnoreCase(" data-=\"data-\"");
        attributes19.removeIgnoreCase(" hi!=\"\"=\"\"");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        attributes0.put("data-", true);
        boolean boolean9 = attributes0.hasKeyIgnoreCase(" hi!=\"\"");
        attributes0.put(" hi!=\"data-\"", false);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        boolean boolean16 = attributes13.equals((java.lang.Object) attributes14);
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes14.asList();
        attributes14.put("data-", "data-");
        attributes14.put("data-", false);
        boolean boolean25 = attributes14.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator26 = attributes14.spliterator();
        boolean boolean28 = attributes14.hasKey("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        attributes30.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes30.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = attributes30.dataset();
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes36.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes36.dataset();
        int int39 = attributes36.size();
        boolean boolean41 = attributes36.hasKeyIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes36.asList();
        boolean boolean43 = attributes30.equals((java.lang.Object) attributes36);
        boolean boolean45 = attributes30.hasKey(" data-");
        java.lang.String str46 = attributes30.html();
        attributes14.addAll(attributes30);
        attributes0.addAll(attributes14);
        int int49 = attributes0.size();
        int int50 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        boolean boolean26 = attributes9.hasKeyIgnoreCase(" data-");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        boolean boolean19 = attributes0.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        java.lang.String str23 = attributes20.getIgnoreCase("hi!");
        int int24 = attributes20.size();
        attributes20.removeIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes20.asList();
        boolean boolean28 = attributes0.equals((java.lang.Object) attributes20);
        int int29 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes0.iterator();
        java.lang.String str12 = attributes0.getIgnoreCase(" hi!=\"hi!\" data-=\" hi!=&quot;hi!&quot;\"");
        attributes0.put(" data-", " data-=\" data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        java.lang.String str16 = attributes4.getIgnoreCase(" hi!");
        java.lang.String str17 = attributes4.toString();
        int int18 = attributes4.size();
        org.jsoup.nodes.Attributes attributes19 = attributes4.clone();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        attributes14.addAll(attributes16);
        java.lang.String str19 = attributes14.html();
        java.lang.String str20 = attributes14.toString();
        boolean boolean22 = attributes14.hasKey(" hi!");
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        attributes14.html(appendable23, outputSettings24);
        attributes14.put(" hi!=\"hi!\"", "");
        int int29 = attributes14.size();
        boolean boolean30 = attributes0.equals((java.lang.Object) int29);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        attributes0.removeIgnoreCase(" hi!=\"\"=\"data-\"");
        attributes0.put(" hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"", false);
        boolean boolean38 = attributes0.hasKey(" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put(" data-=\"\"", false);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        attributes5.put(" hi!=\"hi!\"", "");
        java.lang.String str17 = attributes5.get(" hi!=\"hi!\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes5.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeList18);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes1.dataset();
        java.lang.String str7 = attributes1.getIgnoreCase("data-");
        java.lang.String str8 = attributes1.toString();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("hi!");
        attributes0.put(" hi!=\"\"", " hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        java.lang.String str13 = attributes0.toString();
        java.lang.String str14 = attributes0.html();
        boolean boolean16 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"");
        attributes0.removeIgnoreCase(" hi!=\"hi!\"=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"\"=\" hi!=&quot;&quot;\"" + "'", str13, " hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!=\"\"=\" hi!=&quot;&quot;\"" + "'", str14, " hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        java.lang.String str11 = attributes5.html();
        java.lang.String str13 = attributes5.get(" hi!=\"\"");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes5.dataset();
        attributes5.put(" data-=\" hi!=&quot;data-&quot;\"", " hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("data-");
        java.lang.String str22 = attributes18.html();
        attributes18.removeIgnoreCase("hi!");
        attributes18.put("data-", false);
        boolean boolean29 = attributes18.hasKey("");
        int int30 = attributes18.size();
        attributes18.remove(" hi!");
        attributes5.addAll(attributes18);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        attributes9.addAll(attributes11);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        attributes9.html(appendable14, outputSettings15);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        attributes9.html(appendable17, outputSettings18);
        java.lang.String str21 = attributes9.getIgnoreCase("data-");
        boolean boolean22 = attributes0.equals((java.lang.Object) str21);
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        attributes0.html(appendable23, outputSettings24);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        java.lang.String str28 = attributes26.html();
        boolean boolean30 = attributes26.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = attributes32.dataset();
        boolean boolean34 = attributes31.equals((java.lang.Object) attributes32);
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes35.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes35.dataset();
        int int38 = attributes35.size();
        boolean boolean39 = attributes31.equals((java.lang.Object) attributes35);
        java.lang.Object obj40 = null;
        boolean boolean41 = attributes35.equals(obj40);
        attributes26.addAll(attributes35);
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes44.dataset();
        boolean boolean46 = attributes43.equals((java.lang.Object) attributes44);
        boolean boolean48 = attributes44.hasKey("data-");
        java.lang.String str50 = attributes44.getIgnoreCase("hi!");
        java.lang.String str52 = attributes44.get("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes44.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = attributes44.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator55 = attributes44.spliterator();
        org.jsoup.nodes.Attributes attributes56 = attributes44.clone();
        attributes35.addAll(attributes44);
        boolean boolean58 = attributes0.equals((java.lang.Object) attributes44);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(attributeSpliterator55);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        java.lang.String str15 = attributes0.getIgnoreCase(" data-");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        java.lang.String str18 = attributes16.html();
        attributes0.addAll(attributes16);
        attributes0.removeIgnoreCase(" hi!=\"\"");
        boolean boolean23 = attributes0.hasKey("hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.remove(" hi!");
        boolean boolean9 = attributes0.hasKey("hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        int int4 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        int int6 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeList8);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes10.spliterator();
        java.lang.String str13 = attributes10.getIgnoreCase("hi!");
        int int14 = attributes10.size();
        java.lang.String str16 = attributes10.get("hi!");
        java.lang.String str18 = attributes10.get("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) "data-");
        java.lang.String str20 = attributes0.html();
        attributes0.removeIgnoreCase(" hi!=\"\"=\"data-\"=\" hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList1 = attributes0.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKeyIgnoreCase(" hi!=\"\"=\"data-\"=\" data-=&quot; data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes13.iterator();
        int int16 = attributes13.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes13.iterator();
        boolean boolean18 = attributes12.equals((java.lang.Object) attributes13);
        boolean boolean20 = attributes12.hasKeyIgnoreCase(" data-");
        java.lang.String str22 = attributes12.get(" data-=\" data-\"");
        attributes12.put(" hi!=\"hi!\" data- hi!=\" data-=&quot;&quot;\"", " hi!=\"data-\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        int int8 = attributes7.size();
        org.jsoup.nodes.Attributes attributes9 = attributes7.clone();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes10.iterator();
        boolean boolean13 = attributes7.equals((java.lang.Object) attributes10);
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes10.asList();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        int int18 = attributes15.size();
        java.lang.String str19 = attributes15.html();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes15.dataset();
        java.lang.String str21 = attributes15.html();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes22.html(appendable27, outputSettings28);
        boolean boolean31 = attributes22.hasKeyIgnoreCase("");
        java.lang.String str33 = attributes22.get("hi!");
        attributes22.removeIgnoreCase("data-");
        attributes15.addAll(attributes22);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes38.dataset();
        boolean boolean40 = attributes37.equals((java.lang.Object) attributes38);
        java.util.List<org.jsoup.nodes.Attribute> attributeList41 = attributes38.asList();
        attributes38.put("data-", "data-");
        attributes38.put("data-", false);
        boolean boolean49 = attributes38.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor50 = attributes38.iterator();
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = attributes52.dataset();
        boolean boolean54 = attributes51.equals((java.lang.Object) attributes52);
        attributes38.addAll(attributes51);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = attributes51.dataset();
        boolean boolean57 = attributes15.equals((java.lang.Object) attributes51);
        boolean boolean58 = attributes10.equals((java.lang.Object) boolean57);
        boolean boolean60 = attributes10.hasKey(" hi!=\"hi!\" data- hi!=\" data-=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributeList41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributeItor50);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes2.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes2.spliterator();
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
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        int int18 = attributes15.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        attributes19.addAll(attributes21);
        boolean boolean25 = attributes19.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes19.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes19.iterator();
        attributes15.addAll(attributes19);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes19.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes19.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes19.spliterator();
        attributes19.put(" hi!=\"\"", true);
        boolean boolean35 = attributes0.equals((java.lang.Object) true);
        attributes0.put(" hi!=\"\"=\" hi!=&quot;&quot;\"", true);
        attributes0.put(" hi!=\"hi!\"=\" hi!=&quot;hi!&quot;\"", " hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes25 = attributes0.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes0.iterator();
        attributes0.put(" hi!=\"hi!\"=\" hi!=&quot;hi!&quot;\"", true);
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
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeItor26);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        attributes1.put("data-", true);
        attributes1.put("hi!", true);
        boolean boolean24 = attributes1.hasKey(" hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        attributes0.remove(" hi!=\"hi!\"");
        attributes0.put(" hi!=\"data-\"", " hi!=\" hi!=&quot;&quot;\"");
        boolean boolean19 = attributes0.hasKey(" hi!=\"data-\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        java.lang.String str23 = attributes20.getIgnoreCase("data-");
        java.lang.String str24 = attributes20.html();
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        java.lang.String str26 = attributes25.html();
        java.lang.String str27 = attributes25.toString();
        attributes25.remove(" data- hi!");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        java.lang.String str33 = attributes30.getIgnoreCase("hi!");
        int int34 = attributes30.size();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes35.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes35.iterator();
        attributes30.addAll(attributes35);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes35.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes35.iterator();
        boolean boolean41 = attributes25.equals((java.lang.Object) attributes35);
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator43 = attributes42.spliterator();
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes44.iterator();
        attributes42.addAll(attributes44);
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        attributes42.html(appendable47, outputSettings48);
        boolean boolean51 = attributes42.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = attributes42.dataset();
        attributes42.remove("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator55 = attributes42.spliterator();
        boolean boolean56 = attributes35.equals((java.lang.Object) attributeSpliterator55);
        java.lang.Class<?> wildcardClass57 = attributeSpliterator55.getClass();
        boolean boolean58 = attributes0.equals((java.lang.Object) wildcardClass57);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator43);
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(attributeSpliterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        attributes0.remove("data-");
        boolean boolean21 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str23 = attributes0.get(" data-");
        attributes0.remove(" data- hi!=\" hi!\"");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes0.dataset();
        java.lang.String str27 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str6 = attributes5.html();
        java.lang.String str7 = attributes5.toString();
        attributes5.remove(" data- hi!");
        java.lang.String str11 = attributes5.getIgnoreCase(" data- hi!");
        attributes5.put(" hi!=\"\"=\" hi!=&quot;&quot;\"", true);
        attributes5.removeIgnoreCase(" data-=\" hi!=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes1.dataset();
        java.lang.String str7 = attributes1.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes8.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes8.iterator();
        attributes1.addAll(attributes8);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes12.spliterator();
        boolean boolean18 = attributes12.hasKey("data-");
        boolean boolean20 = attributes12.hasKey("data-");
        boolean boolean22 = attributes12.hasKeyIgnoreCase("");
        boolean boolean24 = attributes12.hasKeyIgnoreCase("data-");
        boolean boolean25 = attributes1.equals((java.lang.Object) attributes12);
        org.jsoup.nodes.Attributes attributes26 = attributes12.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes26.spliterator();
        java.lang.String str28 = attributes26.html();
        attributes26.put(" hi!=\"\"=\"data-\"", " hi!=\"hi!\"");
        int int32 = attributes26.size();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        attributes0.put("hi!", true);
        int int11 = attributes0.size();
        attributes0.remove("hi!");
        java.lang.String str15 = attributes0.get(" hi!=\"data-\"");
        int int16 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        boolean boolean8 = attributes0.hasKey("");
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        int int15 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor42 = attributes41.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes41.dataset();
        boolean boolean45 = attributes41.hasKey("");
        attributes41.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator50 = attributes49.spliterator();
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor52 = attributes51.iterator();
        attributes49.addAll(attributes51);
        boolean boolean55 = attributes49.hasKey("");
        attributes41.addAll(attributes49);
        attributes41.put(" data- hi!", " data-=\"\"");
        boolean boolean60 = attributes2.equals((java.lang.Object) " data-=\"\"");
        attributes2.put(" hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"=\" data-\"", true);
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
        org.junit.Assert.assertNotNull(attributeItor42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator50);
        org.junit.Assert.assertNotNull(attributeItor52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        attributes4.put("hi!", false);
        java.lang.String str19 = attributes4.html();
        attributes4.put(" data-=\"hi!\"", " data-=\"hi!\"");
        int int23 = attributes4.size();
        int int24 = attributes4.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes4.iterator();
        java.lang.String str27 = attributes4.getIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        boolean boolean18 = attributes1.hasKeyIgnoreCase(" hi!=\"\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes5.spliterator();
        boolean boolean22 = attributes5.hasKey(" hi!=\"hi!\" data-=\"data-\"");
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
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes0.dataset();
        attributes0.put("hi!", true);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKeyIgnoreCase("hi!");
        attributes0.addAll(attributes22);
        java.lang.String str26 = attributes0.html();
        int int27 = attributes0.size();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes29 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes30 = attributes29.clone();
        boolean boolean32 = attributes30.hasKeyIgnoreCase(" hi!=\"hi!\" data- hi!=\" data-=&quot;&quot;\"");
        java.lang.String str34 = attributes30.get(" data-=\"data-\"");
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
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " hi!" + "'", str26, " hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        org.jsoup.nodes.Attributes attributes19 = attributes18.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes19.asList();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes23.html(appendable26, outputSettings27);
        attributes23.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes32.spliterator();
        java.lang.String str35 = attributes32.getIgnoreCase("hi!");
        int int36 = attributes32.size();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes37.iterator();
        attributes32.addAll(attributes37);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes37.dataset();
        java.lang.String str42 = attributes37.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes37.iterator();
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes44.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = attributes44.dataset();
        int int47 = attributes44.size();
        java.lang.String str48 = attributes44.html();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = attributes44.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = attributes44.dataset();
        boolean boolean51 = attributes37.equals((java.lang.Object) strMap50);
        boolean boolean52 = attributes23.equals((java.lang.Object) attributes37);
        attributes19.addAll(attributes23);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor54 = attributes23.iterator();
        org.jsoup.nodes.Attributes attributes55 = attributes23.clone();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributeSpliterator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertNotNull(attributeItor39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributeItor43);
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributeItor54);
        org.junit.Assert.assertNotNull(attributes55);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        attributes0.remove(" hi!=\"hi!\" data- hi!=\" data-=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        org.jsoup.nodes.Attributes attributes19 = attributes18.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes19.asList();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes23.html(appendable26, outputSettings27);
        attributes23.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes32.spliterator();
        java.lang.String str35 = attributes32.getIgnoreCase("hi!");
        int int36 = attributes32.size();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes37.iterator();
        attributes32.addAll(attributes37);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes37.dataset();
        java.lang.String str42 = attributes37.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes37.iterator();
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes44.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = attributes44.dataset();
        int int47 = attributes44.size();
        java.lang.String str48 = attributes44.html();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = attributes44.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = attributes44.dataset();
        boolean boolean51 = attributes37.equals((java.lang.Object) strMap50);
        boolean boolean52 = attributes23.equals((java.lang.Object) attributes37);
        attributes19.addAll(attributes23);
        java.lang.String str55 = attributes19.get(" data-");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = attributes19.dataset();
        attributes19.put(" hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"", " hi! data-=\"\"=\" hi!=&quot;&quot;=&quot; hi!=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributeSpliterator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertNotNull(attributeItor39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributeItor43);
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strMap56);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.lang.String str9 = attributes0.html();
        boolean boolean11 = attributes0.equals((java.lang.Object) 1L);
        java.lang.String str12 = attributes0.html();
        attributes0.put(" hi!=\"hi!\" data-=\" hi!=&quot;hi!&quot;\"", " hi!=\"\"=\"data-\"=\" data-=&quot; data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes15.asList();
        org.jsoup.nodes.Attributes attributes18 = attributes15.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        attributes0.addAll(attributes18);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes18.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributeItor21);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        attributes0.remove("data-");
        java.lang.String str24 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator25 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributeList26.spliterator();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeSpliterator25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        attributes0.remove(" hi!=\"hi!\"=\" data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        java.lang.String str17 = attributes8.getIgnoreCase("hi!");
        attributes8.put(" hi!=\"hi!\"", " data- hi!");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes23.html(appendable26, outputSettings27);
        boolean boolean30 = attributes23.hasKeyIgnoreCase("");
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        attributes23.html(appendable31, outputSettings32);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes23.iterator();
        boolean boolean35 = attributes8.equals((java.lang.Object) attributes23);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("data-");
        java.lang.String str4 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        boolean boolean8 = attributes5.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes9.dataset();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes12.dataset();
        attributes9.addAll(attributes12);
        attributes5.addAll(attributes9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes5.dataset();
        boolean boolean18 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str20 = attributes5.getIgnoreCase(" hi!=\"hi!\"");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes5.dataset();
        boolean boolean22 = attributes0.equals((java.lang.Object) strMap21);
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.lang.Class<?> wildcardClass24 = attributes0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        java.lang.String str18 = attributes10.getIgnoreCase("data-");
        java.lang.String str19 = attributes10.toString();
        java.lang.String str20 = attributes10.html();
        attributes10.put(" data-=\" hi!=&quot;data-&quot;\"", true);
        java.lang.String str25 = attributes10.get(" hi!=\"\"=\"data-\"=\" hi!=&quot;&quot;=&quot;&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = attributes10.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes36.dataset();
        boolean boolean38 = attributes35.equals((java.lang.Object) attributes36);
        java.util.List<org.jsoup.nodes.Attribute> attributeList39 = attributes36.asList();
        attributes36.put("data-", "data-");
        attributes36.put("data-", false);
        boolean boolean47 = attributes36.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor48 = attributes36.iterator();
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = attributes50.dataset();
        boolean boolean52 = attributes49.equals((java.lang.Object) attributes50);
        attributes36.addAll(attributes49);
        org.jsoup.nodes.Attributes attributes54 = attributes36.clone();
        attributes54.removeIgnoreCase("data-");
        int int57 = attributes54.size();
        java.lang.String str58 = attributes54.toString();
        boolean boolean60 = attributes54.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = attributes61.dataset();
        java.lang.String str63 = attributes61.html();
        boolean boolean65 = attributes61.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes67 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = attributes67.dataset();
        boolean boolean69 = attributes66.equals((java.lang.Object) attributes67);
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor71 = attributes70.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap72 = attributes70.dataset();
        int int73 = attributes70.size();
        boolean boolean74 = attributes66.equals((java.lang.Object) attributes70);
        java.lang.Object obj75 = null;
        boolean boolean76 = attributes70.equals(obj75);
        attributes61.addAll(attributes70);
        boolean boolean79 = attributes61.hasKeyIgnoreCase("");
        java.lang.String str81 = attributes61.get(" hi!=\"hi!\"");
        attributes61.put(" data-", false);
        attributes54.addAll(attributes61);
        attributes10.addAll(attributes61);
        java.lang.Appendable appendable87 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = null;
        attributes10.html(appendable87, outputSettings88);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator90 = attributes10.spliterator();
        java.lang.String str91 = attributes10.html();
        java.lang.String str93 = attributes10.get(" data-=\"\"");
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
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(attributeItor48);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(attributeItor71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(attributeSpliterator90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        java.lang.String str7 = attributes0.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase(" data-=\"data-\"");
        int int12 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes0.asList();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes0.html(appendable9, outputSettings10);
        attributes0.removeIgnoreCase(" data-=\" hi!=&quot;hi!&quot;\"");
        attributes0.put(" data-=\" data- hi!\"", "");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        java.lang.String str16 = attributes0.getIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        attributes0.removeIgnoreCase(" hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        attributes1.put("data-", "data-");
        attributes1.put("data-", false);
        boolean boolean12 = attributes1.hasKey("hi!");
        attributes1.removeIgnoreCase("hi!");
        int int15 = attributes1.size();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        boolean boolean15 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str16 = attributes0.html();
        boolean boolean18 = attributes0.hasKey(" hi!=\"\"");
        java.lang.String str19 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        boolean boolean9 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str11 = attributes0.getIgnoreCase("hi!");
        java.lang.String str12 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes13.iterator();
        int int16 = attributes13.size();
        java.lang.String str17 = attributes13.toString();
        int int18 = attributes13.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes20 = attributes13.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes13.dataset();
        boolean boolean22 = attributes0.equals((java.lang.Object) attributes13);
        attributes13.put(" hi!=\"data-\"", " data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.equals((java.lang.Object) 100.0d);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        boolean boolean9 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes11.dataset();
        boolean boolean13 = attributes10.equals((java.lang.Object) attributes11);
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes11.asList();
        attributes11.put("data-", "data-");
        attributes11.put("data-", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes11.spliterator();
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes11.iterator();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributeItor23);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        attributes6.put(" data-=\"hi!\"", false);
        java.lang.String str42 = attributes6.html();
        java.lang.String str44 = attributes6.get(" hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        boolean boolean20 = attributes1.hasKeyIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes21 = attributes1.clone();
        java.lang.String str23 = attributes21.getIgnoreCase(" hi!=\"hi!\" data- hi!=\" data-=&quot;&quot;\"");
        java.lang.String str25 = attributes21.getIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        boolean boolean27 = attributes21.hasKey(" data- hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.hasKey("data-");
        attributes0.remove(" hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes0.dataset();
        boolean boolean21 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"=\" hi!=&quot;&quot;=&quot;data-&quot;=&quot; data-=&amp;quot; data-&amp;quot;&quot;\"");
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
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        java.lang.String str27 = attributes11.getIgnoreCase(" hi!=\"\"");
        attributes11.put(" hi!=\"data-\"=\"hi!\"", false);
        java.lang.String str31 = attributes11.html();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        java.lang.String str74 = attributes43.toString();
        org.jsoup.nodes.Attributes attributes75 = attributes43.clone();
        boolean boolean77 = attributes75.hasKeyIgnoreCase(" hi!=\"hi!\"=\" hi!=&quot;hi!&quot;\"");
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.toString();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes0.html(appendable8, outputSettings9);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes12.dataset();
        boolean boolean14 = attributes11.equals((java.lang.Object) attributes12);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes12.asList();
        attributes12.put("data-", "data-");
        attributes12.put("data-", false);
        boolean boolean23 = attributes12.hasKey("hi!");
        attributes12.put("data-", true);
        org.jsoup.nodes.Attributes attributes27 = attributes12.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes27.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes27.iterator();
        attributes0.addAll(attributes27);
        org.jsoup.nodes.Attributes attributes31 = attributes0.clone();
        java.lang.String str32 = attributes31.html();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = attributes31.dataset();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " data-" + "'", str32, " data-");
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str8 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        attributes0.put(" hi!=\" hi!=&quot;data-&quot;\"", " hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        java.lang.String str16 = attributes1.getIgnoreCase(" hi!=\"hi!\" data-=\"hi!\"=\" data- hi!\"=\" hi!=&quot;&quot;=&quot;data-&quot;=&quot; data-=&amp;quot; data-&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes26.spliterator();
        java.lang.String str29 = attributes26.getIgnoreCase("hi!");
        int int30 = attributes26.size();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor32 = attributes31.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes31.iterator();
        attributes26.addAll(attributes31);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = attributes31.dataset();
        java.lang.String str36 = attributes31.toString();
        boolean boolean37 = attributes21.equals((java.lang.Object) str36);
        java.lang.String str38 = attributes21.html();
        boolean boolean39 = attributes0.equals((java.lang.Object) attributes21);
        java.lang.String str40 = attributes21.html();
        org.jsoup.nodes.Attributes attributes41 = attributes21.clone();
        attributes41.remove(" data-=\" hi!=&quot;data-&quot;\"");
        java.lang.String str45 = attributes41.getIgnoreCase(" hi!=\"data-\" hi!=\"hi!\"=\" data-\"");
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
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(attributeItor32);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes7.html(appendable8, outputSettings9);
        boolean boolean12 = attributes7.hasKeyIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes13 = attributes7.clone();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        attributes7.html(appendable14, outputSettings15);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        java.lang.String str20 = attributes1.html();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes1.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes1.asList();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(attributeList22);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        attributes1.removeIgnoreCase(" hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes1.clone();
        int int23 = attributes1.size();
        int int24 = attributes1.size();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        attributes1.html(appendable25, outputSettings26);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeList15);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes1.dataset();
        java.lang.String str7 = attributes1.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes8.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes8.iterator();
        attributes1.addAll(attributes8);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes12.spliterator();
        boolean boolean18 = attributes12.hasKey("data-");
        boolean boolean20 = attributes12.hasKey("data-");
        boolean boolean22 = attributes12.hasKeyIgnoreCase("");
        boolean boolean24 = attributes12.hasKeyIgnoreCase("data-");
        boolean boolean25 = attributes1.equals((java.lang.Object) attributes12);
        org.jsoup.nodes.Attributes attributes26 = attributes12.clone();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes27.spliterator();
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        attributes27.addAll(attributes29);
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes32.spliterator();
        java.lang.String str35 = attributes32.getIgnoreCase("hi!");
        int int36 = attributes32.size();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes37.iterator();
        attributes32.addAll(attributes37);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes37.dataset();
        java.lang.String str42 = attributes37.toString();
        boolean boolean43 = attributes27.equals((java.lang.Object) str42);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes27.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes27.dataset();
        int int46 = attributes27.size();
        boolean boolean48 = attributes27.hasKeyIgnoreCase("");
        java.lang.String str49 = attributes27.html();
        attributes26.addAll(attributes27);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(attributeSpliterator33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertNotNull(attributeItor39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributeItor44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        java.lang.String str7 = attributes1.getIgnoreCase("hi!");
        boolean boolean9 = attributes1.hasKey(" hi!=\"data-\"");
        attributes1.put(" data- hi!", " data-");
        java.lang.String str13 = attributes1.toString();
        java.lang.String str14 = attributes1.toString();
        attributes1.put(" hi!=\"\"=\"data-\"=\" data-=&quot; data-&quot;\"", true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " data- hi!=\" data-\"" + "'", str13, " data- hi!=\" data-\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " data- hi!=\" data-\"" + "'", str14, " data- hi!=\" data-\"");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        attributes8.put(" hi!=\"\"", true);
        java.lang.String str12 = attributes8.toString();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        boolean boolean16 = attributes13.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes17.dataset();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes20.dataset();
        attributes17.addAll(attributes20);
        attributes13.addAll(attributes17);
        boolean boolean25 = attributes13.hasKeyIgnoreCase("hi!");
        java.lang.String str26 = attributes13.toString();
        java.lang.String str28 = attributes13.getIgnoreCase(" data-");
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        java.lang.String str31 = attributes29.html();
        attributes13.addAll(attributes29);
        attributes8.addAll(attributes29);
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.html(appendable34, outputSettings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!=\"\"" + "'", str12, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        int int48 = attributes2.size();
        java.lang.String str49 = attributes2.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor50 = attributes2.iterator();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributeItor50);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes7.dataset();
        attributes7.remove("hi!");
        attributes0.addAll(attributes7);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        attributes13.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes13.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes13.spliterator();
        attributes0.addAll(attributes13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributeList21);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        java.lang.String str5 = attributes0.html();
        boolean boolean7 = attributes0.hasKey("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean11 = attributes8.equals((java.lang.Object) attributes9);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes9.iterator();
        java.lang.String str13 = attributes9.toString();
        boolean boolean14 = attributes0.equals((java.lang.Object) attributes9);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes9.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeList15);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        attributes0.remove("hi!");
        java.lang.String str5 = attributes0.html();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes6.asList();
        boolean boolean8 = attributes0.equals((java.lang.Object) attributeList7);
        int int9 = attributes0.size();
        attributes0.removeIgnoreCase(" hi!=\"\"=\"\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        boolean boolean15 = attributes12.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes16.dataset();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes19.dataset();
        attributes16.addAll(attributes19);
        attributes12.addAll(attributes16);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes12.dataset();
        boolean boolean25 = attributes12.hasKeyIgnoreCase("");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes12.html(appendable26, outputSettings27);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes12.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList30 = attributes12.asList();
        boolean boolean31 = attributes0.equals((java.lang.Object) attributes12);
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
        org.junit.Assert.assertNotNull(attributeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributeList32);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        attributes15.removeIgnoreCase("data-");
        attributes15.remove(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        boolean boolean32 = attributes15.hasKeyIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        attributes15.html(appendable33, outputSettings34);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.equals((java.lang.Object) (-1.0f));
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.getIgnoreCase(" hi! hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        boolean boolean26 = attributes14.hasKey(" data-=\"\"");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        attributes7.addAll(attributes9);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes7.html(appendable12, outputSettings13);
        boolean boolean16 = attributes7.hasKeyIgnoreCase("");
        java.lang.String str18 = attributes7.get("hi!");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        org.jsoup.nodes.Attributes attributes22 = attributes7.clone();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes23.dataset();
        int int26 = attributes23.size();
        java.lang.String str27 = attributes23.html();
        boolean boolean29 = attributes23.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes23.dataset();
        boolean boolean32 = attributes23.hasKey(" hi!=\"\"");
        attributes23.put(" hi!=\"data-\"", "hi!");
        boolean boolean36 = attributes7.equals((java.lang.Object) attributes23);
        boolean boolean38 = attributes7.hasKey(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        java.lang.String str8 = attributes0.getIgnoreCase("hi!");
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
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        int int51 = attributes17.size();
        boolean boolean53 = attributes17.hasKey("");
        org.jsoup.nodes.Attributes attributes54 = attributes17.clone();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.hasKey("data-");
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        int int11 = attributes0.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes12.dataset();
        int int15 = attributes12.size();
        java.lang.String str16 = attributes12.html();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes12.dataset();
        java.lang.String str18 = attributes12.html();
        org.jsoup.nodes.Attributes attributes19 = attributes12.clone();
        boolean boolean21 = attributes19.hasKey("");
        attributes0.addAll(attributes19);
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes19.asList();
        boolean boolean25 = attributes19.hasKey(" data-=\"\"");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes26.spliterator();
        java.lang.String str29 = attributes26.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes26.spliterator();
        boolean boolean32 = attributes26.hasKey("data-");
        boolean boolean34 = attributes26.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes36.dataset();
        boolean boolean38 = attributes35.equals((java.lang.Object) attributes36);
        java.util.List<org.jsoup.nodes.Attribute> attributeList39 = attributes36.asList();
        boolean boolean41 = attributes36.hasKeyIgnoreCase("");
        java.lang.Object obj42 = null;
        boolean boolean43 = attributes36.equals(obj42);
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        attributes36.html(appendable44, outputSettings45);
        attributes26.addAll(attributes36);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes48.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = attributes48.dataset();
        int int51 = attributes48.size();
        java.lang.String str52 = attributes48.html();
        attributes48.put("data-", true);
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = attributes57.dataset();
        boolean boolean59 = attributes56.equals((java.lang.Object) attributes57);
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes57.asList();
        attributes57.put("data-", true);
        attributes48.addAll(attributes57);
        attributes57.remove("data-");
        attributes26.addAll(attributes57);
        boolean boolean68 = attributes19.equals((java.lang.Object) attributes57);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor69 = attributes57.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(attributeItor69);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.hasKey("data-");
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        int int11 = attributes0.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes12.dataset();
        int int15 = attributes12.size();
        java.lang.String str16 = attributes12.html();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes12.dataset();
        java.lang.String str18 = attributes12.html();
        org.jsoup.nodes.Attributes attributes19 = attributes12.clone();
        boolean boolean21 = attributes19.hasKey("");
        attributes0.addAll(attributes19);
        java.lang.String str23 = attributes19.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = attributes19.getIgnoreCase("");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        attributes8.removeIgnoreCase(" hi!=\"\"");
        int int23 = attributes8.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        java.lang.String str29 = attributes25.html();
        boolean boolean31 = attributes25.hasKey(" hi!=\"\"=\"\"");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        boolean boolean9 = attributes0.hasKeyIgnoreCase("data-");
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
        org.jsoup.nodes.Attributes attributes24 = attributes10.clone();
        boolean boolean26 = attributes24.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes24.iterator();
        boolean boolean28 = attributes0.equals((java.lang.Object) attributeItor27);
        attributes0.put(" data- hi!", "");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        attributes0.put(" hi!=\"data-\"", " hi!=\"hi!\"");
        int int12 = attributes0.size();
        java.lang.String str13 = attributes0.toString();
        java.lang.String str15 = attributes0.getIgnoreCase(" hi!=\"\"=\"data-\"");
        java.lang.String str16 = attributes0.html();
        org.jsoup.nodes.Attributes attributes17 = attributes0.clone();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"" + "'", str13, " hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"" + "'", str16, " hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes0.html(appendable13, outputSettings14);
        attributes0.put(" hi!=\"\"=\"\"", true);
        java.lang.String str20 = attributes0.getIgnoreCase("data-");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        boolean boolean8 = attributes0.hasKeyIgnoreCase(" data-=\"hi!\"");
        java.lang.String str10 = attributes0.getIgnoreCase(" data-");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        attributes1.put(" data- hi!", false);
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
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        int int6 = attributes1.size();
        attributes1.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes1.dataset();
        java.lang.String str11 = attributes1.get("hi!");
        org.jsoup.nodes.Attributes attributes12 = attributes1.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeItor13);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        attributes0.remove(" hi!=\"data-\"");
        boolean boolean35 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator37 = attributes36.spliterator();
        java.lang.String str39 = attributes36.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes40.spliterator();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes42.iterator();
        attributes40.addAll(attributes42);
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        attributes40.html(appendable45, outputSettings46);
        boolean boolean49 = attributes40.hasKeyIgnoreCase("");
        attributes36.addAll(attributes40);
        java.util.List<org.jsoup.nodes.Attribute> attributeList51 = attributes36.asList();
        java.lang.String str52 = attributes36.html();
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor54 = attributes53.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = attributes53.dataset();
        int int56 = attributes53.size();
        java.lang.String str57 = attributes53.html();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = attributes53.dataset();
        java.lang.String str59 = attributes53.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes53.asList();
        attributes53.remove("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = attributes53.dataset();
        boolean boolean64 = attributes36.equals((java.lang.Object) attributes53);
        boolean boolean66 = attributes53.hasKey(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes67 = attributes53.clone();
        java.lang.String str68 = attributes53.toString();
        attributes0.addAll(attributes53);
        attributes0.removeIgnoreCase(" data-");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertNotNull(attributeItor43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributeList51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(attributeItor54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes27.spliterator();
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        attributes27.addAll(attributes29);
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        attributes29.html(appendable32, outputSettings33);
        boolean boolean36 = attributes29.hasKeyIgnoreCase("");
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        attributes29.html(appendable37, outputSettings38);
        attributes0.addAll(attributes29);
        int int41 = attributes0.size();
        boolean boolean43 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
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
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        attributes1.put(" hi!=\"hi!\"", true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        java.lang.String str4 = attributes0.html();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str6 = attributes5.html();
        java.lang.String str7 = attributes5.toString();
        attributes5.remove(" data- hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes10.spliterator();
        java.lang.String str13 = attributes10.getIgnoreCase("hi!");
        int int14 = attributes10.size();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes15.iterator();
        attributes10.addAll(attributes15);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes15.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes15.iterator();
        boolean boolean21 = attributes5.equals((java.lang.Object) attributes15);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        attributes22.addAll(attributes24);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes22.html(appendable27, outputSettings28);
        boolean boolean31 = attributes22.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes22.dataset();
        attributes22.remove("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator35 = attributes22.spliterator();
        boolean boolean36 = attributes15.equals((java.lang.Object) attributeSpliterator35);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes37.dataset();
        int int40 = attributes37.size();
        java.lang.String str41 = attributes37.html();
        boolean boolean43 = attributes37.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap44 = attributes37.dataset();
        boolean boolean46 = attributes37.hasKey(" hi!=\"\"");
        attributes37.put(" hi!=\"data-\"", "hi!");
        attributes15.addAll(attributes37);
        org.jsoup.nodes.Attributes attributes51 = attributes15.clone();
        attributes51.removeIgnoreCase("hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(attributeSpliterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        java.lang.String str24 = attributes23.html();
        java.lang.String str26 = attributes23.getIgnoreCase("hi!");
        attributes23.removeIgnoreCase(" hi!=\"data-\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor32 = attributes31.iterator();
        attributes29.addAll(attributes31);
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        attributes31.html(appendable34, outputSettings35);
        attributes31.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes40.spliterator();
        java.lang.String str43 = attributes40.getIgnoreCase("hi!");
        int int44 = attributes40.size();
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor46 = attributes45.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor47 = attributes45.iterator();
        attributes40.addAll(attributes45);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = attributes45.dataset();
        java.lang.String str50 = attributes45.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor51 = attributes45.iterator();
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes52.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = attributes52.dataset();
        int int55 = attributes52.size();
        java.lang.String str56 = attributes52.html();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = attributes52.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = attributes52.dataset();
        boolean boolean59 = attributes45.equals((java.lang.Object) strMap58);
        boolean boolean60 = attributes31.equals((java.lang.Object) attributes45);
        java.util.List<org.jsoup.nodes.Attribute> attributeList61 = attributes45.asList();
        boolean boolean62 = attributes23.equals((java.lang.Object) attributeList61);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertNotNull(attributeItor32);
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(attributeItor46);
        org.junit.Assert.assertNotNull(attributeItor47);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributeItor51);
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(attributeList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        attributes2.put("hi!", "data-");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes37.dataset();
        boolean boolean39 = attributes36.equals((java.lang.Object) attributes37);
        java.util.List<org.jsoup.nodes.Attribute> attributeList40 = attributes37.asList();
        attributes37.put("data-", "data-");
        attributes37.put("data-", false);
        boolean boolean48 = attributes37.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap49 = attributes37.dataset();
        attributes2.addAll(attributes37);
        java.lang.String str51 = attributes2.toString();
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes52.iterator();
        boolean boolean55 = attributes52.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor57 = attributes56.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = attributes56.dataset();
        org.jsoup.nodes.Attributes attributes59 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = attributes59.dataset();
        attributes56.addAll(attributes59);
        attributes52.addAll(attributes56);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = attributes52.dataset();
        boolean boolean65 = attributes52.hasKeyIgnoreCase("");
        java.lang.Appendable appendable66 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = null;
        attributes52.html(appendable66, outputSettings67);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator69 = attributes52.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList70 = attributes52.asList();
        attributes52.remove(" hi!");
        java.lang.String str74 = attributes52.get("hi!");
        int int75 = attributes52.size();
        boolean boolean76 = attributes2.equals((java.lang.Object) int75);
        org.jsoup.nodes.Attributes attributes77 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator78 = attributes77.spliterator();
        java.lang.String str80 = attributes77.getIgnoreCase("data-");
        java.lang.String str81 = attributes77.html();
        attributes77.removeIgnoreCase("hi!");
        boolean boolean85 = attributes77.hasKeyIgnoreCase("hi!");
        attributes77.put(" hi!=\"\"", " hi!=\"\"");
        java.util.Map<java.lang.String, java.lang.String> strMap89 = attributes77.dataset();
        java.lang.Class<?> wildcardClass90 = attributes77.getClass();
        boolean boolean91 = attributes2.equals((java.lang.Object) attributes77);
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
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeList40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " hi!=\"data-\"" + "'", str51, " hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attributeItor57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator69);
        org.junit.Assert.assertNotNull(attributeList70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes1.spliterator();
        attributes1.remove(" data-");
        java.lang.String str19 = attributes1.toString();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes20.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes20.iterator();
        boolean boolean24 = attributes20.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes20.asList();
        attributes1.addAll(attributes20);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " data-=\"\"" + "'", str19, " data-=\"\"");
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributeList25);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) 100);
        attributes0.removeIgnoreCase("data-");
        attributes0.put(" hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"", true);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        int int8 = attributes7.size();
        java.lang.String str9 = attributes7.html();
        org.jsoup.nodes.Attributes attributes10 = attributes7.clone();
        attributes10.removeIgnoreCase(" data-=\"\"");
        java.lang.String str13 = attributes10.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("data-");
        boolean boolean5 = attributes0.hasKeyIgnoreCase("");
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
        java.lang.String str23 = attributes0.getIgnoreCase(" hi!=\"data-\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes24 = attributes0.clone();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        boolean boolean28 = attributes23.hasKey(" data-=\"hi!\"=\" data-=&quot;hi!&quot;\"");
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
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes43.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes43.dataset();
        int int46 = attributes43.size();
        boolean boolean48 = attributes43.hasKeyIgnoreCase("data-");
        attributes43.removeIgnoreCase("data-");
        attributes43.put("hi!", false);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor55 = attributes54.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap56 = attributes54.dataset();
        attributes54.remove("hi!");
        java.lang.Appendable appendable59 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = null;
        attributes54.html(appendable59, outputSettings60);
        java.lang.String str62 = attributes54.toString();
        boolean boolean63 = attributes43.equals((java.lang.Object) attributes54);
        java.lang.String str65 = attributes43.get(" hi!=\"data-\"");
        boolean boolean66 = attributes15.equals((java.lang.Object) attributes43);
        java.lang.String str67 = attributes15.html();
        attributes15.remove(" data-=\"hi!\"");
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
        org.junit.Assert.assertNotNull(attributeItor44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributeItor55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + " hi!=\"hi!\"" + "'", str67, " hi!=\"hi!\"");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        attributes0.put(" hi!=\"data-\"", " hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        boolean boolean15 = attributes12.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes12.html(appendable16, outputSettings17);
        boolean boolean19 = attributes0.equals((java.lang.Object) appendable16);
        boolean boolean21 = attributes0.hasKeyIgnoreCase(" data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes0.asList();
        java.lang.String str23 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"" + "'", str23, " hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) 100);
        attributes0.removeIgnoreCase("data-");
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        attributes0.put(" hi!=\"data-\"=\" hi!=&quot;hi!&quot;\"", " data-");
        attributes0.put(" hi!=\"\"=\" hi!=&quot;&quot;\"", false);
        org.jsoup.nodes.Attributes attributes19 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes22.iterator();
        attributes20.addAll(attributes22);
        java.lang.String str25 = attributes22.toString();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes26.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes26.dataset();
        int int29 = attributes26.size();
        java.lang.String str30 = attributes26.html();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes26.dataset();
        java.lang.String str32 = attributes26.html();
        org.jsoup.nodes.Attributes attributes33 = attributes26.clone();
        int int34 = attributes33.size();
        attributes22.addAll(attributes33);
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes36.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes36.iterator();
        int int39 = attributes36.size();
        java.lang.String str41 = attributes36.getIgnoreCase("data-");
        java.lang.String str43 = attributes36.get("hi!");
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator45 = attributes44.spliterator();
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor47 = attributes46.iterator();
        attributes44.addAll(attributes46);
        attributes44.put("hi!", "hi!");
        java.lang.String str53 = attributes44.get("hi!");
        attributes44.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = attributes44.dataset();
        int int57 = attributes44.size();
        attributes36.addAll(attributes44);
        attributes22.addAll(attributes36);
        boolean boolean61 = attributes22.hasKeyIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        java.lang.String str62 = attributes22.toString();
        boolean boolean63 = attributes19.equals((java.lang.Object) attributes22);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributeSpliterator45);
        org.junit.Assert.assertNotNull(attributeItor47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes6.spliterator();
        java.lang.String str9 = attributes6.getIgnoreCase("hi!");
        int int10 = attributes6.size();
        java.lang.String str12 = attributes6.get("hi!");
        java.lang.String str13 = attributes6.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes6.asList();
        java.lang.String str16 = attributes6.get("hi!");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes17.dataset();
        int int20 = attributes17.size();
        java.lang.String str21 = attributes17.html();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes17.dataset();
        java.lang.String str23 = attributes17.html();
        attributes6.addAll(attributes17);
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        boolean boolean28 = attributes25.equals((java.lang.Object) attributes26);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes29.dataset();
        int int32 = attributes29.size();
        boolean boolean33 = attributes25.equals((java.lang.Object) attributes29);
        attributes6.addAll(attributes25);
        attributes0.addAll(attributes25);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes37 = attributes0.clone();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        boolean boolean5 = attributes1.hasKey("data-");
        java.lang.String str7 = attributes1.getIgnoreCase("hi!");
        java.lang.String str9 = attributes1.get(" data-=\" data-\"");
        attributes1.put(" hi! hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"", " data-=\"\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        java.lang.String str7 = attributes0.toString();
        java.lang.String str8 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        java.lang.String str19 = attributes0.get(" data- hi!");
        java.lang.String str20 = attributes0.html();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes21.addAll(attributes23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes23.html(appendable26, outputSettings27);
        java.lang.String str30 = attributes23.getIgnoreCase(" hi!=\" hi!=&quot;&quot;\"");
        boolean boolean31 = attributes0.equals((java.lang.Object) attributes23);
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " hi!" + "'", str20, " hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributeList32);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        attributes0.put(" hi!=\"hi!\"", true);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("hi!");
        int int22 = attributes18.size();
        java.lang.String str24 = attributes18.get("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes18.clone();
        int int26 = attributes25.size();
        org.jsoup.nodes.Attributes attributes27 = attributes25.clone();
        attributes0.addAll(attributes27);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        java.lang.String str32 = attributes29.getIgnoreCase("hi!");
        int int33 = attributes29.size();
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor35 = attributes34.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes34.iterator();
        attributes29.addAll(attributes34);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes34.dataset();
        java.lang.String str39 = attributes34.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes34.iterator();
        boolean boolean42 = attributes34.hasKey("");
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes43.iterator();
        attributes34.addAll(attributes43);
        java.lang.String str47 = attributes34.getIgnoreCase("hi!");
        java.lang.Appendable appendable48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        attributes34.html(appendable48, outputSettings49);
        attributes34.put(" data- hi!", " hi!");
        attributes27.addAll(attributes34);
        java.lang.String str56 = attributes27.get(" hi!=\" hi!=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(attributeItor35);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributeItor44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        boolean boolean12 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str13 = attributes5.toString();
        java.lang.String str15 = attributes5.get(" data- hi!=\" data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.String str9 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes10.spliterator();
        java.lang.String str13 = attributes10.getIgnoreCase("hi!");
        int int14 = attributes10.size();
        java.lang.String str16 = attributes10.get("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes10.clone();
        attributes17.removeIgnoreCase(" hi!=\"\"");
        boolean boolean21 = attributes17.hasKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes22 = attributes17.clone();
        boolean boolean23 = attributes0.equals((java.lang.Object) attributes22);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes16.dataset();
        int int19 = attributes16.size();
        boolean boolean21 = attributes16.hasKeyIgnoreCase("data-");
        attributes16.removeIgnoreCase("data-");
        attributes16.remove("data-");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes26.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes26.dataset();
        int int29 = attributes26.size();
        java.lang.String str30 = attributes26.html();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes26.dataset();
        boolean boolean32 = attributes16.equals((java.lang.Object) attributes26);
        org.jsoup.nodes.Attributes attributes33 = attributes16.clone();
        boolean boolean34 = attributes0.equals((java.lang.Object) attributes33);
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes35.spliterator();
        java.lang.String str38 = attributes35.getIgnoreCase("hi!");
        int int39 = attributes35.size();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor41 = attributes40.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor42 = attributes40.iterator();
        attributes35.addAll(attributes40);
        java.lang.String str44 = attributes40.toString();
        attributes40.put("data-", true);
        attributes40.put(" hi!=\"hi!\"", "");
        attributes0.addAll(attributes40);
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = attributes53.dataset();
        boolean boolean55 = attributes52.equals((java.lang.Object) attributes53);
        boolean boolean57 = attributes53.hasKey("data-");
        java.lang.String str59 = attributes53.getIgnoreCase("hi!");
        attributes0.addAll(attributes53);
        boolean boolean62 = attributes53.hasKeyIgnoreCase(" data-=\"hi!\"=\" data-=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(attributeItor41);
        org.junit.Assert.assertNotNull(attributeItor42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes1.dataset();
        java.lang.String str7 = attributes1.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes8.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes8.iterator();
        attributes1.addAll(attributes8);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes12.spliterator();
        boolean boolean18 = attributes12.hasKey("data-");
        boolean boolean20 = attributes12.hasKey("data-");
        boolean boolean22 = attributes12.hasKeyIgnoreCase("");
        boolean boolean24 = attributes12.hasKeyIgnoreCase("data-");
        boolean boolean25 = attributes1.equals((java.lang.Object) attributes12);
        attributes1.remove("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes1.spliterator();
        java.lang.Class<?> wildcardClass29 = attributes1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes1.asList();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes1.dataset();
        java.lang.String str7 = attributes1.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes8.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes8.iterator();
        attributes1.addAll(attributes8);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        java.lang.String str15 = attributes12.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes12.spliterator();
        boolean boolean18 = attributes12.hasKey("data-");
        boolean boolean20 = attributes12.hasKey("data-");
        boolean boolean22 = attributes12.hasKeyIgnoreCase("");
        boolean boolean24 = attributes12.hasKeyIgnoreCase("data-");
        boolean boolean25 = attributes1.equals((java.lang.Object) attributes12);
        attributes1.remove("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes1.spliterator();
        attributes1.removeIgnoreCase(" hi!");
        java.lang.String str32 = attributes1.getIgnoreCase(" data- hi!=\" data-\"");
        boolean boolean34 = attributes1.hasKey(" hi!=\"hi!\"=\" data-\"");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        int int5 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        boolean boolean9 = attributes0.hasKeyIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes0.html(appendable10, outputSettings11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        boolean boolean21 = attributes0.hasKey(" hi!=\"\"=\"data-\"");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        attributes0.html(appendable22, outputSettings23);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes3.dataset();
        attributes0.addAll(attributes3);
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.String str10 = attributes0.get(" hi!=\"data-\"");
        java.lang.Class<?> wildcardClass11 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes5.iterator();
        attributes0.addAll(attributes5);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes5.iterator();
        boolean boolean11 = attributes5.hasKeyIgnoreCase(" data-=\" data-\"");
        java.lang.String str13 = attributes5.get(" hi!=\"\"=\"data-\"");
        java.lang.String str15 = attributes5.getIgnoreCase(" data- hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        boolean boolean15 = attributes0.hasKeyIgnoreCase("data-");
        java.lang.String str16 = attributes0.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes0.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.jsoup.nodes.Attributes attributes36 = attributes26.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes38 = attributes26.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes26.dataset();
        java.lang.Appendable appendable40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes26.html(appendable40, outputSettings41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        java.lang.String str28 = attributes23.html();
        org.jsoup.nodes.Attributes attributes29 = attributes23.clone();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        int int9 = attributes0.size();
        boolean boolean11 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\"");
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        int int18 = attributes15.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        attributes19.addAll(attributes21);
        boolean boolean25 = attributes19.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes19.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes19.iterator();
        attributes15.addAll(attributes19);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes19.iterator();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes32.iterator();
        attributes30.addAll(attributes32);
        attributes30.put("hi!", "hi!");
        attributes19.addAll(attributes30);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes30.dataset();
        int int40 = attributes30.size();
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor42 = attributes41.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes41.dataset();
        int int44 = attributes41.size();
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator46 = attributes45.spliterator();
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor48 = attributes47.iterator();
        attributes45.addAll(attributes47);
        boolean boolean51 = attributes45.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes45.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes45.iterator();
        attributes41.addAll(attributes45);
        java.lang.String str55 = attributes41.html();
        java.lang.String str56 = attributes41.html();
        attributes30.addAll(attributes41);
        attributes0.addAll(attributes30);
        java.lang.String str60 = attributes0.get(" hi!=\"hi!\"=\" data- hi!\"");
        org.jsoup.nodes.Attributes attributes61 = attributes0.clone();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(attributeItor42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator46);
        org.junit.Assert.assertNotNull(attributeItor48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(attributes61);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes11.spliterator();
        java.lang.String str14 = attributes11.getIgnoreCase("hi!");
        int int15 = attributes11.size();
        java.lang.String str17 = attributes11.get("hi!");
        java.lang.String str18 = attributes11.html();
        int int19 = attributes11.size();
        boolean boolean20 = attributes4.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes11.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        boolean boolean15 = attributes0.hasKeyIgnoreCase(" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes16 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute17);
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
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        boolean boolean19 = attributes13.hasKeyIgnoreCase("hi!");
        boolean boolean21 = attributes13.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes13.dataset();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        java.lang.String str26 = attributes23.getIgnoreCase("hi!");
        int int27 = attributes23.size();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes28.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes28.iterator();
        attributes23.addAll(attributes28);
        boolean boolean33 = attributes23.hasKey("hi!");
        java.lang.String str35 = attributes23.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes37.dataset();
        boolean boolean39 = attributes36.equals((java.lang.Object) attributes37);
        java.util.List<org.jsoup.nodes.Attribute> attributeList40 = attributes37.asList();
        boolean boolean42 = attributes37.hasKeyIgnoreCase("");
        attributes23.addAll(attributes37);
        boolean boolean45 = attributes23.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes46 = attributes23.clone();
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        attributes46.html(appendable47, outputSettings48);
        org.jsoup.nodes.Attributes attributes50 = attributes46.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList51 = attributes46.asList();
        attributes13.addAll(attributes46);
        org.jsoup.nodes.Attributes attributes53 = attributes46.clone();
        org.jsoup.nodes.Attributes attributes54 = attributes53.clone();
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator56 = attributes55.spliterator();
        java.lang.String str57 = attributes55.toString();
        java.lang.String str59 = attributes55.get(" data-=\"\"");
        org.jsoup.nodes.Attributes attributes60 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor61 = attributes60.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = attributes60.dataset();
        boolean boolean64 = attributes60.hasKey("");
        java.lang.Appendable appendable65 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = null;
        attributes60.html(appendable65, outputSettings66);
        boolean boolean68 = attributes55.equals((java.lang.Object) attributes60);
        boolean boolean69 = attributes53.equals((java.lang.Object) attributes55);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(attributeList51);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(attributeSpliterator56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(attributeItor61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        attributes0.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes6 = attributes5.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes6.html(appendable7, outputSettings8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes6.dataset();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        java.lang.String str30 = attributes10.toString();
        attributes10.put(" hi!=\"hi!\"", " data-");
        attributes10.put(" data- hi!", " hi!=\"\"");
        boolean boolean38 = attributes10.hasKeyIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes39 = attributes10.clone();
        java.lang.String str40 = attributes10.html();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"" + "'", str40, " hi!=\"hi!\"=\" data-\" data- hi!=\" hi!=&quot;&quot;\"");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        attributes1.put(" data-=\" hi!=&quot;data-&quot;\"", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes1.iterator();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(attributeItor20);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str7 = attributes0.toString();
        boolean boolean9 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes10.iterator();
        int int13 = attributes10.size();
        attributes10.remove("hi!");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes10.html(appendable16, outputSettings17);
        int int19 = attributes10.size();
        boolean boolean21 = attributes10.hasKeyIgnoreCase(" hi!=\"data-\"");
        attributes10.remove("hi!");
        org.jsoup.nodes.Attributes attributes24 = attributes10.clone();
        boolean boolean26 = attributes10.hasKey("hi!");
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes10.html(appendable27, outputSettings28);
        attributes0.addAll(attributes10);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        attributes0.remove("hi!");
        int int6 = attributes0.size();
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str11 = attributes0.toString();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        java.lang.String str17 = attributes15.html();
        boolean boolean19 = attributes15.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        boolean boolean23 = attributes20.equals((java.lang.Object) attributes21);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes24.dataset();
        int int27 = attributes24.size();
        boolean boolean28 = attributes20.equals((java.lang.Object) attributes24);
        java.lang.Object obj29 = null;
        boolean boolean30 = attributes24.equals(obj29);
        attributes15.addAll(attributes24);
        int int32 = attributes24.size();
        attributes24.removeIgnoreCase(" hi!");
        attributes0.addAll(attributes24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
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
        java.lang.String str18 = attributes14.toString();
        org.jsoup.nodes.Attributes attributes19 = attributes14.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes14.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes14.asList();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(attributeList21);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        boolean boolean4 = attributes0.hasKey("");
        attributes0.put("hi!", "hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        attributes0.put("data-", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes0.asList();
        java.lang.String str13 = attributes0.html();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes14.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes14.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("hi!");
        int int22 = attributes18.size();
        java.lang.String str24 = attributes18.get("hi!");
        java.lang.String str25 = attributes18.html();
        attributes14.addAll(attributes18);
        attributes0.addAll(attributes14);
        attributes0.removeIgnoreCase(" hi!=\"data-\"=\" hi!=&quot; hi!=&amp;quot;&amp;quot;&quot;\"");
        attributes0.removeIgnoreCase(" data- hi!=\" data-\"");
        java.lang.String str33 = attributes0.getIgnoreCase(" hi!=\"\"=\"data-\"=\" hi!=&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"hi!\"" + "'", str13, " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes5.spliterator();
        java.lang.String str14 = attributes5.toString();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute15);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes15.iterator();
        int int18 = attributes15.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes15.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes15.asList();
        boolean boolean21 = attributes0.equals((java.lang.Object) attributeList20);
        attributes0.put(" hi!=\"hi!\" data-=\" hi!=&quot;hi!&quot;\"", " data- hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        boolean boolean4 = attributes0.equals((java.lang.Object) (short) 0);
        int int5 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        boolean boolean15 = attributes0.hasKey(" data- hi!");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes16.iterator();
        int int19 = attributes16.size();
        java.lang.String str20 = attributes16.toString();
        int int21 = attributes16.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes16.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes16.dataset();
        attributes16.removeIgnoreCase(" data-=\"hi!\"");
        attributes0.addAll(attributes16);
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes16.asList();
        java.lang.Class<?> wildcardClass28 = attributeList27.getClass();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(attributeList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        boolean boolean9 = attributes0.hasKey("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes0.iterator();
        java.lang.String str11 = attributes0.html();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes27.spliterator();
        java.lang.String str30 = attributes27.getIgnoreCase("hi!");
        int int31 = attributes27.size();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes32.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes32.iterator();
        attributes27.addAll(attributes32);
        boolean boolean37 = attributes27.hasKey("hi!");
        java.lang.String str39 = attributes27.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = attributes41.dataset();
        boolean boolean43 = attributes40.equals((java.lang.Object) attributes41);
        java.util.List<org.jsoup.nodes.Attribute> attributeList44 = attributes41.asList();
        boolean boolean46 = attributes41.hasKeyIgnoreCase("");
        attributes27.addAll(attributes41);
        boolean boolean49 = attributes27.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes50 = attributes27.clone();
        java.lang.Appendable appendable51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        attributes50.html(appendable51, outputSettings52);
        org.jsoup.nodes.Attributes attributes54 = attributes50.clone();
        int int55 = attributes54.size();
        attributes15.addAll(attributes54);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator57 = attributes54.spliterator();
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
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator57);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.get("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("data-");
        boolean boolean8 = attributes0.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes10.dataset();
        boolean boolean12 = attributes9.equals((java.lang.Object) attributes10);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes13.dataset();
        int int16 = attributes13.size();
        boolean boolean17 = attributes9.equals((java.lang.Object) attributes13);
        java.lang.Object obj18 = null;
        boolean boolean19 = attributes13.equals(obj18);
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes13);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes0.spliterator();
        boolean boolean23 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"=\" data- hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        attributes15.removeIgnoreCase("data-");
        java.lang.Class<?> wildcardClass29 = attributes15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        int int25 = attributes0.size();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("hi!");
        int int4 = attributes0.size();
        java.lang.String str6 = attributes0.get("hi!");
        java.lang.String str8 = attributes0.get("data-");
        attributes0.put(" data-", true);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes12.dataset();
        int int15 = attributes12.size();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        attributes16.addAll(attributes18);
        boolean boolean22 = attributes16.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes16.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes16.iterator();
        attributes12.addAll(attributes16);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes16.iterator();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes27.spliterator();
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        attributes27.addAll(attributes29);
        attributes27.put("hi!", "hi!");
        attributes16.addAll(attributes27);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = attributes27.dataset();
        java.lang.String str38 = attributes27.getIgnoreCase(" hi!");
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator40 = attributes39.spliterator();
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor42 = attributes41.iterator();
        attributes39.addAll(attributes41);
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        attributes39.html(appendable44, outputSettings45);
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        attributes39.html(appendable47, outputSettings48);
        attributes39.remove("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes39.asList();
        boolean boolean53 = attributes27.equals((java.lang.Object) attributes39);
        attributes0.addAll(attributes27);
        attributes27.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor57 = attributes27.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributeSpliterator40);
        org.junit.Assert.assertNotNull(attributeItor42);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributeItor57);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        java.lang.String str16 = attributes0.toString();
        boolean boolean18 = attributes0.hasKey(" hi!=\"\"=\" hi!=&quot;&quot;\"=\"\"");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes7.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes7.asList();
        attributes7.put("data-", " data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes14 = attributes7.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        attributes0.put("hi!", "hi!");
        java.lang.String str9 = attributes0.get("hi!");
        attributes0.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes0.dataset();
        java.lang.String str13 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes15.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes15.dataset();
        int int18 = attributes15.size();
        boolean boolean20 = attributes15.hasKeyIgnoreCase("data-");
        attributes15.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes25.iterator();
        attributes23.addAll(attributes25);
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes23.html(appendable28, outputSettings29);
        boolean boolean32 = attributes23.hasKeyIgnoreCase("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = attributes23.dataset();
        attributes15.addAll(attributes23);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor35 = attributes15.iterator();
        boolean boolean36 = attributes0.equals((java.lang.Object) attributes15);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(attributeItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes35.spliterator();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        attributes35.addAll(attributes37);
        boolean boolean41 = attributes35.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes35.asList();
        boolean boolean44 = attributes35.hasKey("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes35.iterator();
        attributes0.addAll(attributes35);
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
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributeItor45);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        boolean boolean29 = attributes25.hasKey(" data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes25.iterator();
        java.lang.Class<?> wildcardClass31 = attributeItor30.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.remove(" hi!=\"data-\"=\" hi!=&quot; hi!=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        attributes0.addAll(attributes2);
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes10 = attributes0.clone();
        attributes10.remove(" hi!=\"data-\"");
        attributes10.removeIgnoreCase(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes10.removeIgnoreCase(" data-=\" data-\"");
        java.lang.String str18 = attributes10.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        boolean boolean23 = attributes20.equals((java.lang.Object) attributes21);
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes21.asList();
        attributes21.put("data-", "data-");
        attributes21.put("data-", false);
        boolean boolean32 = attributes21.hasKey("hi!");
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        attributes21.html(appendable33, outputSettings34);
        boolean boolean37 = attributes21.hasKey("data-");
        boolean boolean39 = attributes21.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor41 = attributes40.iterator();
        boolean boolean43 = attributes40.equals((java.lang.Object) (-1.0f));
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        attributes40.html(appendable44, outputSettings45);
        org.jsoup.nodes.Attributes attributes47 = attributes40.clone();
        boolean boolean48 = attributes21.equals((java.lang.Object) attributes47);
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor50 = attributes49.iterator();
        boolean boolean52 = attributes49.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor54 = attributes53.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = attributes53.dataset();
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = attributes56.dataset();
        attributes53.addAll(attributes56);
        attributes49.addAll(attributes53);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = attributes49.dataset();
        attributes47.addAll(attributes49);
        attributes5.addAll(attributes49);
        attributes5.remove(" hi!");
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
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributeItor50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributeItor54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap60);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes1.dataset();
        boolean boolean3 = attributes0.equals((java.lang.Object) attributes1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes5.spliterator();
        java.lang.String str8 = attributes5.getIgnoreCase("hi!");
        int int9 = attributes5.size();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes10.iterator();
        attributes5.addAll(attributes10);
        boolean boolean15 = attributes5.hasKey("hi!");
        java.lang.String str17 = attributes5.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes19.dataset();
        boolean boolean21 = attributes18.equals((java.lang.Object) attributes19);
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes19.asList();
        boolean boolean24 = attributes19.hasKeyIgnoreCase("");
        attributes5.addAll(attributes19);
        boolean boolean27 = attributes5.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes28 = attributes5.clone();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        attributes28.html(appendable29, outputSettings30);
        org.jsoup.nodes.Attributes attributes32 = attributes28.clone();
        boolean boolean33 = attributes0.equals((java.lang.Object) attributes28);
        java.lang.String str34 = attributes28.toString();
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        attributes28.html(appendable35, outputSettings36);
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = attributes39.dataset();
        boolean boolean41 = attributes38.equals((java.lang.Object) attributes39);
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes39.asList();
        boolean boolean44 = attributes39.hasKeyIgnoreCase("");
        int int45 = attributes39.size();
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        attributes39.html(appendable46, outputSettings47);
        attributes28.addAll(attributes39);
        java.lang.String str50 = attributes28.toString();
        org.jsoup.nodes.Attributes attributes51 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes28.addAll(attributes51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        java.lang.String str16 = attributes0.html();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes17.dataset();
        int int20 = attributes17.size();
        java.lang.String str21 = attributes17.html();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes17.dataset();
        java.lang.String str23 = attributes17.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes17.asList();
        attributes17.remove("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes17.dataset();
        boolean boolean28 = attributes0.equals((java.lang.Object) attributes17);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes29.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes29.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList33 = attributes29.asList();
        boolean boolean34 = attributes17.equals((java.lang.Object) attributes29);
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        attributes17.html(appendable35, outputSettings36);
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(attributeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        int int3 = attributes0.size();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) 100);
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        boolean boolean10 = attributes7.equals((java.lang.Object) (-1.0f));
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes11.dataset();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        attributes11.addAll(attributes14);
        attributes7.addAll(attributes11);
        boolean boolean19 = attributes7.hasKeyIgnoreCase("hi!");
        boolean boolean20 = attributes0.equals((java.lang.Object) boolean19);
        java.lang.String str22 = attributes0.getIgnoreCase(" hi!=\"\"=\" hi!=&quot;&quot;\"");
        java.lang.String str23 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }
}

